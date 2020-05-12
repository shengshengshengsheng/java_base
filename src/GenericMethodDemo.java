/**
 * description:
 *
 * @author xuqiangsheng
 * @date 2020/5/12 9:15
 */
public class GenericMethodDemo {
    public static void main(String[] args) {
        Integer[] integers={1,2,3,4,5};
        String[] strings={"hello","world","nihao"};
        GenericMethodDemo.print(integers);
        GenericMethodDemo.print(strings);
    }

    private static <E> void print(E[] strings) {
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]+" ");
        }
    }
}
