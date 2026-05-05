public class dataTypesRealLife {
    public static void main(String[] args){
        // Create Variables of different data types
        int items = 50;
        float coastPerItem = 9.99f;
        float totalCoast = items *coastPerItem;
        char currency = '$';

        // Print the total cost
        System.out.println("Number of items: "+items);
        System.out.println("Cost per item: "+coastPerItem+" "+currency);
        System.out.println("Total cost: "+totalCoast+" "+currency);
    }
}
