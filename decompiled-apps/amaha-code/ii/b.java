package ii;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
/* compiled from: MoEFireBaseHelper.kt */
/* loaded from: classes.dex */
public final class b extends k implements ss.a<String> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ a f20113u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar) {
        super(0);
        this.f20113u = aVar;
    }

    @Override // ss.a
    public final String invoke() {
        return i.n(" passPushToken() : Instance not initialised, cannot process further", this.f20113u.f20111a);
    }
}
