package labtwo.pokemons;


import labtwo.moves.FocusBlastMove;
import ru.ifmo.se.pokemon.Type;

public class ArcheopsPokemon extends ArchenPokemon {

    public ArcheopsPokemon (String name, int level){
        super(name, level);
        setType(Type.ROCK, Type.FLYING);
        setStats(75,140 , 65,112,65,110);
        addMove(new FocusBlastMove());
    }
}
