public class Map {
    private int xPosition;
    private int yPosition;
    private int roomCounter;
    
    private static map (int xPosition, int yPosition, int roomCounter){
        this.xPosition= xPosition;

        

    }
    public void showOptions(){
        if (roomCounter==8){System.out.println("Up, Down, Left, Right, Accuse");}
        else {System.out.println("Up, Down, Left, Right");}
    }

    private String checkLocation (int xPosition,  int yPosition){
        if (xPosition>=2 && xPosition<=5 && yPosition<=8 && yPosition>=3){
            return("Kitchen");}
        else{
            return ("no room");}
    }




    public static void main () {



    }
}