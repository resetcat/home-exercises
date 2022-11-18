package io.codelex.oop.persons;

public class Costumer extends Person {
    private String costumerId;
    int purchaseCount;

    public Costumer(String firstName, String lastName, String id, int age, String costumerId, int purchaseCount) {
        super(firstName, lastName, id, age);
        this.costumerId = costumerId;
        this.purchaseCount = purchaseCount;
    }

    public int getPurchaseCount() {
        return purchaseCount;
    }

    public void setPurchaseCount(int purchaseCount) {
        this.purchaseCount = purchaseCount;
    }


    @Override
    public String getInfo() {
        return getFirstName() + " " + getLastName() + " " + costumerId + " has made "
                + getPurchaseCount() + " purchase" + (getPurchaseCount() > 1 ? "s" : "");
    }
}
