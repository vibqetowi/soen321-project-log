package au;

import androidx.recyclerview.widget.k;
import au.k;
import au.n;
import au.o;
import gu.a;
import gu.c;
import gu.g;
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
public final class l extends g.c<l> {
    public static final l D;
    public static final a E = new a();
    public List<au.b> A;
    public byte B;
    public int C;

    /* renamed from: v  reason: collision with root package name */
    public final gu.c f3759v;

    /* renamed from: w  reason: collision with root package name */
    public int f3760w;

    /* renamed from: x  reason: collision with root package name */
    public o f3761x;

    /* renamed from: y  reason: collision with root package name */
    public n f3762y;

    /* renamed from: z  reason: collision with root package name */
    public k f3763z;

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes2.dex */
    public static class a extends gu.b<l> {
        @Override // gu.p
        public final Object a(gu.d dVar, gu.e eVar) {
            return new l(dVar, eVar);
        }
    }

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes2.dex */
    public static final class b extends g.b<l, b> {

        /* renamed from: x  reason: collision with root package name */
        public int f3764x;

        /* renamed from: y  reason: collision with root package name */
        public o f3765y = o.f3798y;

        /* renamed from: z  reason: collision with root package name */
        public n f3766z = n.f3775y;
        public k A = k.E;
        public List<au.b> B = Collections.emptyList();

        @Override // gu.a.AbstractC0262a, gu.n.a
        public final /* bridge */ /* synthetic */ n.a R(gu.d dVar, gu.e eVar) {
            n(dVar, eVar);
            return this;
        }

        @Override // gu.n.a
        public final gu.n build() {
            l l2 = l();
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
            m((l) gVar);
            return this;
        }

        public final l l() {
            l lVar = new l(this);
            int i6 = this.f3764x;
            int i10 = 1;
            if ((i6 & 1) != 1) {
                i10 = 0;
            }
            lVar.f3761x = this.f3765y;
            if ((i6 & 2) == 2) {
                i10 |= 2;
            }
            lVar.f3762y = this.f3766z;
            if ((i6 & 4) == 4) {
                i10 |= 4;
            }
            lVar.f3763z = this.A;
            if ((i6 & 8) == 8) {
                this.B = Collections.unmodifiableList(this.B);
                this.f3764x &= -9;
            }
            lVar.A = this.B;
            lVar.f3760w = i10;
            return lVar;
        }

        public final void m(l lVar) {
            boolean z10;
            boolean z11;
            k kVar;
            n nVar;
            o oVar;
            if (lVar == l.D) {
                return;
            }
            boolean z12 = true;
            if ((lVar.f3760w & 1) == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                o oVar2 = lVar.f3761x;
                if ((this.f3764x & 1) == 1 && (oVar = this.f3765y) != o.f3798y) {
                    o.b bVar = new o.b();
                    bVar.l(oVar);
                    bVar.l(oVar2);
                    this.f3765y = bVar.k();
                } else {
                    this.f3765y = oVar2;
                }
                this.f3764x |= 1;
            }
            if ((lVar.f3760w & 2) == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                n nVar2 = lVar.f3762y;
                if ((this.f3764x & 2) == 2 && (nVar = this.f3766z) != n.f3775y) {
                    n.b bVar2 = new n.b();
                    bVar2.l(nVar);
                    bVar2.l(nVar2);
                    this.f3766z = bVar2.k();
                } else {
                    this.f3766z = nVar2;
                }
                this.f3764x |= 2;
            }
            if ((lVar.f3760w & 4) != 4) {
                z12 = false;
            }
            if (z12) {
                k kVar2 = lVar.f3763z;
                if ((this.f3764x & 4) == 4 && (kVar = this.A) != k.E) {
                    k.b bVar3 = new k.b();
                    bVar3.m(kVar);
                    bVar3.m(kVar2);
                    this.A = bVar3.l();
                } else {
                    this.A = kVar2;
                }
                this.f3764x |= 4;
            }
            if (!lVar.A.isEmpty()) {
                if (this.B.isEmpty()) {
                    this.B = lVar.A;
                    this.f3764x &= -9;
                } else {
                    if ((this.f3764x & 8) != 8) {
                        this.B = new ArrayList(this.B);
                        this.f3764x |= 8;
                    }
                    this.B.addAll(lVar.A);
                }
            }
            k(lVar);
            this.f16856u = this.f16856u.g(lVar.f3759v);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void n(gu.d dVar, gu.e eVar) {
            l lVar;
            try {
                try {
                    l.E.getClass();
                    m(new l(dVar, eVar));
                } catch (Throwable th2) {
                    th = th2;
                    lVar = null;
                    if (lVar != null) {
                        m(lVar);
                    }
                    throw th;
                }
            } catch (InvalidProtocolBufferException e10) {
                lVar = (l) e10.f23476u;
                try {
                    throw e10;
                } catch (Throwable th3) {
                    th = th3;
                    if (lVar != null) {
                    }
                    throw th;
                }
            }
        }
    }

    static {
        l lVar = new l(0);
        D = lVar;
        lVar.f3761x = o.f3798y;
        lVar.f3762y = n.f3775y;
        lVar.f3763z = k.E;
        lVar.A = Collections.emptyList();
    }

    public l() {
        throw null;
    }

    public l(g.b bVar) {
        super(bVar);
        this.B = (byte) -1;
        this.C = -1;
        this.f3759v = bVar.f16856u;
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
        int i10 = this.C;
        if (i10 != -1) {
            return i10;
        }
        if ((this.f3760w & 1) == 1) {
            i6 = CodedOutputStream.d(1, this.f3761x) + 0;
        } else {
            i6 = 0;
        }
        if ((this.f3760w & 2) == 2) {
            i6 += CodedOutputStream.d(2, this.f3762y);
        }
        if ((this.f3760w & 4) == 4) {
            i6 += CodedOutputStream.d(3, this.f3763z);
        }
        for (int i11 = 0; i11 < this.A.size(); i11++) {
            i6 += CodedOutputStream.d(4, this.A.get(i11));
        }
        int size = this.f3759v.size() + j() + i6;
        this.C = size;
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
        byte b10 = this.B;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if ((this.f3760w & 2) == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && !this.f3762y.d()) {
            this.B = (byte) 0;
            return false;
        }
        if ((this.f3760w & 4) == 4) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 && !this.f3763z.d()) {
            this.B = (byte) 0;
            return false;
        }
        for (int i6 = 0; i6 < this.A.size(); i6++) {
            if (!this.A.get(i6).d()) {
                this.B = (byte) 0;
                return false;
            }
        }
        if (!i()) {
            this.B = (byte) 0;
            return false;
        }
        this.B = (byte) 1;
        return true;
    }

    @Override // gu.o
    public final gu.n e() {
        return D;
    }

    @Override // gu.n
    public final void f(CodedOutputStream codedOutputStream) {
        b();
        g.c.a aVar = new g.c.a(this);
        if ((this.f3760w & 1) == 1) {
            codedOutputStream.o(1, this.f3761x);
        }
        if ((this.f3760w & 2) == 2) {
            codedOutputStream.o(2, this.f3762y);
        }
        if ((this.f3760w & 4) == 4) {
            codedOutputStream.o(3, this.f3763z);
        }
        for (int i6 = 0; i6 < this.A.size(); i6++) {
            codedOutputStream.o(4, this.A.get(i6));
        }
        aVar.a(k.d.DEFAULT_DRAG_ANIMATION_DURATION, codedOutputStream);
        codedOutputStream.r(this.f3759v);
    }

    public l(int i6) {
        this.B = (byte) -1;
        this.C = -1;
        this.f3759v = gu.c.f16833u;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l(gu.d dVar, gu.e eVar) {
        this.B = (byte) -1;
        this.C = -1;
        this.f3761x = o.f3798y;
        this.f3762y = n.f3775y;
        this.f3763z = k.E;
        this.A = Collections.emptyList();
        c.b bVar = new c.b();
        CodedOutputStream j10 = CodedOutputStream.j(bVar, 1);
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            try {
                try {
                    try {
                        int n10 = dVar.n();
                        if (n10 != 0) {
                            k.b bVar2 = null;
                            o.b bVar3 = null;
                            n.b bVar4 = null;
                            if (n10 == 10) {
                                if ((this.f3760w & 1) == 1) {
                                    o oVar = this.f3761x;
                                    oVar.getClass();
                                    bVar3 = new o.b();
                                    bVar3.l(oVar);
                                }
                                o oVar2 = (o) dVar.g(o.f3799z, eVar);
                                this.f3761x = oVar2;
                                if (bVar3 != null) {
                                    bVar3.l(oVar2);
                                    this.f3761x = bVar3.k();
                                }
                                this.f3760w |= 1;
                            } else if (n10 == 18) {
                                if ((this.f3760w & 2) == 2) {
                                    n nVar = this.f3762y;
                                    nVar.getClass();
                                    bVar4 = new n.b();
                                    bVar4.l(nVar);
                                }
                                n nVar2 = (n) dVar.g(n.f3776z, eVar);
                                this.f3762y = nVar2;
                                if (bVar4 != null) {
                                    bVar4.l(nVar2);
                                    this.f3762y = bVar4.k();
                                }
                                this.f3760w |= 2;
                            } else if (n10 == 26) {
                                if ((this.f3760w & 4) == 4) {
                                    k kVar = this.f3763z;
                                    kVar.getClass();
                                    bVar2 = new k.b();
                                    bVar2.m(kVar);
                                }
                                k kVar2 = (k) dVar.g(k.F, eVar);
                                this.f3763z = kVar2;
                                if (bVar2 != null) {
                                    bVar2.m(kVar2);
                                    this.f3763z = bVar2.l();
                                }
                                this.f3760w |= 4;
                            } else if (n10 != 34) {
                                if (!o(dVar, j10, eVar, n10)) {
                                }
                            } else {
                                if (!(z11 & true)) {
                                    this.A = new ArrayList();
                                    z11 |= true;
                                }
                                this.A.add(dVar.g(au.b.e0, eVar));
                            }
                        }
                        z10 = true;
                    } catch (IOException e10) {
                        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e10.getMessage());
                        invalidProtocolBufferException.f23476u = this;
                        throw invalidProtocolBufferException;
                    }
                } catch (InvalidProtocolBufferException e11) {
                    e11.f23476u = this;
                    throw e11;
                }
            } catch (Throwable th2) {
                if (z11 & true) {
                    this.A = Collections.unmodifiableList(this.A);
                }
                try {
                    j10.i();
                } catch (IOException unused) {
                    this.f3759v = bVar.g();
                    m();
                    throw th2;
                } catch (Throwable th3) {
                    this.f3759v = bVar.g();
                    throw th3;
                }
            }
        }
        if (z11 & true) {
            this.A = Collections.unmodifiableList(this.A);
        }
        try {
            j10.i();
        } catch (IOException unused2) {
            this.f3759v = bVar.g();
            m();
        } catch (Throwable th4) {
            this.f3759v = bVar.g();
            throw th4;
        }
    }
}
