public class logicalOperator {
    public static void main(String[] args){
        boolean isLoggedIn = true;
        boolean isAdmin = false;

        System.out.println("Regular user can access : "+(isLoggedIn && !isAdmin));
        System.out.println("Admin can access : "+(isLoggedIn || isAdmin));
        System.out.println("User can not login admin page : "+(!isLoggedIn));
    }
}
