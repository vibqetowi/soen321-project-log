package com.google.android.gms.cast.framework;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.internal.cast.e4;
import com.google.android.gms.internal.cast.k1;
import da.a;
import l9.d0;
import l9.f;
import l9.j;
import l9.m;
import l9.r;
import p9.b;
import v9.o;
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
/* loaded from: classes.dex */
public class ReconnectionService extends Service {

    /* renamed from: v  reason: collision with root package name */
    public static final b f7271v = new b("ReconnectionService");

    /* renamed from: u  reason: collision with root package name */
    public m f7272u;

    @Override // android.app.Service
    @RecentlyNullable
    public final IBinder onBind(@RecentlyNonNull Intent intent) {
        m mVar = this.f7272u;
        if (mVar != null) {
            try {
                return mVar.m0(intent);
            } catch (RemoteException e10) {
                f7271v.a("Unable to call %s on %s.", e10, "onBind", m.class.getSimpleName());
                return null;
            }
        }
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        a aVar;
        a aVar2;
        l9.a a10 = l9.a.a(this);
        a10.getClass();
        o.d("Must be called from the main thread.");
        f fVar = a10.f24150c;
        fVar.getClass();
        m mVar = null;
        try {
            aVar = fVar.f24177a.s();
        } catch (RemoteException e10) {
            f.f24176c.a("Unable to call %s on %s.", e10, "getWrappedThis", r.class.getSimpleName());
            aVar = null;
        }
        o.d("Must be called from the main thread.");
        d0 d0Var = a10.f24151d;
        d0Var.getClass();
        try {
            aVar2 = d0Var.f24173a.d();
        } catch (RemoteException e11) {
            d0.f24172b.a("Unable to call %s on %s.", e11, "getWrappedThis", j.class.getSimpleName());
            aVar2 = null;
        }
        b bVar = k1.f7569a;
        if (aVar != null && aVar2 != null) {
            try {
                mVar = k1.a(getApplicationContext()).K0(new da.b(this), aVar, aVar2);
            } catch (RemoteException | zzar e12) {
                k1.f7569a.a("Unable to call %s on %s.", e12, "newReconnectionServiceImpl", e4.class.getSimpleName());
            }
        }
        this.f7272u = mVar;
        if (mVar != null) {
            try {
                mVar.d();
            } catch (RemoteException e13) {
                f7271v.a("Unable to call %s on %s.", e13, "onCreate", m.class.getSimpleName());
            }
            super.onCreate();
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        m mVar = this.f7272u;
        if (mVar != null) {
            try {
                mVar.f();
            } catch (RemoteException e10) {
                f7271v.a("Unable to call %s on %s.", e10, "onDestroy", m.class.getSimpleName());
            }
            super.onDestroy();
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(@RecentlyNonNull Intent intent, int i6, int i10) {
        m mVar = this.f7272u;
        if (mVar != null) {
            try {
                return mVar.F(i6, i10, intent);
            } catch (RemoteException e10) {
                f7271v.a("Unable to call %s on %s.", e10, "onStartCommand", m.class.getSimpleName());
            }
        }
        return 2;
    }
}
