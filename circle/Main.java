class Main {
    public static void main(String[] args) {
        Point pointA=new Point();
        Point pointB=new Point(12,15);
        
        Circle circleA=new Circle(pointA,pointB);
        System.out.println(circleA);
        
    }
}