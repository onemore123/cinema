package tld.cinema.manager.model;

import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

import tld.cinema.manager.enumerations.Certificates;
import tld.cinema.manager.enumerations.Genres;
import tld.cinema.manager.interfaces.MovieData;

public final class Movie {
    private final long id;
    private final String name;
    private final int runtime;
    private final Set<Genres> genres;
    private final Certificates certificate;
    private static AtomicLong counter;

    private Movie(String name, int runtime, Set<Genres> genres, Certificates certificate) {
        if (Movie.counter == null) {
            Movie.counter = new AtomicLong();
        }

        this.id = Movie.counter.incrementAndGet();
        this.name = name;
        this.runtime = runtime;
        this.genres = genres;
        this.certificate = certificate;
    }

    public static Movie instanceOf(MovieData data) {
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

    public Set<Genres> getGenres() {
        return genres;
    }

    public Certificates getCertificate() {
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
