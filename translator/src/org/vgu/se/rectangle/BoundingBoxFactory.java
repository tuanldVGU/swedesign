package org.vgu.se.rectangle;

import java.util.Arrays;
import java.util.List;

public class BoundingBoxFactory {
    private List<MyPrettyRectangle> array ;
    private int i=0;
    private MyPrettyRectangle ans;
    public BoundingBoxFactory(MyPrettyRectangle[] x){
        if (x==null){array=null;}
        else array = Arrays.asList(x);
    }
    public MyPrettyRectangle getBoundingBox(){
        if (array==null) {return null;}
        else {
            double maxX = 0, minX = 1000, maxY = 0, minY = 1000;
            for (int i = 0; array.size() > i; i++) {
                if (array.get(i).getBottomRight().getX() > maxX) {
                    maxX = array.get(i).getBottomRight().getX();
                } else if (array.get(i).getTopLeft().getX() < minX) {
                    minX = array.get(i).getTopLeft().getX();
                }
                if (array.get(i).getTopLeft().getY() > maxY) {
                    maxY = array.get(i).getTopLeft().getY();
                } else if (array.get(i).getBottomRight().getY() < minY) {
                    minY = array.get(i).getBottomRight().getY();
                }

            }
            if (minX == 1000) {
                minX = 0;
            }
            if (minY == 1000) {
                minY = 0;
            }
            ans = new MyPrettyRectangle(minX, minY, maxX, maxY);
            return ans;
        }
    }
}
