package gk;

import android.os.Bundle;
import com.theinnerhour.b2b.MyApplication;
import ih.p;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import qg.g0;
import qg.w;
/* compiled from: CustomAnalytics.kt */
/* loaded from: classes2.dex */
public final class c extends k implements ss.a<hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ Bundle f16580u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ String f16581v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Bundle bundle, String str) {
        super(0);
        this.f16580u = bundle;
        this.f16581v = str;
    }

    @Override // ss.a
    public final hs.k invoke() {
        MyApplication.a aVar = MyApplication.V;
        if (aVar.a().Q && aVar.a().P) {
            ng.c cVar = new ng.c();
            Bundle bundle = this.f16580u;
            if (bundle != null) {
                for (String key : bundle.keySet()) {
                    Object obj = bundle.get(key);
                    i.f(key, "key");
                    cVar.a(obj, key);
                }
            }
            MyApplication a10 = MyApplication.V.a();
            String eventName = this.f16581v;
            i.g(eventName, "eventName");
            p pVar = g0.f29558c;
            if (pVar != null) {
                w.f29578a.getClass();
                w.d(pVar).c(a10, eventName, cVar);
            }
        }
        return hs.k.f19476a;
    }
}
