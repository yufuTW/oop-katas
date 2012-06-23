package inheritance.vs.composition;

import org.joda.time.LocalDate;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BoardGameTest {
    @Test
    public void testBeAbleToLendABoardGame() throws Exception {
        //Given
        LendableItem boardGame = new BoardGame("game name", "level");
        LocalDate dueDate = LocalDate.now().plusMonths(1);
        //When
        boardGame.lend(dueDate);
        //Then
        assertThat(boardGame.returnDueDate(), is(dueDate));
    }
}
