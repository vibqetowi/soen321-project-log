package sv;

import java.io.IOException;
import kotlin.jvm.internal.x;
import sv.e;
/* compiled from: TaskQueue.kt */
/* loaded from: classes2.dex */
public final class i extends ov.a {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ e.c f32153e;
    public final /* synthetic */ boolean f = false;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ u f32154g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(String str, e.c cVar, u uVar) {
        super(str, true);
        this.f32153e = cVar;
        this.f32154g = uVar;
    }

    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [T, sv.u] */
    /* JADX WARN: Type inference failed for: r2v3 */
    @Override // ov.a
    public final long a() {
        ?? r22;
        long a10;
        int i6;
        int i10;
        q[] qVarArr;
        e.c cVar = this.f32153e;
        boolean z10 = this.f;
        u settings = this.f32154g;
        cVar.getClass();
        kotlin.jvm.internal.i.g(settings, "settings");
        x xVar = new x();
        e eVar = cVar.f32143v;
        synchronized (eVar.S) {
            synchronized (eVar) {
                u uVar = eVar.M;
                if (z10) {
                    r22 = settings;
                } else {
                    u uVar2 = new u();
                    uVar2.b(uVar);
                    uVar2.b(settings);
                    r22 = uVar2;
                }
                xVar.f23469u = r22;
                a10 = r22.a() - uVar.a();
                i6 = 0;
                i10 = (a10 > 0L ? 1 : (a10 == 0L ? 0 : -1));
                if (i10 != 0 && !eVar.f32129w.isEmpty()) {
                    Object[] array = eVar.f32129w.values().toArray(new q[0]);
                    if (array != null) {
                        qVarArr = (q[]) array;
                        u uVar3 = (u) xVar.f23469u;
                        kotlin.jvm.internal.i.g(uVar3, "<set-?>");
                        eVar.M = uVar3;
                        eVar.E.c(new f(kotlin.jvm.internal.i.n(" onSettings", eVar.f32130x), eVar, xVar), 0L);
                        hs.k kVar = hs.k.f19476a;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                    }
                }
                qVarArr = null;
                u uVar32 = (u) xVar.f23469u;
                kotlin.jvm.internal.i.g(uVar32, "<set-?>");
                eVar.M = uVar32;
                eVar.E.c(new f(kotlin.jvm.internal.i.n(" onSettings", eVar.f32130x), eVar, xVar), 0L);
                hs.k kVar2 = hs.k.f19476a;
            }
            try {
                eVar.S.a((u) xVar.f23469u);
            } catch (IOException e10) {
                eVar.e(e10);
            }
            hs.k kVar3 = hs.k.f19476a;
        }
        if (qVarArr != null) {
            int length = qVarArr.length;
            while (i6 < length) {
                q qVar = qVarArr[i6];
                i6++;
                synchronized (qVar) {
                    qVar.f += a10;
                    if (i10 > 0) {
                        qVar.notifyAll();
                    }
                    hs.k kVar4 = hs.k.f19476a;
                }
            }
            return -1L;
        }
        return -1L;
    }
}
