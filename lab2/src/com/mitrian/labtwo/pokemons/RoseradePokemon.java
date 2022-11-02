package com.mitrian.labtwo.pokemons;

import com.mitrian.labtwo.moves.PoisonStingMove;
import ru.ifmo.se.pokemon.Type;

public class RoseradePokemon extends RoseliaPokemon {
    public RoseradePokemon (String name, int level){
        super(name, level);
        setType(Type.GRASS, Type.POISON);
        setStats(60,70,65,125,105,90);
        addMove(new PoisonStingMove());
    }
}
