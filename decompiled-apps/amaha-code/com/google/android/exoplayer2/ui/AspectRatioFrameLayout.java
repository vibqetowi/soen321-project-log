package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
/* loaded from: classes.dex */
public final class AspectRatioFrameLayout extends FrameLayout {

    /* renamed from: x  reason: collision with root package name */
    public static final /* synthetic */ int f7049x = 0;

    /* renamed from: u  reason: collision with root package name */
    public final b f7050u;

    /* renamed from: v  reason: collision with root package name */
    public float f7051v;

    /* renamed from: w  reason: collision with root package name */
    public int f7052w;

    /* loaded from: classes.dex */
    public interface a {
    }

    /* loaded from: classes.dex */
    public final class b implements Runnable {

        /* renamed from: u  reason: collision with root package name */
        public boolean f7053u;

        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f7053u = false;
            int i6 = AspectRatioFrameLayout.f7049x;
            AspectRatioFrameLayout.this.getClass();
        }
    }

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7052w = 0;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, hc.d.f17371w, 0, 0);
            try {
                this.f7052w = obtainStyledAttributes.getInt(0, 0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.f7050u = new b();
    }

    public int getResizeMode() {
        return this.f7052w;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i6, int i10) {
        float f;
        float f2;
        super.onMeasure(i6, i10);
        if (this.f7051v <= 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f10 = measuredWidth;
        float f11 = measuredHeight;
        float f12 = (this.f7051v / (f10 / f11)) - 1.0f;
        float abs = Math.abs(f12);
        b bVar = this.f7050u;
        if (abs <= 0.01f) {
            if (!bVar.f7053u) {
                bVar.f7053u = true;
                AspectRatioFrameLayout.this.post(bVar);
                return;
            }
            return;
        }
        int i11 = this.f7052w;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 4) {
                        if (f12 > 0.0f) {
                            f = this.f7051v;
                        } else {
                            f2 = this.f7051v;
                        }
                    }
                } else {
                    f = this.f7051v;
                }
                measuredWidth = (int) (f11 * f);
            } else {
                f2 = this.f7051v;
            }
            measuredHeight = (int) (f10 / f2);
        } else if (f12 > 0.0f) {
            f2 = this.f7051v;
            measuredHeight = (int) (f10 / f2);
        } else {
            f = this.f7051v;
            measuredWidth = (int) (f11 * f);
        }
        if (!bVar.f7053u) {
            bVar.f7053u = true;
            AspectRatioFrameLayout.this.post(bVar);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }

    public void setAspectRatio(float f) {
        if (this.f7051v != f) {
            this.f7051v = f;
            requestLayout();
        }
    }

    public void setResizeMode(int i6) {
        if (this.f7052w != i6) {
            this.f7052w = i6;
            requestLayout();
        }
    }

    public void setAspectRatioListener(a aVar) {
    }
}
