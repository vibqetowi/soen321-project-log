package au;

import au.p;
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
public final class g extends gu.g implements gu.o {
    public static final g F;
    public static final a G = new a();
    public int A;
    public List<g> B;
    public List<g> C;
    public byte D;
    public int E;

    /* renamed from: u  reason: collision with root package name */
    public final gu.c f3723u;

    /* renamed from: v  reason: collision with root package name */
    public int f3724v;

    /* renamed from: w  reason: collision with root package name */
    public int f3725w;

    /* renamed from: x  reason: collision with root package name */
    public int f3726x;

    /* renamed from: y  reason: collision with root package name */
    public c f3727y;

    /* renamed from: z  reason: collision with root package name */
    public p f3728z;

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes2.dex */
    public static class a extends gu.b<g> {
        @Override // gu.p
        public final Object a(gu.d dVar, gu.e eVar) {
            return new g(dVar, eVar);
        }
    }

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes2.dex */
    public static final class b extends g.a<g, b> implements gu.o {
        public int A;

        /* renamed from: v  reason: collision with root package name */
        public int f3729v;

        /* renamed from: w  reason: collision with root package name */
        public int f3730w;

        /* renamed from: x  reason: collision with root package name */
        public int f3731x;

        /* renamed from: y  reason: collision with root package name */
        public c f3732y = c.TRUE;

        /* renamed from: z  reason: collision with root package name */
        public p f3733z = p.N;
        public List<g> B = Collections.emptyList();
        public List<g> C = Collections.emptyList();

        @Override // gu.a.AbstractC0262a, gu.n.a
        public final /* bridge */ /* synthetic */ n.a R(gu.d dVar, gu.e eVar) {
            m(dVar, eVar);
            return this;
        }

        @Override // gu.n.a
        public final gu.n build() {
            g k10 = k();
            if (k10.d()) {
                return k10;
            }
            throw new UninitializedMessageException();
        }

        @Override // gu.g.a
        public final Object clone() {
            b bVar = new b();
            bVar.l(k());
            return bVar;
        }

        @Override // gu.a.AbstractC0262a
        public final /* bridge */ /* synthetic */ a.AbstractC0262a h(gu.d dVar, gu.e eVar) {
            m(dVar, eVar);
            return this;
        }

        @Override // gu.g.a
        public final b i() {
            b bVar = new b();
            bVar.l(k());
            return bVar;
        }

        @Override // gu.g.a
        public final /* bridge */ /* synthetic */ b j(g gVar) {
            l(gVar);
            return this;
        }

        public final g k() {
            g gVar = new g(this);
            int i6 = this.f3729v;
            int i10 = 1;
            if ((i6 & 1) != 1) {
                i10 = 0;
            }
            gVar.f3725w = this.f3730w;
            if ((i6 & 2) == 2) {
                i10 |= 2;
            }
            gVar.f3726x = this.f3731x;
            if ((i6 & 4) == 4) {
                i10 |= 4;
            }
            gVar.f3727y = this.f3732y;
            if ((i6 & 8) == 8) {
                i10 |= 8;
            }
            gVar.f3728z = this.f3733z;
            if ((i6 & 16) == 16) {
                i10 |= 16;
            }
            gVar.A = this.A;
            if ((i6 & 32) == 32) {
                this.B = Collections.unmodifiableList(this.B);
                this.f3729v &= -33;
            }
            gVar.B = this.B;
            if ((this.f3729v & 64) == 64) {
                this.C = Collections.unmodifiableList(this.C);
                this.f3729v &= -65;
            }
            gVar.C = this.C;
            gVar.f3724v = i10;
            return gVar;
        }

        public final void l(g gVar) {
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13;
            p pVar;
            if (gVar == g.F) {
                return;
            }
            int i6 = gVar.f3724v;
            boolean z14 = false;
            if ((i6 & 1) == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                int i10 = gVar.f3725w;
                this.f3729v |= 1;
                this.f3730w = i10;
            }
            if ((i6 & 2) == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                int i11 = gVar.f3726x;
                this.f3729v = 2 | this.f3729v;
                this.f3731x = i11;
            }
            if ((i6 & 4) == 4) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                c cVar = gVar.f3727y;
                cVar.getClass();
                this.f3729v = 4 | this.f3729v;
                this.f3732y = cVar;
            }
            if ((gVar.f3724v & 8) == 8) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z13) {
                p pVar2 = gVar.f3728z;
                if ((this.f3729v & 8) == 8 && (pVar = this.f3733z) != p.N) {
                    p.c s10 = p.s(pVar);
                    s10.m(pVar2);
                    this.f3733z = s10.l();
                } else {
                    this.f3733z = pVar2;
                }
                this.f3729v |= 8;
            }
            if ((gVar.f3724v & 16) == 16) {
                z14 = true;
            }
            if (z14) {
                int i12 = gVar.A;
                this.f3729v = 16 | this.f3729v;
                this.A = i12;
            }
            if (!gVar.B.isEmpty()) {
                if (this.B.isEmpty()) {
                    this.B = gVar.B;
                    this.f3729v &= -33;
                } else {
                    if ((this.f3729v & 32) != 32) {
                        this.B = new ArrayList(this.B);
                        this.f3729v |= 32;
                    }
                    this.B.addAll(gVar.B);
                }
            }
            if (!gVar.C.isEmpty()) {
                if (this.C.isEmpty()) {
                    this.C = gVar.C;
                    this.f3729v &= -65;
                } else {
                    if ((this.f3729v & 64) != 64) {
                        this.C = new ArrayList(this.C);
                        this.f3729v |= 64;
                    }
                    this.C.addAll(gVar.C);
                }
            }
            this.f16856u = this.f16856u.g(gVar.f3723u);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void m(gu.d dVar, gu.e eVar) {
            g gVar;
            try {
                try {
                    g.G.getClass();
                    l(new g(dVar, eVar));
                } catch (Throwable th2) {
                    th = th2;
                    gVar = null;
                    if (gVar != null) {
                        l(gVar);
                    }
                    throw th;
                }
            } catch (InvalidProtocolBufferException e10) {
                gVar = (g) e10.f23476u;
                try {
                    throw e10;
                } catch (Throwable th3) {
                    th = th3;
                    if (gVar != null) {
                    }
                    throw th;
                }
            }
        }
    }

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes2.dex */
    public enum c implements h.a {
        TRUE(0),
        FALSE(1),
        NULL(2);
        

        /* renamed from: u  reason: collision with root package name */
        public final int f3738u;

        c(int i6) {
            this.f3738u = i6;
        }

        @Override // gu.h.a
        public final int e() {
            return this.f3738u;
        }
    }

    static {
        g gVar = new g();
        F = gVar;
        gVar.f3725w = 0;
        gVar.f3726x = 0;
        gVar.f3727y = c.TRUE;
        gVar.f3728z = p.N;
        gVar.A = 0;
        gVar.B = Collections.emptyList();
        gVar.C = Collections.emptyList();
    }

    public g(g.a aVar) {
        super(0);
        this.D = (byte) -1;
        this.E = -1;
        this.f3723u = aVar.f16856u;
    }

    @Override // gu.n
    public final n.a a() {
        b bVar = new b();
        bVar.l(this);
        return bVar;
    }

    @Override // gu.n
    public final int b() {
        int i6;
        int i10 = this.E;
        if (i10 != -1) {
            return i10;
        }
        if ((this.f3724v & 1) == 1) {
            i6 = CodedOutputStream.b(1, this.f3725w) + 0;
        } else {
            i6 = 0;
        }
        if ((this.f3724v & 2) == 2) {
            i6 += CodedOutputStream.b(2, this.f3726x);
        }
        if ((this.f3724v & 4) == 4) {
            i6 += CodedOutputStream.a(3, this.f3727y.f3738u);
        }
        if ((this.f3724v & 8) == 8) {
            i6 += CodedOutputStream.d(4, this.f3728z);
        }
        if ((this.f3724v & 16) == 16) {
            i6 += CodedOutputStream.b(5, this.A);
        }
        for (int i11 = 0; i11 < this.B.size(); i11++) {
            i6 += CodedOutputStream.d(6, this.B.get(i11));
        }
        for (int i12 = 0; i12 < this.C.size(); i12++) {
            i6 += CodedOutputStream.d(7, this.C.get(i12));
        }
        int size = this.f3723u.size() + i6;
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
        byte b10 = this.D;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if ((this.f3724v & 8) == 8) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && !this.f3728z.d()) {
            this.D = (byte) 0;
            return false;
        }
        for (int i6 = 0; i6 < this.B.size(); i6++) {
            if (!this.B.get(i6).d()) {
                this.D = (byte) 0;
                return false;
            }
        }
        for (int i10 = 0; i10 < this.C.size(); i10++) {
            if (!this.C.get(i10).d()) {
                this.D = (byte) 0;
                return false;
            }
        }
        this.D = (byte) 1;
        return true;
    }

    @Override // gu.n
    public final void f(CodedOutputStream codedOutputStream) {
        b();
        if ((this.f3724v & 1) == 1) {
            codedOutputStream.m(1, this.f3725w);
        }
        if ((this.f3724v & 2) == 2) {
            codedOutputStream.m(2, this.f3726x);
        }
        if ((this.f3724v & 4) == 4) {
            codedOutputStream.l(3, this.f3727y.f3738u);
        }
        if ((this.f3724v & 8) == 8) {
            codedOutputStream.o(4, this.f3728z);
        }
        if ((this.f3724v & 16) == 16) {
            codedOutputStream.m(5, this.A);
        }
        for (int i6 = 0; i6 < this.B.size(); i6++) {
            codedOutputStream.o(6, this.B.get(i6));
        }
        for (int i10 = 0; i10 < this.C.size(); i10++) {
            codedOutputStream.o(7, this.C.get(i10));
        }
        codedOutputStream.r(this.f3723u);
    }

    public g() {
        this.D = (byte) -1;
        this.E = -1;
        this.f3723u = gu.c.f16833u;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(gu.d dVar, gu.e eVar) {
        c cVar;
        this.D = (byte) -1;
        this.E = -1;
        boolean z10 = false;
        this.f3725w = 0;
        this.f3726x = 0;
        c cVar2 = c.TRUE;
        this.f3727y = cVar2;
        this.f3728z = p.N;
        this.A = 0;
        this.B = Collections.emptyList();
        this.C = Collections.emptyList();
        CodedOutputStream j10 = CodedOutputStream.j(new c.b(), 1);
        boolean z11 = false;
        while (!z10) {
            try {
                try {
                    try {
                        int n10 = dVar.n();
                        if (n10 != 0) {
                            if (n10 == 8) {
                                this.f3724v |= 1;
                                this.f3725w = dVar.k();
                            } else if (n10 != 16) {
                                p.c cVar3 = null;
                                c cVar4 = null;
                                if (n10 == 24) {
                                    int k10 = dVar.k();
                                    if (k10 != 0) {
                                        if (k10 == 1) {
                                            cVar4 = c.FALSE;
                                        } else if (k10 == 2) {
                                            cVar4 = c.NULL;
                                        }
                                        cVar = cVar4;
                                    } else {
                                        cVar = cVar2;
                                    }
                                    if (cVar == null) {
                                        j10.v(n10);
                                        j10.v(k10);
                                    } else {
                                        this.f3724v |= 4;
                                        this.f3727y = cVar;
                                    }
                                } else if (n10 == 34) {
                                    if ((this.f3724v & 8) == 8) {
                                        p pVar = this.f3728z;
                                        pVar.getClass();
                                        cVar3 = p.s(pVar);
                                    }
                                    p.c cVar5 = cVar3;
                                    p pVar2 = (p) dVar.g(p.O, eVar);
                                    this.f3728z = pVar2;
                                    if (cVar5 != null) {
                                        cVar5.m(pVar2);
                                        this.f3728z = cVar5.l();
                                    }
                                    this.f3724v |= 8;
                                } else if (n10 != 40) {
                                    a aVar = G;
                                    if (n10 == 50) {
                                        if (!(z11 & true)) {
                                            this.B = new ArrayList();
                                            z11 |= true;
                                        }
                                        this.B.add(dVar.g(aVar, eVar));
                                    } else if (n10 != 58) {
                                        if (!dVar.q(n10, j10)) {
                                        }
                                    } else {
                                        if (!(z11 & true)) {
                                            this.C = new ArrayList();
                                            z11 |= true;
                                        }
                                        this.C.add(dVar.g(aVar, eVar));
                                    }
                                } else {
                                    this.f3724v |= 16;
                                    this.A = dVar.k();
                                }
                            } else {
                                this.f3724v |= 2;
                                this.f3726x = dVar.k();
                            }
                        }
                        z10 = true;
                    } catch (InvalidProtocolBufferException e10) {
                        e10.f23476u = this;
                        throw e10;
                    }
                } catch (IOException e11) {
                    InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e11.getMessage());
                    invalidProtocolBufferException.f23476u = this;
                    throw invalidProtocolBufferException;
                }
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
                    throw th2;
                } finally {
                }
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
        } finally {
        }
    }
}
