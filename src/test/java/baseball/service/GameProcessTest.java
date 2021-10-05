package baseball.service;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameProcessTest {

    @Test
    void process() {
        GameProcess gameProcess = new GameProcess();
        String process = gameProcess.process("213", "223");
        Assertions.assertThat(process).isEqualTo("2스트라이크 1볼");
    }

}