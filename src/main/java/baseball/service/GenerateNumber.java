package baseball.service;

import nextstep.utils.Randoms;

public class GenerateNumber {

    private GenerateNumber(){

    }

    //시스템에서 만든 정답인 수
    public static String getRandomNumber(){
        StringBuilder Number = new StringBuilder();
        for(int i = 0; i < 3; i++){
            Number.append(Randoms.pickNumberInRange(1, 9));
        }
        return Number.toString();
    }
}
