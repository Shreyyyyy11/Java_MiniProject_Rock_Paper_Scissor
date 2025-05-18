import java.util.Scanner;
import java.util.Random;
public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("1.Rock\n2.Paper\n3.Scissor");
        System.out.print("Enter your choice: ");
        int yc=sc.nextInt();
        if(yc<1||yc>3){
            System.out.println("Invalid choice!\nMake a valid choice!!");
            return;
        }
        Random r= new Random();
        int cc=r.nextInt(1,4);
        if (yc==cc){
            System.out.println("Draw!");
        }
        else if (yc==1&&cc==3||yc==2&&cc==1||yc==3&&cc==2) {
            System.out.println("You Win!");
        }
        else{
            System.out.println("Lost!");
        }
        if (cc==1){
            System.out.println("Computer choice:Rock");
        }
            if (cc==2){
                System.out.println("Computer choice:Paper");
            }
                if (cc==3){
                    System.out.println("Computer choice:Scissor");
                }
    }
}
