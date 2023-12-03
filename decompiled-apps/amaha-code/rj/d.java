package rj;

import com.moengage.pushbase.push.PushMessageListener;
/* compiled from: PushMessageListener.kt */
/* loaded from: classes.dex */
public final class d extends kotlin.jvm.internal.k implements ss.a<String> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ PushMessageListener f30743u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ String f30744v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(PushMessageListener pushMessageListener, String str) {
        super(0);
        this.f30743u = pushMessageListener;
        this.f30744v = str;
    }

    @Override // ss.a
    public final String invoke() {
        return this.f30743u.f10236a + " handleCustomAction() : Custom action callback. Payload" + this.f30744v;
    }
}
