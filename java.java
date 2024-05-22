import java.util.Scanner;
//class 
class special{
    //start get and set price to BMW
  private int pricebmw;
  public int  getpricebmw() {
    return pricebmw;
  }public void  setpricebmw(int newpricebmw) {
    this.pricebmw = newpricebmw;
  }
  //end get and set price to BMW

  //start get and set selearnumber to BMW
  private String selearnumbmw;
  public String getselearnumbmw() {
    return selearnumbmw;
  }public void setselearnumbmw(String newselearnumbmw) {
    this.selearnumbmw=newselearnumbmw;
  }
  //end get and set selearnumber to BMW

  //start get and set discount to BMW
  private String discountbmw;
  public String getdiscountbmw() {
    return discountbmw;
  }public void setdiscountbmw(String newdiscountbmw) {
    this.discountbmw=newdiscountbmw;
  }
  //end get and set discount to BMW

  // start get and set price to volvo
  private int pricevolvo;
  public int getpricevolvo() {
    return pricevolvo;
  }public void setpricevolvo(int newpricevolvo){
    this.pricevolvo=newpricevolvo;
  }
  //end get and set price to volvo

  //start get and set selearnumber to volvo
  private String selearnumvolvo;
  public String getselearnumvolvo(){
    return selearnumvolvo;
  }public  void setselearnumvolvo(String newselearnumvolvo){
    this.selearnumvolvo=newselearnumvolvo;
  }
  //end get and set selearnumber to volvo

  // start get and set discount to volvo
  private String discountvolvo;
  public String getdiscountvolvo(){
    return discountvolvo;
  }public  void setdiscountvolvo(String newdiscountvolvo){
    this.discountvolvo=newdiscountvolvo;
  }
  //end get and set discount to volvo

  //start get and set price to mercedes
  private int pricemercedes;
  public int getpricemercedes() {
    return pricemercedes;
  }public void setpricemercedes(int newpricemercedes){
    this.pricemercedes=newpricemercedes;
  }
  //end get and set price to mercedes

  //start get and set selearnumber to mercedes
  private String selearnummercedes;
  public String getselearnummercedes(){
    return selearnummercedes;
  }public  void setselearnummercedes(String newselearnummercedes){
    this.selearnummercedes=newselearnummercedes;
  }
  //end get and set selearnumber to mercedes

  //start get and set discount to mercedes
  private String discountmercedes;
  public String getdiscountmercedes(){
    return discountmercedes;
  }public  void setdiscountmercedes(String newdiscountmercedes){
    this.discountmercedes=newdiscountmercedes;
  }
  //end get and set discount to mercedes
}
//start class information BMW
class bmw{
  String brand="BMW";
  String date="2023, 2020, 2024, 2019, 2021";
  String guarantee="3 years";
  String color="black, white, red, yellow";
  public String motor(){
    return "V7 , 4.2 V12 , 4.3 Radial. , i6";
  }
}
//end class information BMW

//start class information volvo
class volvo{
  String brand="volvo";
  String date="2023, 2020";
  String guarantee="2 years";
  String color="black, white, yellow";
  public String motor(){
    return "T2, T3, T4, T5, T6";
  }
}
//end class information volvo
//start class information mercedes
class mercedes {
  String brand="mercedes";
  String date="2023, 2020, 2021, 2022";
  String guarantee="4 years";
  String color="black, white";
  public String motor(){
    return "V6, Flat-six, Inline-four, Flat-four.";
  }
}
//end class information mercedes

//class main
public class java extends bmw{
  public static void main(String [] args){
    //start create objects of the classes
    Scanner scn = new Scanner(System.in);
    java BMW= new java();
    special selnr = new special();
    volvo  Volvo= new volvo();
    mercedes  mercedes= new mercedes();
    //end create objects of the classes
    System.out.println("Welcome to my car showroom");
    System.out.println("we have (BMW) and (Volvo) and (Mercedes)-Cars in our store.");
    //start Definitions to BMW
    selnr.setpricebmw(3000000);
    selnr.setselearnumbmw("bd45e78t8");
    selnr.setdiscountbmw("%10");
    //end Definitions to BMWvo

    //start Definitions to VOLVO
    selnr.setdiscountvolvo("%12");
    selnr.setpricevolvo(1000000);
    selnr.setselearnumvolvo("v48e4o8p");
    //end Definitions from VOLVO

    //start Definitions from MERCEDES
    selnr.setdiscountmercedes("%5");
    selnr.setpricemercedes(4000000);
    selnr.setselearnummercedes("m879sd96f");
    //end Definitions from MERCEDES

    //Vehicle selection by the user
    System.out.println("choose car");
    String resalt=scn.nextLine();

    switch (resalt) {
      //if user choose BMW
      case "bmw":
      case "BMW":
      case "1":
      // details about BMW car
        System.out.println("we have: "+ BMW.brand);
        System.out.println("Made in: "+BMW.date);
        System.out.println("the guarantee to: "+BMW.guarantee);
        System.out.println("Motor type: " + BMW.motor());
        System.out.println("you want to watch more details? yes/no");
        String detailsbmw=scn.nextLine();
        //that switch to more details aboute BMW car
        switch (detailsbmw) {
          case "yes":
          case "ok":
          System.out.println("we have some color like: "+BMW.color);
          System.out.println("You can buy this car start from: "+ selnr.getpricebmw()+"$");
          System.out.println("if you come with this code: "+"~"+ selnr.getselearnumbmw()+"~"+ " we will give you discount: " + selnr.getdiscountbmw());
          break;
          case "no":
          case "":
            System.out.println("okay");
          break;
        }
        break;
        //if user choose VOLVO
        case "volvo":
        case "VOLVO":
        case "2":
        // details about VOLVO car
        System.out.println("we have: "+ Volvo.brand);
        System.out.println("Made in: "+Volvo.date);
        System.out.println("the guarantee to: "+Volvo.guarantee);
        System.out.println("Motor type: " + Volvo.motor());
        System.out.println("you want to watch more details? yes/no");
        String detailsvolvo=scn.nextLine();
        //that switch to more details aboute VOLVO car
        switch (detailsvolvo) {
          case "yes":
          case "ok":
          System.out.println("we have some color like: "+Volvo.color);
          System.out.println("You can buy this car start from: "+selnr.getpricevolvo()+"$");
          System.out.println("if you come with this code: "+"~"+ selnr.getselearnumvolvo()+"~"+" we will give you discount: "+ selnr.getdiscountvolvo());
          break;
          case "no":
          case "":
          System.out.println("okay");
          break;
        }
        break;
        //if user choose MERCEDES
        case"mercedes":
        case"MERCEDES":
        case"3":
        // details about MERCEDES car
        System.out.println("we have: "+ mercedes.brand);
        System.out.println("Made in: "+mercedes.date);
        System.out.println("the guarantee to: "+mercedes.guarantee);
        System.out.println("Motor type: " + mercedes.motor());
        System.out.println("you want to watch more details? yes/no");
        String detailsmercedes=scn.nextLine();
        //that switch to more details aboute MERCEDES car
        switch (detailsmercedes) {
          case "yes":
          case "ok":
          System.out.println("we have some color like: "+mercedes.color);
          System.out.println("You can buy this car start from: "+selnr.getpricemercedes()+"$" );
          System.out.println("if you come with this code: "+"~"+ selnr.getselearnummercedes()+"~" +" we will give you discount: "+ selnr.getdiscountmercedes());
          break;
          case "no":
          case "":
          System.out.println("okay");
          break;
        }
        //if user don't choose anything
        break;
        case "":
        System.out.println("Error, you must enter a type car!");
        break;
        default:System.out.println("what!?, we just have (BMW) and (Volvo) and (Mercedes),  try again.");
        break;
    }
  }
}


