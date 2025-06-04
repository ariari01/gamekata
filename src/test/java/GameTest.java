import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    private Game game;

    @BeforeEach
    void setUp() {
        game = new Game();
    }

    @Test
    void createGame() {
        assertNotNull(game);
    }

    @Test
    @DisplayName("입력이 없으면 예외처리")
    void throwExceptionWhenInputIsNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            game.guess(null);
        });
    }

    @Test
    @DisplayName("입력 숫자값이 3자리가 아니면 예외처리")
    void throwExceptionWhenInputLengthIsUnmatched() {
        try {
            game.guess("12");
            fail();
        }
        catch (IllegalArgumentException e){

        }
    }
}