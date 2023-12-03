package lj;

import android.os.Bundle;
import com.theinnerhour.b2b.utils.SessionManager;
import gv.n;
import hh.g;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import qj.l;
/* compiled from: ActionParser.kt */
/* loaded from: classes.dex */
public final class a {

    /* compiled from: ActionParser.kt */
    /* renamed from: lj.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0385a extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ String f24381v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0385a(String str) {
            super(0);
            this.f24381v = str;
        }

        @Override // ss.a
        public final String invoke() {
            StringBuilder sb2 = new StringBuilder("PushBase_6.6.0_ActionParser actionFromJson() : Not a supported action : ");
            a.this.getClass();
            sb2.append((Object) this.f24381v);
            return sb2.toString();
        }
    }

    public final qj.a a(JSONObject jSONObject) {
        boolean z10;
        String actionType = jSONObject.getString(SessionManager.KEY_NAME);
        boolean z11 = false;
        if (actionType != null && !n.B0(actionType)) {
            z10 = false;
        } else {
            z10 = true;
        }
        String str = null;
        Bundle bundle = null;
        if (z10) {
            return null;
        }
        kotlin.jvm.internal.i.f(actionType, "actionType");
        switch (actionType.hashCode()) {
            case -1354573786:
                if (actionType.equals("coupon")) {
                    qj.a aVar = new qj.a(jSONObject, actionType);
                    String string = jSONObject.getString("value");
                    kotlin.jvm.internal.i.f(string, "actionJson.getString(VALUE)");
                    return new qj.d(aVar, string);
                }
                break;
            case -1349088399:
                if (actionType.equals("custom")) {
                    qj.a aVar2 = new qj.a(jSONObject, actionType);
                    String string2 = jSONObject.getString("value");
                    kotlin.jvm.internal.i.f(string2, "actionJson.getString(VALUE)");
                    return new qj.e(aVar2, string2);
                }
                break;
            case -897610266:
                if (actionType.equals("snooze")) {
                    return new qj.k(new qj.a(jSONObject, actionType), jSONObject.getInt("value"));
                }
                break;
            case -717304697:
                if (actionType.equals("remindLater")) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("kvPairs");
                    String string3 = jSONObject.getString(SessionManager.KEY_NAME);
                    kotlin.jvm.internal.i.f(string3, "actionJson.getString(NAME)");
                    return new qj.i(new qj.a(jSONObject, string3), jSONObject2.optInt("remindAfterHours", -1), jSONObject2.optInt("remindTomorrowAt", -1));
                }
                break;
            case 3045982:
                if (actionType.equals("call")) {
                    qj.a aVar3 = new qj.a(jSONObject, actionType);
                    String string4 = jSONObject.getString("value");
                    kotlin.jvm.internal.i.f(string4, "actionJson.getString(VALUE)");
                    return new qj.b(aVar3, string4);
                }
                break;
            case 3059573:
                if (actionType.equals("copy")) {
                    qj.a aVar4 = new qj.a(jSONObject, actionType);
                    String string5 = jSONObject.getString("value");
                    kotlin.jvm.internal.i.f(string5, "actionJson.getString(VALUE)");
                    return new qj.c(aVar4, string5);
                }
                break;
            case 109400031:
                if (actionType.equals("share")) {
                    qj.a aVar5 = new qj.a(jSONObject, actionType);
                    String string6 = jSONObject.getString("value");
                    kotlin.jvm.internal.i.f(string6, "actionJson.getString(VALUE)");
                    return new qj.j(aVar5, string6);
                }
                break;
            case 110621003:
                if (actionType.equals("track")) {
                    String trackType = jSONObject.getString("type");
                    if ((trackType == null || n.B0(trackType)) ? true : true) {
                        return null;
                    }
                    JSONObject optJSONObject = jSONObject.optJSONObject("kvPairs");
                    kotlin.jvm.internal.i.f(trackType, "trackType");
                    if (kotlin.jvm.internal.i.b(trackType, "event")) {
                        String string7 = jSONObject.getString(SessionManager.KEY_NAME);
                        kotlin.jvm.internal.i.f(string7, "actionJson.getString(NAME)");
                        qj.a aVar6 = new qj.a(jSONObject, string7);
                        if (optJSONObject != null) {
                            str = optJSONObject.getString("valueOf");
                        }
                        String string8 = jSONObject.getString("value");
                        kotlin.jvm.internal.i.f(string8, "actionJson.getString(VALUE)");
                        return new l(aVar6, trackType, str, string8);
                    } else if (!kotlin.jvm.internal.i.b(trackType, "userAttribute") || optJSONObject == null) {
                        return null;
                    } else {
                        String string9 = jSONObject.getString(SessionManager.KEY_NAME);
                        kotlin.jvm.internal.i.f(string9, "actionJson.getString(NAME)");
                        qj.a aVar7 = new qj.a(jSONObject, string9);
                        String string10 = optJSONObject.getString("valueOf");
                        String string11 = jSONObject.getString("value");
                        kotlin.jvm.internal.i.f(string11, "actionJson.getString(VALUE)");
                        return new l(aVar7, trackType, string10, string11);
                    }
                }
                break;
            case 2102494577:
                if (actionType.equals("navigate")) {
                    qj.a aVar8 = new qj.a(jSONObject, actionType);
                    String string12 = jSONObject.getString("type");
                    kotlin.jvm.internal.i.f(string12, "actionJson.getString(TYPE)");
                    String string13 = jSONObject.getString("value");
                    kotlin.jvm.internal.i.f(string13, "actionJson.getString(VALUE)");
                    if (jSONObject.has("kvPairs")) {
                        JSONObject jSONObject3 = jSONObject.getJSONObject("kvPairs");
                        kotlin.jvm.internal.i.f(jSONObject3, "actionJson.getJSONObject(KV_PAIR)");
                        bundle = new Bundle();
                        try {
                            Iterator<String> keys = jSONObject3.keys();
                            while (keys.hasNext()) {
                                String next = keys.next();
                                bundle.putString(next, jSONObject3.getString(next));
                            }
                        } catch (JSONException e10) {
                            hh.a aVar9 = hh.g.f17610d;
                            g.a.a(1, e10, di.d.f12886u);
                        }
                    }
                    return new qj.g(aVar8, string12, string13, bundle);
                }
                break;
        }
        hh.a aVar10 = hh.g.f17610d;
        g.a.b(1, new C0385a(actionType), 2);
        return null;
    }
}
