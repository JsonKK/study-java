package org.apache.basic;

import java.io.*;

public class DemoFindFile {
    public static void main(String[] args) {

        File file = new File("F:/company-object/lw-zchina-web/src");
        String keyword1 = "../common/header";
        String keyword2 = "../common/footer";
        check(file, keyword1, keyword2);
    }

    public static void check(File file, String keyword1, String keyword2) {
        if (file == null) {
            return;
        }
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File f : files) {
                if (f.isDirectory()) {
                    check(f, keyword1, keyword2);
                    continue;
                }


                //System.out.println(getContent(f));
                String content = getContent(f);

                if (content.contains(keyword1)) {
                    if (content.contains(keyword2)) {

                    }else{
                        System.out.println("文件名称：" + f.getName());
                    }
                }

            }
        }

    }

    public static String getContent(File file) {
        if (file == null) {
            return "";
        }
        FileInputStream fis = null;
        InputStreamReader isr = null;
//        BufferedReader br = null;
        StringBuffer sb = new StringBuffer();
        try {
            fis = new FileInputStream(file);
            isr = new InputStreamReader(fis);
//            br = new BufferedReader(isr);
            char[] ch=new char[1024];
            while (isr.read(ch) != -1) {
                sb.append(ch);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
//            if (br != null) {
//                try {
//                    br.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
            if (isr != null) {
                try {
                    isr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return sb.toString();
    }


}
