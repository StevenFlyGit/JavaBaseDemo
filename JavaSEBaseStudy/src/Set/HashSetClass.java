package Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 创建时间：2020/7/16
 * HashSet的基本使用
 * @author wpf
 */

public class HashSetClass {

    public static void main(String[] args) {
        CreateHashSet();
    }

    public static void CreateHashSet() {
        //用多态的形式创建，括号中可添加参数来规定初始容量，若不添加则初始容量为16
        //若添加两个参数则第二个参数为float类型，规定其加载因子，默认值为0.75
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>(20);
        Set<String> set3 = new HashSet<>(20,0.8f);

        //创建一个包含指定集合元素的Set，加载因子是0.75
        //参数可为list或set
        List<String> list1 = new ArrayList<>(5);
        list1.add("abc");
        list1.add("123");
        list1.add("一二三");
        list1.add("123");
        Set<String> set4 = new HashSet<>(list1);
        System.out.println("set4:"+set4);
        Set<String> set5 = new HashSet<>(set1);

        Set<String> set6 = new HashSet<>();
        System.out.println(set6.addAll(list1));
        System.out.println("a".hashCode());
    }

}
