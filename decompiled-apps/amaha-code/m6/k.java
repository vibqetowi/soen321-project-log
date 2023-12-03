package m6;

import android.view.View;
import android.view.ViewTreeObserver;
/* compiled from: ViewUtil.java */
/* loaded from: classes.dex */
public final class k implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserver f24918u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ View f24919v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Runnable f24920w;

    public k(ViewTreeObserver viewTreeObserver, View view, i iVar) {
        this.f24918u = viewTreeObserver;
        this.f24919v = view;
        this.f24920w = iVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ViewTreeObserver viewTreeObserver = this.f24918u;
        if (!viewTreeObserver.isAlive()) {
            viewTreeObserver = this.f24919v.getViewTreeObserver();
        }
        viewTreeObserver.removeOnGlobalLayoutListener(this);
        this.f24920w.run();
    }
}
