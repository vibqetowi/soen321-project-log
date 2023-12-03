package au;

import com.appsflyer.R;
import com.theinnerhour.b2b.utils.Constants;
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
public final class a extends gu.g implements gu.o {
    public static final a A;
    public static final C0061a B = new C0061a();

    /* renamed from: u  reason: collision with root package name */
    public final gu.c f3627u;

    /* renamed from: v  reason: collision with root package name */
    public int f3628v;

    /* renamed from: w  reason: collision with root package name */
    public int f3629w;

    /* renamed from: x  reason: collision with root package name */
    public List<b> f3630x;

    /* renamed from: y  reason: collision with root package name */
    public byte f3631y;

    /* renamed from: z  reason: collision with root package name */
    public int f3632z;

    /* compiled from: ProtoBuf.java */
    /* renamed from: au.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0061a extends gu.b<a> {
        @Override // gu.p
        public final Object a(gu.d dVar, gu.e eVar) {
            return new a(dVar, eVar);
        }
    }

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes2.dex */
    public static final class c extends g.a<a, c> implements gu.o {

        /* renamed from: v  reason: collision with root package name */
        public int f3659v;

        /* renamed from: w  reason: collision with root package name */
        public int f3660w;

        /* renamed from: x  reason: collision with root package name */
        public List<b> f3661x = Collections.emptyList();

        @Override // gu.a.AbstractC0262a, gu.n.a
        public final /* bridge */ /* synthetic */ n.a R(gu.d dVar, gu.e eVar) {
            m(dVar, eVar);
            return this;
        }

        @Override // gu.n.a
        public final gu.n build() {
            a k10 = k();
            if (k10.d()) {
                return k10;
            }
            throw new UninitializedMessageException();
        }

        @Override // gu.g.a
        public final Object clone() {
            c cVar = new c();
            cVar.l(k());
            return cVar;
        }

        @Override // gu.a.AbstractC0262a
        public final /* bridge */ /* synthetic */ a.AbstractC0262a h(gu.d dVar, gu.e eVar) {
            m(dVar, eVar);
            return this;
        }

        @Override // gu.g.a
        public final c i() {
            c cVar = new c();
            cVar.l(k());
            return cVar;
        }

        @Override // gu.g.a
        public final /* bridge */ /* synthetic */ c j(a aVar) {
            l(aVar);
            return this;
        }

        public final a k() {
            a aVar = new a(this);
            int i6 = this.f3659v;
            int i10 = 1;
            if ((i6 & 1) != 1) {
                i10 = 0;
            }
            aVar.f3629w = this.f3660w;
            if ((i6 & 2) == 2) {
                this.f3661x = Collections.unmodifiableList(this.f3661x);
                this.f3659v &= -3;
            }
            aVar.f3630x = this.f3661x;
            aVar.f3628v = i10;
            return aVar;
        }

        public final void l(a aVar) {
            boolean z10;
            if (aVar == a.A) {
                return;
            }
            if ((aVar.f3628v & 1) == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                int i6 = aVar.f3629w;
                this.f3659v = 1 | this.f3659v;
                this.f3660w = i6;
            }
            if (!aVar.f3630x.isEmpty()) {
                if (this.f3661x.isEmpty()) {
                    this.f3661x = aVar.f3630x;
                    this.f3659v &= -3;
                } else {
                    if ((this.f3659v & 2) != 2) {
                        this.f3661x = new ArrayList(this.f3661x);
                        this.f3659v |= 2;
                    }
                    this.f3661x.addAll(aVar.f3630x);
                }
            }
            this.f16856u = this.f16856u.g(aVar.f3627u);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0019  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void m(gu.d dVar, gu.e eVar) {
            a aVar;
            try {
                try {
                    l((a) a.B.a(dVar, eVar));
                } catch (InvalidProtocolBufferException e10) {
                    aVar = (a) e10.f23476u;
                    try {
                        throw e10;
                    } catch (Throwable th2) {
                        th = th2;
                        if (aVar != null) {
                            l(aVar);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                aVar = null;
                if (aVar != null) {
                }
                throw th;
            }
        }
    }

    static {
        a aVar = new a();
        A = aVar;
        aVar.f3629w = 0;
        aVar.f3630x = Collections.emptyList();
    }

    public a(g.a aVar) {
        super(0);
        this.f3631y = (byte) -1;
        this.f3632z = -1;
        this.f3627u = aVar.f16856u;
    }

    @Override // gu.n
    public final n.a a() {
        c cVar = new c();
        cVar.l(this);
        return cVar;
    }

    @Override // gu.n
    public final int b() {
        int i6;
        int i10 = this.f3632z;
        if (i10 != -1) {
            return i10;
        }
        if ((this.f3628v & 1) == 1) {
            i6 = CodedOutputStream.b(1, this.f3629w) + 0;
        } else {
            i6 = 0;
        }
        for (int i11 = 0; i11 < this.f3630x.size(); i11++) {
            i6 += CodedOutputStream.d(2, this.f3630x.get(i11));
        }
        int size = this.f3627u.size() + i6;
        this.f3632z = size;
        return size;
    }

    @Override // gu.n
    public final n.a c() {
        return new c();
    }

    @Override // gu.o
    public final boolean d() {
        boolean z10;
        byte b10 = this.f3631y;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if ((this.f3628v & 1) == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            this.f3631y = (byte) 0;
            return false;
        }
        for (int i6 = 0; i6 < this.f3630x.size(); i6++) {
            if (!this.f3630x.get(i6).d()) {
                this.f3631y = (byte) 0;
                return false;
            }
        }
        this.f3631y = (byte) 1;
        return true;
    }

    @Override // gu.n
    public final void f(CodedOutputStream codedOutputStream) {
        b();
        if ((this.f3628v & 1) == 1) {
            codedOutputStream.m(1, this.f3629w);
        }
        for (int i6 = 0; i6 < this.f3630x.size(); i6++) {
            codedOutputStream.o(2, this.f3630x.get(i6));
        }
        codedOutputStream.r(this.f3627u);
    }

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes2.dex */
    public static final class b extends gu.g implements gu.o {
        public static final b A;
        public static final C0062a B = new C0062a();

        /* renamed from: u  reason: collision with root package name */
        public final gu.c f3633u;

        /* renamed from: v  reason: collision with root package name */
        public int f3634v;

        /* renamed from: w  reason: collision with root package name */
        public int f3635w;

        /* renamed from: x  reason: collision with root package name */
        public c f3636x;

        /* renamed from: y  reason: collision with root package name */
        public byte f3637y;

        /* renamed from: z  reason: collision with root package name */
        public int f3638z;

        /* compiled from: ProtoBuf.java */
        /* renamed from: au.a$b$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static class C0062a extends gu.b<b> {
            @Override // gu.p
            public final Object a(gu.d dVar, gu.e eVar) {
                return new b(dVar, eVar);
            }
        }

        /* compiled from: ProtoBuf.java */
        /* renamed from: au.a$b$b  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0063b extends g.a<b, C0063b> implements gu.o {

            /* renamed from: v  reason: collision with root package name */
            public int f3639v;

            /* renamed from: w  reason: collision with root package name */
            public int f3640w;

            /* renamed from: x  reason: collision with root package name */
            public c f3641x = c.J;

            @Override // gu.a.AbstractC0262a, gu.n.a
            public final /* bridge */ /* synthetic */ n.a R(gu.d dVar, gu.e eVar) {
                m(dVar, eVar);
                return this;
            }

            @Override // gu.n.a
            public final gu.n build() {
                b k10 = k();
                if (k10.d()) {
                    return k10;
                }
                throw new UninitializedMessageException();
            }

            @Override // gu.g.a
            public final Object clone() {
                C0063b c0063b = new C0063b();
                c0063b.l(k());
                return c0063b;
            }

            @Override // gu.a.AbstractC0262a
            public final /* bridge */ /* synthetic */ a.AbstractC0262a h(gu.d dVar, gu.e eVar) {
                m(dVar, eVar);
                return this;
            }

            @Override // gu.g.a
            public final C0063b i() {
                C0063b c0063b = new C0063b();
                c0063b.l(k());
                return c0063b;
            }

            @Override // gu.g.a
            public final /* bridge */ /* synthetic */ C0063b j(b bVar) {
                l(bVar);
                return this;
            }

            public final b k() {
                b bVar = new b(this);
                int i6 = this.f3639v;
                int i10 = 1;
                if ((i6 & 1) != 1) {
                    i10 = 0;
                }
                bVar.f3635w = this.f3640w;
                if ((i6 & 2) == 2) {
                    i10 |= 2;
                }
                bVar.f3636x = this.f3641x;
                bVar.f3634v = i10;
                return bVar;
            }

            public final void l(b bVar) {
                boolean z10;
                c cVar;
                if (bVar == b.A) {
                    return;
                }
                int i6 = bVar.f3634v;
                boolean z11 = false;
                if ((i6 & 1) == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    int i10 = bVar.f3635w;
                    this.f3639v |= 1;
                    this.f3640w = i10;
                }
                if ((i6 & 2) == 2) {
                    z11 = true;
                }
                if (z11) {
                    c cVar2 = bVar.f3636x;
                    if ((this.f3639v & 2) == 2 && (cVar = this.f3641x) != c.J) {
                        c.C0065b c0065b = new c.C0065b();
                        c0065b.l(cVar);
                        c0065b.l(cVar2);
                        this.f3641x = c0065b.k();
                    } else {
                        this.f3641x = cVar2;
                    }
                    this.f3639v |= 2;
                }
                this.f16856u = this.f16856u.g(bVar.f3633u);
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001c  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void m(gu.d dVar, gu.e eVar) {
                b bVar;
                try {
                    try {
                        b.B.getClass();
                        l(new b(dVar, eVar));
                    } catch (Throwable th2) {
                        th = th2;
                        bVar = null;
                        if (bVar != null) {
                            l(bVar);
                        }
                        throw th;
                    }
                } catch (InvalidProtocolBufferException e10) {
                    bVar = (b) e10.f23476u;
                    try {
                        throw e10;
                    } catch (Throwable th3) {
                        th = th3;
                        if (bVar != null) {
                        }
                        throw th;
                    }
                }
            }
        }

        static {
            b bVar = new b();
            A = bVar;
            bVar.f3635w = 0;
            bVar.f3636x = c.J;
        }

        public b(g.a aVar) {
            super(0);
            this.f3637y = (byte) -1;
            this.f3638z = -1;
            this.f3633u = aVar.f16856u;
        }

        @Override // gu.n
        public final n.a a() {
            C0063b c0063b = new C0063b();
            c0063b.l(this);
            return c0063b;
        }

        @Override // gu.n
        public final int b() {
            int i6 = this.f3638z;
            if (i6 != -1) {
                return i6;
            }
            int i10 = 0;
            if ((this.f3634v & 1) == 1) {
                i10 = 0 + CodedOutputStream.b(1, this.f3635w);
            }
            if ((this.f3634v & 2) == 2) {
                i10 += CodedOutputStream.d(2, this.f3636x);
            }
            int size = this.f3633u.size() + i10;
            this.f3638z = size;
            return size;
        }

        @Override // gu.n
        public final n.a c() {
            return new C0063b();
        }

        @Override // gu.o
        public final boolean d() {
            boolean z10;
            boolean z11;
            byte b10 = this.f3637y;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            int i6 = this.f3634v;
            if ((i6 & 1) == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                this.f3637y = (byte) 0;
                return false;
            }
            if ((i6 & 2) == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                this.f3637y = (byte) 0;
                return false;
            } else if (!this.f3636x.d()) {
                this.f3637y = (byte) 0;
                return false;
            } else {
                this.f3637y = (byte) 1;
                return true;
            }
        }

        @Override // gu.n
        public final void f(CodedOutputStream codedOutputStream) {
            b();
            if ((this.f3634v & 1) == 1) {
                codedOutputStream.m(1, this.f3635w);
            }
            if ((this.f3634v & 2) == 2) {
                codedOutputStream.o(2, this.f3636x);
            }
            codedOutputStream.r(this.f3633u);
        }

        /* compiled from: ProtoBuf.java */
        /* loaded from: classes2.dex */
        public static final class c extends gu.g implements gu.o {
            public static final c J;
            public static final C0064a K = new C0064a();
            public int A;
            public int B;
            public int C;
            public a D;
            public List<c> E;
            public int F;
            public int G;
            public byte H;
            public int I;

            /* renamed from: u  reason: collision with root package name */
            public final gu.c f3642u;

            /* renamed from: v  reason: collision with root package name */
            public int f3643v;

            /* renamed from: w  reason: collision with root package name */
            public EnumC0066c f3644w;

            /* renamed from: x  reason: collision with root package name */
            public long f3645x;

            /* renamed from: y  reason: collision with root package name */
            public float f3646y;

            /* renamed from: z  reason: collision with root package name */
            public double f3647z;

            /* compiled from: ProtoBuf.java */
            /* renamed from: au.a$b$c$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static class C0064a extends gu.b<c> {
                @Override // gu.p
                public final Object a(gu.d dVar, gu.e eVar) {
                    return new c(dVar, eVar);
                }
            }

            /* compiled from: ProtoBuf.java */
            /* renamed from: au.a$b$c$b  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0065b extends g.a<c, C0065b> implements gu.o {
                public int A;
                public int B;
                public int C;
                public int F;
                public int G;

                /* renamed from: v  reason: collision with root package name */
                public int f3648v;

                /* renamed from: x  reason: collision with root package name */
                public long f3650x;

                /* renamed from: y  reason: collision with root package name */
                public float f3651y;

                /* renamed from: z  reason: collision with root package name */
                public double f3652z;

                /* renamed from: w  reason: collision with root package name */
                public EnumC0066c f3649w = EnumC0066c.BYTE;
                public a D = a.A;
                public List<c> E = Collections.emptyList();

                @Override // gu.a.AbstractC0262a, gu.n.a
                public final /* bridge */ /* synthetic */ n.a R(gu.d dVar, gu.e eVar) {
                    m(dVar, eVar);
                    return this;
                }

                @Override // gu.n.a
                public final gu.n build() {
                    c k10 = k();
                    if (k10.d()) {
                        return k10;
                    }
                    throw new UninitializedMessageException();
                }

                @Override // gu.g.a
                public final Object clone() {
                    C0065b c0065b = new C0065b();
                    c0065b.l(k());
                    return c0065b;
                }

                @Override // gu.a.AbstractC0262a
                public final /* bridge */ /* synthetic */ a.AbstractC0262a h(gu.d dVar, gu.e eVar) {
                    m(dVar, eVar);
                    return this;
                }

                @Override // gu.g.a
                public final C0065b i() {
                    C0065b c0065b = new C0065b();
                    c0065b.l(k());
                    return c0065b;
                }

                @Override // gu.g.a
                public final /* bridge */ /* synthetic */ C0065b j(c cVar) {
                    l(cVar);
                    return this;
                }

                public final c k() {
                    c cVar = new c(this);
                    int i6 = this.f3648v;
                    int i10 = 1;
                    if ((i6 & 1) != 1) {
                        i10 = 0;
                    }
                    cVar.f3644w = this.f3649w;
                    if ((i6 & 2) == 2) {
                        i10 |= 2;
                    }
                    cVar.f3645x = this.f3650x;
                    if ((i6 & 4) == 4) {
                        i10 |= 4;
                    }
                    cVar.f3646y = this.f3651y;
                    if ((i6 & 8) == 8) {
                        i10 |= 8;
                    }
                    cVar.f3647z = this.f3652z;
                    if ((i6 & 16) == 16) {
                        i10 |= 16;
                    }
                    cVar.A = this.A;
                    if ((i6 & 32) == 32) {
                        i10 |= 32;
                    }
                    cVar.B = this.B;
                    if ((i6 & 64) == 64) {
                        i10 |= 64;
                    }
                    cVar.C = this.C;
                    if ((i6 & 128) == 128) {
                        i10 |= 128;
                    }
                    cVar.D = this.D;
                    if ((i6 & 256) == 256) {
                        this.E = Collections.unmodifiableList(this.E);
                        this.f3648v &= -257;
                    }
                    cVar.E = this.E;
                    if ((i6 & 512) == 512) {
                        i10 |= 256;
                    }
                    cVar.F = this.F;
                    if ((i6 & Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID) == 1024) {
                        i10 |= 512;
                    }
                    cVar.G = this.G;
                    cVar.f3643v = i10;
                    return cVar;
                }

                public final void l(c cVar) {
                    boolean z10;
                    boolean z11;
                    boolean z12;
                    boolean z13;
                    boolean z14;
                    boolean z15;
                    boolean z16;
                    boolean z17;
                    boolean z18;
                    a aVar;
                    if (cVar == c.J) {
                        return;
                    }
                    boolean z19 = true;
                    if ((cVar.f3643v & 1) == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        EnumC0066c enumC0066c = cVar.f3644w;
                        enumC0066c.getClass();
                        this.f3648v |= 1;
                        this.f3649w = enumC0066c;
                    }
                    int i6 = cVar.f3643v;
                    if ((i6 & 2) == 2) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        long j10 = cVar.f3645x;
                        this.f3648v |= 2;
                        this.f3650x = j10;
                    }
                    if ((i6 & 4) == 4) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        float f = cVar.f3646y;
                        this.f3648v = 4 | this.f3648v;
                        this.f3651y = f;
                    }
                    if ((i6 & 8) == 8) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        double d10 = cVar.f3647z;
                        this.f3648v |= 8;
                        this.f3652z = d10;
                    }
                    if ((i6 & 16) == 16) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (z14) {
                        int i10 = cVar.A;
                        this.f3648v = 16 | this.f3648v;
                        this.A = i10;
                    }
                    if ((i6 & 32) == 32) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (z15) {
                        int i11 = cVar.B;
                        this.f3648v = 32 | this.f3648v;
                        this.B = i11;
                    }
                    if ((i6 & 64) == 64) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (z16) {
                        int i12 = cVar.C;
                        this.f3648v = 64 | this.f3648v;
                        this.C = i12;
                    }
                    if ((i6 & 128) == 128) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (z17) {
                        a aVar2 = cVar.D;
                        if ((this.f3648v & 128) == 128 && (aVar = this.D) != a.A) {
                            c cVar2 = new c();
                            cVar2.l(aVar);
                            cVar2.l(aVar2);
                            this.D = cVar2.k();
                        } else {
                            this.D = aVar2;
                        }
                        this.f3648v |= 128;
                    }
                    if (!cVar.E.isEmpty()) {
                        if (this.E.isEmpty()) {
                            this.E = cVar.E;
                            this.f3648v &= -257;
                        } else {
                            if ((this.f3648v & 256) != 256) {
                                this.E = new ArrayList(this.E);
                                this.f3648v |= 256;
                            }
                            this.E.addAll(cVar.E);
                        }
                    }
                    int i13 = cVar.f3643v;
                    if ((i13 & 256) == 256) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    if (z18) {
                        int i14 = cVar.F;
                        this.f3648v |= 512;
                        this.F = i14;
                    }
                    if ((i13 & 512) != 512) {
                        z19 = false;
                    }
                    if (z19) {
                        int i15 = cVar.G;
                        this.f3648v |= Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID;
                        this.G = i15;
                    }
                    this.f16856u = this.f16856u.g(cVar.f3642u);
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x001c  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void m(gu.d dVar, gu.e eVar) {
                    c cVar;
                    try {
                        try {
                            c.K.getClass();
                            l(new c(dVar, eVar));
                        } catch (Throwable th2) {
                            th = th2;
                            cVar = null;
                            if (cVar != null) {
                                l(cVar);
                            }
                            throw th;
                        }
                    } catch (InvalidProtocolBufferException e10) {
                        cVar = (c) e10.f23476u;
                        try {
                            throw e10;
                        } catch (Throwable th3) {
                            th = th3;
                            if (cVar != null) {
                            }
                            throw th;
                        }
                    }
                }
            }

            /* compiled from: ProtoBuf.java */
            /* renamed from: au.a$b$c$c  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public enum EnumC0066c implements h.a {
                BYTE(0),
                CHAR(1),
                SHORT(2),
                INT(3),
                LONG(4),
                FLOAT(5),
                DOUBLE(6),
                BOOLEAN(7),
                STRING(8),
                CLASS(9),
                ENUM(10),
                ANNOTATION(11),
                ARRAY(12);
                

                /* renamed from: u  reason: collision with root package name */
                public final int f3658u;

                EnumC0066c(int i6) {
                    this.f3658u = i6;
                }

                public static EnumC0066c d(int i6) {
                    switch (i6) {
                        case 0:
                            return BYTE;
                        case 1:
                            return CHAR;
                        case 2:
                            return SHORT;
                        case 3:
                            return INT;
                        case 4:
                            return LONG;
                        case 5:
                            return FLOAT;
                        case 6:
                            return DOUBLE;
                        case 7:
                            return BOOLEAN;
                        case 8:
                            return STRING;
                        case 9:
                            return CLASS;
                        case 10:
                            return ENUM;
                        case 11:
                            return ANNOTATION;
                        case 12:
                            return ARRAY;
                        default:
                            return null;
                    }
                }

                @Override // gu.h.a
                public final int e() {
                    return this.f3658u;
                }
            }

            static {
                c cVar = new c();
                J = cVar;
                cVar.i();
            }

            public c(g.a aVar) {
                super(0);
                this.H = (byte) -1;
                this.I = -1;
                this.f3642u = aVar.f16856u;
            }

            @Override // gu.n
            public final n.a a() {
                C0065b c0065b = new C0065b();
                c0065b.l(this);
                return c0065b;
            }

            @Override // gu.n
            public final int b() {
                int i6;
                int i10 = this.I;
                if (i10 != -1) {
                    return i10;
                }
                if ((this.f3643v & 1) == 1) {
                    i6 = CodedOutputStream.a(1, this.f3644w.f3658u) + 0;
                } else {
                    i6 = 0;
                }
                if ((this.f3643v & 2) == 2) {
                    long j10 = this.f3645x;
                    i6 += CodedOutputStream.g((j10 >> 63) ^ (j10 << 1)) + CodedOutputStream.h(2);
                }
                if ((this.f3643v & 4) == 4) {
                    i6 += CodedOutputStream.h(3) + 4;
                }
                if ((this.f3643v & 8) == 8) {
                    i6 += CodedOutputStream.h(4) + 8;
                }
                if ((this.f3643v & 16) == 16) {
                    i6 += CodedOutputStream.b(5, this.A);
                }
                if ((this.f3643v & 32) == 32) {
                    i6 += CodedOutputStream.b(6, this.B);
                }
                if ((this.f3643v & 64) == 64) {
                    i6 += CodedOutputStream.b(7, this.C);
                }
                if ((this.f3643v & 128) == 128) {
                    i6 += CodedOutputStream.d(8, this.D);
                }
                for (int i11 = 0; i11 < this.E.size(); i11++) {
                    i6 += CodedOutputStream.d(9, this.E.get(i11));
                }
                if ((this.f3643v & 512) == 512) {
                    i6 += CodedOutputStream.b(10, this.G);
                }
                if ((this.f3643v & 256) == 256) {
                    i6 += CodedOutputStream.b(11, this.F);
                }
                int size = this.f3642u.size() + i6;
                this.I = size;
                return size;
            }

            @Override // gu.n
            public final n.a c() {
                return new C0065b();
            }

            @Override // gu.o
            public final boolean d() {
                boolean z10;
                byte b10 = this.H;
                if (b10 == 1) {
                    return true;
                }
                if (b10 == 0) {
                    return false;
                }
                if ((this.f3643v & 128) == 128) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && !this.D.d()) {
                    this.H = (byte) 0;
                    return false;
                }
                for (int i6 = 0; i6 < this.E.size(); i6++) {
                    if (!this.E.get(i6).d()) {
                        this.H = (byte) 0;
                        return false;
                    }
                }
                this.H = (byte) 1;
                return true;
            }

            @Override // gu.n
            public final void f(CodedOutputStream codedOutputStream) {
                b();
                if ((this.f3643v & 1) == 1) {
                    codedOutputStream.l(1, this.f3644w.f3658u);
                }
                if ((this.f3643v & 2) == 2) {
                    long j10 = this.f3645x;
                    codedOutputStream.x(2, 0);
                    codedOutputStream.w((j10 >> 63) ^ (j10 << 1));
                }
                if ((this.f3643v & 4) == 4) {
                    float f = this.f3646y;
                    codedOutputStream.x(3, 5);
                    codedOutputStream.t(Float.floatToRawIntBits(f));
                }
                if ((this.f3643v & 8) == 8) {
                    double d10 = this.f3647z;
                    codedOutputStream.x(4, 1);
                    codedOutputStream.u(Double.doubleToRawLongBits(d10));
                }
                if ((this.f3643v & 16) == 16) {
                    codedOutputStream.m(5, this.A);
                }
                if ((this.f3643v & 32) == 32) {
                    codedOutputStream.m(6, this.B);
                }
                if ((this.f3643v & 64) == 64) {
                    codedOutputStream.m(7, this.C);
                }
                if ((this.f3643v & 128) == 128) {
                    codedOutputStream.o(8, this.D);
                }
                for (int i6 = 0; i6 < this.E.size(); i6++) {
                    codedOutputStream.o(9, this.E.get(i6));
                }
                if ((this.f3643v & 512) == 512) {
                    codedOutputStream.m(10, this.G);
                }
                if ((this.f3643v & 256) == 256) {
                    codedOutputStream.m(11, this.F);
                }
                codedOutputStream.r(this.f3642u);
            }

            public final void i() {
                this.f3644w = EnumC0066c.BYTE;
                this.f3645x = 0L;
                this.f3646y = 0.0f;
                this.f3647z = 0.0d;
                this.A = 0;
                this.B = 0;
                this.C = 0;
                this.D = a.A;
                this.E = Collections.emptyList();
                this.F = 0;
                this.G = 0;
            }

            public c() {
                this.H = (byte) -1;
                this.I = -1;
                this.f3642u = gu.c.f16833u;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public c(gu.d dVar, gu.e eVar) {
                c cVar;
                this.H = (byte) -1;
                this.I = -1;
                i();
                CodedOutputStream j10 = CodedOutputStream.j(new c.b(), 1);
                boolean z10 = false;
                boolean z11 = false;
                while (!z10) {
                    try {
                        try {
                            int n10 = dVar.n();
                            switch (n10) {
                                case 0:
                                    break;
                                case 8:
                                    int k10 = dVar.k();
                                    EnumC0066c d10 = EnumC0066c.d(k10);
                                    if (d10 == null) {
                                        j10.v(n10);
                                        j10.v(k10);
                                    } else {
                                        this.f3643v |= 1;
                                        this.f3644w = d10;
                                        continue;
                                    }
                                case 16:
                                    this.f3643v |= 2;
                                    long l2 = dVar.l();
                                    this.f3645x = (-(l2 & 1)) ^ (l2 >>> 1);
                                    continue;
                                case 29:
                                    this.f3643v |= 4;
                                    this.f3646y = Float.intBitsToFloat(dVar.i());
                                    continue;
                                case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                                    this.f3643v |= 8;
                                    this.f3647z = Double.longBitsToDouble(dVar.j());
                                    continue;
                                case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                                    this.f3643v |= 16;
                                    this.A = dVar.k();
                                    continue;
                                case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                                    this.f3643v |= 32;
                                    this.B = dVar.k();
                                    continue;
                                case R.styleable.AppCompatTheme_colorError /* 56 */:
                                    this.f3643v |= 64;
                                    this.C = dVar.k();
                                    continue;
                                case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                                    if ((this.f3643v & 128) == 128) {
                                        a aVar = this.D;
                                        aVar.getClass();
                                        cVar = new c();
                                        cVar.l(aVar);
                                    } else {
                                        cVar = null;
                                    }
                                    a aVar2 = (a) dVar.g(a.B, eVar);
                                    this.D = aVar2;
                                    if (cVar != null) {
                                        cVar.l(aVar2);
                                        this.D = cVar.k();
                                    }
                                    this.f3643v |= 128;
                                    continue;
                                case R.styleable.AppCompatTheme_listChoiceIndicatorMultipleAnimated /* 74 */:
                                    if (!(z11 & true)) {
                                        this.E = new ArrayList();
                                        z11 |= true;
                                    }
                                    this.E.add(dVar.g(K, eVar));
                                    continue;
                                case R.styleable.AppCompatTheme_listPreferredItemHeightLarge /* 80 */:
                                    this.f3643v |= 512;
                                    this.G = dVar.k();
                                    continue;
                                case R.styleable.AppCompatTheme_panelMenuListWidth /* 88 */:
                                    this.f3643v |= 256;
                                    this.F = dVar.k();
                                    continue;
                                default:
                                    if (!dVar.q(n10, j10)) {
                                        break;
                                    } else {
                                        continue;
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
                        if (z11 & true) {
                            this.E = Collections.unmodifiableList(this.E);
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
                    this.E = Collections.unmodifiableList(this.E);
                }
                try {
                    j10.i();
                } catch (IOException unused2) {
                } finally {
                }
            }
        }

        public b() {
            this.f3637y = (byte) -1;
            this.f3638z = -1;
            this.f3633u = gu.c.f16833u;
        }

        public b(gu.d dVar, gu.e eVar) {
            c.C0065b c0065b;
            this.f3637y = (byte) -1;
            this.f3638z = -1;
            boolean z10 = false;
            this.f3635w = 0;
            this.f3636x = c.J;
            c.b bVar = new c.b();
            CodedOutputStream j10 = CodedOutputStream.j(bVar, 1);
            while (!z10) {
                try {
                    try {
                        try {
                            int n10 = dVar.n();
                            if (n10 != 0) {
                                if (n10 == 8) {
                                    this.f3634v |= 1;
                                    this.f3635w = dVar.k();
                                } else if (n10 != 18) {
                                    if (!dVar.q(n10, j10)) {
                                    }
                                } else {
                                    if ((this.f3634v & 2) == 2) {
                                        c cVar = this.f3636x;
                                        cVar.getClass();
                                        c0065b = new c.C0065b();
                                        c0065b.l(cVar);
                                    } else {
                                        c0065b = null;
                                    }
                                    c cVar2 = (c) dVar.g(c.K, eVar);
                                    this.f3636x = cVar2;
                                    if (c0065b != null) {
                                        c0065b.l(cVar2);
                                        this.f3636x = c0065b.k();
                                    }
                                    this.f3634v |= 2;
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
                    try {
                        j10.i();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f3633u = bVar.g();
                        throw th3;
                    }
                    this.f3633u = bVar.g();
                    throw th2;
                }
            }
            try {
                j10.i();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f3633u = bVar.g();
                throw th4;
            }
            this.f3633u = bVar.g();
        }
    }

    public a() {
        this.f3631y = (byte) -1;
        this.f3632z = -1;
        this.f3627u = gu.c.f16833u;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(gu.d dVar, gu.e eVar) {
        this.f3631y = (byte) -1;
        this.f3632z = -1;
        boolean z10 = false;
        this.f3629w = 0;
        this.f3630x = Collections.emptyList();
        CodedOutputStream j10 = CodedOutputStream.j(new c.b(), 1);
        boolean z11 = false;
        while (!z10) {
            try {
                try {
                    int n10 = dVar.n();
                    if (n10 != 0) {
                        if (n10 == 8) {
                            this.f3628v |= 1;
                            this.f3629w = dVar.k();
                        } else if (n10 != 18) {
                            if (!dVar.q(n10, j10)) {
                            }
                        } else {
                            if (!(z11 & true)) {
                                this.f3630x = new ArrayList();
                                z11 |= true;
                            }
                            this.f3630x.add(dVar.g(b.B, eVar));
                        }
                    }
                    z10 = true;
                } catch (Throwable th2) {
                    if (z11 & true) {
                        this.f3630x = Collections.unmodifiableList(this.f3630x);
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
            this.f3630x = Collections.unmodifiableList(this.f3630x);
        }
        try {
            j10.i();
        } catch (IOException unused2) {
        } finally {
        }
    }
}
