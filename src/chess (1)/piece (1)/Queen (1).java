package com.chess.piece;
import com.chess.main.Type;

public class Queen extends Piece{

    public Queen(String color, int column ,int row){
        super(color,  column ,row);
        type = Type.Queen;
        if(color == "white"){
            image = getImage("/PieceImage/w-queen");//怎么读取啊 路径是不是怪怪的
        }
        else{
            image = getImage("/PieceImage/b-queen");//怎么读取啊 路径是不是怪怪的
        }
    }
    
}