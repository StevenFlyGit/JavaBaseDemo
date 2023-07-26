package 算法;

import java.util.Arrays;
import java.util.Random;

/**
 * 创建时间：2021/1/23
 * 排序算法总结+
 * @author wpf
 */

public class SortAlgorithm {

    public static void main(String[] args) {

        Random r = new Random();
        int[] array = new int[10000];
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(10000);
        }
        System.out.println("排序前的数组：" + Arrays.toString(array));
        long beforeSort = System.currentTimeMillis();
//        bubbleSort(array, true);
//        selectSort(array, false);
        quickSort(array, 0, array.length - 1, false);
        long afterSort = System.currentTimeMillis();
        System.out.println("排序所用时间：" + (afterSort - beforeSort));
        System.out.println("排序后的数组：" + Arrays.toString(array));
    }

    /**
     * 冒泡排序
     * @param oldArray 排序前的数组
     * @param sortRule 排序规则，true代表从小到大，false代表从大到小
     * @return 排序后的数组
     */
    public static void bubbleSort(int[] oldArray, boolean sortRule) {

        for (int i = 0; i < oldArray.length - 1; i++) {
            for (int j = 0; j < oldArray.length - 1 - i; j++) {
                if (sortRule) {
                    if (oldArray[j] > oldArray[j+1]) {
                        int temp = oldArray[j];
                        oldArray[j] = oldArray[j + 1];
                        oldArray[j + 1] = temp;
                    }
                } else {
                    if (oldArray[j] < oldArray[j+1]) {
                        int temp = oldArray[j];
                        oldArray[j] = oldArray[j + 1];
                        oldArray[j + 1] = temp;
                    }
                }
            }
        }

    }

    /**
     * 选择排序
     * @param oldArray 排序前的数组
     * @param sortRule 排序规则，true代表从小到大，false代表从大到小
     * @return 排序后的数组
     */
    public static void selectSort(int[] oldArray, boolean sortRule) {
        for (int i = 0; i < oldArray.length; i++) {
            for (int j = i + 1; j < oldArray.length; j++) {
                if (sortRule) {
                    if (oldArray[j] < oldArray[i]) {
                        int temp = oldArray[j];
                        oldArray[j] = oldArray[i];
                        oldArray[i] = temp;
                    }
                } else {
                    if (oldArray[j] > oldArray[i]) {
                        int temp = oldArray[j];
                        oldArray[j] = oldArray[i];
                        oldArray[i] = temp;
                    }
                }
            }
        }
    }


    /**
     * 快速排序
     * @param oldArray 排序前的数组
     * @param left 需要排序区间的左边位
     * @param right 需要排序区间的右边位
     * @param sortRule 排序规则，true代表从小到大，false代表从大到小
     */
    public static void quickSort(int[] oldArray, int left, int right, boolean sortRule) {
        if (left > right) {
            return;
        }

        int base = oldArray[left];
        int l = left, r = right;

        while (l != r) {
            if (sortRule) {
                while (r > l && oldArray[r] >= base) {
                    r--;
                }

                while (r > l && oldArray[l] <= base) {
                    l++;
                }

                if (l < r) {
                    int temp = oldArray[l];
                    oldArray[l] = oldArray[r];
                    oldArray[r] = temp;
                }
            } else {
                while (r > l && oldArray[r] <= base) {
                    r--;
                }

                while (r > l && oldArray[l] >= base) {
                    l++;
                }

                if (l < r) {
                    int temp = oldArray[l];
                    oldArray[l] = oldArray[r];
                    oldArray[r] = temp;
                }
            }
        }

        //更换基准数
        oldArray[left] = oldArray[l];
        oldArray[l] = base;

//        System.out.println("此次排序完：" + Arrays.toString(oldArray));

        //再计算基准数左边和右边的情况(递归调用)
        quickSort(oldArray, left, l - 1, sortRule);
        quickSort(oldArray, l + 1, right, sortRule);

    }

}
