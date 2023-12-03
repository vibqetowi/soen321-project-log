package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.theinnerhour.b2b.R;
import k0.a;
import t0.d0;
/* compiled from: AppCompatSeekBarHelper.java */
/* loaded from: classes.dex */
public final class x extends s {

    /* renamed from: d  reason: collision with root package name */
    public final SeekBar f1576d;

    /* renamed from: e  reason: collision with root package name */
    public Drawable f1577e;
    public ColorStateList f;

    /* renamed from: g  reason: collision with root package name */
    public PorterDuff.Mode f1578g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1579h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f1580i;

    public x(SeekBar seekBar) {
        super(seekBar);
        this.f = null;
        this.f1578g = null;
        this.f1579h = false;
        this.f1580i = false;
        this.f1576d = seekBar;
    }

    @Override // androidx.appcompat.widget.s
    public final void a(AttributeSet attributeSet, int i6) {
        super.a(attributeSet, R.attr.seekBarStyle);
        SeekBar seekBar = this.f1576d;
        Context context = seekBar.getContext();
        int[] iArr = kc.f.F;
        l1 m10 = l1.m(context, attributeSet, iArr, R.attr.seekBarStyle);
        t0.d0.p(seekBar, seekBar.getContext(), iArr, attributeSet, m10.f1474b, R.attr.seekBarStyle);
        Drawable f = m10.f(0);
        if (f != null) {
            seekBar.setThumb(f);
        }
        Drawable e10 = m10.e(1);
        Drawable drawable = this.f1577e;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f1577e = e10;
        if (e10 != null) {
            e10.setCallback(seekBar);
            k0.a.c(e10, d0.e.d(seekBar));
            if (e10.isStateful()) {
                e10.setState(seekBar.getDrawableState());
            }
            c();
        }
        seekBar.invalidate();
        if (m10.l(3)) {
            this.f1578g = q0.c(m10.h(3, -1), this.f1578g);
            this.f1580i = true;
        }
        if (m10.l(2)) {
            this.f = m10.b(2);
            this.f1579h = true;
        }
        m10.n();
        c();
    }

    public final void c() {
        Drawable drawable = this.f1577e;
        if (drawable != null) {
            if (this.f1579h || this.f1580i) {
                Drawable g5 = k0.a.g(drawable.mutate());
                this.f1577e = g5;
                if (this.f1579h) {
                    a.b.h(g5, this.f);
                }
                if (this.f1580i) {
                    a.b.i(this.f1577e, this.f1578g);
                }
                if (this.f1577e.isStateful()) {
                    this.f1577e.setState(this.f1576d.getDrawableState());
                }
            }
        }
    }

    public final void d(Canvas canvas) {
        int i6;
        if (this.f1577e != null) {
            SeekBar seekBar = this.f1576d;
            int max = seekBar.getMax();
            int i10 = 1;
            if (max > 1) {
                int intrinsicWidth = this.f1577e.getIntrinsicWidth();
                int intrinsicHeight = this.f1577e.getIntrinsicHeight();
                if (intrinsicWidth >= 0) {
                    i6 = intrinsicWidth / 2;
                } else {
                    i6 = 1;
                }
                if (intrinsicHeight >= 0) {
                    i10 = intrinsicHeight / 2;
                }
                this.f1577e.setBounds(-i6, -i10, i6, i10);
                float width = ((seekBar.getWidth() - seekBar.getPaddingLeft()) - seekBar.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(seekBar.getPaddingLeft(), seekBar.getHeight() / 2);
                for (int i11 = 0; i11 <= max; i11++) {
                    this.f1577e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
