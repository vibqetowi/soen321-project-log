package a3;

import android.content.Context;
import android.content.res.Resources;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
/* compiled from: LottieCompositionFactory.java */
/* loaded from: classes.dex */
public final class g implements Callable<p<c>> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ WeakReference f199u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Context f200v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ int f201w;

    public g(WeakReference weakReference, Context context, int i6) {
        this.f199u = weakReference;
        this.f200v = context;
        this.f201w = i6;
    }

    @Override // java.util.concurrent.Callable
    public final p<c> call() {
        Context context = (Context) this.f199u.get();
        if (context == null) {
            context = this.f200v;
        }
        int i6 = this.f201w;
        try {
            return d.b(context.getResources().openRawResource(i6), d.h(i6, context));
        } catch (Resources.NotFoundException e10) {
            return new p<>(e10);
        }
    }
}
