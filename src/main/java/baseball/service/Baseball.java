package baseball.service;

import nextstep.utils.Console;

public class Baseball {
    //게임 기능 생성
    private GameProcess gameProcess = new GameProcess();
    private String answerString;
    private String continueValue;

    public void playGames(){
        //입력을 받고 결과를 주는곳은 다른 클래스가 필요
        String answerNumber = GenerateNumber.getRandomNumber();
        while(continueValue != "2"){
            System.out.print("숫자를 입력해주세요:");
            String s = Console.readLine();

            //--------이부분 수정 로직 필요
//            if(!InputCheck.isDigitNumber(s)) {
//                //수정필요
//                System.out.println("ERROR");
//                continue;
//            }
            //------------------------
            answerString = gameProcess.process(s, answerNumber);
            System.out.println(answerString);
            successProcess(answerString);

        }
    }

    public void successProcess(String answerString){
        if(!"3스트라이크".equals(answerString)){
            return;
        }
        System.out.println("3개 숫자를 모두 맞히셨습니다. 게임 끝!");
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        continueValue = Console.readLine();
        if(!"1".equals(continueValue) && !"2".equals(continueValue)) {
            successProcess(answerString);
        }

        if("2".equals(continueValue)) System.exit(1);
    }


}
