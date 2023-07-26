/**
 * 创建时间：2020/4/28
 * 方法调用
 * @author wpf
 */

public class Class2 {
	String a = "嘿嘿嘿";
	
    void MethodOne(){
		String b = this.a;
		System.out.println(b);
        System.out.println("哈哈哈");
    }

    public static void main(String[] args) {
        Class2 c = new Class2();
        c.MethodOne();
        byte a = 40;
    }
}
