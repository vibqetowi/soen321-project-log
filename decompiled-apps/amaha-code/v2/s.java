package v2;

import androidx.work.u;
import com.theinnerhour.b2b.utils.Constants;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
/* compiled from: WorkSpec.kt */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    public final String f34734a;

    /* renamed from: b  reason: collision with root package name */
    public u.a f34735b;

    /* renamed from: c  reason: collision with root package name */
    public final String f34736c;

    /* renamed from: d  reason: collision with root package name */
    public String f34737d;

    /* renamed from: e  reason: collision with root package name */
    public androidx.work.d f34738e;
    public final androidx.work.d f;

    /* renamed from: g  reason: collision with root package name */
    public final long f34739g;

    /* renamed from: h  reason: collision with root package name */
    public final long f34740h;

    /* renamed from: i  reason: collision with root package name */
    public final long f34741i;

    /* renamed from: j  reason: collision with root package name */
    public final androidx.work.c f34742j;

    /* renamed from: k  reason: collision with root package name */
    public final int f34743k;

    /* renamed from: l  reason: collision with root package name */
    public final int f34744l;

    /* renamed from: m  reason: collision with root package name */
    public final long f34745m;

    /* renamed from: n  reason: collision with root package name */
    public long f34746n;

    /* renamed from: o  reason: collision with root package name */
    public final long f34747o;

    /* renamed from: p  reason: collision with root package name */
    public final long f34748p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f34749q;
    public final int r;

    /* renamed from: s  reason: collision with root package name */
    public final int f34750s;

    /* renamed from: t  reason: collision with root package name */
    public final int f34751t;

    /* compiled from: WorkSpec.kt */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f34752a;

        /* renamed from: b  reason: collision with root package name */
        public final u.a f34753b;

        public a(u.a aVar, String id2) {
            kotlin.jvm.internal.i.g(id2, "id");
            this.f34752a = id2;
            this.f34753b = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (kotlin.jvm.internal.i.b(this.f34752a, aVar.f34752a) && this.f34753b == aVar.f34753b) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f34753b.hashCode() + (this.f34752a.hashCode() * 31);
        }

        public final String toString() {
            return "IdAndState(id=" + this.f34752a + ", state=" + this.f34753b + ')';
        }
    }

    /* compiled from: WorkSpec.kt */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f34754a;

        /* renamed from: b  reason: collision with root package name */
        public final u.a f34755b;

        /* renamed from: c  reason: collision with root package name */
        public final androidx.work.d f34756c;

        /* renamed from: d  reason: collision with root package name */
        public final int f34757d;

        /* renamed from: e  reason: collision with root package name */
        public final int f34758e;
        public final List<String> f;

        /* renamed from: g  reason: collision with root package name */
        public final List<androidx.work.d> f34759g;

        public b(String id2, u.a aVar, androidx.work.d dVar, int i6, int i10, ArrayList arrayList, ArrayList arrayList2) {
            kotlin.jvm.internal.i.g(id2, "id");
            this.f34754a = id2;
            this.f34755b = aVar;
            this.f34756c = dVar;
            this.f34757d = i6;
            this.f34758e = i10;
            this.f = arrayList;
            this.f34759g = arrayList2;
        }

        public final androidx.work.u a() {
            androidx.work.d dVar;
            List<androidx.work.d> list = this.f34759g;
            if (!list.isEmpty()) {
                dVar = list.get(0);
            } else {
                dVar = androidx.work.d.f3235c;
            }
            return new androidx.work.u(UUID.fromString(this.f34754a), this.f34755b, this.f34756c, this.f, dVar, this.f34757d, this.f34758e);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (kotlin.jvm.internal.i.b(this.f34754a, bVar.f34754a) && this.f34755b == bVar.f34755b && kotlin.jvm.internal.i.b(this.f34756c, bVar.f34756c) && this.f34757d == bVar.f34757d && this.f34758e == bVar.f34758e && kotlin.jvm.internal.i.b(this.f, bVar.f) && kotlin.jvm.internal.i.b(this.f34759g, bVar.f34759g)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode = this.f34755b.hashCode();
            int hashCode2 = this.f34756c.hashCode();
            int hashCode3 = this.f.hashCode();
            return this.f34759g.hashCode() + ((hashCode3 + ((((((hashCode2 + ((hashCode + (this.f34754a.hashCode() * 31)) * 31)) * 31) + this.f34757d) * 31) + this.f34758e) * 31)) * 31);
        }

        public final String toString() {
            return "WorkInfoPojo(id=" + this.f34754a + ", state=" + this.f34755b + ", output=" + this.f34756c + ", runAttemptCount=" + this.f34757d + ", generation=" + this.f34758e + ", tags=" + this.f + ", progress=" + this.f34759g + ')';
        }
    }

    static {
        kotlin.jvm.internal.i.f(androidx.work.q.f("WorkSpec"), "tagWithPrefix(\"WorkSpec\")");
    }

    public s(String id2, u.a state, String workerClassName, String str, androidx.work.d input, androidx.work.d output, long j10, long j11, long j12, androidx.work.c constraints, int i6, int i10, long j13, long j14, long j15, long j16, boolean z10, int i11, int i12, int i13) {
        kotlin.jvm.internal.i.g(id2, "id");
        kotlin.jvm.internal.i.g(state, "state");
        kotlin.jvm.internal.i.g(workerClassName, "workerClassName");
        kotlin.jvm.internal.i.g(input, "input");
        kotlin.jvm.internal.i.g(output, "output");
        kotlin.jvm.internal.i.g(constraints, "constraints");
        defpackage.d.j(i10, "backoffPolicy");
        defpackage.d.j(i11, "outOfQuotaPolicy");
        this.f34734a = id2;
        this.f34735b = state;
        this.f34736c = workerClassName;
        this.f34737d = str;
        this.f34738e = input;
        this.f = output;
        this.f34739g = j10;
        this.f34740h = j11;
        this.f34741i = j12;
        this.f34742j = constraints;
        this.f34743k = i6;
        this.f34744l = i10;
        this.f34745m = j13;
        this.f34746n = j14;
        this.f34747o = j15;
        this.f34748p = j16;
        this.f34749q = z10;
        this.r = i11;
        this.f34750s = i12;
        this.f34751t = i13;
    }

    public final long a() {
        boolean z10;
        long j10;
        long j11;
        u.a aVar = this.f34735b;
        u.a aVar2 = u.a.ENQUEUED;
        int i6 = this.f34743k;
        boolean z11 = false;
        if (aVar == aVar2 && i6 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (this.f34744l == 2) {
                z11 = true;
            }
            long j12 = this.f34745m;
            if (z11) {
                j10 = j12 * i6;
            } else {
                j10 = Math.scalb((float) j12, i6 - 1);
            }
            j11 = this.f34746n;
            if (j10 > 18000000) {
                j10 = 18000000;
            }
        } else {
            boolean c10 = c();
            long j13 = this.f34739g;
            long j14 = 0;
            if (c10) {
                long j15 = this.f34746n;
                int i10 = this.f34750s;
                if (i10 == 0) {
                    j15 += j13;
                }
                long j16 = this.f34741i;
                long j17 = this.f34740h;
                if (j16 != j17) {
                    z11 = true;
                }
                if (z11) {
                    if (i10 == 0) {
                        j14 = (-1) * j16;
                    }
                    j15 += j17;
                } else if (i10 != 0) {
                    j14 = j17;
                }
                return j15 + j14;
            }
            long j18 = this.f34746n;
            if (j18 == 0) {
                j18 = System.currentTimeMillis();
            }
            j10 = j13;
            j11 = j18;
        }
        return j11 + j10;
    }

    public final boolean b() {
        return !kotlin.jvm.internal.i.b(androidx.work.c.f3224i, this.f34742j);
    }

    public final boolean c() {
        if (this.f34740h != 0) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (kotlin.jvm.internal.i.b(this.f34734a, sVar.f34734a) && this.f34735b == sVar.f34735b && kotlin.jvm.internal.i.b(this.f34736c, sVar.f34736c) && kotlin.jvm.internal.i.b(this.f34737d, sVar.f34737d) && kotlin.jvm.internal.i.b(this.f34738e, sVar.f34738e) && kotlin.jvm.internal.i.b(this.f, sVar.f) && this.f34739g == sVar.f34739g && this.f34740h == sVar.f34740h && this.f34741i == sVar.f34741i && kotlin.jvm.internal.i.b(this.f34742j, sVar.f34742j) && this.f34743k == sVar.f34743k && this.f34744l == sVar.f34744l && this.f34745m == sVar.f34745m && this.f34746n == sVar.f34746n && this.f34747o == sVar.f34747o && this.f34748p == sVar.f34748p && this.f34749q == sVar.f34749q && this.r == sVar.r && this.f34750s == sVar.f34750s && this.f34751t == sVar.f34751t) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f34735b.hashCode();
        int c10 = pl.a.c(this.f34736c, (hashCode2 + (this.f34734a.hashCode() * 31)) * 31, 31);
        String str = this.f34737d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode3 = this.f34738e.hashCode();
        int hashCode4 = this.f.hashCode();
        long j10 = this.f34739g;
        long j11 = this.f34740h;
        long j12 = this.f34741i;
        int hashCode5 = this.f34742j.hashCode();
        int d10 = v.h.d(this.f34744l);
        long j13 = this.f34745m;
        long j14 = this.f34746n;
        long j15 = this.f34747o;
        long j16 = this.f34748p;
        int i6 = (((((((((d10 + ((((hashCode5 + ((((((((hashCode4 + ((hashCode3 + ((c10 + hashCode) * 31)) * 31)) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) (j12 ^ (j12 >>> 32)))) * 31)) * 31) + this.f34743k) * 31)) * 31) + ((int) (j13 ^ (j13 >>> 32)))) * 31) + ((int) (j14 ^ (j14 >>> 32)))) * 31) + ((int) (j15 ^ (j15 >>> 32)))) * 31) + ((int) (j16 ^ (j16 >>> 32)))) * 31;
        boolean z10 = this.f34749q;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return ((((v.h.d(this.r) + ((i6 + i10) * 31)) * 31) + this.f34750s) * 31) + this.f34751t;
    }

    public final String toString() {
        return v.g.c(new StringBuilder("{WorkSpec: "), this.f34734a, '}');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ s(String str, u.a aVar, String str2, String str3, androidx.work.d dVar, androidx.work.d dVar2, long j10, long j11, long j12, androidx.work.c cVar, int i6, int i10, long j13, long j14, long j15, long j16, boolean z10, int i11, int i12, int i13, int i14) {
        this(str, r4, str2, r6, r7, r8, (i13 & 64) != 0 ? 0L : j10, (i13 & 128) != 0 ? 0L : j11, (i13 & 256) != 0 ? 0L : j12, (i13 & 512) != 0 ? androidx.work.c.f3224i : cVar, (i13 & Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID) != 0 ? 0 : i6, (i13 & Constants.PROFILE_ASSET_DOWNLOAD_JOB_ID) != 0 ? 1 : i10, (i13 & 4096) != 0 ? 30000L : j13, (i13 & 8192) != 0 ? 0L : j14, (i13 & 16384) != 0 ? 0L : j15, (32768 & i13) != 0 ? -1L : j16, (65536 & i13) != 0 ? false : z10, (131072 & i13) != 0 ? 1 : i11, (i13 & 262144) != 0 ? 0 : i12, 0);
        androidx.work.d dVar3;
        androidx.work.d dVar4;
        u.a aVar2 = (i13 & 2) != 0 ? u.a.ENQUEUED : aVar;
        String str4 = (i13 & 8) != 0 ? null : str3;
        if ((i13 & 16) != 0) {
            androidx.work.d EMPTY = androidx.work.d.f3235c;
            kotlin.jvm.internal.i.f(EMPTY, "EMPTY");
            dVar3 = EMPTY;
        } else {
            dVar3 = dVar;
        }
        if ((i13 & 32) != 0) {
            androidx.work.d EMPTY2 = androidx.work.d.f3235c;
            kotlin.jvm.internal.i.f(EMPTY2, "EMPTY");
            dVar4 = EMPTY2;
        } else {
            dVar4 = dVar2;
        }
    }
}
