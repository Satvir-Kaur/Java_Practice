package constructors;
// check use of static variable:
public class Student1 {

    int rollno;
    String name;
    static String college="CIET";

    Student1(int r, String n){
        rollno=r;
        name=n;

    }
    void display(){
        System.out.println(rollno+" "+name+" "+college);
    }

}
