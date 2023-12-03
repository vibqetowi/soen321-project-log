package au;

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
public final class c extends g.c<c> {
    public static final c C;
    public static final a D = new a();
    public byte A;
    public int B;

    /* renamed from: v  reason: collision with root package name */
    public final gu.c f3679v;

    /* renamed from: w  reason: collision with root package name */
    public int f3680w;

    /* renamed from: x  reason: collision with root package name */
    public int f3681x;

    /* renamed from: y  reason: collision with root package name */
    public List<t> f3682y;

    /* renamed from: z  reason: collision with root package name */
    public List<Integer> f3683z;

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes2.dex */
    public static class a extends gu.b<c> {
        @Override // gu.p
        public final Object a(gu.d dVar, gu.e eVar) {
            return new c(dVar, eVar);
        }
    }

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes2.dex */
    public static final class b extends g.b<c, b> {

        /* renamed from: x  reason: collision with root package name */
        public int f3684x;

        /* renamed from: y  reason: collision with root package name */
        public int f3685y = 6;

        /* renamed from: z  reason: collision with root package name */
        public List<t> f3686z = Collections.emptyList();
        public List<Integer> A = Collections.emptyList();

        @Override // gu.a.AbstractC0262a, gu.n.a
        public final /* bridge */ /* synthetic */ n.a R(gu.d dVar, gu.e eVar) {
            n(dVar, eVar);
            return this;
        }

        @Override // gu.n.a
        public final gu.n build() {
            c l2 = l();
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
            m((c) gVar);
            return this;
        }

        public final c l() {
            c cVar = new c(this);
            int i6 = this.f3684x;
            int i10 = 1;
            if ((i6 & 1) != 1) {
                i10 = 0;
            }
            cVar.f3681x = this.f3685y;
            if ((i6 & 2) == 2) {
                this.f3686z = Collections.unmodifiableList(this.f3686z);
                this.f3684x &= -3;
            }
            cVar.f3682y = this.f3686z;
            if ((this.f3684x & 4) == 4) {
                this.A = Collections.unmodifiableList(this.A);
                this.f3684x &= -5;
            }
            cVar.f3683z = this.A;
            cVar.f3680w = i10;
            return cVar;
        }

        public final void m(c cVar) {
            boolean z10;
            if (cVar == c.C) {
                return;
            }
            if ((cVar.f3680w & 1) == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                int i6 = cVar.f3681x;
                this.f3684x = 1 | this.f3684x;
                this.f3685y = i6;
            }
            if (!cVar.f3682y.isEmpty()) {
                if (this.f3686z.isEmpty()) {
                    this.f3686z = cVar.f3682y;
                    this.f3684x &= -3;
                } else {
                    if ((this.f3684x & 2) != 2) {
                        this.f3686z = new ArrayList(this.f3686z);
                        this.f3684x |= 2;
                    }
                    this.f3686z.addAll(cVar.f3682y);
                }
            }
            if (!cVar.f3683z.isEmpty()) {
                if (this.A.isEmpty()) {
                    this.A = cVar.f3683z;
                    this.f3684x &= -5;
                } else {
                    if ((this.f3684x & 4) != 4) {
                        this.A = new ArrayList(this.A);
                        this.f3684x |= 4;
                    }
                    this.A.addAll(cVar.f3683z);
                }
            }
            k(cVar);
            this.f16856u = this.f16856u.g(cVar.f3679v);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0019  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void n(gu.d dVar, gu.e eVar) {
            c cVar;
            try {
                try {
                    m((c) c.D.a(dVar, eVar));
                } catch (InvalidProtocolBufferException e10) {
                    cVar = (c) e10.f23476u;
                    try {
                        throw e10;
                    } catch (Throwable th2) {
                        th = th2;
                        if (cVar != null) {
                            m(cVar);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                cVar = null;
                if (cVar != null) {
                }
                throw th;
            }
        }
    }

    static {
        c cVar = new c(0);
        C = cVar;
        cVar.f3681x = 6;
        cVar.f3682y = Collections.emptyList();
        cVar.f3683z = Collections.emptyList();
    }

    public c() {
        throw null;
    }

    public c(g.b bVar) {
        super(bVar);
        this.A = (byte) -1;
        this.B = -1;
        this.f3679v = bVar.f16856u;
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
        int i10 = this.B;
        if (i10 != -1) {
            return i10;
        }
        if ((this.f3680w & 1) == 1) {
            i6 = CodedOutputStream.b(1, this.f3681x) + 0;
        } else {
            i6 = 0;
        }
        for (int i11 = 0; i11 < this.f3682y.size(); i11++) {
            i6 += CodedOutputStream.d(2, this.f3682y.get(i11));
        }
        int i12 = 0;
        for (int i13 = 0; i13 < this.f3683z.size(); i13++) {
            i12 += CodedOutputStream.c(this.f3683z.get(i13).intValue());
        }
        int size = this.f3679v.size() + j() + (this.f3683z.size() * 2) + i6 + i12;
        this.B = size;
        return size;
    }

    @Override // gu.n
    public final n.a c() {
        return new b();
    }

    @Override // gu.o
    public final boolean d() {
        byte b10 = this.A;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i6 = 0; i6 < this.f3682y.size(); i6++) {
            if (!this.f3682y.get(i6).d()) {
                this.A = (byte) 0;
                return false;
            }
        }
        if (!i()) {
            this.A = (byte) 0;
            return false;
        }
        this.A = (byte) 1;
        return true;
    }

    @Override // gu.o
    public final gu.n e() {
        return C;
    }

    @Override // gu.n
    public final void f(CodedOutputStream codedOutputStream) {
        b();
        g.c.a aVar = new g.c.a(this);
        if ((this.f3680w & 1) == 1) {
            codedOutputStream.m(1, this.f3681x);
        }
        for (int i6 = 0; i6 < this.f3682y.size(); i6++) {
            codedOutputStream.o(2, this.f3682y.get(i6));
        }
        for (int i10 = 0; i10 < this.f3683z.size(); i10++) {
            codedOutputStream.m(31, this.f3683z.get(i10).intValue());
        }
        aVar.a(19000, codedOutputStream);
        codedOutputStream.r(this.f3679v);
    }

    public c(int i6) {
        this.A = (byte) -1;
        this.B = -1;
        this.f3679v = gu.c.f16833u;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(gu.d dVar, gu.e eVar) {
        this.A = (byte) -1;
        this.B = -1;
        this.f3681x = 6;
        this.f3682y = Collections.emptyList();
        this.f3683z = Collections.emptyList();
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
                            this.f3680w |= 1;
                            this.f3681x = dVar.k();
                        } else if (n10 == 18) {
                            if (!(z11 & true)) {
                                this.f3682y = new ArrayList();
                                z11 |= true;
                            }
                            this.f3682y.add(dVar.g(t.G, eVar));
                        } else if (n10 == 248) {
                            if (!(z11 & true)) {
                                this.f3683z = new ArrayList();
                                z11 |= true;
                            }
                            this.f3683z.add(Integer.valueOf(dVar.k()));
                        } else if (n10 != 250) {
                            if (!o(dVar, j10, eVar, n10)) {
                            }
                        } else {
                            int d10 = dVar.d(dVar.k());
                            if (!(z11 & true) && dVar.b() > 0) {
                                this.f3683z = new ArrayList();
                                z11 |= true;
                            }
                            while (dVar.b() > 0) {
                                this.f3683z.add(Integer.valueOf(dVar.k()));
                            }
                            dVar.c(d10);
                        }
                    }
                    z10 = true;
                } catch (Throwable th2) {
                    if (z11 & true) {
                        this.f3682y = Collections.unmodifiableList(this.f3682y);
                    }
                    if (z11 & true) {
                        this.f3683z = Collections.unmodifiableList(this.f3683z);
                    }
                    try {
                        j10.i();
                    } catch (IOException unused) {
                        this.f3679v = bVar.g();
                        m();
                        throw th2;
                    } catch (Throwable th3) {
                        this.f3679v = bVar.g();
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
            this.f3682y = Collections.unmodifiableList(this.f3682y);
        }
        if (z11 & true) {
            this.f3683z = Collections.unmodifiableList(this.f3683z);
        }
        try {
            j10.i();
        } catch (IOException unused2) {
            this.f3679v = bVar.g();
            m();
        } catch (Throwable th4) {
            this.f3679v = bVar.g();
            throw th4;
        }
    }
}
