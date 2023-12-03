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
public final class v extends gu.g implements gu.o {

    /* renamed from: y  reason: collision with root package name */
    public static final v f3889y;

    /* renamed from: z  reason: collision with root package name */
    public static final a f3890z = new a();

    /* renamed from: u  reason: collision with root package name */
    public final gu.c f3891u;

    /* renamed from: v  reason: collision with root package name */
    public List<u> f3892v;

    /* renamed from: w  reason: collision with root package name */
    public byte f3893w;

    /* renamed from: x  reason: collision with root package name */
    public int f3894x;

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes2.dex */
    public static class a extends gu.b<v> {
        @Override // gu.p
        public final Object a(gu.d dVar, gu.e eVar) {
            return new v(dVar, eVar);
        }
    }

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes2.dex */
    public static final class b extends g.a<v, b> implements gu.o {

        /* renamed from: v  reason: collision with root package name */
        public int f3895v;

        /* renamed from: w  reason: collision with root package name */
        public List<u> f3896w = Collections.emptyList();

        @Override // gu.a.AbstractC0262a, gu.n.a
        public final /* bridge */ /* synthetic */ n.a R(gu.d dVar, gu.e eVar) {
            m(dVar, eVar);
            return this;
        }

        @Override // gu.n.a
        public final gu.n build() {
            v k10 = k();
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
        public final /* bridge */ /* synthetic */ b j(v vVar) {
            l(vVar);
            return this;
        }

        public final v k() {
            v vVar = new v(this);
            if ((this.f3895v & 1) == 1) {
                this.f3896w = Collections.unmodifiableList(this.f3896w);
                this.f3895v &= -2;
            }
            vVar.f3892v = this.f3896w;
            return vVar;
        }

        public final void l(v vVar) {
            if (vVar == v.f3889y) {
                return;
            }
            if (!vVar.f3892v.isEmpty()) {
                if (this.f3896w.isEmpty()) {
                    this.f3896w = vVar.f3892v;
                    this.f3895v &= -2;
                } else {
                    if ((this.f3895v & 1) != 1) {
                        this.f3896w = new ArrayList(this.f3896w);
                        this.f3895v |= 1;
                    }
                    this.f3896w.addAll(vVar.f3892v);
                }
            }
            this.f16856u = this.f16856u.g(vVar.f3891u);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void m(gu.d dVar, gu.e eVar) {
            v vVar;
            try {
                try {
                    v.f3890z.getClass();
                    l(new v(dVar, eVar));
                } catch (Throwable th2) {
                    th = th2;
                    vVar = null;
                    if (vVar != null) {
                        l(vVar);
                    }
                    throw th;
                }
            } catch (InvalidProtocolBufferException e10) {
                vVar = (v) e10.f23476u;
                try {
                    throw e10;
                } catch (Throwable th3) {
                    th = th3;
                    if (vVar != null) {
                    }
                    throw th;
                }
            }
        }
    }

    static {
        v vVar = new v();
        f3889y = vVar;
        vVar.f3892v = Collections.emptyList();
    }

    public v(g.a aVar) {
        super(0);
        this.f3893w = (byte) -1;
        this.f3894x = -1;
        this.f3891u = aVar.f16856u;
    }

    @Override // gu.n
    public final n.a a() {
        b bVar = new b();
        bVar.l(this);
        return bVar;
    }

    @Override // gu.n
    public final int b() {
        int i6 = this.f3894x;
        if (i6 != -1) {
            return i6;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.f3892v.size(); i11++) {
            i10 += CodedOutputStream.d(1, this.f3892v.get(i11));
        }
        int size = this.f3891u.size() + i10;
        this.f3894x = size;
        return size;
    }

    @Override // gu.n
    public final n.a c() {
        return new b();
    }

    @Override // gu.o
    public final boolean d() {
        byte b10 = this.f3893w;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        this.f3893w = (byte) 1;
        return true;
    }

    @Override // gu.n
    public final void f(CodedOutputStream codedOutputStream) {
        b();
        for (int i6 = 0; i6 < this.f3892v.size(); i6++) {
            codedOutputStream.o(1, this.f3892v.get(i6));
        }
        codedOutputStream.r(this.f3891u);
    }

    public v() {
        this.f3893w = (byte) -1;
        this.f3894x = -1;
        this.f3891u = gu.c.f16833u;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public v(gu.d dVar, gu.e eVar) {
        this.f3893w = (byte) -1;
        this.f3894x = -1;
        this.f3892v = Collections.emptyList();
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
                                this.f3892v = new ArrayList();
                                z11 |= true;
                            }
                            this.f3892v.add(dVar.g(u.F, eVar));
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
                    this.f3892v = Collections.unmodifiableList(this.f3892v);
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
            this.f3892v = Collections.unmodifiableList(this.f3892v);
        }
        try {
            j10.i();
        } catch (IOException unused2) {
        } finally {
        }
    }
}
