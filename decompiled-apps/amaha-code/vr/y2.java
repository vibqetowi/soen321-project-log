package vr;

import io.grpc.l;
import java.util.List;
import java.util.Map;
import vr.b3;
/* compiled from: ScParser.java */
/* loaded from: classes2.dex */
public final class y2 extends l.f {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f36126a;

    /* renamed from: b  reason: collision with root package name */
    public final int f36127b;

    /* renamed from: c  reason: collision with root package name */
    public final int f36128c;

    /* renamed from: d  reason: collision with root package name */
    public final j f36129d;

    public y2(boolean z10, int i6, int i10, j jVar) {
        this.f36126a = z10;
        this.f36127b = i6;
        this.f36128c = i10;
        this.f36129d = jVar;
    }

    @Override // io.grpc.l.f
    public final l.b a(Map<String, ?> map) {
        List<b3.a> d10;
        l.b bVar;
        try {
            j jVar = this.f36129d;
            jVar.getClass();
            Object obj = null;
            if (map != null) {
                try {
                    d10 = b3.d(b3.b(map));
                } catch (RuntimeException e10) {
                    bVar = new l.b(tr.i0.f33482g.g("can't parse load balancer configuration").f(e10));
                }
            } else {
                d10 = null;
            }
            if (d10 != null && !d10.isEmpty()) {
                bVar = b3.c(d10, jVar.f35714a);
            } else {
                bVar = null;
            }
            if (bVar != null) {
                tr.i0 i0Var = bVar.f20491a;
                if (i0Var != null) {
                    return new l.b(i0Var);
                }
                obj = bVar.f20492b;
            }
            return new l.b(f2.a(map, this.f36126a, this.f36127b, this.f36128c, obj));
        } catch (RuntimeException e11) {
            return new l.b(tr.i0.f33482g.g("failed to parse service config").f(e11));
        }
    }
}
