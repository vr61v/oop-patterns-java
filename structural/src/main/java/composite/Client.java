package composite;

public class Client {
    public static void main(String[] args) {
        var docsFile = new File("document.docs");
        var pttxFile = new File("presentation.pttx");
        var xlsxFile = new File("excel.xlsx");
        var pdfFile = new File("document.pdf");

        var textFolder = new Folder("text");
        var tableFolder = new Folder("table");
        var otherFolder = new Folder("other");
        var CFolder = new Folder("C");
        var computerFolder = new Folder("My computer");

        for(int i = 0; i < 4; ++i) textFolder.add(new File("document" + i + ".docs"));
        for(int i = 0; i < 6; ++i) tableFolder.add(new File("excel" + i + ".xlsx"));
        for(int i = 0; i < 5; ++i) {
            otherFolder.add(new File("document" + i + ".pdf"));
            otherFolder.add(new File("presentation" + i + ".pttx"));
        }
        CFolder.add(textFolder);
        CFolder.add(tableFolder);
        CFolder.add(otherFolder);
        computerFolder.add(CFolder);
        computerFolder.print(0);
    }
}
