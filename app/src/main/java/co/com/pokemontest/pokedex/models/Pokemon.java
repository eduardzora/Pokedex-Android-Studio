package co.com.pokemontest.pokedex.models;

/**
 * Created by EdwarD on 6/09/2016.
 */
public class Pokemon {

    private int number;
    private String name;
    private String url;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getNumber() {
        String[] urlPartes = url.split("/");
        return Integer.parseInt(urlPartes[urlPartes.length - 1]);
    }

    public void setNumber(int namber) {
        this.number = namber;
    }
}
