package au;

import androidx.recyclerview.widget.k;
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
public final class f extends g.c<f> {
    public static final f A;
    public static final a B = new a();

    /* renamed from: v  reason: collision with root package name */
    public final gu.c f3716v;

    /* renamed from: w  reason: collision with root package name */
    public int f3717w;

    /* renamed from: x  reason: collision with root package name */
    public int f3718x;

    /* renamed from: y  reason: collision with root package name */
    public byte f3719y;

    /* renamed from: z  reason: collision with root package name */
    public int f3720z;

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes2.dex */
    public static class a extends gu.b<f> {
        @Override // gu.p
        public final Object a(gu.d dVar, gu.e eVar) {
            return new f(dVar, eVar);
        }
    }

    /* compiled from: ProtoBuf.java */
    /* loaded from: classes2.dex */
    public static final class b extends g.b<f, b> {

        /* renamed from: x  reason: collision with root package name */
        public int f3721x;

        /* renamed from: y  reason: collision with root package name */
        public int f3722y;

        @Override // gu.a.AbstractC0262a, gu.n.a
        public final /* bridge */ /* synthetic */ n.a R(gu.d dVar, gu.e eVar) {
            m(dVar, eVar);
            return this;
        }

        @Override // gu.n.a
        public final gu.n build() {
            f fVar = new f(this);
            int i6 = 1;
            if ((this.f3721x & 1) != 1) {
                i6 = 0;
            }
            fVar.f3718x = this.f3722y;
            fVar.f3717w = i6;
            if (fVar.d()) {
                return fVar;
            }
            throw new UninitializedMessageException();
        }

        @Override // gu.g.a
        public final Object clone() {
            b bVar = new b();
            f fVar = new f(this);
            int i6 = 1;
            if ((this.f3721x & 1) != 1) {
                i6 = 0;
            }
            fVar.f3718x = this.f3722y;
            fVar.f3717w = i6;
            bVar.l(fVar);
            return bVar;
        }

        @Override // gu.a.AbstractC0262a
        public final /* bridge */ /* synthetic */ a.AbstractC0262a h(gu.d dVar, gu.e eVar) {
            m(dVar, eVar);
            return this;
        }

        @Override // gu.g.a
        public final g.a i() {
            b bVar = new b();
            f fVar = new f(this);
            int i6 = 1;
            if ((this.f3721x & 1) != 1) {
                i6 = 0;
            }
            fVar.f3718x = this.f3722y;
            fVar.f3717w = i6;
            bVar.l(fVar);
            return bVar;
        }

        @Override // gu.g.a
        public final /* bridge */ /* synthetic */ g.a j(gu.g gVar) {
            l((f) gVar);
            return this;
        }

        public final void l(f fVar) {
            boolean z10;
            if (fVar == f.A) {
                return;
            }
            if ((fVar.f3717w & 1) == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                int i6 = fVar.f3718x;
                this.f3721x = 1 | this.f3721x;
                this.f3722y = i6;
            }
            k(fVar);
            this.f16856u = this.f16856u.g(fVar.f3716v);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void m(gu.d dVar, gu.e eVar) {
            f fVar;
            try {
                try {
                    f.B.getClass();
                    l(new f(dVar, eVar));
                } catch (Throwable th2) {
                    th = th2;
                    fVar = null;
                    if (fVar != null) {
                        l(fVar);
                    }
                    throw th;
                }
            } catch (InvalidProtocolBufferException e10) {
                fVar = (f) e10.f23476u;
                try {
                    throw e10;
                } catch (Throwable th3) {
                    th = th3;
                    if (fVar != null) {
                    }
                    throw th;
                }
            }
        }
    }

    static {
        f fVar = new f(0);
        A = fVar;
        fVar.f3718x = 0;
    }

    public f() {
        throw null;
    }

    public f(g.b bVar) {
        super(bVar);
        this.f3719y = (byte) -1;
        this.f3720z = -1;
        this.f3716v = bVar.f16856u;
    }

    @Override // gu.n
    public final n.a a() {
        b bVar = new b();
        bVar.l(this);
        return bVar;
    }

    @Override // gu.n
    public final int b() {
        int i6 = this.f3720z;
        if (i6 != -1) {
            return i6;
        }
        int i10 = 0;
        if ((this.f3717w & 1) == 1) {
            i10 = 0 + CodedOutputStream.b(1, this.f3718x);
        }
        int size = this.f3716v.size() + j() + i10;
        this.f3720z = size;
        return size;
    }

    @Override // gu.n
    public final n.a c() {
        return new b();
    }

    @Override // gu.o
    public final boolean d() {
        byte b10 = this.f3719y;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (!i()) {
            this.f3719y = (byte) 0;
            return false;
        }
        this.f3719y = (byte) 1;
        return true;
    }

    @Override // gu.o
    public final gu.n e() {
        return A;
    }

    @Override // gu.n
    public final void f(CodedOutputStream codedOutputStream) {
        b();
        g.c<MessageType>.a n10 = n();
        if ((this.f3717w & 1) == 1) {
            codedOutputStream.m(1, this.f3718x);
        }
        n10.a(k.d.DEFAULT_DRAG_ANIMATION_DURATION, codedOutputStream);
        codedOutputStream.r(this.f3716v);
    }

    public f(int i6) {
        this.f3719y = (byte) -1;
        this.f3720z = -1;
        this.f3716v = gu.c.f16833u;
    }

    public f(gu.d dVar, gu.e eVar) {
        this.f3719y = (byte) -1;
        this.f3720z = -1;
        boolean z10 = false;
        this.f3718x = 0;
        c.b bVar = new c.b();
        CodedOutputStream j10 = CodedOutputStream.j(bVar, 1);
        while (!z10) {
            try {
                try {
                    int n10 = dVar.n();
                    if (n10 != 0) {
                        if (n10 != 8) {
                            if (!o(dVar, j10, eVar, n10)) {
                            }
                        } else {
                            this.f3717w |= 1;
                            this.f3718x = dVar.k();
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
                try {
                    j10.i();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f3716v = bVar.g();
                    throw th3;
                }
                this.f3716v = bVar.g();
                m();
                throw th2;
            }
        }
        try {
            j10.i();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f3716v = bVar.g();
            throw th4;
        }
        this.f3716v = bVar.g();
        m();
    }
}
