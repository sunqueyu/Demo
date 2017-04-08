package com.example.administrator.demo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/**
 * 类的用途：
 * Created by ${孙鹊禹}
 * on 2017/4/7 20:01
 */

public class PointView extends View{

    private float currentX = 100;
    private float currentY = 100;
    public PointView(Context context) {
        super(context);
    }

    public PointView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public PointView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //对于画笔
        Paint paint = new Paint();
        //设置抗锯齿
        paint.setAntiAlias(true);
        //设置画笔颜色
        paint.setColor(Color.BLUE);
        //样式
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeWidth(5);
        // 阴影
        paint.setShadowLayer(10, 0, 0, Color.CYAN);
        // 点的坐标 x0,y0,x1,y1......
        //float[] pts = { 50, 50, 100, 100, 200, 200, 300, 300, 0, 100, 100, 0 };
        //canvas.drawPoints(pts, paint);
        // 绘制点的时候，隔着几个点绘制几个，最多不到多少点
        //canvas.drawPoints(pts, 1, 6, paint);

        //指定圆心坐标，半径就OK
        canvas.drawCircle(currentX, currentY, 50, paint);


       /* //设置文字大小
        paint.setTextSize(40);
        //指定坐标，最好指定文字大小
        String []str = new String[]{"哈","哈","哈","哈","哈"};
        for (int i = 0; i < str.length; i++) {
            canvas.drawText(str[i], 100, 200+2*i, paint);
        }

        //将文字设置到指定路径上
        Path path = new Path();
        paint.setTextSize(50);
        //x轴，y轴，半径，方向
        path.addCircle(300, 500, 100, Path.Direction.CCW);
        canvas.drawTextOnPath("今天学自定义View！！！！！！", path, 0, 0, paint);*/
    }

    @Override
    protected boolean dispatchHoverEvent(MotionEvent event) {
        return super.dispatchHoverEvent(event);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        currentX=event.getX();
        currentY=event.getY();
        invalidate();
        return true;
    }
}
