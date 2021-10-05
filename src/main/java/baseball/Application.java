package baseball;

import baseball.service.Baseball;

public class Application {
    public static void main(String[] args) {

        //야구게임 시작
        Baseball baseball = new Baseball();

        baseball.playGames();
    }
}
