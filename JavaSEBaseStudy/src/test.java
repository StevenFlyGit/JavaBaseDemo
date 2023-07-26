
import java.io.UnsupportedEncodingException;
import java.util.*;

public class test {

    public static void StringLink(String a, String b) {
        System.out.println("a" + "b");
    }

    public static void IntAdd(String a, String b) {
        try {
            int inta = Integer.valueOf(a);
            int intb = Integer.valueOf(b);
            System.out.println(inta + intb);
        } catch (NumberFormatException e) {
            System.out.println("输入格式有误！");
        }
    }

    public static void FloatAdd(String a, String b) {
        try {
            float floata = Float.parseFloat(a);
            float floatb = Float.parseFloat(b);
            System.out.println(floata + floatb);
        } catch (NumberFormatException e) {
            System.out.println("输入格式有误！");
        }
    }

    public static void changeStringtoBytes() throws UnsupportedEncodingException {
        String str = "我真帅";
        StringBuilder sb = new StringBuilder();

        byte [] bs = str.getBytes("UTF-8");
        sb.append("{");
        for(int i=0; i<bs.length; i++) {
            if(i == bs.length-1) {
                sb.append(bs[i]);
            } else {
                sb.append(bs[i]).append(", ");
            }
        }
        sb.append("}");
        String s = sb.toString();
        System.out.println(s);
    }

    public static void main(String[] args){
        System.out.println("012".matches("\\d{3}"));
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
    }
}
