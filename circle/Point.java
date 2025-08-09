public class Point{
    protected float x,y;
    public void setX(float x){
        this.x=x;
    }
    public void setY(float y){
        this.y=y;
    }
    public float getX(){
        return this.x;
    }
    public float getY(){
        return this.y;
    }
    Point(){
    }
    Point(float x, float y){
        this.x=x;
        this.y=y;
    }
    public String toString(){
        return "Point ["+x+","+y+"]";
    }
}