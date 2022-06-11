import java.util.Scanner;

public class recursCount5 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Bir Sayi Gir : ");

        int n,temp2 ;

        n = inp.nextInt();
        temp2=n;
        say(n,temp2);

    }

    static void say(int n,int temp2){
        int temp;




        if(n<0){
            temp=n;
            say1(temp,temp2);
            return;
        }

        System.out.print(" "+n);
        say(n-5,temp2);




    }

    static  void  say1(int temp, int temp2){


        if(temp>temp2){

            return ;
        }

        System.out.print( " "+temp);
        say1(temp+5,temp2);




    }

}
