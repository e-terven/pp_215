package koschei.models;

public class Island2 {

    private Wood3 wood;

    public Island2(Wood3 wood) {   // конфиг. файл 1
        this.wood = wood;
    }

    @Override
    public String toString() {
        return ", на острове дерево " + wood.toString();
    }
}
