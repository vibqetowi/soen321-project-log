package qb;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
import t0.d0;
import t0.o0;
import t0.s0;
/* compiled from: ScrimInsetsFrameLayout.java */
/* loaded from: classes.dex */
public class n extends FrameLayout {
    public boolean A;

    /* renamed from: u  reason: collision with root package name */
    public Drawable f29476u;

    /* renamed from: v  reason: collision with root package name */
    public Rect f29477v;

    /* renamed from: w  reason: collision with root package name */
    public final Rect f29478w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f29479x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f29480y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f29481z;

    /* compiled from: ScrimInsetsFrameLayout.java */
    /* loaded from: classes.dex */
    public class a implements t0.t {
        public a() {
        }

        @Override // t0.t
        public final s0 i(View view, s0 s0Var) {
            n nVar = n.this;
            if (nVar.f29477v == null) {
                nVar.f29477v = new Rect();
            }
            nVar.f29477v.set(s0Var.b(), s0Var.d(), s0Var.c(), s0Var.a());
            nVar.a(s0Var);
            s0.k kVar = s0Var.f32351a;
            boolean z10 = true;
            if ((!kVar.j().equals(j0.e.f21622e)) && nVar.f29476u != null) {
                z10 = false;
            }
            nVar.setWillNotDraw(z10);
            WeakHashMap<View, o0> weakHashMap = d0.f32288a;
            d0.d.k(nVar);
            return kVar.c();
        }
    }

    public n(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f29477v != null && this.f29476u != null) {
            int save = canvas.save();
            canvas.translate(getScrollX(), getScrollY());
            boolean z10 = this.f29479x;
            Rect rect = this.f29478w;
            if (z10) {
                rect.set(0, 0, width, this.f29477v.top);
                this.f29476u.setBounds(rect);
                this.f29476u.draw(canvas);
            }
            if (this.f29480y) {
                rect.set(0, height - this.f29477v.bottom, width, height);
                this.f29476u.setBounds(rect);
                this.f29476u.draw(canvas);
            }
            if (this.f29481z) {
                Rect rect2 = this.f29477v;
                rect.set(0, rect2.top, rect2.left, height - rect2.bottom);
                this.f29476u.setBounds(rect);
                this.f29476u.draw(canvas);
            }
            if (this.A) {
                Rect rect3 = this.f29477v;
                rect.set(width - rect3.right, rect3.top, width, height - rect3.bottom);
                this.f29476u.setBounds(rect);
                this.f29476u.draw(canvas);
            }
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.f29476u;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.f29476u;
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public void setDrawBottomInsetForeground(boolean z10) {
        this.f29480y = z10;
    }

    public void setDrawLeftInsetForeground(boolean z10) {
        this.f29481z = z10;
    }

    public void setDrawRightInsetForeground(boolean z10) {
        this.A = z10;
    }

    public void setDrawTopInsetForeground(boolean z10) {
        this.f29479x = z10;
    }

    public void setScrimInsetForeground(Drawable drawable) {
        this.f29476u = drawable;
    }

    public n(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        this.f29478w = new Rect();
        this.f29479x = true;
        this.f29480y = true;
        this.f29481z = true;
        this.A = true;
        TypedArray d10 = t.d(context, attributeSet, ug.l.G, i6, 2132083622, new int[0]);
        this.f29476u = d10.getDrawable(0);
        d10.recycle();
        setWillNotDraw(true);
        a aVar = new a();
        WeakHashMap<View, o0> weakHashMap = d0.f32288a;
        d0.i.u(this, aVar);
    }

    public void a(s0 s0Var) {
    }
}
