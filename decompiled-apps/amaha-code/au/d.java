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
public final class d extends gu.g implements gu.o {

    /* renamed from: y  reason: collision with root package name */
    public static final d f3687y;

    /* renamed from: z  reason: collision with root package name */
    public static final a f3688z = new a();

    /* renamed from: u  reason: collision with root package name */
    public final gu.c f3689u;

    /* renamed from: v  reason: collision with root package name */
    public List<e> f3690v;

    /* renamed from: w  reason: collision with root package name */
    public byte f3691w;

    /* renamed from: x  reason: collision with root package name */
    public int f3692x;

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes2.dex */
    public static class a extends gu.b<d> {
        @Override // gu.p
        public final Object a(gu.d dVar, gu.e eVar) {
            return new d(dVar, eVar);
        }
    }

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes2.dex */
    public static final class b extends g.a<d, b> implements gu.o {

        /* renamed from: v  reason: collision with root package name */
        public int f3693v;

        /* renamed from: w  reason: collision with root package name */
        public List<e> f3694w = Collections.emptyList();

        @Override // gu.a.AbstractC0262a, gu.n.a
        public final /* bridge */ /* synthetic */ n.a R(gu.d dVar, gu.e eVar) {
            m(dVar, eVar);
            return this;
        }

        @Override // gu.n.a
        public final gu.n build() {
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
        public final /* bridge */ /* synthetic */ b j(d dVar) {
            l(dVar);
            return this;
        }

        public final d k() {
            d dVar = new d(this);
            if ((this.f3693v & 1) == 1) {
                this.f3694w = Collections.unmodifiableList(this.f3694w);
                this.f3693v &= -2;
            }
            dVar.f3690v = this.f3694w;
            return dVar;
        }

        public final void l(d dVar) {
            if (dVar == d.f3687y) {
                return;
            }
            if (!dVar.f3690v.isEmpty()) {
                if (this.f3694w.isEmpty()) {
                    this.f3694w = dVar.f3690v;
                    this.f3693v &= -2;
                } else {
                    if ((this.f3693v & 1) != 1) {
                        this.f3694w = new ArrayList(this.f3694w);
                        this.f3693v |= 1;
                    }
                    this.f3694w.addAll(dVar.f3690v);
                }
            }
            this.f16856u = this.f16856u.g(dVar.f3689u);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void m(gu.d dVar, gu.e eVar) {
            d dVar2;
            try {
                try {
                    d.f3688z.getClass();
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
        f3687y = dVar;
        dVar.f3690v = Collections.emptyList();
    }

    public d(g.a aVar) {
        super(0);
        this.f3691w = (byte) -1;
        this.f3692x = -1;
        this.f3689u = aVar.f16856u;
    }

    @Override // gu.n
    public final n.a a() {
        b bVar = new b();
        bVar.l(this);
        return bVar;
    }

    @Override // gu.n
    public final int b() {
        int i6 = this.f3692x;
        if (i6 != -1) {
            return i6;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.f3690v.size(); i11++) {
            i10 += CodedOutputStream.d(1, this.f3690v.get(i11));
        }
        int size = this.f3689u.size() + i10;
        this.f3692x = size;
        return size;
    }

    @Override // gu.n
    public final n.a c() {
        return new b();
    }

    @Override // gu.o
    public final boolean d() {
        byte b10 = this.f3691w;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i6 = 0; i6 < this.f3690v.size(); i6++) {
            if (!this.f3690v.get(i6).d()) {
                this.f3691w = (byte) 0;
                return false;
            }
        }
        this.f3691w = (byte) 1;
        return true;
    }

    @Override // gu.n
    public final void f(CodedOutputStream codedOutputStream) {
        b();
        for (int i6 = 0; i6 < this.f3690v.size(); i6++) {
            codedOutputStream.o(1, this.f3690v.get(i6));
        }
        codedOutputStream.r(this.f3689u);
    }

    public d() {
        this.f3691w = (byte) -1;
        this.f3692x = -1;
        this.f3689u = gu.c.f16833u;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(gu.d dVar, gu.e eVar) {
        this.f3691w = (byte) -1;
        this.f3692x = -1;
        this.f3690v = Collections.emptyList();
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
                                this.f3690v = new ArrayList();
                                z11 |= true;
                            }
                            this.f3690v.add(dVar.g(e.D, eVar));
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
                    this.f3690v = Collections.unmodifiableList(this.f3690v);
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
            this.f3690v = Collections.unmodifiableList(this.f3690v);
        }
        try {
            j10.i();
        } catch (IOException unused2) {
        } finally {
        }
    }
}
