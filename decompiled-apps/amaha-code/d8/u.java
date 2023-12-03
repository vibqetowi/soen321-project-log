package d8;

import u7.a;
/* compiled from: PsBinarySearchSeeker.java */
/* loaded from: classes.dex */
public final class u extends u7.a {

    /* compiled from: PsBinarySearchSeeker.java */
    /* loaded from: classes.dex */
    public static final class a implements a.f {

        /* renamed from: a  reason: collision with root package name */
        public final c9.v f12571a;

        /* renamed from: b  reason: collision with root package name */
        public final c9.q f12572b = new c9.q();

        public a(c9.v vVar) {
            this.f12571a = vVar;
        }

        @Override // u7.a.f
        public final a.e a(u7.i iVar, long j10) {
            int d10;
            long position = iVar.getPosition();
            int min = (int) Math.min(20000L, iVar.getLength() - position);
            c9.q qVar = this.f12572b;
            qVar.x(min);
            iVar.b(0, qVar.f5186a, min);
            int i6 = -1;
            long j11 = -9223372036854775807L;
            int i10 = -1;
            while (true) {
                int i11 = qVar.f5188c;
                int i12 = qVar.f5187b;
                if (i11 - i12 >= 4) {
                    if (u.d(qVar.f5186a, i12) != 442) {
                        qVar.B(1);
                    } else {
                        qVar.B(4);
                        long c10 = v.c(qVar);
                        if (c10 != -9223372036854775807L) {
                            long b10 = this.f12571a.b(c10);
                            if (b10 > j10) {
                                if (j11 == -9223372036854775807L) {
                                    return new a.e(-1, b10, position);
                                }
                                return a.e.a(position + i10);
                            } else if (100000 + b10 > j10) {
                                return a.e.a(position + qVar.f5187b);
                            } else {
                                i10 = qVar.f5187b;
                                j11 = b10;
                            }
                        }
                        int i13 = qVar.f5188c;
                        if (i13 - qVar.f5187b < 10) {
                            qVar.A(i13);
                        } else {
                            qVar.B(9);
                            int q10 = qVar.q() & 7;
                            if (qVar.f5188c - qVar.f5187b < q10) {
                                qVar.A(i13);
                            } else {
                                qVar.B(q10);
                                int i14 = qVar.f5188c;
                                int i15 = qVar.f5187b;
                                if (i14 - i15 < 4) {
                                    qVar.A(i13);
                                } else {
                                    if (u.d(qVar.f5186a, i15) == 443) {
                                        qVar.B(4);
                                        int v10 = qVar.v();
                                        if (qVar.f5188c - qVar.f5187b < v10) {
                                            qVar.A(i13);
                                        } else {
                                            qVar.B(v10);
                                        }
                                    }
                                    while (true) {
                                        int i16 = qVar.f5188c;
                                        int i17 = qVar.f5187b;
                                        if (i16 - i17 < 4 || (d10 = u.d(qVar.f5186a, i17)) == 442 || d10 == 441 || (d10 >>> 8) != 1) {
                                            break;
                                        }
                                        qVar.B(4);
                                        if (qVar.f5188c - qVar.f5187b < 2) {
                                            qVar.A(i13);
                                            break;
                                        }
                                        qVar.A(Math.min(qVar.f5188c, qVar.f5187b + qVar.v()));
                                    }
                                }
                            }
                        }
                        i6 = qVar.f5187b;
                    }
                } else if (j11 != -9223372036854775807L) {
                    return new a.e(-2, j11, position + i6);
                } else {
                    return a.e.f33854d;
                }
            }
        }

        @Override // u7.a.f
        public final void b() {
            byte[] bArr = c9.w.f;
            c9.q qVar = this.f12572b;
            qVar.getClass();
            qVar.y(bArr, bArr.length);
        }
    }

    public u(c9.v vVar, long j10, long j11) {
        super(new a.b(), new a(vVar), j10, j10 + 1, 0L, j11, 188L, 1000);
    }

    public static int d(byte[] bArr, int i6) {
        return (bArr[i6 + 3] & 255) | ((bArr[i6] & 255) << 24) | ((bArr[i6 + 1] & 255) << 16) | ((bArr[i6 + 2] & 255) << 8);
    }
}
