package k4;

import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import k4.h;
import k4.m;
import o4.n;
/* compiled from: SourceGenerator.java */
/* loaded from: classes.dex */
public final class a0 implements h, h.a {
    public f A;

    /* renamed from: u  reason: collision with root package name */
    public final i<?> f22818u;

    /* renamed from: v  reason: collision with root package name */
    public final h.a f22819v;

    /* renamed from: w  reason: collision with root package name */
    public int f22820w;

    /* renamed from: x  reason: collision with root package name */
    public e f22821x;

    /* renamed from: y  reason: collision with root package name */
    public Object f22822y;

    /* renamed from: z  reason: collision with root package name */
    public volatile n.a<?> f22823z;

    public a0(i<?> iVar, h.a aVar) {
        this.f22818u = iVar;
        this.f22819v = aVar;
    }

    @Override // k4.h
    public final boolean a() {
        boolean z10;
        boolean z11;
        Object obj = this.f22822y;
        if (obj != null) {
            this.f22822y = null;
            int i6 = d5.f.f12193b;
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            try {
                h4.d<X> d10 = this.f22818u.d(obj);
                g gVar = new g(d10, obj, this.f22818u.f22850i);
                h4.e eVar = this.f22823z.f27079a;
                i<?> iVar = this.f22818u;
                this.A = new f(eVar, iVar.f22855n);
                ((m.c) iVar.f22849h).a().b(this.A, gVar);
                if (Log.isLoggable("SourceGenerator", 2)) {
                    Log.v("SourceGenerator", "Finished encoding source to cache, key: " + this.A + ", data: " + obj + ", encoder: " + d10 + ", duration: " + d5.f.a(elapsedRealtimeNanos));
                }
                this.f22823z.f27081c.b();
                this.f22821x = new e(Collections.singletonList(this.f22823z.f27079a), this.f22818u, this);
            } catch (Throwable th2) {
                this.f22823z.f27081c.b();
                throw th2;
            }
        }
        e eVar2 = this.f22821x;
        if (eVar2 != null && eVar2.a()) {
            return true;
        }
        this.f22821x = null;
        this.f22823z = null;
        boolean z12 = false;
        while (!z12) {
            if (this.f22820w < this.f22818u.b().size()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                break;
            }
            ArrayList b10 = this.f22818u.b();
            int i10 = this.f22820w;
            this.f22820w = i10 + 1;
            this.f22823z = (n.a) b10.get(i10);
            if (this.f22823z != null) {
                if (!this.f22818u.f22857p.c(this.f22823z.f27081c.e())) {
                    if (this.f22818u.c(this.f22823z.f27081c.a()) != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                    }
                }
                this.f22823z.f27081c.c(this.f22818u.f22856o, new z(this, this.f22823z));
                z12 = true;
            }
        }
        return z12;
    }

    @Override // k4.h
    public final void cancel() {
        n.a<?> aVar = this.f22823z;
        if (aVar != null) {
            aVar.f27081c.cancel();
        }
    }

    @Override // k4.h.a
    public final void d() {
        throw new UnsupportedOperationException();
    }

    @Override // k4.h.a
    public final void f(h4.e eVar, Exception exc, i4.d<?> dVar, h4.a aVar) {
        this.f22819v.f(eVar, exc, dVar, this.f22823z.f27081c.e());
    }

    @Override // k4.h.a
    public final void h(h4.e eVar, Object obj, i4.d<?> dVar, h4.a aVar, h4.e eVar2) {
        this.f22819v.h(eVar, obj, dVar, this.f22823z.f27081c.e(), eVar);
    }
}
