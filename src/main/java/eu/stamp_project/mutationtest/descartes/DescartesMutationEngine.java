package eu.stamp_project.mutationtest.descartes;

import java.util.*;

import java.util.Arrays;
import java.util.stream.Collectors;

import org.pitest.classinfo.ClassByteArraySource;
import org.pitest.functional.F;
import org.pitest.functional.predicate.False;
import org.pitest.functional.predicate.Predicate;
import org.pitest.functional.FCollection;
import org.pitest.mutationtest.engine.MutationEngine;
import org.pitest.mutationtest.engine.Mutater;

import org.pitest.reloc.asm.commons.Method;

import eu.stamp_project.mutationtest.descartes.operators.MutationOperator;

public class DescartesMutationEngine implements  MutationEngine {

    private final Predicate<Method> excludedMethods;

    private final Collection<MutationOperator> operators;


    public DescartesMutationEngine(Collection<MutationOperator> operators) {
        this(False.<Method>instance(), operators);
    }

    @SuppressWarnings("unchecked")
    public DescartesMutationEngine(MutationOperator... operators) {
        this(Arrays.<MutationOperator>asList(operators));
    }

    @SuppressWarnings("unchecked")
    public DescartesMutationEngine(Predicate<Method> excludedMethods, MutationOperator...operators) {
        this(excludedMethods, Arrays.<MutationOperator>asList(operators));
    }

    public DescartesMutationEngine(Predicate<Method> excludedMethods, Collection<MutationOperator> operators) {
        if(excludedMethods == null) throw new IllegalArgumentException("excludedMethod argument can not be null");
        if(operators == null) throw new IllegalArgumentException("operators argument can not be null");

        this.excludedMethods = excludedMethods;
        this.operators = operators;

    }

    public Mutater createMutator(final ClassByteArraySource byteSource) {

        return new DescartesMutater(byteSource, this);
    }

    public Collection<String> getMutatorNames() {
       return operators.stream().map(op -> op.getID()).collect(Collectors.toList());
    }

    public Collection<MutationOperator> getOperatorsFor(final Method method) {
        if(excludedMethods.apply(method))
            return Collections.<MutationOperator>emptyList();
        return operators.stream().filter(op -> op.canMutate(method)).collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return "DescartesMutationEngine"; //TODO: Add more details here
    }

    @Override
    public String getName() { return "descartes"; }
}
