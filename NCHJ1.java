/**
 * HJ1.字符串最后一个单词的长度
 * 计算字符串最后一个单词的长度，单词以空格隔开。
 * 输入描述:
 * 输入一行，代表要计算的字符串，非空，长度小于5000。
 * 输出描述:
 * 输出一个整数，表示输入字符串最后一个单词的长度。
 *
 * 示例1
 * 输入
 * hello nowcoder
 * 输出
 * 8
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String oldStr = scan.nextLine();
        String[] newStrArray = oldStr.split(" ");
        System.out.print(newStrArray[newStrArray.length - 1].length());
    }

}