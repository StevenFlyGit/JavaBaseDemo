/**
 * 创建时间：2020/5/5
 * 字符串统计次数
 * @author wpf
 */

public class Class6 {
    /**
     *
     * @param s 需要统计字符的字符串
     * @return 一个长度为3的数组，0元素为有几个大写字母，1元素为有几个小写字母，2元素为有几个数字
     */
    public static int[] FindCharCount(String s) {
        int[] arr = new int[3];
        for (int i = 0; i < s.length(); i++) {
            char individualString = s.charAt(i);
            if (individualString >= 'A' && individualString <= 'Z') {
                arr[0]++;
            } else if (individualString >= 'a' && individualString <= 'z') {
                arr[1]++;
            } else if (individualString >= '0' && individualString <= '9') {
                arr[2]++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] StringCount = FindCharCount("3sd1fSDV353sdv4");
        System.out.println(StringCount[0]);
        System.out.println(StringCount[1]);
        System.out.println(StringCount[2]);
    }
}
