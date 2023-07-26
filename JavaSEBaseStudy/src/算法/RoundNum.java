package 算法;

import java.util.*;

/**
 * 创建时间：2021/1/24
 *
 * @author wpf
 */

public class RoundNum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if (input<=1 || input >= 100) {
            System.out.println("ERROR!");
            return;
        }

        Map<Integer, Boolean> map = new HashMap<>();
        for (int i = 1; i <= 100; i++) {
            map.put(i, true);
        }

        int num = 0;
        int times = 0;
        int total = 100;
        while (num < 100) {
            num++;

            if (map.get(num) == true) {
                times++;
            }

            if (times == input) {
                times = 0;
                map.put(num, false);
                total--;
            }

            if (total < input) {
                break;
            }

            if (num == 100) {
                num = 0;
            }
        }

        List<Integer> result = new ArrayList();

        map.forEach((k, v) -> {

            if (v.equals(true)) {
                result.add(k);
            }

        });

        for (Integer integer : result) {
            System.out.print(integer + ",");
        }

    }

}
