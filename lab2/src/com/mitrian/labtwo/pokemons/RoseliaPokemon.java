package com.mitrian.labtwo.pokemons;


import com.mitrian.labtwo.moves.GigaDrainMove;
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
