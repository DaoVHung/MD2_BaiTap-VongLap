import java.util.Scanner;

public class HienThi20SoNguyen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số đi bạn :");
        int num5 = Integer.parseInt(sc.nextLine());
        int count = 0;
        int N = 2;
        while (count<num5){
            boolean check = false;
            for (int i = 2 ; i<N ; i++){
                if (N%i==0){
                    check = true;
                }
            }
            if (!check){
                System.out.println( N + "," );
                count ++;
            }
            if ( count == 19){
                break;
            }
            N ++;
        }
    }
}
