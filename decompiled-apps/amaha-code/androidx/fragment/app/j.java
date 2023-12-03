package androidx.fragment.app;

import android.graphics.Rect;
import android.view.View;
/* compiled from: DefaultSpecialEffectsController.java */
/* loaded from: classes.dex */
public final class j implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ o0 f2219u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ View f2220v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Rect f2221w;

    public j(o0 o0Var, View view, Rect rect) {
        this.f2219u = o0Var;
        this.f2220v = view;
        this.f2221w = rect;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2219u.getClass();
        o0.g(this.f2220v, this.f2221w);
    }
}
