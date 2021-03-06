package eu.stamp_project.mutationtest.test;

public class StopMethods {

    public void emptyVoidMethod() {}

    public boolean returnTrue () { return true; }

    public byte returnByte() { return (byte)11; }

    public short returnShort() { return (short)12; }

    public int returnNegativeInt() { return -11; }

    public int returnPositiveInt() { return  11; }

    public int returnOne() { return 1; }

    public long returnPositiveLong() { return 1234567890L; }

    public long returnNegativeLong() { return -1234567890L; }

    public float returnPositiveFloat() { return 3.14f; }

    public float returnNegativeFloat() { return -3.14f; }

    public double returnPositiveDouble() { return 6.28; }

    public double returnNegativeDouble() { return -6.28; }

    public char returnChar() { return 'A'; }

    public String returnString() {  return "A"; }

    public Object returnNull() { return null; }

    /* TODO: MRecognize the following method bodies
    public int[] retrunEmptyArray() {
        //return new int[0];
        //return new int[]{};
    }
    */

    boolean aBoolean;
    byte aByte;
    short aShort;
    int anInt;
    long aLong;
    float aFloat;
    double aDouble;
    char aChar;
    String aString;
    Object anObject;

    public void setaBoolean(boolean aBoolean) {
        this.aBoolean = aBoolean;
    }

    public void setaByte(byte aByte) {
        this.aByte = aByte;
    }

    public void setaChar(char aChar) {
        this.aChar = aChar;
    }

    public void setaDouble(double aDouble) {
        this.aDouble = aDouble;
    }

    public void setaFloat(float aFloat) {
        this.aFloat = aFloat;
    }

    public void setaLong(long aLong) {
        this.aLong = aLong;
    }

    public void setAnInt(int anInt) {
        this.anInt = anInt;
    }

    public void setaShort(short aShort) {
        this.aShort = aShort;
    }

    public void setaString(String aString) {
        this.aString = aString;
    }

    public void setAnObject(Object anObject) {
        this.anObject = anObject;
    }

    public byte getaByte() {
        return aByte;
    }

    public char getaChar() {
        return aChar;
    }

    public double getaDouble() {
        return aDouble;
    }

    public float getaFloat() {
        return aFloat;
    }

    public int getAnInt() {
        return anInt;
    }

    public long getaLong() {
        return aLong;
    }

    public short getaShort() {
        return aShort;
    }

    public String getaString() {
        return aString;
    }

    public Object getAnObject() {
        return anObject;
    }


}
