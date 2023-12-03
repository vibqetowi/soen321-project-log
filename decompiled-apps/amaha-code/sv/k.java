package sv;

import java.io.IOException;
import java.util.List;
/* compiled from: TaskQueue.kt */
/* loaded from: classes2.dex */
public final class k extends ov.a {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ e f32158e;
    public final /* synthetic */ int f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ List f32159g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(String str, e eVar, int i6, List list, boolean z10) {
        super(str, true);
        this.f32158e = eVar;
        this.f = i6;
        this.f32159g = list;
    }

    @Override // ov.a
    public final long a() {
        ca.a aVar = this.f32158e.F;
        List responseHeaders = this.f32159g;
        aVar.getClass();
        kotlin.jvm.internal.i.g(responseHeaders, "responseHeaders");
        try {
            this.f32158e.S.j(this.f, a.CANCEL);
            synchronized (this.f32158e) {
                this.f32158e.U.remove(Integer.valueOf(this.f));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
