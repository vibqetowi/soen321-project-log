package l9;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.framework.zzar;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.internal.i;
import com.google.android.gms.common.api.internal.l0;
import com.google.android.gms.common.api.internal.n0;
import com.google.android.gms.common.api.internal.o0;
import com.google.android.gms.common.api.internal.v0;
import com.google.android.gms.internal.cast.e4;
import com.google.android.gms.internal.cast.k1;
import java.util.HashSet;
import k9.e;
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
/* loaded from: classes.dex */
public final class c extends e {

    /* renamed from: l  reason: collision with root package name */
    public static final p9.b f24162l = new p9.b("CastSession");

    /* renamed from: c  reason: collision with root package name */
    public final Context f24163c;

    /* renamed from: d  reason: collision with root package name */
    public final HashSet f24164d;

    /* renamed from: e  reason: collision with root package name */
    public final k0 f24165e;
    public final b f;

    /* renamed from: g  reason: collision with root package name */
    public final n9.j f24166g;

    /* renamed from: h  reason: collision with root package name */
    public k9.f0 f24167h;

    /* renamed from: i  reason: collision with root package name */
    public m9.g f24168i;

    /* renamed from: j  reason: collision with root package name */
    public CastDevice f24169j;

    /* renamed from: k  reason: collision with root package name */
    public e.a f24170k;

    public c(Context context, String str, String str2, b bVar, n9.j jVar) {
        super(context, str, str2);
        k0 f12;
        this.f24164d = new HashSet();
        this.f24163c = context.getApplicationContext();
        this.f = bVar;
        this.f24166g = jVar;
        da.a i6 = i();
        a0 a0Var = new a0(this);
        p9.b bVar2 = k1.f7569a;
        if (i6 != null) {
            try {
                f12 = k1.a(context).f1(bVar, i6, a0Var);
            } catch (RemoteException | zzar e10) {
                k1.f7569a.a("Unable to call %s on %s.", e10, "newCastSessionImpl", e4.class.getSimpleName());
            }
            this.f24165e = f12;
        }
        f12 = null;
        this.f24165e = f12;
    }

    public static void j(c cVar, int i6) {
        n9.j jVar = cVar.f24166g;
        if (jVar.f25972l) {
            jVar.f25972l = false;
            m9.g gVar = jVar.f25969i;
            if (gVar != null) {
                v9.o.d("Must be called from the main thread.");
                gVar.f24989g.remove(jVar);
            }
            jVar.f25964c.X1(null);
            n9.b bVar = jVar.f25966e;
            bVar.b();
            bVar.f25952e = null;
            n9.b bVar2 = jVar.f;
            if (bVar2 != null) {
                bVar2.b();
                bVar2.f25952e = null;
            }
            MediaSessionCompat mediaSessionCompat = jVar.f25971k;
            if (mediaSessionCompat != null) {
                mediaSessionCompat.f879a.f897a.setSessionActivity(null);
                jVar.f25971k.f(null, null);
                jVar.f25971k.g(new MediaMetadataCompat(new Bundle()));
                jVar.i(0, null);
                jVar.f25971k.e(false);
                jVar.f25971k.c();
                jVar.f25971k = null;
            }
            jVar.f25969i = null;
            jVar.f25970j = null;
            jVar.getClass();
            jVar.m();
            if (i6 == 0) {
                jVar.o();
            }
        }
        k9.f0 f0Var = cVar.f24167h;
        if (f0Var != null) {
            f0Var.j();
            cVar.f24167h = null;
        }
        cVar.f24169j = null;
        m9.g gVar2 = cVar.f24168i;
        if (gVar2 != null) {
            gVar2.k(null);
            cVar.f24168i = null;
        }
    }

    public static void k(c cVar, String str, ya.h hVar) {
        p9.b bVar = f24162l;
        if (cVar.f24165e == null) {
            return;
        }
        try {
            boolean isSuccessful = hVar.isSuccessful();
            k0 k0Var = cVar.f24165e;
            if (isSuccessful) {
                e.a aVar = (e.a) hVar.getResult();
                cVar.f24170k = aVar;
                if (aVar.X() != null && aVar.X().f0()) {
                    bVar.b("%s() -> success result", str);
                    m9.g gVar = new m9.g(new p9.l());
                    cVar.f24168i = gVar;
                    gVar.k(cVar.f24167h);
                    cVar.f24168i.l();
                    n9.j jVar = cVar.f24166g;
                    m9.g gVar2 = cVar.f24168i;
                    v9.o.d("Must be called from the main thread.");
                    jVar.g(gVar2, cVar.f24169j);
                    k9.d L = aVar.L();
                    v9.o.h(L);
                    String q10 = aVar.q();
                    String Z = aVar.Z();
                    v9.o.h(Z);
                    k0Var.x0(L, q10, Z, aVar.m());
                    return;
                } else if (aVar.X() != null) {
                    bVar.b("%s() -> failure result", str);
                    k0Var.x(aVar.X().f7298v);
                    return;
                }
            } else {
                Exception exception = hVar.getException();
                if (exception instanceof ApiException) {
                    k0Var.x(((ApiException) exception).f7291u.f7298v);
                    return;
                }
            }
            k0Var.x(2476);
        } catch (RemoteException e10) {
            bVar.a("Unable to call %s on %s.", e10, "methods", k0.class.getSimpleName());
        }
    }

    @Override // l9.e
    public final void a(boolean z10) {
        k0 k0Var = this.f24165e;
        if (k0Var != null) {
            try {
                k0Var.r1(z10);
            } catch (RemoteException e10) {
                f24162l.a("Unable to call %s on %s.", e10, "disconnectFromDevice", k0.class.getSimpleName());
            }
            c(0);
        }
    }

    @Override // l9.e
    public final long b() {
        MediaInfo mediaInfo;
        v9.o.d("Must be called from the main thread.");
        m9.g gVar = this.f24168i;
        long j10 = 0;
        if (gVar == null) {
            return 0L;
        }
        synchronized (gVar.f24984a) {
            v9.o.d("Must be called from the main thread.");
            k9.n nVar = gVar.f24986c.A;
            if (nVar == null) {
                mediaInfo = null;
            } else {
                mediaInfo = nVar.f23170u;
            }
            if (mediaInfo != null) {
                j10 = mediaInfo.f7263y;
            }
        }
        return j10 - this.f24168i.b();
    }

    @Override // l9.e
    public final void d(@RecentlyNonNull Bundle bundle) {
        this.f24169j = CastDevice.f0(bundle);
    }

    @Override // l9.e
    public final void e(@RecentlyNonNull Bundle bundle) {
        this.f24169j = CastDevice.f0(bundle);
    }

    @Override // l9.e
    public final void f(@RecentlyNonNull Bundle bundle) {
        l(bundle);
    }

    @Override // l9.e
    public final void g(@RecentlyNonNull Bundle bundle) {
        l(bundle);
    }

    @Override // l9.e
    public final void h(@RecentlyNonNull Bundle bundle) {
        this.f24169j = CastDevice.f0(bundle);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(Bundle bundle) {
        m9.a aVar;
        boolean z10;
        boolean z11;
        boolean o10;
        CastDevice f02 = CastDevice.f0(bundle);
        this.f24169j = f02;
        if (f02 == null) {
            v9.o.d("Must be called from the main thread.");
            p pVar = this.f24175a;
            if (pVar != null) {
                try {
                    o10 = pVar.o();
                } catch (RemoteException e10) {
                    e.f24174b.a("Unable to call %s on %s.", e10, "isResuming", p.class.getSimpleName());
                }
                if (!o10) {
                    p pVar2 = this.f24175a;
                    if (pVar2 != null) {
                        try {
                            pVar2.m();
                            return;
                        } catch (RemoteException e11) {
                            e.f24174b.a("Unable to call %s on %s.", e11, "notifyFailedToResumeSession", p.class.getSimpleName());
                            return;
                        }
                    }
                    return;
                }
                p pVar3 = this.f24175a;
                if (pVar3 != null) {
                    try {
                        pVar3.n();
                        return;
                    } catch (RemoteException e12) {
                        e.f24174b.a("Unable to call %s on %s.", e12, "notifyFailedToStartSession", p.class.getSimpleName());
                        return;
                    }
                }
                return;
            }
            o10 = false;
            if (!o10) {
            }
        } else {
            k9.f0 f0Var = this.f24167h;
            m9.f fVar = null;
            if (f0Var != null) {
                f0Var.j();
                this.f24167h = null;
            }
            f24162l.b("Acquiring a connection to Google Play Services for %s", this.f24169j);
            CastDevice castDevice = this.f24169j;
            v9.o.h(castDevice);
            Bundle bundle2 = new Bundle();
            b bVar = this.f;
            if (bVar == null) {
                aVar = null;
            } else {
                aVar = bVar.f24160z;
            }
            if (aVar != null) {
                fVar = aVar.f24942x;
            }
            if (aVar != null && aVar.f24943y) {
                z10 = true;
            } else {
                z10 = false;
            }
            Intent intent = new Intent(this.f24163c, r1.y.class);
            intent.setPackage(this.f24163c.getPackageName());
            boolean z12 = !this.f24163c.getPackageManager().queryBroadcastReceivers(intent, 0).isEmpty();
            if (fVar != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            bundle2.putBoolean("com.google.android.gms.cast.EXTRA_CAST_FRAMEWORK_NOTIFICATION_ENABLED", z11);
            bundle2.putBoolean("com.google.android.gms.cast.EXTRA_CAST_REMOTE_CONTROL_NOTIFICATION_ENABLED", z10);
            bundle2.putBoolean("com.google.android.gms.cast.EXTRA_CAST_ALWAYS_FOLLOW_SESSION_ENABLED", z12);
            e.b.a aVar2 = new e.b.a(castDevice, new b0(this));
            aVar2.f23115c = bundle2;
            e.b bVar2 = new e.b(aVar2);
            Context context = this.f24163c;
            int i6 = k9.e.f23108a;
            k9.f0 f0Var2 = new k9.f0(context, bVar2);
            f0Var2.E.add(new c0(this));
            this.f24167h = f0Var2;
            k9.e0 e0Var = f0Var2.f23119k;
            if (e0Var != null) {
                Looper looper = f0Var2.f;
                v9.o.i(looper, "Looper must not be null");
                com.google.android.gms.common.api.internal.i<L> iVar = new com.google.android.gms.common.api.internal.i<>(looper, e0Var);
                com.google.android.gms.common.api.internal.m mVar = new com.google.android.gms.common.api.internal.m();
                g.x xVar = new g.x(10, f0Var2);
                tr.r rVar = tr.r.f33552k0;
                mVar.f7409c = iVar;
                mVar.f7407a = xVar;
                mVar.f7408b = rVar;
                mVar.f7410d = new s9.d[]{k9.x.f23193a};
                mVar.f7411e = 8428;
                i.a<L> aVar3 = mVar.f7409c.f7386b;
                v9.o.i(aVar3, "Key must not be null");
                com.google.android.gms.common.api.internal.i<L> iVar2 = mVar.f7409c;
                s9.d[] dVarArr = mVar.f7410d;
                int i10 = mVar.f7411e;
                n0 n0Var = new n0(mVar, iVar2, dVarArr, i10);
                o0 o0Var = new o0(mVar, aVar3);
                v9.o.i(iVar2.f7386b, "Listener has already been released.");
                com.google.android.gms.common.api.internal.f fVar2 = f0Var2.f7314j;
                fVar2.getClass();
                ya.i iVar3 = new ya.i();
                fVar2.e(iVar3, i10, f0Var2);
                v0 v0Var = new v0(new l0(n0Var, o0Var), iVar3);
                ka.d dVar = fVar2.G;
                dVar.sendMessage(dVar.obtainMessage(8, new com.google.android.gms.common.api.internal.k0(v0Var, fVar2.C.get(), f0Var2)));
                return;
            }
            throw new NullPointerException("Listener must not be null");
        }
    }
}
