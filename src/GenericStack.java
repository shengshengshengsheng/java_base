import java.util.ArrayList;

/**
 * description:
 *
 * @author xuqiangsheng
 * @date 2020/5/12 9:04
 */
public class GenericStack<E> {
    private ArrayList<E> list=new ArrayList<>();
    public int getSize(){
        return list.size();
    }
    public E pop(){
        E out=list.get(getSize()-1);
        list.remove(getSize()-1);
        return out;
    }
    public E peek(){
        return list.get(getSize()-1);
    }
    public void push(E e){
        list.add(e);
    }
    public boolean isEmpty(){
        return list.isEmpty();
    }
    @Override
    public String toString() {
        return "GenericStack{" +
                "list=" + list +
                '}';
    }
}
