package ru.gorshckov.ContractAndAct;

public class Act {
    private static int numberAct;
    private static int date;
    private Contract contract;

    public Act() {
    }

    public Act(Contract contract) {
        this.contract = contract;
    }
    public static Act createAct(Contract contract){
        return new Act(contract);
    }

    public int getNumberAct() {
        return numberAct;
    }

    public void setNumberAct(int numberAct) {
        this.numberAct = numberAct;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    @Override
    public String toString() {
        return " " + contract;
    }
}
