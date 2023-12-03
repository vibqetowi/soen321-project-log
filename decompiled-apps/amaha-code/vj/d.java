package vj;

import android.os.Build;
import android.widget.ImageView;
import com.google.android.gms.internal.p000firebaseauthapi.s5;
import com.theinnerhour.b2b.utils.SessionManager;
import hh.g;
import is.u;
import is.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import org.json.JSONArray;
import org.json.JSONObject;
import uj.g;
import uj.h;
import uj.j;
import uj.l;
import uj.m;
import uj.n;
import uj.o;
import uj.p;
import uj.q;
import uj.r;
/* compiled from: PayloadParser.kt */
/* loaded from: classes.dex */
public final class d {

    /* compiled from: PayloadParser.kt */
    /* loaded from: classes.dex */
    public static final class a extends k implements ss.a<String> {

        /* renamed from: u  reason: collision with root package name */
        public static final a f35235u = new a();

        public a() {
            super(0);
        }

        @Override // ss.a
        public final /* bridge */ /* synthetic */ String invoke() {
            return "RichPush_4.3.2_PayloadParser parseTemplate() : ";
        }
    }

    public static qj.a[] a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList(jSONArray.length());
        lj.a aVar = new lj.a();
        int length = jSONArray.length();
        int i6 = 0;
        while (i6 < length) {
            int i10 = i6 + 1;
            JSONObject jSONObject = jSONArray.getJSONObject(i6);
            i.f(jSONObject, "actionArray.getJSONObject(i)");
            qj.a a10 = aVar.a(jSONObject);
            if (a10 != null) {
                arrayList.add(a10);
            }
            i6 = i10;
        }
        Object[] array = arrayList.toArray(new qj.a[0]);
        if (array != null) {
            return (qj.a[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    public static h b(JSONObject jSONObject, JSONObject jSONObject2) {
        boolean optBoolean;
        List list;
        JSONArray jSONArray;
        if (Build.VERSION.SDK_INT > 29) {
            optBoolean = false;
        } else {
            optBoolean = jSONObject.optBoolean("autoStart", false);
        }
        String string = jSONObject.getString("type");
        i.f(string, "expandedJson.getString(TYPE)");
        j i6 = i(jSONObject);
        boolean has = jSONObject.has("actionButton");
        List list2 = w.f20676u;
        if (has && (jSONArray = jSONObject.getJSONArray("actionButton")) != null && jSONArray.length() != 0) {
            list = k(jSONArray, jSONObject2);
        } else {
            list = list2;
        }
        return new h(string, i6, list, d(jSONObject, jSONObject2), optBoolean);
    }

    public static r c(JSONObject jSONObject, String str) {
        String str2;
        n nVar;
        qj.a[] aVarArr;
        int i6 = jSONObject.getInt("id");
        if (!i.b(str, "timer") && !i.b(str, "progressbar")) {
            str2 = jSONObject.getString("content");
        } else {
            str2 = "";
        }
        String str3 = str2;
        i.f(str3, "if (widgetType == WIDGET…    CONTENT\n            )");
        if (jSONObject.has("style")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("style");
            i.f(jSONObject2, "widgetJson.getJSONObject(STYLE)");
            if (i.b(str, "timer")) {
                nVar = new uj.c(jSONObject2.getString("color"));
            } else {
                String string = jSONObject2.getString("bgColor");
                i.f(string, "styleJson.getString(BACKGROUND_COLOR)");
                nVar = new n(string);
            }
        } else {
            nVar = null;
        }
        n nVar2 = nVar;
        if (jSONObject.has("actions")) {
            JSONArray jSONArray = jSONObject.getJSONArray("actions");
            i.f(jSONArray, "widgetJson.getJSONArray(ACTIONS)");
            aVarArr = a(jSONArray);
        } else {
            aVarArr = new qj.a[0];
        }
        return new r(str, i6, str3, nVar2, aVarArr);
    }

    public static ArrayList d(JSONObject jSONObject, JSONObject jSONObject2) {
        qj.a[] aVarArr;
        if (!jSONObject.has("cards")) {
            return u.J2(w.f20676u);
        }
        JSONArray jSONArray = jSONObject.getJSONArray("cards");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int length = jSONArray.length();
        int i6 = 0;
        while (i6 < length) {
            int i10 = i6 + 1;
            JSONObject cardJson = jSONArray.getJSONObject(i6);
            i.f(cardJson, "cardJson");
            int i11 = cardJson.getInt("id");
            JSONArray jSONArray2 = cardJson.getJSONArray("widgets");
            i.f(jSONArray2, "cardJson.getJSONArray(WIDGETS)");
            ArrayList k10 = k(jSONArray2, jSONObject2);
            String string = cardJson.getString("type");
            i.f(string, "cardJson.getString(TYPE)");
            if (cardJson.has("actions")) {
                JSONArray jSONArray3 = cardJson.getJSONArray("actions");
                i.f(jSONArray3, "cardJson.getJSONArray(ACTIONS)");
                aVarArr = a(jSONArray3);
            } else {
                aVarArr = new qj.a[0];
            }
            arrayList.add(new uj.a(i11, k10, string, aVarArr));
            i6 = i10;
        }
        return arrayList;
    }

    public static o e(JSONObject jSONObject) {
        uj.f fVar;
        h hVar;
        s5 s5Var;
        JSONObject jSONObject2;
        String string;
        boolean b10;
        h b11;
        JSONObject jSONObject3;
        String string2;
        boolean b12;
        uj.f fVar2;
        String string3 = jSONObject.getString("displayName");
        i.f(string3, "richPushJson.getString(TEMPLATE_NAME)");
        String optString = jSONObject.optString("title", "");
        i.f(optString, "richPushJson.optString(NOTIFICATION_TITLE, \"\")");
        String optString2 = jSONObject.optString("body", "");
        i.f(optString2, "richPushJson.optString(NOTIFICATION_MESSAGE, \"\")");
        String optString3 = jSONObject.optString("summary", "");
        i.f(optString3, "richPushJson.optString(NOTIFICATION_SUMMARY, \"\")");
        qh.a aVar = new qh.a(optString, optString2, optString3, 2);
        JSONArray jSONArray = jSONObject.getJSONArray("defaultActions");
        i.f(jSONArray, "richPushJson.getJSONArray(DEFAULT_ACTION)");
        qj.a[] a10 = a(jSONArray);
        if (!jSONObject.has("collapsed") || (string2 = (jSONObject3 = jSONObject.getJSONObject("collapsed")).getString("type")) == null) {
            fVar = null;
        } else {
            if (i.b(string2, "imageBannerText")) {
                b12 = true;
            } else {
                b12 = i.b(string2, "imageBanner");
            }
            if (b12) {
                String string4 = jSONObject3.getString("type");
                i.f(string4, "collapsedJson.getString(TYPE)");
                fVar2 = new uj.e(new uj.f(string4, i(jSONObject3), d(jSONObject3, jSONObject)), jSONObject3.optBoolean("showHeader", false));
            } else {
                String string5 = jSONObject3.getString("type");
                i.f(string5, "collapsedJson.getString(TYPE)");
                fVar2 = new uj.f(string5, i(jSONObject3), d(jSONObject3, jSONObject));
            }
            fVar = fVar2;
        }
        if (!jSONObject.has("expanded") || (string = (jSONObject2 = jSONObject.getJSONObject("expanded")).getString("type")) == null) {
            hVar = null;
        } else {
            if (i.b(string, "imageBannerText")) {
                b10 = true;
            } else {
                b10 = i.b(string, "imageBanner");
            }
            if (b10) {
                b11 = new g(b(jSONObject2, jSONObject), jSONObject2.optBoolean("showHeader", false));
            } else {
                b11 = b(jSONObject2, jSONObject);
            }
            hVar = b11;
        }
        String optString4 = jSONObject.getJSONObject("android").optString("indicatorColor", "lightGrey");
        i.f(optString4, "richPushJson.getJSONObje…, ASSET_COLOR_LIGHT_GREY)");
        boolean z10 = jSONObject.getJSONObject("android").getBoolean("showLargeIcon");
        if (!jSONObject.has("appNameColor")) {
            s5Var = new s5(null, 9, 0);
        } else {
            s5Var = new s5(jSONObject.getString("appNameColor"), 9, 0);
        }
        String optString5 = jSONObject.optString("dismissCta", "Dismiss");
        i.f(optString5, "richPushJson.optString(D…DEFAULT_DISMISS_CTA_TEXT)");
        return new o(string3, aVar, a10, fVar, hVar, optString4, z10, s5Var, new s5(optString5, 8));
    }

    public static JSONObject f(JSONObject jSONObject, String str) {
        Object[] array = gv.r.a1(str, new String[]{"/"}, 0, 6).toArray(new String[0]);
        if (array != null) {
            String[] strArr = (String[]) array;
            int length = strArr.length;
            for (int i6 = 1; i6 < length; i6++) {
                jSONObject = jSONObject.getJSONObject(strArr[i6]);
                i.f(jSONObject, "propertiesPayload.getJSONObject(pathPieces[i])");
            }
            return jSONObject;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    public static p g(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            r rVar = (r) it.next();
            if (rVar instanceof uj.d) {
                uj.b bVar = ((uj.d) rVar).f;
                return new p(bVar.f34187c, bVar.f34188d);
            } else if (rVar instanceof m) {
                l lVar = ((m) rVar).f;
                return new p(lVar.f34209c, lVar.f34210d);
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static q h(JSONObject jSONObject) {
        p pVar;
        h hVar;
        o e10 = e(jSONObject);
        uj.f fVar = e10.f34215d;
        if (fVar != null) {
            List<uj.a> list = fVar.f34194c;
            if (!list.isEmpty()) {
                pVar = g(list.get(0).f34184b);
                if (pVar == null && (hVar = e10.f34216e) != null && (!hVar.f34198d.isEmpty())) {
                    pVar = g(hVar.f34198d.get(0).f34184b);
                }
                if (pVar == null) {
                    pVar = new p(-1L, -1L);
                }
                return new q(e10, pVar);
            }
        }
        pVar = null;
        if (pVar == null) {
            pVar = g(hVar.f34198d.get(0).f34184b);
        }
        if (pVar == null) {
        }
        return new q(e10, pVar);
    }

    public static j i(JSONObject jSONObject) {
        if (!jSONObject.has("style") || !jSONObject.getJSONObject("style").has("bgColor")) {
            return null;
        }
        String string = jSONObject.getJSONObject("style").getString("bgColor");
        i.f(string, "collapsedState.getJSONOb…tString(BACKGROUND_COLOR)");
        return new j(string);
    }

    public static o j(String str) {
        JSONObject jSONObject;
        String string;
        try {
            JSONObject jSONObject2 = new JSONObject(str);
            if (jSONObject2.length() == 0 || !jSONObject2.has("richPush") || (jSONObject = jSONObject2.getJSONObject("richPush")) == null) {
                return null;
            }
            String str2 = "";
            if (jSONObject.has("collapsed") && (string = jSONObject.getJSONObject("collapsed").getString("type")) != null && (i.b(string, "timer") || i.b(string, "timerWithProgressbar"))) {
                str2 = "timer";
            }
            if (i.b(str2, "timer")) {
                return h(jSONObject);
            }
            return e(jSONObject);
        } catch (Throwable th2) {
            hh.a aVar = hh.g.f17610d;
            g.a.a(1, th2, a.f35235u);
            return null;
        }
    }

    public static ArrayList k(JSONArray jSONArray, JSONObject jSONObject) {
        Object c10;
        ImageView.ScaleType scaleType;
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int length = jSONArray.length();
        int i6 = 0;
        while (i6 < length) {
            int i10 = i6 + 1;
            JSONObject widgetJson = jSONArray.getJSONObject(i6);
            i.f(widgetJson, "widgetJson");
            String widgetType = widgetJson.getString("type");
            if (widgetType != null) {
                int hashCode = widgetType.hashCode();
                if (hashCode != 100313435) {
                    if (hashCode != 110364485) {
                        if (hashCode == 1131540166 && widgetType.equals("progressbar")) {
                            r c11 = c(widgetJson, "progressbar");
                            String string = widgetJson.getString("prop");
                            i.f(string, "widgetJson.getString(WIDGET_PROPERTIES)");
                            JSONObject f = f(jSONObject, string);
                            c10 = new m(c11, new l(f.getLong("duration"), f.getLong(SessionManager.KEY_EXPIRY), new di.l(1, f)));
                        }
                    } else if (widgetType.equals("timer")) {
                        r c12 = c(widgetJson, "timer");
                        String string2 = widgetJson.getString("prop");
                        i.f(string2, "widgetJson.getString(WIDGET_PROPERTIES)");
                        JSONObject f2 = f(jSONObject, string2);
                        long j10 = f2.getLong("duration");
                        long j11 = f2.getLong(SessionManager.KEY_EXPIRY);
                        String string3 = f2.getString("format");
                        i.f(string3, "properties.getString(PROPERTY_FORMAT_KEY)");
                        c10 = new uj.d(c12, new uj.b(j10, j11, string3, new di.l(1, f2)));
                    }
                } else if (widgetType.equals("image")) {
                    r c13 = c(widgetJson, widgetType);
                    String optString = widgetJson.optString("scaleType", "");
                    if (i.b(optString, "cc")) {
                        scaleType = ImageView.ScaleType.CENTER_CROP;
                    } else if (i.b(optString, "ci")) {
                        scaleType = ImageView.ScaleType.CENTER_INSIDE;
                    } else {
                        scaleType = ImageView.ScaleType.CENTER_CROP;
                    }
                    c10 = new uj.i(c13, scaleType);
                }
                arrayList.add(c10);
                i6 = i10;
            }
            i.f(widgetType, "widgetType");
            c10 = c(widgetJson, widgetType);
            arrayList.add(c10);
            i6 = i10;
        }
        return arrayList;
    }
}
