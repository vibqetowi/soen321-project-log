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
public final class s extends gu.g implements gu.o {
    public static final s A;
    public static final a B = new a();

    /* renamed from: u  reason: collision with root package name */
    public final gu.c f3851u;

    /* renamed from: v  reason: collision with root package name */
    public int f3852v;

    /* renamed from: w  reason: collision with root package name */
    public List<p> f3853w;

    /* renamed from: x  reason: collision with root package name */
    public int f3854x;

    /* renamed from: y  reason: collision with root package name */
    public byte f3855y;

    /* renamed from: z  reason: collision with root package name */
    public int f3856z;

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes2.dex */
    public static class a extends gu.b<s> {
        @Override // gu.p
        public final Object a(gu.d dVar, gu.e eVar) {
            return new s(dVar, eVar);
        }
    }

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes2.dex */
    public static final class b extends g.a<s, b> implements gu.o {

        /* renamed from: v  reason: collision with root package name */
        public int f3857v;

        /* renamed from: w  reason: collision with root package name */
        public List<p> f3858w = Collections.emptyList();

        /* renamed from: x  reason: collision with root package name */
        public int f3859x = -1;

        @Override // gu.a.AbstractC0262a, gu.n.a
        public final /* bridge */ /* synthetic */ n.a R(gu.d dVar, gu.e eVar) {
            m(dVar, eVar);
            return this;
        }

        @Override // gu.n.a
        public final gu.n build() {
            s k10 = k();
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
        public final /* bridge */ /* synthetic */ b j(s sVar) {
            l(sVar);
            return this;
        }

        public final s k() {
            s sVar = new s(this);
            int i6 = this.f3857v;
            int i10 = 1;
            if ((i6 & 1) == 1) {
                this.f3858w = Collections.unmodifiableList(this.f3858w);
                this.f3857v &= -2;
            }
            sVar.f3853w = this.f3858w;
            if ((i6 & 2) != 2) {
                i10 = 0;
            }
            sVar.f3854x = this.f3859x;
            sVar.f3852v = i10;
            return sVar;
        }

        public final void l(s sVar) {
            if (sVar == s.A) {
                return;
            }
            boolean z10 = true;
            if (!sVar.f3853w.isEmpty()) {
                if (this.f3858w.isEmpty()) {
                    this.f3858w = sVar.f3853w;
                    this.f3857v &= -2;
                } else {
                    if ((this.f3857v & 1) != 1) {
                        this.f3858w = new ArrayList(this.f3858w);
                        this.f3857v |= 1;
                    }
                    this.f3858w.addAll(sVar.f3853w);
                }
            }
            if ((sVar.f3852v & 1) != 1) {
                z10 = false;
            }
            if (z10) {
                int i6 = sVar.f3854x;
                this.f3857v |= 2;
                this.f3859x = i6;
            }
            this.f16856u = this.f16856u.g(sVar.f3851u);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void m(gu.d dVar, gu.e eVar) {
            s sVar;
            try {
                try {
                    s.B.getClass();
                    l(new s(dVar, eVar));
                } catch (Throwable th2) {
                    th = th2;
                    sVar = null;
                    if (sVar != null) {
                        l(sVar);
                    }
                    throw th;
                }
            } catch (InvalidProtocolBufferException e10) {
                sVar = (s) e10.f23476u;
                try {
                    throw e10;
                } catch (Throwable th3) {
                    th = th3;
                    if (sVar != null) {
                    }
                    throw th;
                }
            }
        }
    }

    static {
        s sVar = new s();
        A = sVar;
        sVar.f3853w = Collections.emptyList();
        sVar.f3854x = -1;
    }

    public s(g.a aVar) {
        super(0);
        this.f3855y = (byte) -1;
        this.f3856z = -1;
        this.f3851u = aVar.f16856u;
    }

    public static b i(s sVar) {
        b bVar = new b();
        bVar.l(sVar);
        return bVar;
    }

    @Override // gu.n
    public final n.a a() {
        return i(this);
    }

    @Override // gu.n
    public final int b() {
        int i6 = this.f3856z;
        if (i6 != -1) {
            return i6;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.f3853w.size(); i11++) {
            i10 += CodedOutputStream.d(1, this.f3853w.get(i11));
        }
        if ((this.f3852v & 1) == 1) {
            i10 += CodedOutputStream.b(2, this.f3854x);
        }
        int size = this.f3851u.size() + i10;
        this.f3856z = size;
        return size;
    }

    @Override // gu.n
    public final n.a c() {
        return new b();
    }

    @Override // gu.o
    public final boolean d() {
        byte b10 = this.f3855y;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i6 = 0; i6 < this.f3853w.size(); i6++) {
            if (!this.f3853w.get(i6).d()) {
                this.f3855y = (byte) 0;
                return false;
            }
        }
        this.f3855y = (byte) 1;
        return true;
    }

    @Override // gu.n
    public final void f(CodedOutputStream codedOutputStream) {
        b();
        for (int i6 = 0; i6 < this.f3853w.size(); i6++) {
            codedOutputStream.o(1, this.f3853w.get(i6));
        }
        if ((this.f3852v & 1) == 1) {
            codedOutputStream.m(2, this.f3854x);
        }
        codedOutputStream.r(this.f3851u);
    }

    public final b j() {
        return i(this);
    }

    public s() {
        this.f3855y = (byte) -1;
        this.f3856z = -1;
        this.f3851u = gu.c.f16833u;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public s(gu.d dVar, gu.e eVar) {
        this.f3855y = (byte) -1;
        this.f3856z = -1;
        this.f3853w = Collections.emptyList();
        this.f3854x = -1;
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
                                this.f3853w = new ArrayList();
                                z11 |= true;
                            }
                            this.f3853w.add(dVar.g(p.O, eVar));
                        } else if (n10 != 16) {
                            if (!dVar.q(n10, j10)) {
                            }
                        } else {
                            this.f3852v |= 1;
                            this.f3854x = dVar.k();
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
                    this.f3853w = Collections.unmodifiableList(this.f3853w);
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
            this.f3853w = Collections.unmodifiableList(this.f3853w);
        }
        try {
            j10.i();
        } catch (IOException unused2) {
        } finally {
        }
    }
}
