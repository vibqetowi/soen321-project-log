package r4;
/* compiled from: DownsampleStrategy.java */
/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a  reason: collision with root package name */
    public static final e f30396a;

    /* renamed from: b  reason: collision with root package name */
    public static final c f30397b;

    /* renamed from: c  reason: collision with root package name */
    public static final d f30398c;

    /* renamed from: d  reason: collision with root package name */
    public static final f f30399d;

    /* renamed from: e  reason: collision with root package name */
    public static final d f30400e;
    public static final h4.f<h> f;

    /* renamed from: g  reason: collision with root package name */
    public static final boolean f30401g;

    /* compiled from: DownsampleStrategy.java */
    /* loaded from: classes.dex */
    public static class a extends h {
        @Override // r4.h
        public final int a(int i6, int i10, int i11, int i12) {
            return 2;
        }

        @Override // r4.h
        public final float b(int i6, int i10, int i11, int i12) {
            int min = Math.min(i10 / i12, i6 / i11);
            if (min == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(min);
        }
    }

    /* compiled from: DownsampleStrategy.java */
    /* loaded from: classes.dex */
    public static class b extends h {
        @Override // r4.h
        public final int a(int i6, int i10, int i11, int i12) {
            return 1;
        }

        @Override // r4.h
        public final float b(int i6, int i10, int i11, int i12) {
            int ceil = (int) Math.ceil(Math.max(i10 / i12, i6 / i11));
            int i13 = 1;
            int max = Math.max(1, Integer.highestOneBit(ceil));
            if (max >= ceil) {
                i13 = 0;
            }
            return 1.0f / (max << i13);
        }
    }

    /* compiled from: DownsampleStrategy.java */
    /* loaded from: classes.dex */
    public static class c extends h {
        @Override // r4.h
        public final int a(int i6, int i10, int i11, int i12) {
            if (b(i6, i10, i11, i12) == 1.0f) {
                return 2;
            }
            return h.f30396a.a(i6, i10, i11, i12);
        }

        @Override // r4.h
        public final float b(int i6, int i10, int i11, int i12) {
            return Math.min(1.0f, h.f30396a.b(i6, i10, i11, i12));
        }
    }

    /* compiled from: DownsampleStrategy.java */
    /* loaded from: classes.dex */
    public static class d extends h {
        @Override // r4.h
        public final int a(int i6, int i10, int i11, int i12) {
            return 2;
        }

        @Override // r4.h
        public final float b(int i6, int i10, int i11, int i12) {
            return Math.max(i11 / i6, i12 / i10);
        }
    }

    /* compiled from: DownsampleStrategy.java */
    /* loaded from: classes.dex */
    public static class e extends h {
        @Override // r4.h
        public final int a(int i6, int i10, int i11, int i12) {
            if (h.f30401g) {
                return 2;
            }
            return 1;
        }

        @Override // r4.h
        public final float b(int i6, int i10, int i11, int i12) {
            if (h.f30401g) {
                return Math.min(i11 / i6, i12 / i10);
            }
            int max = Math.max(i10 / i12, i6 / i11);
            if (max == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(max);
        }
    }

    /* compiled from: DownsampleStrategy.java */
    /* loaded from: classes.dex */
    public static class f extends h {
        @Override // r4.h
        public final int a(int i6, int i10, int i11, int i12) {
            return 2;
        }

        @Override // r4.h
        public final float b(int i6, int i10, int i11, int i12) {
            return 1.0f;
        }
    }

    static {
        new a();
        new b();
        f30396a = new e();
        f30397b = new c();
        d dVar = new d();
        f30398c = dVar;
        f30399d = new f();
        f30400e = dVar;
        f = h4.f.a(dVar, "com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy");
        f30401g = true;
    }

    public abstract int a(int i6, int i10, int i11, int i12);

    public abstract float b(int i6, int i10, int i11, int i12);
}
