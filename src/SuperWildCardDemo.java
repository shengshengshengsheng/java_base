/**
 * description:
 *
 * @author xuqiangsheng
 * @date 2020/5/12 10:09
 */
public class SuperWildCardDemo {
    public static void main(String[] args) {
        GenericStack<String> stringGenericStack=new GenericStack<>();
        GenericStack<Object> objectGenericStack=new GenericStack<>();
        objectGenericStack.push("java");
        objectGenericStack.push(2);
        stringGenericStack.push("sun");
        addStack(stringGenericStack,objectGenericStack);
        printStack(objectGenericStack);
    }

    private static <T> void printStack(GenericStack<T> objectGenericStack) {
        while (!objectGenericStack.isEmpty()){
            System.out.println(objectGenericStack.pop());
        }
    }

    private static <T> void addStack(GenericStack<? extends T> stringGenericStack, GenericStack<T> objectGenericStack) {
        while (!stringGenericStack.isEmpty()){
            objectGenericStack.push(stringGenericStack.pop());
        }
    }
}
