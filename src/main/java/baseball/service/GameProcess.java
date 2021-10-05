package baseball.service;

public class GameProcess {

    private int cntStrike = 0;
    private int cntBall = 0;

    public String process(String inputNumber, String answer){

        for(int idx = 0; idx < inputNumber.length(); idx++){
            cntStrike += isStrike(idx, String.valueOf(inputNumber.charAt(idx)), answer);
            cntBall += isBall(idx, String.valueOf(inputNumber.charAt(idx)), answer);
        }

        return resultMessage();
    }

    public int isStrike(int index, String digitNumber, String answer){
        return digitNumber.equals(String.valueOf(answer.charAt(index))) ? 1 : 0;
    }

    public int isBall(int index, String digitNumber, String answer){
        if(!digitNumber.equals(String.valueOf(answer.charAt(index)))  && answer.contains(digitNumber)){
            return 1;
        } else {
            return 0;
        }
    }

    public String resultMessage(){
        if(cntStrike != 0 && cntBall == 0) return cntStrike + "스트라이크";
        if(cntStrike == 0 && cntBall != 0) return cntBall + "볼";
        if(cntStrike != 0 && cntBall != 0) return cntStrike + "스트라이크 " + cntBall + "볼";
        return "낫싱";
    }


}
