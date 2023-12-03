package sv;

import java.io.IOException;
/* compiled from: TaskQueue.kt */
/* loaded from: classes2.dex */
public final class n extends ov.a {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ e f32164e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(String str, e eVar) {
        super(str, true);
        this.f32164e = eVar;
    }

    @Override // ov.a
    public final long a() {
        e eVar = this.f32164e;
        eVar.getClass();
        try {
            eVar.S.i(2, 0, false);
            return -1L;
        } catch (IOException e10) {
            eVar.e(e10);
            return -1L;
        }
    }
}
