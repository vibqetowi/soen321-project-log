package nv;

import java.io.IOException;
import ta.v;
/* compiled from: DiskLruCache.kt */
/* loaded from: classes2.dex */
public final class g extends ov.a {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ e f26882e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(e eVar, String str) {
        super(str, true);
        this.f26882e = eVar;
    }

    @Override // ov.a
    public final long a() {
        e eVar = this.f26882e;
        synchronized (eVar) {
            if (!eVar.I || eVar.J) {
                return -1L;
            }
            try {
                eVar.O();
            } catch (IOException unused) {
                eVar.K = true;
            }
            try {
                if (eVar.m()) {
                    eVar.I();
                    eVar.F = 0;
                }
            } catch (IOException unused2) {
                eVar.L = true;
                eVar.D = v.h(new zv.d());
            }
            return -1L;
        }
    }
}
