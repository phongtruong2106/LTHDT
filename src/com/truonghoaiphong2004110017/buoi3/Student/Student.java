package com.truonghoaiphong2004110017.buoi3.Student;

public class Student {
    String Name;
    double age;
    String Mssv;
    String Class;
    
    public Student(String Name, double age){
        this.Name = Name;
        this.age = age;
    }

    public Student(String Name, double age, String Mssv, String Class){
        this(Name, age);
        this.Mssv = Mssv;
        this.Class = Class;
    }

    void hoc(){
        System.out.println(Name + " học");
        this.thi();
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
