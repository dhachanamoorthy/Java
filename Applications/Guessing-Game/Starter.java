class GuessGame{
    //Initializing player objects generate random guess number for each player
    Player P1;
    Player P2;
    Player P3;

    public void startGame(){

        //Creating player objects
        P1=new Player();
        P2=new Player();
        P3=new Player();

        //checks whether any of these guess is correct 
        boolean P1isRight=false;
        boolean P2isRight=false;
        boolean P3isRight=false;

        //variables to hold the players guess number
        int P1guess=0;
        int P2guess=0;
        int P3guess=0;

        //the Target number which has to be guessed by the players
        int target=(int)(Math.random()*10);

        //until any one of the players guess is right the loop must be continued...
        while(true){
            P1.guess();
            P2.guess();
            P3.guess();


            P1guess=P1.number;
            P2guess=P2.number;
            P3guess=P3.number;

            if(P1guess==target)
                P1isRight=true;
            if(P2guess==target)
                P2isRight=true;
            if(P3guess==target)
                P3isRight=true;
            
            //checking whether any of the player found the target
            if(P1isRight || P2isRight || P3isRight){
                System.out.println("The Winner is here....");
                System.out.println("Player One is Right ? "+P1isRight);
                System.out.println("Player Two is Right ? "+P2isRight);
                System.out.println("Player Three is Right ? "+P3isRight);
                System.out.println("Game Over...");
                break;
            }
            else{
                System.out.println("The Targer is "+target);
                System.out.println("The Players have been given with another chance");
            }
        }
    }
}

//Player Guesses the number here
class Player{
    int number;
    void guess(){
        number=(int)(Math.random()*10);
        System.out.println("I'm guessing the number "+number);
    }
}

//application starts here
public class Starter{
    public static void main(String[] args) {
        System.out.println("Game starts here...");
        GuessGame g=new GuessGame();
        g.startGame();
    }
}