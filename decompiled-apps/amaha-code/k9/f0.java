package k9;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.internal.i;
import com.google.android.gms.common.api.internal.p;
import com.theinnerhour.b2b.utils.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import k9.e;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final class f0 extends com.google.android.gms.common.api.b<e.b> implements x0 {
    public static final p9.b G = new p9.b("CastClient");
    public static final com.google.android.gms.common.api.a<e.b> H = new com.google.android.gms.common.api.a<>("Cast.API_CXLESS", new b0(), p9.i.f28039a);
    public final CastDevice A;
    public final HashMap B;
    public final HashMap C;
    public final e.c D;
    public final List<w0> E;
    public int F;

    /* renamed from: k  reason: collision with root package name */
    public final e0 f23119k;

    /* renamed from: l  reason: collision with root package name */
    public com.google.android.gms.internal.cast.f f23120l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f23121m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f23122n;

    /* renamed from: o  reason: collision with root package name */
    public ya.i<e.a> f23123o;

    /* renamed from: p  reason: collision with root package name */
    public ya.i<Status> f23124p;

    /* renamed from: q  reason: collision with root package name */
    public final AtomicLong f23125q;
    public final Object r;

    /* renamed from: s  reason: collision with root package name */
    public final Object f23126s;

    /* renamed from: t  reason: collision with root package name */
    public d f23127t;

    /* renamed from: u  reason: collision with root package name */
    public String f23128u;

    /* renamed from: v  reason: collision with root package name */
    public double f23129v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f23130w;

    /* renamed from: x  reason: collision with root package name */
    public int f23131x;

    /* renamed from: y  reason: collision with root package name */
    public int f23132y;

    /* renamed from: z  reason: collision with root package name */
    public v f23133z;

    public f0(Context context, e.b bVar) {
        super(context, H, bVar, b.a.f7315c);
        this.f23119k = new e0(this);
        this.r = new Object();
        this.f23126s = new Object();
        this.E = Collections.synchronizedList(new ArrayList());
        this.D = bVar.f23110v;
        this.A = bVar.f23109u;
        this.B = new HashMap();
        this.C = new HashMap();
        this.f23125q = new AtomicLong(0L);
        this.F = 1;
        k();
    }

    public static Handler c(f0 f0Var) {
        if (f0Var.f23120l == null) {
            f0Var.f23120l = new com.google.android.gms.internal.cast.f(f0Var.f);
        }
        return f0Var.f23120l;
    }

    public static void d(f0 f0Var, int i6) {
        synchronized (f0Var.f23126s) {
            ya.i<Status> iVar = f0Var.f23124p;
            if (iVar == null) {
                return;
            }
            if (i6 == 0) {
                iVar.b(new Status(0, null));
            } else {
                iVar.a(f6.b.x0(new Status(i6, null)));
            }
            f0Var.f23124p = null;
        }
    }

    public static void e(f0 f0Var, long j10, int i6) {
        ya.i iVar;
        synchronized (f0Var.B) {
            HashMap hashMap = f0Var.B;
            Long valueOf = Long.valueOf(j10);
            iVar = (ya.i) hashMap.get(valueOf);
            f0Var.B.remove(valueOf);
        }
        if (iVar != null) {
            if (i6 == 0) {
                iVar.b(null);
            } else {
                iVar.a(f6.b.x0(new Status(i6, null)));
            }
        }
    }

    public final ya.v f(e0 e0Var) {
        if (e0Var != null) {
            Looper looper = this.f;
            v9.o.i(looper, "Looper must not be null");
            new ma.c(looper);
            v9.o.e("castDeviceControllerListenerKey");
            i.a aVar = new i.a(e0Var);
            com.google.android.gms.common.api.internal.f fVar = this.f7314j;
            fVar.getClass();
            ya.i iVar = new ya.i();
            fVar.e(iVar, 8415, this);
            com.google.android.gms.common.api.internal.x0 x0Var = new com.google.android.gms.common.api.internal.x0(aVar, iVar);
            ka.d dVar = fVar.G;
            dVar.sendMessage(dVar.obtainMessage(13, new com.google.android.gms.common.api.internal.k0(x0Var, fVar.C.get(), this)));
            return iVar.f38392a;
        }
        throw new NullPointerException("Listener must not be null");
    }

    public final void g() {
        G.b("removing all MessageReceivedCallbacks", new Object[0]);
        synchronized (this.C) {
            this.C.clear();
        }
    }

    public final void h() {
        boolean z10;
        if (this.F == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        v9.o.j("Not connected to device", z10);
    }

    public final void i(int i6) {
        synchronized (this.r) {
            ya.i<e.a> iVar = this.f23123o;
            if (iVar != null) {
                iVar.a(f6.b.x0(new Status(i6, null)));
            }
            this.f23123o = null;
        }
    }

    public final ya.v j() {
        p.a aVar = new p.a();
        aVar.f7418a = ca.a.I;
        aVar.f7421d = 8403;
        ya.v b10 = b(1, aVar.a());
        g();
        f(this.f23119k);
        return b10;
    }

    public final void k() {
        CastDevice castDevice = this.A;
        if (!castDevice.g0(Constants.PROFILE_ASSET_DOWNLOAD_JOB_ID) && castDevice.g0(4) && !castDevice.g0(1)) {
            "Chromecast Audio".equals(castDevice.f7251y);
        }
    }
}
