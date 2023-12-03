package d9;

import java.util.Arrays;
/* compiled from: FixedFrameRateEstimator.java */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: c  reason: collision with root package name */
    public boolean f12630c;

    /* renamed from: e  reason: collision with root package name */
    public int f12632e;

    /* renamed from: a  reason: collision with root package name */
    public a f12628a = new a();

    /* renamed from: b  reason: collision with root package name */
    public a f12629b = new a();

    /* renamed from: d  reason: collision with root package name */
    public long f12631d = -9223372036854775807L;

    /* compiled from: FixedFrameRateEstimator.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public long f12633a;

        /* renamed from: b  reason: collision with root package name */
        public long f12634b;

        /* renamed from: c  reason: collision with root package name */
        public long f12635c;

        /* renamed from: d  reason: collision with root package name */
        public long f12636d;

        /* renamed from: e  reason: collision with root package name */
        public long f12637e;
        public long f;

        /* renamed from: g  reason: collision with root package name */
        public final boolean[] f12638g = new boolean[15];

        /* renamed from: h  reason: collision with root package name */
        public int f12639h;

        public final boolean a() {
            if (this.f12636d > 15 && this.f12639h == 0) {
                return true;
            }
            return false;
        }

        public final void b(long j10) {
            long j11 = this.f12636d;
            if (j11 == 0) {
                this.f12633a = j10;
            } else if (j11 == 1) {
                long j12 = j10 - this.f12633a;
                this.f12634b = j12;
                this.f = j12;
                this.f12637e = 1L;
            } else {
                long j13 = j10 - this.f12635c;
                int i6 = (int) (j11 % 15);
                long abs = Math.abs(j13 - this.f12634b);
                boolean[] zArr = this.f12638g;
                if (abs <= 1000000) {
                    this.f12637e++;
                    this.f += j13;
                    if (zArr[i6]) {
                        zArr[i6] = false;
                        this.f12639h--;
                    }
                } else if (!zArr[i6]) {
                    zArr[i6] = true;
                    this.f12639h++;
                }
            }
            this.f12636d++;
            this.f12635c = j10;
        }

        public final void c() {
            this.f12636d = 0L;
            this.f12637e = 0L;
            this.f = 0L;
            this.f12639h = 0;
            Arrays.fill(this.f12638g, false);
        }
    }

    public final boolean a() {
        return this.f12628a.a();
    }
}
