package constructors;

public class CopyMain {
    public static void main(String[] args) {
        Copy c1=new Copy(101,"savi");
       // Copy c2=new Copy(c1);
        Copy c2=new Copy();
        c1.display();
       // c2.display();
        c2.id=c1.id;
        c2.name=c1.name;
        c2.display();

    }
}
