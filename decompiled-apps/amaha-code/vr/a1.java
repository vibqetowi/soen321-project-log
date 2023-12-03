package vr;

import io.grpc.StatusException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import vr.n1;
import vr.t;
/* compiled from: Http2Ping.java */
/* loaded from: classes2.dex */
public final class a1 {

    /* renamed from: g  reason: collision with root package name */
    public static final Logger f35385g = Logger.getLogger(a1.class.getName());

    /* renamed from: a  reason: collision with root package name */
    public final long f35386a;

    /* renamed from: b  reason: collision with root package name */
    public final nc.l f35387b;

    /* renamed from: c  reason: collision with root package name */
    public LinkedHashMap f35388c = new LinkedHashMap();

    /* renamed from: d  reason: collision with root package name */
    public boolean f35389d;

    /* renamed from: e  reason: collision with root package name */
    public Throwable f35390e;
    public long f;

    public a1(long j10, nc.l lVar) {
        this.f35386a = j10;
        this.f35387b = lVar;
    }

    public final void a(n1.c.a aVar) {
        Runnable y0Var;
        rc.a aVar2 = rc.a.f30653u;
        synchronized (this) {
            if (!this.f35389d) {
                this.f35388c.put(aVar, aVar2);
                return;
            }
            Throwable th2 = this.f35390e;
            if (th2 != null) {
                y0Var = new z0(aVar, th2);
            } else {
                y0Var = new y0(aVar, this.f);
            }
            try {
                aVar2.execute(y0Var);
            } catch (Throwable th3) {
                f35385g.log(Level.SEVERE, "Failed to execute PingCallback", th3);
            }
        }
    }

    public final void b() {
        synchronized (this) {
            if (this.f35389d) {
                return;
            }
            this.f35389d = true;
            long a10 = this.f35387b.a(TimeUnit.NANOSECONDS);
            this.f = a10;
            LinkedHashMap linkedHashMap = this.f35388c;
            this.f35388c = null;
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                try {
                    ((Executor) entry.getValue()).execute(new y0((t.a) entry.getKey(), a10));
                } catch (Throwable th2) {
                    f35385g.log(Level.SEVERE, "Failed to execute PingCallback", th2);
                }
            }
        }
    }

    public final void c(StatusException statusException) {
        synchronized (this) {
            if (this.f35389d) {
                return;
            }
            this.f35389d = true;
            this.f35390e = statusException;
            LinkedHashMap linkedHashMap = this.f35388c;
            this.f35388c = null;
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                try {
                    ((Executor) entry.getValue()).execute(new z0((t.a) entry.getKey(), statusException));
                } catch (Throwable th2) {
                    f35385g.log(Level.SEVERE, "Failed to execute PingCallback", th2);
                }
            }
        }
    }
}
