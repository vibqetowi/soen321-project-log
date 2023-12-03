package rj;

import com.moengage.pushbase.push.PushMessageListener;
/* compiled from: PushMessageListener.kt */
/* loaded from: classes.dex */
public final class v extends kotlin.jvm.internal.k implements ss.a<String> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ PushMessageListener f30762u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(PushMessageListener pushMessageListener) {
        super(0);
        this.f30762u = pushMessageListener;
    }

    @Override // ss.a
    public final String invoke() {
        return kotlin.jvm.internal.i.n(" onMessageReceived() : Notification not required.", this.f30762u.f10236a);
    }
}
