package cc.cloudist.acplibrary.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;
import java.lang.ref.WeakReference;
/* loaded from: classes3.dex */
public final class PieView extends View {
    private float mAngle;
    private float mBackgroundCornerRadius;
    private Paint mBackgroundPaint;
    private RectF mBackgroundRect;
    private Handler mHandler;
    private Paint mPiePaint;
    private RectF mPieRect;
    private float mRingBorderPadding;
    private Paint mRingPaint;
    private int mSize;

    public PieView(Context context, int i, int i2, float f, float f2, float f3, float f4, int i3, int i4, float f5, int i5, float f6) {
        super(context);
        this.mHandler = new PieUpdateHandler(this);
        this.mSize = i;
        this.mBackgroundCornerRadius = f2;
        this.mRingBorderPadding = f3;
        float f7 = i;
        this.mBackgroundRect = new RectF(0.0f, 0.0f, f7, f7);
        float f8 = ((f3 + f4) * f7) / 2.0f;
        float f9 = 0.0f + f8;
        float f10 = f7 - f8;
        this.mPieRect = new RectF(f9, f9, f10, f10);
        Paint paint = new Paint();
        this.mBackgroundPaint = paint;
        paint.setAntiAlias(true);
        this.mBackgroundPaint.setColor(i2);
        this.mBackgroundPaint.setAlpha((int) (f * 255.0f));
        Paint paint2 = new Paint();
        this.mRingPaint = paint2;
        paint2.setAntiAlias(true);
        this.mRingPaint.setStrokeWidth(i3);
        this.mRingPaint.setColor(i4);
        this.mRingPaint.setAlpha((int) (f5 * 255.0f));
        this.mRingPaint.setStyle(Paint.Style.STROKE);
        Paint paint3 = new Paint();
        this.mPiePaint = paint3;
        paint3.setAntiAlias(true);
        this.mPiePaint.setColor(i5);
        this.mPiePaint.setAlpha((int) (f6 * 255.0f));
    }

    public void updateAngle(float f) {
        this.mAngle = f;
        this.mHandler.sendEmptyMessage(0);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int i3 = this.mSize;
        setMeasuredDimension(i3, i3);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        RectF rectF = this.mBackgroundRect;
        float f = this.mBackgroundCornerRadius;
        canvas.drawRoundRect(rectF, f, f, this.mBackgroundPaint);
        int i = this.mSize;
        canvas.drawCircle(i / 2, i / 2, (i * (1.0f - this.mRingBorderPadding)) / 2.0f, this.mRingPaint);
        Log.d("23232", "--" + this.mAngle);
        canvas.drawArc(this.mPieRect, -90.0f, this.mAngle, true, this.mPiePaint);
    }

    /* loaded from: classes3.dex */
    private static class PieUpdateHandler extends Handler {
        WeakReference<PieView> reference;

        public PieUpdateHandler(PieView pieView) {
            this.reference = new WeakReference<>(pieView);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            PieView pieView = this.reference.get();
            if (pieView != null) {
                pieView.invalidate();
            }
        }
    }
}
