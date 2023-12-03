package ah;

import kotlin.jvm.internal.k;
import r1.b0;
/* compiled from: TaskHandler.kt */
/* loaded from: classes.dex */
public final class h extends k implements ss.a<String> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ f f569u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ e f570v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(f fVar, e eVar) {
        super(0);
        this.f569u = fVar;
        this.f570v = eVar;
    }

    @Override // ss.a
    public final String invoke() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f569u.f556b);
        sb2.append(" submit() : Job with tag ");
        return b0.b(sb2, this.f570v.f552a, " cannot be added to queue");
    }
}
