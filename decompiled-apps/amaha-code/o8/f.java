package o8;
/* compiled from: MediaPeriodId.java */
/* loaded from: classes.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    public final Object f27272a;

    /* renamed from: b  reason: collision with root package name */
    public final int f27273b;

    /* renamed from: c  reason: collision with root package name */
    public final int f27274c;

    /* renamed from: d  reason: collision with root package name */
    public final long f27275d;

    /* renamed from: e  reason: collision with root package name */
    public final int f27276e;

    public f(long j10, Object obj) {
        this(obj, -1, -1, j10, -1);
    }

    public final boolean a() {
        if (this.f27273b != -1) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f27272a.equals(fVar.f27272a) && this.f27273b == fVar.f27273b && this.f27274c == fVar.f27274c && this.f27275d == fVar.f27275d && this.f27276e == fVar.f27276e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f27272a.hashCode() + 527) * 31) + this.f27273b) * 31) + this.f27274c) * 31) + ((int) this.f27275d)) * 31) + this.f27276e;
    }

    public f(f fVar) {
        this.f27272a = fVar.f27272a;
        this.f27273b = fVar.f27273b;
        this.f27274c = fVar.f27274c;
        this.f27275d = fVar.f27275d;
        this.f27276e = fVar.f27276e;
    }

    public f(Object obj, int i6, int i10, long j10, int i11) {
        this.f27272a = obj;
        this.f27273b = i6;
        this.f27274c = i10;
        this.f27275d = j10;
        this.f27276e = i11;
    }
}
