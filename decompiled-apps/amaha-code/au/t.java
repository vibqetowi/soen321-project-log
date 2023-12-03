package au;

import androidx.recyclerview.widget.k;
import au.p;
import gu.a;
import gu.c;
import gu.g;
import gu.n;
import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;
/* compiled from: ProtoBuf.java */
/* loaded from: classes2.dex */
public final class t extends g.c<t> {
    public static final t F;
    public static final a G = new a();
    public int A;
    public p B;
    public int C;
    public byte D;
    public int E;

    /* renamed from: v  reason: collision with root package name */
    public final gu.c f3860v;

    /* renamed from: w  reason: collision with root package name */
    public int f3861w;

    /* renamed from: x  reason: collision with root package name */
    public int f3862x;

    /* renamed from: y  reason: collision with root package name */
    public int f3863y;

    /* renamed from: z  reason: collision with root package name */
    public p f3864z;

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes2.dex */
    public static class a extends gu.b<t> {
        @Override // gu.p
        public final Object a(gu.d dVar, gu.e eVar) {
            return new t(dVar, eVar);
        }
    }

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes2.dex */
    public static final class b extends g.b<t, b> {
        public p A;
        public int B;
        public p C;
        public int D;

        /* renamed from: x  reason: collision with root package name */
        public int f3865x;

        /* renamed from: y  reason: collision with root package name */
        public int f3866y;

        /* renamed from: z  reason: collision with root package name */
        public int f3867z;

        public b() {
            p pVar = p.N;
            this.A = pVar;
            this.C = pVar;
        }

        @Override // gu.a.AbstractC0262a, gu.n.a
        public final /* bridge */ /* synthetic */ n.a R(gu.d dVar, gu.e eVar) {
            n(dVar, eVar);
            return this;
        }

        @Override // gu.n.a
        public final gu.n build() {
            t l2 = l();
            if (l2.d()) {
                return l2;
            }
            throw new UninitializedMessageException();
        }

        @Override // gu.g.a
        public final Object clone() {
            b bVar = new b();
            bVar.m(l());
            return bVar;
        }

        @Override // gu.a.AbstractC0262a
        public final /* bridge */ /* synthetic */ a.AbstractC0262a h(gu.d dVar, gu.e eVar) {
            n(dVar, eVar);
            return this;
        }

        @Override // gu.g.a
        public final g.a i() {
            b bVar = new b();
            bVar.m(l());
            return bVar;
        }

        @Override // gu.g.a
        public final /* bridge */ /* synthetic */ g.a j(gu.g gVar) {
            m((t) gVar);
            return this;
        }

        public final t l() {
            t tVar = new t(this);
            int i6 = this.f3865x;
            int i10 = 1;
            if ((i6 & 1) != 1) {
                i10 = 0;
            }
            tVar.f3862x = this.f3866y;
            if ((i6 & 2) == 2) {
                i10 |= 2;
            }
            tVar.f3863y = this.f3867z;
            if ((i6 & 4) == 4) {
                i10 |= 4;
            }
            tVar.f3864z = this.A;
            if ((i6 & 8) == 8) {
                i10 |= 8;
            }
            tVar.A = this.B;
            if ((i6 & 16) == 16) {
                i10 |= 16;
            }
            tVar.B = this.C;
            if ((i6 & 32) == 32) {
                i10 |= 32;
            }
            tVar.C = this.D;
            tVar.f3861w = i10;
            return tVar;
        }

        public final void m(t tVar) {
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13;
            boolean z14;
            p pVar;
            p pVar2;
            if (tVar == t.F) {
                return;
            }
            int i6 = tVar.f3861w;
            boolean z15 = false;
            if ((i6 & 1) == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                int i10 = tVar.f3862x;
                this.f3865x |= 1;
                this.f3866y = i10;
            }
            if ((i6 & 2) == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                int i11 = tVar.f3863y;
                this.f3865x = 2 | this.f3865x;
                this.f3867z = i11;
            }
            if ((i6 & 4) == 4) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                p pVar3 = tVar.f3864z;
                if ((this.f3865x & 4) == 4 && (pVar2 = this.A) != p.N) {
                    p.c s10 = p.s(pVar2);
                    s10.m(pVar3);
                    this.A = s10.l();
                } else {
                    this.A = pVar3;
                }
                this.f3865x |= 4;
            }
            int i12 = tVar.f3861w;
            if ((i12 & 8) == 8) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z13) {
                int i13 = tVar.A;
                this.f3865x = 8 | this.f3865x;
                this.B = i13;
            }
            if ((i12 & 16) == 16) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (z14) {
                p pVar4 = tVar.B;
                if ((this.f3865x & 16) == 16 && (pVar = this.C) != p.N) {
                    p.c s11 = p.s(pVar);
                    s11.m(pVar4);
                    this.C = s11.l();
                } else {
                    this.C = pVar4;
                }
                this.f3865x |= 16;
            }
            if ((tVar.f3861w & 32) == 32) {
                z15 = true;
            }
            if (z15) {
                int i14 = tVar.C;
                this.f3865x = 32 | this.f3865x;
                this.D = i14;
            }
            k(tVar);
            this.f16856u = this.f16856u.g(tVar.f3860v);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void n(gu.d dVar, gu.e eVar) {
            t tVar;
            try {
                try {
                    t.G.getClass();
                    m(new t(dVar, eVar));
                } catch (Throwable th2) {
                    th = th2;
                    tVar = null;
                    if (tVar != null) {
                        m(tVar);
                    }
                    throw th;
                }
            } catch (InvalidProtocolBufferException e10) {
                tVar = (t) e10.f23476u;
                try {
                    throw e10;
                } catch (Throwable th3) {
                    th = th3;
                    if (tVar != null) {
                    }
                    throw th;
                }
            }
        }
    }

    static {
        t tVar = new t(0);
        F = tVar;
        tVar.f3862x = 0;
        tVar.f3863y = 0;
        p pVar = p.N;
        tVar.f3864z = pVar;
        tVar.A = 0;
        tVar.B = pVar;
        tVar.C = 0;
    }

    public t() {
        throw null;
    }

    public t(g.b bVar) {
        super(bVar);
        this.D = (byte) -1;
        this.E = -1;
        this.f3860v = bVar.f16856u;
    }

    @Override // gu.n
    public final n.a a() {
        b bVar = new b();
        bVar.m(this);
        return bVar;
    }

    @Override // gu.n
    public final int b() {
        int i6 = this.E;
        if (i6 != -1) {
            return i6;
        }
        int i10 = 0;
        if ((this.f3861w & 1) == 1) {
            i10 = 0 + CodedOutputStream.b(1, this.f3862x);
        }
        if ((this.f3861w & 2) == 2) {
            i10 += CodedOutputStream.b(2, this.f3863y);
        }
        if ((this.f3861w & 4) == 4) {
            i10 += CodedOutputStream.d(3, this.f3864z);
        }
        if ((this.f3861w & 16) == 16) {
            i10 += CodedOutputStream.d(4, this.B);
        }
        if ((this.f3861w & 8) == 8) {
            i10 += CodedOutputStream.b(5, this.A);
        }
        if ((this.f3861w & 32) == 32) {
            i10 += CodedOutputStream.b(6, this.C);
        }
        int size = this.f3860v.size() + j() + i10;
        this.E = size;
        return size;
    }

    @Override // gu.n
    public final n.a c() {
        return new b();
    }

    @Override // gu.o
    public final boolean d() {
        boolean z10;
        boolean z11;
        boolean z12;
        byte b10 = this.D;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        int i6 = this.f3861w;
        if ((i6 & 2) == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            this.D = (byte) 0;
            return false;
        }
        if ((i6 & 4) == 4) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 && !this.f3864z.d()) {
            this.D = (byte) 0;
            return false;
        }
        if ((this.f3861w & 16) == 16) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12 && !this.B.d()) {
            this.D = (byte) 0;
            return false;
        } else if (!i()) {
            this.D = (byte) 0;
            return false;
        } else {
            this.D = (byte) 1;
            return true;
        }
    }

    @Override // gu.o
    public final gu.n e() {
        return F;
    }

    @Override // gu.n
    public final void f(CodedOutputStream codedOutputStream) {
        b();
        g.c.a aVar = new g.c.a(this);
        if ((this.f3861w & 1) == 1) {
            codedOutputStream.m(1, this.f3862x);
        }
        if ((this.f3861w & 2) == 2) {
            codedOutputStream.m(2, this.f3863y);
        }
        if ((this.f3861w & 4) == 4) {
            codedOutputStream.o(3, this.f3864z);
        }
        if ((this.f3861w & 16) == 16) {
            codedOutputStream.o(4, this.B);
        }
        if ((this.f3861w & 8) == 8) {
            codedOutputStream.m(5, this.A);
        }
        if ((this.f3861w & 32) == 32) {
            codedOutputStream.m(6, this.C);
        }
        aVar.a(k.d.DEFAULT_DRAG_ANIMATION_DURATION, codedOutputStream);
        codedOutputStream.r(this.f3860v);
    }

    public t(int i6) {
        this.D = (byte) -1;
        this.E = -1;
        this.f3860v = gu.c.f16833u;
    }

    public t(gu.d dVar, gu.e eVar) {
        this.D = (byte) -1;
        this.E = -1;
        boolean z10 = false;
        this.f3862x = 0;
        this.f3863y = 0;
        p pVar = p.N;
        this.f3864z = pVar;
        this.A = 0;
        this.B = pVar;
        this.C = 0;
        c.b bVar = new c.b();
        CodedOutputStream j10 = CodedOutputStream.j(bVar, 1);
        while (!z10) {
            try {
                try {
                    int n10 = dVar.n();
                    if (n10 != 0) {
                        if (n10 == 8) {
                            this.f3861w |= 1;
                            this.f3862x = dVar.k();
                        } else if (n10 != 16) {
                            p.c cVar = null;
                            if (n10 == 26) {
                                if ((this.f3861w & 4) == 4) {
                                    p pVar2 = this.f3864z;
                                    pVar2.getClass();
                                    cVar = p.s(pVar2);
                                }
                                p pVar3 = (p) dVar.g(p.O, eVar);
                                this.f3864z = pVar3;
                                if (cVar != null) {
                                    cVar.m(pVar3);
                                    this.f3864z = cVar.l();
                                }
                                this.f3861w |= 4;
                            } else if (n10 == 34) {
                                if ((this.f3861w & 16) == 16) {
                                    p pVar4 = this.B;
                                    pVar4.getClass();
                                    cVar = p.s(pVar4);
                                }
                                p pVar5 = (p) dVar.g(p.O, eVar);
                                this.B = pVar5;
                                if (cVar != null) {
                                    cVar.m(pVar5);
                                    this.B = cVar.l();
                                }
                                this.f3861w |= 16;
                            } else if (n10 == 40) {
                                this.f3861w |= 8;
                                this.A = dVar.k();
                            } else if (n10 != 48) {
                                if (!o(dVar, j10, eVar, n10)) {
                                }
                            } else {
                                this.f3861w |= 32;
                                this.C = dVar.k();
                            }
                        } else {
                            this.f3861w |= 2;
                            this.f3863y = dVar.k();
                        }
                    }
                    z10 = true;
                } catch (InvalidProtocolBufferException e10) {
                    e10.f23476u = this;
                    throw e10;
                } catch (IOException e11) {
                    InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e11.getMessage());
                    invalidProtocolBufferException.f23476u = this;
                    throw invalidProtocolBufferException;
                }
            } catch (Throwable th2) {
                try {
                    j10.i();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f3860v = bVar.g();
                    throw th3;
                }
                this.f3860v = bVar.g();
                m();
                throw th2;
            }
        }
        try {
            j10.i();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f3860v = bVar.g();
            throw th4;
        }
        this.f3860v = bVar.g();
        m();
    }
}
