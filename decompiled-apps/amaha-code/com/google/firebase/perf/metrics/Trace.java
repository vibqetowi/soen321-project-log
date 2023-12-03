package com.google.firebase.perf.metrics;

import af.b;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import jf.e;
import kf.i;
import v.h;
/* loaded from: classes.dex */
public class Trace extends b implements Parcelable, hf.b {
    @Keep
    public static final Parcelable.Creator<Trace> CREATOR;
    public static final df.a G = df.a.d();
    public final List<hf.a> A;
    public final ArrayList B;
    public final e C;
    public final df.b D;
    public i E;
    public i F;

    /* renamed from: u  reason: collision with root package name */
    public final WeakReference<hf.b> f9798u;

    /* renamed from: v  reason: collision with root package name */
    public final Trace f9799v;

    /* renamed from: w  reason: collision with root package name */
    public final GaugeManager f9800w;

    /* renamed from: x  reason: collision with root package name */
    public final String f9801x;

    /* renamed from: y  reason: collision with root package name */
    public final ConcurrentHashMap f9802y;

    /* renamed from: z  reason: collision with root package name */
    public final ConcurrentHashMap f9803z;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<Trace> {
        @Override // android.os.Parcelable.Creator
        public final Trace createFromParcel(Parcel parcel) {
            return new Trace(parcel, false);
        }

        @Override // android.os.Parcelable.Creator
        public final Trace[] newArray(int i6) {
            return new Trace[i6];
        }
    }

    static {
        new ConcurrentHashMap();
        CREATOR = new a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Trace(String str, e eVar, df.b bVar, af.a aVar) {
        super(aVar);
        GaugeManager gaugeManager = GaugeManager.getInstance();
        this.f9798u = new WeakReference<>(this);
        this.f9799v = null;
        this.f9801x = str.trim();
        this.B = new ArrayList();
        this.f9802y = new ConcurrentHashMap();
        this.f9803z = new ConcurrentHashMap();
        this.D = bVar;
        this.C = eVar;
        this.A = Collections.synchronizedList(new ArrayList());
        this.f9800w = gaugeManager;
    }

    @Override // hf.b
    public final void a(hf.a aVar) {
        boolean z10;
        if (aVar == null) {
            G.f("Unable to add new SessionId to the Trace. Continuing without it.");
            return;
        }
        if (this.E != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && !c()) {
            this.A.add(aVar);
        }
    }

    public final void b(String str, String str2) {
        if (!c()) {
            ConcurrentHashMap concurrentHashMap = this.f9803z;
            if (!concurrentHashMap.containsKey(str) && concurrentHashMap.size() >= 5) {
                throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Exceeds max limit of number of attributes - %d", 5));
            }
            ff.e.b(str, str2);
            return;
        }
        throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Trace '%s' has been stopped", this.f9801x));
    }

    public final boolean c() {
        if (this.F != null) {
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    @Keep
    public int describeContents() {
        return 0;
    }

    public final void finalize() {
        boolean z10;
        boolean z11;
        try {
            if (this.E != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && !c()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                G.g("Trace '%s' is started but not stopped when it is destructed!", this.f9801x);
                incrementTsnsCount(1);
            }
        } finally {
            super.finalize();
        }
    }

    @Keep
    public String getAttribute(String str) {
        return (String) this.f9803z.get(str);
    }

    @Keep
    public Map<String, String> getAttributes() {
        return new HashMap(this.f9803z);
    }

    @Keep
    public long getLongMetric(String str) {
        ef.b bVar;
        if (str != null) {
            bVar = (ef.b) this.f9802y.get(str.trim());
        } else {
            bVar = null;
        }
        if (bVar == null) {
            return 0L;
        }
        return bVar.f13946v.get();
    }

    @Keep
    public void incrementMetric(String str, long j10) {
        boolean z10;
        String c10 = ff.e.c(str);
        df.a aVar = G;
        if (c10 != null) {
            aVar.c("Cannot increment metric '%s'. Metric name is invalid.(%s)", str, c10);
            return;
        }
        if (this.E != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        String str2 = this.f9801x;
        if (!z10) {
            aVar.g("Cannot increment metric '%s' for trace '%s' because it's not started", str, str2);
        } else if (c()) {
            aVar.g("Cannot increment metric '%s' for trace '%s' because it's been stopped", str, str2);
        } else {
            String trim = str.trim();
            ConcurrentHashMap concurrentHashMap = this.f9802y;
            ef.b bVar = (ef.b) concurrentHashMap.get(trim);
            if (bVar == null) {
                bVar = new ef.b(trim);
                concurrentHashMap.put(trim, bVar);
            }
            AtomicLong atomicLong = bVar.f13946v;
            atomicLong.addAndGet(j10);
            aVar.b("Incrementing metric '%s' to %d on trace '%s'", str, Long.valueOf(atomicLong.get()), str2);
        }
    }

    @Keep
    public void putAttribute(String str, String str2) {
        df.a aVar = G;
        boolean z10 = false;
        try {
            str = str.trim();
            str2 = str2.trim();
            b(str, str2);
            aVar.b("Setting attribute '%s' to '%s' on trace '%s'", str, str2, this.f9801x);
            z10 = true;
        } catch (Exception e10) {
            aVar.c("Can not set attribute '%s' with value '%s' (%s)", str, str2, e10.getMessage());
        }
        if (z10) {
            this.f9803z.put(str, str2);
        }
    }

    @Keep
    public void putMetric(String str, long j10) {
        boolean z10;
        String c10 = ff.e.c(str);
        df.a aVar = G;
        if (c10 != null) {
            aVar.c("Cannot set value for metric '%s'. Metric name is invalid.(%s)", str, c10);
            return;
        }
        if (this.E != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        String str2 = this.f9801x;
        if (!z10) {
            aVar.g("Cannot set value for metric '%s' for trace '%s' because it's not started", str, str2);
        } else if (c()) {
            aVar.g("Cannot set value for metric '%s' for trace '%s' because it's been stopped", str, str2);
        } else {
            String trim = str.trim();
            ConcurrentHashMap concurrentHashMap = this.f9802y;
            ef.b bVar = (ef.b) concurrentHashMap.get(trim);
            if (bVar == null) {
                bVar = new ef.b(trim);
                concurrentHashMap.put(trim, bVar);
            }
            bVar.f13946v.set(j10);
            aVar.b("Setting metric '%s' to '%s' on trace '%s'", str, Long.valueOf(j10), str2);
        }
    }

    @Keep
    public void removeAttribute(String str) {
        if (c()) {
            df.a aVar = G;
            if (aVar.f12837b) {
                aVar.f12836a.getClass();
                Log.e("FirebasePerformance", "Can't remove a attribute from a Trace that's stopped.");
                return;
            }
            return;
        }
        this.f9803z.remove(str);
    }

    @Keep
    public void start() {
        String str;
        boolean u10 = bf.a.e().u();
        df.a aVar = G;
        if (!u10) {
            aVar.a("Trace feature is disabled.");
            return;
        }
        String str2 = this.f9801x;
        if (str2 == null) {
            str = "Trace name must not be null";
        } else if (str2.length() > 100) {
            str = String.format(Locale.US, "Trace name must not exceed %d characters", 100);
        } else {
            if (str2.startsWith("_")) {
                int[] e10 = h.e(6);
                int length = e10.length;
                int i6 = 0;
                while (true) {
                    if (i6 < length) {
                        if (c.g(e10[i6]).equals(str2)) {
                            break;
                        }
                        i6++;
                    } else if (!str2.startsWith("_st_")) {
                        str = "Trace name must not start with '_'";
                    }
                }
            }
            str = null;
        }
        if (str != null) {
            aVar.c("Cannot start trace '%s'. Trace name is invalid.(%s)", str2, str);
        } else if (this.E != null) {
            aVar.c("Trace '%s' has already started, should not start again!", str2);
        } else {
            this.D.getClass();
            this.E = new i();
            registerForAppState();
            hf.a perfSession = SessionManager.getInstance().perfSession();
            SessionManager.getInstance().registerForSessionUpdates(this.f9798u);
            a(perfSession);
            if (perfSession.f17594w) {
                this.f9800w.collectGaugeMetricOnce(perfSession.f17593v);
            }
        }
    }

    @Keep
    public void stop() {
        boolean z10;
        if (this.E != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        String str = this.f9801x;
        df.a aVar = G;
        if (!z10) {
            aVar.c("Trace '%s' has not been started so unable to stop!", str);
        } else if (c()) {
            aVar.c("Trace '%s' has already stopped, should not stop again!", str);
        } else {
            SessionManager.getInstance().unregisterForSessionUpdates(this.f9798u);
            unregisterForAppState();
            this.D.getClass();
            i iVar = new i();
            this.F = iVar;
            if (this.f9799v == null) {
                ArrayList arrayList = this.B;
                if (!arrayList.isEmpty()) {
                    Trace trace = (Trace) arrayList.get(arrayList.size() - 1);
                    if (trace.F == null) {
                        trace.F = iVar;
                    }
                }
                if (!str.isEmpty()) {
                    this.C.c(new ef.e(this).a(), getAppState());
                    if (SessionManager.getInstance().perfSession().f17594w) {
                        this.f9800w.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().f17593v);
                    }
                } else if (aVar.f12837b) {
                    aVar.f12836a.getClass();
                    Log.e("FirebasePerformance", "Trace name is empty, no log is sent to server");
                }
            }
        }
    }

    @Override // android.os.Parcelable
    @Keep
    public void writeToParcel(Parcel parcel, int i6) {
        parcel.writeParcelable(this.f9799v, 0);
        parcel.writeString(this.f9801x);
        parcel.writeList(this.B);
        parcel.writeMap(this.f9802y);
        parcel.writeParcelable(this.E, 0);
        parcel.writeParcelable(this.F, 0);
        synchronized (this.A) {
            parcel.writeList(this.A);
        }
    }

    public Trace(Parcel parcel, boolean z10) {
        super(z10 ? null : af.a.a());
        this.f9798u = new WeakReference<>(this);
        this.f9799v = (Trace) parcel.readParcelable(Trace.class.getClassLoader());
        this.f9801x = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.B = arrayList;
        parcel.readList(arrayList, Trace.class.getClassLoader());
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f9802y = concurrentHashMap;
        this.f9803z = new ConcurrentHashMap();
        parcel.readMap(concurrentHashMap, ef.b.class.getClassLoader());
        this.E = (i) parcel.readParcelable(i.class.getClassLoader());
        this.F = (i) parcel.readParcelable(i.class.getClassLoader());
        List synchronizedList = Collections.synchronizedList(new ArrayList());
        this.A = synchronizedList;
        parcel.readList(synchronizedList, hf.a.class.getClassLoader());
        if (z10) {
            this.C = null;
            this.D = null;
            this.f9800w = null;
            return;
        }
        this.C = e.M;
        this.D = new df.b(17);
        this.f9800w = GaugeManager.getInstance();
    }
}
