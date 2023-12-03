package ub;

import android.graphics.Typeface;
/* compiled from: CancelableFontCallback.java */
/* loaded from: classes.dex */
public final class a extends com.android.volley.toolbox.a {

    /* renamed from: v  reason: collision with root package name */
    public final Typeface f33976v;

    /* renamed from: w  reason: collision with root package name */
    public final InterfaceC0567a f33977w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f33978x;

    /* compiled from: CancelableFontCallback.java */
    /* renamed from: ub.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0567a {
        void a(Typeface typeface);
    }

    public a(InterfaceC0567a interfaceC0567a, Typeface typeface) {
        this.f33976v = typeface;
        this.f33977w = interfaceC0567a;
    }

    @Override // com.android.volley.toolbox.a
    public final void m(int i6) {
        if (!this.f33978x) {
            this.f33977w.a(this.f33976v);
        }
    }

    @Override // com.android.volley.toolbox.a
    public final void n(Typeface typeface, boolean z10) {
        if (!this.f33978x) {
            this.f33977w.a(typeface);
        }
    }
}
