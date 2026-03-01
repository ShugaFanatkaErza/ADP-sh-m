package module_04.practise_work;
public abstract class DocumentCreator {

    public abstract Document createDocument();

    public void openDocument() {
        Document document = createDocument();
        document.open();
    }
}
