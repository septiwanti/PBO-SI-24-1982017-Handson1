public class KonversiTipeDataNumber {
    public static void main(String[] args) {
        // widening

        byte intByte = 10;
        short intShort = intByte;
        int intInt = intShort;
        long intLong = intInt;
        float intFloat = intLong;
        double intDouble = intFloat;

        float intFloat2 = (float) intDouble;
        long intLong2 = (long) intFloat2;
        int intInt2 = (int) intLong2;
        short intShort2 = (short) intInt2;

    }
}