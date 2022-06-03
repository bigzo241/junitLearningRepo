import java.util.HashSet;
import java.util.Set;


public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int multiply(int a, int b) {
        return a*b;
    }

    public Set<Integer> digitsSet(int number) {
        String chaine = String.valueOf(number);
        System.out.println(chaine.toCharArray());
        Set<Integer> set = new HashSet<>();
        for (int i=0;i<chaine.length();i++) {
            set.add((int) chaine.charAt(i));
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
