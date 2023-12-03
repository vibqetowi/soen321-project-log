package sv;

import java.io.IOException;
import java.util.List;
/* compiled from: TaskQueue.kt */
/* loaded from: classes2.dex */
public final class l extends ov.a {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ e f32160e;
    public final /* synthetic */ int f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ List f32161g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(String str, e eVar, int i6, List list) {
        super(str, true);
        this.f32160e = eVar;
        this.f = i6;
        this.f32161g = list;
    }

    @Override // ov.a
    public final long a() {
        ca.a aVar = this.f32160e.F;
        List requestHeaders = this.f32161g;
        aVar.getClass();
        kotlin.jvm.internal.i.g(requestHeaders, "requestHeaders");
        try {
            this.f32160e.S.j(this.f, a.CANCEL);
            synchronized (this.f32160e) {
                this.f32160e.U.remove(Integer.valueOf(this.f));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
