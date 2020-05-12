/**
 * description:
 *
 * @author xuqiangsheng
 * @date 2020/5/12 9:51
 */
public class WildCardNeedDemo {
    public static void main(String[] args) {
        GenericStack<Integer> integerGenericStack=new GenericStack<>();
        integerGenericStack.push(11);
        integerGenericStack.push(24);
        integerGenericStack.push(10);
        System.out.println(maxStack(integerGenericStack));
    }

    private static double maxStack(GenericStack<? extends Number> integerGenericStack) {
        Number max=integerGenericStack.pop();
        return max.doubleValue();
    }
}
