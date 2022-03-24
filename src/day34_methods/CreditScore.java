package day34_methods;

public class CreditScore {
    public static int getCreditScore() {
        return 800;

    }

    public static void main(String[] args) {
        getCreditScore();

        int score = getCreditScore();
        System.out.println(score);
        System.out.println(getCreditScore());
        System.out.println(getCreditScore()+50);
    }
}
