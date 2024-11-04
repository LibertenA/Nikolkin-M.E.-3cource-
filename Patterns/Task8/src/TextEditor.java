public class TextEditor {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        Doc myDocument = new Doc();
        EditorHistory history = new EditorHistory();

        EditorSession session = new EditorSession();

        session.addOpenFile("документ.txt");
        session.setWindowPosition("Главное окно", 100, 200);

        myDocument.addBlock("Привет, мир!");
        myDocument.setStyle(2);
        myDocument.print();

        history.push(myDocument.saveState());
        myDocument.addBlock("И снова привет!!!");
        myDocument.setStyle(3);
        myDocument.print();

        if (history.canUndo()) {
            myDocument.restoreState(history.pop());
            myDocument.print();
        }

        session.printSessionInfo();
    }
}