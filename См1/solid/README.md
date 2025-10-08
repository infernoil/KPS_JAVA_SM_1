# SOLID Refactoring

## Початковий код (BadReport.java)
- Порушує **SRP** (Single Responsibility Principle) – один клас робить усе: генерація, збереження, відправка.
- Порушує **OCP** (Open/Closed Principle) – для додавання нового формату потрібно змінювати код if/else.

## Виправлений код (GoodReport.java)
- Тепер є інтерфейси `Report`, `ReportSaver`, `ReportSender`.
- Додати новий тип звіту можна, створивши новий клас, без зміни існуючих.
- Відповідальності розділені по класах.
