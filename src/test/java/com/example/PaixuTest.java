package com.example;

import org.junit.Test;

/**
 * @Description: 几种排序的实现
 * @Author: yazhou.feng
 * @CreateDate: 2019/2/26 10:44
 * @UpdateDate: 2019/2/26 10:44
 * @UpdateRemark:
 * @Version: 1.0
 */
public class PaixuTest {
    //冒泡排序
    @Test
    public void bubbleSort01() {
        Integer[] numbers = {1, 7, 8, 4, 3, 9};
        //        int temp; // 记录临时中间值
//        int sizeone = numbers.length; // 数组大小
//        for (int i = 0; i < sizeone - 1; i++) {
//            for (int j = i + 1; j < sizeone; j++) {
//                if (numbers[i] < numbers[j]) { // 交换两数的位置
//
//                    temp = numbers[i];
//                    numbers[i] = numbers[j];
//                    numbers[j] = temp;
//                }
//            }
//        }
//        for(int aa : numbers)
//                System.out.print(aa+",");
//            System.out.println();
//        }
        Integer[] a = {1, 7, 8, 4, 3, 9};
        int temp;
        int size = a.length;
        for (int i = 1; i < size; i++) {
            for (int j = 0; j < size - i; j++) {
                if (a[j] < a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
            for (int aa : a)
                System.out.print(aa + ",");
            System.out.println();
        }

    }
    /**
     * 快速排序
     *
     *  从数列中挑出一个元素，称为“基准”
     *  重新排序数列，所有元素比基准值小的摆放在基准前面，所有元素比基准值大的摆在基准的后面（相同的数可以到任一边）。在这个分割之后，
     *  该基准是它的最后位置。这个称为分割（partition）操作。
     *  递归地把小于基准值元素的子数列和大于基准值元素的子数列排序。
     *
     * @param numbers
     * @param start
     * @param end
     */
    @Test
    public void quickSort(){

    }
}

