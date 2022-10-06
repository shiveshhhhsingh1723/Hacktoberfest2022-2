import java.util.Scanner;
class pattern{
public static void main(String args[]){
    Scanner in=new Scanner(System.in);
    int i,n,a=0;
    System.out.println("enter no of terms");
    n=in.nextInt();
    for(i=1;i<=n;i++){
        a=a*10+1;
        System.out.println(a+"\t");
    }
}
}
