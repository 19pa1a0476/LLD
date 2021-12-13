import java.util.*;
class RequiredData{
    private static boolean add;
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter board size");
        int boardSize = Integer.parseInt(sc.nextLine());
        System.out.println("Enter no of Dices");
        int noOfDices = Integer.parseInt(sc.nextLine());
        System.out.println("Enter No.Of Snakes");
        int noOfSnakes = Integer.parseInt(sc.nextLine());
        HashMap<Integer,Integer> mapOfSnakes = new HashMap<>();
        for(int i=0;i<noOfSnakes;i++){
            String[] a = sc.nextLine().split(" ");
            mapOfSnakes.put(Integer.parseInt(a[0]),Integer.parseInt(a[1]));

        }
        System.out.println("Enter No.Of Ladders");
        int noOfLadders = Integer.parseInt(sc.nextLine());
        HashMap<Integer,Integer> mapOfLadders = new HashMap<>();
        for(int i=0;i<noOfLadders;i++){
            String[] a = sc.nextLine().split(" ");
            mapOfSnakes.put(Integer.parseInt(a[0]),Integer.parseInt(a[1]));
            
            
            
        }
        System.out.println("Enter No.Of Players");
        int noOfPlayers = Integer.parseInt(sc.nextLine());
        Queue<Players> x = new LinkedList<Players>();
        for(int i=0;i<noOfPlayers;i++){
            String b = sc.nextLine();
            Players c = new Players(b);
            add = x.add(c);
            }
            
            Board board = new Board(mapOfSnakes,mapOfLadders,boardSize,x);
            board.nowPlay();
            
        }
                                
    }