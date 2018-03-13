package org.vgu.se.rectangle;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class test {

    private static MyPrettyRectangle left;
    private static MyPrettyRectangle middle;
    private static MyPrettyRectangle right;
    private static MyPrettyRectangle somewhere;

    public static void main(String[] args) {
        left = new MyPrettyRectangle(0.0, 1.0, 3.0, 3.0); // l in the picture above
        middle = new MyPrettyRectangle(2.0, 2.0, 3.0, 3.0); // m in the picture above
        right = new MyPrettyRectangle(1.0, 0.0, 4.0, 4.0);  // r in the picture above
        somewhere = new MyPrettyRectangle(5.0, 1.0, 6.0, 4.0); // s in the picture above
        System.out.println(right.contains(middle));
        System.out.println(right.contains(right));
        System.out.println(right.contains(left));
        System.out.println(right.contains(somewhere));
        MyPoint t1 = new MyPoint(1.5,2.0);
        System.out.println(left.getCenter().equals(t1));
        MyPrettyRectangle[] rect = {middle, right, somewhere};
        BoundingBoxFactory test = new BoundingBoxFactory(rect);
        MyPrettyRectangle tesy = test.getBoundingBox();
        System.out.println("1x: "+tesy.getTopLeft().getX()+" 1y: "+tesy.getBottomRight().getY()+" 2x: "
                +tesy.getBottomRight().getX()+" 2y: "+tesy.getTopLeft().getY());
    }


}
