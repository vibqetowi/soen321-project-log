package sv;

import java.io.IOException;
/* compiled from: TaskQueue.kt */
/* loaded from: classes2.dex */
public final class g extends ov.a {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ e f32150e;
    public final /* synthetic */ q f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(String str, e eVar, q qVar) {
        super(str, true);
        this.f32150e = eVar;
        this.f = qVar;
    }

    @Override // ov.a
    public final long a() {
        try {
            this.f32150e.f32128v.b(this.f);
            return -1L;
        } catch (IOException e10) {
            uv.h hVar = uv.h.f34614a;
            uv.h hVar2 = uv.h.f34614a;
            String n10 = kotlin.jvm.internal.i.n(this.f32150e.f32130x, "Http2Connection.Listener failure for ");
            hVar2.getClass();
            uv.h.i(4, n10, e10);
            try {
                this.f.c(a.PROTOCOL_ERROR, e10);
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }
}
