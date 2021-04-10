package domain;

import java.util.ArrayList;

public class Customer {
    //declaramos la propiedades

    private int customerId;
    private String name;
    private String surname;
    private String telephone;
    private String email;
    private int orderNum;
    private ArrayList<Integer> orders = new ArrayList<>();

    //constructors

    public Customer(int customerId, String name, String surname, String telephone, String email, int orderNum) {
        this.customerId = customerId;
        this.name = name;
        this.surname = surname;
        this.telephone = telephone;
        this.email = email;
        this.orderNum = orderNum;
        orders.add(this.orderNum);
    }

    public Customer(int customerId, String name, String surname, String telephone, String email) {
        this.customerId = customerId;
        this.name = name;
        this.surname = surname;
        this.telephone = telephone;
        this.email = email;
    }

    //getters and setters

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    //getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getOrderNum() {return orderNum; }

    public void setOrderNum(int orderNum) {
        orders.add(orderNum);
    }

    //otros métodos

    public void getOrders() {
        for (Integer order : orders) {
            System.out.println(order);
        }
    }

    @Override
    public String toString() {
        return "Cliente ID: " + customerId + "\nNombre: " + name + "\nApellido: " + surname + "\nTeléfono: " +
                telephone + "\nEmail: " + email + "\nNúmero(s) del pedido(s): " + orders.size();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (!(obj instanceof Customer))
            return false;
        Customer other = (Customer) obj;
        boolean nameEquals = (this.getName() == null && other.getName() == null)
                || (this.getName() != null && this.getName().equals(other.getName()));
        boolean surnameEquals = (this.getSurname() == null && other.getSurname() == null)
                || (this.getSurname() != null && this.getSurname().equals(other.getSurname()));
        boolean telephoneEquals = (this.getTelephone() == null && other.getTelephone() == null)
                || (this.getTelephone() != null && this.getTelephone().equals(other.getTelephone()));
        boolean emailEquals = (this.getEmail() == null && other.getEmail() == null)
                || (this.getEmail() != null && this.getEmail().equals(other.getEmail()));
        return nameEquals && surnameEquals && telephoneEquals;
    }
}