package constructors;

public class Copy {
     int id;
     String name;
     void display()
     {
         System.out.println("ID: " + id);
         System.out.println("Name: " + name);

     }
     Copy(int i, String n)
     {
         id = i;
         name = n;
     }
     Copy() {}
    /*Copy( Copy c1)
     {
         id = c1.id;
         name = c1.name;
     }*/

}
