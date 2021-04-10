package domain;

public class Order {


    //declaramos propiedades

    private int orderId;
    private OBJECT_TYPE item;
    private String artist;
    private String name;
    private int customerId;

    //constructors

    public Order() {
    }

    //constructor

    public Order(int orderId, OBJECT_TYPE item, String artist, String name, int customerId) {
        this.orderId = orderId;
        this.item = item;
        this.artist = artist;
        this.name = name;
        this.customerId = customerId;
    }


    //getters and setters

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public OBJECT_TYPE getItem() {
        return item;
    }

    public void setItem(OBJECT_TYPE item) {
        this.item = item;
    }

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


    //otros métodos

    @Override
    public String toString() {

        return "Pedido ID: " + orderId + "\nCliente ID: " + customerId + "\nItem: " + item + "\nArtista/group: " + artist
                + "\nNombre del album: " + name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (!(obj instanceof Order))
            return false;
        Order other = (Order) obj;
        boolean itemEquals = (this.getItem() == null && other.getItem() == null)
                || (this.getItem() != null && this.getItem().equals(other.getItem()));
        boolean artistEquals = (this.getArtist() == null && other.getArtist() == null)
                || (this.getArtist() != null && this.getArtist().equals(other.getArtist()));
        boolean nameEquals = (this.getName() == null && other.getName() == null)
                || (this.getName() != null && this.getName().equals(other.getName()));
        return this.getCustomerId() == other.getCustomerId() && itemEquals && artistEquals && nameEquals;
    }
}
