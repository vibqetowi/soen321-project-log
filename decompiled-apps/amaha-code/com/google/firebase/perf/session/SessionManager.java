package com.google.firebase.perf.session;

import af.a;
import af.b;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.emoji2.text.g;
import bf.o;
import com.google.firebase.perf.session.gauges.GaugeManager;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import kf.e;
import lf.d;
@Keep
/* loaded from: classes.dex */
public class SessionManager extends b {
    private static final SessionManager instance = new SessionManager();
    private final a appStateMonitor;
    private final Set<WeakReference<hf.b>> clients;
    private final GaugeManager gaugeManager;
    private hf.a perfSession;
    private Future syncInitFuture;

    private SessionManager() {
        this(GaugeManager.getInstance(), hf.a.c(), a.a());
    }

    public static /* synthetic */ void b(SessionManager sessionManager, Context context, hf.a aVar) {
        sessionManager.lambda$setApplicationContext$0(context, aVar);
    }

    public static SessionManager getInstance() {
        return instance;
    }

    public void lambda$setApplicationContext$0(Context context, hf.a aVar) {
        this.gaugeManager.initializeGaugeMetadataManager(context);
        if (aVar.f17594w) {
            this.gaugeManager.logGaugeMetadata(aVar.f17592u, d.FOREGROUND);
        }
    }

    private void logGaugeMetadataIfCollectionEnabled(d dVar) {
        hf.a aVar = this.perfSession;
        if (aVar.f17594w) {
            this.gaugeManager.logGaugeMetadata(aVar.f17592u, dVar);
        }
    }

    private void startOrStopCollectingGauges(d dVar) {
        hf.a aVar = this.perfSession;
        if (aVar.f17594w) {
            this.gaugeManager.startCollectingGauges(aVar, dVar);
        } else {
            this.gaugeManager.stopCollectingGauges();
        }
    }

    public Future getSyncInitFuture() {
        return this.syncInitFuture;
    }

    public void initializeGaugeCollection() {
        d dVar = d.FOREGROUND;
        logGaugeMetadataIfCollectionEnabled(dVar);
        startOrStopCollectingGauges(dVar);
    }

    @Override // af.b, af.a.b
    public void onUpdateAppState(d dVar) {
        super.onUpdateAppState(dVar);
        if (this.appStateMonitor.K) {
            return;
        }
        if (dVar == d.FOREGROUND) {
            updatePerfSession(dVar);
        } else if (!updatePerfSessionIfExpired()) {
            startOrStopCollectingGauges(dVar);
        }
    }

    public final hf.a perfSession() {
        return this.perfSession;
    }

    public void registerForSessionUpdates(WeakReference<hf.b> weakReference) {
        synchronized (this.clients) {
            this.clients.add(weakReference);
        }
    }

    public void setApplicationContext(Context context) {
        this.syncInitFuture = Executors.newSingleThreadExecutor().submit(new g(15, this, context, this.perfSession));
    }

    public void setPerfSession(hf.a aVar) {
        this.perfSession = aVar;
    }

    public void unregisterForSessionUpdates(WeakReference<hf.b> weakReference) {
        synchronized (this.clients) {
            this.clients.remove(weakReference);
        }
    }

    public void updatePerfSession(d dVar) {
        synchronized (this.clients) {
            this.perfSession = hf.a.c();
            Iterator<WeakReference<hf.b>> it = this.clients.iterator();
            while (it.hasNext()) {
                hf.b bVar = it.next().get();
                if (bVar != null) {
                    bVar.a(this.perfSession);
                } else {
                    it.remove();
                }
            }
        }
        logGaugeMetadataIfCollectionEnabled(dVar);
        startOrStopCollectingGauges(dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00d1 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean updatePerfSessionIfExpired() {
        o oVar;
        long longValue;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        hf.a aVar = this.perfSession;
        aVar.getClass();
        long minutes = TimeUnit.MICROSECONDS.toMinutes(aVar.f17593v.a());
        bf.a e10 = bf.a.e();
        e10.getClass();
        synchronized (o.class) {
            if (o.f4269v == null) {
                o.f4269v = new o();
            }
            oVar = o.f4269v;
        }
        e<Long> k10 = e10.k(oVar);
        if (k10.b()) {
            if (k10.a().longValue() > 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z13) {
                longValue = k10.a().longValue();
                if (minutes <= longValue) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    return false;
                }
                updatePerfSession(this.appStateMonitor.I);
                return true;
            }
        }
        e<Long> m10 = e10.m(oVar);
        if (m10.b()) {
            if (m10.a().longValue() > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                e10.f4254c.d(m10.a().longValue(), "com.google.firebase.perf.SessionsMaxDurationMinutes");
                longValue = m10.a().longValue();
                if (minutes <= longValue) {
                }
                if (z12) {
                }
            }
        }
        e<Long> c10 = e10.c(oVar);
        if (c10.b()) {
            if (c10.a().longValue() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                longValue = c10.a().longValue();
                if (minutes <= longValue) {
                }
                if (z12) {
                }
            }
        }
        Long l2 = 240L;
        longValue = l2.longValue();
        if (minutes <= longValue) {
        }
        if (z12) {
        }
    }

    public SessionManager(GaugeManager gaugeManager, hf.a aVar, a aVar2) {
        this.clients = new HashSet();
        this.gaugeManager = gaugeManager;
        this.perfSession = aVar;
        this.appStateMonitor = aVar2;
        registerForAppState();
    }
}
