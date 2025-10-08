package solid;

public class BadReport {
    public String type;

    public void generate() {
        if ("PDF".equals(type)) {
            System.out.println("Генеруємо PDF звіт...");
        } else if ("Excel".equals(type)) {
            System.out.println("Генеруємо Excel звіт...");
        }
    }

    public void saveToFile(String content) {
        System.out.println("Зберігаємо у файл: " + content);
    }

    public void sendEmail(String content) {
        System.out.println("Надсилаємо email: " + content);
    }
}