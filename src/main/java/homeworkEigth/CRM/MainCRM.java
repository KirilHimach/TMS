package homeworkEigth.CRM;

import homeworkEigth.CRM.contractEmployee.ContractEmployee;
import homeworkEigth.CRM.contractSupply.ContractSupply;
import homeworkEigth.CRM.contractSupply.invoice.Invoice;
import homeworkEigth.CRM.register.Register;

public class MainCRM {
    public static void main(String[] args) {
       Register register = new Register();
        ContractEmployee bob
                = new ContractEmployee(2, "12.11.2020", "03.09.2023", "Bob");
        ContractEmployee catty
                = new ContractEmployee(6, "19.03.1993", "26.01.2035", "Catty");
        ContractSupply apple
                = new ContractSupply(15, "iCar", 596, "01.01.2026");
        ContractSupply samsung
                = new ContractSupply(66, "TV", 2398, "03.08.2009");
        ContractSupply lenovo
                = new ContractSupply(13, "Shoes", 9999, "27.05.2026");
        Invoice dress
                = new Invoice(63, 65005, "01.01.2020", "12AQ96");
        Invoice dolls
                = new Invoice(129, 12348637, "06.11.2019", "UB84POHB88");
        Invoice kvas
                = new Invoice(456, 17863159, "13.02.2013", "7962348b");
        Invoice testDate
                = new Invoice(23, 123, "123", "777"); //Catch mistake!!!!!

        register.add(bob);
        register.add(apple);
        register.add(lenovo);
        register.add(kvas);
        register.add(dolls);
        register.add(samsung);
        register.add(catty);
        register.add(dress);

        register.add(testDate);
        register.add(kvas);
        register.add(apple); //Catch mistake!!!!!

        register.get(2);
        register.get(6);
        register.get(15);
        register.get(66);
        register.get(13);
        register.get(63);
        register.get(129);
        register.get(456);
        register.get(23);
        register.get(1); //Catch mistake!!!!!

     register.getAll();
    }
}
