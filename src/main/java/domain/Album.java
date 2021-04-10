package domain;

import java.util.Objects;

abstract class Album {


    //declaramos las propiedades

    private String artist;
    private String name;
    private boolean isExplicit;         //es el lenguaje de la música explicito
    private int tracks;
    private double price;

    //constructors

    protected Album(String artist, String name, boolean isExplicit, int tracks, double price) {
        this.artist = artist;
        this.name = name;
        this.isExplicit = isExplicit;
        this.tracks = tracks;
        this.price = price;
    }

    //getters and setters

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isExplicit() {
        return isExplicit;
    }

    public void setExplicit(boolean explicit) {
        isExplicit = explicit;
    }

    public int getTracks() {
        return tracks;
    }

    public void setTracks(int tracks) {
        this.tracks = tracks;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Album)) return false;
        Album album = (Album) o;
        return isExplicit() == album.isExplicit() && getTracks() == album.getTracks() &&
                Double.compare(album.getPrice(), getPrice()) == 0 && getArtist().equals(album.getArtist())
                && getName().equals(album.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getArtist(), getName(), isExplicit(), getTracks(), getPrice());
    }
}
