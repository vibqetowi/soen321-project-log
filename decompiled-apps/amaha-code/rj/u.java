package rj;

import com.moengage.pushbase.push.PushMessageListener;
/* compiled from: PushMessageListener.kt */
/* loaded from: classes.dex */
public final class u extends kotlin.jvm.internal.k implements ss.a<String> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ PushMessageListener f30761u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(PushMessageListener pushMessageListener) {
        super(0);
        this.f30761u = pushMessageListener;
    }

    @Override // ss.a
    public final String invoke() {
        StringBuilder sb2 = new StringBuilder();
        PushMessageListener pushMessageListener = this.f30761u;
        sb2.append(pushMessageListener.f10236a);
        sb2.append(" onMessageReceived() : Campaign already shown, ignoring. campaign-id: ");
        pj.b bVar = pushMessageListener.f10240e;
        if (bVar != null) {
            sb2.append(bVar.f28527b);
            return sb2.toString();
        }
        kotlin.jvm.internal.i.q("notificationPayload");
        throw null;
    }
}
