package homeworkEigth.CRM.contractEmployee;

import homeworkEigth.CRM.document.Document;
import java.text.SimpleDateFormat;

public class ContractEmployee extends Document {

    public ContractEmployee(int id, String contractStart, String contractStop, String name) {
        super(id, contractStart, contractStop, name);
    }

    @Override
    public String toString() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
        return String.format("This is " + getClass().getSimpleName()
                + ".\nContract details: id = " + super.getId()
                + ", the contract began in " + formatter.format(super.getDateStart())
                + ", the contract will end in " + formatter.format(super.getDateStop())
                + ", employee`s name is " + super.getName() + ".");
    }
}
