public class string {
    public static void main(String[] args){
        // String length
        String name = "Dandi Azaidane";
        System.out.println("Panjang nama : "+name.length());

        // String to Uppercase
        System.out.println("Nama dengan huruf besar : "+name.toUpperCase());

        // String to Lowercase
        System.out.println("Nama dengan huruf kecil : "+name.toLowerCase());

        String txt = "Saya adalah mahasiswa UPN Veteran Jawa Timur Jurusan Informatika";
        System.out.println(txt.indexOf("Jurusan")); 

        String firstName = "Dandi";
        System.out.println(firstName.charAt(2));

        // compare string
        String name1 = "Dandi";
        String name2 = "Dandi";

        String Jurusan1 = "Informatika";
        String Jurusan2 = "INFORMATIKA";

        System.out.println(name1.equals(name2));
        System.out.println(Jurusan1.equals(Jurusan2));

        // Removing whitespace
        String longNameString = "  Dandi Azaidane  ";
        System.out.println("Before : [" + longNameString + "]");
        System.out.println("After : [" + longNameString.trim() + "]");

    }
}
