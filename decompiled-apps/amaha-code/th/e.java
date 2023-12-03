package th;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
/* compiled from: RemoteConfigHandler.kt */
/* loaded from: classes.dex */
public final class e extends k implements ss.a<String> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ c f33023u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c cVar) {
        super(0);
        this.f33023u = cVar;
    }

    @Override // ss.a
    public final String invoke() {
        this.f33023u.getClass();
        return i.n(" syncConfig() : App id missing cannot make config api call.", "Core_RemoteConfigHandler");
    }
}
