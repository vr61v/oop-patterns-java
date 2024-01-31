package Composite;

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

        for(int i = 0; i < 4; ++i) textFolder.Add(new File("document" + Integer.toString(i) + ".docs"));
        for(int i = 0; i < 6; ++i) tableFolder.Add(new File("excel" + Integer.toString(i) + ".xlsx"));
        for(int i = 0; i < 5; ++i) {
            otherFolder.Add(new File("document" + Integer.toString(i) + ".pdf"));
            otherFolder.Add(new File("presentation" + Integer.toString(i) + ".pttx"));
        }
        CFolder.Add(textFolder);
        CFolder.Add(tableFolder);
        CFolder.Add(otherFolder);
        computerFolder.Add(CFolder);
        computerFolder.Print(0);
    }
}
