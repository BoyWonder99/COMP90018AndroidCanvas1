package io.cluo29.github.canvasdemo1;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

/**
 * Created by CLUO29 on 29/07/18.
 */

public class GameScore {

    int yourScore;
    private int size = 30;

    public int x = 10;
    public int y = 50;

    public GameScore(int score) {

        this.yourScore = score;
    }

    public void count(){
        yourScore = yourScore - 1;
    }

    public void drawSelf(Canvas canvas) {
        Paint paint = new Paint();

        paint.setColor(Color.WHITE);
        paint.setTextSize(size);

        count();

        canvas.drawText("You Score: " + yourScore, x, y, paint);

    }
}
