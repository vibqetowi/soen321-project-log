package qv;

import java.util.List;
import lv.d0;
import lv.u;
import lv.z;
/* compiled from: RealInterceptorChain.kt */
/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final pv.d f30146a;

    /* renamed from: b  reason: collision with root package name */
    public final List<u> f30147b;

    /* renamed from: c  reason: collision with root package name */
    public final int f30148c;

    /* renamed from: d  reason: collision with root package name */
    public final pv.b f30149d;

    /* renamed from: e  reason: collision with root package name */
    public final z f30150e;
    public final int f;

    /* renamed from: g  reason: collision with root package name */
    public final int f30151g;

    /* renamed from: h  reason: collision with root package name */
    public final int f30152h;

    /* renamed from: i  reason: collision with root package name */
    public int f30153i;

    /* JADX WARN: Multi-variable type inference failed */
    public f(pv.d call, List<? extends u> interceptors, int i6, pv.b bVar, z request, int i10, int i11, int i12) {
        kotlin.jvm.internal.i.g(call, "call");
        kotlin.jvm.internal.i.g(interceptors, "interceptors");
        kotlin.jvm.internal.i.g(request, "request");
        this.f30146a = call;
        this.f30147b = interceptors;
        this.f30148c = i6;
        this.f30149d = bVar;
        this.f30150e = request;
        this.f = i10;
        this.f30151g = i11;
        this.f30152h = i12;
    }

    public static f b(f fVar, int i6, pv.b bVar, z zVar, int i10) {
        int i11;
        int i12;
        int i13;
        if ((i10 & 1) != 0) {
            i6 = fVar.f30148c;
        }
        int i14 = i6;
        if ((i10 & 2) != 0) {
            bVar = fVar.f30149d;
        }
        pv.b bVar2 = bVar;
        if ((i10 & 4) != 0) {
            zVar = fVar.f30150e;
        }
        z request = zVar;
        if ((i10 & 8) != 0) {
            i11 = fVar.f;
        } else {
            i11 = 0;
        }
        if ((i10 & 16) != 0) {
            i12 = fVar.f30151g;
        } else {
            i12 = 0;
        }
        if ((i10 & 32) != 0) {
            i13 = fVar.f30152h;
        } else {
            i13 = 0;
        }
        fVar.getClass();
        kotlin.jvm.internal.i.g(request, "request");
        return new f(fVar.f30146a, fVar.f30147b, i14, bVar2, request, i11, i12, i13);
    }

    public final pv.e a() {
        pv.b bVar = this.f30149d;
        if (bVar == null) {
            return null;
        }
        return bVar.f;
    }

    public final d0 c(z request) {
        boolean z10;
        boolean z11;
        boolean z12;
        kotlin.jvm.internal.i.g(request, "request");
        List<u> list = this.f30147b;
        int size = list.size();
        boolean z13 = false;
        int i6 = this.f30148c;
        if (i6 < size) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f30153i++;
            pv.b bVar = this.f30149d;
            if (bVar != null) {
                if (bVar.f29026c.b(request.f24751a)) {
                    if (this.f30153i == 1) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (!z12) {
                        throw new IllegalStateException(("network interceptor " + list.get(i6 - 1) + " must call proceed() exactly once").toString());
                    }
                } else {
                    throw new IllegalStateException(("network interceptor " + list.get(i6 - 1) + " must retain the same host and port").toString());
                }
            }
            int i10 = i6 + 1;
            f b10 = b(this, i10, null, request, 58);
            u uVar = list.get(i6);
            d0 a10 = uVar.a(b10);
            if (a10 != null) {
                if (bVar != null) {
                    if (i10 < list.size() && b10.f30153i != 1) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    if (!z11) {
                        throw new IllegalStateException(("network interceptor " + uVar + " must call proceed() exactly once").toString());
                    }
                }
                if (a10.A != null) {
                    z13 = true;
                }
                if (z13) {
                    return a10;
                }
                throw new IllegalStateException(("interceptor " + uVar + " returned a response with no body").toString());
            }
            throw new NullPointerException("interceptor " + uVar + " returned null");
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}
