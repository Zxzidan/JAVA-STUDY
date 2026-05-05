public class dataTypes {
    public static void main(String[] args){
        // Integer types
        byte myByte = 100; //Maksimal 3 angka
        System.out.println("Byte value: " + myByte);
        
        // Short type
        short myShort = 10000; //Maksimal 5 angka
        System.out.println("Short value: " + myShort);

        // Integer type
        int myInt = 100000; //Maksimal 6 angka
        System.out.println("Integer value: " + myInt);

        // Long type
        Long myLong = 10000000000L; //Maksimal 11 angka sudah termasuk L
        System.out.println("Long Value: "+ myLong);

        // Floating-point types
        float myFloat = 3.148f; //Maksimal 7 angka sudah termasuk f
        System.out.println("Float value: " + myFloat);

        // Double type
        double myDouble = 63.141592d; //Maksimal 15 angka
        System.out.println("Double value: " + myDouble);

        // Scientific Numbers
        double myScientific = 123E4d; //Maksimal 15 angka
        System.out.println("Scientific value: " + myScientific);

        float myScientificFloat = 123e3f; //Maksimal 7 angka sudah termasuk f
        System.out.println("Scientific Float value: " + myScientificFloat);

        // Boolean type
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println("Is Java fun? " + isJavaFun);
        System.out.println("Is fish tasty? " + isFishTasty);
    }
}
