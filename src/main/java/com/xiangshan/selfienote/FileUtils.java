package com.xiangshan.selfienote;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileUtils {

    //删除文件
    public static boolean deleteFile(String path){
        Boolean flag = false;
        File file = new File(path);
        if(file.isFile() && file.exists()){
            file.delete();
            flag = true;
        }
        return flag;
    }

    //删除文件夹
    public static boolean deleteDirectory(String path){
        //如果path不以文件分隔符结尾，自动添加文件分隔符
        if(!path.endsWith(File.separator)){
            path = path + File.separator;
        }
        File folder = new File(path);

        if(!folder.exists() || !folder.isDirectory()){
            return false;
        }
        Boolean flag = true;

        //删除文件夹下所有的文件
        File[] files = folder.listFiles();
        for(int i = 0;i < files.length;i++){
            //删除子文件
            if(files[i].isFile()){
                flag = deleteFile(files[i].getAbsolutePath());
                if(!flag){
                    System.out.println("删除文件夹下的文件失败");
                    break;
                }
            }
        }

        if(!flag)
            return false;

        //删除当前目录
        if(folder.delete()){
            return true;
        }
        else {
            return false;
        }
    }

    public static void copyFile(File fromFile, File toFile) throws IOException {
        FileInputStream ins = new FileInputStream(fromFile);
        FileOutputStream out = new FileOutputStream(toFile);
        byte[] b = new byte[1024];
        int n = 0;
        while((n=ins.read(b))!=-1){
            out.write(b, 0, n);
        }

        ins.close();
        out.close();
    }
}
