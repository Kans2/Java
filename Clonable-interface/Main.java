public class Student implements  Cloneable{
            Integer name; 
            String Id;  
            Department de;

    public Student(Integer name, String Id,Department de) {
        this.name = name;
        this.Id = Id;
        this.de = de;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    

            
}

//Deep Copy
public class Department implements  Cloneable{
    String Dep; 
    String Id;  

public Department(String name, String Id) {
this.Dep= name;
this.Id = Id;
}
protected Object clone() throws CloneNotSupportedException {
    return super.clone();
}

}

public class Main {
    //Clone                = clone is method use of Clone();
    //Shallow Copy         = Copy all the fields of a new instance of the same class to the new instance
    //Deep Copy            = The independent of original instance and making changes in clone should not affect original instance.
    
       public static void main(String[] args) throws CloneNotSupportedException{
           Department dep = new Department(null, null);
           Student    stu = new Student(null, null);

           Student stu2 = (Student)super.clone();
           stu2.de = (Department)stu2.de.clone();
           return stu2;
       }

}
