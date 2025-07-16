import java.util.ArrayList;
import java.util.List;
import br.com.caelum.ed.payments;

public class Main {
    private String name;

    private int age;
    private List<payments> acconts;

    public Main(){
        acconts = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void vincularAccont(payments accont){
        acconts.add(accont);
    }

    public void accontList(){
        for(payments accont: acconts){
            System.out.println(accont);
        }
    }

    public String toString(){
        return this.name;
    }

    public boolean equals(Object o){
        Main outro = (Main)o;
        return this.name.equals(outro.name);
    }

    public static void main(String[] args){
        Main user = new Main();
        user.setName("Fernando");
        user.setAge(23);

        payments accont1 = new payments("01", "Conta corrente", "Nubank", "12345-6", "0001", 2500.00);
        payments card1 = new payments("02", "Conta de Crédito", "Bradesco", "9876-5", "0001", 0.00);

        user.vincularAccont(accont1);
        user.vincularAccont(card1);

        System.out.println("Conta vinculada de " + user.getName() + ":");
        user.accontList();
        System.out.println("Conta atualizada com sucesso!");
    }


}