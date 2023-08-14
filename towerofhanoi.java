import java.util.*;
public class towerofhanoi{
    public static void tower(int n,String src,String helper,String dest){
        //Base Case
        if(n==1){
            System.out.println("Transfer disk"+n+"from"+src+"to"+dest);
            return;
        }
        //Working
        tower(n-1,src,dest,helper);
        System.out.println("Transfer disk"+n+"from"+src+"to"+dest);
        tower(n-1,helper,src,dest);

    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the nunber of disc");

        int n=s.nextInt();
        tower(n,"S","H","D");
        System.out.println("Minimum Moves"+(Math.pow(2,n)-1));
    }
}