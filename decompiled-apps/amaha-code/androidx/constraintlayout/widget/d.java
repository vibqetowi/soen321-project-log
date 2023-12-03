package androidx.constraintlayout.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
/* compiled from: Placeholder.java */
/* loaded from: classes.dex */
public final class d extends View {

    /* renamed from: u  reason: collision with root package name */
    public int f1918u;

    /* renamed from: v  reason: collision with root package name */
    public View f1919v;

    /* renamed from: w  reason: collision with root package name */
    public int f1920w;

    public View getContent() {
        return this.f1919v;
    }

    public int getEmptyVisibility() {
        return this.f1920w;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize(rect.height());
            int height = rect.height();
            int width = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((width / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((rect.height() / 2.0f) + (height / 2.0f)) - rect.bottom, paint);
        }
    }

    public void setContentId(int i6) {
        View findViewById;
        if (this.f1918u == i6) {
            return;
        }
        View view = this.f1919v;
        if (view != null) {
            view.setVisibility(0);
            ((ConstraintLayout.a) this.f1919v.getLayoutParams()).f1765f0 = false;
            this.f1919v = null;
        }
        this.f1918u = i6;
        if (i6 != -1 && (findViewById = ((View) getParent()).findViewById(i6)) != null) {
            findViewById.setVisibility(8);
        }
    }

    public void setEmptyVisibility(int i6) {
        this.f1920w = i6;
    }
}
