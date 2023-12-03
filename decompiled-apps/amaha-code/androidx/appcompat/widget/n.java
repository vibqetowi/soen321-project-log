package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;
/* compiled from: AppCompatImageHelper.java */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final ImageView f1483a;

    /* renamed from: b  reason: collision with root package name */
    public j1 f1484b;

    /* renamed from: c  reason: collision with root package name */
    public j1 f1485c;

    /* renamed from: d  reason: collision with root package name */
    public int f1486d = 0;

    public n(ImageView imageView) {
        this.f1483a = imageView;
    }

    public final void a() {
        boolean z10;
        ImageView imageView = this.f1483a;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            q0.a(drawable);
        }
        if (drawable != null) {
            int i6 = Build.VERSION.SDK_INT;
            boolean z11 = true;
            if (i6 <= 21 && i6 == 21) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                if (this.f1485c == null) {
                    this.f1485c = new j1();
                }
                j1 j1Var = this.f1485c;
                j1Var.f1459a = null;
                j1Var.f1462d = false;
                j1Var.f1460b = null;
                j1Var.f1461c = false;
                ColorStateList a10 = androidx.core.widget.g.a(imageView);
                if (a10 != null) {
                    j1Var.f1462d = true;
                    j1Var.f1459a = a10;
                }
                PorterDuff.Mode b10 = androidx.core.widget.g.b(imageView);
                if (b10 != null) {
                    j1Var.f1461c = true;
                    j1Var.f1460b = b10;
                }
                if (!j1Var.f1462d && !j1Var.f1461c) {
                    z11 = false;
                } else {
                    j.e(drawable, j1Var, imageView.getDrawableState());
                }
                if (z11) {
                    return;
                }
            }
            j1 j1Var2 = this.f1484b;
            if (j1Var2 != null) {
                j.e(drawable, j1Var2, imageView.getDrawableState());
            }
        }
    }

    public final void b(AttributeSet attributeSet, int i6) {
        Drawable drawable;
        Drawable drawable2;
        int i10;
        ImageView imageView = this.f1483a;
        Context context = imageView.getContext();
        int[] iArr = kc.f.E;
        l1 m10 = l1.m(context, attributeSet, iArr, i6);
        t0.d0.p(imageView, imageView.getContext(), iArr, attributeSet, m10.f1474b, i6);
        try {
            Drawable drawable3 = imageView.getDrawable();
            if (drawable3 == null && (i10 = m10.i(1, -1)) != -1 && (drawable3 = hc.d.H(imageView.getContext(), i10)) != null) {
                imageView.setImageDrawable(drawable3);
            }
            if (drawable3 != null) {
                q0.a(drawable3);
            }
            if (m10.l(2)) {
                ColorStateList b10 = m10.b(2);
                int i11 = Build.VERSION.SDK_INT;
                androidx.core.widget.g.c(imageView, b10);
                if (i11 == 21 && (drawable2 = imageView.getDrawable()) != null && androidx.core.widget.g.a(imageView) != null) {
                    if (drawable2.isStateful()) {
                        drawable2.setState(imageView.getDrawableState());
                    }
                    imageView.setImageDrawable(drawable2);
                }
            }
            if (m10.l(3)) {
                PorterDuff.Mode c10 = q0.c(m10.h(3, -1), null);
                int i12 = Build.VERSION.SDK_INT;
                androidx.core.widget.g.d(imageView, c10);
                if (i12 == 21 && (drawable = imageView.getDrawable()) != null && androidx.core.widget.g.a(imageView) != null) {
                    if (drawable.isStateful()) {
                        drawable.setState(imageView.getDrawableState());
                    }
                    imageView.setImageDrawable(drawable);
                }
            }
        } finally {
            m10.n();
        }
    }

    public final void c(int i6) {
        ImageView imageView = this.f1483a;
        if (i6 != 0) {
            Drawable H = hc.d.H(imageView.getContext(), i6);
            if (H != null) {
                q0.a(H);
            }
            imageView.setImageDrawable(H);
        } else {
            imageView.setImageDrawable(null);
        }
        a();
    }
}
