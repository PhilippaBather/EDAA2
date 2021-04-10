package domain;

public class CD extends Album {


    //declaramos las propiedades
    private boolean isImport;          //es una edición del otro país

    //constructors

    public CD(String artist, String name, boolean isExplicit, int tracks, double price, boolean isImport) {
        super(artist, name, isExplicit, tracks, price);
        this.isImport = isImport;
    }

    //getters and setters

    public boolean isImport() {
        return isImport;
    }

    public void setImport(boolean anImport) {
        isImport = anImport;
    }


    //otros métodos

    @Override
    public String toString() {
        return "Artista/grupo: " + getArtist() + "\nNombre del album " + getName() + "\nPistas: " + getTracks() + "\nPrecio: " + getPrice()
                + "\nArticulo importado: " + isImport();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CD)) return false;
        if (!super.equals(o)) return false;
        CD cd = (CD) o;
        return isImport() == cd.isImport();
    }
}
