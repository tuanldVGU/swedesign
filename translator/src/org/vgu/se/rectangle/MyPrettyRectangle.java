package org.vgu.se.rectangle;

public class MyPrettyRectangle {
    private MyPoint topLeft,bottomRight;

    public MyPrettyRectangle(double a1,double b1,double a2,double b2){
        this.topLeft = new MyPoint(a1,b2);
        this.bottomRight = new MyPoint(a2,b1);
    }
    public boolean contains(MyPrettyRectangle other){
        if (this.topLeft.getX() > other.topLeft.getX()
                || this.bottomRight.getX() < other.bottomRight.getX()
                || this.topLeft.getY() < other.topLeft.getY() // R1 is above R2
                || this.bottomRight.getY() > other.bottomRight.getY()) { // R1 is below R1
            return false;
        }
        else {return true;}
    }

    public MyPoint getCenter(){
        MyPoint ans = new MyPoint(0,0);
        ans.setX((this.bottomRight.getX()+this.topLeft.getX())/2);
        ans.setY((this.topLeft.getY()+this.bottomRight.getY())/2);
        return ans;
    }

    public double getArea(){
        return (topLeft.getY()-bottomRight.getY())*(bottomRight.getX()-topLeft.getX());
    }

    public double getPerimeter(){
        return ((topLeft.getY()-bottomRight.getY())+(bottomRight.getX()-topLeft.getX()))*2;
    }

    public MyPoint getTopLeft() {
        return topLeft;
    }
    public MyPoint getBottomRight() {
        return bottomRight;
    }
    @Override
    public boolean equals(Object obj){
        MyPrettyRectangle obj1 = (MyPrettyRectangle) obj;
        return (this.topLeft.getX() == obj1.topLeft.getX()) && (this.bottomRight.getX() == obj1.bottomRight.getX())
                && (this.topLeft.getY() == this.topLeft.getY()) && (this.bottomRight.getY() == obj1.bottomRight.getY());
    }
}
