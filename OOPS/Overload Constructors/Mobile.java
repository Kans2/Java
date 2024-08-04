public class Mobile{
    String Company;
    String Model;
    int Camera;
     int Battery;
   String color = "white";
   String Os = "Android";
  boolean isStock = true;

  Mobile(String Company,String Model,int Camera,String color,String Os,boolean isStock){
        
        this.Company = Company;
        this.Model = Model;
        this.Camera = Camera;
        this.color = color;
        this.Os = Os;
        this.isStock = isStock;
  }
  Mobile(String color,String Os,boolean isStock){
    this.color= color;
    this.Os = Os;
    this.isStock = isStock;
  }

}