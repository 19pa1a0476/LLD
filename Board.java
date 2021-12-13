import java.util.*;

class Board{
    private  HashMap<Integer,Integer> snakes;
    private  HashMap<Integer,Integer> laders;
    private int BoardSize;
    private  Queue<Players> players;
    public Board(HashMap<Integer,Integer> snakes,HashMap<Integer,Integer> laders,int BoardSize,Queue<Players> players){
        this.snakes = snakes;
        this.laders = laders;
        this.BoardSize = BoardSize;
        //this.Dice = Dice;
        this.players = players;
    }
    public int getBoardSize(){
        return BoardSize;
    }
   
    public void  nowPlay(){
        while(true){
            Players play = players.poll();
            int getNewPosition = play.getIntialPlace();
            int getFinalPosition = getNewPosition+Dice.getDies();
            if(getFinalPosition<=BoardSize){
                if(snakes.containsKey(getFinalPosition)){
                    getNewPosition = snakes.get(getNewPosition);
                    System.out.println(play.getName()+" Claimed a Ladder and moved forward"+getFinalPosition);
                
                }
                else if(laders.containsKey(getFinalPosition)){
                    getNewPosition = laders.get(getNewPosition);
                    System.out.println(play.getName()+" Claimed a Ladder and moved forward"+getFinalPosition);
                    
                }
                else{
                    System.out.println(play.getName() + "rolled a dice moved from " + getNewPosition + "to " + getFinalPosition);
                    getNewPosition = getFinalPosition;
                }
            }
                if (getNewPosition == BoardSize) {
                    System.out.println(play.getName() + " won the game");
                    break;
                }
                play.setIntialPlace(getNewPosition);
                players.add(play);
    
}
}    
}

