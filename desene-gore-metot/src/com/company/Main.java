import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N Sayısı: ");
        int n = scanner.nextInt();
        scanner.close();

        recursiveIslem(n, n, true);
    }

    static void recursiveIslem(int n, int originalN, boolean azalt) {
        System.out.print(n + " ");

        if (n <= 0 && !azalt) {
            return;
        }

        if (azalt) {
            if (n - 5 > 0) {
                recursiveIslem(n - 5, originalN, true);
            } else {
                recursiveIslem(n - 5, originalN, false);
            }
        } else {
            if (n + 5 <= originalN) {
                recursiveIslem(n + 5, originalN, false);
            }
        }
    }
}


