interface DataExporter {
    void export(String data);
    default void exportToJSON(String data) {
        System.out.println("Exporting to JSON: { \"data\": \"" + data + "\" }");
    }
}

class CSVExporter implements DataExporter {
    public void export(String data) { System.out.println("Exporting CSV: " + data); }
}

class PDFExporter implements DataExporter {
    public void export(String data) { System.out.println("Exporting PDF: " + data); }
}

public class DataExportFeature {
    public static void main(String[] args) {
        DataExporter csv = new CSVExporter();
        DataExporter pdf = new PDFExporter();
        csv.export("Report Data");
        pdf.export("Report Data");
        csv.exportToJSON("Report Data");
    }
}
