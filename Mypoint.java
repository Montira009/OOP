public class Mypoint {
  public static void main(String[] args) {
    Point pt1 = new Point(1, 2, -1);
    Point pt2 = new Point(2, 3, -2);
    Point pt3 = new Point(3, 4, -3);
    
    System.out.println("This value in pt1");
    pt1.showValue();
    pt1.setxyz(4, 4, -4);
    pt3.setPoint(pt2);
    System.out.println("This **NEW** value in pt1");
    pt1.showValue();
    System.out.println("This value in pt2");
    pt2.showValue();
    System.out.println("This value in pt3 Same as pt2");
    pt3.showValue();
  }
}