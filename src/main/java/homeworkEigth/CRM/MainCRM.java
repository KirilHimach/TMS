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

        register.addDocument(bob);
        register.addDocument(apple);
        register.addDocument(lenovo);
        register.addDocument(kvas);
        register.addDocument(dolls);
        register.addDocument(samsung);
        register.addDocument(catty);
        register.addDocument(dress);

        register.addDocument(testDate);
        register.addDocument(kvas);
        register.addDocument(apple); //Catch mistake!!!!!

        register.getInfo(2);
        register.getInfo(6);
        register.getInfo(15);
        register.getInfo(66);
        register.getInfo(13);
        register.getInfo(63);
        register.getInfo(129);
        register.getInfo(456);
        register.getInfo(23);
        register.getInfo(1); //Catch mistake!!!!!

     //register.getAll();
    }
}
