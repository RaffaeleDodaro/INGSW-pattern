package sample;

import java.util.ArrayList;
import java.util.List;

public class DrawingComposite implements Drawable {
    List<Drawable> drawables=new ArrayList<Drawable>();

    public void add(Drawable drawable)
    {
        drawables.add(drawable);
    }
    @Override
    public void draw() {
        for (Drawable d:drawables) {
            d.draw();
        }
    }
}
