// Factory (Фабрика) - Represents a factory for creating character objects
class CharacterFactory {
    // Factory method for creating characters based on character type
    public Character createCharacter(String characterType) {
        if (characterType.equals("warrior")) {
            // If the character type is "warrior," create and return a Warrior object
            return new Warrior();
        } else if (characterType.equals("mage")) {
            // If the character type is "mage," create and return a Mage object
            return new Mage();
        } else if (characterType.equals("archer")) {
            // If the character type is "archer," create and return an Archer object
            return new Archer();
        } else {
            // If the character type is not recognized, return null or handle the case appropriately
            return null;
        }
    }
}
