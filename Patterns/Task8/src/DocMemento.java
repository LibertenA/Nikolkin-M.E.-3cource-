class DocMemento {
    private final String text;
    private final int style;

    public DocMemento(String text, int style) {
        this.text = text;
        this.style = style;
    }

    public String getText() {
        return text;
    }

    public int getStyle() {
        return style;
    }
}
