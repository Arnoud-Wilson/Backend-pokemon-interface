public class FirePokemon extends Pokemon {

    private static final String type = "fire";


    public FirePokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, this.type);
    }
}
