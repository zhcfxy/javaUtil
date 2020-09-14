package com.zhc.pactera.conference.util;

import java.util.Scanner;

public class CheckoutSFZ {
    public static void main(String[] args) {
        System.out.println("注意:前五位区号;中间8位为出生年月;后面三位随便，最后一位校验位，也是性别位,奇数女，偶数男");
        System.out.println("请输入前17位身份证信息：");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int len = s.length();
        int q[]=new int[len];
        for (int i = 0; i < len; i++) {
            int x = Integer.valueOf(s.charAt(i)) -'0';
            q[i] = x;
        }
        int w[] = {7,9,10,5,8,4,2,1,6,3,7,9,10,5,8,4,2};
        int sum=0;
        for (int i = 0;i<w.length;i++){
            sum += q[i]*w[i];
        }
        int ys= sum%11;
        char e[] = {'1','0','x','9','8','7','6','5','4','3','2'};
        System.out.println("身份证号为:"+s+e[ys]);
    }
}
