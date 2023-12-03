package u7;
/* compiled from: SeekPoint.java */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: c  reason: collision with root package name */
    public static final u f33910c = new u(0, 0);

    /* renamed from: a  reason: collision with root package name */
    public final long f33911a;

    /* renamed from: b  reason: collision with root package name */
    public final long f33912b;

    public u(long j10, long j11) {
        this.f33911a = j10;
        this.f33912b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u.class != obj.getClass()) {
            return false;
        }
        u uVar = (u) obj;
        if (this.f33911a == uVar.f33911a && this.f33912b == uVar.f33912b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f33911a) * 31) + ((int) this.f33912b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(60);
        sb2.append("[timeUs=");
        sb2.append(this.f33911a);
        sb2.append(", position=");
        sb2.append(this.f33912b);
        sb2.append("]");
        return sb2.toString();
    }
}
