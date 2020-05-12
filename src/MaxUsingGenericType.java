/**
 * description:
 *
 * @author xuqiangsheng
 * @date 2020/5/12 9:45
 */
public class MaxUsingGenericType {
    public static void main(String[] args) {
        MaxUsingGenericType.max("welcome","12");
    }

    private static <E extends Comparable<E>> E max(E object, E object2) {
        if(object.compareTo(object2)>0){
            return object;
        }else {
            return object2;
        }
    }
}
