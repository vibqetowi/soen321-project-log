package lj;

import android.os.Bundle;
import com.theinnerhour.b2b.utils.SessionManager;
import gv.n;
import gv.r;
import ih.p;
import is.w;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: Parser.kt */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final p f24390a;

    /* renamed from: b  reason: collision with root package name */
    public final String f24391b;

    public h(p sdkInstance) {
        kotlin.jvm.internal.i.g(sdkInstance, "sdkInstance");
        this.f24390a = sdkInstance;
        this.f24391b = "PushBase_6.6.0_Parser";
    }

    public static JSONObject a(JSONObject jSONObject) {
        String str;
        JSONObject jSONObject2;
        Object obj;
        String str2;
        String str3;
        String string;
        String string2 = jSONObject.getString("action_tag");
        if (string2 != null && (str = b.f24382a.get(string2)) != null) {
            switch (str.hashCode()) {
                case -1349088399:
                    if (str.equals("custom")) {
                        jSONObject2 = new JSONObject();
                        jSONObject2.put(SessionManager.KEY_NAME, "custom");
                        jSONObject2.put("value", jSONObject.getString("custom_payload"));
                        return jSONObject2;
                    }
                    break;
                case -897610266:
                    if (str.equals("snooze")) {
                        jSONObject2 = new JSONObject();
                        jSONObject2.put(SessionManager.KEY_NAME, "snooze");
                        String string3 = jSONObject.getString("value");
                        kotlin.jvm.internal.i.f(string3, "actionJson.getString(KEY_ACTION_VALUE)");
                        jSONObject2.put("value", Integer.parseInt(string3));
                        return jSONObject2;
                    }
                    break;
                case -717304697:
                    if (str.equals("remindLater")) {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("remindAfterHours", jSONObject.optInt("value_today", -1));
                        jSONObject3.put("remindTomorrowAt", jSONObject.optInt("value_tomorrow", -1));
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put(SessionManager.KEY_NAME, "remindLater");
                        jSONObject4.put("kvPairs", jSONObject3);
                        return jSONObject4;
                    }
                    break;
                case 3045982:
                    if (str.equals("call")) {
                        jSONObject2 = new JSONObject();
                        jSONObject2.put(SessionManager.KEY_NAME, "call");
                        String string4 = jSONObject.getString("value");
                        kotlin.jvm.internal.i.f(string4, "actionJson.getString(KEY_ACTION_VALUE)");
                        jSONObject2.put("value", r.i1(string4).toString());
                        return jSONObject2;
                    }
                    break;
                case 3059573:
                    if (str.equals("copy")) {
                        jSONObject2 = new JSONObject();
                        jSONObject2.put(SessionManager.KEY_NAME, "copy");
                        jSONObject2.put("value", jSONObject.getString("value"));
                        return jSONObject2;
                    }
                    break;
                case 109400031:
                    if (str.equals("share")) {
                        jSONObject2 = new JSONObject();
                        jSONObject2.put(SessionManager.KEY_NAME, "share");
                        jSONObject2.put("value", jSONObject.getString("content"));
                        return jSONObject2;
                    }
                    break;
                case 110621003:
                    if (str.equals("track")) {
                        jSONObject2 = new JSONObject();
                        jSONObject2.put(SessionManager.KEY_NAME, "track");
                        String string5 = jSONObject.getString("action_tag");
                        if (string5 != null) {
                            if (kotlin.jvm.internal.i.b(string5, "m_track")) {
                                obj = "event";
                            } else if (kotlin.jvm.internal.i.b(string5, "m_set")) {
                                obj = "userAttribute";
                            } else {
                                throw new IllegalArgumentException("Invalid Payload");
                            }
                            jSONObject2.put("type", obj);
                            if (kotlin.jvm.internal.i.b(obj, "event")) {
                                jSONObject2.put("value", jSONObject.getString("track"));
                                JSONObject jSONObject5 = new JSONObject();
                                jSONObject5.put("valueOf", jSONObject.getString("valueOf"));
                                jSONObject2.put("kvPairs", jSONObject5);
                            } else if (kotlin.jvm.internal.i.b(obj, "userAttribute")) {
                                jSONObject2.put("value", jSONObject.getString("set"));
                                JSONObject jSONObject6 = new JSONObject();
                                jSONObject6.put("valueOf", jSONObject.getString("value"));
                                jSONObject2.put("kvPairs", jSONObject6);
                            } else {
                                throw new IllegalArgumentException("Invalid track type");
                            }
                            return jSONObject2;
                        }
                        throw new IllegalArgumentException("Invalid Payload");
                    }
                    break;
                case 2102494577:
                    if (str.equals("navigate")) {
                        if (jSONObject.has("uri")) {
                            str2 = "Invalid Payload";
                            str3 = "deepLink";
                        } else if (!jSONObject.has("screen")) {
                            str2 = "Invalid Payload";
                            str3 = null;
                        } else {
                            if (!jSONObject.has("extras")) {
                                str2 = "Invalid Payload";
                            } else {
                                JSONObject jSONObject7 = jSONObject.getJSONObject("extras");
                                str2 = "Invalid Payload";
                                if (jSONObject7.length() == 1 && jSONObject7.has("gcm_webUrl")) {
                                    str3 = "richLanding";
                                }
                            }
                            str3 = "screenName";
                        }
                        if (str3 != null) {
                            int hashCode = str3.hashCode();
                            if (hashCode != -417556201) {
                                if (hashCode != 628280070) {
                                    if (hashCode == 1778710939 && str3.equals("richLanding")) {
                                        string = jSONObject.getJSONObject("extras").getString("gcm_webUrl");
                                    }
                                    string = null;
                                } else {
                                    if (str3.equals("deepLink")) {
                                        string = jSONObject.getString("uri");
                                    }
                                    string = null;
                                }
                            } else {
                                if (str3.equals("screenName")) {
                                    string = jSONObject.getString("screen");
                                }
                                string = null;
                            }
                            if (string != null) {
                                JSONObject jSONObject8 = new JSONObject();
                                jSONObject8.put(SessionManager.KEY_NAME, "navigate");
                                jSONObject8.put("type", str3);
                                jSONObject8.put("value", string);
                                if (jSONObject.has("extras") && !kotlin.jvm.internal.i.b("richLanding", str3)) {
                                    JSONObject jSONObject9 = jSONObject.getJSONObject("extras");
                                    kotlin.jvm.internal.i.f(jSONObject9, "actionJson.getJSONObject(KEY_ACTION_EXTRAS)");
                                    jSONObject8.put("kvPairs", jSONObject9);
                                }
                                return jSONObject8;
                            }
                            throw new IllegalArgumentException(str2);
                        }
                        throw new IllegalArgumentException(str2);
                    }
                    break;
            }
        }
        return null;
    }

    public static qh.a b(Bundle bundle) {
        String string = bundle.getString("gcm_title", "");
        kotlin.jvm.internal.i.f(string, "payload.getString(PUSH_NOTIFICATION_TITLE, \"\")");
        String string2 = bundle.getString("gcm_alert", "");
        kotlin.jvm.internal.i.f(string2, "payload.getString(PUSH_NOTIFICATION_MESSAGE, \"\")");
        String string3 = bundle.getString("gcm_subtext", "");
        kotlin.jvm.internal.i.f(string3, "payload.getString(PUSH_NOTIFICATION_SUMMARY, \"\")");
        return new qh.a(string, string2, string3, 1);
    }

    public static qh.a c(Bundle bundle) {
        JSONObject jSONObject = new JSONObject(bundle.getString("moeFeatures")).getJSONObject("richPush");
        String optString = jSONObject.optString("title", "");
        kotlin.jvm.internal.i.f(optString, "richPush.optString(NOTIFICATION_TITLE, \"\")");
        String optString2 = jSONObject.optString("body", "");
        kotlin.jvm.internal.i.f(optString2, "richPush.optString(NOTIFICATION_MESSAGE, \"\")");
        String optString3 = jSONObject.optString("summary", "");
        kotlin.jvm.internal.i.f(optString3, "richPush.optString(NOTIFICATION_SUMMARY, \"\")");
        return new qh.a(optString, optString2, optString3, 1);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:(3:90|91|(6:95|13|14|15|16|(7:18|19|20|(1:22)(3:27|(1:38)(1:31)|(1:33)(5:34|(1:36)|37|24|25))|23|24|25)(14:39|40|41|42|43|44|45|(10:47|49|50|51|52|53|54|55|56|(1:68)(1:60))|78|20|(0)(0)|23|24|25)))|12|13|14|15|16|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0115, code lost:
        if (r0 != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0140, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0141, code lost:
        r18 = r5;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0133 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002a A[Catch: JSONException -> 0x0034, TRY_LEAVE, TryCatch #2 {JSONException -> 0x0034, blocks: (B:3:0x0010, B:6:0x0017, B:8:0x001d, B:15:0x002a), top: B:104:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c5 A[Catch: all -> 0x0140, TRY_LEAVE, TryCatch #0 {all -> 0x0140, blocks: (B:35:0x00b9, B:38:0x00c5), top: B:100:0x00b9 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0130 A[Catch: all -> 0x013a, TRY_LEAVE, TryCatch #5 {all -> 0x013a, blocks: (B:42:0x00db, B:44:0x00e3, B:67:0x0130, B:64:0x0122), top: B:110:0x00db }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0204  */
    /* JADX WARN: Type inference failed for: r14v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final pj.b d(Bundle payload) {
        boolean z10;
        String string;
        qh.a c10;
        w wVar;
        long j10;
        ?? r14;
        boolean z11;
        List list;
        pj.a aVar;
        JSONArray jSONArray;
        int i6;
        jj.a aVar2;
        boolean z12;
        boolean z13;
        p pVar = this.f24390a;
        kotlin.jvm.internal.i.g(payload, "payload");
        try {
        } catch (JSONException e10) {
            pVar.f20105d.a(1, e10, new g(this));
        }
        if (payload.containsKey("moeFeatures")) {
            String string2 = payload.getString("moeFeatures");
            if (string2 != null && string2.length() != 0) {
                z13 = false;
                if (z13) {
                    z10 = new JSONObject(string2).has("richPush");
                    string = payload.getString("gcm_notificationType");
                    if (string == null) {
                        String string3 = payload.getString("gcm_campaign_id");
                        if (string3 != null) {
                            if (z10) {
                                try {
                                    c10 = c(payload);
                                } catch (Throwable th2) {
                                    pVar.f20105d.a(1, th2, new f(this));
                                    c10 = b(payload);
                                }
                                if ((!n.B0(c10.f29590b)) && (!n.B0(c10.f29591c))) {
                                    qh.a aVar3 = c10;
                                    String string4 = payload.getString("gcm_image_url");
                                    String string5 = payload.getString("moe_channel_id", "moe_default_channel");
                                    kotlin.jvm.internal.i.f(string5, "payload.getString(\n     …_CHANNEL_ID\n            )");
                                    String string6 = payload.getString("inbox_expiry", String.valueOf(sp.b.n() + 7776000));
                                    kotlin.jvm.internal.i.f(string6, "payload.getString(\n     ….toString()\n            )");
                                    long parseLong = Long.parseLong(string6) * 1000;
                                    w wVar2 = w.f20676u;
                                    if (payload.containsKey("gcm_actions")) {
                                        wVar = wVar2;
                                        j10 = parseLong;
                                        r14 = wVar;
                                        if (payload.containsKey("moeFeatures")) {
                                            aVar = ca.a.f0(pVar);
                                        } else {
                                            String string7 = payload.getString("moeFeatures");
                                            if (string7 != null && string7.length() != 0) {
                                                z11 = false;
                                            } else {
                                                z11 = true;
                                            }
                                            if (z11) {
                                                aVar = ca.a.f0(pVar);
                                            } else {
                                                JSONObject jSONObject = new JSONObject(string7);
                                                JSONObject optJSONObject = jSONObject.optJSONObject("android");
                                                if (optJSONObject == null) {
                                                    optJSONObject = new JSONObject();
                                                }
                                                String optString = jSONObject.optString("msgTag", "general");
                                                kotlin.jvm.internal.i.f(optString, "featuresJson.optString(\n…AMPAIGN_TAG\n            )");
                                                boolean optBoolean = jSONObject.optBoolean("ignoreInbox", false);
                                                boolean optBoolean2 = jSONObject.optBoolean("pushToInbox", false);
                                                boolean has = jSONObject.has("richPush");
                                                boolean optBoolean3 = optJSONObject.optBoolean("isPersistent", false);
                                                boolean optBoolean4 = optJSONObject.optBoolean("dismissOnClick", true);
                                                list = r14;
                                                long optLong = optJSONObject.optLong("autoDismiss", -1L);
                                                pVar.f20103b.f12858d.f28417b.getClass();
                                                boolean optBoolean5 = optJSONObject.optBoolean("showMultipleNotification", false);
                                                String optString2 = optJSONObject.optString("largeIcon", "");
                                                kotlin.jvm.internal.i.f(optString2, "androidJson.optString(\n …GE_ICON_URL\n            )");
                                                aVar = new pj.a(optString, optBoolean, optBoolean2, has, optBoolean3, optBoolean4, optLong, optBoolean5, optString2, optJSONObject.optBoolean("hasHtmlText", false));
                                                return new pj.b(string, string3, aVar3, string4, string5, j10, list, aVar, payload);
                                            }
                                        }
                                        list = r14;
                                        return new pj.b(string, string3, aVar3, string4, string5, j10, list, aVar, payload);
                                    }
                                    JSONArray jSONArray2 = new JSONArray(payload.getString("gcm_actions"));
                                    wVar = wVar2;
                                    try {
                                        int min = Math.min(jSONArray2.length(), 3);
                                        j10 = parseLong;
                                        try {
                                            r14 = new ArrayList(min);
                                            int i10 = 0;
                                            while (i10 < min) {
                                                int i11 = i10 + 1;
                                                JSONObject jSONObject2 = jSONArray2.getJSONObject(i10);
                                                int i12 = min;
                                                kotlin.jvm.internal.i.f(jSONObject2, "buttonArray.getJSONObject(index)");
                                                try {
                                                    jSONArray = jSONArray2;
                                                    try {
                                                        String string8 = jSONObject2.getString("action_title");
                                                        i6 = i11;
                                                        try {
                                                            aVar2 = new jj.a(string8, jSONObject2.optString("action_id"), a(jSONObject2));
                                                            if (string8 != null && !n.B0(string8)) {
                                                                z12 = false;
                                                            } else {
                                                                z12 = true;
                                                            }
                                                        } catch (Throwable th3) {
                                                            th = th3;
                                                            pVar.f20105d.a(1, th, new e(this));
                                                            aVar2 = null;
                                                            if (aVar2 == null) {
                                                                r14.add(aVar2);
                                                            }
                                                            min = i12;
                                                            jSONArray2 = jSONArray;
                                                            i10 = i6;
                                                        }
                                                    } catch (Throwable th4) {
                                                        th = th4;
                                                        i6 = i11;
                                                        pVar.f20105d.a(1, th, new e(this));
                                                        aVar2 = null;
                                                        if (aVar2 == null) {
                                                        }
                                                        min = i12;
                                                        jSONArray2 = jSONArray;
                                                        i10 = i6;
                                                    }
                                                } catch (Throwable th5) {
                                                    th = th5;
                                                    jSONArray = jSONArray2;
                                                }
                                            }
                                        } catch (Throwable th6) {
                                            th = th6;
                                            pVar.f20105d.a(1, th, new d(this));
                                            r14 = wVar;
                                            if (payload.containsKey("moeFeatures")) {
                                            }
                                            list = r14;
                                            return new pj.b(string, string3, aVar3, string4, string5, j10, list, aVar, payload);
                                        }
                                    } catch (Throwable th7) {
                                        th = th7;
                                        j10 = parseLong;
                                        pVar.f20105d.a(1, th, new d(this));
                                        r14 = wVar;
                                        if (payload.containsKey("moeFeatures")) {
                                        }
                                        list = r14;
                                        return new pj.b(string, string3, aVar3, string4, string5, j10, list, aVar, payload);
                                    }
                                    if (payload.containsKey("moeFeatures")) {
                                    }
                                    list = r14;
                                    return new pj.b(string, string3, aVar3, string4, string5, j10, list, aVar, payload);
                                }
                            }
                            c10 = b(payload);
                            qh.a aVar32 = c10;
                            String string42 = payload.getString("gcm_image_url");
                            String string52 = payload.getString("moe_channel_id", "moe_default_channel");
                            kotlin.jvm.internal.i.f(string52, "payload.getString(\n     …_CHANNEL_ID\n            )");
                            String string62 = payload.getString("inbox_expiry", String.valueOf(sp.b.n() + 7776000));
                            kotlin.jvm.internal.i.f(string62, "payload.getString(\n     ….toString()\n            )");
                            long parseLong2 = Long.parseLong(string62) * 1000;
                            w wVar22 = w.f20676u;
                            if (payload.containsKey("gcm_actions")) {
                            }
                        } else {
                            throw new IllegalStateException("Missing mandatory key gcm_campaign_id");
                        }
                    } else {
                        throw new IllegalStateException("Missing mandatory key gcm_notificationType");
                    }
                }
            }
            z13 = true;
            if (z13) {
            }
        }
        z10 = false;
        string = payload.getString("gcm_notificationType");
        if (string == null) {
        }
    }
}
