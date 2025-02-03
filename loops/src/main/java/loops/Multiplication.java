package loops;

public class Multiplication {
    
    public static String[] generateMultiplicationTable(int n) {
        String[] table = new String[10];
        for (int i = 1; i <= 10; i++) {
            table[i - 1] = n + " x " + i + " = " + (n * i);
        }
        return table;
    }

    public static void main(String[] args) {
        String[] result = generateMultiplicationTable(5);
        for (String line : result) {
            System.out.println(line);
        }
    }
}

