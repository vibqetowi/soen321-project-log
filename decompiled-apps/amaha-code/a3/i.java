package a3;

import java.io.ByteArrayInputStream;
import java.util.concurrent.Callable;
/* compiled from: LottieCompositionFactory.java */
/* loaded from: classes.dex */
public final class i implements Callable<p<c>> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ String f204u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ String f205v = null;

    public i(String str) {
        this.f204u = str;
    }

    @Override // java.util.concurrent.Callable
    public final p<c> call() {
        zv.t j10 = ta.v.j(ta.v.P(new ByteArrayInputStream(this.f204u.getBytes())));
        String[] strArr = l3.c.f24004y;
        return d.c(new l3.d(j10), this.f205v, true);
    }
}
