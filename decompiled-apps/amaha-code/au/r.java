package au;

import gu.a;
import gu.c;
import gu.g;
import gu.h;
import gu.n;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;
/* compiled from: ProtoBuf.java */
/* loaded from: classes2.dex */
public final class r extends g.c<r> {
    public static final r G;
    public static final a H = new a();
    public c A;
    public List<p> B;
    public List<Integer> C;
    public int D;
    public byte E;
    public int F;

    /* renamed from: v  reason: collision with root package name */
    public final gu.c f3838v;

    /* renamed from: w  reason: collision with root package name */
    public int f3839w;

    /* renamed from: x  reason: collision with root package name */
    public int f3840x;

    /* renamed from: y  reason: collision with root package name */
    public int f3841y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f3842z;

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes2.dex */
    public static class a extends gu.b<r> {
        @Override // gu.p
        public final Object a(gu.d dVar, gu.e eVar) {
            return new r(dVar, eVar);
        }
    }

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes2.dex */
    public static final class b extends g.b<r, b> {
        public boolean A;
        public c B = c.INV;
        public List<p> C = Collections.emptyList();
        public List<Integer> D = Collections.emptyList();

        /* renamed from: x  reason: collision with root package name */
        public int f3843x;

        /* renamed from: y  reason: collision with root package name */
        public int f3844y;

        /* renamed from: z  reason: collision with root package name */
        public int f3845z;

        @Override // gu.a.AbstractC0262a, gu.n.a
        public final /* bridge */ /* synthetic */ n.a R(gu.d dVar, gu.e eVar) {
            n(dVar, eVar);
            return this;
        }

        @Override // gu.n.a
        public final gu.n build() {
            r l2 = l();
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
            m((r) gVar);
            return this;
        }

        public final r l() {
            r rVar = new r(this);
            int i6 = this.f3843x;
            int i10 = 1;
            if ((i6 & 1) != 1) {
                i10 = 0;
            }
            rVar.f3840x = this.f3844y;
            if ((i6 & 2) == 2) {
                i10 |= 2;
            }
            rVar.f3841y = this.f3845z;
            if ((i6 & 4) == 4) {
                i10 |= 4;
            }
            rVar.f3842z = this.A;
            if ((i6 & 8) == 8) {
                i10 |= 8;
            }
            rVar.A = this.B;
            if ((i6 & 16) == 16) {
                this.C = Collections.unmodifiableList(this.C);
                this.f3843x &= -17;
            }
            rVar.B = this.C;
            if ((this.f3843x & 32) == 32) {
                this.D = Collections.unmodifiableList(this.D);
                this.f3843x &= -33;
            }
            rVar.C = this.D;
            rVar.f3839w = i10;
            return rVar;
        }

        public final void m(r rVar) {
            boolean z10;
            boolean z11;
            boolean z12;
            if (rVar == r.G) {
                return;
            }
            int i6 = rVar.f3839w;
            boolean z13 = false;
            if ((i6 & 1) == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                int i10 = rVar.f3840x;
                this.f3843x |= 1;
                this.f3844y = i10;
            }
            if ((i6 & 2) == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                int i11 = rVar.f3841y;
                this.f3843x = 2 | this.f3843x;
                this.f3845z = i11;
            }
            if ((i6 & 4) == 4) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                boolean z14 = rVar.f3842z;
                this.f3843x = 4 | this.f3843x;
                this.A = z14;
            }
            if ((i6 & 8) == 8) {
                z13 = true;
            }
            if (z13) {
                c cVar = rVar.A;
                cVar.getClass();
                this.f3843x = 8 | this.f3843x;
                this.B = cVar;
            }
            if (!rVar.B.isEmpty()) {
                if (this.C.isEmpty()) {
                    this.C = rVar.B;
                    this.f3843x &= -17;
                } else {
                    if ((this.f3843x & 16) != 16) {
                        this.C = new ArrayList(this.C);
                        this.f3843x |= 16;
                    }
                    this.C.addAll(rVar.B);
                }
            }
            if (!rVar.C.isEmpty()) {
                if (this.D.isEmpty()) {
                    this.D = rVar.C;
                    this.f3843x &= -33;
                } else {
                    if ((this.f3843x & 32) != 32) {
                        this.D = new ArrayList(this.D);
                        this.f3843x |= 32;
                    }
                    this.D.addAll(rVar.C);
                }
            }
            k(rVar);
            this.f16856u = this.f16856u.g(rVar.f3838v);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void n(gu.d dVar, gu.e eVar) {
            r rVar;
            try {
                try {
                    r.H.getClass();
                    m(new r(dVar, eVar));
                } catch (Throwable th2) {
                    th = th2;
                    rVar = null;
                    if (rVar != null) {
                        m(rVar);
                    }
                    throw th;
                }
            } catch (InvalidProtocolBufferException e10) {
                rVar = (r) e10.f23476u;
                try {
                    throw e10;
                } catch (Throwable th3) {
                    th = th3;
                    if (rVar != null) {
                    }
                    throw th;
                }
            }
        }
    }

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes2.dex */
    public enum c implements h.a {
        IN(0),
        OUT(1),
        INV(2);
        

        /* renamed from: u  reason: collision with root package name */
        public final int f3850u;

        c(int i6) {
            this.f3850u = i6;
        }

        @Override // gu.h.a
        public final int e() {
            return this.f3850u;
        }
    }

    static {
        r rVar = new r(0);
        G = rVar;
        rVar.f3840x = 0;
        rVar.f3841y = 0;
        rVar.f3842z = false;
        rVar.A = c.INV;
        rVar.B = Collections.emptyList();
        rVar.C = Collections.emptyList();
    }

    public r() {
        throw null;
    }

    public r(g.b bVar) {
        super(bVar);
        this.D = -1;
        this.E = (byte) -1;
        this.F = -1;
        this.f3838v = bVar.f16856u;
    }

    @Override // gu.n
    public final n.a a() {
        b bVar = new b();
        bVar.m(this);
        return bVar;
    }

    @Override // gu.n
    public final int b() {
        int i6;
        int i10 = this.F;
        if (i10 != -1) {
            return i10;
        }
        if ((this.f3839w & 1) == 1) {
            i6 = CodedOutputStream.b(1, this.f3840x) + 0;
        } else {
            i6 = 0;
        }
        if ((this.f3839w & 2) == 2) {
            i6 += CodedOutputStream.b(2, this.f3841y);
        }
        if ((this.f3839w & 4) == 4) {
            i6 += CodedOutputStream.h(3) + 1;
        }
        if ((this.f3839w & 8) == 8) {
            i6 += CodedOutputStream.a(4, this.A.f3850u);
        }
        for (int i11 = 0; i11 < this.B.size(); i11++) {
            i6 += CodedOutputStream.d(5, this.B.get(i11));
        }
        int i12 = 0;
        for (int i13 = 0; i13 < this.C.size(); i13++) {
            i12 += CodedOutputStream.c(this.C.get(i13).intValue());
        }
        int i14 = i6 + i12;
        if (!this.C.isEmpty()) {
            i14 = i14 + 1 + CodedOutputStream.c(i12);
        }
        this.D = i12;
        int size = this.f3838v.size() + j() + i14;
        this.F = size;
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
        byte b10 = this.E;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        int i6 = this.f3839w;
        if ((i6 & 1) == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            this.E = (byte) 0;
            return false;
        }
        if ((i6 & 2) == 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            this.E = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < this.B.size(); i10++) {
            if (!this.B.get(i10).d()) {
                this.E = (byte) 0;
                return false;
            }
        }
        if (!i()) {
            this.E = (byte) 0;
            return false;
        }
        this.E = (byte) 1;
        return true;
    }

    @Override // gu.o
    public final gu.n e() {
        return G;
    }

    @Override // gu.n
    public final void f(CodedOutputStream codedOutputStream) {
        b();
        g.c.a aVar = new g.c.a(this);
        if ((this.f3839w & 1) == 1) {
            codedOutputStream.m(1, this.f3840x);
        }
        if ((this.f3839w & 2) == 2) {
            codedOutputStream.m(2, this.f3841y);
        }
        if ((this.f3839w & 4) == 4) {
            boolean z10 = this.f3842z;
            codedOutputStream.x(3, 0);
            codedOutputStream.q(z10 ? 1 : 0);
        }
        if ((this.f3839w & 8) == 8) {
            codedOutputStream.l(4, this.A.f3850u);
        }
        for (int i6 = 0; i6 < this.B.size(); i6++) {
            codedOutputStream.o(5, this.B.get(i6));
        }
        if (this.C.size() > 0) {
            codedOutputStream.v(50);
            codedOutputStream.v(this.D);
        }
        for (int i10 = 0; i10 < this.C.size(); i10++) {
            codedOutputStream.n(this.C.get(i10).intValue());
        }
        aVar.a(1000, codedOutputStream);
        codedOutputStream.r(this.f3838v);
    }

    public r(int i6) {
        this.D = -1;
        this.E = (byte) -1;
        this.F = -1;
        this.f3838v = gu.c.f16833u;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public r(gu.d dVar, gu.e eVar) {
        c cVar;
        this.D = -1;
        this.E = (byte) -1;
        this.F = -1;
        this.f3840x = 0;
        this.f3841y = 0;
        this.f3842z = false;
        c cVar2 = c.INV;
        this.A = cVar2;
        this.B = Collections.emptyList();
        this.C = Collections.emptyList();
        c.b bVar = new c.b();
        CodedOutputStream j10 = CodedOutputStream.j(bVar, 1);
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            try {
                try {
                    int n10 = dVar.n();
                    if (n10 != 0) {
                        if (n10 == 8) {
                            this.f3839w |= 1;
                            this.f3840x = dVar.k();
                        } else if (n10 == 16) {
                            this.f3839w |= 2;
                            this.f3841y = dVar.k();
                        } else if (n10 == 24) {
                            this.f3839w |= 4;
                            this.f3842z = dVar.l() != 0;
                        } else if (n10 == 32) {
                            int k10 = dVar.k();
                            if (k10 == 0) {
                                cVar = c.IN;
                            } else if (k10 != 1) {
                                cVar = k10 != 2 ? null : cVar2;
                            } else {
                                cVar = c.OUT;
                            }
                            if (cVar == null) {
                                j10.v(n10);
                                j10.v(k10);
                            } else {
                                this.f3839w |= 8;
                                this.A = cVar;
                            }
                        } else if (n10 == 42) {
                            if (!(z11 & true)) {
                                this.B = new ArrayList();
                                z11 |= true;
                            }
                            this.B.add(dVar.g(p.O, eVar));
                        } else if (n10 == 48) {
                            if (!(z11 & true)) {
                                this.C = new ArrayList();
                                z11 |= true;
                            }
                            this.C.add(Integer.valueOf(dVar.k()));
                        } else if (n10 != 50) {
                            if (!o(dVar, j10, eVar, n10)) {
                            }
                        } else {
                            int d10 = dVar.d(dVar.k());
                            if (!(z11 & true) && dVar.b() > 0) {
                                this.C = new ArrayList();
                                z11 |= true;
                            }
                            while (dVar.b() > 0) {
                                this.C.add(Integer.valueOf(dVar.k()));
                            }
                            dVar.c(d10);
                        }
                    }
                    z10 = true;
                } catch (Throwable th2) {
                    if (z11 & true) {
                        this.B = Collections.unmodifiableList(this.B);
                    }
                    if (z11 & true) {
                        this.C = Collections.unmodifiableList(this.C);
                    }
                    try {
                        j10.i();
                    } catch (IOException unused) {
                        this.f3838v = bVar.g();
                        m();
                        throw th2;
                    } catch (Throwable th3) {
                        this.f3838v = bVar.g();
                        throw th3;
                    }
                }
            } catch (InvalidProtocolBufferException e10) {
                e10.f23476u = this;
                throw e10;
            } catch (IOException e11) {
                InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e11.getMessage());
                invalidProtocolBufferException.f23476u = this;
                throw invalidProtocolBufferException;
            }
        }
        if (z11 & true) {
            this.B = Collections.unmodifiableList(this.B);
        }
        if (z11 & true) {
            this.C = Collections.unmodifiableList(this.C);
        }
        try {
            j10.i();
        } catch (IOException unused2) {
            this.f3838v = bVar.g();
            m();
        } catch (Throwable th4) {
            this.f3838v = bVar.g();
            throw th4;
        }
    }
}
