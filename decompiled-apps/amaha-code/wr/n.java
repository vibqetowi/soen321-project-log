package wr;

import vr.n3;
/* compiled from: OkHttpWritableBuffer.java */
/* loaded from: classes2.dex */
public final class n implements n3 {

    /* renamed from: a  reason: collision with root package name */
    public final zv.e f37186a;

    /* renamed from: b  reason: collision with root package name */
    public int f37187b;

    /* renamed from: c  reason: collision with root package name */
    public int f37188c;

    public n(zv.e eVar, int i6) {
        this.f37186a = eVar;
        this.f37187b = i6;
    }

    @Override // vr.n3
    public final int b() {
        return this.f37188c;
    }

    @Override // vr.n3
    public final int c() {
        return this.f37187b;
    }

    @Override // vr.n3
    public final void d(byte b10) {
        this.f37186a.L0(b10);
        this.f37187b--;
        this.f37188c++;
    }

    @Override // vr.n3
    public final void write(byte[] bArr, int i6, int i10) {
        this.f37186a.y0(i6, bArr, i10);
        this.f37187b -= i10;
        this.f37188c += i10;
    }

    @Override // vr.n3
    public final void a() {
    }
}
