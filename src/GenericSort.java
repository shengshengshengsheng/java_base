/**
 * description:
 *
 * @author xuqiangsheng
 * @date 2020/5/12 9:23
 */
public class GenericSort {
    public static void main(String[] args) {
        Integer[] integers={1,3,5,8,11,4,5};
        String[] strings={"hello","world","bug","what"};
        Character[] characters={'a','e','i','o','u','b'};
        Double[] doubles={10.1,2.1,-5.0,1.22};
        int[] ints={1,2,5,7,-5};
        sortArray(integers);
        sortArray(strings);
        sortArray(characters);
        sortArray(doubles);
        System.out.println("integers");
        print(integers);
        System.out.println("strings");
        print(strings);
        System.out.println("characters");
        print(characters);
        System.out.println("doubles");
        print(doubles);
    }

    private static <E extends Comparable<E>> void sortArray(E[] integers) {
        for (int i = 0; i < integers.length-1; i++) {
            E currentMax=integers[i];
            int currentMaxIndex=i;
            for (int j = i+1; j < integers.length; j++) {
                if(integers[j].compareTo(integers[currentMaxIndex])>0){
                    currentMaxIndex=j;
                    currentMax=integers[j];
                }
            }
            if(currentMaxIndex!=i){
                integers[currentMaxIndex]=integers[i];
                integers[i]=currentMax;
            }
        }
    }
    private static <E> void print(E[] integers) {
        for (int i = 0; i < integers.length; i++) {
            System.out.print(integers[i]+" ");
        }
    }
}
