package u7;

import u7.t;
/* compiled from: BinarySearchSeeker.java */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public final C0566a f33837a;

    /* renamed from: b  reason: collision with root package name */
    public final f f33838b;

    /* renamed from: c  reason: collision with root package name */
    public c f33839c;

    /* renamed from: d  reason: collision with root package name */
    public final int f33840d;

    /* compiled from: BinarySearchSeeker.java */
    /* renamed from: u7.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0566a implements t {

        /* renamed from: a  reason: collision with root package name */
        public final d f33841a;

        /* renamed from: b  reason: collision with root package name */
        public final long f33842b;

        /* renamed from: c  reason: collision with root package name */
        public final long f33843c = 0;

        /* renamed from: d  reason: collision with root package name */
        public final long f33844d;

        /* renamed from: e  reason: collision with root package name */
        public final long f33845e;
        public final long f;

        /* renamed from: g  reason: collision with root package name */
        public final long f33846g;

        public C0566a(d dVar, long j10, long j11, long j12, long j13, long j14) {
            this.f33841a = dVar;
            this.f33842b = j10;
            this.f33844d = j11;
            this.f33845e = j12;
            this.f = j13;
            this.f33846g = j14;
        }

        @Override // u7.t
        public final boolean d() {
            return true;
        }

        @Override // u7.t
        public final t.a i(long j10) {
            u uVar = new u(j10, c.a(this.f33841a.d(j10), this.f33843c, this.f33844d, this.f33845e, this.f, this.f33846g));
            return new t.a(uVar, uVar);
        }

        @Override // u7.t
        public final long j() {
            return this.f33842b;
        }
    }

    /* compiled from: BinarySearchSeeker.java */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final long f33847a;

        /* renamed from: b  reason: collision with root package name */
        public final long f33848b;

        /* renamed from: c  reason: collision with root package name */
        public final long f33849c;

        /* renamed from: d  reason: collision with root package name */
        public long f33850d;

        /* renamed from: e  reason: collision with root package name */
        public long f33851e;
        public long f;

        /* renamed from: g  reason: collision with root package name */
        public long f33852g;

        /* renamed from: h  reason: collision with root package name */
        public long f33853h;

        public c(long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
            this.f33847a = j10;
            this.f33848b = j11;
            this.f33850d = j12;
            this.f33851e = j13;
            this.f = j14;
            this.f33852g = j15;
            this.f33849c = j16;
            this.f33853h = a(j11, j12, j13, j14, j15, j16);
        }

        public static long a(long j10, long j11, long j12, long j13, long j14, long j15) {
            if (j13 + 1 < j14 && j11 + 1 < j12) {
                long j16 = ((float) (j10 - j11)) * (((float) (j14 - j13)) / ((float) (j12 - j11)));
                return c9.w.i(((j16 + j13) - j15) - (j16 / 20), j13, j14 - 1);
            }
            return j13;
        }
    }

    /* compiled from: BinarySearchSeeker.java */
    /* loaded from: classes.dex */
    public interface d {
        long d(long j10);
    }

    /* compiled from: BinarySearchSeeker.java */
    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: d  reason: collision with root package name */
        public static final e f33854d = new e(-3, -9223372036854775807L, -1);

        /* renamed from: a  reason: collision with root package name */
        public final int f33855a;

        /* renamed from: b  reason: collision with root package name */
        public final long f33856b;

        /* renamed from: c  reason: collision with root package name */
        public final long f33857c;

        public e(int i6, long j10, long j11) {
            this.f33855a = i6;
            this.f33856b = j10;
            this.f33857c = j11;
        }

        public static e a(long j10) {
            return new e(0, -9223372036854775807L, j10);
        }
    }

    /* compiled from: BinarySearchSeeker.java */
    /* loaded from: classes.dex */
    public interface f {
        e a(i iVar, long j10);

        void b();
    }

    public a(d dVar, f fVar, long j10, long j11, long j12, long j13, long j14, int i6) {
        this.f33838b = fVar;
        this.f33840d = i6;
        this.f33837a = new C0566a(dVar, j10, j11, j12, j13, j14);
    }

    public static int b(i iVar, long j10, s sVar) {
        if (j10 == iVar.getPosition()) {
            return 0;
        }
        sVar.f33905a = j10;
        return 1;
    }

    public final int a(i iVar, s sVar) {
        boolean z10;
        while (true) {
            c cVar = this.f33839c;
            sc.b.E(cVar);
            long j10 = cVar.f;
            long j11 = cVar.f33852g;
            long j12 = cVar.f33853h;
            f fVar = this.f33838b;
            if (j11 - j10 <= this.f33840d) {
                this.f33839c = null;
                fVar.b();
                return b(iVar, j10, sVar);
            }
            long position = j12 - iVar.getPosition();
            if (position >= 0 && position <= 262144) {
                iVar.l((int) position);
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                return b(iVar, j12, sVar);
            }
            iVar.k();
            e a10 = fVar.a(iVar, cVar.f33848b);
            int i6 = a10.f33855a;
            if (i6 != -3) {
                long j13 = a10.f33856b;
                long j14 = a10.f33857c;
                if (i6 != -2) {
                    if (i6 != -1) {
                        if (i6 == 0) {
                            long position2 = j14 - iVar.getPosition();
                            if (position2 >= 0 && position2 <= 262144) {
                                iVar.l((int) position2);
                            }
                            this.f33839c = null;
                            fVar.b();
                            return b(iVar, j14, sVar);
                        }
                        throw new IllegalStateException("Invalid case");
                    }
                    cVar.f33851e = j13;
                    cVar.f33852g = j14;
                    cVar.f33853h = c.a(cVar.f33848b, cVar.f33850d, j13, cVar.f, j14, cVar.f33849c);
                } else {
                    cVar.f33850d = j13;
                    cVar.f = j14;
                    cVar.f33853h = c.a(cVar.f33848b, j13, cVar.f33851e, j14, cVar.f33852g, cVar.f33849c);
                }
            } else {
                this.f33839c = null;
                fVar.b();
                return b(iVar, j12, sVar);
            }
        }
    }

    public final void c(long j10) {
        c cVar = this.f33839c;
        if (cVar != null && cVar.f33847a == j10) {
            return;
        }
        C0566a c0566a = this.f33837a;
        this.f33839c = new c(j10, c0566a.f33841a.d(j10), c0566a.f33843c, c0566a.f33844d, c0566a.f33845e, c0566a.f, c0566a.f33846g);
    }

    /* compiled from: BinarySearchSeeker.java */
    /* loaded from: classes.dex */
    public static final class b implements d {
        @Override // u7.a.d
        public final long d(long j10) {
            return j10;
        }
    }
}
