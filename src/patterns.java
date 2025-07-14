import java.util.Scanner;

public class patterns {
    Scanner sc= new Scanner(System.in);
    int n = sc.nextInt();
    public static void main(String[] args)
    {
        patterns obj=new patterns();
        //obj.pattern1();
        //obj.pattern2();
        //obj.pattern3();
        //obj.pattern4();
        obj.pattern5();
    }
    void pattern1() {
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    void pattern2(){
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    void pattern3(){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(+j);
            }
            System.out.println();
        }
    }
    void pattern4(){
        for (int i = 1; i <=n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(+i);
            }
            System.out.println();
        }
    }
    void pattern5(){
        for (int i = 0; i < n ; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    void pattern6(){
        
    }

}
