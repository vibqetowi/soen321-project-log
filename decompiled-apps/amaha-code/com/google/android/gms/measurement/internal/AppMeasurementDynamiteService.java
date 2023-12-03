package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.appcompat.widget.l;
import androidx.work.n;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.measurement.j0;
import com.google.android.gms.internal.measurement.n0;
import com.google.android.gms.internal.measurement.q0;
import com.google.android.gms.internal.measurement.s0;
import com.google.android.gms.internal.measurement.t0;
import da.a;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.h;
import r9.i;
import t.b;
import ta.c3;
import ta.c5;
import ta.g4;
import ta.i4;
import ta.j4;
import ta.k6;
import ta.l6;
import ta.m4;
import ta.o4;
import ta.p4;
import ta.q;
import ta.s;
import ta.s4;
import ta.t4;
import ta.u2;
import ta.w2;
import ta.w3;
import ta.w4;
import ta.y3;
import ta.z4;
import v9.o;
/* compiled from: com.google.android.gms:play-services-measurement-sdk@@21.2.0 */
@DynamiteApi
/* loaded from: classes.dex */
public class AppMeasurementDynamiteService extends j0 {

    /* renamed from: a  reason: collision with root package name */
    public y3 f8742a = null;

    /* renamed from: b  reason: collision with root package name */
    public final b f8743b = new b();

    @Override // com.google.android.gms.internal.measurement.k0
    public void beginAdUnitExposure(String str, long j10) {
        z();
        this.f8742a.m().i(j10, str);
    }

    public final void c1(String str, n0 n0Var) {
        z();
        k6 k6Var = this.f8742a.F;
        y3.i(k6Var);
        k6Var.F(str, n0Var);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        z();
        t4 t4Var = this.f8742a.J;
        y3.j(t4Var);
        t4Var.l(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void clearMeasurementEnabled(long j10) {
        z();
        t4 t4Var = this.f8742a.J;
        y3.j(t4Var);
        t4Var.i();
        w3 w3Var = t4Var.f32943u.D;
        y3.k(w3Var);
        w3Var.p(new n(t4Var, (Object) null, 17));
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void endAdUnitExposure(String str, long j10) {
        z();
        this.f8742a.m().j(j10, str);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void generateEventId(n0 n0Var) {
        z();
        k6 k6Var = this.f8742a.F;
        y3.i(k6Var);
        long j02 = k6Var.j0();
        z();
        k6 k6Var2 = this.f8742a.F;
        y3.i(k6Var2);
        k6Var2.E(n0Var, j02);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void getAppInstanceId(n0 n0Var) {
        z();
        w3 w3Var = this.f8742a.D;
        y3.k(w3Var);
        w3Var.p(new w4(this, n0Var, 0));
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void getCachedAppInstanceId(n0 n0Var) {
        z();
        t4 t4Var = this.f8742a.J;
        y3.j(t4Var);
        c1(t4Var.A(), n0Var);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void getConditionalUserProperties(String str, String str2, n0 n0Var) {
        z();
        w3 w3Var = this.f8742a.D;
        y3.k(w3Var);
        w3Var.p(new o4(4, this, n0Var, str2, str));
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void getCurrentScreenClass(n0 n0Var) {
        String str;
        z();
        t4 t4Var = this.f8742a.J;
        y3.j(t4Var);
        c5 c5Var = t4Var.f32943u.I;
        y3.j(c5Var);
        z4 z4Var = c5Var.f32509w;
        if (z4Var != null) {
            str = z4Var.f32975b;
        } else {
            str = null;
        }
        c1(str, n0Var);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void getCurrentScreenName(n0 n0Var) {
        String str;
        z();
        t4 t4Var = this.f8742a.J;
        y3.j(t4Var);
        c5 c5Var = t4Var.f32943u.I;
        y3.j(c5Var);
        z4 z4Var = c5Var.f32509w;
        if (z4Var != null) {
            str = z4Var.f32974a;
        } else {
            str = null;
        }
        c1(str, n0Var);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void getGmpAppId(n0 n0Var) {
        z();
        t4 t4Var = this.f8742a.J;
        y3.j(t4Var);
        y3 y3Var = t4Var.f32943u;
        String str = y3Var.f32954v;
        if (str == null) {
            try {
                str = h.t0(y3Var.f32953u, y3Var.M);
            } catch (IllegalStateException e10) {
                w2 w2Var = y3Var.C;
                y3.k(w2Var);
                w2Var.f32925z.c(e10, "getGoogleAppId failed with exception");
                str = null;
            }
        }
        c1(str, n0Var);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void getMaxUserProperties(String str, n0 n0Var) {
        z();
        t4 t4Var = this.f8742a.J;
        y3.j(t4Var);
        o.e(str);
        t4Var.f32943u.getClass();
        z();
        k6 k6Var = this.f8742a.F;
        y3.i(k6Var);
        k6Var.D(n0Var, 25);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void getSessionId(n0 n0Var) {
        z();
        t4 t4Var = this.f8742a.J;
        y3.j(t4Var);
        w3 w3Var = t4Var.f32943u.D;
        y3.k(w3Var);
        w3Var.p(new n(t4Var, n0Var, 16));
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void getTestFlag(n0 n0Var, int i6) {
        z();
        if (i6 != 0) {
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 != 3) {
                        if (i6 != 4) {
                            return;
                        }
                        k6 k6Var = this.f8742a.F;
                        y3.i(k6Var);
                        t4 t4Var = this.f8742a.J;
                        y3.j(t4Var);
                        AtomicReference atomicReference = new AtomicReference();
                        w3 w3Var = t4Var.f32943u.D;
                        y3.k(w3Var);
                        k6Var.z(n0Var, ((Boolean) w3Var.m(atomicReference, 15000L, "boolean test flag value", new p4(t4Var, atomicReference, 0))).booleanValue());
                        return;
                    }
                    k6 k6Var2 = this.f8742a.F;
                    y3.i(k6Var2);
                    t4 t4Var2 = this.f8742a.J;
                    y3.j(t4Var2);
                    AtomicReference atomicReference2 = new AtomicReference();
                    w3 w3Var2 = t4Var2.f32943u.D;
                    y3.k(w3Var2);
                    k6Var2.D(n0Var, ((Integer) w3Var2.m(atomicReference2, 15000L, "int test flag value", new p4(t4Var2, atomicReference2, 3))).intValue());
                    return;
                }
                k6 k6Var3 = this.f8742a.F;
                y3.i(k6Var3);
                t4 t4Var3 = this.f8742a.J;
                y3.j(t4Var3);
                AtomicReference atomicReference3 = new AtomicReference();
                w3 w3Var3 = t4Var3.f32943u.D;
                y3.k(w3Var3);
                double doubleValue = ((Double) w3Var3.m(atomicReference3, 15000L, "double test flag value", new p4(t4Var3, atomicReference3, 4))).doubleValue();
                Bundle bundle = new Bundle();
                bundle.putDouble("r", doubleValue);
                try {
                    n0Var.t(bundle);
                    return;
                } catch (RemoteException e10) {
                    w2 w2Var = k6Var3.f32943u.C;
                    y3.k(w2Var);
                    w2Var.C.c(e10, "Error returning double value to wrapper");
                    return;
                }
            }
            k6 k6Var4 = this.f8742a.F;
            y3.i(k6Var4);
            t4 t4Var4 = this.f8742a.J;
            y3.j(t4Var4);
            AtomicReference atomicReference4 = new AtomicReference();
            w3 w3Var4 = t4Var4.f32943u.D;
            y3.k(w3Var4);
            k6Var4.E(n0Var, ((Long) w3Var4.m(atomicReference4, 15000L, "long test flag value", new p4(t4Var4, atomicReference4, 2))).longValue());
            return;
        }
        k6 k6Var5 = this.f8742a.F;
        y3.i(k6Var5);
        t4 t4Var5 = this.f8742a.J;
        y3.j(t4Var5);
        AtomicReference atomicReference5 = new AtomicReference();
        w3 w3Var5 = t4Var5.f32943u.D;
        y3.k(w3Var5);
        k6Var5.F((String) w3Var5.m(atomicReference5, 15000L, "String test flag value", new p4(t4Var5, atomicReference5, 1)), n0Var);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void getUserProperties(String str, String str2, boolean z10, n0 n0Var) {
        z();
        w3 w3Var = this.f8742a.D;
        y3.k(w3Var);
        w3Var.p(new i(this, n0Var, str, str2, z10));
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void initForTests(Map map) {
        z();
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void initialize(a aVar, t0 t0Var, long j10) {
        y3 y3Var = this.f8742a;
        if (y3Var == null) {
            Context context = (Context) da.b.Y1(aVar);
            o.h(context);
            this.f8742a = y3.s(context, t0Var, Long.valueOf(j10));
            return;
        }
        w2 w2Var = y3Var.C;
        y3.k(w2Var);
        w2Var.C.b("Attempting to initialize multiple times");
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void isDataCollectionEnabled(n0 n0Var) {
        z();
        w3 w3Var = this.f8742a.D;
        y3.k(w3Var);
        w3Var.p(new w4(this, n0Var, 1));
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void logEvent(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10) {
        z();
        t4 t4Var = this.f8742a.J;
        y3.j(t4Var);
        t4Var.n(str, str2, bundle, z10, z11, j10);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void logEventAndBundle(String str, String str2, Bundle bundle, n0 n0Var, long j10) {
        Bundle bundle2;
        z();
        o.e(str2);
        if (bundle != null) {
            bundle2 = new Bundle(bundle);
        } else {
            bundle2 = new Bundle();
        }
        bundle2.putString("_o", "app");
        s sVar = new s(str2, new q(bundle), "app", j10);
        w3 w3Var = this.f8742a.D;
        y3.k(w3Var);
        w3Var.p(new o4(this, n0Var, sVar, str));
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void logHealthData(int i6, String str, a aVar, a aVar2, a aVar3) {
        Object Y1;
        Object Y12;
        z();
        Object obj = null;
        if (aVar == null) {
            Y1 = null;
        } else {
            Y1 = da.b.Y1(aVar);
        }
        if (aVar2 == null) {
            Y12 = null;
        } else {
            Y12 = da.b.Y1(aVar2);
        }
        if (aVar3 != null) {
            obj = da.b.Y1(aVar3);
        }
        w2 w2Var = this.f8742a.C;
        y3.k(w2Var);
        w2Var.u(i6, true, false, str, Y1, Y12, obj);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void onActivityCreated(a aVar, Bundle bundle, long j10) {
        z();
        t4 t4Var = this.f8742a.J;
        y3.j(t4Var);
        s4 s4Var = t4Var.f32883w;
        if (s4Var != null) {
            t4 t4Var2 = this.f8742a.J;
            y3.j(t4Var2);
            t4Var2.m();
            s4Var.onActivityCreated((Activity) da.b.Y1(aVar), bundle);
        }
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void onActivityDestroyed(a aVar, long j10) {
        z();
        t4 t4Var = this.f8742a.J;
        y3.j(t4Var);
        s4 s4Var = t4Var.f32883w;
        if (s4Var != null) {
            t4 t4Var2 = this.f8742a.J;
            y3.j(t4Var2);
            t4Var2.m();
            s4Var.onActivityDestroyed((Activity) da.b.Y1(aVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void onActivityPaused(a aVar, long j10) {
        z();
        t4 t4Var = this.f8742a.J;
        y3.j(t4Var);
        s4 s4Var = t4Var.f32883w;
        if (s4Var != null) {
            t4 t4Var2 = this.f8742a.J;
            y3.j(t4Var2);
            t4Var2.m();
            s4Var.onActivityPaused((Activity) da.b.Y1(aVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void onActivityResumed(a aVar, long j10) {
        z();
        t4 t4Var = this.f8742a.J;
        y3.j(t4Var);
        s4 s4Var = t4Var.f32883w;
        if (s4Var != null) {
            t4 t4Var2 = this.f8742a.J;
            y3.j(t4Var2);
            t4Var2.m();
            s4Var.onActivityResumed((Activity) da.b.Y1(aVar));
        }
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void onActivitySaveInstanceState(a aVar, n0 n0Var, long j10) {
        z();
        t4 t4Var = this.f8742a.J;
        y3.j(t4Var);
        s4 s4Var = t4Var.f32883w;
        Bundle bundle = new Bundle();
        if (s4Var != null) {
            t4 t4Var2 = this.f8742a.J;
            y3.j(t4Var2);
            t4Var2.m();
            s4Var.onActivitySaveInstanceState((Activity) da.b.Y1(aVar), bundle);
        }
        try {
            n0Var.t(bundle);
        } catch (RemoteException e10) {
            w2 w2Var = this.f8742a.C;
            y3.k(w2Var);
            w2Var.C.c(e10, "Error returning bundle value to wrapper");
        }
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void onActivityStarted(a aVar, long j10) {
        z();
        t4 t4Var = this.f8742a.J;
        y3.j(t4Var);
        if (t4Var.f32883w != null) {
            t4 t4Var2 = this.f8742a.J;
            y3.j(t4Var2);
            t4Var2.m();
            Activity activity = (Activity) da.b.Y1(aVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void onActivityStopped(a aVar, long j10) {
        z();
        t4 t4Var = this.f8742a.J;
        y3.j(t4Var);
        if (t4Var.f32883w != null) {
            t4 t4Var2 = this.f8742a.J;
            y3.j(t4Var2);
            t4Var2.m();
            Activity activity = (Activity) da.b.Y1(aVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void performAction(Bundle bundle, n0 n0Var, long j10) {
        z();
        n0Var.t(null);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void registerOnMeasurementEventListener(q0 q0Var) {
        Object obj;
        z();
        synchronized (this.f8743b) {
            obj = (g4) this.f8743b.getOrDefault(Integer.valueOf(q0Var.e()), null);
            if (obj == null) {
                obj = new l6(this, q0Var);
                this.f8743b.put(Integer.valueOf(q0Var.e()), obj);
            }
        }
        t4 t4Var = this.f8742a.J;
        y3.j(t4Var);
        t4Var.i();
        if (!t4Var.f32885y.add(obj)) {
            w2 w2Var = t4Var.f32943u.C;
            y3.k(w2Var);
            w2Var.C.b("OnEventListener already registered");
        }
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void resetAnalyticsData(long j10) {
        z();
        t4 t4Var = this.f8742a.J;
        y3.j(t4Var);
        t4Var.A.set(null);
        w3 w3Var = t4Var.f32943u.D;
        y3.k(w3Var);
        w3Var.p(new m4(t4Var, j10, 1));
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void setConditionalUserProperty(Bundle bundle, long j10) {
        z();
        if (bundle == null) {
            w2 w2Var = this.f8742a.C;
            y3.k(w2Var);
            w2Var.f32925z.b("Conditional user property must not be null");
            return;
        }
        t4 t4Var = this.f8742a.J;
        y3.j(t4Var);
        t4Var.s(bundle, j10);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void setConsent(Bundle bundle, long j10) {
        z();
        t4 t4Var = this.f8742a.J;
        y3.j(t4Var);
        w3 w3Var = t4Var.f32943u.D;
        y3.k(w3Var);
        w3Var.q(new i4(t4Var, bundle, j10));
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void setConsentThirdParty(Bundle bundle, long j10) {
        z();
        t4 t4Var = this.f8742a.J;
        y3.j(t4Var);
        t4Var.t(bundle, -20, j10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0094, code lost:
        if (r4.length() <= 100) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00bf, code lost:
        if (r5.length() <= 100) goto L36;
     */
    @Override // com.google.android.gms.internal.measurement.k0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setCurrentScreen(a aVar, String str, String str2, long j10) {
        String str3;
        z();
        c5 c5Var = this.f8742a.I;
        y3.j(c5Var);
        Activity activity = (Activity) da.b.Y1(aVar);
        if (!c5Var.f32943u.A.r()) {
            w2 w2Var = c5Var.f32943u.C;
            y3.k(w2Var);
            w2Var.E.b("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
        z4 z4Var = c5Var.f32509w;
        if (z4Var == null) {
            w2 w2Var2 = c5Var.f32943u.C;
            y3.k(w2Var2);
            w2Var2.E.b("setCurrentScreen cannot be called while no activity active");
        } else if (c5Var.f32512z.get(activity) == null) {
            w2 w2Var3 = c5Var.f32943u.C;
            y3.k(w2Var3);
            w2Var3.E.b("setCurrentScreen must be called with an activity in the activity lifecycle");
        } else {
            if (str2 == null) {
                str2 = c5Var.o(activity.getClass());
            }
            boolean Y0 = f6.b.Y0(z4Var.f32975b, str2);
            boolean Y02 = f6.b.Y0(z4Var.f32974a, str);
            if (Y0 && Y02) {
                w2 w2Var4 = c5Var.f32943u.C;
                y3.k(w2Var4);
                w2Var4.E.b("setCurrentScreen cannot be called with the same class and name");
                return;
            }
            if (str != null) {
                if (str.length() > 0) {
                    c5Var.f32943u.getClass();
                }
                w2 w2Var5 = c5Var.f32943u.C;
                y3.k(w2Var5);
                w2Var5.E.c(Integer.valueOf(str.length()), "Invalid screen name length in setCurrentScreen. Length");
                return;
            }
            if (str2 != null) {
                if (str2.length() > 0) {
                    c5Var.f32943u.getClass();
                }
                w2 w2Var6 = c5Var.f32943u.C;
                y3.k(w2Var6);
                w2Var6.E.c(Integer.valueOf(str2.length()), "Invalid class name length in setCurrentScreen. Length");
                return;
            }
            w2 w2Var7 = c5Var.f32943u.C;
            y3.k(w2Var7);
            u2 u2Var = w2Var7.H;
            if (str == null) {
                str3 = "null";
            } else {
                str3 = str;
            }
            u2Var.d("Setting current screen to name, class", str3, str2);
            k6 k6Var = c5Var.f32943u.F;
            y3.i(k6Var);
            z4 z4Var2 = new z4(k6Var.j0(), str, str2);
            c5Var.f32512z.put(activity, z4Var2);
            c5Var.r(activity, z4Var2, true);
        }
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void setDataCollectionEnabled(boolean z10) {
        z();
        t4 t4Var = this.f8742a.J;
        y3.j(t4Var);
        t4Var.i();
        w3 w3Var = t4Var.f32943u.D;
        y3.k(w3Var);
        w3Var.p(new c3(1, t4Var, z10));
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void setDefaultEventParameters(Bundle bundle) {
        Bundle bundle2;
        z();
        t4 t4Var = this.f8742a.J;
        y3.j(t4Var);
        if (bundle == null) {
            bundle2 = null;
        } else {
            bundle2 = new Bundle(bundle);
        }
        w3 w3Var = t4Var.f32943u.D;
        y3.k(w3Var);
        w3Var.p(new j4(t4Var, bundle2, 0));
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void setEventInterceptor(q0 q0Var) {
        boolean z10;
        z();
        l lVar = new l(this, q0Var, 27);
        w3 w3Var = this.f8742a.D;
        y3.k(w3Var);
        if (w3Var.r()) {
            t4 t4Var = this.f8742a.J;
            y3.j(t4Var);
            t4Var.h();
            t4Var.i();
            l lVar2 = t4Var.f32884x;
            if (lVar != lVar2) {
                if (lVar2 == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                o.j("EventInterceptor already set.", z10);
            }
            t4Var.f32884x = lVar;
            return;
        }
        w3 w3Var2 = this.f8742a.D;
        y3.k(w3Var2);
        w3Var2.p(new n(this, lVar, 22));
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void setInstanceIdProvider(s0 s0Var) {
        z();
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void setMeasurementEnabled(boolean z10, long j10) {
        z();
        t4 t4Var = this.f8742a.J;
        y3.j(t4Var);
        Boolean valueOf = Boolean.valueOf(z10);
        t4Var.i();
        w3 w3Var = t4Var.f32943u.D;
        y3.k(w3Var);
        w3Var.p(new n(t4Var, valueOf, 17));
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void setMinimumSessionDuration(long j10) {
        z();
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void setSessionTimeoutDuration(long j10) {
        z();
        t4 t4Var = this.f8742a.J;
        y3.j(t4Var);
        w3 w3Var = t4Var.f32943u.D;
        y3.k(w3Var);
        w3Var.p(new m4(t4Var, j10, 0));
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void setUserId(String str, long j10) {
        z();
        t4 t4Var = this.f8742a.J;
        y3.j(t4Var);
        y3 y3Var = t4Var.f32943u;
        if (str != null && TextUtils.isEmpty(str)) {
            w2 w2Var = y3Var.C;
            y3.k(w2Var);
            w2Var.C.b("User ID must be non-empty or null");
            return;
        }
        w3 w3Var = y3Var.D;
        y3.k(w3Var);
        w3Var.p(new n(t4Var, 15, str));
        t4Var.w(null, "_id", str, true, j10);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void setUserProperty(String str, String str2, a aVar, boolean z10, long j10) {
        z();
        Object Y1 = da.b.Y1(aVar);
        t4 t4Var = this.f8742a.J;
        y3.j(t4Var);
        t4Var.w(str, str2, Y1, z10, j10);
    }

    @Override // com.google.android.gms.internal.measurement.k0
    public void unregisterOnMeasurementEventListener(q0 q0Var) {
        Object obj;
        z();
        synchronized (this.f8743b) {
            obj = (g4) this.f8743b.remove(Integer.valueOf(q0Var.e()));
        }
        if (obj == null) {
            obj = new l6(this, q0Var);
        }
        t4 t4Var = this.f8742a.J;
        y3.j(t4Var);
        t4Var.i();
        if (!t4Var.f32885y.remove(obj)) {
            w2 w2Var = t4Var.f32943u.C;
            y3.k(w2Var);
            w2Var.C.b("OnEventListener had not been registered");
        }
    }

    public final void z() {
        if (this.f8742a != null) {
            return;
        }
        throw new IllegalStateException("Attempting to perform action before initialize.");
    }
}
