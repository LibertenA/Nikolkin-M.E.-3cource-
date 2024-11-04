import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class EditorSession {
    private final List<String> openFiles;
    private final Map<String, Position> windowPositions;

    public EditorSession() {
        openFiles = new ArrayList<>();
        windowPositions = new HashMap<>();
    }

    public void addOpenFile(String fileName) {
        openFiles.add(fileName);
        System.out.println("Файл " + fileName + " открыт.");
    }

    public void setWindowPosition(String windowName, int x, int y) {
        windowPositions.put(windowName, new Position(x, y));
        System.out.println("Позиция окна:\n" + windowName + " установлена на (" + x + ", " + y + ").");
    }

    public void printSessionInfo() {
        System.out.println("Информация о сеансе:\n");
        System.out.println("Открытые файлы:\n");
        for (String file : openFiles) {
            System.out.println(file);
        }

        System.out.println("Позиции окон:");
        for (Map.Entry<String, Position> entry : windowPositions.entrySet()) {
            System.out.println(entry.getKey() + ": (" + entry.getValue().x + ", " + entry.getValue().y + ")");
        }
    }

    private static class Position {
        int x, y;

        Position(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
