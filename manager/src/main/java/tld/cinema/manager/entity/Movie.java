package tld.cinema.manager.entity;

import java.util.Set;

import tld.cinema.manager.enumerations.Certificate;
import tld.cinema.manager.enumerations.Genre;
import tld.cinema.manager.interfaces.Film;

public final class Movie implements Film {
    private final long id;
    private final String name;
    private final int runtime;
    private final Set<Genre> genres;
    private final Certificate certificate;

    private Movie(String name, int runtime, Set<Genre> genres, Certificate certificate) {
        this.name = name;
        this.runtime = runtime;
        this.genres = genres;
        this.certificate = certificate;
    }

    public static Movie instanceOf(Movie data) {
        Movie movie = new Movie(
            data.getName(),
            data.getRuntime(),
            data.getGenres(),
            data.getCertificate()
        );
    

        return movie;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getRuntime() {
        return runtime;
    }

    public Set<Genre> getGenres() {
        return genres;
    }

    public Certificate getCertificate() {
        return certificate;
    }

    @Override
    public String toString() {
        return "Name: " + name 
        + " runtime: " + runtime 
        + " genres: " + genres.toString() 
        + "certificate: " + certificate;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof Movie)) {
            return false;
        }

        Movie mov = (Movie)obj;

        return id == mov.id
            && name == mov.name
            && runtime == mov.runtime
            && genres == mov.genres
            && certificate == mov.certificate;
    }

    @Override
    public int hashCode() {
        int result = Long.hashCode(id);
        result = 31 * result + name.hashCode();
        result = 31 * result + Integer.hashCode(runtime);
        result = 31 * result + genres.hashCode();
        result = 31 * result + certificate.hashCode();

        return result;
    }
}
