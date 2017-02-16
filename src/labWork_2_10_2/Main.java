package labWork_2_10_2;

/**
 Create new project called  WrapperDemo2.
 Add package “com.brainacad.oop.testwrapper2”.
 Create class Main with method main().
 Add to class Main static method compute( , ) that use as argument s two different numeric wrapper classes, adds the values of the two instances together, and then creates a third numeric wrapper instance whose value is the sum and return it.
 For example:
 static method compute(Byte, Integer) witch return Long type.
 In method main() write code to invoke compute(,) and print result to console.
 Execute the program.

 */
public class Main {
    public static void main(String[] args) {
    byte bb = 23;
        int ii = -100;
        System.out.println(compute(bb, ii));
        System.out.println(compute((byte)11, 22));
    }

    static Long compute(Byte arg_1, Integer arg_2){
//        long result = arg_1 + arg_2;
//        return new Long(result);

        Long result = (long)(arg_1 + arg_2);
        return result;
    }
}
