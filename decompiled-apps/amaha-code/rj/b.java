package rj;

import com.moengage.pushbase.push.PushMessageListener;
/* compiled from: PushMessageListener.kt */
/* loaded from: classes.dex */
public final class b extends kotlin.jvm.internal.k implements ss.a<String> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ PushMessageListener f30738u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ pj.b f30739v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ int f30740w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(PushMessageListener pushMessageListener, pj.b bVar, int i6) {
        super(0);
        this.f30738u = pushMessageListener;
        this.f30739v = bVar;
        this.f30740w = i6;
    }

    @Override // ss.a
    public final String invoke() {
        return this.f30738u.f10236a + " dismissNotificationAfterClick() : dismiss notification: " + this.f30739v.f28532h.f + " Notification id: " + this.f30740w;
    }
}
