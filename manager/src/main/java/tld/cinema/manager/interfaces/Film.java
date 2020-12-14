package tld.cinema.manager.interfaces;

import java.util.Set;

import tld.cinema.manager.enumerations.Certificate;
import tld.cinema.manager.enumerations.Genre;

public interface Film {
    public String getName();
    public int getRuntime();
    public Set<Genre> getGenres();
    public Certificate getCertificate();
}
