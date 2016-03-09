package net.neurowork.paintpoints;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DrawView extends View {
    private Paint paint;
    List<CustomPoint> points = new ArrayList<CustomPoint>();

    private int mPivotX = 0;
    private int mPivotY = 0;
    private int radius = 60;

    public DrawView(Context context, AttributeSet attrs) {
        super(context, attrs);

        paint = new Paint();
        paint.setColor(Color.GRAY);
    }

    public void drawCircle() {
        invalidate();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        Random r = new Random();

        int height = this.getHeight();
        int width = this.getWidth();

        int x = r.nextInt(width);
        int y = r.nextInt(height);
        int size = r.nextInt(80);

        CustomPoint point = new CustomPoint();
        point.x = x;
        point.y = y;
        point.setSize(size);
        points.add(point);

        for(CustomPoint p: points){
            canvas.drawCircle(p.x, p.y, p.getSize(), paint);
        }
    }
}