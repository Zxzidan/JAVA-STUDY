public class javaTypecasting {
    public static void main (String[] args){
        // Widening Casting
        int myInt = 9;
        double myDouble = myInt;

        System.out.println("Integer value: " + myInt);
        System.out.println("Double value: " + myDouble);

        // Narrowing Casting
        double myDouble2 = 9.78d;
        int myInt2 = (int) myDouble2;

        System.out.println("Value Double : "+myDouble2);
        System.out.println("Value Integer : "+myInt2);
    }
}
