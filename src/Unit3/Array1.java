package Unit3;

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        int a[][]=new int[2][3];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                a[i][j]=sc.nextInt();
            }
        }
//        for(int i=0;i<a.length;i++){
//            System.out.println(a[i]+" ");
//        }
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.println(a[i][j]+" ");
            }
            System.out.println("\n");
        }
    }
}
