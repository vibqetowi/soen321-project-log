package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import android.os.PowerManager;
import androidx.lifecycle.s;
import androidx.work.impl.background.systemalarm.d;
import androidx.work.q;
import hs.k;
import java.util.LinkedHashMap;
import java.util.Map;
import w2.t;
/* loaded from: classes.dex */
public class SystemAlarmService extends s implements d.c {

    /* renamed from: x  reason: collision with root package name */
    public static final String f3262x = q.f("SystemAlarmService");

    /* renamed from: v  reason: collision with root package name */
    public d f3263v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f3264w;

    public final void a() {
        boolean z10;
        this.f3264w = true;
        q.d().a(f3262x, "All commands completed in dispatcher");
        String str = w2.s.f36322a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (t.f36323a) {
            linkedHashMap.putAll(t.f36324b);
            k kVar = k.f19476a;
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) entry.getKey();
            String str2 = (String) entry.getValue();
            if (wakeLock != null && wakeLock.isHeld()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                q d10 = q.d();
                String str3 = w2.s.f36322a;
                d10.g(str3, "WakeLock held for " + str2);
            }
        }
        stopSelf();
    }

    @Override // androidx.lifecycle.s, android.app.Service
    public final void onCreate() {
        super.onCreate();
        d dVar = new d(this);
        this.f3263v = dVar;
        if (dVar.C != null) {
            q.d().b(d.D, "A completion listener for SystemAlarmDispatcher already exists.");
        } else {
            dVar.C = this;
        }
        this.f3264w = false;
    }

    @Override // androidx.lifecycle.s, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f3264w = true;
        d dVar = this.f3263v;
        dVar.getClass();
        q.d().a(d.D, "Destroying SystemAlarmDispatcher");
        dVar.f3283x.g(dVar);
        dVar.C = null;
    }

    @Override // androidx.lifecycle.s, android.app.Service
    public final int onStartCommand(Intent intent, int i6, int i10) {
        super.onStartCommand(intent, i6, i10);
        if (this.f3264w) {
            q.d().e(f3262x, "Re-initializing SystemAlarmDispatcher after a request to shut-down.");
            d dVar = this.f3263v;
            dVar.getClass();
            q d10 = q.d();
            String str = d.D;
            d10.a(str, "Destroying SystemAlarmDispatcher");
            dVar.f3283x.g(dVar);
            dVar.C = null;
            d dVar2 = new d(this);
            this.f3263v = dVar2;
            if (dVar2.C != null) {
                q.d().b(str, "A completion listener for SystemAlarmDispatcher already exists.");
            } else {
                dVar2.C = this;
            }
            this.f3264w = false;
        }
        if (intent != null) {
            this.f3263v.b(intent, i10);
            return 3;
        }
        return 3;
    }
}
