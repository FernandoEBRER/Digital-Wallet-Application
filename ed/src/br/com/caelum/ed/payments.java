package br.com.caelum.ed;

public class payments {
    private String id;
    private String type;
    private String bank;
    private String accountNumber;
    private String agency;
    private double amount;

    public payments(String id, String type, String bank, String accountNumber, String agency, double amount) {
        this.id = id;
        this.type = type;
        this.bank = bank;
        this.accountNumber = accountNumber;
        this.agency = agency;
        this.amount = amount;
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getBank() {
        return bank;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAgency() {
        return agency;
    }

    public double getAmount() {
        return amount;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String toString(){
        return type + " - " + bank + " - " + accountNumber;
    }

}

