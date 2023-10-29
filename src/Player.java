// Concrete Observer (Конкретный наблюдатель) - Represents an observer in the Observer pattern
class Player implements Observer {
    private String name; // Store the name of the player

    // Constructor to initialize the player's name
    public Player(String name) {
        this.name = name;
    }

    @Override
    public void update(String event) {
        // The update method is called when the observer receives an event
        // It prints a message indicating which player received the event
        // and provides information about the event itself
        System.out.println(name + " received event: " + event);
    }
}
