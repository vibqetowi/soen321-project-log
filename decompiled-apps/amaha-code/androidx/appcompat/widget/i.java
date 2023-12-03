package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import androidx.core.widget.b;
import k0.a;
/* compiled from: AppCompatCompoundButtonHelper.java */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final CompoundButton f1425a;

    /* renamed from: b  reason: collision with root package name */
    public ColorStateList f1426b = null;

    /* renamed from: c  reason: collision with root package name */
    public PorterDuff.Mode f1427c = null;

    /* renamed from: d  reason: collision with root package name */
    public boolean f1428d = false;

    /* renamed from: e  reason: collision with root package name */
    public boolean f1429e = false;
    public boolean f;

    public i(CompoundButton compoundButton) {
        this.f1425a = compoundButton;
    }

    public final void a() {
        CompoundButton compoundButton = this.f1425a;
        Drawable a10 = androidx.core.widget.b.a(compoundButton);
        if (a10 != null) {
            if (this.f1428d || this.f1429e) {
                Drawable mutate = k0.a.g(a10).mutate();
                if (this.f1428d) {
                    a.b.h(mutate, this.f1426b);
                }
                if (this.f1429e) {
                    a.b.i(mutate, this.f1427c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(mutate);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0054 A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:3:0x0019, B:5:0x0020, B:7:0x0026, B:12:0x0036, B:14:0x003c, B:16:0x0042, B:17:0x004d, B:19:0x0054, B:20:0x005b, B:22:0x0062), top: B:28:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062 A[Catch: all -> 0x0073, TRY_LEAVE, TryCatch #0 {all -> 0x0073, blocks: (B:3:0x0019, B:5:0x0020, B:7:0x0026, B:12:0x0036, B:14:0x003c, B:16:0x0042, B:17:0x004d, B:19:0x0054, B:20:0x005b, B:22:0x0062), top: B:28:0x0019 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(AttributeSet attributeSet, int i6) {
        int i10;
        int i11;
        CompoundButton compoundButton = this.f1425a;
        Context context = compoundButton.getContext();
        int[] iArr = kc.f.L;
        l1 m10 = l1.m(context, attributeSet, iArr, i6);
        t0.d0.p(compoundButton, compoundButton.getContext(), iArr, attributeSet, m10.f1474b, i6);
        boolean z10 = true;
        try {
            if (m10.l(1) && (i11 = m10.i(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(hc.d.H(compoundButton.getContext(), i11));
                } catch (Resources.NotFoundException unused) {
                }
                if (!z10 && m10.l(0) && (i10 = m10.i(0, 0)) != 0) {
                    compoundButton.setButtonDrawable(hc.d.H(compoundButton.getContext(), i10));
                }
                if (m10.l(2)) {
                    b.a.c(compoundButton, m10.b(2));
                }
                if (m10.l(3)) {
                    b.a.d(compoundButton, q0.c(m10.h(3, -1), null));
                }
            }
            z10 = false;
            if (!z10) {
                compoundButton.setButtonDrawable(hc.d.H(compoundButton.getContext(), i10));
            }
            if (m10.l(2)) {
            }
            if (m10.l(3)) {
            }
        } finally {
            m10.n();
        }
    }
}
