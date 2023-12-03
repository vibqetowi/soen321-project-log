package x1;

import java.util.Set;
import x1.h;
/* compiled from: RoomTrackingLiveData.kt */
/* loaded from: classes.dex */
public final class r extends h.c {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ s<Object> f37558b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(String[] strArr, s<Object> sVar) {
        super(strArr);
        this.f37558b = sVar;
    }

    @Override // x1.h.c
    public final void a(Set<String> tables) {
        kotlin.jvm.internal.i.g(tables, "tables");
        m.a J = m.a.J();
        q qVar = this.f37558b.f37567u;
        if (J.K()) {
            qVar.run();
        } else {
            J.L(qVar);
        }
    }
}
