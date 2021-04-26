/**
 * HJ76.尼科彻斯定理
 * 验证尼科彻斯定理，即：任何一个整数m的立方都可以写成m个连续奇数之和。
 * 例如：
 * 1^3=1
 * 2^3=3+5
 * 3^3=7+9+11
 * 4^3=13+15+17+19
 * 输入一个正整数m（m≤100），将m的立方写成m个连续奇数之和的形式输出。
 * 本题含有多组输入数据。
 * 输入描述:
 * 输入一个int整数
 * 输出描述:
 * 输出分解后的string
 *
 * 示例1
 * 输入
 * 6
 * 输出
 * 31+33+35+37+39+41
 */
import java.util.Scanner;

public class NCHJ76 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            int m = scan.nextInt();
            int first = (int)Math.pow(m,2) - m + 1;
            int i = 0;

            for (int j = 0; j < m - 1; i = i + 2, j++) {
                System.out.print(first + i + "+");
            }

            System.out.println(first + i);
        }

    }

}
