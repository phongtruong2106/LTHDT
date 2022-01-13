package com.truonghoaiphong2004110017.tuan2.Student;

public class Student {
    String Name;
    double age;
    String Mssv;
    String Class;
    void Student(){

    }


    void hoc(){
        System.out.println(Name + " học");
    }

   void doc(){
        System.out.println(Name + " đọc sách");
    }

   void thi(){
       System.out.println(Name + " thi");
    }
   void hoatDongNgoaiKhoa(){
       System.out.println(Name + " hoạt động ngoại khóa");
   }

   void print(){
       System.out.println("tên : " + Name);
       System.out.println("tuổi : " + age);
       System.out.println("mssv : " + Mssv);
   }
}
