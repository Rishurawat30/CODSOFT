import java.util.*;
public class NumberGame{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
            
        int chances=3;
        int finalscore=0;
        boolean playagain=true;
        System.out.println("Welcome and Have Fun! ");
        System.out.println("Hey player you have "+chances+" to win the game ");
        while(playagain){
            int rand=getrandnumber(1,100);
            boolean guess=false;
            for (int i=0;i<chances;i++)
            {
                System.out.println("Chance "+(i+1)+".\nEnter your guess:");
                int player=sc.nextInt();
                if(player==rand)
                {
                  guess=true;
                  finalscore=+1;
                  System.out.println("Congrats! You Won");
                  break;
                }
            else if(player>rand)
            {
                System.out.println("Too High");
            }
            else
            {
                System.out.println("Too Low ");
            }
        }
        if(guess==false)
        {
            System.out.println("Sorry! You Lost. \n The number is "+rand);
        }
        System.out.println("Do you want to play again(yes/no) ");
        String pa=sc.next();
        playagain=pa.equalsIgnoreCase("yes");
        }
        System.out.println("Thanks for playing. Hope you enjoyed the game");
        System.out.println("Your Score is " +finalscore);
    }
    public static int getrandnumber(int min, int max)
        {
            return (int)(Math.random()*(max-min+1)+min);
        }
}