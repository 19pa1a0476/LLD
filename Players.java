class Players{
    private String name;
    private int IntialPlace = 0;
    public Players(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    public void setIntialPlace(int currentLocation)
    {
        this.IntialPlace = currentLocation;
        
    }
    public int getIntialPlace(){
        return this.IntialPlace;
    }
}