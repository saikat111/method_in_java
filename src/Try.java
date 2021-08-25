import java.util.Scanner;
public class Try {
    public static void main(String args[]) {
        int number;
        Scanner mukta = new Scanner(System.in);
        number = mukta.nextInt();
        if(number == 10 ){
            System.out.println("saikat");
            saikat();
        }
    }
    static void saikat() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.println(i + " " + j);
            }
        }
    }
}

