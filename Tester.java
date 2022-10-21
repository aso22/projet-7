import java.util.Scanner;
public class Tester {
    public static void main(String[] args) {
        BasicAccount bb=new BasicAccount();
        bb.deposits(100);
        System.out.println(bb.getBalance());
        bb.withdraws(101);
        System.out.println(bb.getBalance());
        FillInQuestion f=new FillInQuestion();
        f.setText("MY NAME IS _MAROOM_");
        f.display();
        System.out.println(f.getTextWithAnswer());
         Questions q=new Questions();
         q.setText("what is your name?");
         q.setAnswer("marAm");
         q.display();
        System.out.println(q.check_answer("Maram "));
        BetterRectangle b=new BetterRectangle(0,0,1,2);
        System.out.println(b.getPerimeter());
        System.out.println(b.getArea());
        Student s=new Student("AHMED","2020","NOTHING");
        System.out.println(s.toString());
        Instructor i=new Instructor("ELAF","2015",10000);
        System.out.println(i.toString());
    }
}
