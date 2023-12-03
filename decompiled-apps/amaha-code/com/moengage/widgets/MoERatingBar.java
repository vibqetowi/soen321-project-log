package com.moengage.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import androidx.annotation.Keep;
import sc.b;
@Keep
/* loaded from: classes.dex */
public class MoERatingBar extends RatingBar {
    private int color;
    private int colorFillPressedOff;
    private Bitmap colorsJoined;

    /* renamed from: dp  reason: collision with root package name */
    private final float f10260dp;
    private float interiorAngleModifier;
    private final Paint paintInside;
    private final Paint paintOutline;
    private Path path;
    private int polygonVertices;
    private final RectF rectangle;
    private float starSize;
    private int strokeWidth;

    public MoERatingBar(Context context) {
        this(context, null);
    }

    private Bitmap combineBitmaps(Bitmap bitmap, Bitmap bitmap2) {
        this.colorsJoined = Bitmap.createBitmap(bitmap2.getWidth() + bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(this.colorsJoined);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        canvas.drawBitmap(bitmap2, bitmap.getWidth(), 0.0f, (Paint) null);
        return this.colorsJoined;
    }

    private Path createStarBySize(float f, int i6) {
        if (i6 == 0) {
            this.path.addOval(new RectF(0.0f, 0.0f, f, f), Path.Direction.CW);
            this.path.close();
            return this.path;
        }
        float f2 = f / 2.0f;
        float f10 = f2 / this.interiorAngleModifier;
        float radians = (float) Math.toRadians(360.0f / i6);
        float f11 = radians / 2.0f;
        this.path.setFillType(Path.FillType.EVEN_ODD);
        this.path.moveTo(f2, 0.0f);
        for (double d10 = 0.0d; d10 < 6.2831855f; d10 += radians) {
            double d11 = f2;
            this.path.lineTo((float) (d11 - (Math.sin(d10) * d11)), (float) (d11 - (Math.cos(d10) * d11)));
            double d12 = f10;
            double d13 = f11 + d10;
            this.path.lineTo((float) (d11 - (Math.sin(d13) * d12)), (float) (d11 - (Math.cos(d13) * d12)));
        }
        this.path.close();
        return this.path;
    }

    private void getXmlAttrs(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, b.M, 0, 0);
        try {
            this.color = obtainStyledAttributes.getInteger(0, Color.rgb(97, 97, 97));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private void init() {
        this.paintInside.setAntiAlias(true);
        this.paintOutline.setStrokeWidth(this.strokeWidth);
        this.paintOutline.setStyle(Paint.Style.STROKE);
        this.paintOutline.setStrokeJoin(Paint.Join.ROUND);
        this.paintOutline.setAntiAlias(true);
    }

    private BitmapShader updateShader(int i6, int i10) {
        int rating = (int) ((getRating() * getWidth()) / getNumStars());
        if (rating > 0 && getWidth() - rating > 0) {
            Bitmap createBitmap = Bitmap.createBitmap(rating, getHeight(), Bitmap.Config.ARGB_8888);
            createBitmap.eraseColor(i6);
            Bitmap createBitmap2 = Bitmap.createBitmap(getWidth() - rating, getHeight(), Bitmap.Config.ARGB_8888);
            createBitmap2.eraseColor(i10);
            this.colorsJoined = combineBitmaps(createBitmap, createBitmap2);
        } else {
            Bitmap createBitmap3 = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
            this.colorsJoined = createBitmap3;
            if (rating <= 0) {
                i6 = i10;
            }
            createBitmap3.eraseColor(i6);
        }
        Bitmap bitmap = this.colorsJoined;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        return new BitmapShader(bitmap, tileMode, tileMode);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void onDraw(Canvas canvas) {
        this.paintInside.setShader(updateShader(this.color, this.colorFillPressedOff));
        this.path.rewind();
        this.path = createStarBySize(this.starSize, this.polygonVertices);
        for (int i6 = 0; i6 < getNumStars(); i6++) {
            this.paintOutline.setColor(this.color);
            this.path.computeBounds(this.rectangle, true);
            this.path.offset((((i6 + 0.5f) * getWidth()) / getNumStars()) - this.rectangle.centerX(), (getHeight() / 2) - this.rectangle.centerY());
            canvas.drawPath(this.path, this.paintInside);
            canvas.drawPath(this.path, this.paintOutline);
        }
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onMeasure(int i6, int i10) {
        int numStars = (int) (this.f10260dp * 40.0f * getNumStars());
        int mode = View.MeasureSpec.getMode(i6);
        int size = View.MeasureSpec.getSize(i6);
        int mode2 = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i10);
        if (mode == 1073741824) {
            numStars = size;
        } else if (mode == Integer.MIN_VALUE) {
            numStars = Math.min(numStars, size);
        }
        if (mode2 != 1073741824) {
            if (mode2 == Integer.MIN_VALUE) {
                size2 = Math.min(size2, numStars / getNumStars());
            } else {
                size2 = numStars / getNumStars();
            }
        }
        float min = Math.min(size2, numStars / getNumStars());
        this.starSize = min;
        if (this.strokeWidth < 0) {
            this.strokeWidth = (int) (min / 15.0f);
        }
        this.starSize = min - this.strokeWidth;
        setMeasuredDimension(numStars, size2);
    }

    public void setColor(int i6) {
        this.color = i6;
    }

    public MoERatingBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.color = Color.rgb(97, 97, 97);
        this.colorFillPressedOff = 0;
        this.polygonVertices = 5;
        this.strokeWidth = -1;
        this.paintInside = new Paint();
        this.paintOutline = new Paint();
        this.path = new Path();
        this.rectangle = new RectF();
        this.interiorAngleModifier = 2.2f;
        this.f10260dp = getResources().getDisplayMetrics().density;
        getXmlAttrs(context, attributeSet);
        init();
    }

    public MoERatingBar(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        this.color = Color.rgb(97, 97, 97);
        this.colorFillPressedOff = 0;
        this.polygonVertices = 5;
        this.strokeWidth = -1;
        this.paintInside = new Paint();
        this.paintOutline = new Paint();
        this.path = new Path();
        this.rectangle = new RectF();
        this.interiorAngleModifier = 2.2f;
        this.f10260dp = getResources().getDisplayMetrics().density;
        getXmlAttrs(context, attributeSet);
        init();
    }
}
