package game.pong;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Picture;

import game.pong.GamePanel;

public class Background {

    private Bitmap image;
    private int x, dx;

    public Background(Bitmap res)
    {
        image = res;
        dx = GamePanel.MOVESPEED;
    }
    public void update()
    {
        x+=dx;
        if(x<-GamePanel.WIDTH){
            x=0;
        }
    }
    public void draw(Canvas canvas)
    {
        canvas.drawBitmap(image, x, 0,null);
        if(x < 0)
        {
            canvas.drawBitmap(image, x + GamePanel.WIDTH, 0, null);
        }
    }
 }