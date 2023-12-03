package th;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
/* compiled from: RemoteConfigHandler.kt */
/* loaded from: classes.dex */
public final class g extends k implements ss.a<String> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ c f33025u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(c cVar) {
        super(0);
        this.f33025u = cVar;
    }

    @Override // ss.a
    public final String invoke() {
        this.f33025u.getClass();
        return i.n(" syncConfig() : SDK Disabled.", "Core_RemoteConfigHandler");
    }
}
