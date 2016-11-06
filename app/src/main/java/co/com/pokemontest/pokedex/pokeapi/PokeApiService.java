package co.com.pokemontest.pokedex.pokeapi;


import co.com.pokemontest.pokedex.models.PokemonRespuesta;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by EdwarD on 6/09/2016.
 */
public interface PokeApiService {

    @GET("pokemon")
    Call<PokemonRespuesta> obtenerListaPokemon(@Query("limit") int limit, @Query("offset") int offset);}
