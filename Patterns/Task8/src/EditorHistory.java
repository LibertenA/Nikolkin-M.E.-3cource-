import java.util.Stack;

class EditorHistory {
    private final Stack<DocMemento> history;

    public EditorHistory() {
        history = new Stack<>();
    }

    public void push(DocMemento memento) {
        System.out.println("Сохранение документа.");
        history.push(memento);
    }

    public DocMemento pop() {
        System.out.println("Отмена последних действий.");
        return history.pop();
    }

    public boolean canUndo() {
        return !history.isEmpty();
    }
}
