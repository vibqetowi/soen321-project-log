package sv;

import java.io.IOException;
/* compiled from: TaskQueue.kt */
/* loaded from: classes2.dex */
public final class h extends ov.a {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ e f32151e;
    public final /* synthetic */ int f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ int f32152g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(String str, e eVar, int i6, int i10) {
        super(str, true);
        this.f32151e = eVar;
        this.f = i6;
        this.f32152g = i10;
    }

    @Override // ov.a
    public final long a() {
        int i6 = this.f;
        int i10 = this.f32152g;
        e eVar = this.f32151e;
        eVar.getClass();
        try {
            eVar.S.i(i6, i10, true);
            return -1L;
        } catch (IOException e10) {
            eVar.e(e10);
            return -1L;
        }
    }
}
