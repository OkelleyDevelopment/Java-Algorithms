import java.util.Scanner;

public class Main {

    public static void foo(int num){

        // If we use the mod operator on the number
        // then we can see if we need to go further
        // in recursion.
        int moddedNum = num % 10;
        //System.out.println(moddedNum);

        //if(num > -10 && num < 10){
        //  System.out.println("" + num);
        //)
        if(moddedNum == 0){
            return; //if the remainder is 0, then return and print.
        }
        //else{
        //}
        else{
            foo(num / 10);
        }
        System.out.println(moddedNum);

    }

    public static void main(String[] args) {
        try{
            System.out.println("Please enter an integer: ");
            Scanner input = new Scanner(System.in);
            int n = input.nextInt();
            foo(n);
        }
        catch(IllegalArgumentException e){
            e.printStackTrace();
        }

    }

}
