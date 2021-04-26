/**
 * HJ84.统计大写字母个数
 * 找出给定字符串中大写字符(即'A'-'Z')的个数。
 * 输入描述:
 * 本题含有多组样例输入
 * 对于每组样例，输入一行，代表待统计的字符串
 * 输出描述:
 * 对于每组样例，输出一个整数，代表字符串中大写字母的个数
 *
 * 示例1
 * 输入
 * add123#$%#%#O
 * 150175017(&^%&$vabovbao
 * 输出
 * 1
 * 0
 */
import java.util.Scanner;

public class NCHJ84 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            String str = scan.nextLine();
            int c = 0;

            for (int i= 0; i < str.length(); i++) {

                if (Character.isUpperCase(str.charAt(i))) {
                    c++;
                }

            }

            System.out.println(c);
        }

    }

}