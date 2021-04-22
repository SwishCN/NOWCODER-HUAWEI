/**
 * HJ2.计算字符个数
 * 写出一个程序，接受一个由字母、数字和空格组成的字符串，和一个字母，
 * 然后输出输入字符串中该字母的出现次数。不区分大小写。
 * 输入描述:
 * 第一行输入一个由字母和数字以及空格组成的字符串，第二行输入一个字母。
 * 输出描述:
 * 输出输入字符串中含有该字符的个数。
 *
 * 示例1
 * 输入
 * ABCabc
 * A
 * 输出
 * 2
 */
import java.util.Scanner;

public class NCHJ2{

    public static void main(String[] agrs) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine().toLowerCase();
        String c = scan.next().toLowerCase();
        System.out.print(str.length() - str.replaceAll(c, "").length());
    }

}