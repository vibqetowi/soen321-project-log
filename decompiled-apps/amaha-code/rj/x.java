package rj;

import com.moengage.pushbase.push.PushMessageListener;
/* compiled from: PushMessageListener.kt */
/* loaded from: classes.dex */
public final class x extends kotlin.jvm.internal.k implements ss.a<String> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ PushMessageListener f30764u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(PushMessageListener pushMessageListener) {
        super(0);
        this.f30764u = pushMessageListener;
    }

    @Override // ss.a
    public final String invoke() {
        return kotlin.jvm.internal.i.n(" onNonMoEngageMessageReceived() : Callback for non-moengage push received.", this.f30764u.f10236a);
    }
}
