public class ReportFactory {
    public Report getReport(ReportTypes type){
        Report toReturn = null;
        switch (type) {
            case TEXT:
                toReturn = new TextReport();
                break;
            case GRAPHIC:
                toReturn = new GraphicReport();
                break;
            case SPREADSHEET:
                toReturn = new SpreadsheetReport();
                break;
            default:
                throw new IllegalArgumentException("Такого типа отчета нет:" + type);
        }
        return toReturn;
    }
}
