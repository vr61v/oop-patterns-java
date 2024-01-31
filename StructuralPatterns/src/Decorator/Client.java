package Decorator;

public class Client {
    public static void main(String[] args) {
        Service foreignMusic = new ForeignService();
        foreignMusic = new MusicService("Spotify", foreignMusic);
        System.out.println(foreignMusic.name + " " + foreignMusic.GetPrice() + "rub.");

        Service russianFilm = new RussianService();
        russianFilm = new FilmService("Kinopoisk", russianFilm);
        System.out.println(russianFilm.name + " " + russianFilm.GetPrice() + "rub.");
    }
}
