package fk;

import android.os.Bundle;
import hs.k;
import s1.s;
/* compiled from: MoEngageInAppLifeCycleListener.kt */
/* loaded from: classes2.dex */
public final class a implements zi.a {
    @Override // zi.a
    public final void a(aj.b bVar) {
        String str = gk.a.f16573a;
        Bundle bundle = new Bundle();
        s sVar = bVar.f590w;
        if (((aj.a) sVar.f31224v).f587c.containsKey("campaign_name")) {
            bundle.putString("copy", String.valueOf(((aj.a) sVar.f31224v).f587c.get("campaign_name")));
        }
        bundle.putString("me_campaign_id", (String) sVar.f31225w);
        k kVar = k.f19476a;
        gk.a.b(bundle, "me_inapp_banner_show");
    }

    @Override // zi.a
    public final void b(aj.b bVar) {
        String str = gk.a.f16573a;
        Bundle bundle = new Bundle();
        s sVar = bVar.f590w;
        if (((aj.a) sVar.f31224v).f587c.containsKey("campaign_name")) {
            bundle.putString("copy", String.valueOf(((aj.a) sVar.f31224v).f587c.get("campaign_name")));
        }
        bundle.putString("me_campaign_id", (String) sVar.f31225w);
        k kVar = k.f19476a;
        gk.a.b(bundle, "me_inapp_banner_dismiss");
    }
}
