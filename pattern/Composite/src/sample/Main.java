package sample;

public class Main {

    public static void main(String[] args) {
        Triangolo t = new Triangolo();
        Quadrato q = new Quadrato();
        DrawingComposite d1 = new DrawingComposite();
        d1.add(t);
        d1.add(q);
        d1.draw();
    }
}
