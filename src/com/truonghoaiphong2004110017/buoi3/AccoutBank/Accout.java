package com.truonghoaiphong2004110017.buoi3.AccoutBank;

public class Accout {
    int acc_number;
    int acc_balance;
    int amount;
    String nameCusomer;
    String Address;
    String nameEmloyee;
    int salary;

    public Accout(int acc_number, int acc_balance){
        this.acc_number = acc_number;
        this.acc_balance = acc_balance;
    }

    public Accout(String nameCusomer, String Address, int acc_number, int acc_balance){
        this(acc_number, acc_balance);
        this.nameCusomer = nameCusomer;
        this.Address = Address;   
    }

    public Accout(String nameEmloyee, int salary, int acc_number, int acc_balance){
        this(acc_number, acc_balance);
        this.nameEmloyee = nameEmloyee;
        this.salary = salary;
    }

    void deposit(int amount){
        acc_balance += amount;
        this.printC();
    }

    void withdraw(int amount){
        acc_balance -= amount;
        this.printC();
    }

    void luongthangnay(){
        acc_balance += salary;
    }

    void printC(){
        System.out.println("tên khách hàng: " + nameCusomer + " \n địa chỉ: " + Address + " \n stk: " + acc_number + " \n sdtk : " + acc_balance);
    }
    
    void printE(){
        System.out.println("tên nhân viên: " + nameEmloyee + " \n lương: " +  salary+ " \n stk: " + acc_number + " \n sdtk : " + acc_balance);
    }

}
