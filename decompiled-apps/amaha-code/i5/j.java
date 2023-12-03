package i5;

import w5.l;
import w5.p;
/* compiled from: AppEventsManager.kt */
/* loaded from: classes.dex */
public final class j implements p.b {
    @Override // w5.p.b
    public final void onSuccess() {
        w5.l lVar = w5.l.f36497a;
        w5.n.c(new w5.m(new p7.b(7), l.b.AAM));
        w5.n.c(new w5.m(new p7.b(8), l.b.RestrictiveDataFiltering));
        w5.n.c(new w5.m(new p7.b(9), l.b.PrivacyProtection));
        w5.n.c(new w5.m(new p7.b(10), l.b.EventDeactivation));
        w5.n.c(new w5.m(new p7.b(11), l.b.IapLogging));
        w5.n.c(new w5.m(new p7.b(12), l.b.CloudBridge));
    }

    @Override // w5.p.b
    public final void onError() {
    }
}
