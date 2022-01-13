package com.truonghoaiphong2004110017.tuan2.Student;

public class StudenTestDrive {
    public static void main(String[] args) {
        Student taistudent = new Student();
         taistudent.Name = "lâm vũ thành tài";
         taistudent.age = 18;
         taistudent.Mssv = "016";
         taistudent.Class = "K14DCPM02";
         taistudent.print();
         taistudent.hoc();
         taistudent.doc();
         taistudent.hoatDongNgoaiKhoa();
         System.out.println("_________");
  

         Student thachsStudent = new Student();
         thachsStudent.Name = "lê hoàng thạch";
         thachsStudent.age = 18;
         thachsStudent.Mssv = "006";
         thachsStudent.Class = "K14DCPM02";
         thachsStudent.print();
         thachsStudent.hoc();
         thachsStudent.doc();
         thachsStudent.hoatDongNgoaiKhoa();
         System.out.println("__________");


         Student trungStudent = new Student();
         trungStudent.Name = "bùi quang trung";
         trungStudent.age = 19;
         trungStudent.Mssv = "012";
         trungStudent.Class = "K14DCPM02";
         trungStudent.print();
         trungStudent.hoc();
         trungStudent.doc();
         trungStudent.hoatDongNgoaiKhoa();
  

    }
}
