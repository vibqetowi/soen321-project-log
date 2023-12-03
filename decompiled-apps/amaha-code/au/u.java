package au;

import gu.a;
import gu.c;
import gu.g;
import gu.h;
import gu.n;
import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;
/* compiled from: ProtoBuf.java */
/* loaded from: classes2.dex */
public final class u extends gu.g implements gu.o {
    public static final u E;
    public static final a F = new a();
    public int A;
    public d B;
    public byte C;
    public int D;

    /* renamed from: u  reason: collision with root package name */
    public final gu.c f3868u;

    /* renamed from: v  reason: collision with root package name */
    public int f3869v;

    /* renamed from: w  reason: collision with root package name */
    public int f3870w;

    /* renamed from: x  reason: collision with root package name */
    public int f3871x;

    /* renamed from: y  reason: collision with root package name */
    public c f3872y;

    /* renamed from: z  reason: collision with root package name */
    public int f3873z;

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes2.dex */
    public static class a extends gu.b<u> {
        @Override // gu.p
        public final Object a(gu.d dVar, gu.e eVar) {
            return new u(dVar);
        }
    }

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes2.dex */
    public static final class b extends g.a<u, b> implements gu.o {
        public int A;

        /* renamed from: v  reason: collision with root package name */
        public int f3874v;

        /* renamed from: w  reason: collision with root package name */
        public int f3875w;

        /* renamed from: x  reason: collision with root package name */
        public int f3876x;

        /* renamed from: z  reason: collision with root package name */
        public int f3878z;

        /* renamed from: y  reason: collision with root package name */
        public c f3877y = c.ERROR;
        public d B = d.LANGUAGE_VERSION;

        @Override // gu.a.AbstractC0262a, gu.n.a
        public final /* bridge */ /* synthetic */ n.a R(gu.d dVar, gu.e eVar) {
            m(dVar, eVar);
            return this;
        }

        @Override // gu.n.a
        public final gu.n build() {
            u k10 = k();
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
        public final /* bridge */ /* synthetic */ b j(u uVar) {
            l(uVar);
            return this;
        }

        public final u k() {
            u uVar = new u(this);
            int i6 = this.f3874v;
            int i10 = 1;
            if ((i6 & 1) != 1) {
                i10 = 0;
            }
            uVar.f3870w = this.f3875w;
            if ((i6 & 2) == 2) {
                i10 |= 2;
            }
            uVar.f3871x = this.f3876x;
            if ((i6 & 4) == 4) {
                i10 |= 4;
            }
            uVar.f3872y = this.f3877y;
            if ((i6 & 8) == 8) {
                i10 |= 8;
            }
            uVar.f3873z = this.f3878z;
            if ((i6 & 16) == 16) {
                i10 |= 16;
            }
            uVar.A = this.A;
            if ((i6 & 32) == 32) {
                i10 |= 32;
            }
            uVar.B = this.B;
            uVar.f3869v = i10;
            return uVar;
        }

        public final void l(u uVar) {
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13;
            boolean z14;
            if (uVar == u.E) {
                return;
            }
            int i6 = uVar.f3869v;
            boolean z15 = false;
            if ((i6 & 1) == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                int i10 = uVar.f3870w;
                this.f3874v |= 1;
                this.f3875w = i10;
            }
            if ((i6 & 2) == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                int i11 = uVar.f3871x;
                this.f3874v = 2 | this.f3874v;
                this.f3876x = i11;
            }
            if ((i6 & 4) == 4) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                c cVar = uVar.f3872y;
                cVar.getClass();
                this.f3874v = 4 | this.f3874v;
                this.f3877y = cVar;
            }
            int i12 = uVar.f3869v;
            if ((i12 & 8) == 8) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z13) {
                int i13 = uVar.f3873z;
                this.f3874v = 8 | this.f3874v;
                this.f3878z = i13;
            }
            if ((i12 & 16) == 16) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (z14) {
                int i14 = uVar.A;
                this.f3874v = 16 | this.f3874v;
                this.A = i14;
            }
            if ((i12 & 32) == 32) {
                z15 = true;
            }
            if (z15) {
                d dVar = uVar.B;
                dVar.getClass();
                this.f3874v = 32 | this.f3874v;
                this.B = dVar;
            }
            this.f16856u = this.f16856u.g(uVar.f3868u);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void m(gu.d dVar, gu.e eVar) {
            u uVar;
            try {
                try {
                    u.F.getClass();
                    l(new u(dVar));
                } catch (Throwable th2) {
                    th = th2;
                    uVar = null;
                    if (uVar != null) {
                        l(uVar);
                    }
                    throw th;
                }
            } catch (InvalidProtocolBufferException e10) {
                uVar = (u) e10.f23476u;
                try {
                    throw e10;
                } catch (Throwable th3) {
                    th = th3;
                    if (uVar != null) {
                    }
                    throw th;
                }
            }
        }
    }

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes2.dex */
    public enum c implements h.a {
        WARNING(0),
        ERROR(1),
        HIDDEN(2);
        

        /* renamed from: u  reason: collision with root package name */
        public final int f3883u;

        c(int i6) {
            this.f3883u = i6;
        }

        @Override // gu.h.a
        public final int e() {
            return this.f3883u;
        }
    }

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes2.dex */
    public enum d implements h.a {
        LANGUAGE_VERSION(0),
        COMPILER_VERSION(1),
        API_VERSION(2);
        

        /* renamed from: u  reason: collision with root package name */
        public final int f3888u;

        d(int i6) {
            this.f3888u = i6;
        }

        @Override // gu.h.a
        public final int e() {
            return this.f3888u;
        }
    }

    static {
        u uVar = new u();
        E = uVar;
        uVar.f3870w = 0;
        uVar.f3871x = 0;
        uVar.f3872y = c.ERROR;
        uVar.f3873z = 0;
        uVar.A = 0;
        uVar.B = d.LANGUAGE_VERSION;
    }

    public u(g.a aVar) {
        super(0);
        this.C = (byte) -1;
        this.D = -1;
        this.f3868u = aVar.f16856u;
    }

    @Override // gu.n
    public final n.a a() {
        b bVar = new b();
        bVar.l(this);
        return bVar;
    }

    @Override // gu.n
    public final int b() {
        int i6 = this.D;
        if (i6 != -1) {
            return i6;
        }
        int i10 = 0;
        if ((this.f3869v & 1) == 1) {
            i10 = 0 + CodedOutputStream.b(1, this.f3870w);
        }
        if ((this.f3869v & 2) == 2) {
            i10 += CodedOutputStream.b(2, this.f3871x);
        }
        if ((this.f3869v & 4) == 4) {
            i10 += CodedOutputStream.a(3, this.f3872y.f3883u);
        }
        if ((this.f3869v & 8) == 8) {
            i10 += CodedOutputStream.b(4, this.f3873z);
        }
        if ((this.f3869v & 16) == 16) {
            i10 += CodedOutputStream.b(5, this.A);
        }
        if ((this.f3869v & 32) == 32) {
            i10 += CodedOutputStream.a(6, this.B.f3888u);
        }
        int size = this.f3868u.size() + i10;
        this.D = size;
        return size;
    }

    @Override // gu.n
    public final n.a c() {
        return new b();
    }

    @Override // gu.o
    public final boolean d() {
        byte b10 = this.C;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        this.C = (byte) 1;
        return true;
    }

    @Override // gu.n
    public final void f(CodedOutputStream codedOutputStream) {
        b();
        if ((this.f3869v & 1) == 1) {
            codedOutputStream.m(1, this.f3870w);
        }
        if ((this.f3869v & 2) == 2) {
            codedOutputStream.m(2, this.f3871x);
        }
        if ((this.f3869v & 4) == 4) {
            codedOutputStream.l(3, this.f3872y.f3883u);
        }
        if ((this.f3869v & 8) == 8) {
            codedOutputStream.m(4, this.f3873z);
        }
        if ((this.f3869v & 16) == 16) {
            codedOutputStream.m(5, this.A);
        }
        if ((this.f3869v & 32) == 32) {
            codedOutputStream.l(6, this.B.f3888u);
        }
        codedOutputStream.r(this.f3868u);
    }

    public u() {
        this.C = (byte) -1;
        this.D = -1;
        this.f3868u = gu.c.f16833u;
    }

    public u(gu.d dVar) {
        this.C = (byte) -1;
        this.D = -1;
        boolean z10 = false;
        this.f3870w = 0;
        this.f3871x = 0;
        c cVar = c.ERROR;
        this.f3872y = cVar;
        this.f3873z = 0;
        this.A = 0;
        d dVar2 = d.LANGUAGE_VERSION;
        this.B = dVar2;
        c.b bVar = new c.b();
        CodedOutputStream j10 = CodedOutputStream.j(bVar, 1);
        while (!z10) {
            try {
                try {
                    int n10 = dVar.n();
                    if (n10 != 0) {
                        if (n10 == 8) {
                            this.f3869v |= 1;
                            this.f3870w = dVar.k();
                        } else if (n10 != 16) {
                            d dVar3 = null;
                            c cVar2 = null;
                            if (n10 == 24) {
                                int k10 = dVar.k();
                                if (k10 == 0) {
                                    cVar2 = c.WARNING;
                                } else if (k10 == 1) {
                                    cVar2 = cVar;
                                } else if (k10 == 2) {
                                    cVar2 = c.HIDDEN;
                                }
                                if (cVar2 == null) {
                                    j10.v(n10);
                                    j10.v(k10);
                                } else {
                                    this.f3869v |= 4;
                                    this.f3872y = cVar2;
                                }
                            } else if (n10 == 32) {
                                this.f3869v |= 8;
                                this.f3873z = dVar.k();
                            } else if (n10 == 40) {
                                this.f3869v |= 16;
                                this.A = dVar.k();
                            } else if (n10 != 48) {
                                if (!dVar.q(n10, j10)) {
                                }
                            } else {
                                int k11 = dVar.k();
                                if (k11 == 0) {
                                    dVar3 = dVar2;
                                } else if (k11 == 1) {
                                    dVar3 = d.COMPILER_VERSION;
                                } else if (k11 == 2) {
                                    dVar3 = d.API_VERSION;
                                }
                                if (dVar3 == null) {
                                    j10.v(n10);
                                    j10.v(k11);
                                } else {
                                    this.f3869v |= 32;
                                    this.B = dVar3;
                                }
                            }
                        } else {
                            this.f3869v |= 2;
                            this.f3871x = dVar.k();
                        }
                    }
                    z10 = true;
                } catch (Throwable th2) {
                    try {
                        j10.i();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f3868u = bVar.g();
                        throw th3;
                    }
                    this.f3868u = bVar.g();
                    throw th2;
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
        try {
            j10.i();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f3868u = bVar.g();
            throw th4;
        }
        this.f3868u = bVar.g();
    }
}
