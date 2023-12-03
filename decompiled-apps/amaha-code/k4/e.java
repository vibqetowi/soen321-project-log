package k4;

import i4.d;
import java.io.File;
import java.util.List;
import k4.h;
import k4.m;
import o4.n;
/* compiled from: DataCacheGenerator.java */
/* loaded from: classes.dex */
public final class e implements h, d.a<Object> {
    public int A;
    public volatile n.a<?> B;
    public File C;

    /* renamed from: u  reason: collision with root package name */
    public final List<h4.e> f22832u;

    /* renamed from: v  reason: collision with root package name */
    public final i<?> f22833v;

    /* renamed from: w  reason: collision with root package name */
    public final h.a f22834w;

    /* renamed from: x  reason: collision with root package name */
    public int f22835x = -1;

    /* renamed from: y  reason: collision with root package name */
    public h4.e f22836y;

    /* renamed from: z  reason: collision with root package name */
    public List<o4.n<File, ?>> f22837z;

    public e(List<h4.e> list, i<?> iVar, h.a aVar) {
        this.f22832u = list;
        this.f22833v = iVar;
        this.f22834w = aVar;
    }

    @Override // k4.h
    public final boolean a() {
        boolean z10;
        boolean z11;
        boolean z12;
        while (true) {
            List<o4.n<File, ?>> list = this.f22837z;
            if (list != null) {
                if (this.A < list.size()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    this.B = null;
                    boolean z13 = false;
                    while (!z13) {
                        if (this.A < this.f22837z.size()) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (!z11) {
                            break;
                        }
                        List<o4.n<File, ?>> list2 = this.f22837z;
                        int i6 = this.A;
                        this.A = i6 + 1;
                        File file = this.C;
                        i<?> iVar = this.f22833v;
                        this.B = list2.get(i6).b(file, iVar.f22847e, iVar.f, iVar.f22850i);
                        if (this.B != null) {
                            if (this.f22833v.c(this.B.f27081c.a()) != null) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (z12) {
                                this.B.f27081c.c(this.f22833v.f22856o, this);
                                z13 = true;
                            }
                        }
                    }
                    return z13;
                }
            }
            int i10 = this.f22835x + 1;
            this.f22835x = i10;
            if (i10 >= this.f22832u.size()) {
                return false;
            }
            h4.e eVar = this.f22832u.get(this.f22835x);
            i<?> iVar2 = this.f22833v;
            File c10 = ((m.c) iVar2.f22849h).a().c(new f(eVar, iVar2.f22855n));
            this.C = c10;
            if (c10 != null) {
                this.f22836y = eVar;
                this.f22837z = this.f22833v.f22845c.f5941b.g(c10);
                this.A = 0;
            }
        }
    }

    @Override // k4.h
    public final void cancel() {
        n.a<?> aVar = this.B;
        if (aVar != null) {
            aVar.f27081c.cancel();
        }
    }

    @Override // i4.d.a
    public final void d(Exception exc) {
        this.f22834w.f(this.f22836y, exc, this.B.f27081c, h4.a.DATA_DISK_CACHE);
    }

    @Override // i4.d.a
    public final void f(Object obj) {
        this.f22834w.h(this.f22836y, obj, this.B.f27081c, h4.a.DATA_DISK_CACHE, this.f22836y);
    }
}
