package Unit3;

import java.util.HashSet;
import java.util.Scanner;

public class Hashset1 {
    public static void main(String[] args) {
        HashSet<String> hs=new HashSet<>();
        HashSet<String> hs2=new HashSet<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        System.out.println("Enter elements in HashSet 1");
        for(int i=0;i<m;i++){
            hs.add(sc.next());
        }
        System.out.println("Enter elements in HashSet 2");
        for(int i=0;i<n;i++){
            hs2.add(sc.next());
        }
        hs.removeIf(str -> str.contains("aa"));
        System.out.println(hs);
    }
}
