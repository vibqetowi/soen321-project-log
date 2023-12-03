package e9;
/* compiled from: Projection.java */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final a f13878a;

    /* renamed from: b  reason: collision with root package name */
    public final a f13879b;

    /* renamed from: c  reason: collision with root package name */
    public final int f13880c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f13881d;

    /* compiled from: Projection.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final b[] f13882a;

        public a(b... bVarArr) {
            this.f13882a = bVarArr;
        }
    }

    /* compiled from: Projection.java */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f13883a;

        /* renamed from: b  reason: collision with root package name */
        public final int f13884b;

        /* renamed from: c  reason: collision with root package name */
        public final float[] f13885c;

        /* renamed from: d  reason: collision with root package name */
        public final float[] f13886d;

        public b(int i6, float[] fArr, float[] fArr2, int i10) {
            boolean z10;
            this.f13883a = i6;
            if (fArr.length * 2 == fArr2.length * 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            sc.b.q(z10);
            this.f13885c = fArr;
            this.f13886d = fArr2;
            this.f13884b = i10;
        }
    }

    public e() {
        throw null;
    }

    public e(a aVar, a aVar2, int i6) {
        this.f13878a = aVar;
        this.f13879b = aVar2;
        this.f13880c = i6;
        this.f13881d = aVar == aVar2;
    }
}
