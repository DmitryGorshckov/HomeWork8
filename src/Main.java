import ru.gorshckov.ContractAndAct.Act;
import ru.gorshckov.ContractAndAct.Contract;
import ru.gorshckov.calc.Calculator;
import ru.gorshckov.human.Human;
import ru.gorshckov.vm.VendingMachine;
import ru.gorshckov.vm.VendingMachineForTea;

public class Main {

    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine();
        VendingMachineForTea vmft = new VendingMachineForTea();
        vmft.addMoney(0);
        vmft.giveMeADrink(0);
        Calculator.percOfNumb(30, 100); //класс калькулятор
        Human person1 = new Human("AD", 34);
        Human person2 = new Human("LI", 36);
        person1.countPerson();
        person2.countPerson();
        Human person3 = new Human("Lo", 90);
        System.out.println();
        person1.countPerson();
        System.out.println();
        Act act = new Act();;
        act.setContract(new Contract(234,5));
        act.createAct(new Contract());
        System.out.println(act);
        act.setContract(new Contract(789,1));
        System.out.println(act);

    }
}