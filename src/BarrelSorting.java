/**
 * 木桶排序
 * Created by weilinzi on 17/4/20.
 */
public class BarrelSorting {

    /**
     * 木桶排序
     * 实现思路:待排序数组中每个元素放入对应下标的"木桶"(数组)中
     * 时间复杂度:O(待排序数组元素数量+木桶数量)
     * @param param int数组入参
     * @return 排序完的double数组
     */
    public static int[] barrelSorting(int[] param) {

        /**
         * 根据需要排序数组中最大值,来确定"木桶"数量
         */
        if (param.length == 0) {
            return null;
        }

        // 木桶数量
        int barrelLength = 0;
        for (int i = 0, j = param.length; i < j; i++) {
            if (param[i] > barrelLength) {
                barrelLength = param[i];
            }
        }
        int[] barrel = new int[barrelLength + 1];

        /**
         * 排序逻辑:
         * 入参的每个元素放入对应下标的"木桶"中
         */
        for (int i = 0, j = param.length; i < j; i++) {
            barrel[param[i]]++;
        }

        return barrel;
    }

    public static void main(String[] args) {
        int[] param = {2, 1, 34, 5, 4, 3, 1, 6, 7, 10, 23, 4, 5, 90, 100, 23, 20};
        int [] resulet = barrelSorting(param);
        System.out.printf("升序排列:");
        for (int i = 0, j = resulet.length; i < j; i++) {
            if (resulet[i] > 0) {
                for (int k = 0; k < resulet[i]; k++) {
                    System.out.print(i + ",");
                }
            }
        }
    }
}
