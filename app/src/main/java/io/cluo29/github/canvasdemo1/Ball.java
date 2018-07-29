package io.cluo29.github.canvasdemo1;

/**
 * Created by CLUO29 on 29/07/18.
 */

// adapted from previous COMP90018

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class Ball {

    private float ballRadius = 40f;

    public float x;
    public float y;

    private float xSpeed;
    private float ySpeed;

    private int screenWidth;
    private int screenHeight;


    public Ball(int screenWidth, int screenHeight) {

        this.screenWidth = screenWidth;
        this.screenHeight = screenHeight;

        setX(120);
        setY(120);
        setXSpeed(10);
        setYSpeed(10);
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void bounce() {
        if(x > screenWidth-ballRadius) {
            //Reverse direction and slow down ball
            setXSpeed(getXSpeed()*-1);
        }
        if(x < ballRadius) {
            //Reverse direction and slow down ball
            setXSpeed(getXSpeed()*-1);
        }
        if(y > screenHeight-ballRadius) {
            //Reverse direction and slow down ball
            setYSpeed(getYSpeed()*-1);
        }
        if(y < ballRadius) {
                //Reverse direction and slow down ball
                setYSpeed(getYSpeed()*-1);
        }
    }

    public void moveBall() {
        x = x + xSpeed;
        y = y + ySpeed;
    }

    public void drawSelf(Canvas canvas) {
        Paint paint = new Paint();
        //smooth out the edges of what is being draw
        paint.setAntiAlias(true);
        paint.setColor(Color.RED);

        bounce();

        moveBall();

        //draw the circle to the canvas
        canvas.drawCircle(x, y, ballRadius, paint);

    }
}