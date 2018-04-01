package multilevelinheritance;


/**
 * Created by user on 13/03/2017.
 */
public class ClassC  extends ClassB {

    public static void main(String[] args) {

        ClassC obj = new ClassC();
        obj.displayA();
        obj.displayB();
    }
}
class ClassB extends ClassA {

    public void displayB()
    {

        System.out.println("i am in classB");
    }
}

