package lv;
/* compiled from: RequestBody.kt */
/* loaded from: classes2.dex */
public final class b0 extends c0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ v f24541a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f24542b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ byte[] f24543c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f24544d;

    public b0(v vVar, byte[] bArr, int i6, int i10) {
        this.f24541a = vVar;
        this.f24542b = i6;
        this.f24543c = bArr;
        this.f24544d = i10;
    }

    @Override // lv.c0
    public final long a() {
        return this.f24542b;
    }

    @Override // lv.c0
    public final v b() {
        return this.f24541a;
    }

    @Override // lv.c0
    public final void c(zv.g gVar) {
        int i6 = this.f24542b;
        gVar.t0(this.f24544d, this.f24543c, i6);
    }
}
