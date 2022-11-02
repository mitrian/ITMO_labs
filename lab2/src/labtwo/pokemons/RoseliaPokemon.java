package labtwo.pokemons;


import labtwo.moves.GigaDrainMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class RoseliaPokemon extends Pokemon {

    public RoseliaPokemon(String name, int level){
        super(name,level);
        setType(Type.POISON, Type.GHOST);
        setStats(50,60,45,100,80,65);
        addMove(new GigaDrainMove());
    }
}
