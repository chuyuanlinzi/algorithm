/**
 * 冒泡排序
 * Created by weilinzi on 17/4/20.
 */
public class BubbleSort {
    /**
     * 冒泡排序(默认升序)
     * 实现思路:循环取出数组的每个元素,比较相邻元素,如果大于则交换位置,一轮循环过后,确定一个元素的位置,直至所有元素位置确认完
     * 时间复杂度分析:其外层循环执行N - 1次,内层循环最多的时候执行N - 1次，最少的时候执行1次，平均执行 (N - 1 + 1)/2次,所以,(N - 1)(N) / 2 = (N^2 - 1)/2（其中N^2是仿照Latex中的记法，表示N的平方）,按照计算复杂度的原则，去掉常数，去掉最高项系数，其复杂度为O(N^2)
     * 时间复杂度:O(数组长度的平方)
     * @param param 数组
     * @return 返回数组
     */
    public static int[] bubbleSort(int [] param){

        // 校验数组长度
        int len = param.length;
        if (len == 0) {
            return null;
        }

        /**
         * 循环取出数组的每个元素,比较相邻元素,如果大于则交换位置,一轮循环过后,确定一个元素的位置,直至所有元素位置确认完
         */

        for (int i = 0, j = len - 1; i < j; i++) {// 循环取出数组的每个元素
            // 内层循环是否有交换位置,默认为未交换
            boolean flag = true;
            for (int k = 0; k < j - i; k++) {// 比较相邻元素,如果大于则交换位置
                if (param[k] > param[k + 1]) {
                    // 对调位置
                    int temp;
                    temp = param[k + 1];
                    param[k + 1] = param[k];
                    param[k] = temp;
                    flag = false;
                }
            }
            if (flag) {// 内层循环没有交换位置,说明已经排序完成,退出循环
                break;
            }
        }

        return param;
    }

    public static void main(String[] args) {
        int[] param = {2, 1, 34, 5, 4, 3, 1, 6, 7, 10, 23, 4, 5, 90, 100, 23, 20};
        int [] resulet = bubbleSort(param);
        System.out.printf("升序排列:");
        for (int i = 0, j = resulet.length; i < j; i++) {
            System.out.print(resulet[i] + ",");
        }
    }
}
