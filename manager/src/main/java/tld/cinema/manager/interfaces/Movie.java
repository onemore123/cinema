package tld.cinema.manager.interfaces;

import java.util.Set;

import tld.cinema.manager.enumerations.Certificates;
import tld.cinema.manager.enumerations.Genres;

public interface Movie {
    public long getId();
    public String getName();
    public int getRuntime();
    public Set<Genres> getGenres();
    public Certificates getCertificate();
}
