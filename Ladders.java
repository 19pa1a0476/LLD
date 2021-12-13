class Ladder{
    private int head;
    private int tile;
    public Ladder(int head,int tile){
        this.head = head;
        this.tile = tile;
    }
    public int getStartingPoint(){
        return head;
    }

    public int getEndingPoint(){
        return tile;
    }

}
