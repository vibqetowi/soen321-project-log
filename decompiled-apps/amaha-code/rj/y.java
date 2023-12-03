package rj;

import com.moengage.pushbase.push.PushMessageListener;
/* compiled from: PushMessageListener.kt */
/* loaded from: classes.dex */
public final class y extends kotlin.jvm.internal.k implements ss.a<String> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ PushMessageListener f30765u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(PushMessageListener pushMessageListener) {
        super(0);
        this.f30765u = pushMessageListener;
    }

    @Override // ss.a
    public final String invoke() {
        return kotlin.jvm.internal.i.n(" onNotificationCleared() : Callback for notification cleared.", this.f30765u.f10236a);
    }
}
