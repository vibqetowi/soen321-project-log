package kd;

import android.util.Log;
import hd.n;
import j7.h;
import java.util.concurrent.atomic.AtomicReference;
import pd.d0;
/* compiled from: CrashlyticsNativeComponentDeferredProxy.java */
/* loaded from: classes.dex */
public final class b implements kd.a {

    /* renamed from: c  reason: collision with root package name */
    public static final a f23250c = new a();

    /* renamed from: a  reason: collision with root package name */
    public final re.a<kd.a> f23251a;

    /* renamed from: b  reason: collision with root package name */
    public final AtomicReference<kd.a> f23252b = new AtomicReference<>(null);

    /* compiled from: CrashlyticsNativeComponentDeferredProxy.java */
    /* loaded from: classes.dex */
    public static final class a implements d {
    }

    public b(re.a<kd.a> aVar) {
        this.f23251a = aVar;
        ((n) aVar).a(new f0.b(25, this));
    }

    @Override // kd.a
    public final d a(String str) {
        kd.a aVar = this.f23252b.get();
        if (aVar == null) {
            return f23250c;
        }
        return aVar.a(str);
    }

    @Override // kd.a
    public final boolean b() {
        kd.a aVar = this.f23252b.get();
        if (aVar != null && aVar.b()) {
            return true;
        }
        return false;
    }

    @Override // kd.a
    public final void c(String str, String str2, long j10, d0 d0Var) {
        String r = defpackage.c.r("Deferring native open session: ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", r, null);
        }
        ((n) this.f23251a).a(new h(str, str2, j10, d0Var, 3));
    }

    @Override // kd.a
    public final boolean d(String str) {
        kd.a aVar = this.f23252b.get();
        if (aVar != null && aVar.d(str)) {
            return true;
        }
        return false;
    }
}
