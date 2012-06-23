package inheritance.vs.composition;

public class BoardGame extends LendableItem {
    private String difficultyLevel;

    public BoardGame(String gameName, String difficultyLevel) {
        super(0,gameName);
        this.difficultyLevel = difficultyLevel;
    }
}
