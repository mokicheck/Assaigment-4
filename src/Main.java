public class Main {
    public static void main(String[] args) {
        // Создаем субъект и наблюдателей (Observer Pattern)
        GameEventSubject eventSubject = new GameEventSubject();
        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");

        eventSubject.registerObserver(player1);
        eventSubject.registerObserver(player2);

        // Используем фабрику для создания персонажей (Factory Pattern)
        CharacterFactory characterFactory = new CharacterFactory();
        Character player1Character = characterFactory.createCharacter("warrior");
        Character player2Character = characterFactory.createCharacter("mage");

        System.out.println(player1Character.getCharacterType() + " has been created for Player 1.");
        System.out.println(player2Character.getCharacterType() + " has been created for Player 2.");

        // Пример уведомления наблюдателей (Observer Pattern)
        eventSubject.notifyObservers("Level Up Event");
    }
}
