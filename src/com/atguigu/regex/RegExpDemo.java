package com.atguigu.regex;

import java.util.Arrays;

/**
 * 正则表达式：Regular Expression
 * <p>
 * Pattern 表示正则表达式，经过编译得到正则表达式
 * Matcher 匹配器
 * <p>
 * ------------------- <p>
 * java中两个反斜杠 \\ 才代表正则中的一个反斜杠
 * java在字符串提供了四个方法，直接支持正则表达式
 * matches
 * replaceAll
 * replaceFirst
 * split
 * <p>
 * ------------------ <p>
 * 正则语法：
 * [ab] a 或 b
 * [a-z] 所有小写字母
 * [a-zA-Z] 所有字母
 * [a-zA-Z0-9_] 数字字母下划线  等价于<=> 单词字符串 \w  word
 * [^ab] 既不是a也不是b
 * \W  等价于<=>  [^\w] 非单词字符串, 一般大写表示 非
 * \d  d:digital  [0-9]
 * \D  非数字
 * \s  s:space 空白字符：包括 \r \n \t 空格
 * .   任意字符串，除了：\r \n
 * \.  表示真正的点
 *
 * ^开头  $结尾   其它地方有用，但java中用不上。
 * <p>
 * ---------------- <p>
 * 量词：
 * a{n} 正好n个a
 * a{2,} >=2个a
 * a{2,5} 2-5个a
 * a+  >=1个a
 * a*  >=0个a
 * a?  0个或1个a
 * <p>
 * abc|d  abc或d
 * ab(c|d) c或d
 *
 * \1 取第一组
 * $1 替换第一组
 */
public class RegExpDemo {

    public static void main(String[] args) {
        //电话号码
        String s1 = "18603071634";
        boolean b = s1.matches("1[3-9]\\d{9}");
        System.out.println(b);
        //邮箱
        String s2 = "abc@qq.com";
        boolean b1 = s2.matches("\\w{3,15}@\\w+\\.(com|cn|org|edu|com\\.cn)");
        System.out.println(b1);
        //正则替换
        String s3 = "abcd827kjglk8745jjkdg728y";
        System.out.println(s3.replaceAll("\\d+", ""));
        System.out.println(s3.replaceFirst("\\d+", ""));
        //叠词替换
        String s4 = "我我我今今今天要要要去去洗脚";
        System.out.println(s4.replaceAll("(.)\\1+", "$1"));

        //split切割
        //切割的时候，中间和前面的空字符串保留，末尾的忽略
        String s5 = "aa123bb22cc333abc";
        String[] data1 = s5.split("\\D");
        System.out.println(Arrays.toString(data1));
        //IP地址
        String ip = "192.168.1.2";
        String[] data2 = ip.split("\\.");
        System.out.println(Arrays.toString(data2));

    }
}
