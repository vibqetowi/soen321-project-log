package au;

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
public final class o extends gu.g implements gu.o {

    /* renamed from: y  reason: collision with root package name */
    public static final o f3798y;

    /* renamed from: z  reason: collision with root package name */
    public static final a f3799z = new a();

    /* renamed from: u  reason: collision with root package name */
    public final gu.c f3800u;

    /* renamed from: v  reason: collision with root package name */
    public gu.l f3801v;

    /* renamed from: w  reason: collision with root package name */
    public byte f3802w;

    /* renamed from: x  reason: collision with root package name */
    public int f3803x;

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes2.dex */
    public static class a extends gu.b<o> {
        @Override // gu.p
        public final Object a(gu.d dVar, gu.e eVar) {
            return new o(dVar);
        }
    }

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes2.dex */
    public static final class b extends g.a<o, b> implements gu.o {

        /* renamed from: v  reason: collision with root package name */
        public int f3804v;

        /* renamed from: w  reason: collision with root package name */
        public gu.l f3805w = gu.k.f16877v;

        @Override // gu.a.AbstractC0262a, gu.n.a
        public final /* bridge */ /* synthetic */ n.a R(gu.d dVar, gu.e eVar) {
            m(dVar, eVar);
            return this;
        }

        @Override // gu.n.a
        public final gu.n build() {
            o k10 = k();
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
        public final /* bridge */ /* synthetic */ b j(o oVar) {
            l(oVar);
            return this;
        }

        public final o k() {
            o oVar = new o(this);
            if ((this.f3804v & 1) == 1) {
                this.f3805w = this.f3805w.p();
                this.f3804v &= -2;
            }
            oVar.f3801v = this.f3805w;
            return oVar;
        }

        public final void l(o oVar) {
            if (oVar == o.f3798y) {
                return;
            }
            if (!oVar.f3801v.isEmpty()) {
                if (this.f3805w.isEmpty()) {
                    this.f3805w = oVar.f3801v;
                    this.f3804v &= -2;
                } else {
                    if ((this.f3804v & 1) != 1) {
                        this.f3805w = new gu.k(this.f3805w);
                        this.f3804v |= 1;
                    }
                    this.f3805w.addAll(oVar.f3801v);
                }
            }
            this.f16856u = this.f16856u.g(oVar.f3800u);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void m(gu.d dVar, gu.e eVar) {
            o oVar;
            try {
                try {
                    o.f3799z.getClass();
                    l(new o(dVar));
                } catch (Throwable th2) {
                    th = th2;
                    oVar = null;
                    if (oVar != null) {
                        l(oVar);
                    }
                    throw th;
                }
            } catch (InvalidProtocolBufferException e10) {
                oVar = (o) e10.f23476u;
                try {
                    throw e10;
                } catch (Throwable th3) {
                    th = th3;
                    if (oVar != null) {
                    }
                    throw th;
                }
            }
        }
    }

    static {
        o oVar = new o();
        f3798y = oVar;
        oVar.f3801v = gu.k.f16877v;
    }

    public o(g.a aVar) {
        super(0);
        this.f3802w = (byte) -1;
        this.f3803x = -1;
        this.f3800u = aVar.f16856u;
    }

    @Override // gu.n
    public final n.a a() {
        b bVar = new b();
        bVar.l(this);
        return bVar;
    }

    @Override // gu.n
    public final int b() {
        int i6 = this.f3803x;
        if (i6 != -1) {
            return i6;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.f3801v.size(); i11++) {
            gu.c V = this.f3801v.V(i11);
            i10 += V.size() + CodedOutputStream.f(V.size());
        }
        int size = this.f3800u.size() + (this.f3801v.size() * 1) + 0 + i10;
        this.f3803x = size;
        return size;
    }

    @Override // gu.n
    public final n.a c() {
        return new b();
    }

    @Override // gu.o
    public final boolean d() {
        byte b10 = this.f3802w;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        this.f3802w = (byte) 1;
        return true;
    }

    @Override // gu.n
    public final void f(CodedOutputStream codedOutputStream) {
        b();
        for (int i6 = 0; i6 < this.f3801v.size(); i6++) {
            gu.c V = this.f3801v.V(i6);
            codedOutputStream.x(1, 2);
            codedOutputStream.v(V.size());
            codedOutputStream.r(V);
        }
        codedOutputStream.r(this.f3800u);
    }

    public o() {
        this.f3802w = (byte) -1;
        this.f3803x = -1;
        this.f3800u = gu.c.f16833u;
    }

    public o(gu.d dVar) {
        this.f3802w = (byte) -1;
        this.f3803x = -1;
        this.f3801v = gu.k.f16877v;
        CodedOutputStream j10 = CodedOutputStream.j(new c.b(), 1);
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            try {
                try {
                    try {
                        int n10 = dVar.n();
                        if (n10 != 0) {
                            if (n10 != 10) {
                                if (!dVar.q(n10, j10)) {
                                }
                            } else {
                                gu.m e10 = dVar.e();
                                if (!(z11 & true)) {
                                    this.f3801v = new gu.k();
                                    z11 |= true;
                                }
                                this.f3801v.E(e10);
                            }
                        }
                        z10 = true;
                    } catch (InvalidProtocolBufferException e11) {
                        e11.f23476u = this;
                        throw e11;
                    }
                } catch (IOException e12) {
                    InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e12.getMessage());
                    invalidProtocolBufferException.f23476u = this;
                    throw invalidProtocolBufferException;
                }
            } catch (Throwable th2) {
                if (z11 & true) {
                    this.f3801v = this.f3801v.p();
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
            this.f3801v = this.f3801v.p();
        }
        try {
            j10.i();
        } catch (IOException unused2) {
        } finally {
        }
    }
}
