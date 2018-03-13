package org.vgu.se.rectangle;

public class MyPoint {
    private double x,y;
    public MyPoint(double a,double b){
        this.x=a; this.y=b;
    }
    public void setX(double a){ this.x =a;}
    public void setY(double b){ this.y =b;}
    public double getX(){return x;}
    public double getY(){return y;}
    @Override
    public boolean equals(Object obj){
        MyPoint obj1 = (MyPoint)obj;
        return (this.x == obj1.x) && (this.y == obj1.y);
    }
}
