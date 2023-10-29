class Player implements Observer {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    @Override
    public void update(String event) {
        System.out.println(name + " received event: " + event);
    }
}
