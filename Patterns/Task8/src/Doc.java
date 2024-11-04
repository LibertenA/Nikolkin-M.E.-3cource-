class Doc {
    private StringBuilder text = new StringBuilder();
    private int style = 1;

    public void addBlock(String text) {
        this.text.append(text).append('\n');
        System.out.println("Добавлен блок:\n" + text);
    }

    public void setStyle(int style) {
        if (this.style != style) {
            this.style = style;
        }
        System.out.println("Установлен стиль: тип " + style);
    }

    public void print() {
        System.out.println("Стиль:\nтип " + style + "\nТекст:\n" + text);
    }

    public DocMemento saveState() {
        System.out.println("Сохранение документа.");
        return new DocMemento(text.toString(), style);
    }

    public void restoreState(DocMemento memento) {
        text = new StringBuilder(memento.getText());
        style = memento.getStyle();
    }
}
