public class GrassPokemon extends Pokemon {

    private static final String type = "grass";


    public GrassPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, this.type);
    }
}
