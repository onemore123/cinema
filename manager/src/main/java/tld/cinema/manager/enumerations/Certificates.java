package tld.cinema.manager.enumerations;

public enum Certificates {
    G(" For all audiences"),
    PG("Parental Guidance Suggested"),
    PG_13("Parental Guidance Suggested for children under 13"),
    R("Under 17 not admitted without parent or guardian"),
    NC_17("Under 17 not admitted");

    private final String ratingsCertificates;
    Certificates(String ratingsCertificates) { this.ratingsCertificates = ratingsCertificates; }
    public String ratingsCertificates() { return ratingsCertificates; }
}
