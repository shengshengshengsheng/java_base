import java.util.ArrayList;

/**
 * description:
 *
 * @author xuqiangsheng
 * @date 2020/5/12 17:49
 */
public class TestCollection {
    public static void main(String[] args) {
        ArrayList<String> collection1=new ArrayList<>();
        collection1.add("new york");
        collection1.add("atlanta");
        collection1.add("dallas");
        collection1.add("madison");
        System.out.println("a list of city is");
        System.out.println(collection1);
        System.out.println(collection1.contains("new york"));
        collection1.remove("new york");
    }
}
