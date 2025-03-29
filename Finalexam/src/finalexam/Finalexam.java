package finalexam;
interface Printable2{
    void print();
}
interface Showable{
    void show();
}
public class Finalexam implements Printable2,Showable{
    public void print(){
        System.out.println("this is structure is will be see the final exam");
    }
    public void show(){
        System.out.println("you have to prepare about this and multi inheritance");
    }
    public static void main(String[] args) {
        Finalexam obj = new Finalexam();
                obj.print();
                obj.show();
    }  
}