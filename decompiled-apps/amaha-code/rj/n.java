package rj;

import com.moengage.pushbase.push.PushMessageListener;
/* compiled from: PushMessageListener.kt */
/* loaded from: classes.dex */
public final class n extends kotlin.jvm.internal.k implements ss.a<String> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ PushMessageListener f30754u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(PushMessageListener pushMessageListener) {
        super(0);
        this.f30754u = pushMessageListener;
    }

    @Override // ss.a
    public final String invoke() {
        return kotlin.jvm.internal.i.n(" onMessageReceived()", this.f30754u.f10236a);
    }
}
