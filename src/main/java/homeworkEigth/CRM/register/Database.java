package homeworkEigth.CRM.register;

import homeworkEigth.CRM.document.Document;

public interface Database {

    void addDocument(Document document);

    void getInfo(int id);
}
