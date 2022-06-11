import java.util.*;


public class Main3 {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        StringBuilder sbHeaderFooter = new StringBuilder();
        sbHeaderFooter.append("+");
        for (int i = 0; i < line.length(); i++){
            sbHeaderFooter.append("+");
        } 
        sbHeaderFooter.append("+");
        String headerFooter = sbHeaderFooter.toString();
        System.out.println(headerFooter);
        System.out.println("+"+ line + "+");
        System.out.println(headerFooter);
       
    }
}
