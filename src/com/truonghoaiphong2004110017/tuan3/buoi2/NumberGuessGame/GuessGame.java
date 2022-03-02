package com.truonghoaiphong2004110017.tuan3.buoi2.NumberGuessGame;

public class GuessGame {
    //attribute - data
    //implementation
    private Player p1;
    private Player p2;
    private Player p3;

    //method - fuction
    public void starGame(){
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();
        int guess1 = 0;
        int guess2 = 0;
        int guess3 = 0;
        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;
        int targetNumber = (int) (Math.random() * 10);
        System.out.println("tôi đang nghĩ một số từ 0 đến 9... ");
        while(true){
            System.out.println("số để đoán là " + targetNumber);

            p1.guess();
            p2.guess();
            p3.guess();

            guess1 = p1.getNumber();//chưa có encapsulation
            //p1.number = 3;//sự cố chưa có encapsulation
            System.out.println("người chơi 1 đoán: " + guess1);
            guess2 = p2.getNumber();
            System.out.println("người chơi 2 đoán: " + guess2);
            guess3 = p3.getNumber();
            System.out.println("gười chơi 3 đoán: " + guess3);

            if(guess1 == targetNumber){
                p1isRight = true;
            }
            if(guess2 == targetNumber){
                p2isRight = true;
            }
            if(guess3 == targetNumber){
                p3isRight = true;
            }
            //p1isRight == true
            if(p1isRight || p2isRight || p3isRight){
                System.out.println("chúng ta đã có người chiến thắng! ");
                System.out.println("Player one got it right?" + p1isRight);
                System.out.println("Player two got it right?" + p2isRight);
                System.out.println(" Player three got it right?" + p3isRight);
                System.out.println("trò chơi kết thúc!!");
                break;
            }else{
                System.out.println("Player will have try again");
            }
        }
    }
}
