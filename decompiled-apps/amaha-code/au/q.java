package au;

import androidx.recyclerview.widget.k;
import au.p;
import com.appsflyer.R;
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
public final class q extends g.c<q> {
    public static final q I;
    public static final a J = new a();
    public p A;
    public int B;
    public p C;
    public int D;
    public List<au.a> E;
    public List<Integer> F;
    public byte G;
    public int H;

    /* renamed from: v  reason: collision with root package name */
    public final gu.c f3830v;

    /* renamed from: w  reason: collision with root package name */
    public int f3831w;

    /* renamed from: x  reason: collision with root package name */
    public int f3832x;

    /* renamed from: y  reason: collision with root package name */
    public int f3833y;

    /* renamed from: z  reason: collision with root package name */
    public List<r> f3834z;

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes2.dex */
    public static class a extends gu.b<q> {
        @Override // gu.p
        public final Object a(gu.d dVar, gu.e eVar) {
            return new q(dVar, eVar);
        }
    }

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes2.dex */
    public static final class b extends g.b<q, b> {
        public p B;
        public int C;
        public p D;
        public int E;
        public List<au.a> F;
        public List<Integer> G;

        /* renamed from: x  reason: collision with root package name */
        public int f3835x;

        /* renamed from: z  reason: collision with root package name */
        public int f3837z;

        /* renamed from: y  reason: collision with root package name */
        public int f3836y = 6;
        public List<r> A = Collections.emptyList();

        public b() {
            p pVar = p.N;
            this.B = pVar;
            this.D = pVar;
            this.F = Collections.emptyList();
            this.G = Collections.emptyList();
        }

        @Override // gu.a.AbstractC0262a, gu.n.a
        public final /* bridge */ /* synthetic */ n.a R(gu.d dVar, gu.e eVar) {
            n(dVar, eVar);
            return this;
        }

        @Override // gu.n.a
        public final gu.n build() {
            q l2 = l();
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
            m((q) gVar);
            return this;
        }

        public final q l() {
            q qVar = new q(this);
            int i6 = this.f3835x;
            int i10 = 1;
            if ((i6 & 1) != 1) {
                i10 = 0;
            }
            qVar.f3832x = this.f3836y;
            if ((i6 & 2) == 2) {
                i10 |= 2;
            }
            qVar.f3833y = this.f3837z;
            if ((i6 & 4) == 4) {
                this.A = Collections.unmodifiableList(this.A);
                this.f3835x &= -5;
            }
            qVar.f3834z = this.A;
            if ((i6 & 8) == 8) {
                i10 |= 4;
            }
            qVar.A = this.B;
            if ((i6 & 16) == 16) {
                i10 |= 8;
            }
            qVar.B = this.C;
            if ((i6 & 32) == 32) {
                i10 |= 16;
            }
            qVar.C = this.D;
            if ((i6 & 64) == 64) {
                i10 |= 32;
            }
            qVar.D = this.E;
            if ((this.f3835x & 128) == 128) {
                this.F = Collections.unmodifiableList(this.F);
                this.f3835x &= -129;
            }
            qVar.E = this.F;
            if ((this.f3835x & 256) == 256) {
                this.G = Collections.unmodifiableList(this.G);
                this.f3835x &= -257;
            }
            qVar.F = this.G;
            qVar.f3831w = i10;
            return qVar;
        }

        public final void m(q qVar) {
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13;
            boolean z14;
            p pVar;
            p pVar2;
            if (qVar == q.I) {
                return;
            }
            int i6 = qVar.f3831w;
            boolean z15 = false;
            if ((i6 & 1) == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                int i10 = qVar.f3832x;
                this.f3835x |= 1;
                this.f3836y = i10;
            }
            if ((i6 & 2) == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                int i11 = qVar.f3833y;
                this.f3835x = 2 | this.f3835x;
                this.f3837z = i11;
            }
            if (!qVar.f3834z.isEmpty()) {
                if (this.A.isEmpty()) {
                    this.A = qVar.f3834z;
                    this.f3835x &= -5;
                } else {
                    if ((this.f3835x & 4) != 4) {
                        this.A = new ArrayList(this.A);
                        this.f3835x |= 4;
                    }
                    this.A.addAll(qVar.f3834z);
                }
            }
            if ((qVar.f3831w & 4) == 4) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                p pVar3 = qVar.A;
                if ((this.f3835x & 8) == 8 && (pVar2 = this.B) != p.N) {
                    p.c s10 = p.s(pVar2);
                    s10.m(pVar3);
                    this.B = s10.l();
                } else {
                    this.B = pVar3;
                }
                this.f3835x |= 8;
            }
            int i12 = qVar.f3831w;
            if ((i12 & 8) == 8) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z13) {
                int i13 = qVar.B;
                this.f3835x |= 16;
                this.C = i13;
            }
            if ((i12 & 16) == 16) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (z14) {
                p pVar4 = qVar.C;
                if ((this.f3835x & 32) == 32 && (pVar = this.D) != p.N) {
                    p.c s11 = p.s(pVar);
                    s11.m(pVar4);
                    this.D = s11.l();
                } else {
                    this.D = pVar4;
                }
                this.f3835x |= 32;
            }
            if ((qVar.f3831w & 32) == 32) {
                z15 = true;
            }
            if (z15) {
                int i14 = qVar.D;
                this.f3835x |= 64;
                this.E = i14;
            }
            if (!qVar.E.isEmpty()) {
                if (this.F.isEmpty()) {
                    this.F = qVar.E;
                    this.f3835x &= -129;
                } else {
                    if ((this.f3835x & 128) != 128) {
                        this.F = new ArrayList(this.F);
                        this.f3835x |= 128;
                    }
                    this.F.addAll(qVar.E);
                }
            }
            if (!qVar.F.isEmpty()) {
                if (this.G.isEmpty()) {
                    this.G = qVar.F;
                    this.f3835x &= -257;
                } else {
                    if ((this.f3835x & 256) != 256) {
                        this.G = new ArrayList(this.G);
                        this.f3835x |= 256;
                    }
                    this.G.addAll(qVar.F);
                }
            }
            k(qVar);
            this.f16856u = this.f16856u.g(qVar.f3830v);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void n(gu.d dVar, gu.e eVar) {
            q qVar;
            try {
                try {
                    q.J.getClass();
                    m(new q(dVar, eVar));
                } catch (Throwable th2) {
                    th = th2;
                    qVar = null;
                    if (qVar != null) {
                        m(qVar);
                    }
                    throw th;
                }
            } catch (InvalidProtocolBufferException e10) {
                qVar = (q) e10.f23476u;
                try {
                    throw e10;
                } catch (Throwable th3) {
                    th = th3;
                    if (qVar != null) {
                    }
                    throw th;
                }
            }
        }
    }

    static {
        q qVar = new q(0);
        I = qVar;
        qVar.q();
    }

    public q() {
        throw null;
    }

    public q(g.b bVar) {
        super(bVar);
        this.G = (byte) -1;
        this.H = -1;
        this.f3830v = bVar.f16856u;
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
        int i10 = this.H;
        if (i10 != -1) {
            return i10;
        }
        if ((this.f3831w & 1) == 1) {
            i6 = CodedOutputStream.b(1, this.f3832x) + 0;
        } else {
            i6 = 0;
        }
        if ((this.f3831w & 2) == 2) {
            i6 += CodedOutputStream.b(2, this.f3833y);
        }
        for (int i11 = 0; i11 < this.f3834z.size(); i11++) {
            i6 += CodedOutputStream.d(3, this.f3834z.get(i11));
        }
        if ((this.f3831w & 4) == 4) {
            i6 += CodedOutputStream.d(4, this.A);
        }
        if ((this.f3831w & 8) == 8) {
            i6 += CodedOutputStream.b(5, this.B);
        }
        if ((this.f3831w & 16) == 16) {
            i6 += CodedOutputStream.d(6, this.C);
        }
        if ((this.f3831w & 32) == 32) {
            i6 += CodedOutputStream.b(7, this.D);
        }
        for (int i12 = 0; i12 < this.E.size(); i12++) {
            i6 += CodedOutputStream.d(8, this.E.get(i12));
        }
        int i13 = 0;
        for (int i14 = 0; i14 < this.F.size(); i14++) {
            i13 += CodedOutputStream.c(this.F.get(i14).intValue());
        }
        int size = this.f3830v.size() + j() + (this.F.size() * 2) + i6 + i13;
        this.H = size;
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
        byte b10 = this.G;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if ((this.f3831w & 2) == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            this.G = (byte) 0;
            return false;
        }
        for (int i6 = 0; i6 < this.f3834z.size(); i6++) {
            if (!this.f3834z.get(i6).d()) {
                this.G = (byte) 0;
                return false;
            }
        }
        if ((this.f3831w & 4) == 4) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 && !this.A.d()) {
            this.G = (byte) 0;
            return false;
        }
        if ((this.f3831w & 16) == 16) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12 && !this.C.d()) {
            this.G = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < this.E.size(); i10++) {
            if (!this.E.get(i10).d()) {
                this.G = (byte) 0;
                return false;
            }
        }
        if (!i()) {
            this.G = (byte) 0;
            return false;
        }
        this.G = (byte) 1;
        return true;
    }

    @Override // gu.o
    public final gu.n e() {
        return I;
    }

    @Override // gu.n
    public final void f(CodedOutputStream codedOutputStream) {
        b();
        g.c.a aVar = new g.c.a(this);
        if ((this.f3831w & 1) == 1) {
            codedOutputStream.m(1, this.f3832x);
        }
        if ((this.f3831w & 2) == 2) {
            codedOutputStream.m(2, this.f3833y);
        }
        for (int i6 = 0; i6 < this.f3834z.size(); i6++) {
            codedOutputStream.o(3, this.f3834z.get(i6));
        }
        if ((this.f3831w & 4) == 4) {
            codedOutputStream.o(4, this.A);
        }
        if ((this.f3831w & 8) == 8) {
            codedOutputStream.m(5, this.B);
        }
        if ((this.f3831w & 16) == 16) {
            codedOutputStream.o(6, this.C);
        }
        if ((this.f3831w & 32) == 32) {
            codedOutputStream.m(7, this.D);
        }
        for (int i10 = 0; i10 < this.E.size(); i10++) {
            codedOutputStream.o(8, this.E.get(i10));
        }
        for (int i11 = 0; i11 < this.F.size(); i11++) {
            codedOutputStream.m(31, this.F.get(i11).intValue());
        }
        aVar.a(k.d.DEFAULT_DRAG_ANIMATION_DURATION, codedOutputStream);
        codedOutputStream.r(this.f3830v);
    }

    public final void q() {
        this.f3832x = 6;
        this.f3833y = 0;
        this.f3834z = Collections.emptyList();
        p pVar = p.N;
        this.A = pVar;
        this.B = 0;
        this.C = pVar;
        this.D = 0;
        this.E = Collections.emptyList();
        this.F = Collections.emptyList();
    }

    public q(int i6) {
        this.G = (byte) -1;
        this.H = -1;
        this.f3830v = gu.c.f16833u;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    public q(gu.d dVar, gu.e eVar) {
        this.G = (byte) -1;
        this.H = -1;
        q();
        c.b bVar = new c.b();
        CodedOutputStream j10 = CodedOutputStream.j(bVar, 1);
        boolean z10 = false;
        boolean z11 = false;
        while (true) {
            ?? r52 = 128;
            if (!z10) {
                try {
                    try {
                        try {
                            int n10 = dVar.n();
                            p.c cVar = null;
                            switch (n10) {
                                case 0:
                                    break;
                                case 8:
                                    this.f3831w |= 1;
                                    this.f3832x = dVar.k();
                                    continue;
                                case 16:
                                    this.f3831w |= 2;
                                    this.f3833y = dVar.k();
                                    continue;
                                case 26:
                                    if (!(z11 & true)) {
                                        this.f3834z = new ArrayList();
                                        z11 |= true;
                                    }
                                    this.f3834z.add(dVar.g(r.H, eVar));
                                    continue;
                                case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                                    if ((this.f3831w & 4) == 4) {
                                        p pVar = this.A;
                                        pVar.getClass();
                                        cVar = p.s(pVar);
                                    }
                                    p pVar2 = (p) dVar.g(p.O, eVar);
                                    this.A = pVar2;
                                    if (cVar != null) {
                                        cVar.m(pVar2);
                                        this.A = cVar.l();
                                    }
                                    this.f3831w |= 4;
                                    continue;
                                case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                                    this.f3831w |= 8;
                                    this.B = dVar.k();
                                    continue;
                                case 50:
                                    if ((this.f3831w & 16) == 16) {
                                        p pVar3 = this.C;
                                        pVar3.getClass();
                                        cVar = p.s(pVar3);
                                    }
                                    p pVar4 = (p) dVar.g(p.O, eVar);
                                    this.C = pVar4;
                                    if (cVar != null) {
                                        cVar.m(pVar4);
                                        this.C = cVar.l();
                                    }
                                    this.f3831w |= 16;
                                    continue;
                                case R.styleable.AppCompatTheme_colorError /* 56 */:
                                    this.f3831w |= 32;
                                    this.D = dVar.k();
                                    continue;
                                case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                                    if (!(z11 & true)) {
                                        this.E = new ArrayList();
                                        z11 |= true;
                                    }
                                    this.E.add(dVar.g(au.a.B, eVar));
                                    continue;
                                case 248:
                                    if (!(z11 & true)) {
                                        this.F = new ArrayList();
                                        z11 |= true;
                                    }
                                    this.F.add(Integer.valueOf(dVar.k()));
                                    continue;
                                case 250:
                                    int d10 = dVar.d(dVar.k());
                                    if (!(z11 & true) && dVar.b() > 0) {
                                        this.F = new ArrayList();
                                        z11 |= true;
                                    }
                                    while (dVar.b() > 0) {
                                        this.F.add(Integer.valueOf(dVar.k()));
                                    }
                                    dVar.c(d10);
                                    continue;
                                    break;
                                default:
                                    r52 = o(dVar, j10, eVar, n10);
                                    if (r52 == 0) {
                                        break;
                                    } else {
                                        continue;
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
                        this.f3834z = Collections.unmodifiableList(this.f3834z);
                    }
                    if ((z11 & true) == r52) {
                        this.E = Collections.unmodifiableList(this.E);
                    }
                    if (z11 & true) {
                        this.F = Collections.unmodifiableList(this.F);
                    }
                    try {
                        j10.i();
                    } catch (IOException unused) {
                        this.f3830v = bVar.g();
                        m();
                        throw th2;
                    } catch (Throwable th3) {
                        this.f3830v = bVar.g();
                        throw th3;
                    }
                }
            } else {
                if (z11 & true) {
                    this.f3834z = Collections.unmodifiableList(this.f3834z);
                }
                if (z11 & true) {
                    this.E = Collections.unmodifiableList(this.E);
                }
                if (z11 & true) {
                    this.F = Collections.unmodifiableList(this.F);
                }
                try {
                    j10.i();
                } catch (IOException unused2) {
                    this.f3830v = bVar.g();
                    m();
                    return;
                } catch (Throwable th4) {
                    this.f3830v = bVar.g();
                    throw th4;
                }
            }
        }
    }
}
