public class ClueMap {
    public int xPosition;
    public int yPosition;
    public  int roomCounter;
    
    public ClueMap(){
        xPosition=0;
        yPosition=0;
        roomCounter=0;

        

    }
    public void showOptions(){
        if (roomCounter==8){System.out.println("Up, Down, Left, Right, Accuse");}
        else {System.out.println("Up, Down, Left, Right");}
    }



    private String checkLocation (int xPosition,  int yPosition){
        if (xPosition>= -10 && xPosition<= -4 && yPosition<=10 && yPosition>=5){
            return("Kitchen");}
        if (xPosition>=-3 && xPosition<=1 && yPosition<=8 && yPosition>=3) {
            
        }
        else{
            return ("no room");}
    }




    public static void main(String[] args) {
        ClueMap map= new ClueMap();
        map.showOptions();




    }
}