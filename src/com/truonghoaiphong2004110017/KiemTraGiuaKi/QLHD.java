package com.truonghoaiphong2004110017.KiemTraGiuaKi;

import java.util.Scanner;



public class QLHD {
    public static void main(String[] args) {
        listHD lHd = new listHD();
        Scanner sc = new Scanner(System.in);
        int x;

        do {
            System.out.println("\t\t0.  thoat \t\t\t\t |");
            System.out.println("\t\t1.  them hoa don theo gio \t\t\t |");
            System.out.println("\t\t2.  them hoa don theo ngay \t\t\t\t |");
            System.out.println("\t\t3.  hien thi  \t\t\t\t |");
            System.out.println("\t\t4.  xem tong cac phong theo don \t\t\t\t |");
            x =sc.nextInt();
            switch(x){
                case 1:
                     lHd.themHD(1);
                     break;
                    case 2:
                    lHd.themHD(2);
                    break;
                    case 3: 
                    lHd.HienThiHD();
                    break;
                    case 4:
                    lHd.tongSL();
                    break;

            }
        }while(x!=0);
        System.out.println("");
    }
}
