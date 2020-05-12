import java.util.ArrayList;

/**
 * description:
 *
 * @author xuqiangsheng
 * @date 2020/5/12 8:58
 */
public class Test {
    public static void main(String[] args) {
        GenericStack<String> stringGenericStack=new GenericStack<>();
        stringGenericStack.push("hello");
        stringGenericStack.push("world");
        System.out.println(stringGenericStack.isEmpty());
        System.out.println(stringGenericStack.getSize());
        System.out.println(stringGenericStack.peek());
        System.out.println(stringGenericStack.getSize());
        System.out.println(stringGenericStack.pop());
        System.out.println(stringGenericStack.getSize());
    }
}
