package sv;

import java.io.IOException;
/* compiled from: TaskQueue.kt */
/* loaded from: classes2.dex */
public final class j extends ov.a {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ e f32155e;
    public final /* synthetic */ int f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ zv.e f32156g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ int f32157h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(String str, e eVar, int i6, zv.e eVar2, int i10, boolean z10) {
        super(str, true);
        this.f32155e = eVar;
        this.f = i6;
        this.f32156g = eVar2;
        this.f32157h = i10;
    }

    @Override // ov.a
    public final long a() {
        try {
            ca.a aVar = this.f32155e.F;
            zv.e source = this.f32156g;
            int i6 = this.f32157h;
            aVar.getClass();
            kotlin.jvm.internal.i.g(source, "source");
            source.skip(i6);
            this.f32155e.S.j(this.f, a.CANCEL);
            synchronized (this.f32155e) {
                this.f32155e.U.remove(Integer.valueOf(this.f));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
