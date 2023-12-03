package vr;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;
/* compiled from: AtomicBackoff.java */
/* loaded from: classes2.dex */
public final class i {

    /* renamed from: c  reason: collision with root package name */
    public static final Logger f35691c = Logger.getLogger(i.class.getName());

    /* renamed from: a  reason: collision with root package name */
    public final String f35692a;

    /* renamed from: b  reason: collision with root package name */
    public final AtomicLong f35693b;

    /* compiled from: AtomicBackoff.java */
    /* loaded from: classes2.dex */
    public final class a {

        /* renamed from: a  reason: collision with root package name */
        public final long f35694a;

        public a(long j10) {
            this.f35694a = j10;
        }
    }

    public i(long j10) {
        boolean z10;
        AtomicLong atomicLong = new AtomicLong();
        this.f35693b = atomicLong;
        if (j10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        sc.b.s("value must be positive", z10);
        this.f35692a = "keepalive time nanos";
        atomicLong.set(j10);
    }
}
