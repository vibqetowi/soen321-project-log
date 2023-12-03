package o7;
/* compiled from: SeekParameters.java */
/* loaded from: classes.dex */
public final class x {

    /* renamed from: c  reason: collision with root package name */
    public static final x f27255c;

    /* renamed from: a  reason: collision with root package name */
    public final long f27256a;

    /* renamed from: b  reason: collision with root package name */
    public final long f27257b;

    static {
        x xVar = new x(0L, 0L);
        new x(Long.MAX_VALUE, Long.MAX_VALUE);
        new x(Long.MAX_VALUE, 0L);
        new x(0L, Long.MAX_VALUE);
        f27255c = xVar;
    }

    public x(long j10, long j11) {
        boolean z10;
        if (j10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        sc.b.q(z10);
        sc.b.q(j11 >= 0);
        this.f27256a = j10;
        this.f27257b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || x.class != obj.getClass()) {
            return false;
        }
        x xVar = (x) obj;
        if (this.f27256a == xVar.f27256a && this.f27257b == xVar.f27257b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f27256a) * 31) + ((int) this.f27257b);
    }
}
