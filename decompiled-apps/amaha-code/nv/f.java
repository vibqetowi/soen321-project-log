package nv;

import nv.e;
import zv.k;
import zv.z;
/* compiled from: DiskLruCache.kt */
/* loaded from: classes2.dex */
public final class f extends k {

    /* renamed from: v  reason: collision with root package name */
    public boolean f26878v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ z f26879w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ e f26880x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ e.b f26881y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(z zVar, e eVar, e.b bVar) {
        super(zVar);
        this.f26879w = zVar;
        this.f26880x = eVar;
        this.f26881y = bVar;
    }

    @Override // zv.k, zv.z, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
        if (!this.f26878v) {
            this.f26878v = true;
            e eVar = this.f26880x;
            e.b bVar = this.f26881y;
            synchronized (eVar) {
                int i6 = bVar.f26871h - 1;
                bVar.f26871h = i6;
                if (i6 == 0 && bVar.f) {
                    eVar.J(bVar);
                }
                hs.k kVar = hs.k.f19476a;
            }
        }
    }
}
