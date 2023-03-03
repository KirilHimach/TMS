package homeworkEigth.CRM.document;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Document {
    private int id;
    private String name;
    private int quantity;
    private Date dateStart;
    private Date dateStop;
    private String departmentCode;

    public Document(int id, String productType, int quantity, String contractStart) { //ContractSupply
        this.id = id;
        this.name = productType;
        this.quantity = quantity;
        this.dateStart = datePars(contractStart);
    }

    public Document(int id, String contractStart, String contractStop, String name) { //ContractEmployee
        this.id = id;
        this.name = name;
        this.dateStart = datePars(contractStart);
        this.dateStop = datePars(contractStop);
    }

    public Document(int id, int amount, String documentDate, String departmentCode) { //Invoice
        this.id = id;
        this.quantity = amount;
        this.dateStart = datePars(documentDate);
        this.departmentCode = departmentCode;
    }

    public Date datePars(String date) {
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        Date dateResult = new Date();
        try {
            dateResult = format.parse(date);
        } catch (ParseException e) {
            System.out.println("Date ERROR!!!!!");
            System.out.println("Will be used the current date!\n");
        }
        return dateResult;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public Date getDateStart() {
        return dateStart;
    }

    public Date getDateStop() {
        return dateStop;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }
}
