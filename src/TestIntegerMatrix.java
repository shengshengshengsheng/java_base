/**
 * description:
 *
 * @author xuqiangsheng
 * @date 2020/5/12 10:53
 */
public class TestIntegerMatrix {
    public static void main(String[] args) {
        Integer[][] m1=new Integer[][]{{1,2,3},{4,5,6},{1,1,1}};
        Integer[][] m2=new Integer[][]{{1,1,1},{2,2,2},{0,0,0}};
        IntegerMatrix integerMatrix=new IntegerMatrix();
        IntegerMatrix.printResult(m1,m2,integerMatrix.addMatrix(m1,m2), '+');
        IntegerMatrix.printResult(m1,m2,integerMatrix.multiplyMatrix(m1,m2), '*');
    }
}
