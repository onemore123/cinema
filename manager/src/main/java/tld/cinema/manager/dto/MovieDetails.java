package tld.cinema.manager.dto;

import java.util.HashSet;
import java.util.Set;

import tld.cinema.manager.enumerations.Certificates;
import tld.cinema.manager.enumerations.Genres;
import tld.cinema.manager.interfaces.MovieData;

public class MovieDetails implements MovieData {
    private long id;
    private String name;
    private int runtime;
    private HashSet<Genres> genres;
    private Certificates certificate;

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

    public MovieDetails setGenres(Set<Genres> genres) {
        this.genres = new HashSet<Genres>(genres);

        return this;
    }

    public MovieDetails setCertificate(Certificates certificate) {
        this.certificate = certificate;

        return this;
    }

    @Override
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
    public Set<Genres> getGenres() {
        return genres;
    }

    @Override
    public Certificates getCertificate() {
        return certificate;
    }
}
