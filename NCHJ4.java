/**
 * HJ4.字符串分隔
 * •连续输入字符串，请按长度为8拆分每个字符串后输出到新的字符串数组；
 * •长度不是8整数倍的字符串请在后面补数字0，空字符串不处理。
 * 输入描述:
 * 连续输入字符串(输入多次,每个字符串长度小于100)
 * 输出描述:
 * 输出到长度为8的新字符串数组
 *
 * 示例1
 * 输入
 * abc
 * 123456789
 * 输出
 * abc00000
 * 12345678
 * 90000000
 */
import java.util.*;

public class NCHJ4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            StringBuilder str = new StringBuilder(scan.nextLine());

            if (str.length() % 8 != 0) {
                str.append("00000000");
            }

            while (str.length() >= 8) {
                System.out.println(str.substring(0, 8));
                str.delete(0, 8);
            }

        }

    }

}
