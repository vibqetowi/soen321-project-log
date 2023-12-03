package a3;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.concurrent.Callable;
/* compiled from: LottieCompositionFactory.java */
/* loaded from: classes.dex */
public final class h implements Callable<p<c>> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ InputStream f202u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ String f203v = null;

    public h(ByteArrayInputStream byteArrayInputStream) {
        this.f202u = byteArrayInputStream;
    }

    @Override // java.util.concurrent.Callable
    public final p<c> call() {
        return d.b(this.f202u, this.f203v);
    }
}
