package homeworkEigth.CRM.contractSupply.invoice;

import homeworkEigth.CRM.document.Document;
import java.text.SimpleDateFormat;

public class Invoice extends Document {

    public Invoice(int id, int amount, String documentDate, String departmentCode) {
        super(id, amount, documentDate, departmentCode);
    }

    @Override
    public String toString() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
        return String.format("This is " + getClass().getSimpleName()
                + ".\nContract details: id = " + super.getId()
                + ", amount per month = " + super.getQuantity()
                + ", document date - " + formatter.format(super.getDateStart())
                + ", department code - " + super.getDepartmentCode() + ".");
    }
}
