package nv;

import java.io.IOException;
import kotlin.jvm.internal.k;
import ss.l;
/* compiled from: DiskLruCache.kt */
/* loaded from: classes2.dex */
public final class h extends k implements l<IOException, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ e f26883u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(e eVar) {
        super(1);
        this.f26883u = eVar;
    }

    @Override // ss.l
    public final hs.k invoke(IOException iOException) {
        IOException it = iOException;
        kotlin.jvm.internal.i.g(it, "it");
        byte[] bArr = mv.b.f25755a;
        this.f26883u.G = true;
        return hs.k.f19476a;
    }
}
