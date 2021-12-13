import java.util.*;
class Dice{
    public static int getDies(){
        return new Random().nextInt(6) + 1;

    }
}