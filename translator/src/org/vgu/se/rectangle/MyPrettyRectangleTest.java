package org.vgu.se.rectangle;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MyPrettyRectangleTest {
    private MyPrettyRectangle left;
    private MyPrettyRectangle middle;
    private MyPrettyRectangle right;
    private MyPrettyRectangle somewhere;

    /*
     * Set-Up Method, for all test method.
     * It will be executed before each test method is executed.
     *
     */
    @Before
    public void setUp() throws Exception {
        //
        //     +-----------+   +---+
        //     |         r |   | s |
        // +---+---+---+   |   |   |
        // | l |   | m |   |   |   |
        // |   |   +---+   |   |   |
        // |   |       |   |   |   |
        // +---+-------+   |   +---+
        //     |           |
        //     +-----------+
        //
        // Assumption: 1 Unit = 1 cm
        // MyPrettyRectangle Constructor: MyPrettyRectangle(x1,y1,x2,y2)
        // x1,y1: Point lower left
        // x2,y2: Point upper right

        left = new MyPrettyRectangle(0.0, 1.0, 3.0, 3.0); // l in the picture above
        middle = new MyPrettyRectangle(2.0, 2.0, 3.0, 3.0); // m in the picture above
        right = new MyPrettyRectangle(1.0, 0.0, 4.0, 4.0);  // r in the picture above
        somewhere = new MyPrettyRectangle(5.0, 1.0, 6.0, 4.0); // s in the picture above

    }

    /*
     * Method to test a method 'contains' of class MyPrettyRectangle, which checks, whether a rectangle
     * fully contains another rectangle.
     *
     * (Result: boolean value)
     *
     */
    @Test
    public void testContains() {
        // First tests, to check the correctness of method contains()
        assertTrue(  right.contains(middle) );
        assertTrue(  right.contains(right) );
        assertFalse(  right.contains(left) );
        assertFalse(  right.contains(somewhere) );

        // Please provide further assertions for a complete test with all possible combinations!
        // [Your code]
        assertTrue(  left.contains(middle) );
        assertTrue(  left.contains(left) );
        assertFalse(  left.contains(right) );
        assertFalse(  left.contains(somewhere) );

        assertTrue(  middle.contains(middle) );
        assertFalse(  middle.contains(right) );
        assertFalse(  middle.contains(left) );
        assertFalse(  middle.contains(somewhere) );

        assertFalse(  somewhere.contains(middle) );
        assertFalse(  somewhere.contains(right) );
        assertFalse(  somewhere.contains(left) );
        assertTrue(  somewhere.contains(somewhere) );

    }

    /*
     * Testing method for testing a method 'getCenter' of class MyPrettyRectangle, which calculates the center point of
     * a rectangle.
     *
     * (Result: a point (object) in the coordinate system)
     *
     */
    @Test
    public void testGetCenter(){
        // // First tests, to check the correctness of method getCenter()
        assertEquals( new MyPoint(1.5, 2.0), left.getCenter() );

        // Please further assertions for calculating the center points of the rectangles right, middle, and
        // somewhere. Please check them with the actual center points.
        // The necessary methods in the class MyPrettyRectangle should be implemented accordingly.
        // For a correct comparison of the MyPoint objects, the equals method of class java.lang.Object should be overridden!
        //
        // [your code]
        assertEquals( new MyPoint(2.5, 2.0), right.getCenter() );
        assertEquals( new MyPoint(2.5, 2.5), middle.getCenter() );
        assertEquals( new MyPoint(5.5, 2.5), somewhere.getCenter() );

    }

    /*
     * Testing method for testing a method 'getArea' of class MyPrettyRectangle, which calculates the area of
     * a rectangle.
     *
     * (Result: Value in square centimeter, cm2)
     *
     */
    @Test
    public void testGetArea(){
        // Please add further assertions for implementing the method for calculating the rectangle
        // Please compare the target and the actual values. Please do also respect a
        // maximum difference (delta) between expected and actual values.
        // More details: http://stackoverflow.com/questions/7554281/junit-assertions-make-the-assertion-between-floats

        // [your code]
        assertEquals(1,middle.getArea(),0);
        assertEquals(6,left.getArea(),0);
        assertEquals(12,right.getArea(),0);
        assertEquals(3,somewhere.getArea(),0);
    }

    /*
     * Testing method for testing a method 'getPerimeter' of class MyPrettyRectangle, which calculates the area of
     * a rectangle.
     *
     * (Result: Value in centimeter, cm)
     *
     */
    @Test
    public void testGetPerimeter(){

        // Please add assertions for implementing and testing your implementation for calculating the perimeter.
        // Please compare the target and the actual values. Please do also respect a
        // maximum difference (delta) between expected and actual values.
        // More details: http://stackoverflow.com/questions/7554281/junit-assertions-make-the-assertion-between-floats

        // [your code]
        assertEquals(4,middle.getPerimeter(),0);
        assertEquals(10,left.getPerimeter(),0);
        assertEquals(14,right.getPerimeter(),0);
        assertEquals(8,somewhere.getPerimeter(),0);

    }

    /*
     * Method for testing the object identity among various MyPrettyRectangle objects
     *
     */
    @Test
    public void testSameIdentity() {
        // Please add five assertions that checks the object identity of rectangle 'left' with all other rectangles
        // (including the new rectangle 'other'). Please use the assertions assertSame and / or assertNotSame
        //
        // [your code]

        MyPrettyRectangle other = left;

        assertSame(left,left);
        assertSame(left,other);
        assertNotSame(left,right);
        assertNotSame(left,middle);
        assertNotSame(left,somewhere);
        // Please add three assertions for checking the equality of rectangle objects. Please do 'also' use assertTrue here!
        // [your code]
        assertFalse(left.getArea()==right.getArea());
        assertTrue(middle.getArea()==middle.getArea());
        assertFalse(left.getPerimeter()==right.getPerimeter());
        // Please add five further assertions that checks the object identity of rectangle 'left' with all other rectangles
        // (including the new rectangle 'other'). Please use the assertions assertTrue and / or assertFalse
        //
        // [your code]
        assertTrue(left==left);
        assertTrue(left==other);
        assertFalse(left==right);
        assertFalse(left==middle);
        assertFalse(left==somewhere);



    }

    /*
     * Method for checking the static method 'getBoundingBox' of another class called BoundingBoxFactory. When given
     * an array of different rectangle object, this method calculates a bounding box out of that array.
     *
     * Definition Bounding Box: a bounding box defines the minimal paraxial rectangle that surrounds a given set
     * of rectangles.
     *
     */
    @Test
    public void testGetBoundingBox( ) {

        MyPrettyRectangle[] rect = {middle, right, somewhere};

        // Please add assertions for implementing and testing your implementation for calculating the bounding box.
        // Please let your implementation test the above given array of three rectangles. Test on object equality.
        //
        // [your code]
        BoundingBoxFactory t1 = new BoundingBoxFactory(rect);
        assertEquals(new MyPrettyRectangle(0.0,1.0,6.0,4.0),t1.getBoundingBox());
        // Test, if any object returned at all...
        //
        // [your code]
        assertNotNull(t1.getBoundingBox());

        // Test for an empty array as an input (result: a rectangle with four '0' coordinates should be returned)
        //
        // [your code]
        MyPrettyRectangle[] empty = {};
        BoundingBoxFactory t2 = new BoundingBoxFactory(empty);
        assertEquals(new MyPrettyRectangle(0.0,0.0,0.0,0.0),t2.getBoundingBox());

        // Test for a NULL value as an input --> NULL should be returned!
        //
        // [your code]
        BoundingBoxFactory t3 = new BoundingBoxFactory(null);
        assertNull(t3.getBoundingBox());
    }
}
