import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ReportFactory factory = new ReportFactory();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите тип отчета:" + '\n' + "1 - текстовый отчет" + '\n' + "2 - графический отчет" + '\n' + "3 - табличный отчет");

        int choice = scanner.nextInt();
        Report report = null;

        switch (choice) {
            case 1:
                report = factory.getReport(ReportTypes.TEXT);
                break;
            case 2:
                report = factory.getReport(ReportTypes.GRAPHIC);
                break;
            case 3:
                report = factory.getReport(ReportTypes.SPREADSHEET);
                break;
            default:
                throw new IllegalArgumentException("Такого варианта нет");
        }

        report.getReport();

       /* Report text = factory.getReport(ReportTypes.TEXT);
        Report graphic = factory.getReport(ReportTypes.GRAPHIC);
        Report spreadsheet = factory.getReport(ReportTypes.SPREADSHEET);

        text.getReport();
        graphic.getReport();
        spreadsheet.getReport();*/
    }
}