package Unit3;

import java.util.*;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<String> product=new ArrayList<>();
        System.out.println("Enter the number of products");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
          product.add(sc.nextLine());
        }
        Collections.sort(product);
        Iterator it=product.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
