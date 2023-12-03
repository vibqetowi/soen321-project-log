package p0;

import android.content.Context;
import java.util.concurrent.Callable;
import p0.k;
/* compiled from: FontRequestWorker.java */
/* loaded from: classes.dex */
public final class g implements Callable<k.a> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ String f27836u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Context f27837v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ f f27838w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ int f27839x;

    public g(String str, Context context, f fVar, int i6) {
        this.f27836u = str;
        this.f27837v = context;
        this.f27838w = fVar;
        this.f27839x = i6;
    }

    @Override // java.util.concurrent.Callable
    public final k.a call() {
        return k.a(this.f27836u, this.f27837v, this.f27838w, this.f27839x);
    }
}
