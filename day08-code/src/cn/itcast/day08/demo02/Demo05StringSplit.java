package cn.itcast.day08.demo02;
/*
分隔字符串的方法：

public String split(String regex):按照参数规则，将字符串切成若干个部分。
注意事项：split方法的参数其实就是一个“正则表达式”,今后学习
今天注意，如果要按照英文句点“."进行切分，必须写“\\."（两个反斜杠）
 */
public class Demo05StringSplit {
    public static void main( String[] args ) {
        String str1 = "aaa,bbb,ccc";
        String[] array1 = str1.split(",");
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
        System.out.println("============================");

        String str2 = "aaa bbb ccc";
        String[] array2 = str2.split(" ");
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
        System.out.println("============================");

        String str3 = "XXX.YYY.ZZZ";
        String[] array3 = str3.split("\\.");
        for (int i = 0; i < array3.length; i++) {
            System.out.println(array3[i]);
        }
    }
}
