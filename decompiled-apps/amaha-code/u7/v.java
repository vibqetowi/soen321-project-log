package u7;

import java.util.Arrays;
/* compiled from: TrackOutput.java */
/* loaded from: classes.dex */
public interface v {

    /* compiled from: TrackOutput.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f33913a;

        /* renamed from: b  reason: collision with root package name */
        public final byte[] f33914b;

        /* renamed from: c  reason: collision with root package name */
        public final int f33915c;

        /* renamed from: d  reason: collision with root package name */
        public final int f33916d;

        public a(int i6, int i10, int i11, byte[] bArr) {
            this.f33913a = i6;
            this.f33914b = bArr;
            this.f33915c = i10;
            this.f33916d = i11;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f33913a == aVar.f33913a && this.f33915c == aVar.f33915c && this.f33916d == aVar.f33916d && Arrays.equals(this.f33914b, aVar.f33914b)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return ((((Arrays.hashCode(this.f33914b) + (this.f33913a * 31)) * 31) + this.f33915c) * 31) + this.f33916d;
        }
    }

    void a(int i6, c9.q qVar);

    void b(c9.q qVar, int i6);

    int c(b9.d dVar, int i6, boolean z10);

    void d(long j10, int i6, int i10, int i11, a aVar);

    void e(com.google.android.exoplayer2.n nVar);
}
