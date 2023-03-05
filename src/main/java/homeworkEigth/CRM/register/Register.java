package homeworkEigth.CRM.register;

import homeworkEigth.CRM.document.Document;

public class Register implements Database {
    private final Document[] documents = new Document[10];

    public Register() {}

    @Override
    public void add(Document document) {
        for (int i = 0; i < documents.length; i++) {
            if (documents[i] == null) {
            documents[i] = document;
            return;
            }
        }
        System.out.println("Not enough memory!\n");
    }

    @Override
    public void get(int id) {
        for (Document i : documents) {
            if (i != null && i.getId() == id) {
                System.out.println(i);
                System.out.println("                    --------------------------------");
                return;
            }
        }
        System.out.println("ID is not found!\n");
    }

    @Override
    public void getAll() {
            for (Document i : documents) {
                if (i != null) {
                    System.out.println(i);
                    System.out.println("                    --------------------------------");
                }
            }
    }
}
