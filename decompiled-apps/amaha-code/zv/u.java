package zv;
/* compiled from: Segment.kt */
/* loaded from: classes2.dex */
public final class u {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f39918a;

    /* renamed from: b  reason: collision with root package name */
    public int f39919b;

    /* renamed from: c  reason: collision with root package name */
    public int f39920c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f39921d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f39922e;
    public u f;

    /* renamed from: g  reason: collision with root package name */
    public u f39923g;

    public u() {
        this.f39918a = new byte[8192];
        this.f39922e = true;
        this.f39921d = false;
    }

    public final u a() {
        u uVar = this.f;
        if (uVar == this) {
            uVar = null;
        }
        u uVar2 = this.f39923g;
        kotlin.jvm.internal.i.d(uVar2);
        uVar2.f = this.f;
        u uVar3 = this.f;
        kotlin.jvm.internal.i.d(uVar3);
        uVar3.f39923g = this.f39923g;
        this.f = null;
        this.f39923g = null;
        return uVar;
    }

    public final void b(u uVar) {
        uVar.f39923g = this;
        uVar.f = this.f;
        u uVar2 = this.f;
        kotlin.jvm.internal.i.d(uVar2);
        uVar2.f39923g = uVar;
        this.f = uVar;
    }

    public final u c() {
        this.f39921d = true;
        return new u(this.f39918a, this.f39919b, this.f39920c, true);
    }

    public final void d(u uVar, int i6) {
        if (uVar.f39922e) {
            int i10 = uVar.f39920c;
            int i11 = i10 + i6;
            byte[] bArr = uVar.f39918a;
            if (i11 > 8192) {
                if (!uVar.f39921d) {
                    int i12 = uVar.f39919b;
                    if (i11 - i12 <= 8192) {
                        is.i.I1(0, i12, i10, bArr, bArr);
                        uVar.f39920c -= uVar.f39919b;
                        uVar.f39919b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            int i13 = uVar.f39920c;
            int i14 = this.f39919b;
            is.i.I1(i13, i14, i14 + i6, this.f39918a, bArr);
            uVar.f39920c += i6;
            this.f39919b += i6;
            return;
        }
        throw new IllegalStateException("only owner can write".toString());
    }

    public u(byte[] data, int i6, int i10, boolean z10) {
        kotlin.jvm.internal.i.g(data, "data");
        this.f39918a = data;
        this.f39919b = i6;
        this.f39920c = i10;
        this.f39921d = z10;
        this.f39922e = false;
    }
}
