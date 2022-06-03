import java.util.ArrayList;


public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int multiply(int a, int b) {
        return a*b;
    }

    public ArrayList<Integer> digitsSet(int number) {
        String chaine = String.valueOf(number);
        ArrayList<Integer> set = new ArrayList<>();
        int i;
        for (i=0;i<chaine.length();i++) {
            char c = chaine.charAt(i);
            set.add( Integer.parseInt(String.valueOf(c)));
        }
        return set;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public double multiply(double a, double b) {
        return a*b;
    }

}
