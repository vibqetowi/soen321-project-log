package p9;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.internal.BinderWrapper;
import com.theinnerhour.b2b.utils.Constants;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicLong;
import k9.e;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final class y extends v9.f<e> {

    /* renamed from: p0  reason: collision with root package name */
    public static final b f28064p0 = new b("CastClientImpl");

    /* renamed from: q0  reason: collision with root package name */
    public static final Object f28065q0 = new Object();

    /* renamed from: r0  reason: collision with root package name */
    public static final Object f28066r0 = new Object();
    public k9.d W;
    public final CastDevice X;
    public final e.c Y;
    public final HashMap Z;

    /* renamed from: a0  reason: collision with root package name */
    public final long f28067a0;

    /* renamed from: b0  reason: collision with root package name */
    public final Bundle f28068b0;
    public x c0;

    /* renamed from: d0  reason: collision with root package name */
    public String f28069d0;
    public boolean e0;

    /* renamed from: f0  reason: collision with root package name */
    public boolean f28070f0;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f28071g0;

    /* renamed from: h0  reason: collision with root package name */
    public double f28072h0;

    /* renamed from: i0  reason: collision with root package name */
    public k9.v f28073i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f28074j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f28075k0;

    /* renamed from: l0  reason: collision with root package name */
    public String f28076l0;

    /* renamed from: m0  reason: collision with root package name */
    public String f28077m0;

    /* renamed from: n0  reason: collision with root package name */
    public Bundle f28078n0;

    /* renamed from: o0  reason: collision with root package name */
    public final HashMap f28079o0;

    public y(Context context, Looper looper, v9.c cVar, CastDevice castDevice, long j10, e.c cVar2, Bundle bundle, c.a aVar, c.b bVar) {
        super(context, looper, 10, cVar, aVar, bVar);
        this.X = castDevice;
        this.Y = cVar2;
        this.f28067a0 = j10;
        this.f28068b0 = bundle;
        this.Z = new HashMap();
        new AtomicLong(0L);
        this.f28079o0 = new HashMap();
        this.f28074j0 = -1;
        this.f28075k0 = -1;
        this.W = null;
        this.f28069d0 = null;
        this.f28072h0 = 0.0d;
        I();
        this.e0 = false;
        this.f28073i0 = null;
        I();
    }

    public static void J(y yVar, long j10, int i6) {
        com.google.android.gms.common.api.internal.d dVar;
        synchronized (yVar.f28079o0) {
            dVar = (com.google.android.gms.common.api.internal.d) yVar.f28079o0.remove(Long.valueOf(j10));
        }
        if (dVar != null) {
            dVar.a(new Status(i6, null));
        }
    }

    @Override // v9.b
    public final String A() {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }

    @Override // v9.b
    public final void C(s9.b bVar) {
        bVar.getClass();
        System.currentTimeMillis();
        f28064p0.b("removing all MessageReceivedCallbacks", new Object[0]);
        synchronized (this.Z) {
            this.Z.clear();
        }
    }

    @Override // v9.b
    public final void D(int i6, IBinder iBinder, Bundle bundle, int i10) {
        f28064p0.b("in onPostInitHandler; statusCode=%d", Integer.valueOf(i6));
        if (i6 == 0 || i6 == 2300) {
            this.f28070f0 = true;
            this.f28071g0 = true;
        }
        if (i6 == 2300) {
            Bundle bundle2 = new Bundle();
            this.f28078n0 = bundle2;
            bundle2.putBoolean("com.google.android.gms.cast.EXTRA_APP_NO_LONGER_RUNNING", true);
            i6 = 0;
        }
        super.D(i6, iBinder, bundle, i10);
    }

    public final void I() {
        CastDevice castDevice = this.X;
        v9.o.i(castDevice, "device should not be null");
        if (!castDevice.g0(Constants.PROFILE_ASSET_DOWNLOAD_JOB_ID) && castDevice.g0(4) && !castDevice.g0(1)) {
            "Chromecast Audio".equals(castDevice.f7251y);
        }
    }

    @Override // v9.b, com.google.android.gms.common.api.a.e
    public final void h() {
        Object[] objArr = {this.c0, Boolean.valueOf(j())};
        b bVar = f28064p0;
        bVar.b("disconnect(); ServiceListener=%s, isConnected=%b", objArr);
        x xVar = this.c0;
        y yVar = null;
        this.c0 = null;
        if (xVar != null) {
            y andSet = xVar.f28062b.getAndSet(null);
            if (andSet != null) {
                andSet.f28074j0 = -1;
                andSet.f28075k0 = -1;
                andSet.W = null;
                andSet.f28069d0 = null;
                andSet.f28072h0 = 0.0d;
                andSet.I();
                andSet.e0 = false;
                andSet.f28073i0 = null;
                yVar = andSet;
            }
            if (yVar != null) {
                bVar.b("removing all MessageReceivedCallbacks", new Object[0]);
                synchronized (this.Z) {
                    this.Z.clear();
                }
                try {
                    try {
                        e eVar = (e) y();
                        eVar.S1(eVar.z(), 1);
                        return;
                    } finally {
                        super.h();
                    }
                } catch (RemoteException | IllegalStateException e10) {
                    bVar.a("Error while disconnecting the controller interface", e10, new Object[0]);
                    return;
                }
            }
        }
        bVar.b("already disposed, so short-circuiting", new Object[0]);
    }

    @Override // v9.b, com.google.android.gms.common.api.a.e
    public final int l() {
        return 12800000;
    }

    @Override // v9.b
    public final /* bridge */ /* synthetic */ IInterface r(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastDeviceController");
        if (queryLocalInterface instanceof e) {
            return (e) queryLocalInterface;
        }
        return new e(iBinder);
    }

    @Override // v9.b
    public final Bundle v() {
        Bundle bundle = this.f28078n0;
        if (bundle == null) {
            return null;
        }
        this.f28078n0 = null;
        return bundle;
    }

    @Override // v9.b
    public final Bundle w() {
        Bundle bundle = new Bundle();
        f28064p0.b("getRemoteService(): mLastApplicationId=%s, mLastSessionId=%s", this.f28076l0, this.f28077m0);
        CastDevice castDevice = this.X;
        castDevice.getClass();
        bundle.putParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE", castDevice);
        bundle.putLong("com.google.android.gms.cast.EXTRA_CAST_FLAGS", this.f28067a0);
        Bundle bundle2 = this.f28068b0;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        x xVar = new x(this);
        this.c0 = xVar;
        bundle.putParcelable("listener", new BinderWrapper(xVar));
        String str = this.f28076l0;
        if (str != null) {
            bundle.putString("last_application_id", str);
            String str2 = this.f28077m0;
            if (str2 != null) {
                bundle.putString("last_session_id", str2);
            }
        }
        return bundle;
    }

    @Override // v9.b
    public final String z() {
        return "com.google.android.gms.cast.internal.ICastDeviceController";
    }
}
