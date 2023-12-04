package cc.cloudist.acplibrary.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.List;
/* loaded from: classes3.dex */
public class CustomView extends View {
    private List<Bitmap> mBitmaps;
    private int mCurrentIndex;
    private Handler mHandler;
    private RectF mRect;
    private int mSize;

    public CustomView(Context context, int i, List<Bitmap> list) {
        super(context);
        this.mCurrentIndex = 0;
        this.mHandler = new CustomUpdateHandler(this);
        this.mSize = i;
        float f = i;
        this.mRect = new RectF(0.0f, 0.0f, f, f);
        this.mBitmaps = list;
    }

    public void updateIndex(int i) {
        this.mCurrentIndex = i;
        this.mHandler.sendEmptyMessage(0);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int i3 = this.mSize;
        setMeasuredDimension(i3, i3);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        Log.d("23232", "draw");
        canvas.drawBitmap(this.mBitmaps.get(this.mCurrentIndex), (Rect) null, this.mRect, (Paint) null);
    }

    /* loaded from: classes3.dex */
    private static class CustomUpdateHandler extends Handler {
        WeakReference<CustomView> reference;

        public CustomUpdateHandler(CustomView customView) {
            this.reference = new WeakReference<>(customView);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            CustomView customView = this.reference.get();
            if (customView != null) {
                customView.invalidate();
            }
        }
    }
}
