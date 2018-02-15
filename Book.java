public class Book {
  private String title;
  private int numberOfPage;
  private String authorName;
//---------------------------------------------------------------------------------- 
  //constructor method 1
  public Book(){
    //output title = "null" and numberOfPage = 0
  
  }
  
  //constructor method 2
  public Book(String title){
    this.title = title;
    //output title =  <title> and numberOfPage = 0
  
  }
  
  //constructor method 3
  public Book(String title, int numberOfPage){
    this.title = title;
    this.numberOfPage = numberOfPage;
  //output title =  <title> and numberOfPage = <numberOfPage>
  }
  
  //constructor method 4
  public Book(String title, int numberOfPage,String authorName){
    this.title = title;
    this.numberOfPage = numberOfPage;
    this.authorName = authorName;
  //output title =  <title> and numberOfPage = <numberOfPage> and authorName = <authorName>
  }
 //----------------------------------------------------------------------------------   
  
  //getter method 1
  public String gettitle(){
    return title;
  }
  
  //getter method 2
  public int getnumberOfPage(){
    return numberOfPage;
  }
  
  //getter method 3
  public String getauthorName(){
    return authorName;
  }
 //----------------------------------------------------------------------------------   
  //setter method 1
  public void settitle(String title){
    this.title = title;
  }
  
  //setter method 2
  public void setnumberOfPage(int numberOfPage){
    this.numberOfPage = numberOfPage;
  }
  
  //setter method 3
  public void setauthorName(String authorName){
    this.authorName = authorName;
  }
 //----------------------------------------------------------------------------------   
  //method sameBook
  public boolean sameBook(String title,int numberOfPage ,String authorName){
    if(this.title == title && this.numberOfPage == numberOfPage && this.authorName == authorName) {
     return true;
    }
    else{
     return false;
    }
  }
 //----------------------------------------------------------------------------------   
  public static void main(String [] args){
    //System.out.println("hello world");
    Book mybook1;
    mybook1 = new Book();
    Book mybook2;
    mybook2 = new Book("Java Programming");
    Book mybook3;
    mybook3 = new Book("C Programming",500);
    
    mybook1.settitle("OOP");
    mybook1.setnumberOfPage(1000);
    mybook2.settitle("Network");
    mybook2.setnumberOfPage(600);
    
    mybook1.setauthorName("Montira009");
    mybook2.setauthorName("Hideko_Sunshine");
    mybook3.setauthorName("Stampberry");

    /*System.out.println("------------mybook1--------------");
    System.out.println("title : " + mybook1.gettitle());            
    System.out.println("numberOfPage : " + mybook1.getnumberOfPage());
    System.out.println("------------mybook2--------------");
    System.out.println("title : " + mybook2.gettitle());
    System.out.println("numberOfPage : " + mybook2.getnumberOfPage());
    System.out.println("------------mybook3--------------");
    System.out.println("title : " + mybook3.gettitle());
    System.out.println("numberOfPage : " + mybook3.getnumberOfPage());
    
    System.out.println("************authorName************");
    System.out.println("authorName (mybook1) : " + mybook1.getauthorName());
    System.out.println("authorName (mybook2) : " + mybook2.getauthorName());
    System.out.println("authorName (mybook3) : " + mybook3.getauthorName()); */
    
    if(mybook1.sameBook("OOP",1000,"Montira009")){
      System.out.println(">>> Same");
    }
    else{
       System.out.println(">>> NOT Same");
    }
  }
}