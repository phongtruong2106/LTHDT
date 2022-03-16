package com.truonghoaiphong2004110017.tuan5.buoi1.buoi2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.truonghoaiphong2004110017.tuan3.buoi2.bai6.ThucPham;

public class WritingObject {
    
    public static void main(String[] args)throws IOException{
        ThucPham thucPham =new ThucPham("htp.dat");


        //ghi vào 1 file cụ thể
        FileOutputStream outFile = new FileOutputStream("htp.dat");

        ObjectOutputStream objOut = new ObjectOutputStream(outFile);

        objOut.writeObject(thucPham);
        objOut.close();
    }
}
