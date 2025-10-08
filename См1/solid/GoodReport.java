package solid;

interface Report {
    String generate();
}

class PdfReport implements Report {
    public String generate() { return "PDF Report"; }
}

class ExcelReport implements Report {
    public String generate() { return "Excel Report"; }
}

interface ReportSaver {
    void save(String content);
}

class FileSaver implements ReportSaver {
    public void save(String content) {
        System.out.println("Збережено у файл: " + content);
    }
}

interface ReportSender {
    void send(String content);
}

class EmailSender implements ReportSender {
    public void send(String content) {
        System.out.println("Відправлено email: " + content);
    }
}

public class GoodReport {
    public static void main(String[] args) {
        Report report = new PdfReport();
        ReportSaver saver = new FileSaver();
        ReportSender sender = new EmailSender();

        String content = report.generate();
        saver.save(content);
        sender.send(content);
    }
}