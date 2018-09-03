package ru.gorshckov.ContractAndAct;

public class Contract {
    private  int numberContact;
    private  int date;




    public Contract() {
    }

    public Contract(int numberContact, int date) {
        this.numberContact = numberContact;
        this.date = date;
    }

    public void setNumberContact(int numberContact) {
        this.numberContact = numberContact;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getNumberContact() {
        return numberContact;
    }

    public int getDate() {
        return date;
    }

    @Override
    public String toString() {
        return " " +
                "numberContact=" + numberContact +
                ", date=" + date +
                '}';
    }
}
