package com.truonghoaiphong2004110017.tuan3.buoi1;

public class IntSquare {
    //implenmentation
   private int squareValue;

  /*  //interface
    int getSquareOperator(int value){
      squareValue =(int)Math.pow(value, 2);
        return squareValue;
    }*/

    //solution

    //interface
    int getSquare(int value){
        this.squareValue = this.calculateSquare(value);
        return this.squareValue;
    }

    //implenmenttation
    private int calculateSquare(int value){
     return (int)Math.pow(value, 2);
    }
}
