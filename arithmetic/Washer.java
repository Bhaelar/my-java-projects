public class Washer {
    private int clothPieces;
    
    private int timer;
    
    
    public void setTimer (int timer) {
        this.timer = timer;
    }
    
    public int getTimer () {
        return timer;
    }
    
    public void setClothPieces (int clothPieces) {
        this.clothPieces = clothPieces;
    }
    
    public int getClothPieces () {
        return clothPieces;
    }
    
    
    public void washing() {
        System.out.println("Clothes are washing..");
        
    }
    
}