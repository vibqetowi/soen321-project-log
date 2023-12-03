package kf;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: FirstDrawDoneListener.java */
/* loaded from: classes.dex */
public final class c implements ViewTreeObserver.OnDrawListener {

    /* renamed from: a  reason: collision with root package name */
    public final Handler f23307a = new Handler(Looper.getMainLooper());

    /* renamed from: b  reason: collision with root package name */
    public final AtomicReference<View> f23308b;

    /* renamed from: c  reason: collision with root package name */
    public final Runnable f23309c;

    public c(View view, ef.a aVar) {
        this.f23308b = new AtomicReference<>(view);
        this.f23309c = aVar;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        final View andSet = this.f23308b.getAndSet(null);
        if (andSet == null) {
            return;
        }
        andSet.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: kf.a
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                c cVar = c.this;
                cVar.getClass();
                andSet.getViewTreeObserver().removeOnDrawListener(cVar);
            }
        });
        this.f23307a.postAtFrontOfQueue(this.f23309c);
    }
}
