package baseball.service;

import nextstep.utils.Console;

public class Baseball {
    //위치가 마음에 안드네
    private final String answerNumber = GenerateNumber.getRandomNumber();

    public void playGames(){
        //입력을 받고 결과를 주는곳은 다른 클래스가 필요

        while(true){
            System.out.print("숫자를 입력해주세요:");
            String s = Console.readLine();
            if(!InputCheck.isDigitNumber(s)) {
                //수정필요
                System.out.println("ERROR");
                continue;
            }
        }
    }


}
