package net.neurowork.paintpoints;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PaintActivity extends Activity {
    DrawView dv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paint);

        Button draw = (Button) findViewById(R.id.draw);
        draw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dv = (DrawView) findViewById(R.id.drawview);
                dv.drawCircle();
            }
        });

        Button clear = (Button) findViewById(R.id.clear);
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dv = (DrawView) findViewById(R.id.drawview);

            }
        });
    }
}