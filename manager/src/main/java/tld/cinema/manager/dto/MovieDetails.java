package tld.cinema.manager.dto;

import java.util.HashSet;
import java.util.Set;

import tld.cinema.manager.enumerations.Certificate;
import tld.cinema.manager.enumerations.Genre;
import tld.cinema.manager.interfaces.Film;

public class MovieDetails implements Film {
    private long id;
    private String name;
    private int runtime;
    private HashSet<Genre> genres;
    private Certificate certificate;

    public MovieDetails setId(long id) {
        this.id = id;

        return this;
    }

    public MovieDetails setName(String name) {
        this.name = name;

        return this;
    }

    public MovieDetails setRuntime(int runtime) {
        this.runtime = runtime;

        return this;
    }

    public MovieDetails setGenres(Set<Genre> genres) {
        this.genres = new HashSet<Genre>(genres);

        return this;
    }

    public MovieDetails setCertificate(Certificate certificate) {
        this.certificate = certificate;

        return this;
    }


    public long getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getRuntime() {
        return runtime;
    }

    @Override
    public Set<Genre> getGenres() {
        return genres;
    }

    @Override
    public Certificate getCertificate() {
        return certificate;
    }
}
