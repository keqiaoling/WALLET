package com.example.myapplication.utils;

import java.security.MessageDigest;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by LG on 2017/6/27.
 */

public class MD5Util {
    /**
     * Title: MD5加密 生成32位md5码
     * Description: TestDemo
     * @author lu
     * @date 2016年6月23日 下午2:36:07
     * @param inStr
     * @return 返回32位md5码
     * @throws Exception
     */
    public static String md5Encode(String inStr) throws Exception {
        MessageDigest md5 = null;
        try {
            md5 = MessageDigest.getInstance("MD5");
        } catch (Exception e) {
            System.out.println(e.toString());
            e.printStackTrace();
            return "";
        }
        byte[] byteArray = inStr.getBytes("UTF-8");
        byte[] md5Bytes = md5.digest(byteArray);
        StringBuffer hexValue = new StringBuffer();
        for (int i = 0; i < md5Bytes.length; i++) {
            int val = ((int) md5Bytes[i]) & 0xff;
            if (val < 16) {
                hexValue.append("0");
            }
            hexValue.append(Integer.toHexString(val));
        }
        return hexValue.toString();
    }
    /**
     * Title: MD5加密
     * Description: TestDemo
     * @author lu
     * @date 2016年6月23日 下午2:43:31
     * @param inStr
     * @return
     */
    public static String string2MD5(String inStr) {
        MessageDigest md5 = null;
        try {
            md5 = MessageDigest.getInstance("MD5");
        } catch (Exception e) {
            System.out.println(e.toString());
            e.printStackTrace();
            return "";
        }
        char[] charArray = inStr.toCharArray();
        byte[] byteArray = new byte[charArray.length];

        for (int i = 0; i < charArray.length; i++)
            byteArray[i] = (byte) charArray[i];
        byte[] md5Bytes = md5.digest(byteArray);
        StringBuffer hexValue = new StringBuffer();
        for (int i = 0; i < md5Bytes.length; i++) {
            int val = ((int) md5Bytes[i]) & 0xff;
            if (val < 16)
                hexValue.append("0");
            hexValue.append(Integer.toHexString(val));
        }
        return hexValue.toString();

    }

    /**
     * Title: 加密解密算法 执行一次加密，两次解密
     * Description: TestDemo
     * @author lu
     * @date 2016年6月23日 下午2:37:29
     * @param inStr
     * @return
     */
    public static String convertMD5(String inStr) {
        if(!inStr.equals("")){
            char[] a = inStr.toCharArray();
            for (int i = 0; i < a.length; i++) {
                a[i] = (char) (a[i] ^ 't');
            }
            String s = new String(a);
            return s;
        }
        return "";

    }

    public static boolean isMobile(String str) {

        if (null == str || "".equals(str)) return false;
        Pattern pattern = Pattern.compile("1[0-9]{10}");
        Matcher matcher = pattern.matcher(str);
        if (matcher.matches()) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isEmail(String email) {
        if (null == email || "".equals(email)) return false;
        //Pattern p = Pattern.compile("\\w+@(\\w+.)+[a-z]{2,3}"); //简单匹配
        Pattern p = Pattern.compile("\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*");//复杂匹配
        Matcher m = p.matcher(email);
        return m.matches();
    }

    public static String md5Decode(String str) {
        return convertMD5(convertMD5(str));
    }
}
