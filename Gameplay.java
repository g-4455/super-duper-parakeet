//Gameplay for inputs, looping, and prompting

public class Gameplay {

    //function to loop the game until defeat is admitted
    public static void loop(){
        Boolean flipper = true; 
            //Break the loop with a break; statement
            while (0 == 0){ //loop
                String pieceColor = flipper ? "White":"Black"; //Has to be here, make its own function?

                //Prompt then get user input
                System.out.println(pieceColor + "'s Turn! Input row (-1 to surrender)");
                int play = App.getinput();

                //Check if they admitted defeat
                if (play < 0){ //How would this read a string?
                    System.out.println(pieceColor + " Surrenders");
                    break;
                }

                //Otherwise
                int row = play;
                System.out.println("Input column");
                int column = App.getinput();

                /*//If they didn't admit defeat, split the input into a row (first) and column (second)
                int row = Integer.parseInt(Integer.toString(play).substring(0, 1));
                int column = Integer.parseInt(Integer.toString(play).substring(1, 2)); //00 DOES NOT WORK
                //Java is taking 00 as 0, 01 also as 1 */

                //FINALLY update button of row and coloumn color as piece color
                App.myarray[row][column].updateType(pieceColor);
                //Find a better solution because typing 0 looks weird to players
                //Also allow inputs like 01 instead of having to type 0 and 1


            
            flipper = !flipper; //Flip from white to black at the end of the loop
            
        }
    }
}
