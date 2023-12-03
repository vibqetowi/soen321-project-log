package rj;

import com.moengage.pushbase.push.PushMessageListener;
/* compiled from: PushMessageListener.kt */
/* loaded from: classes.dex */
public final class p extends kotlin.jvm.internal.k implements ss.a<String> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ PushMessageListener f30756u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(PushMessageListener pushMessageListener) {
        super(0);
        this.f30756u = pushMessageListener;
    }

    @Override // ss.a
    public final String invoke() {
        return kotlin.jvm.internal.i.n(" onMessageReceived() : Cannot show campaign. Either SDK is disabled or push is opted out.", this.f30756u.f10236a);
    }
}
