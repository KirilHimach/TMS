package homeworkEigth.CRM.register;

import homeworkEigth.CRM.document.Document;

public interface Database {

    void add(Document document);

    void get(int id);

    void getAll();
}
