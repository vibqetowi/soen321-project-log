package m4;

import android.util.Log;
import f4.a;
import java.io.File;
import java.io.IOException;
import m4.b;
/* compiled from: DiskLruCacheWrapper.java */
/* loaded from: classes.dex */
public final class d implements a {

    /* renamed from: v  reason: collision with root package name */
    public final File f24812v;

    /* renamed from: w  reason: collision with root package name */
    public final long f24813w;

    /* renamed from: y  reason: collision with root package name */
    public f4.a f24815y;

    /* renamed from: x  reason: collision with root package name */
    public final b f24814x = new b();

    /* renamed from: u  reason: collision with root package name */
    public final j f24811u = new j();

    @Deprecated
    public d(File file, long j10) {
        this.f24812v = file;
        this.f24813w = j10;
    }

    public final synchronized f4.a a() {
        if (this.f24815y == null) {
            this.f24815y = f4.a.s(this.f24812v, this.f24813w);
        }
        return this.f24815y;
    }

    @Override // m4.a
    public final void b(h4.e eVar, k4.g gVar) {
        b.a aVar;
        boolean z10;
        String b10 = this.f24811u.b(eVar);
        b bVar = this.f24814x;
        synchronized (bVar) {
            aVar = (b.a) bVar.f24804a.get(b10);
            if (aVar == null) {
                aVar = bVar.f24805b.a();
                bVar.f24804a.put(b10, aVar);
            }
            aVar.f24807b++;
        }
        aVar.f24806a.lock();
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + b10 + " for for Key: " + eVar);
            }
            try {
                f4.a a10 = a();
                if (a10.m(b10) == null) {
                    a.c h10 = a10.h(b10);
                    if (h10 != null) {
                        try {
                            if (gVar.f22840a.o(gVar.f22841b, h10.b(), gVar.f22842c)) {
                                f4.a.a(f4.a.this, h10, true);
                                h10.f14791c = true;
                            }
                            if (!z10) {
                                try {
                                    h10.a();
                                } catch (IOException unused) {
                                }
                            }
                        } finally {
                            if (!h10.f14791c) {
                                try {
                                    h10.a();
                                } catch (IOException unused2) {
                                }
                            }
                        }
                    } else {
                        throw new IllegalStateException("Had two simultaneous puts for: ".concat(b10));
                    }
                }
            } catch (IOException e10) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e10);
                }
            }
        } finally {
            this.f24814x.a(b10);
        }
    }

    @Override // m4.a
    public final File c(h4.e eVar) {
        String b10 = this.f24811u.b(eVar);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + b10 + " for for Key: " + eVar);
        }
        try {
            a.e m10 = a().m(b10);
            if (m10 != null) {
                return m10.f14799a[0];
            }
        } catch (IOException e10) {
            if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e10);
            }
        }
        return null;
    }
}
