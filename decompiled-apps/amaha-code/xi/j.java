package xi;

import androidx.lifecycle.v;
import com.moengage.inapp.internal.exceptions.ParseException;
import com.theinnerhour.b2b.utils.Constants;
import hh.g;
import ih.p;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import mi.t1;
import ni.r;
import org.json.JSONObject;
/* compiled from: Parser.kt */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final p f37801a;

    /* renamed from: b  reason: collision with root package name */
    public final String f37802b;

    public j(p sdkInstance) {
        kotlin.jvm.internal.i.g(sdkInstance, "sdkInstance");
        this.f37801a = sdkInstance;
        this.f37802b = "InApp_6.5.0_Parser";
    }

    public static pi.h a(JSONObject jSONObject) {
        v vVar;
        String string = jSONObject.getString(Constants.CAMPAIGN_ID);
        String string2 = jSONObject.getString("campaign_name");
        String string3 = jSONObject.getString("template_type");
        long optLong = jSONObject.optLong("dismiss_interval", -1L);
        aj.a a10 = aj.a.a(jSONObject.getJSONObject("campaign_context"));
        int o10 = pl.a.o(jSONObject.getString("inapp_type"));
        LinkedHashSet k10 = t1.k(jSONObject.getJSONArray("orientations"));
        if (jSONObject.has("html_meta")) {
            JSONObject optJSONObject = jSONObject.getJSONObject("html_meta").optJSONObject("assets");
            if (optJSONObject != null && optJSONObject.length() != 0) {
                HashMap hashMap = new HashMap(optJSONObject.length());
                Iterator<String> keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    try {
                        String next = keys.next();
                        hashMap.put(next, optJSONObject.getString(next));
                    } catch (Exception e10) {
                        r rVar = new r(15);
                        hh.a aVar = hh.g.f17610d;
                        g.a.a(1, e10, rVar);
                    }
                }
                vVar = new v(hashMap);
            } else {
                vVar = new v(new HashMap());
            }
        } else {
            vVar = null;
        }
        pi.h hVar = new pi.h(string, string2, string3, optLong, jSONObject, a10, o10, k10, vVar, jSONObject.getString("payload"));
        if (!di.b.t(hVar.f28472j)) {
            if (!hVar.f28477o.isEmpty()) {
                if (hVar.f28476n == 1 && di.b.t(hVar.f28479q)) {
                    throw new ParseException("mandatory key \"payload\" cannot be empty.");
                }
                return hVar;
            }
            throw new ParseException("mandatory key \"orientations\" cannot be empty.");
        }
        throw new ParseException("mandatory key \"template_type\" cannot be empty.");
    }

    public static pi.m b(JSONObject jSONObject) {
        m mVar = new m();
        if (kotlin.jvm.internal.i.b("SELF_HANDLED", jSONObject.getString("template_type"))) {
            String campaignId = jSONObject.getString(Constants.CAMPAIGN_ID);
            String campaignName = jSONObject.getString("campaign_name");
            try {
                ri.e.n(jSONObject.optString("template_alignment", "CENTER").trim().toUpperCase());
            } catch (Exception unused) {
            }
            String templateType = jSONObject.getString("template_type");
            long optLong = jSONObject.optLong("dismiss_interval", -1L);
            String customPayload = jSONObject.getString("payload");
            aj.a a10 = aj.a.a(jSONObject.getJSONObject("campaign_context"));
            int o10 = pl.a.o(jSONObject.getString("inapp_type"));
            LinkedHashSet k10 = t1.k(jSONObject.getJSONArray("orientations"));
            kotlin.jvm.internal.i.g(campaignId, "campaignId");
            kotlin.jvm.internal.i.g(campaignName, "campaignName");
            defpackage.d.j(1, "alignment");
            kotlin.jvm.internal.i.g(templateType, "templateType");
            kotlin.jvm.internal.i.g(customPayload, "customPayload");
            defpackage.d.j(o10, "inAppType");
            return new pi.m(campaignId, campaignName, templateType, optLong, jSONObject, a10, o10, k10, null, 1, customPayload);
        }
        String campaignId2 = jSONObject.getString(Constants.CAMPAIGN_ID);
        String campaignName2 = jSONObject.getString("campaign_name");
        pi.i g5 = mVar.g(jSONObject, m.j(jSONObject, jSONObject.getJSONObject("primary_container").getString("_ref")), true);
        String templateType2 = jSONObject.getString("template_type");
        try {
            ri.e.n(jSONObject.optString("template_alignment", "CENTER").trim().toUpperCase());
        } catch (Exception unused2) {
        }
        long optLong2 = jSONObject.optLong("dismiss_interval", -1L);
        aj.a a11 = aj.a.a(jSONObject.getJSONObject("campaign_context"));
        int o11 = pl.a.o(jSONObject.getString("inapp_type"));
        LinkedHashSet k11 = t1.k(jSONObject.getJSONArray("orientations"));
        kotlin.jvm.internal.i.g(campaignId2, "campaignId");
        kotlin.jvm.internal.i.g(campaignName2, "campaignName");
        kotlin.jvm.internal.i.g(templateType2, "templateType");
        defpackage.d.j(1, "alignment");
        defpackage.d.j(o11, "inAppType");
        pi.m mVar2 = new pi.m(campaignId2, campaignName2, templateType2, optLong2, jSONObject, a11, o11, k11, g5, 1, null);
        if (!di.b.t(mVar2.g())) {
            if (!mVar2.f().isEmpty()) {
                if (mVar2.e() == 1 && di.b.t(((pi.h) mVar2).f28479q)) {
                    throw new ParseException("mandatory key \"payload\" cannot be empty.");
                }
                return mVar2;
            }
            throw new ParseException("mandatory key \"orientations\" cannot be empty.");
        }
        throw new ParseException("mandatory key \"template_type\" cannot be empty.");
    }
}
