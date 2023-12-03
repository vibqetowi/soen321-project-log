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
public final class n extends gu.g implements gu.o {

    /* renamed from: y  reason: collision with root package name */
    public static final n f3775y;

    /* renamed from: z  reason: collision with root package name */
    public static final a f3776z = new a();

    /* renamed from: u  reason: collision with root package name */
    public final gu.c f3777u;

    /* renamed from: v  reason: collision with root package name */
    public List<c> f3778v;

    /* renamed from: w  reason: collision with root package name */
    public byte f3779w;

    /* renamed from: x  reason: collision with root package name */
    public int f3780x;

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes2.dex */
    public static class a extends gu.b<n> {
        @Override // gu.p
        public final Object a(gu.d dVar, gu.e eVar) {
            return new n(dVar, eVar);
        }
    }

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes2.dex */
    public static final class b extends g.a<n, b> implements gu.o {

        /* renamed from: v  reason: collision with root package name */
        public int f3781v;

        /* renamed from: w  reason: collision with root package name */
        public List<c> f3782w = Collections.emptyList();

        @Override // gu.a.AbstractC0262a, gu.n.a
        public final /* bridge */ /* synthetic */ n.a R(gu.d dVar, gu.e eVar) {
            m(dVar, eVar);
            return this;
        }

        @Override // gu.n.a
        public final gu.n build() {
            n k10 = k();
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
        public final /* bridge */ /* synthetic */ b j(n nVar) {
            l(nVar);
            return this;
        }

        public final n k() {
            n nVar = new n(this);
            if ((this.f3781v & 1) == 1) {
                this.f3782w = Collections.unmodifiableList(this.f3782w);
                this.f3781v &= -2;
            }
            nVar.f3778v = this.f3782w;
            return nVar;
        }

        public final void l(n nVar) {
            if (nVar == n.f3775y) {
                return;
            }
            if (!nVar.f3778v.isEmpty()) {
                if (this.f3782w.isEmpty()) {
                    this.f3782w = nVar.f3778v;
                    this.f3781v &= -2;
                } else {
                    if ((this.f3781v & 1) != 1) {
                        this.f3782w = new ArrayList(this.f3782w);
                        this.f3781v |= 1;
                    }
                    this.f3782w.addAll(nVar.f3778v);
                }
            }
            this.f16856u = this.f16856u.g(nVar.f3777u);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void m(gu.d dVar, gu.e eVar) {
            n nVar;
            try {
                try {
                    n.f3776z.getClass();
                    l(new n(dVar, eVar));
                } catch (Throwable th2) {
                    th = th2;
                    nVar = null;
                    if (nVar != null) {
                        l(nVar);
                    }
                    throw th;
                }
            } catch (InvalidProtocolBufferException e10) {
                nVar = (n) e10.f23476u;
                try {
                    throw e10;
                } catch (Throwable th3) {
                    th = th3;
                    if (nVar != null) {
                    }
                    throw th;
                }
            }
        }
    }

    static {
        n nVar = new n();
        f3775y = nVar;
        nVar.f3778v = Collections.emptyList();
    }

    public n(g.a aVar) {
        super(0);
        this.f3779w = (byte) -1;
        this.f3780x = -1;
        this.f3777u = aVar.f16856u;
    }

    @Override // gu.n
    public final n.a a() {
        b bVar = new b();
        bVar.l(this);
        return bVar;
    }

    @Override // gu.n
    public final int b() {
        int i6 = this.f3780x;
        if (i6 != -1) {
            return i6;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.f3778v.size(); i11++) {
            i10 += CodedOutputStream.d(1, this.f3778v.get(i11));
        }
        int size = this.f3777u.size() + i10;
        this.f3780x = size;
        return size;
    }

    @Override // gu.n
    public final n.a c() {
        return new b();
    }

    @Override // gu.o
    public final boolean d() {
        byte b10 = this.f3779w;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i6 = 0; i6 < this.f3778v.size(); i6++) {
            if (!this.f3778v.get(i6).d()) {
                this.f3779w = (byte) 0;
                return false;
            }
        }
        this.f3779w = (byte) 1;
        return true;
    }

    @Override // gu.n
    public final void f(CodedOutputStream codedOutputStream) {
        b();
        for (int i6 = 0; i6 < this.f3778v.size(); i6++) {
            codedOutputStream.o(1, this.f3778v.get(i6));
        }
        codedOutputStream.r(this.f3777u);
    }

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes2.dex */
    public static final class c extends gu.g implements gu.o {
        public static final c B;
        public static final a C = new a();
        public int A;

        /* renamed from: u  reason: collision with root package name */
        public final gu.c f3783u;

        /* renamed from: v  reason: collision with root package name */
        public int f3784v;

        /* renamed from: w  reason: collision with root package name */
        public int f3785w;

        /* renamed from: x  reason: collision with root package name */
        public int f3786x;

        /* renamed from: y  reason: collision with root package name */
        public EnumC0068c f3787y;

        /* renamed from: z  reason: collision with root package name */
        public byte f3788z;

        /* compiled from: ProtoBuf.java */
        /* loaded from: classes2.dex */
        public static class a extends gu.b<c> {
            @Override // gu.p
            public final Object a(gu.d dVar, gu.e eVar) {
                return new c(dVar);
            }
        }

        /* compiled from: ProtoBuf.java */
        /* loaded from: classes2.dex */
        public static final class b extends g.a<c, b> implements gu.o {

            /* renamed from: v  reason: collision with root package name */
            public int f3789v;

            /* renamed from: x  reason: collision with root package name */
            public int f3791x;

            /* renamed from: w  reason: collision with root package name */
            public int f3790w = -1;

            /* renamed from: y  reason: collision with root package name */
            public EnumC0068c f3792y = EnumC0068c.PACKAGE;

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
            public final /* bridge */ /* synthetic */ b j(c cVar) {
                l(cVar);
                return this;
            }

            public final c k() {
                c cVar = new c(this);
                int i6 = this.f3789v;
                int i10 = 1;
                if ((i6 & 1) != 1) {
                    i10 = 0;
                }
                cVar.f3785w = this.f3790w;
                if ((i6 & 2) == 2) {
                    i10 |= 2;
                }
                cVar.f3786x = this.f3791x;
                if ((i6 & 4) == 4) {
                    i10 |= 4;
                }
                cVar.f3787y = this.f3792y;
                cVar.f3784v = i10;
                return cVar;
            }

            public final void l(c cVar) {
                boolean z10;
                boolean z11;
                if (cVar == c.B) {
                    return;
                }
                int i6 = cVar.f3784v;
                boolean z12 = false;
                if ((i6 & 1) == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    int i10 = cVar.f3785w;
                    this.f3789v |= 1;
                    this.f3790w = i10;
                }
                if ((i6 & 2) == 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    int i11 = cVar.f3786x;
                    this.f3789v = 2 | this.f3789v;
                    this.f3791x = i11;
                }
                if ((i6 & 4) == 4) {
                    z12 = true;
                }
                if (z12) {
                    EnumC0068c enumC0068c = cVar.f3787y;
                    enumC0068c.getClass();
                    this.f3789v = 4 | this.f3789v;
                    this.f3792y = enumC0068c;
                }
                this.f16856u = this.f16856u.g(cVar.f3783u);
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001c  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void m(gu.d dVar, gu.e eVar) {
                c cVar;
                try {
                    try {
                        c.C.getClass();
                        l(new c(dVar));
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
        /* renamed from: au.n$c$c  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public enum EnumC0068c implements h.a {
            CLASS(0),
            PACKAGE(1),
            LOCAL(2);
            

            /* renamed from: u  reason: collision with root package name */
            public final int f3797u;

            EnumC0068c(int i6) {
                this.f3797u = i6;
            }

            @Override // gu.h.a
            public final int e() {
                return this.f3797u;
            }
        }

        static {
            c cVar = new c();
            B = cVar;
            cVar.f3785w = -1;
            cVar.f3786x = 0;
            cVar.f3787y = EnumC0068c.PACKAGE;
        }

        public c(g.a aVar) {
            super(0);
            this.f3788z = (byte) -1;
            this.A = -1;
            this.f3783u = aVar.f16856u;
        }

        @Override // gu.n
        public final n.a a() {
            b bVar = new b();
            bVar.l(this);
            return bVar;
        }

        @Override // gu.n
        public final int b() {
            int i6 = this.A;
            if (i6 != -1) {
                return i6;
            }
            int i10 = 0;
            if ((this.f3784v & 1) == 1) {
                i10 = 0 + CodedOutputStream.b(1, this.f3785w);
            }
            if ((this.f3784v & 2) == 2) {
                i10 += CodedOutputStream.b(2, this.f3786x);
            }
            if ((this.f3784v & 4) == 4) {
                i10 += CodedOutputStream.a(3, this.f3787y.f3797u);
            }
            int size = this.f3783u.size() + i10;
            this.A = size;
            return size;
        }

        @Override // gu.n
        public final n.a c() {
            return new b();
        }

        @Override // gu.o
        public final boolean d() {
            boolean z10;
            byte b10 = this.f3788z;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            if ((this.f3784v & 2) == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                this.f3788z = (byte) 0;
                return false;
            }
            this.f3788z = (byte) 1;
            return true;
        }

        @Override // gu.n
        public final void f(CodedOutputStream codedOutputStream) {
            b();
            if ((this.f3784v & 1) == 1) {
                codedOutputStream.m(1, this.f3785w);
            }
            if ((this.f3784v & 2) == 2) {
                codedOutputStream.m(2, this.f3786x);
            }
            if ((this.f3784v & 4) == 4) {
                codedOutputStream.l(3, this.f3787y.f3797u);
            }
            codedOutputStream.r(this.f3783u);
        }

        public c() {
            this.f3788z = (byte) -1;
            this.A = -1;
            this.f3783u = gu.c.f16833u;
        }

        public c(gu.d dVar) {
            EnumC0068c enumC0068c;
            this.f3788z = (byte) -1;
            this.A = -1;
            this.f3785w = -1;
            boolean z10 = false;
            this.f3786x = 0;
            EnumC0068c enumC0068c2 = EnumC0068c.PACKAGE;
            this.f3787y = enumC0068c2;
            c.b bVar = new c.b();
            CodedOutputStream j10 = CodedOutputStream.j(bVar, 1);
            while (!z10) {
                try {
                    try {
                        int n10 = dVar.n();
                        if (n10 != 0) {
                            if (n10 == 8) {
                                this.f3784v |= 1;
                                this.f3785w = dVar.k();
                            } else if (n10 == 16) {
                                this.f3784v |= 2;
                                this.f3786x = dVar.k();
                            } else if (n10 != 24) {
                                if (!dVar.q(n10, j10)) {
                                }
                            } else {
                                int k10 = dVar.k();
                                if (k10 == 0) {
                                    enumC0068c = EnumC0068c.CLASS;
                                } else if (k10 != 1) {
                                    enumC0068c = k10 != 2 ? null : EnumC0068c.LOCAL;
                                } else {
                                    enumC0068c = enumC0068c2;
                                }
                                if (enumC0068c == null) {
                                    j10.v(n10);
                                    j10.v(k10);
                                } else {
                                    this.f3784v |= 4;
                                    this.f3787y = enumC0068c;
                                }
                            }
                        }
                        z10 = true;
                    } catch (Throwable th2) {
                        try {
                            j10.i();
                        } catch (IOException unused) {
                        } catch (Throwable th3) {
                            this.f3783u = bVar.g();
                            throw th3;
                        }
                        this.f3783u = bVar.g();
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
                this.f3783u = bVar.g();
                throw th4;
            }
            this.f3783u = bVar.g();
        }
    }

    public n() {
        this.f3779w = (byte) -1;
        this.f3780x = -1;
        this.f3777u = gu.c.f16833u;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n(gu.d dVar, gu.e eVar) {
        this.f3779w = (byte) -1;
        this.f3780x = -1;
        this.f3778v = Collections.emptyList();
        CodedOutputStream j10 = CodedOutputStream.j(new c.b(), 1);
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            try {
                try {
                    int n10 = dVar.n();
                    if (n10 != 0) {
                        if (n10 != 10) {
                            if (!dVar.q(n10, j10)) {
                            }
                        } else {
                            if (!(z11 & true)) {
                                this.f3778v = new ArrayList();
                                z11 |= true;
                            }
                            this.f3778v.add(dVar.g(c.C, eVar));
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
                    this.f3778v = Collections.unmodifiableList(this.f3778v);
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
            this.f3778v = Collections.unmodifiableList(this.f3778v);
        }
        try {
            j10.i();
        } catch (IOException unused2) {
        } finally {
        }
    }
}
