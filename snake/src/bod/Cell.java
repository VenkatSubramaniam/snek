package bod;

public class Cell {
    private double myX;
    private double myY;
    private String myColor;
    private String explosionType;

    public Cell(double x, double y, String color){
        this.myX = x;
        this.myY = y;
        this.myColor = color;
        //TODO setExplosionType properly.
//        this.explosionTyp
    }

    public void shift(double x, double y){
        myX = x;
        myY = y;
    }

    public String getMyColor(){
        return myColor;
    }

    public double getX(){
        return myX;
    }

    public double getY(){
        return myY;
    }

    public String getExplosionType(){
        return explosionType;
    }


}
