/**
 * HJ7.取近似值
 * 写出一个程序，接受一个正浮点数值，输出该数值的近似整数值。
 * 如果小数点后数值大于等于5,向上取整；小于5，则向下取整。
 * 输入描述:
 * 输入一个正浮点数值
 * 输出描述:
 * 输出该数值的近似整数值
 *
 * 示例1
 * 输入
 * 5.5
 * 输出
 * 6
 */
import java.util.Scanner;

public class NCHJ7 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num = scan.nextDouble();
        System.out.println((int)(num - Math.floor(num) >= 0.5 ? Math.ceil(num) : Math.floor(num)));
    }

}
