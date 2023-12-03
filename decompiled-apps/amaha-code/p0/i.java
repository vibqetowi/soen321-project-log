package p0;

import android.content.Context;
import java.util.concurrent.Callable;
import p0.k;
/* compiled from: FontRequestWorker.java */
/* loaded from: classes.dex */
public final class i implements Callable<k.a> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ String f27841u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Context f27842v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ f f27843w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ int f27844x;

    public i(String str, Context context, f fVar, int i6) {
        this.f27841u = str;
        this.f27842v = context;
        this.f27843w = fVar;
        this.f27844x = i6;
    }

    @Override // java.util.concurrent.Callable
    public final k.a call() {
        try {
            return k.a(this.f27841u, this.f27842v, this.f27843w, this.f27844x);
        } catch (Throwable unused) {
            return new k.a(-3);
        }
    }
}
