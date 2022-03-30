import java.util.Scanner;

public class lesson {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] par = new int[5];
        int[] inpar = new int[5];

        int parLength = 0;
        int inpLength = 0;
        for (int i = 0; i < 15; i++) {
            if (i < 10) {
                int number = scan.nextInt();
                if (number % 2 == 0) {
                    par[parLength] = number;
                    parLength++;
                    continue;
                } else
                    inpar[inpLength] = number;
                inpLength++;
                continue;
            }
            for (int j = 0; j < par.length; j++) {
                System.out.printf("par[%d] = %d%n", j,par[j]);
            }
            for (int j = 0; j < inpar.length; j++) {
                System.out.printf("inpar[%d] = %d%n", j,inpar[j]);
            }

            parLength = 0;
            inpLength = 0;
            for (; i < 15; i++) {
                int b = scan.nextInt();
                if (b % 2 == 0) {
                    par[parLength] = b;
                    parLength++;
                    continue;
                }
                inpar[inpLength] = b;
                inpLength++;
                continue;
            }
            for (int j = 0; j < parLength; j++) {
                System.out.printf("par[%d] = %d%n", j,par[j]);
            }
            for (int j = 0; j < inpLength; j++) {
                System.out.printf("inpar[%d] = %d%n", j,inpar[j]);
            }
        }
    }
}
