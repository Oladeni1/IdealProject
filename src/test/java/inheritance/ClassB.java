package inheritance;

/**
 * Created by user on 13/03/2017.
 */
public class ClassB extends ClassA {
    public static void main(String[] args)
    {

        //ClassName object = new ClassName();

        ClassB obj =new ClassB();

        obj.display(); //Accessing the methods

        System.out.println(obj.i); // Accessing the variables

    }
}




//Commenting the lines is 1. select all the lines which you want to comment
//						  2. Press ctrl+/

//int i =10;
//
//public void display()// void methods doesnt return any value
//{
//	System.out.println("in display");
//}
//}
