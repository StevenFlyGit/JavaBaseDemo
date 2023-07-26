import java.util.ArrayList;

/**
 * 创建时间：2020/5/7
 * 测试ArrayList的方法
 * @author wpf
 */

public class Class8 {

    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        array.add("a");
        array.add("b");
        array.add("c");
        array.remove(1);
        System.out.println(array.get(1));
    }
}
