package globalvariables;

/**
 * Created by user on 13/03/2017.
 */
public class globalvariableEx {

    int i = 40; // global variable are accessed using object

    public static void main(String[] args) {

        int i = 30; //local variable with in method

        System.out.println(i);

        globalvariableEx obj = new globalvariableEx();

        System.out.println(obj.i);
    }
}
