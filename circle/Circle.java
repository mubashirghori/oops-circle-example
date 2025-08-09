class Circle extends Point{
    private Point centre,edge;
    public void setCentre(Point p){
        this.centre=p;
    }
    public void setEdge(Point p){
        this.edge=p;
    }
     public Point getCentre(){
        return this.centre;
    }
    public Point getEdge(){
        return this.edge;
    }
    Circle(Point centre, Point edge){
        this.centre=centre;
        this.edge=edge;
    }
    public float radius(){
        float dx=edge.getX() - centre.getX();
        float dy=edge.getY() - centre.getY();
       float r=(float) Math.sqrt(dx*dx + dy*dy);
       return r;
    }
    public float circumference(){
        float r = radius();
        float c= (float) (2 * 3.142) * r;
        return c;
    }
    public float area(){
        float r= radius();
        float a=(float)( 3.142 * (r * r) );
        return a;
    }
    public String toString(){
        float r = radius();
        float a = area();
        float c=circumference();
        return "Circle[centre="+centre+",edge="+edge+",radius of circle="+r+",area of circle="+a+", circumference="+c+"]";
    }
}

