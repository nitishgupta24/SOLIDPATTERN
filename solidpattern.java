import java.util.*;

public class solidpattern {
    public static void main(String[] args) {
        System.out.print("\033c");
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter range");
        n=sc.nextInt();
        Scanner r=new Scanner(System.in);
        int m;
        System.out.println("Enter range");
        m=r.nextInt();
          for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                System.out.print("*");
            }System.out.println();
        } sc.close();
        
    }
    
}
