import java.util.Scanner;

public class InHinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println(" ");
            System.out.println("1: In hình chữ nhật !");
            System.out.println("2: In Hình tam giác vuông dưới !");
            System.out.println("3: In hình tam giác vuông trên !");
            System.out.println("4: Thoát !");
            int so = Integer.parseInt(sc.nextLine());
            switch (so) {
                case 1:
                    char Kt = '*';
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j <= 14; j++) {
                            System.out.print('*');
                        }
                        System.out.println(" ");
                    }
                    break;
                case 2:

                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j < i; j++) {
                            System.out.print('*');
                        }
                        System.out.println(" ");
                    }
                    break;
                case 3:
                    char Kt3 = '*';
                    for(int i=7;i>=1;i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print('*');
                        }
                        System.out.println(" ");
                    }
                    break;
                case 4:
                    break;
            }
        }while (true);
    }
}

