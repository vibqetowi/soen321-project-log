package com.facebook.shimmer;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.facebook.shimmer.a;
import kc.f;
/* loaded from: classes.dex */
public class ShimmerFrameLayout extends FrameLayout {

    /* renamed from: u  reason: collision with root package name */
    public final Paint f6111u;

    /* renamed from: v  reason: collision with root package name */
    public final j6.a f6112v;

    /* renamed from: w  reason: collision with root package name */
    public final boolean f6113w;

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a.b c0130a;
        this.f6111u = new Paint();
        j6.a aVar = new j6.a();
        this.f6112v = aVar;
        this.f6113w = true;
        setWillNotDraw(false);
        aVar.setCallback(this);
        if (attributeSet == null) {
            a(new a.C0130a().a());
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.f23215d0, 0, 0);
        try {
            if (obtainStyledAttributes.hasValue(4) && obtainStyledAttributes.getBoolean(4, false)) {
                c0130a = new a.c();
            } else {
                c0130a = new a.C0130a();
            }
            a(c0130a.b(obtainStyledAttributes).a());
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public final void a(a aVar) {
        boolean z10;
        PorterDuff.Mode mode;
        j6.a aVar2 = this.f6112v;
        aVar2.f = aVar;
        if (aVar != null) {
            Paint paint = aVar2.f21684b;
            if (aVar2.f.f6128p) {
                mode = PorterDuff.Mode.DST_IN;
            } else {
                mode = PorterDuff.Mode.SRC_IN;
            }
            paint.setXfermode(new PorterDuffXfermode(mode));
        }
        aVar2.b();
        if (aVar2.f != null) {
            ValueAnimator valueAnimator = aVar2.f21687e;
            if (valueAnimator != null) {
                z10 = valueAnimator.isStarted();
                aVar2.f21687e.cancel();
                aVar2.f21687e.removeAllUpdateListeners();
            } else {
                z10 = false;
            }
            a aVar3 = aVar2.f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, ((float) (aVar3.f6131t / aVar3.f6130s)) + 1.0f);
            aVar2.f21687e = ofFloat;
            ofFloat.setRepeatMode(aVar2.f.r);
            aVar2.f21687e.setRepeatCount(aVar2.f.f6129q);
            ValueAnimator valueAnimator2 = aVar2.f21687e;
            a aVar4 = aVar2.f;
            valueAnimator2.setDuration(aVar4.f6130s + aVar4.f6131t);
            aVar2.f21687e.addUpdateListener(aVar2.f21683a);
            if (z10) {
                aVar2.f21687e.start();
            }
        }
        aVar2.invalidateSelf();
        if (aVar != null && aVar.f6126n) {
            setLayerType(2, this.f6111u);
        } else {
            setLayerType(0, null);
        }
    }

    public final void b() {
        boolean z10;
        j6.a aVar = this.f6112v;
        ValueAnimator valueAnimator = aVar.f21687e;
        if (valueAnimator != null) {
            if (valueAnimator != null && valueAnimator.isStarted()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10 && aVar.getCallback() != null) {
                aVar.f21687e.start();
            }
        }
    }

    public final void c() {
        boolean z10;
        j6.a aVar = this.f6112v;
        ValueAnimator valueAnimator = aVar.f21687e;
        if (valueAnimator != null) {
            if (valueAnimator != null && valueAnimator.isStarted()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                aVar.f21687e.cancel();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f6113w) {
            this.f6112v.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f6112v.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i6, int i10, int i11, int i12) {
        super.onLayout(z10, i6, i10, i11, i12);
        this.f6112v.setBounds(0, 0, getWidth(), getHeight());
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f6112v) {
            return false;
        }
        return true;
    }
}
