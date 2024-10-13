package StaticKeyword;

public class TestStatic {

    int rollno;
    String name;
    String college="CIET";

    TestStatic(int r,String n){
        rollno=r;
        name=n;
    }
    void display() {

        System.out.println(rollno+" "+name +" "+college);
    }

}
