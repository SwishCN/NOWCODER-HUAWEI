/**
 * HJ12.字符串反转
 * 接受一个只包含小写字母的字符串，然后输出该字符串反转后的字符串。（字符串长度不超过1000）
 * 输入描述:
 * 输入一行，为一个只包含小写字母的字符串。
 * 输出描述:
 * 输出该字符串反转后的字符串。
 *
 * 示例1
 * 输入
 * abcd
 * 输出
 * dcba
 */
import java.util.Scanner;

public class NCHJ12 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder str = new StringBuilder(scan.next());
        System.out.print(str.reverse());
    }

}