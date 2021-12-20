package View;
//encapsulation
public class Student {
    //properties
    private String fname;
    private String lname;
    private int age;

//constructor
    public Student(String fname,String lname,int age){
        this.fname = fname;
        this.lname = lname;
        this.age = age;
    }
//getter
    public String getFname(){
        return fname;
    }

    public String getLname(){
        return this.lname;
    }



    //behaviour
    @Override
    public String toString() {
        return "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", age=" + age ;
    }
}
