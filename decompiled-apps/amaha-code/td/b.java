package td;

import a7.d;
import a7.f;
import android.util.Log;
import d7.u;
import java.util.Locale;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import nd.z;
import pd.b0;
import ya.i;
/* compiled from: ReportQueue.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final double f32996a;

    /* renamed from: b  reason: collision with root package name */
    public final double f32997b;

    /* renamed from: c  reason: collision with root package name */
    public final long f32998c;

    /* renamed from: d  reason: collision with root package name */
    public final int f32999d;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayBlockingQueue f33000e;
    public final ThreadPoolExecutor f;

    /* renamed from: g  reason: collision with root package name */
    public final f<b0> f33001g;

    /* renamed from: h  reason: collision with root package name */
    public final z f33002h;

    /* renamed from: i  reason: collision with root package name */
    public int f33003i;

    /* renamed from: j  reason: collision with root package name */
    public long f33004j;

    /* compiled from: ReportQueue.java */
    /* loaded from: classes.dex */
    public final class a implements Runnable {

        /* renamed from: u  reason: collision with root package name */
        public final nd.b0 f33005u;

        /* renamed from: v  reason: collision with root package name */
        public final i<nd.b0> f33006v;

        public a(nd.b0 b0Var, i iVar) {
            this.f33005u = b0Var;
            this.f33006v = iVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            nd.b0 b0Var;
            b bVar = b.this;
            bVar.b(this.f33005u, this.f33006v);
            boolean z10 = false;
            ((AtomicInteger) bVar.f33002h.f26149c).set(0);
            double min = Math.min(3600000.0d, Math.pow(bVar.f32997b, bVar.a()) * (60000.0d / bVar.f32996a));
            String str = "Delay for: " + String.format(Locale.US, "%.2f", Double.valueOf(min / 1000.0d)) + " s for report: " + b0Var.c();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                z10 = true;
            }
            if (z10) {
                Log.d("FirebaseCrashlytics", str, null);
            }
            try {
                Thread.sleep((long) min);
            } catch (InterruptedException unused) {
            }
        }
    }

    public b(f<b0> fVar, ud.b bVar, z zVar) {
        double d10 = bVar.f34003d;
        this.f32996a = d10;
        this.f32997b = bVar.f34004e;
        this.f32998c = bVar.f * 1000;
        this.f33001g = fVar;
        this.f33002h = zVar;
        int i6 = (int) d10;
        this.f32999d = i6;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i6);
        this.f33000e = arrayBlockingQueue;
        this.f = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f33003i = 0;
        this.f33004j = 0L;
    }

    public final int a() {
        boolean z10;
        int max;
        if (this.f33004j == 0) {
            this.f33004j = System.currentTimeMillis();
        }
        int currentTimeMillis = (int) ((System.currentTimeMillis() - this.f33004j) / this.f32998c);
        if (this.f33000e.size() == this.f32999d) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            max = Math.min(100, this.f33003i + currentTimeMillis);
        } else {
            max = Math.max(0, this.f33003i - currentTimeMillis);
        }
        if (this.f33003i != max) {
            this.f33003i = max;
            this.f33004j = System.currentTimeMillis();
        }
        return max;
    }

    public final void b(nd.b0 b0Var, i<nd.b0> iVar) {
        String str = "Sending report through Google DataTransport: " + b0Var.c();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
        ((u) this.f33001g).a(new a7.a(null, b0Var.a(), d.HIGHEST), new i7.a(6, this, iVar, b0Var));
    }
}
