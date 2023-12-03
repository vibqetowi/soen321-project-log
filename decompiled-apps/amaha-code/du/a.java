package du;

import au.h;
import au.k;
import au.m;
import au.p;
import au.r;
import com.appsflyer.R;
import gu.a;
import gu.c;
import gu.e;
import gu.g;
import gu.h;
import gu.n;
import gu.o;
import gu.u;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;
/* compiled from: JvmProtoBuf.java */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final g.e<au.c, b> f13436a;

    /* renamed from: b  reason: collision with root package name */
    public static final g.e<h, b> f13437b;

    /* renamed from: c  reason: collision with root package name */
    public static final g.e<h, Integer> f13438c;

    /* renamed from: d  reason: collision with root package name */
    public static final g.e<m, c> f13439d;

    /* renamed from: e  reason: collision with root package name */
    public static final g.e<m, Integer> f13440e;
    public static final g.e<p, List<au.a>> f;

    /* renamed from: g  reason: collision with root package name */
    public static final g.e<p, Boolean> f13441g;

    /* renamed from: h  reason: collision with root package name */
    public static final g.e<r, List<au.a>> f13442h;

    /* renamed from: i  reason: collision with root package name */
    public static final g.e<au.b, Integer> f13443i;

    /* renamed from: j  reason: collision with root package name */
    public static final g.e<au.b, List<m>> f13444j;

    /* renamed from: k  reason: collision with root package name */
    public static final g.e<au.b, Integer> f13445k;

    /* renamed from: l  reason: collision with root package name */
    public static final g.e<au.b, Integer> f13446l;

    /* renamed from: m  reason: collision with root package name */
    public static final g.e<k, Integer> f13447m;

    /* renamed from: n  reason: collision with root package name */
    public static final g.e<k, List<m>> f13448n;

    static {
        au.c cVar = au.c.C;
        b bVar = b.A;
        u.c cVar2 = u.f16917z;
        f13436a = g.h(cVar, bVar, bVar, 100, cVar2, b.class);
        h hVar = h.O;
        f13437b = g.h(hVar, bVar, bVar, 100, cVar2, b.class);
        u uVar = u.f16914w;
        f13438c = g.h(hVar, 0, null, R.styleable.AppCompatTheme_switchStyle, uVar, Integer.class);
        m mVar = m.O;
        c cVar3 = c.D;
        f13439d = g.h(mVar, cVar3, cVar3, 100, cVar2, c.class);
        f13440e = g.h(mVar, 0, null, R.styleable.AppCompatTheme_switchStyle, uVar, Integer.class);
        p pVar = p.N;
        au.a aVar = au.a.A;
        f = g.g(pVar, aVar, 100, cVar2, au.a.class);
        f13441g = g.h(pVar, Boolean.FALSE, null, R.styleable.AppCompatTheme_switchStyle, u.f16915x, Boolean.class);
        f13442h = g.g(r.G, aVar, 100, cVar2, au.a.class);
        au.b bVar2 = au.b.f3662d0;
        f13443i = g.h(bVar2, 0, null, R.styleable.AppCompatTheme_switchStyle, uVar, Integer.class);
        f13444j = g.g(bVar2, mVar, R.styleable.AppCompatTheme_textAppearanceLargePopupMenu, cVar2, m.class);
        f13445k = g.h(bVar2, 0, null, R.styleable.AppCompatTheme_textAppearanceListItem, uVar, Integer.class);
        f13446l = g.h(bVar2, 0, null, R.styleable.AppCompatTheme_textAppearanceListItemSecondary, uVar, Integer.class);
        k kVar = k.E;
        f13447m = g.h(kVar, 0, null, R.styleable.AppCompatTheme_switchStyle, uVar, Integer.class);
        f13448n = g.g(kVar, mVar, R.styleable.AppCompatTheme_textAppearanceLargePopupMenu, cVar2, m.class);
    }

    /* compiled from: JvmProtoBuf.java */
    /* renamed from: du.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0198a extends g implements o {
        public static final C0198a A;
        public static final C0199a B = new C0199a();

        /* renamed from: u  reason: collision with root package name */
        public final gu.c f13449u;

        /* renamed from: v  reason: collision with root package name */
        public int f13450v;

        /* renamed from: w  reason: collision with root package name */
        public int f13451w;

        /* renamed from: x  reason: collision with root package name */
        public int f13452x;

        /* renamed from: y  reason: collision with root package name */
        public byte f13453y;

        /* renamed from: z  reason: collision with root package name */
        public int f13454z;

        /* compiled from: JvmProtoBuf.java */
        /* renamed from: du.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static class C0199a extends gu.b<C0198a> {
            @Override // gu.p
            public final Object a(gu.d dVar, e eVar) {
                return new C0198a(dVar);
            }
        }

        /* compiled from: JvmProtoBuf.java */
        /* renamed from: du.a$a$b */
        /* loaded from: classes2.dex */
        public static final class b extends g.a<C0198a, b> implements o {

            /* renamed from: v  reason: collision with root package name */
            public int f13455v;

            /* renamed from: w  reason: collision with root package name */
            public int f13456w;

            /* renamed from: x  reason: collision with root package name */
            public int f13457x;

            @Override // gu.a.AbstractC0262a, gu.n.a
            public final /* bridge */ /* synthetic */ n.a R(gu.d dVar, e eVar) {
                m(dVar, eVar);
                return this;
            }

            @Override // gu.n.a
            public final n build() {
                C0198a k10 = k();
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
            public final /* bridge */ /* synthetic */ a.AbstractC0262a h(gu.d dVar, e eVar) {
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
            public final /* bridge */ /* synthetic */ b j(C0198a c0198a) {
                l(c0198a);
                return this;
            }

            public final C0198a k() {
                C0198a c0198a = new C0198a(this);
                int i6 = this.f13455v;
                int i10 = 1;
                if ((i6 & 1) != 1) {
                    i10 = 0;
                }
                c0198a.f13451w = this.f13456w;
                if ((i6 & 2) == 2) {
                    i10 |= 2;
                }
                c0198a.f13452x = this.f13457x;
                c0198a.f13450v = i10;
                return c0198a;
            }

            public final void l(C0198a c0198a) {
                boolean z10;
                if (c0198a == C0198a.A) {
                    return;
                }
                int i6 = c0198a.f13450v;
                boolean z11 = false;
                if ((i6 & 1) == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    int i10 = c0198a.f13451w;
                    this.f13455v |= 1;
                    this.f13456w = i10;
                }
                if ((i6 & 2) == 2) {
                    z11 = true;
                }
                if (z11) {
                    int i11 = c0198a.f13452x;
                    this.f13455v = 2 | this.f13455v;
                    this.f13457x = i11;
                }
                this.f16856u = this.f16856u.g(c0198a.f13449u);
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001c  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void m(gu.d dVar, e eVar) {
                C0198a c0198a;
                try {
                    try {
                        C0198a.B.getClass();
                        l(new C0198a(dVar));
                    } catch (Throwable th2) {
                        th = th2;
                        c0198a = null;
                        if (c0198a != null) {
                            l(c0198a);
                        }
                        throw th;
                    }
                } catch (InvalidProtocolBufferException e10) {
                    c0198a = (C0198a) e10.f23476u;
                    try {
                        throw e10;
                    } catch (Throwable th3) {
                        th = th3;
                        if (c0198a != null) {
                        }
                        throw th;
                    }
                }
            }
        }

        static {
            C0198a c0198a = new C0198a();
            A = c0198a;
            c0198a.f13451w = 0;
            c0198a.f13452x = 0;
        }

        public C0198a(g.a aVar) {
            super(0);
            this.f13453y = (byte) -1;
            this.f13454z = -1;
            this.f13449u = aVar.f16856u;
        }

        @Override // gu.n
        public final n.a a() {
            b bVar = new b();
            bVar.l(this);
            return bVar;
        }

        @Override // gu.n
        public final int b() {
            int i6 = this.f13454z;
            if (i6 != -1) {
                return i6;
            }
            int i10 = 0;
            if ((this.f13450v & 1) == 1) {
                i10 = 0 + CodedOutputStream.b(1, this.f13451w);
            }
            if ((this.f13450v & 2) == 2) {
                i10 += CodedOutputStream.b(2, this.f13452x);
            }
            int size = this.f13449u.size() + i10;
            this.f13454z = size;
            return size;
        }

        @Override // gu.n
        public final n.a c() {
            return new b();
        }

        @Override // gu.o
        public final boolean d() {
            byte b10 = this.f13453y;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f13453y = (byte) 1;
            return true;
        }

        @Override // gu.n
        public final void f(CodedOutputStream codedOutputStream) {
            b();
            if ((this.f13450v & 1) == 1) {
                codedOutputStream.m(1, this.f13451w);
            }
            if ((this.f13450v & 2) == 2) {
                codedOutputStream.m(2, this.f13452x);
            }
            codedOutputStream.r(this.f13449u);
        }

        public C0198a() {
            this.f13453y = (byte) -1;
            this.f13454z = -1;
            this.f13449u = gu.c.f16833u;
        }

        public C0198a(gu.d dVar) {
            this.f13453y = (byte) -1;
            this.f13454z = -1;
            boolean z10 = false;
            this.f13451w = 0;
            this.f13452x = 0;
            c.b bVar = new c.b();
            CodedOutputStream j10 = CodedOutputStream.j(bVar, 1);
            while (!z10) {
                try {
                    try {
                        int n10 = dVar.n();
                        if (n10 != 0) {
                            if (n10 == 8) {
                                this.f13450v |= 1;
                                this.f13451w = dVar.k();
                            } else if (n10 != 16) {
                                if (!dVar.q(n10, j10)) {
                                }
                            } else {
                                this.f13450v |= 2;
                                this.f13452x = dVar.k();
                            }
                        }
                        z10 = true;
                    } catch (Throwable th2) {
                        try {
                            j10.i();
                        } catch (IOException unused) {
                        } catch (Throwable th3) {
                            this.f13449u = bVar.g();
                            throw th3;
                        }
                        this.f13449u = bVar.g();
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
                this.f13449u = bVar.g();
                throw th4;
            }
            this.f13449u = bVar.g();
        }
    }

    /* compiled from: JvmProtoBuf.java */
    /* loaded from: classes2.dex */
    public static final class b extends g implements o {
        public static final b A;
        public static final C0200a B = new C0200a();

        /* renamed from: u  reason: collision with root package name */
        public final gu.c f13458u;

        /* renamed from: v  reason: collision with root package name */
        public int f13459v;

        /* renamed from: w  reason: collision with root package name */
        public int f13460w;

        /* renamed from: x  reason: collision with root package name */
        public int f13461x;

        /* renamed from: y  reason: collision with root package name */
        public byte f13462y;

        /* renamed from: z  reason: collision with root package name */
        public int f13463z;

        /* compiled from: JvmProtoBuf.java */
        /* renamed from: du.a$b$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static class C0200a extends gu.b<b> {
            @Override // gu.p
            public final Object a(gu.d dVar, e eVar) {
                return new b(dVar);
            }
        }

        /* compiled from: JvmProtoBuf.java */
        /* renamed from: du.a$b$b  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0201b extends g.a<b, C0201b> implements o {

            /* renamed from: v  reason: collision with root package name */
            public int f13464v;

            /* renamed from: w  reason: collision with root package name */
            public int f13465w;

            /* renamed from: x  reason: collision with root package name */
            public int f13466x;

            @Override // gu.a.AbstractC0262a, gu.n.a
            public final /* bridge */ /* synthetic */ n.a R(gu.d dVar, e eVar) {
                m(dVar, eVar);
                return this;
            }

            @Override // gu.n.a
            public final n build() {
                b k10 = k();
                if (k10.d()) {
                    return k10;
                }
                throw new UninitializedMessageException();
            }

            @Override // gu.g.a
            public final Object clone() {
                C0201b c0201b = new C0201b();
                c0201b.l(k());
                return c0201b;
            }

            @Override // gu.a.AbstractC0262a
            public final /* bridge */ /* synthetic */ a.AbstractC0262a h(gu.d dVar, e eVar) {
                m(dVar, eVar);
                return this;
            }

            @Override // gu.g.a
            public final C0201b i() {
                C0201b c0201b = new C0201b();
                c0201b.l(k());
                return c0201b;
            }

            @Override // gu.g.a
            public final /* bridge */ /* synthetic */ C0201b j(b bVar) {
                l(bVar);
                return this;
            }

            public final b k() {
                b bVar = new b(this);
                int i6 = this.f13464v;
                int i10 = 1;
                if ((i6 & 1) != 1) {
                    i10 = 0;
                }
                bVar.f13460w = this.f13465w;
                if ((i6 & 2) == 2) {
                    i10 |= 2;
                }
                bVar.f13461x = this.f13466x;
                bVar.f13459v = i10;
                return bVar;
            }

            public final void l(b bVar) {
                boolean z10;
                if (bVar == b.A) {
                    return;
                }
                int i6 = bVar.f13459v;
                boolean z11 = false;
                if ((i6 & 1) == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    int i10 = bVar.f13460w;
                    this.f13464v |= 1;
                    this.f13465w = i10;
                }
                if ((i6 & 2) == 2) {
                    z11 = true;
                }
                if (z11) {
                    int i11 = bVar.f13461x;
                    this.f13464v = 2 | this.f13464v;
                    this.f13466x = i11;
                }
                this.f16856u = this.f16856u.g(bVar.f13458u);
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001c  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void m(gu.d dVar, e eVar) {
                b bVar;
                try {
                    try {
                        b.B.getClass();
                        l(new b(dVar));
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
            bVar.f13460w = 0;
            bVar.f13461x = 0;
        }

        public b(g.a aVar) {
            super(0);
            this.f13462y = (byte) -1;
            this.f13463z = -1;
            this.f13458u = aVar.f16856u;
        }

        public static C0201b i(b bVar) {
            C0201b c0201b = new C0201b();
            c0201b.l(bVar);
            return c0201b;
        }

        @Override // gu.n
        public final n.a a() {
            return i(this);
        }

        @Override // gu.n
        public final int b() {
            int i6 = this.f13463z;
            if (i6 != -1) {
                return i6;
            }
            int i10 = 0;
            if ((this.f13459v & 1) == 1) {
                i10 = 0 + CodedOutputStream.b(1, this.f13460w);
            }
            if ((this.f13459v & 2) == 2) {
                i10 += CodedOutputStream.b(2, this.f13461x);
            }
            int size = this.f13458u.size() + i10;
            this.f13463z = size;
            return size;
        }

        @Override // gu.n
        public final n.a c() {
            return new C0201b();
        }

        @Override // gu.o
        public final boolean d() {
            byte b10 = this.f13462y;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f13462y = (byte) 1;
            return true;
        }

        @Override // gu.n
        public final void f(CodedOutputStream codedOutputStream) {
            b();
            if ((this.f13459v & 1) == 1) {
                codedOutputStream.m(1, this.f13460w);
            }
            if ((this.f13459v & 2) == 2) {
                codedOutputStream.m(2, this.f13461x);
            }
            codedOutputStream.r(this.f13458u);
        }

        public b() {
            this.f13462y = (byte) -1;
            this.f13463z = -1;
            this.f13458u = gu.c.f16833u;
        }

        public b(gu.d dVar) {
            this.f13462y = (byte) -1;
            this.f13463z = -1;
            boolean z10 = false;
            this.f13460w = 0;
            this.f13461x = 0;
            c.b bVar = new c.b();
            CodedOutputStream j10 = CodedOutputStream.j(bVar, 1);
            while (!z10) {
                try {
                    try {
                        int n10 = dVar.n();
                        if (n10 != 0) {
                            if (n10 == 8) {
                                this.f13459v |= 1;
                                this.f13460w = dVar.k();
                            } else if (n10 != 16) {
                                if (!dVar.q(n10, j10)) {
                                }
                            } else {
                                this.f13459v |= 2;
                                this.f13461x = dVar.k();
                            }
                        }
                        z10 = true;
                    } catch (Throwable th2) {
                        try {
                            j10.i();
                        } catch (IOException unused) {
                        } catch (Throwable th3) {
                            this.f13458u = bVar.g();
                            throw th3;
                        }
                        this.f13458u = bVar.g();
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
                this.f13458u = bVar.g();
                throw th4;
            }
            this.f13458u = bVar.g();
        }
    }

    /* compiled from: JvmProtoBuf.java */
    /* loaded from: classes2.dex */
    public static final class c extends g implements o {
        public static final c D;
        public static final C0202a E = new C0202a();
        public b A;
        public byte B;
        public int C;

        /* renamed from: u  reason: collision with root package name */
        public final gu.c f13467u;

        /* renamed from: v  reason: collision with root package name */
        public int f13468v;

        /* renamed from: w  reason: collision with root package name */
        public C0198a f13469w;

        /* renamed from: x  reason: collision with root package name */
        public b f13470x;

        /* renamed from: y  reason: collision with root package name */
        public b f13471y;

        /* renamed from: z  reason: collision with root package name */
        public b f13472z;

        /* compiled from: JvmProtoBuf.java */
        /* renamed from: du.a$c$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static class C0202a extends gu.b<c> {
            @Override // gu.p
            public final Object a(gu.d dVar, e eVar) {
                return new c(dVar, eVar);
            }
        }

        /* compiled from: JvmProtoBuf.java */
        /* loaded from: classes2.dex */
        public static final class b extends g.a<c, b> implements o {
            public b A;

            /* renamed from: v  reason: collision with root package name */
            public int f13473v;

            /* renamed from: w  reason: collision with root package name */
            public C0198a f13474w = C0198a.A;

            /* renamed from: x  reason: collision with root package name */
            public b f13475x;

            /* renamed from: y  reason: collision with root package name */
            public b f13476y;

            /* renamed from: z  reason: collision with root package name */
            public b f13477z;

            public b() {
                b bVar = b.A;
                this.f13475x = bVar;
                this.f13476y = bVar;
                this.f13477z = bVar;
                this.A = bVar;
            }

            @Override // gu.a.AbstractC0262a, gu.n.a
            public final /* bridge */ /* synthetic */ n.a R(gu.d dVar, e eVar) {
                m(dVar, eVar);
                return this;
            }

            @Override // gu.n.a
            public final n build() {
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
            public final /* bridge */ /* synthetic */ a.AbstractC0262a h(gu.d dVar, e eVar) {
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
                int i6 = this.f13473v;
                int i10 = 1;
                if ((i6 & 1) != 1) {
                    i10 = 0;
                }
                cVar.f13469w = this.f13474w;
                if ((i6 & 2) == 2) {
                    i10 |= 2;
                }
                cVar.f13470x = this.f13475x;
                if ((i6 & 4) == 4) {
                    i10 |= 4;
                }
                cVar.f13471y = this.f13476y;
                if ((i6 & 8) == 8) {
                    i10 |= 8;
                }
                cVar.f13472z = this.f13477z;
                if ((i6 & 16) == 16) {
                    i10 |= 16;
                }
                cVar.A = this.A;
                cVar.f13468v = i10;
                return cVar;
            }

            public final void l(c cVar) {
                boolean z10;
                boolean z11;
                boolean z12;
                boolean z13;
                b bVar;
                b bVar2;
                b bVar3;
                b bVar4;
                C0198a c0198a;
                if (cVar == c.D) {
                    return;
                }
                boolean z14 = true;
                if ((cVar.f13468v & 1) == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    C0198a c0198a2 = cVar.f13469w;
                    if ((this.f13473v & 1) == 1 && (c0198a = this.f13474w) != C0198a.A) {
                        C0198a.b bVar5 = new C0198a.b();
                        bVar5.l(c0198a);
                        bVar5.l(c0198a2);
                        this.f13474w = bVar5.k();
                    } else {
                        this.f13474w = c0198a2;
                    }
                    this.f13473v |= 1;
                }
                if ((cVar.f13468v & 2) == 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    b bVar6 = cVar.f13470x;
                    if ((this.f13473v & 2) == 2 && (bVar4 = this.f13475x) != b.A) {
                        b.C0201b i6 = b.i(bVar4);
                        i6.l(bVar6);
                        this.f13475x = i6.k();
                    } else {
                        this.f13475x = bVar6;
                    }
                    this.f13473v |= 2;
                }
                if ((cVar.f13468v & 4) == 4) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    b bVar7 = cVar.f13471y;
                    if ((this.f13473v & 4) == 4 && (bVar3 = this.f13476y) != b.A) {
                        b.C0201b i10 = b.i(bVar3);
                        i10.l(bVar7);
                        this.f13476y = i10.k();
                    } else {
                        this.f13476y = bVar7;
                    }
                    this.f13473v |= 4;
                }
                if ((cVar.f13468v & 8) == 8) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z13) {
                    b bVar8 = cVar.f13472z;
                    if ((this.f13473v & 8) == 8 && (bVar2 = this.f13477z) != b.A) {
                        b.C0201b i11 = b.i(bVar2);
                        i11.l(bVar8);
                        this.f13477z = i11.k();
                    } else {
                        this.f13477z = bVar8;
                    }
                    this.f13473v |= 8;
                }
                if ((cVar.f13468v & 16) != 16) {
                    z14 = false;
                }
                if (z14) {
                    b bVar9 = cVar.A;
                    if ((this.f13473v & 16) == 16 && (bVar = this.A) != b.A) {
                        b.C0201b i12 = b.i(bVar);
                        i12.l(bVar9);
                        this.A = i12.k();
                    } else {
                        this.A = bVar9;
                    }
                    this.f13473v |= 16;
                }
                this.f16856u = this.f16856u.g(cVar.f13467u);
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001c  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void m(gu.d dVar, e eVar) {
                c cVar;
                try {
                    try {
                        c.E.getClass();
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

        static {
            c cVar = new c();
            D = cVar;
            cVar.f13469w = C0198a.A;
            b bVar = b.A;
            cVar.f13470x = bVar;
            cVar.f13471y = bVar;
            cVar.f13472z = bVar;
            cVar.A = bVar;
        }

        public c(g.a aVar) {
            super(0);
            this.B = (byte) -1;
            this.C = -1;
            this.f13467u = aVar.f16856u;
        }

        @Override // gu.n
        public final n.a a() {
            b bVar = new b();
            bVar.l(this);
            return bVar;
        }

        @Override // gu.n
        public final int b() {
            int i6 = this.C;
            if (i6 != -1) {
                return i6;
            }
            int i10 = 0;
            if ((this.f13468v & 1) == 1) {
                i10 = 0 + CodedOutputStream.d(1, this.f13469w);
            }
            if ((this.f13468v & 2) == 2) {
                i10 += CodedOutputStream.d(2, this.f13470x);
            }
            if ((this.f13468v & 4) == 4) {
                i10 += CodedOutputStream.d(3, this.f13471y);
            }
            if ((this.f13468v & 8) == 8) {
                i10 += CodedOutputStream.d(4, this.f13472z);
            }
            if ((this.f13468v & 16) == 16) {
                i10 += CodedOutputStream.d(5, this.A);
            }
            int size = this.f13467u.size() + i10;
            this.C = size;
            return size;
        }

        @Override // gu.n
        public final n.a c() {
            return new b();
        }

        @Override // gu.o
        public final boolean d() {
            byte b10 = this.B;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.B = (byte) 1;
            return true;
        }

        @Override // gu.n
        public final void f(CodedOutputStream codedOutputStream) {
            b();
            if ((this.f13468v & 1) == 1) {
                codedOutputStream.o(1, this.f13469w);
            }
            if ((this.f13468v & 2) == 2) {
                codedOutputStream.o(2, this.f13470x);
            }
            if ((this.f13468v & 4) == 4) {
                codedOutputStream.o(3, this.f13471y);
            }
            if ((this.f13468v & 8) == 8) {
                codedOutputStream.o(4, this.f13472z);
            }
            if ((this.f13468v & 16) == 16) {
                codedOutputStream.o(5, this.A);
            }
            codedOutputStream.r(this.f13467u);
        }

        public c() {
            this.B = (byte) -1;
            this.C = -1;
            this.f13467u = gu.c.f16833u;
        }

        public c(gu.d dVar, e eVar) {
            this.B = (byte) -1;
            this.C = -1;
            this.f13469w = C0198a.A;
            b bVar = b.A;
            this.f13470x = bVar;
            this.f13471y = bVar;
            this.f13472z = bVar;
            this.A = bVar;
            c.b bVar2 = new c.b();
            CodedOutputStream j10 = CodedOutputStream.j(bVar2, 1);
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        try {
                            int n10 = dVar.n();
                            if (n10 != 0) {
                                b.C0201b c0201b = null;
                                C0198a.b bVar3 = null;
                                b.C0201b c0201b2 = null;
                                b.C0201b c0201b3 = null;
                                b.C0201b c0201b4 = null;
                                if (n10 == 10) {
                                    if ((this.f13468v & 1) == 1) {
                                        C0198a c0198a = this.f13469w;
                                        c0198a.getClass();
                                        bVar3 = new C0198a.b();
                                        bVar3.l(c0198a);
                                    }
                                    C0198a c0198a2 = (C0198a) dVar.g(C0198a.B, eVar);
                                    this.f13469w = c0198a2;
                                    if (bVar3 != null) {
                                        bVar3.l(c0198a2);
                                        this.f13469w = bVar3.k();
                                    }
                                    this.f13468v |= 1;
                                } else if (n10 == 18) {
                                    if ((this.f13468v & 2) == 2) {
                                        b bVar4 = this.f13470x;
                                        bVar4.getClass();
                                        c0201b2 = b.i(bVar4);
                                    }
                                    b bVar5 = (b) dVar.g(b.B, eVar);
                                    this.f13470x = bVar5;
                                    if (c0201b2 != null) {
                                        c0201b2.l(bVar5);
                                        this.f13470x = c0201b2.k();
                                    }
                                    this.f13468v |= 2;
                                } else if (n10 == 26) {
                                    if ((this.f13468v & 4) == 4) {
                                        b bVar6 = this.f13471y;
                                        bVar6.getClass();
                                        c0201b3 = b.i(bVar6);
                                    }
                                    b bVar7 = (b) dVar.g(b.B, eVar);
                                    this.f13471y = bVar7;
                                    if (c0201b3 != null) {
                                        c0201b3.l(bVar7);
                                        this.f13471y = c0201b3.k();
                                    }
                                    this.f13468v |= 4;
                                } else if (n10 == 34) {
                                    if ((this.f13468v & 8) == 8) {
                                        b bVar8 = this.f13472z;
                                        bVar8.getClass();
                                        c0201b4 = b.i(bVar8);
                                    }
                                    b bVar9 = (b) dVar.g(b.B, eVar);
                                    this.f13472z = bVar9;
                                    if (c0201b4 != null) {
                                        c0201b4.l(bVar9);
                                        this.f13472z = c0201b4.k();
                                    }
                                    this.f13468v |= 8;
                                } else if (n10 != 42) {
                                    if (!dVar.q(n10, j10)) {
                                    }
                                } else {
                                    if ((this.f13468v & 16) == 16) {
                                        b bVar10 = this.A;
                                        bVar10.getClass();
                                        c0201b = b.i(bVar10);
                                    }
                                    b bVar11 = (b) dVar.g(b.B, eVar);
                                    this.A = bVar11;
                                    if (c0201b != null) {
                                        c0201b.l(bVar11);
                                        this.A = c0201b.k();
                                    }
                                    this.f13468v |= 16;
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
                    try {
                        j10.i();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f13467u = bVar2.g();
                        throw th3;
                    }
                    this.f13467u = bVar2.g();
                    throw th2;
                }
            }
            try {
                j10.i();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f13467u = bVar2.g();
                throw th4;
            }
            this.f13467u = bVar2.g();
        }
    }

    /* compiled from: JvmProtoBuf.java */
    /* loaded from: classes2.dex */
    public static final class d extends g implements o {
        public static final d A;
        public static final C0203a B = new C0203a();

        /* renamed from: u  reason: collision with root package name */
        public final gu.c f13478u;

        /* renamed from: v  reason: collision with root package name */
        public List<c> f13479v;

        /* renamed from: w  reason: collision with root package name */
        public List<Integer> f13480w;

        /* renamed from: x  reason: collision with root package name */
        public int f13481x;

        /* renamed from: y  reason: collision with root package name */
        public byte f13482y;

        /* renamed from: z  reason: collision with root package name */
        public int f13483z;

        /* compiled from: JvmProtoBuf.java */
        /* renamed from: du.a$d$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static class C0203a extends gu.b<d> {
            @Override // gu.p
            public final Object a(gu.d dVar, e eVar) {
                return new d(dVar, eVar);
            }
        }

        /* compiled from: JvmProtoBuf.java */
        /* loaded from: classes2.dex */
        public static final class b extends g.a<d, b> implements o {

            /* renamed from: v  reason: collision with root package name */
            public int f13484v;

            /* renamed from: w  reason: collision with root package name */
            public List<c> f13485w = Collections.emptyList();

            /* renamed from: x  reason: collision with root package name */
            public List<Integer> f13486x = Collections.emptyList();

            @Override // gu.a.AbstractC0262a, gu.n.a
            public final /* bridge */ /* synthetic */ n.a R(gu.d dVar, e eVar) {
                m(dVar, eVar);
                return this;
            }

            @Override // gu.n.a
            public final n build() {
                d k10 = k();
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
            public final /* bridge */ /* synthetic */ a.AbstractC0262a h(gu.d dVar, e eVar) {
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
            public final /* bridge */ /* synthetic */ b j(d dVar) {
                l(dVar);
                return this;
            }

            public final d k() {
                d dVar = new d(this);
                if ((this.f13484v & 1) == 1) {
                    this.f13485w = Collections.unmodifiableList(this.f13485w);
                    this.f13484v &= -2;
                }
                dVar.f13479v = this.f13485w;
                if ((this.f13484v & 2) == 2) {
                    this.f13486x = Collections.unmodifiableList(this.f13486x);
                    this.f13484v &= -3;
                }
                dVar.f13480w = this.f13486x;
                return dVar;
            }

            public final void l(d dVar) {
                if (dVar == d.A) {
                    return;
                }
                if (!dVar.f13479v.isEmpty()) {
                    if (this.f13485w.isEmpty()) {
                        this.f13485w = dVar.f13479v;
                        this.f13484v &= -2;
                    } else {
                        if ((this.f13484v & 1) != 1) {
                            this.f13485w = new ArrayList(this.f13485w);
                            this.f13484v |= 1;
                        }
                        this.f13485w.addAll(dVar.f13479v);
                    }
                }
                if (!dVar.f13480w.isEmpty()) {
                    if (this.f13486x.isEmpty()) {
                        this.f13486x = dVar.f13480w;
                        this.f13484v &= -3;
                    } else {
                        if ((this.f13484v & 2) != 2) {
                            this.f13486x = new ArrayList(this.f13486x);
                            this.f13484v |= 2;
                        }
                        this.f13486x.addAll(dVar.f13480w);
                    }
                }
                this.f16856u = this.f16856u.g(dVar.f13478u);
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001c  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void m(gu.d dVar, e eVar) {
                d dVar2;
                try {
                    try {
                        d.B.getClass();
                        l(new d(dVar, eVar));
                    } catch (Throwable th2) {
                        th = th2;
                        dVar2 = null;
                        if (dVar2 != null) {
                            l(dVar2);
                        }
                        throw th;
                    }
                } catch (InvalidProtocolBufferException e10) {
                    dVar2 = (d) e10.f23476u;
                    try {
                        throw e10;
                    } catch (Throwable th3) {
                        th = th3;
                        if (dVar2 != null) {
                        }
                        throw th;
                    }
                }
            }
        }

        static {
            d dVar = new d();
            A = dVar;
            dVar.f13479v = Collections.emptyList();
            dVar.f13480w = Collections.emptyList();
        }

        public d(g.a aVar) {
            super(0);
            this.f13481x = -1;
            this.f13482y = (byte) -1;
            this.f13483z = -1;
            this.f13478u = aVar.f16856u;
        }

        @Override // gu.n
        public final n.a a() {
            b bVar = new b();
            bVar.l(this);
            return bVar;
        }

        @Override // gu.n
        public final int b() {
            int i6 = this.f13483z;
            if (i6 != -1) {
                return i6;
            }
            int i10 = 0;
            for (int i11 = 0; i11 < this.f13479v.size(); i11++) {
                i10 += CodedOutputStream.d(1, this.f13479v.get(i11));
            }
            int i12 = 0;
            for (int i13 = 0; i13 < this.f13480w.size(); i13++) {
                i12 += CodedOutputStream.c(this.f13480w.get(i13).intValue());
            }
            int i14 = i10 + i12;
            if (!this.f13480w.isEmpty()) {
                i14 = i14 + 1 + CodedOutputStream.c(i12);
            }
            this.f13481x = i12;
            int size = this.f13478u.size() + i14;
            this.f13483z = size;
            return size;
        }

        @Override // gu.n
        public final n.a c() {
            return new b();
        }

        @Override // gu.o
        public final boolean d() {
            byte b10 = this.f13482y;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f13482y = (byte) 1;
            return true;
        }

        @Override // gu.n
        public final void f(CodedOutputStream codedOutputStream) {
            b();
            for (int i6 = 0; i6 < this.f13479v.size(); i6++) {
                codedOutputStream.o(1, this.f13479v.get(i6));
            }
            if (this.f13480w.size() > 0) {
                codedOutputStream.v(42);
                codedOutputStream.v(this.f13481x);
            }
            for (int i10 = 0; i10 < this.f13480w.size(); i10++) {
                codedOutputStream.n(this.f13480w.get(i10).intValue());
            }
            codedOutputStream.r(this.f13478u);
        }

        /* compiled from: JvmProtoBuf.java */
        /* loaded from: classes2.dex */
        public static final class c extends g implements o {
            public static final c G;
            public static final C0204a H = new C0204a();
            public List<Integer> A;
            public int B;
            public List<Integer> C;
            public int D;
            public byte E;
            public int F;

            /* renamed from: u  reason: collision with root package name */
            public final gu.c f13487u;

            /* renamed from: v  reason: collision with root package name */
            public int f13488v;

            /* renamed from: w  reason: collision with root package name */
            public int f13489w;

            /* renamed from: x  reason: collision with root package name */
            public int f13490x;

            /* renamed from: y  reason: collision with root package name */
            public Object f13491y;

            /* renamed from: z  reason: collision with root package name */
            public EnumC0205c f13492z;

            /* compiled from: JvmProtoBuf.java */
            /* renamed from: du.a$d$c$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static class C0204a extends gu.b<c> {
                @Override // gu.p
                public final Object a(gu.d dVar, e eVar) {
                    return new c(dVar);
                }
            }

            /* compiled from: JvmProtoBuf.java */
            /* loaded from: classes2.dex */
            public static final class b extends g.a<c, b> implements o {

                /* renamed from: v  reason: collision with root package name */
                public int f13493v;

                /* renamed from: x  reason: collision with root package name */
                public int f13495x;

                /* renamed from: w  reason: collision with root package name */
                public int f13494w = 1;

                /* renamed from: y  reason: collision with root package name */
                public Object f13496y = "";

                /* renamed from: z  reason: collision with root package name */
                public EnumC0205c f13497z = EnumC0205c.NONE;
                public List<Integer> A = Collections.emptyList();
                public List<Integer> B = Collections.emptyList();

                @Override // gu.a.AbstractC0262a, gu.n.a
                public final /* bridge */ /* synthetic */ n.a R(gu.d dVar, e eVar) {
                    m(dVar, eVar);
                    return this;
                }

                @Override // gu.n.a
                public final n build() {
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
                public final /* bridge */ /* synthetic */ a.AbstractC0262a h(gu.d dVar, e eVar) {
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
                    int i6 = this.f13493v;
                    int i10 = 1;
                    if ((i6 & 1) != 1) {
                        i10 = 0;
                    }
                    cVar.f13489w = this.f13494w;
                    if ((i6 & 2) == 2) {
                        i10 |= 2;
                    }
                    cVar.f13490x = this.f13495x;
                    if ((i6 & 4) == 4) {
                        i10 |= 4;
                    }
                    cVar.f13491y = this.f13496y;
                    if ((i6 & 8) == 8) {
                        i10 |= 8;
                    }
                    cVar.f13492z = this.f13497z;
                    if ((i6 & 16) == 16) {
                        this.A = Collections.unmodifiableList(this.A);
                        this.f13493v &= -17;
                    }
                    cVar.A = this.A;
                    if ((this.f13493v & 32) == 32) {
                        this.B = Collections.unmodifiableList(this.B);
                        this.f13493v &= -33;
                    }
                    cVar.C = this.B;
                    cVar.f13488v = i10;
                    return cVar;
                }

                public final void l(c cVar) {
                    boolean z10;
                    boolean z11;
                    boolean z12;
                    if (cVar == c.G) {
                        return;
                    }
                    int i6 = cVar.f13488v;
                    boolean z13 = false;
                    if ((i6 & 1) == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        int i10 = cVar.f13489w;
                        this.f13493v |= 1;
                        this.f13494w = i10;
                    }
                    if ((i6 & 2) == 2) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        int i11 = cVar.f13490x;
                        this.f13493v = 2 | this.f13493v;
                        this.f13495x = i11;
                    }
                    if ((i6 & 4) == 4) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        this.f13493v |= 4;
                        this.f13496y = cVar.f13491y;
                    }
                    if ((i6 & 8) == 8) {
                        z13 = true;
                    }
                    if (z13) {
                        EnumC0205c enumC0205c = cVar.f13492z;
                        enumC0205c.getClass();
                        this.f13493v = 8 | this.f13493v;
                        this.f13497z = enumC0205c;
                    }
                    if (!cVar.A.isEmpty()) {
                        if (this.A.isEmpty()) {
                            this.A = cVar.A;
                            this.f13493v &= -17;
                        } else {
                            if ((this.f13493v & 16) != 16) {
                                this.A = new ArrayList(this.A);
                                this.f13493v |= 16;
                            }
                            this.A.addAll(cVar.A);
                        }
                    }
                    if (!cVar.C.isEmpty()) {
                        if (this.B.isEmpty()) {
                            this.B = cVar.C;
                            this.f13493v &= -33;
                        } else {
                            if ((this.f13493v & 32) != 32) {
                                this.B = new ArrayList(this.B);
                                this.f13493v |= 32;
                            }
                            this.B.addAll(cVar.C);
                        }
                    }
                    this.f16856u = this.f16856u.g(cVar.f13487u);
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x001c  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void m(gu.d dVar, e eVar) {
                    c cVar;
                    try {
                        try {
                            c.H.getClass();
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

            /* compiled from: JvmProtoBuf.java */
            /* renamed from: du.a$d$c$c  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public enum EnumC0205c implements h.a {
                NONE(0),
                INTERNAL_TO_CLASS_ID(1),
                DESC_TO_CLASS_ID(2);
                

                /* renamed from: u  reason: collision with root package name */
                public final int f13502u;

                EnumC0205c(int i6) {
                    this.f13502u = i6;
                }

                @Override // gu.h.a
                public final int e() {
                    return this.f13502u;
                }
            }

            static {
                c cVar = new c();
                G = cVar;
                cVar.f13489w = 1;
                cVar.f13490x = 0;
                cVar.f13491y = "";
                cVar.f13492z = EnumC0205c.NONE;
                cVar.A = Collections.emptyList();
                cVar.C = Collections.emptyList();
            }

            public c(g.a aVar) {
                super(0);
                this.B = -1;
                this.D = -1;
                this.E = (byte) -1;
                this.F = -1;
                this.f13487u = aVar.f16856u;
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
                gu.c cVar;
                int i10 = this.F;
                if (i10 != -1) {
                    return i10;
                }
                if ((this.f13488v & 1) == 1) {
                    i6 = CodedOutputStream.b(1, this.f13489w) + 0;
                } else {
                    i6 = 0;
                }
                if ((this.f13488v & 2) == 2) {
                    i6 += CodedOutputStream.b(2, this.f13490x);
                }
                if ((this.f13488v & 8) == 8) {
                    i6 += CodedOutputStream.a(3, this.f13492z.f13502u);
                }
                int i11 = 0;
                for (int i12 = 0; i12 < this.A.size(); i12++) {
                    i11 += CodedOutputStream.c(this.A.get(i12).intValue());
                }
                int i13 = i6 + i11;
                if (!this.A.isEmpty()) {
                    i13 = i13 + 1 + CodedOutputStream.c(i11);
                }
                this.B = i11;
                int i14 = 0;
                for (int i15 = 0; i15 < this.C.size(); i15++) {
                    i14 += CodedOutputStream.c(this.C.get(i15).intValue());
                }
                int i16 = i13 + i14;
                if (!this.C.isEmpty()) {
                    i16 = i16 + 1 + CodedOutputStream.c(i14);
                }
                this.D = i14;
                if ((this.f13488v & 4) == 4) {
                    Object obj = this.f13491y;
                    if (obj instanceof String) {
                        try {
                            cVar = new gu.m(((String) obj).getBytes("UTF-8"));
                            this.f13491y = cVar;
                        } catch (UnsupportedEncodingException e10) {
                            throw new RuntimeException("UTF-8 not supported?", e10);
                        }
                    } else {
                        cVar = (gu.c) obj;
                    }
                    i16 += cVar.size() + CodedOutputStream.f(cVar.size()) + CodedOutputStream.h(6);
                }
                int size = this.f13487u.size() + i16;
                this.F = size;
                return size;
            }

            @Override // gu.n
            public final n.a c() {
                return new b();
            }

            @Override // gu.o
            public final boolean d() {
                byte b10 = this.E;
                if (b10 == 1) {
                    return true;
                }
                if (b10 == 0) {
                    return false;
                }
                this.E = (byte) 1;
                return true;
            }

            @Override // gu.n
            public final void f(CodedOutputStream codedOutputStream) {
                gu.c cVar;
                b();
                if ((this.f13488v & 1) == 1) {
                    codedOutputStream.m(1, this.f13489w);
                }
                if ((this.f13488v & 2) == 2) {
                    codedOutputStream.m(2, this.f13490x);
                }
                if ((this.f13488v & 8) == 8) {
                    codedOutputStream.l(3, this.f13492z.f13502u);
                }
                if (this.A.size() > 0) {
                    codedOutputStream.v(34);
                    codedOutputStream.v(this.B);
                }
                for (int i6 = 0; i6 < this.A.size(); i6++) {
                    codedOutputStream.n(this.A.get(i6).intValue());
                }
                if (this.C.size() > 0) {
                    codedOutputStream.v(42);
                    codedOutputStream.v(this.D);
                }
                for (int i10 = 0; i10 < this.C.size(); i10++) {
                    codedOutputStream.n(this.C.get(i10).intValue());
                }
                if ((this.f13488v & 4) == 4) {
                    Object obj = this.f13491y;
                    if (obj instanceof String) {
                        try {
                            cVar = new gu.m(((String) obj).getBytes("UTF-8"));
                            this.f13491y = cVar;
                        } catch (UnsupportedEncodingException e10) {
                            throw new RuntimeException("UTF-8 not supported?", e10);
                        }
                    } else {
                        cVar = (gu.c) obj;
                    }
                    codedOutputStream.x(6, 2);
                    codedOutputStream.v(cVar.size());
                    codedOutputStream.r(cVar);
                }
                codedOutputStream.r(this.f13487u);
            }

            public c() {
                this.B = -1;
                this.D = -1;
                this.E = (byte) -1;
                this.F = -1;
                this.f13487u = gu.c.f16833u;
            }

            public c(gu.d dVar) {
                EnumC0205c enumC0205c;
                this.B = -1;
                this.D = -1;
                this.E = (byte) -1;
                this.F = -1;
                this.f13489w = 1;
                boolean z10 = false;
                this.f13490x = 0;
                this.f13491y = "";
                EnumC0205c enumC0205c2 = EnumC0205c.NONE;
                this.f13492z = enumC0205c2;
                this.A = Collections.emptyList();
                this.C = Collections.emptyList();
                CodedOutputStream j10 = CodedOutputStream.j(new c.b(), 1);
                boolean z11 = false;
                while (!z10) {
                    try {
                        try {
                            int n10 = dVar.n();
                            if (n10 != 0) {
                                if (n10 == 8) {
                                    this.f13488v |= 1;
                                    this.f13489w = dVar.k();
                                } else if (n10 == 16) {
                                    this.f13488v |= 2;
                                    this.f13490x = dVar.k();
                                } else if (n10 == 24) {
                                    int k10 = dVar.k();
                                    if (k10 == 0) {
                                        enumC0205c = enumC0205c2;
                                    } else if (k10 != 1) {
                                        enumC0205c = k10 != 2 ? null : EnumC0205c.DESC_TO_CLASS_ID;
                                    } else {
                                        enumC0205c = EnumC0205c.INTERNAL_TO_CLASS_ID;
                                    }
                                    if (enumC0205c == null) {
                                        j10.v(n10);
                                        j10.v(k10);
                                    } else {
                                        this.f13488v |= 8;
                                        this.f13492z = enumC0205c;
                                    }
                                } else if (n10 == 32) {
                                    if (!(z11 & true)) {
                                        this.A = new ArrayList();
                                        z11 |= true;
                                    }
                                    this.A.add(Integer.valueOf(dVar.k()));
                                } else if (n10 == 34) {
                                    int d10 = dVar.d(dVar.k());
                                    if (!(z11 & true) && dVar.b() > 0) {
                                        this.A = new ArrayList();
                                        z11 |= true;
                                    }
                                    while (dVar.b() > 0) {
                                        this.A.add(Integer.valueOf(dVar.k()));
                                    }
                                    dVar.c(d10);
                                } else if (n10 == 40) {
                                    if (!(z11 & true)) {
                                        this.C = new ArrayList();
                                        z11 |= true;
                                    }
                                    this.C.add(Integer.valueOf(dVar.k()));
                                } else if (n10 == 42) {
                                    int d11 = dVar.d(dVar.k());
                                    if (!(z11 & true) && dVar.b() > 0) {
                                        this.C = new ArrayList();
                                        z11 |= true;
                                    }
                                    while (dVar.b() > 0) {
                                        this.C.add(Integer.valueOf(dVar.k()));
                                    }
                                    dVar.c(d11);
                                } else if (n10 != 50) {
                                    if (!dVar.q(n10, j10)) {
                                    }
                                } else {
                                    gu.m e10 = dVar.e();
                                    this.f13488v |= 4;
                                    this.f13491y = e10;
                                }
                            }
                            z10 = true;
                        } catch (Throwable th2) {
                            if (z11 & true) {
                                this.A = Collections.unmodifiableList(this.A);
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
                    } catch (InvalidProtocolBufferException e11) {
                        e11.f23476u = this;
                        throw e11;
                    } catch (IOException e12) {
                        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e12.getMessage());
                        invalidProtocolBufferException.f23476u = this;
                        throw invalidProtocolBufferException;
                    }
                }
                if (z11 & true) {
                    this.A = Collections.unmodifiableList(this.A);
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

        public d() {
            this.f13481x = -1;
            this.f13482y = (byte) -1;
            this.f13483z = -1;
            this.f13478u = gu.c.f16833u;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public d(gu.d dVar, e eVar) {
            this.f13481x = -1;
            this.f13482y = (byte) -1;
            this.f13483z = -1;
            this.f13479v = Collections.emptyList();
            this.f13480w = Collections.emptyList();
            CodedOutputStream j10 = CodedOutputStream.j(new c.b(), 1);
            boolean z10 = false;
            boolean z11 = false;
            while (!z10) {
                try {
                    try {
                        int n10 = dVar.n();
                        if (n10 != 0) {
                            if (n10 == 10) {
                                if (!(z11 & true)) {
                                    this.f13479v = new ArrayList();
                                    z11 |= true;
                                }
                                this.f13479v.add(dVar.g(c.H, eVar));
                            } else if (n10 == 40) {
                                if (!(z11 & true)) {
                                    this.f13480w = new ArrayList();
                                    z11 |= true;
                                }
                                this.f13480w.add(Integer.valueOf(dVar.k()));
                            } else if (n10 != 42) {
                                if (!dVar.q(n10, j10)) {
                                }
                            } else {
                                int d10 = dVar.d(dVar.k());
                                if (!(z11 & true) && dVar.b() > 0) {
                                    this.f13480w = new ArrayList();
                                    z11 |= true;
                                }
                                while (dVar.b() > 0) {
                                    this.f13480w.add(Integer.valueOf(dVar.k()));
                                }
                                dVar.c(d10);
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
                        this.f13479v = Collections.unmodifiableList(this.f13479v);
                    }
                    if (z11 & true) {
                        this.f13480w = Collections.unmodifiableList(this.f13480w);
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
                this.f13479v = Collections.unmodifiableList(this.f13479v);
            }
            if (z11 & true) {
                this.f13480w = Collections.unmodifiableList(this.f13480w);
            }
            try {
                j10.i();
            } catch (IOException unused2) {
            } finally {
            }
        }
    }
}
