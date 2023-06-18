public class WaterPokemon extends Pokemon {

    private static final String type = "water";


    public WaterPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, this.type);
    }
}
