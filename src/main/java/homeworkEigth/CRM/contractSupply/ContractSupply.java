package homeworkEigth.CRM.contractSupply;

import homeworkEigth.CRM.document.Document;
import java.text.SimpleDateFormat;

public class ContractSupply extends Document {

    public ContractSupply(int id, String productType, int quantity, String contractStart) {
        super(id, productType, quantity, contractStart);
    }

    @Override
    public String toString() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
        return String.format("This is " + getClass().getSimpleName()
                + ".\nContract details: id = " + super.getId()
                + ", product type is " + super.getName()
                + ", number of products = " + super.getQuantity()
                + ", the contract began in " + formatter.format(super.getDateStart()) + ".");
    }
}
