public class javaTypeCastingRealLife {
    public static void main(String[] args){
        // Maximum level in the game
        int maxLevel = 500;

        // The actual score of the user
        int userScore = 423;

        // Calculate the percentage score
        double percentageScore = (double) userScore/ maxLevel * 100.0d;

        System.out.println("Percentage Score : "+percentageScore);
    }
}
