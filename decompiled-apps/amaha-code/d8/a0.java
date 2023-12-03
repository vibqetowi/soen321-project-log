package d8;

import u7.a;
/* compiled from: TsBinarySearchSeeker.java */
/* loaded from: classes.dex */
public final class a0 extends u7.a {

    /* compiled from: TsBinarySearchSeeker.java */
    /* loaded from: classes.dex */
    public static final class a implements a.f {

        /* renamed from: a  reason: collision with root package name */
        public final c9.v f12281a;

        /* renamed from: b  reason: collision with root package name */
        public final c9.q f12282b = new c9.q();

        /* renamed from: c  reason: collision with root package name */
        public final int f12283c;

        /* renamed from: d  reason: collision with root package name */
        public final int f12284d;

        public a(int i6, c9.v vVar, int i10) {
            this.f12283c = i6;
            this.f12281a = vVar;
            this.f12284d = i10;
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x008e, code lost:
            if (r13 == (-9223372036854775807L)) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x009c, code lost:
            return u7.a.e.f33854d;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:?, code lost:
            return new u7.a.e(-2, r13, r5 + r3);
         */
        @Override // u7.a.f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final a.e a(u7.i iVar, long j10) {
            long position = iVar.getPosition();
            int min = (int) Math.min(this.f12284d, iVar.getLength() - position);
            c9.q qVar = this.f12282b;
            qVar.x(min);
            iVar.b(0, qVar.f5186a, min);
            int i6 = qVar.f5188c;
            long j11 = -1;
            long j12 = -1;
            long j13 = -9223372036854775807L;
            while (true) {
                int i10 = qVar.f5188c;
                int i11 = qVar.f5187b;
                if (i10 - i11 < 188) {
                    break;
                }
                byte[] bArr = qVar.f5186a;
                while (i11 < i6 && bArr[i11] != 71) {
                    i11++;
                }
                int i12 = i11 + 188;
                if (i12 > i6) {
                    break;
                }
                long T = kc.f.T(qVar, i11, this.f12283c);
                if (T != -9223372036854775807L) {
                    long b10 = this.f12281a.b(T);
                    if (b10 > j10) {
                        if (j13 == -9223372036854775807L) {
                            return new a.e(-1, b10, position);
                        }
                        return a.e.a(position + j12);
                    } else if (100000 + b10 > j10) {
                        return a.e.a(position + i11);
                    } else {
                        j13 = b10;
                        j12 = i11;
                    }
                }
                qVar.A(i12);
                j11 = i12;
            }
        }

        @Override // u7.a.f
        public final void b() {
            byte[] bArr = c9.w.f;
            c9.q qVar = this.f12282b;
            qVar.getClass();
            qVar.y(bArr, bArr.length);
        }
    }

    public a0(c9.v vVar, long j10, long j11, int i6, int i10) {
        super(new a.b(), new a(i6, vVar, i10), j10, j10 + 1, 0L, j11, 188L, 940);
    }
}
