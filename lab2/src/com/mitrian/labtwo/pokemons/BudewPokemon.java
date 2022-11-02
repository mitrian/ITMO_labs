package com.mitrian.labtwo.pokemons;

import com.mitrian.labtwo.moves.DazzlingGleamMove;
import com.mitrian.labtwo.moves.ShadowBallMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class BudewPokemon extends Pokemon {

    public BudewPokemon (String name, int level){
        super(name, level);
        setType(Type.GRASS, Type.POISON);
        setStats(40,30,35,50,70,55);
        addMove(new ShadowBallMove());
        addMove(new DazzlingGleamMove());

    }

}
