package au;

import androidx.recyclerview.widget.k;
import au.s;
import au.v;
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
public final class k extends g.c<k> {
    public static final k E;
    public static final a F = new a();
    public s A;
    public v B;
    public byte C;
    public int D;

    /* renamed from: v  reason: collision with root package name */
    public final gu.c f3751v;

    /* renamed from: w  reason: collision with root package name */
    public int f3752w;

    /* renamed from: x  reason: collision with root package name */
    public List<h> f3753x;

    /* renamed from: y  reason: collision with root package name */
    public List<m> f3754y;

    /* renamed from: z  reason: collision with root package name */
    public List<q> f3755z;

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes2.dex */
    public static class a extends gu.b<k> {
        @Override // gu.p
        public final Object a(gu.d dVar, gu.e eVar) {
            return new k(dVar, eVar);
        }
    }

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes2.dex */
    public static final class b extends g.b<k, b> {

        /* renamed from: x  reason: collision with root package name */
        public int f3756x;

        /* renamed from: y  reason: collision with root package name */
        public List<h> f3757y = Collections.emptyList();

        /* renamed from: z  reason: collision with root package name */
        public List<m> f3758z = Collections.emptyList();
        public List<q> A = Collections.emptyList();
        public s B = s.A;
        public v C = v.f3889y;

        @Override // gu.a.AbstractC0262a, gu.n.a
        public final /* bridge */ /* synthetic */ n.a R(gu.d dVar, gu.e eVar) {
            n(dVar, eVar);
            return this;
        }

        @Override // gu.n.a
        public final gu.n build() {
            k l2 = l();
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
            m((k) gVar);
            return this;
        }

        public final k l() {
            k kVar = new k(this);
            int i6 = this.f3756x;
            int i10 = 1;
            if ((i6 & 1) == 1) {
                this.f3757y = Collections.unmodifiableList(this.f3757y);
                this.f3756x &= -2;
            }
            kVar.f3753x = this.f3757y;
            if ((this.f3756x & 2) == 2) {
                this.f3758z = Collections.unmodifiableList(this.f3758z);
                this.f3756x &= -3;
            }
            kVar.f3754y = this.f3758z;
            if ((this.f3756x & 4) == 4) {
                this.A = Collections.unmodifiableList(this.A);
                this.f3756x &= -5;
            }
            kVar.f3755z = this.A;
            if ((i6 & 8) != 8) {
                i10 = 0;
            }
            kVar.A = this.B;
            if ((i6 & 16) == 16) {
                i10 |= 2;
            }
            kVar.B = this.C;
            kVar.f3752w = i10;
            return kVar;
        }

        public final void m(k kVar) {
            boolean z10;
            v vVar;
            s sVar;
            if (kVar == k.E) {
                return;
            }
            boolean z11 = true;
            if (!kVar.f3753x.isEmpty()) {
                if (this.f3757y.isEmpty()) {
                    this.f3757y = kVar.f3753x;
                    this.f3756x &= -2;
                } else {
                    if ((this.f3756x & 1) != 1) {
                        this.f3757y = new ArrayList(this.f3757y);
                        this.f3756x |= 1;
                    }
                    this.f3757y.addAll(kVar.f3753x);
                }
            }
            if (!kVar.f3754y.isEmpty()) {
                if (this.f3758z.isEmpty()) {
                    this.f3758z = kVar.f3754y;
                    this.f3756x &= -3;
                } else {
                    if ((this.f3756x & 2) != 2) {
                        this.f3758z = new ArrayList(this.f3758z);
                        this.f3756x |= 2;
                    }
                    this.f3758z.addAll(kVar.f3754y);
                }
            }
            if (!kVar.f3755z.isEmpty()) {
                if (this.A.isEmpty()) {
                    this.A = kVar.f3755z;
                    this.f3756x &= -5;
                } else {
                    if ((this.f3756x & 4) != 4) {
                        this.A = new ArrayList(this.A);
                        this.f3756x |= 4;
                    }
                    this.A.addAll(kVar.f3755z);
                }
            }
            if ((kVar.f3752w & 1) == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                s sVar2 = kVar.A;
                if ((this.f3756x & 8) == 8 && (sVar = this.B) != s.A) {
                    s.b i6 = s.i(sVar);
                    i6.l(sVar2);
                    this.B = i6.k();
                } else {
                    this.B = sVar2;
                }
                this.f3756x |= 8;
            }
            if ((kVar.f3752w & 2) != 2) {
                z11 = false;
            }
            if (z11) {
                v vVar2 = kVar.B;
                if ((this.f3756x & 16) == 16 && (vVar = this.C) != v.f3889y) {
                    v.b bVar = new v.b();
                    bVar.l(vVar);
                    bVar.l(vVar2);
                    this.C = bVar.k();
                } else {
                    this.C = vVar2;
                }
                this.f3756x |= 16;
            }
            k(kVar);
            this.f16856u = this.f16856u.g(kVar.f3751v);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void n(gu.d dVar, gu.e eVar) {
            k kVar;
            try {
                try {
                    k.F.getClass();
                    m(new k(dVar, eVar));
                } catch (Throwable th2) {
                    th = th2;
                    kVar = null;
                    if (kVar != null) {
                        m(kVar);
                    }
                    throw th;
                }
            } catch (InvalidProtocolBufferException e10) {
                kVar = (k) e10.f23476u;
                try {
                    throw e10;
                } catch (Throwable th3) {
                    th = th3;
                    if (kVar != null) {
                    }
                    throw th;
                }
            }
        }
    }

    static {
        k kVar = new k(0);
        E = kVar;
        kVar.f3753x = Collections.emptyList();
        kVar.f3754y = Collections.emptyList();
        kVar.f3755z = Collections.emptyList();
        kVar.A = s.A;
        kVar.B = v.f3889y;
    }

    public k() {
        throw null;
    }

    public k(g.b bVar) {
        super(bVar);
        this.C = (byte) -1;
        this.D = -1;
        this.f3751v = bVar.f16856u;
    }

    @Override // gu.n
    public final n.a a() {
        b bVar = new b();
        bVar.m(this);
        return bVar;
    }

    @Override // gu.n
    public final int b() {
        int i6 = this.D;
        if (i6 != -1) {
            return i6;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.f3753x.size(); i11++) {
            i10 += CodedOutputStream.d(3, this.f3753x.get(i11));
        }
        for (int i12 = 0; i12 < this.f3754y.size(); i12++) {
            i10 += CodedOutputStream.d(4, this.f3754y.get(i12));
        }
        for (int i13 = 0; i13 < this.f3755z.size(); i13++) {
            i10 += CodedOutputStream.d(5, this.f3755z.get(i13));
        }
        if ((this.f3752w & 1) == 1) {
            i10 += CodedOutputStream.d(30, this.A);
        }
        if ((this.f3752w & 2) == 2) {
            i10 += CodedOutputStream.d(32, this.B);
        }
        int size = this.f3751v.size() + j() + i10;
        this.D = size;
        return size;
    }

    @Override // gu.n
    public final n.a c() {
        return new b();
    }

    @Override // gu.o
    public final boolean d() {
        boolean z10;
        byte b10 = this.C;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i6 = 0; i6 < this.f3753x.size(); i6++) {
            if (!this.f3753x.get(i6).d()) {
                this.C = (byte) 0;
                return false;
            }
        }
        for (int i10 = 0; i10 < this.f3754y.size(); i10++) {
            if (!this.f3754y.get(i10).d()) {
                this.C = (byte) 0;
                return false;
            }
        }
        for (int i11 = 0; i11 < this.f3755z.size(); i11++) {
            if (!this.f3755z.get(i11).d()) {
                this.C = (byte) 0;
                return false;
            }
        }
        if ((this.f3752w & 1) == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && !this.A.d()) {
            this.C = (byte) 0;
            return false;
        } else if (!i()) {
            this.C = (byte) 0;
            return false;
        } else {
            this.C = (byte) 1;
            return true;
        }
    }

    @Override // gu.o
    public final gu.n e() {
        return E;
    }

    @Override // gu.n
    public final void f(CodedOutputStream codedOutputStream) {
        b();
        g.c.a aVar = new g.c.a(this);
        for (int i6 = 0; i6 < this.f3753x.size(); i6++) {
            codedOutputStream.o(3, this.f3753x.get(i6));
        }
        for (int i10 = 0; i10 < this.f3754y.size(); i10++) {
            codedOutputStream.o(4, this.f3754y.get(i10));
        }
        for (int i11 = 0; i11 < this.f3755z.size(); i11++) {
            codedOutputStream.o(5, this.f3755z.get(i11));
        }
        if ((this.f3752w & 1) == 1) {
            codedOutputStream.o(30, this.A);
        }
        if ((this.f3752w & 2) == 2) {
            codedOutputStream.o(32, this.B);
        }
        aVar.a(k.d.DEFAULT_DRAG_ANIMATION_DURATION, codedOutputStream);
        codedOutputStream.r(this.f3751v);
    }

    public k(int i6) {
        this.C = (byte) -1;
        this.D = -1;
        this.f3751v = gu.c.f16833u;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k(gu.d dVar, gu.e eVar) {
        this.C = (byte) -1;
        this.D = -1;
        this.f3753x = Collections.emptyList();
        this.f3754y = Collections.emptyList();
        this.f3755z = Collections.emptyList();
        this.A = s.A;
        this.B = v.f3889y;
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
                            if (n10 == 26) {
                                if (!(z11 & true)) {
                                    this.f3753x = new ArrayList();
                                    z11 |= true;
                                }
                                this.f3753x.add(dVar.g(h.P, eVar));
                            } else if (n10 == 34) {
                                if (!(z11 & true)) {
                                    this.f3754y = new ArrayList();
                                    z11 |= true;
                                }
                                this.f3754y.add(dVar.g(m.P, eVar));
                            } else if (n10 != 42) {
                                v.b bVar2 = null;
                                s.b bVar3 = null;
                                if (n10 == 242) {
                                    if ((this.f3752w & 1) == 1) {
                                        s sVar = this.A;
                                        sVar.getClass();
                                        bVar3 = s.i(sVar);
                                    }
                                    s sVar2 = (s) dVar.g(s.B, eVar);
                                    this.A = sVar2;
                                    if (bVar3 != null) {
                                        bVar3.l(sVar2);
                                        this.A = bVar3.k();
                                    }
                                    this.f3752w |= 1;
                                } else if (n10 != 258) {
                                    if (!o(dVar, j10, eVar, n10)) {
                                    }
                                } else {
                                    if ((this.f3752w & 2) == 2) {
                                        v vVar = this.B;
                                        vVar.getClass();
                                        bVar2 = new v.b();
                                        bVar2.l(vVar);
                                    }
                                    v vVar2 = (v) dVar.g(v.f3890z, eVar);
                                    this.B = vVar2;
                                    if (bVar2 != null) {
                                        bVar2.l(vVar2);
                                        this.B = bVar2.k();
                                    }
                                    this.f3752w |= 2;
                                }
                            } else {
                                if (!(z11 & true)) {
                                    this.f3755z = new ArrayList();
                                    z11 |= true;
                                }
                                this.f3755z.add(dVar.g(q.J, eVar));
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
                    this.f3753x = Collections.unmodifiableList(this.f3753x);
                }
                if (z11 & true) {
                    this.f3754y = Collections.unmodifiableList(this.f3754y);
                }
                if (z11 & true) {
                    this.f3755z = Collections.unmodifiableList(this.f3755z);
                }
                try {
                    j10.i();
                } catch (IOException unused) {
                    this.f3751v = bVar.g();
                    m();
                    throw th2;
                } catch (Throwable th3) {
                    this.f3751v = bVar.g();
                    throw th3;
                }
            }
        }
        if (z11 & true) {
            this.f3753x = Collections.unmodifiableList(this.f3753x);
        }
        if (z11 & true) {
            this.f3754y = Collections.unmodifiableList(this.f3754y);
        }
        if (z11 & true) {
            this.f3755z = Collections.unmodifiableList(this.f3755z);
        }
        try {
            j10.i();
        } catch (IOException unused2) {
            this.f3751v = bVar.g();
            m();
        } catch (Throwable th4) {
            this.f3751v = bVar.g();
            throw th4;
        }
    }
}
