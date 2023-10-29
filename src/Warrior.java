// Concrete Products (Конкретные продукты) - Represent specific character types
class Warrior implements Character {
    @Override
    public String getCharacterType() {
        // Return a string indicating that this is a Warrior character
        return "Warrior";
    }
}

class Mage implements Character {
    @Override
    public String getCharacterType() {
        // Return a string indicating that this is a Mage character
        return "Mage";
    }
}

class Archer implements Character {
    @Override
    public String getCharacterType() {
        // Return a string indicating that this is an Archer character
        return "Archer";
    }
}
