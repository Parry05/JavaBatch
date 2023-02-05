import java.util.Scanner;

public class SpeedTest {
    public static void main(String[] args)
    {
        /*You are driving a little too fast, and a police officer stops you.
        Write code to compute the result, encoded as an int value: 0=no ticket, 1=small ticket, 2=big ticket.
         If speed is 60 or less, the result is 0. If speed is between 61 and 80 inclusive, the result is 1.
          If speed is 81 or more, the result is 2.
        Unless it is your birthday -- on that day, your speed can be 5 higher in all cases.*/
        int  sc;

        Scanner scanner= new Scanner(System.in);
        System.out.println("what is the speed");
        sc = scanner.nextInt();
        if(sc<=60)
        {
            System.out.println("no ticket");
        }
        else if(sc>=61 && sc<=80)
        {
        System.out.println("small ticket");
    }
    else if(sc>=81){
    System.out.println("big ticket");

    }



    }
}
