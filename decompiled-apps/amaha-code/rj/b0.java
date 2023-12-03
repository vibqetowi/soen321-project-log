package rj;

import com.moengage.pushbase.push.PushMessageListener;
/* compiled from: PushMessageListener.kt */
/* loaded from: classes.dex */
public final class b0 extends kotlin.jvm.internal.k implements ss.a<String> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ PushMessageListener f30741u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(PushMessageListener pushMessageListener) {
        super(0);
        this.f30741u = pushMessageListener;
    }

    @Override // ss.a
    public final String invoke() {
        return kotlin.jvm.internal.i.n(" onPostNotificationReceived() : Callback after notification shown", this.f30741u.f10236a);
    }
}
