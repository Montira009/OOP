public class Point {
  private float x;
  private float y;
  private float z;
  
  //constructor method 1
  public Point(){
    //output x = "null" and y = "null" and z = "null
  }
  
  //constructor method 2
  public Point(float x){
    this.x = x;
    //output x = <x> and y = "null" and z = "null
  
  }
  
  //constructor method 3
  public Point(float x, float y){
    this.x = x;
    this.y = y;
  //output x = <x> and y = <y> and z = "null"
  }
  
  //constructor method 3
  public Point(float x, float y, float z){
    this.x = x;
    this.y = y;
    this.z = z;
  //output x = <x> and y = <y> and z = <z>
  }
  
  //getter method 1
  public float getx(){
    return x;
  }
  
  //getter method 2
  public float gety(){
    return y;
  }
  
  //getter method 3
  public float getz(){
    return z;
  }
  
  //setter method 1
  public void setx(float x){
    this.x = x;
  }
  
  //setter method 2
  public void sety(float y){
    this.y = y;
  }
  
  //setter method 3
  public void setz(float z){
    this.z = z;
  }
  
  //setter medthod 4
  public void setxyz(float x, float y, float z){
    this.setx(x);       //input value x sent to seyx
    this.sety(y);       //input value y sent to seyy
    this.setz(z);       //input value z sent to seyz
  }
  
  //MEDTHOD SHOW VALUE
 public void showValue() {
  System.out.println("point x : " + x);
  System.out.println("point y : " + y);
  System.out.println("point z : " + z);
  System.out.println("--------------------");
 }
  //MEDTHOD SET POINT
  public void setPoint(Point pt){
    this.x = pt.getx();
    this.y = pt.gety();
    this.z = pt.getz();
  }
}