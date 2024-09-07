public class Car {
   private String name;
   private String company;
   private String color;
   private String model;
   private int year;

    Car(String name,String company,String color,String model,int year){
         this.setName(name); 
         this.company = company;
         this.color = color;
         this.model = model;
         this.year = year;

    }

    //Methods
    //getter
    public String getName(){
        return  name;
    }

    public String getCompany(){
        return company;
    }
    public String getColor(){
        return color;
    }

    public String getModel(){
        return model;
    }

    public int getYear(){
        return year;
    }


    //Setter
    public void setName(String name){
        this.name = name;
    }
}
