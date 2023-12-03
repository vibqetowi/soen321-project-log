package au;

import au.g;
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
public final class e extends gu.g implements gu.o {
    public static final e C;
    public static final a D = new a();
    public byte A;
    public int B;

    /* renamed from: u  reason: collision with root package name */
    public final gu.c f3695u;

    /* renamed from: v  reason: collision with root package name */
    public int f3696v;

    /* renamed from: w  reason: collision with root package name */
    public c f3697w;

    /* renamed from: x  reason: collision with root package name */
    public List<g> f3698x;

    /* renamed from: y  reason: collision with root package name */
    public g f3699y;

    /* renamed from: z  reason: collision with root package name */
    public d f3700z;

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes2.dex */
    public static class a extends gu.b<e> {
        @Override // gu.p
        public final Object a(gu.d dVar, gu.e eVar) {
            return new e(dVar, eVar);
        }
    }

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes2.dex */
    public static final class b extends g.a<e, b> implements gu.o {

        /* renamed from: v  reason: collision with root package name */
        public int f3701v;

        /* renamed from: w  reason: collision with root package name */
        public c f3702w = c.RETURNS_CONSTANT;

        /* renamed from: x  reason: collision with root package name */
        public List<g> f3703x = Collections.emptyList();

        /* renamed from: y  reason: collision with root package name */
        public g f3704y = g.F;

        /* renamed from: z  reason: collision with root package name */
        public d f3705z = d.AT_MOST_ONCE;

        @Override // gu.a.AbstractC0262a, gu.n.a
        public final /* bridge */ /* synthetic */ n.a R(gu.d dVar, gu.e eVar) {
            m(dVar, eVar);
            return this;
        }

        @Override // gu.n.a
        public final gu.n build() {
            e k10 = k();
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
        public final /* bridge */ /* synthetic */ b j(e eVar) {
            l(eVar);
            return this;
        }

        public final e k() {
            e eVar = new e(this);
            int i6 = this.f3701v;
            int i10 = 1;
            if ((i6 & 1) != 1) {
                i10 = 0;
            }
            eVar.f3697w = this.f3702w;
            if ((i6 & 2) == 2) {
                this.f3703x = Collections.unmodifiableList(this.f3703x);
                this.f3701v &= -3;
            }
            eVar.f3698x = this.f3703x;
            if ((i6 & 4) == 4) {
                i10 |= 2;
            }
            eVar.f3699y = this.f3704y;
            if ((i6 & 8) == 8) {
                i10 |= 4;
            }
            eVar.f3700z = this.f3705z;
            eVar.f3696v = i10;
            return eVar;
        }

        public final void l(e eVar) {
            boolean z10;
            boolean z11;
            g gVar;
            if (eVar == e.C) {
                return;
            }
            boolean z12 = true;
            if ((eVar.f3696v & 1) == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                c cVar = eVar.f3697w;
                cVar.getClass();
                this.f3701v |= 1;
                this.f3702w = cVar;
            }
            if (!eVar.f3698x.isEmpty()) {
                if (this.f3703x.isEmpty()) {
                    this.f3703x = eVar.f3698x;
                    this.f3701v &= -3;
                } else {
                    if ((this.f3701v & 2) != 2) {
                        this.f3703x = new ArrayList(this.f3703x);
                        this.f3701v |= 2;
                    }
                    this.f3703x.addAll(eVar.f3698x);
                }
            }
            if ((eVar.f3696v & 2) == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                g gVar2 = eVar.f3699y;
                if ((this.f3701v & 4) == 4 && (gVar = this.f3704y) != g.F) {
                    g.b bVar = new g.b();
                    bVar.l(gVar);
                    bVar.l(gVar2);
                    this.f3704y = bVar.k();
                } else {
                    this.f3704y = gVar2;
                }
                this.f3701v |= 4;
            }
            if ((eVar.f3696v & 4) != 4) {
                z12 = false;
            }
            if (z12) {
                d dVar = eVar.f3700z;
                dVar.getClass();
                this.f3701v |= 8;
                this.f3705z = dVar;
            }
            this.f16856u = this.f16856u.g(eVar.f3695u);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void m(gu.d dVar, gu.e eVar) {
            e eVar2;
            try {
                try {
                    e.D.getClass();
                    l(new e(dVar, eVar));
                } catch (Throwable th2) {
                    th = th2;
                    eVar2 = null;
                    if (eVar2 != null) {
                        l(eVar2);
                    }
                    throw th;
                }
            } catch (InvalidProtocolBufferException e10) {
                eVar2 = (e) e10.f23476u;
                try {
                    throw e10;
                } catch (Throwable th3) {
                    th = th3;
                    if (eVar2 != null) {
                    }
                    throw th;
                }
            }
        }
    }

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes2.dex */
    public enum c implements h.a {
        RETURNS_CONSTANT(0),
        CALLS(1),
        RETURNS_NOT_NULL(2);
        

        /* renamed from: u  reason: collision with root package name */
        public final int f3710u;

        c(int i6) {
            this.f3710u = i6;
        }

        @Override // gu.h.a
        public final int e() {
            return this.f3710u;
        }
    }

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes2.dex */
    public enum d implements h.a {
        AT_MOST_ONCE(0),
        EXACTLY_ONCE(1),
        AT_LEAST_ONCE(2);
        

        /* renamed from: u  reason: collision with root package name */
        public final int f3715u;

        d(int i6) {
            this.f3715u = i6;
        }

        @Override // gu.h.a
        public final int e() {
            return this.f3715u;
        }
    }

    static {
        e eVar = new e();
        C = eVar;
        eVar.f3697w = c.RETURNS_CONSTANT;
        eVar.f3698x = Collections.emptyList();
        eVar.f3699y = g.F;
        eVar.f3700z = d.AT_MOST_ONCE;
    }

    public e(g.a aVar) {
        super(0);
        this.A = (byte) -1;
        this.B = -1;
        this.f3695u = aVar.f16856u;
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
        int i10 = this.B;
        if (i10 != -1) {
            return i10;
        }
        if ((this.f3696v & 1) == 1) {
            i6 = CodedOutputStream.a(1, this.f3697w.f3710u) + 0;
        } else {
            i6 = 0;
        }
        for (int i11 = 0; i11 < this.f3698x.size(); i11++) {
            i6 += CodedOutputStream.d(2, this.f3698x.get(i11));
        }
        if ((this.f3696v & 2) == 2) {
            i6 += CodedOutputStream.d(3, this.f3699y);
        }
        if ((this.f3696v & 4) == 4) {
            i6 += CodedOutputStream.a(4, this.f3700z.f3715u);
        }
        int size = this.f3695u.size() + i6;
        this.B = size;
        return size;
    }

    @Override // gu.n
    public final n.a c() {
        return new b();
    }

    @Override // gu.o
    public final boolean d() {
        boolean z10;
        byte b10 = this.A;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i6 = 0; i6 < this.f3698x.size(); i6++) {
            if (!this.f3698x.get(i6).d()) {
                this.A = (byte) 0;
                return false;
            }
        }
        if ((this.f3696v & 2) == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && !this.f3699y.d()) {
            this.A = (byte) 0;
            return false;
        }
        this.A = (byte) 1;
        return true;
    }

    @Override // gu.n
    public final void f(CodedOutputStream codedOutputStream) {
        b();
        if ((this.f3696v & 1) == 1) {
            codedOutputStream.l(1, this.f3697w.f3710u);
        }
        for (int i6 = 0; i6 < this.f3698x.size(); i6++) {
            codedOutputStream.o(2, this.f3698x.get(i6));
        }
        if ((this.f3696v & 2) == 2) {
            codedOutputStream.o(3, this.f3699y);
        }
        if ((this.f3696v & 4) == 4) {
            codedOutputStream.l(4, this.f3700z.f3715u);
        }
        codedOutputStream.r(this.f3695u);
    }

    public e() {
        this.A = (byte) -1;
        this.B = -1;
        this.f3695u = gu.c.f16833u;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(gu.d dVar, gu.e eVar) {
        this.A = (byte) -1;
        this.B = -1;
        c cVar = c.RETURNS_CONSTANT;
        this.f3697w = cVar;
        this.f3698x = Collections.emptyList();
        this.f3699y = g.F;
        d dVar2 = d.AT_MOST_ONCE;
        this.f3700z = dVar2;
        CodedOutputStream j10 = CodedOutputStream.j(new c.b(), 1);
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            try {
                try {
                    int n10 = dVar.n();
                    if (n10 != 0) {
                        d dVar3 = null;
                        c cVar2 = null;
                        g.b bVar = null;
                        if (n10 == 8) {
                            int k10 = dVar.k();
                            if (k10 == 0) {
                                cVar2 = cVar;
                            } else if (k10 == 1) {
                                cVar2 = c.CALLS;
                            } else if (k10 == 2) {
                                cVar2 = c.RETURNS_NOT_NULL;
                            }
                            if (cVar2 == null) {
                                j10.v(n10);
                                j10.v(k10);
                            } else {
                                this.f3696v |= 1;
                                this.f3697w = cVar2;
                            }
                        } else if (n10 == 18) {
                            if (!(z11 & true)) {
                                this.f3698x = new ArrayList();
                                z11 |= true;
                            }
                            this.f3698x.add(dVar.g(g.G, eVar));
                        } else if (n10 == 26) {
                            if ((this.f3696v & 2) == 2) {
                                g gVar = this.f3699y;
                                gVar.getClass();
                                bVar = new g.b();
                                bVar.l(gVar);
                            }
                            g gVar2 = (g) dVar.g(g.G, eVar);
                            this.f3699y = gVar2;
                            if (bVar != null) {
                                bVar.l(gVar2);
                                this.f3699y = bVar.k();
                            }
                            this.f3696v |= 2;
                        } else if (n10 != 32) {
                            if (!dVar.q(n10, j10)) {
                            }
                        } else {
                            int k11 = dVar.k();
                            if (k11 == 0) {
                                dVar3 = dVar2;
                            } else if (k11 == 1) {
                                dVar3 = d.EXACTLY_ONCE;
                            } else if (k11 == 2) {
                                dVar3 = d.AT_LEAST_ONCE;
                            }
                            if (dVar3 == null) {
                                j10.v(n10);
                                j10.v(k11);
                            } else {
                                this.f3696v |= 4;
                                this.f3700z = dVar3;
                            }
                        }
                    }
                    z10 = true;
                } catch (Throwable th2) {
                    if (z11 & true) {
                        this.f3698x = Collections.unmodifiableList(this.f3698x);
                    }
                    try {
                        j10.i();
                    } catch (IOException unused) {
                        throw th2;
                    } finally {
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
            this.f3698x = Collections.unmodifiableList(this.f3698x);
        }
        try {
            j10.i();
        } catch (IOException unused2) {
        } finally {
        }
    }
}
