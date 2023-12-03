package z8;

import android.util.Log;
import com.google.common.collect.s;
import java.util.ArrayList;
import o8.o;
import z8.d;
/* compiled from: AdaptiveTrackSelection.java */
/* loaded from: classes.dex */
public final class a extends z8.b {
    public final b9.b f;

    /* compiled from: AdaptiveTrackSelection.java */
    /* renamed from: z8.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0671a {

        /* renamed from: a  reason: collision with root package name */
        public final long f39266a;

        /* renamed from: b  reason: collision with root package name */
        public final long f39267b;

        public C0671a(long j10, long j11) {
            this.f39266a = j10;
            this.f39267b = j11;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0671a)) {
                return false;
            }
            C0671a c0671a = (C0671a) obj;
            if (this.f39266a == c0671a.f39266a && this.f39267b == c0671a.f39267b) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return (((int) this.f39266a) * 31) + ((int) this.f39267b);
        }
    }

    /* compiled from: AdaptiveTrackSelection.java */
    /* loaded from: classes.dex */
    public static class b implements d.b {
    }

    public a(o oVar, int[] iArr, int i6, b9.b bVar, long j10, long j11, s sVar, c9.b bVar2) {
        super(oVar, iArr);
        if (j11 < j10) {
            Log.w("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
        }
        this.f = bVar;
        s.z(sVar);
    }

    public static void m(ArrayList arrayList, long[] jArr) {
        long j10 = 0;
        for (long j11 : jArr) {
            j10 += j11;
        }
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            s.a aVar = (s.a) arrayList.get(i6);
            if (aVar != null) {
                aVar.b(new C0671a(j10, jArr[i6]));
            }
        }
    }

    @Override // z8.d
    public final void c() {
    }

    @Override // z8.b, z8.d
    public final void d() {
    }

    @Override // z8.b, z8.d
    public final void e() {
    }

    @Override // z8.b, z8.d
    public final void g() {
    }
}
