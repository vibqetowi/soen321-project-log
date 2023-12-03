package ah;

import kotlin.jvm.internal.k;
import r1.b0;
/* compiled from: TaskHandler.kt */
/* loaded from: classes.dex */
public final class g extends k implements ss.a<String> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ f f567u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ e f568v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(f fVar, e eVar) {
        super(0);
        this.f567u = fVar;
        this.f568v = eVar;
    }

    @Override // ss.a
    public final String invoke() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f567u.f556b);
        sb2.append(" submit() : Job with tag ");
        return b0.b(sb2, this.f568v.f552a, " added to queue");
    }
}
