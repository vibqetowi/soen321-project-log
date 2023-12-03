package w7;

import c9.q;
import j$.util.Objects;
import u7.a;
import u7.i;
import u7.l;
import u7.o;
/* compiled from: FlacBinarySearchSeeker.java */
/* loaded from: classes.dex */
public final class a extends u7.a {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(o oVar, int i6, long j10, long j11) {
        super(r1, r2, r3, r5, j10, j11, r8 + r10, Math.max(6, r7));
        long j12;
        long j13;
        long j14;
        Objects.requireNonNull(oVar);
        f0.b bVar = new f0.b(18, oVar);
        C0612a c0612a = new C0612a(oVar, i6);
        long c10 = oVar.c();
        long j15 = oVar.f33892j;
        int i10 = oVar.f33886c;
        int i11 = oVar.f33887d;
        if (i11 > 0) {
            j13 = (i11 + i10) / 2;
            j14 = 1;
        } else {
            int i12 = oVar.f33885b;
            int i13 = oVar.f33884a;
            if (i13 == i12 && i13 > 0) {
                j12 = i13;
            } else {
                j12 = 4096;
            }
            j13 = ((j12 * oVar.f33889g) * oVar.f33890h) / 8;
            j14 = 64;
        }
    }

    /* compiled from: FlacBinarySearchSeeker.java */
    /* renamed from: w7.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0612a implements a.f {

        /* renamed from: a  reason: collision with root package name */
        public final o f36574a;

        /* renamed from: b  reason: collision with root package name */
        public final int f36575b;

        /* renamed from: c  reason: collision with root package name */
        public final l.a f36576c = new l.a();

        public C0612a(o oVar, int i6) {
            this.f36574a = oVar;
            this.f36575b = i6;
        }

        @Override // u7.a.f
        public final a.e a(i iVar, long j10) {
            long position = iVar.getPosition();
            long c10 = c(iVar);
            long e10 = iVar.e();
            iVar.f(Math.max(6, this.f36574a.f33886c));
            long c11 = c(iVar);
            long e11 = iVar.e();
            if (c10 <= j10 && c11 > j10) {
                return a.e.a(e10);
            }
            if (c11 <= j10) {
                return new a.e(-2, c11, e11);
            }
            return new a.e(-1, c10, position);
        }

        public final long c(i iVar) {
            l.a aVar;
            o oVar;
            int g5;
            while (true) {
                aVar = this.f36576c;
                oVar = this.f36574a;
                if (iVar.e() >= iVar.getLength() - 6) {
                    break;
                }
                long e10 = iVar.e();
                byte[] bArr = new byte[2];
                int i6 = 0;
                boolean a10 = false;
                iVar.b(0, bArr, 2);
                int i10 = ((bArr[0] & 255) << 8) | (bArr[1] & 255);
                int i11 = this.f36575b;
                if (i10 != i11) {
                    iVar.k();
                    iVar.f((int) (e10 - iVar.getPosition()));
                } else {
                    q qVar = new q(16);
                    System.arraycopy(bArr, 0, qVar.f5186a, 0, 2);
                    byte[] bArr2 = qVar.f5186a;
                    while (i6 < 14 && (g5 = iVar.g(2 + i6, bArr2, 14 - i6)) != -1) {
                        i6 += g5;
                    }
                    qVar.z(i6);
                    iVar.k();
                    iVar.f((int) (e10 - iVar.getPosition()));
                    a10 = l.a(qVar, oVar, i11, aVar);
                }
                if (a10) {
                    break;
                }
                iVar.f(1);
            }
            if (iVar.e() >= iVar.getLength() - 6) {
                iVar.f((int) (iVar.getLength() - iVar.e()));
                return oVar.f33892j;
            }
            return aVar.f33881a;
        }

        @Override // u7.a.f
        public final /* synthetic */ void b() {
        }
    }
}
