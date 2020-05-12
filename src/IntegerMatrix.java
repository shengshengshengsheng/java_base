/**
 * description:
 *
 * @author xuqiangsheng
 * @date 2020/5/12 10:42
 */
public class IntegerMatrix extends GenericMatrix<Integer>{
    @Override
    protected Integer add(Integer o1, Integer o2) {
        return o1+o2;
    }

    @Override
    protected Integer multiply(Integer o1, Integer o2) {
        return o1*o2;
    }

    @Override
    protected Integer zero() {
        return 0;
    }
}
