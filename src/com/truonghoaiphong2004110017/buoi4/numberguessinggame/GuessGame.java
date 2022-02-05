package com.truonghoaiphong2004110017.buoi4.numberguessinggame;

public class GuessGame {
    //p1
    //p2
    //p3
    player p1;
    player p2;
    player p3;
    //startGame
    public void startGame(){
        //tạo 3 đối tượng , gán 3 biến thực thể
        p1 = new player();
        p2 = new player();
        p3 = new player();

        //khai báo 3 biến 
        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;
        //khai báo 3 biến để lưu true/falsetùy theo câu trả lời 
        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;
        //sinh một số để người chơi đoaán 
        int targetNumber = (int) (Math.random() * 10);
        System.out.println("I'm thinking of a number between 0 and 9.......");
        while(true){
            System.out.println("Number to guess is " + targetNumber);

            //gọi phương thức guess
            p1.guess();
            p2.guess();
            p3.guess();
            ///lấy kết quả đoán của từng đối  thủ
            guessp1 = p1.number;
            System.out.println("người chơi 1 đoán: " + guessp1);
            guessp2 = p2.number;
            System.out.println("người chơi 2 đoán: " + guessp2);
            guessp3 = p3.number;
            System.out.println("người chơi 3 đoán: " + guessp3);

            //kiểm tra từng ngươi chơi , nếu đúng sẽ đặt biến của người đó về true(mặc định là false)
            if(guessp1 == targetNumber){
                p1isRight = true;
            }
            if(guessp2 == targetNumber){
                p2isRight = true;
            }
            if(guessp3 == targetNumber){
                p3isRight = true;
            }

            //nếu có ít nhất có 1 người đoán đúng(|| là toán tử hoặc)
            if(p1isRight || p2isRight || p3isRight){
                System.out.println("chúng ta có một người chiến thắng!");
                System.out.println("người chơi 1 đúng ?" + p1isRight);
                System.out.println("người chơi 2 đúng ?" + p2isRight);
                System.out.println("người chơi 3 đúng ?" + p3isRight);
                System.out.println("game is over");
                break;
            }
            else{
                System.out.println("người chơi phải thử lại");
            }
        }

    }
}
