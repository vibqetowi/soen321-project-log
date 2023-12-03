package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import java.util.WeakHashMap;
import t0.d0;
/* compiled from: AppCompatBackgroundHelper.java */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final View f1397a;

    /* renamed from: d  reason: collision with root package name */
    public j1 f1400d;

    /* renamed from: e  reason: collision with root package name */
    public j1 f1401e;
    public j1 f;

    /* renamed from: c  reason: collision with root package name */
    public int f1399c = -1;

    /* renamed from: b  reason: collision with root package name */
    public final j f1398b = j.a();

    public e(View view) {
        this.f1397a = view;
    }

    public final void a() {
        boolean z10;
        View view = this.f1397a;
        Drawable background = view.getBackground();
        if (background != null) {
            int i6 = Build.VERSION.SDK_INT;
            boolean z11 = true;
            if (i6 <= 21 ? i6 == 21 : this.f1400d != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                if (this.f == null) {
                    this.f = new j1();
                }
                j1 j1Var = this.f;
                j1Var.f1459a = null;
                j1Var.f1462d = false;
                j1Var.f1460b = null;
                j1Var.f1461c = false;
                WeakHashMap<View, t0.o0> weakHashMap = t0.d0.f32288a;
                ColorStateList g5 = d0.i.g(view);
                if (g5 != null) {
                    j1Var.f1462d = true;
                    j1Var.f1459a = g5;
                }
                PorterDuff.Mode h10 = d0.i.h(view);
                if (h10 != null) {
                    j1Var.f1461c = true;
                    j1Var.f1460b = h10;
                }
                if (!j1Var.f1462d && !j1Var.f1461c) {
                    z11 = false;
                } else {
                    j.e(background, j1Var, view.getDrawableState());
                }
                if (z11) {
                    return;
                }
            }
            j1 j1Var2 = this.f1401e;
            if (j1Var2 != null) {
                j.e(background, j1Var2, view.getDrawableState());
                return;
            }
            j1 j1Var3 = this.f1400d;
            if (j1Var3 != null) {
                j.e(background, j1Var3, view.getDrawableState());
            }
        }
    }

    public final ColorStateList b() {
        j1 j1Var = this.f1401e;
        if (j1Var != null) {
            return j1Var.f1459a;
        }
        return null;
    }

    public final PorterDuff.Mode c() {
        j1 j1Var = this.f1401e;
        if (j1Var != null) {
            return j1Var.f1460b;
        }
        return null;
    }

    public final void d(AttributeSet attributeSet, int i6) {
        ColorStateList i10;
        View view = this.f1397a;
        Context context = view.getContext();
        int[] iArr = kc.f.Z;
        l1 m10 = l1.m(context, attributeSet, iArr, i6);
        View view2 = this.f1397a;
        t0.d0.p(view2, view2.getContext(), iArr, attributeSet, m10.f1474b, i6);
        boolean z10 = false;
        try {
            if (m10.l(0)) {
                this.f1399c = m10.i(0, -1);
                j jVar = this.f1398b;
                Context context2 = view.getContext();
                int i11 = this.f1399c;
                synchronized (jVar) {
                    i10 = jVar.f1441a.i(i11, context2);
                }
                if (i10 != null) {
                    g(i10);
                }
            }
            if (m10.l(1)) {
                t0.d0.s(view, m10.b(1));
            }
            if (m10.l(2)) {
                PorterDuff.Mode c10 = q0.c(m10.h(2, -1), null);
                int i12 = Build.VERSION.SDK_INT;
                d0.i.r(view, c10);
                if (i12 == 21) {
                    Drawable background = view.getBackground();
                    z10 = (d0.i.g(view) == null && d0.i.h(view) == null) ? true : true;
                    if (background != null && z10) {
                        if (background.isStateful()) {
                            background.setState(view.getDrawableState());
                        }
                        d0.d.q(view, background);
                    }
                }
            }
        } finally {
            m10.n();
        }
    }

    public final void e() {
        this.f1399c = -1;
        g(null);
        a();
    }

    public final void f(int i6) {
        ColorStateList colorStateList;
        this.f1399c = i6;
        j jVar = this.f1398b;
        if (jVar != null) {
            Context context = this.f1397a.getContext();
            synchronized (jVar) {
                colorStateList = jVar.f1441a.i(i6, context);
            }
        } else {
            colorStateList = null;
        }
        g(colorStateList);
        a();
    }

    public final void g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f1400d == null) {
                this.f1400d = new j1();
            }
            j1 j1Var = this.f1400d;
            j1Var.f1459a = colorStateList;
            j1Var.f1462d = true;
        } else {
            this.f1400d = null;
        }
        a();
    }

    public final void h(ColorStateList colorStateList) {
        if (this.f1401e == null) {
            this.f1401e = new j1();
        }
        j1 j1Var = this.f1401e;
        j1Var.f1459a = colorStateList;
        j1Var.f1462d = true;
        a();
    }

    public final void i(PorterDuff.Mode mode) {
        if (this.f1401e == null) {
            this.f1401e = new j1();
        }
        j1 j1Var = this.f1401e;
        j1Var.f1460b = mode;
        j1Var.f1461c = true;
        a();
    }
}
