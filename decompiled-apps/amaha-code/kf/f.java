package kf;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PreDrawListener.java */
/* loaded from: classes.dex */
public final class f implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: u  reason: collision with root package name */
    public final Handler f23313u = new Handler(Looper.getMainLooper());

    /* renamed from: v  reason: collision with root package name */
    public final AtomicReference<View> f23314v;

    /* renamed from: w  reason: collision with root package name */
    public final Runnable f23315w;

    /* renamed from: x  reason: collision with root package name */
    public final Runnable f23316x;

    public f(View view, ef.a aVar, ef.a aVar2) {
        this.f23314v = new AtomicReference<>(view);
        this.f23315w = aVar;
        this.f23316x = aVar2;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        View andSet = this.f23314v.getAndSet(null);
        if (andSet == null) {
            return true;
        }
        andSet.getViewTreeObserver().removeOnPreDrawListener(this);
        Handler handler = this.f23313u;
        handler.post(this.f23315w);
        handler.postAtFrontOfQueue(this.f23316x);
        return true;
    }
}
