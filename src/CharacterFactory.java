class CharacterFactory {
    public Character createCharacter(String characterType) {
        if (characterType.equals("warrior")) {
            return new Warrior();
        } else if (characterType.equals("mage")) {
            return new Mage();
        } else if (characterType.equals("archer")) {
            return new Archer();
        } else {
            return null;
        }
    }
}
