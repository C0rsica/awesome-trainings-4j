package srhang.util;

/**
 * �ַ���������
 * @author Bryant Hang
 *
 */
public class StringUtil { 

    public static void main(String [] args){ 
        String str="�Ұ��������Ұ��������Ұ��������Ұ��������Ұ�������tbsctbs��"; 
        String str1="sdfdssfsfdsf��dsdafdafafdsfadas"; 
        System.out.println(MySubstring(str, 14)); 
        System.out.println(MySubstring(str1, 14)); 
    } 
    /* 
     * �ж�һ���ַ���Ascill�ַ����������ַ����纺���գ������ַ��� 
     */ 
    public static boolean isLetter(char c) { 
        int k = 0x80; 
        return c / k == 0 ? true : false; 
    } 

      /** 
     * �õ�һ���ַ����ĳ���,��ʾ�ĳ���,һ�����ֻ��պ��ĳ���Ϊ2,Ӣ���ַ�����Ϊ1 
     * 
     * @param String 
     *            s ,��Ҫ�õ����ȵ��ַ��� 
     * @return int, �õ����ַ������� 
     */ 
    public static int length(String s) { 
        if (s == null) 
            return 0; 
        char[] c = s.toCharArray(); 
        int len = 0; 
        for (int i = 0; i < c.length; i++) { 
            len++; 
            if (!isLetter(c[i])) { 
                len++; 
            } 
        } 
        return len; 
    } 
     /** 
     * ��ȡһ���ַ��ĳ���,��������Ӣ��,������ֲ����ã�����ȡһ���ַ�λ 
     * 
     * @author patriotlml 
     * @param String 
     *            origin, ԭʼ�ַ��� 
     * @param int 
     *            len, ��ȡ����(һ�����ֳ��Ȱ�2���) 
     * @return String, ���ص��ַ��� 
     */ 
    public static String MySubstring(String origin, int len) { 
        if (origin == null || origin.equals("")||len<1) 
            return ""; 
        byte[] strByte = new byte[len]; 
        if (len > length(origin)){ 
            return origin;} 
        System.arraycopy(origin.getBytes(), 0, strByte, 0, len); 
        int count = 0; 
        for (int i = 0; i < len; i++) { 
            int value = (int) strByte[i]; 
            if (value < 0) { 
                count++; 
            } 
        } 
        if (count % 2 != 0) { 
            len = (len == 1) ? ++len : --len; 
        } 
        return new String(strByte, 0, len); 
    } 
} 