package domain;

public class Vinyl {


    //declaramos propiedades
    private boolean isSecondHand;

    //constructors

    public Vinyl(String artist, String name, boolean isExplicit, int tracks, double price, boolean isSecondHand) {
        super(artist, name, isExplicit, tracks, price);
        this.isSecondHand = isSecondHand;
    }


    //getters and setters

    public boolean isSecondHand() {
        return isSecondHand;
    }

    public void setSecondHand(boolean secondHand) {
        isSecondHand = secondHand;
    }


    //otros métodos

    @Override
    public String toString() {
        return "Artista/grupo: " + getArtist() + "\nNombre del album: " + getName() + "\nPistas: " + getTracks() + "\nPrecio: " + getPrice()
                + "\nDe segunda mano: " + isSecondHand();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vinyl)) return false;
        if (!super.equals(o)) return false;
        Vinyl vinyl = (Vinyl) o;
        return isSecondHand() == vinyl.isSecondHand();
    }
}
