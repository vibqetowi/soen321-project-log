package cc.cloudist.acplibrary.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import cc.cloudist.acplibrary.components.FlowerDataCalc;
import cc.cloudist.acplibrary.components.PetalCoordinate;
import java.lang.ref.WeakReference;
import java.util.List;
/* loaded from: classes3.dex */
public final class FlowerView extends View {
    private float mBackgroundCornerRadius;
    private Paint mBackgroundPaint;
    private RectF mBackgroundRect;
    private int mCurrentFocusIndex;
    private int mFinalSize;
    private Handler mHandler;
    private boolean mIsExpandWidth;
    private int[] mPetalColors;
    private List<PetalCoordinate> mPetalCoordinates;
    private int mPetalCount;
    private Paint mPetalPaint;
    private int mSize;
    private String mText;
    private int mTextHeight;
    private int mTextMarginTop;
    private Paint mTextPaint;
    private int mTextWidth;

    public FlowerView(Context context, int i, int i2, float f, float f2, int i3, int i4, float f3, float f4, float f5, int i5, int i6, String str, float f6, int i7, float f7, int i8, boolean z) {
        super(context);
        this.mHandler = new FlowerUpdateHandler(this);
        this.mTextMarginTop = i8;
        init(i, i2, f, f2, i3, i4, f3, f4, f5, i5, i6, str, f6, i7, f7, z);
    }

    private void init(int i, int i2, float f, float f2, int i3, int i4, float f3, float f4, float f5, int i5, int i6, String str, float f6, int i7, float f7, boolean z) {
        this.mIsExpandWidth = (str == null || str.length() == 0 || !z) ? false : true;
        this.mSize = i;
        this.mPetalCount = i4;
        this.mBackgroundCornerRadius = f2;
        Paint paint = new Paint();
        this.mBackgroundPaint = paint;
        paint.setAntiAlias(true);
        this.mBackgroundPaint.setColor(i2);
        this.mBackgroundPaint.setAlpha((int) (f * 255.0f));
        Paint paint2 = new Paint();
        this.mPetalPaint = paint2;
        paint2.setAntiAlias(true);
        this.mPetalPaint.setStrokeWidth(i3);
        this.mPetalPaint.setStrokeCap(Paint.Cap.ROUND);
        if (str != null && str.length() != 0) {
            this.mText = str;
            Paint paint3 = new Paint();
            this.mTextPaint = paint3;
            paint3.setAntiAlias(true);
            this.mTextPaint.setColor(i7);
            this.mTextPaint.setAlpha((int) (f7 * 255.0f));
            this.mTextPaint.setTextSize(f6);
            Rect rect = new Rect();
            this.mTextPaint.getTextBounds(str, 0, str.length(), rect);
            this.mTextHeight = rect.bottom - rect.top;
            this.mTextWidth = rect.right - rect.left;
        } else {
            this.mTextMarginTop = 0;
        }
        if (this.mIsExpandWidth) {
            int i8 = this.mSize;
            int i9 = this.mTextHeight;
            int i10 = this.mTextMarginTop;
            this.mBackgroundRect = new RectF(0.0f, 0.0f, i8 + i9 + i10, i8 + i9 + i10);
            this.mFinalSize = this.mSize + this.mTextHeight + this.mTextMarginTop;
        } else {
            int i11 = this.mSize;
            this.mBackgroundRect = new RectF(0.0f, 0.0f, i11, i11 + this.mTextHeight + this.mTextMarginTop);
            this.mFinalSize = this.mSize;
        }
        FlowerDataCalc flowerDataCalc = new FlowerDataCalc(i4);
        int i12 = this.mSize;
        this.mPetalCoordinates = flowerDataCalc.getSegmentsCoordinates(i12, (int) (i12 * f4), (int) (i12 * f5), i4, this.mFinalSize);
        this.mPetalColors = flowerDataCalc.getSegmentsColors(i5, i6, i4, (int) (f3 * 255.0f));
    }

    public void updateFocusIndex(int i) {
        this.mCurrentFocusIndex = i;
        this.mHandler.sendEmptyMessage(0);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.mIsExpandWidth) {
            int i3 = this.mSize;
            int i4 = this.mTextHeight;
            int i5 = this.mTextMarginTop;
            setMeasuredDimension(i3 + i4 + i5, i3 + i4 + i5);
            return;
        }
        int i6 = this.mSize;
        setMeasuredDimension(i6, this.mTextHeight + i6 + this.mTextMarginTop);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        RectF rectF = this.mBackgroundRect;
        float f = this.mBackgroundCornerRadius;
        canvas.drawRoundRect(rectF, f, f, this.mBackgroundPaint);
        for (int i = 0; i < this.mPetalCount; i++) {
            PetalCoordinate petalCoordinate = this.mPetalCoordinates.get(i);
            this.mPetalPaint.setColor(this.mPetalColors[(this.mCurrentFocusIndex + i) % this.mPetalCount]);
            canvas.drawLine(petalCoordinate.getStartX(), petalCoordinate.getStartY(), petalCoordinate.getEndX(), petalCoordinate.getEndY(), this.mPetalPaint);
        }
        String str = this.mText;
        if (str != null) {
            canvas.drawText(str, (this.mFinalSize / 2) - (this.mTextWidth / 2), this.mSize, this.mTextPaint);
        }
    }

    /* loaded from: classes3.dex */
    private static class FlowerUpdateHandler extends Handler {
        WeakReference<FlowerView> reference;

        public FlowerUpdateHandler(FlowerView flowerView) {
            this.reference = new WeakReference<>(flowerView);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            FlowerView flowerView = this.reference.get();
            if (flowerView != null) {
                flowerView.invalidate();
            }
        }
    }
}
