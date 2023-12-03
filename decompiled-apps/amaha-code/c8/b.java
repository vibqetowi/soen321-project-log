package c8;

import c8.h;
import c9.q;
import c9.w;
import java.util.Arrays;
import u7.l;
import u7.m;
import u7.n;
import u7.o;
import u7.t;
/* compiled from: FlacReader.java */
/* loaded from: classes.dex */
public final class b extends h {

    /* renamed from: n  reason: collision with root package name */
    public o f5082n;

    /* renamed from: o  reason: collision with root package name */
    public a f5083o;

    /* compiled from: FlacReader.java */
    /* loaded from: classes.dex */
    public static final class a implements f {

        /* renamed from: a  reason: collision with root package name */
        public final o f5084a;

        /* renamed from: b  reason: collision with root package name */
        public final o.a f5085b;

        /* renamed from: c  reason: collision with root package name */
        public long f5086c = -1;

        /* renamed from: d  reason: collision with root package name */
        public long f5087d = -1;

        public a(o oVar, o.a aVar) {
            this.f5084a = oVar;
            this.f5085b = aVar;
        }

        @Override // c8.f
        public final t a() {
            boolean z10;
            if (this.f5086c != -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            sc.b.C(z10);
            return new n(this.f5084a, this.f5086c);
        }

        @Override // c8.f
        public final long b(u7.i iVar) {
            long j10 = this.f5087d;
            if (j10 < 0) {
                return -1L;
            }
            long j11 = -(j10 + 2);
            this.f5087d = -1L;
            return j11;
        }

        @Override // c8.f
        public final void c(long j10) {
            long[] jArr = this.f5085b.f33895a;
            this.f5087d = jArr[w.f(jArr, j10, true)];
        }
    }

    @Override // c8.h
    public final long b(q qVar) {
        boolean z10;
        byte[] bArr = qVar.f5186a;
        if (bArr[0] == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return -1L;
        }
        int i6 = (bArr[2] & 255) >> 4;
        if (i6 == 6 || i6 == 7) {
            qVar.B(4);
            qVar.w();
        }
        int b10 = l.b(i6, qVar);
        qVar.A(0);
        return b10;
    }

    @Override // c8.h
    public final boolean c(q qVar, long j10, h.a aVar) {
        boolean z10;
        byte[] bArr = qVar.f5186a;
        o oVar = this.f5082n;
        if (oVar == null) {
            o oVar2 = new o(bArr, 17);
            this.f5082n = oVar2;
            aVar.f5116a = oVar2.d(Arrays.copyOfRange(bArr, 9, qVar.f5188c), null);
            return true;
        }
        byte b10 = bArr[0];
        if ((b10 & Byte.MAX_VALUE) == 3) {
            o.a a10 = m.a(qVar);
            o oVar3 = new o(oVar.f33884a, oVar.f33885b, oVar.f33886c, oVar.f33887d, oVar.f33888e, oVar.f33889g, oVar.f33890h, oVar.f33892j, a10, oVar.f33894l);
            this.f5082n = oVar3;
            this.f5083o = new a(oVar3, a10);
            return true;
        }
        if (b10 == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return true;
        }
        a aVar2 = this.f5083o;
        if (aVar2 != null) {
            aVar2.f5086c = j10;
            aVar.f5117b = aVar2;
        }
        aVar.f5116a.getClass();
        return false;
    }

    @Override // c8.h
    public final void d(boolean z10) {
        super.d(z10);
        if (z10) {
            this.f5082n = null;
            this.f5083o = null;
        }
    }
}
