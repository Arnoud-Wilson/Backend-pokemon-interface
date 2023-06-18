public class ElectricPokemon extends Pokemon {

    private static final String type = "electric";


    public ElectricPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, this.type);
    }
}