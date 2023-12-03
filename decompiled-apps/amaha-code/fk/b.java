package fk;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.internal.p000firebaseauthapi.s5;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.RoutingIntentHandler;
import hs.k;
import java.util.Map;
import kotlin.jvm.internal.i;
import s1.s;
/* compiled from: MoEngageOnClickActionListener.kt */
/* loaded from: classes2.dex */
public final class b implements zi.b {

    /* renamed from: a  reason: collision with root package name */
    public final Activity f15118a;

    public b(Activity context) {
        i.g(context, "context");
        this.f15118a = context;
    }

    @Override // zi.b
    public final void a(aj.b bVar) {
        bj.a aVar = (bj.a) bVar.f589y;
        int i6 = aVar.f4323a;
        Activity activity = this.f15118a;
        s sVar = bVar.f590w;
        if (i6 == 3) {
            i.e(aVar, "null cannot be cast to non-null type com.moengage.inapp.model.actions.NavigationAction");
            bj.c cVar = (bj.c) aVar;
            if (cVar.f4325b == 1) {
                Bundle bundle = new Bundle();
                Map<String, Object> map = cVar.f4327d;
                if (map != null) {
                    for (Map.Entry<String, Object> entry : map.entrySet()) {
                        String key = entry.getKey();
                        Object value = entry.getValue();
                        if (i.b(key, Constants.DAYMODEL_POSITION)) {
                            bundle.putInt(Constants.DAYMODEL_POSITION, Integer.parseInt(value.toString()));
                        } else {
                            bundle.putString(key, value.toString());
                        }
                    }
                }
                String str = gk.a.f16573a;
                Bundle bundle2 = new Bundle();
                bundle2.putString("copy", String.valueOf(((aj.a) sVar.f31224v).f587c.get("campaign_name")));
                bundle2.putString("me_campaign_id", (String) sVar.f31225w);
                bundle2.putString("navigation_url", cVar.f4326c);
                bundle2.putString(Constants.API_COURSE_LINK, bundle.getString(Constants.API_COURSE_LINK));
                k kVar = k.f19476a;
                gk.a.b(bundle2, "me_inapp_cta");
                LogHelper.INSTANCE.makeLogTag("NotV4DbUtils");
                RoutingIntentHandler g5 = s5.g(bundle.getString(Constants.API_COURSE_LINK), bundle, null, activity);
                if (g5.getIntent() != null) {
                    activity.startActivity(g5.getIntent());
                }
            }
        }
        if (aVar.f4323a == 8) {
            i.e(aVar, "null cannot be cast to non-null type com.moengage.inapp.model.actions.CustomAction");
            Bundle bundle3 = new Bundle();
            Map<String, Object> map2 = ((bj.b) aVar).f4324b;
            if (map2 != null) {
                for (Map.Entry<String, Object> entry2 : map2.entrySet()) {
                    String key2 = entry2.getKey();
                    Object value2 = entry2.getValue();
                    if (i.b(key2, Constants.DAYMODEL_POSITION)) {
                        bundle3.putInt(Constants.DAYMODEL_POSITION, Integer.parseInt(value2.toString()));
                    } else {
                        bundle3.putString(key2, value2.toString());
                    }
                }
            }
            String str2 = gk.a.f16573a;
            Bundle bundle4 = new Bundle();
            if (((aj.a) sVar.f31224v).f587c.containsKey("campaign_name")) {
                bundle4.putString("copy", String.valueOf(((aj.a) sVar.f31224v).f587c.get("campaign_name")));
            }
            bundle4.putString(Constants.CAMPAIGN_ID, (String) sVar.f31225w);
            bundle4.putString(Constants.API_COURSE_LINK, bundle3.getString(Constants.API_COURSE_LINK));
            k kVar2 = k.f19476a;
            gk.a.b(bundle4, "me_inapp_cta");
            LogHelper.INSTANCE.makeLogTag("NotV4DbUtils");
            RoutingIntentHandler g10 = s5.g(bundle3.getString(Constants.API_COURSE_LINK), bundle3, null, activity);
            if (g10.getIntent() != null) {
                activity.startActivity(g10.getIntent());
            }
        }
    }
}
