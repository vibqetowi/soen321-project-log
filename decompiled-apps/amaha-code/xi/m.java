package xi;

import android.text.TextUtils;
import com.moengage.inapp.internal.exceptions.ParseException;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.SessionManager;
import di.n;
import hh.g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import nd.z;
import ni.r;
import org.json.JSONArray;
import org.json.JSONObject;
import pi.q;
import r1.b0;
/* compiled from: ResponseParser.java */
/* loaded from: classes.dex */
public final class m {
    public static z c(JSONObject jSONObject, JSONObject jSONObject2) {
        pi.f fVar;
        String str;
        String str2 = null;
        if (!jSONObject.has("background")) {
            return null;
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("background");
        if (jSONObject3.has("color")) {
            fVar = e(jSONObject3.getJSONObject("color"));
        } else {
            fVar = null;
        }
        if (jSONObject3.has("image")) {
            str = k(jSONObject2, jSONObject3.getJSONObject("image").getString("_ref"));
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            str2 = str;
        }
        return new z(fVar, str2);
    }

    public static pi.b d(JSONObject jSONObject) {
        pi.f fVar = null;
        if (!jSONObject.has("border")) {
            return null;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("border");
        if (jSONObject2.has("color")) {
            fVar = e(jSONObject2.getJSONObject("color"));
        }
        return new pi.b(fVar, jSONObject2.optDouble("radius", 0.0d), jSONObject2.optDouble("width", 0.0d));
    }

    public static pi.f e(JSONObject jSONObject) {
        return new pi.f((float) jSONObject.getDouble("a"), jSONObject.getInt("r"), jSONObject.getInt("g"), jSONObject.getInt(Constants.ONBOARDING_VARIANT));
    }

    public static HashMap h(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject2.has("data_map")) {
            return n.e(j(jSONObject, jSONObject2.getJSONObject("data_map").getString("_ref")));
        }
        return new HashMap();
    }

    public static pi.g i(JSONObject jSONObject) {
        pi.f fVar;
        JSONObject jSONObject2 = jSONObject.getJSONObject("font");
        String optString = jSONObject2.optString("font_name");
        int i6 = jSONObject2.getInt("size");
        if (jSONObject2.has("color")) {
            fVar = e(jSONObject2.getJSONObject("color"));
        } else {
            fVar = new pi.f(1.0f, 0, 0, 0);
        }
        return new pi.g(optString, i6, fVar);
    }

    public static JSONObject j(JSONObject jSONObject, String str) {
        String[] split = str.split("/");
        for (int i6 = 1; i6 < split.length; i6++) {
            jSONObject = jSONObject.getJSONObject(split[i6]);
        }
        return jSONObject;
    }

    public static String k(JSONObject jSONObject, String str) {
        String[] split = str.split("/");
        for (int i6 = 1; i6 < split.length - 1; i6++) {
            jSONObject = jSONObject.getJSONObject(split[i6]);
        }
        return jSONObject.getString(split[split.length - 1]);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0132  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ui.e l(JSONObject jSONObject, JSONObject jSONObject2, int i6, int i10) {
        pi.l lVar;
        pi.n nVar;
        int i11;
        int i12;
        char c10;
        char c11;
        double optDouble = jSONObject2.optDouble("height", -2.0d);
        double d10 = jSONObject2.getDouble("width");
        if (jSONObject2.has("margin")) {
            JSONObject jSONObject3 = jSONObject2.getJSONObject("margin");
            lVar = new pi.l(jSONObject3.optDouble("left", 0.0d), jSONObject3.optDouble("right", 0.0d), jSONObject3.optDouble("top", 0.0d), jSONObject3.optDouble("bottom", 0.0d));
        } else {
            lVar = new pi.l(0.0d, 0.0d, 0.0d, 0.0d);
        }
        if (jSONObject2.has("padding")) {
            JSONObject jSONObject4 = jSONObject2.getJSONObject("padding");
            nVar = new pi.n(jSONObject4.optDouble("left", 0.0d), jSONObject4.optDouble("right", 0.0d), jSONObject4.optDouble("top", 0.0d), jSONObject4.optDouble("bottom", 0.0d));
        } else {
            nVar = new pi.n(0.0d, 0.0d, 0.0d, 0.0d);
        }
        ui.e eVar = new ui.e(optDouble, d10, lVar, nVar, jSONObject2.getBoolean("display"));
        pi.a aVar = null;
        if (i6 != 0) {
            int i13 = i6 - 1;
            int i14 = 2;
            if (i13 != 0) {
                if (i13 == 1) {
                    pi.b d11 = d(jSONObject2);
                    z c12 = c(jSONObject2, jSONObject);
                    if (jSONObject2.has("animation")) {
                        JSONObject jSONObject5 = jSONObject2.getJSONObject("animation");
                        if (jSONObject5.has("entry")) {
                            String string = jSONObject5.getString("entry");
                            string.getClass();
                            switch (string.hashCode()) {
                                case -1810415154:
                                    if (string.equals("SLIDE_RIGHT")) {
                                        c11 = 0;
                                        break;
                                    }
                                    c11 = 65535;
                                    break;
                                case -489950199:
                                    if (string.equals("SLIDE_UP")) {
                                        c11 = 1;
                                        break;
                                    }
                                    c11 = 65535;
                                    break;
                                case -373408312:
                                    if (string.equals("FADE_IN")) {
                                        c11 = 2;
                                        break;
                                    }
                                    c11 = 65535;
                                    break;
                                case 1603756688:
                                    if (string.equals("SLIDE_DOWN")) {
                                        c11 = 3;
                                        break;
                                    }
                                    c11 = 65535;
                                    break;
                                case 1603984885:
                                    if (string.equals("SLIDE_LEFT")) {
                                        c11 = 4;
                                        break;
                                    }
                                    c11 = 65535;
                                    break;
                                default:
                                    c11 = 65535;
                                    break;
                            }
                            if (c11 != 0) {
                                if (c11 != 1) {
                                    if (c11 != 2) {
                                        if (c11 != 3) {
                                            if (c11 == 4) {
                                                i11 = R.anim.slide_right_in;
                                            }
                                        } else {
                                            i11 = R.anim.slide_down_in;
                                        }
                                    } else {
                                        i11 = R.anim.fade_in;
                                    }
                                } else {
                                    i11 = R.anim.slide_up_in;
                                }
                            } else {
                                i11 = R.anim.slide_left_in;
                            }
                            if (jSONObject5.has("exit")) {
                                String string2 = jSONObject5.getString("exit");
                                string2.getClass();
                                switch (string2.hashCode()) {
                                    case -1810415154:
                                        if (string2.equals("SLIDE_RIGHT")) {
                                            c10 = 0;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case -489950199:
                                        if (string2.equals("SLIDE_UP")) {
                                            c10 = 1;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case 1309250283:
                                        if (string2.equals("FADE_OUT")) {
                                            c10 = 2;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case 1603756688:
                                        if (string2.equals("SLIDE_DOWN")) {
                                            c10 = 3;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case 1603984885:
                                        if (string2.equals("SLIDE_LEFT")) {
                                            c10 = 4;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    default:
                                        c10 = 65535;
                                        break;
                                }
                                if (c10 != 0) {
                                    if (c10 != 1) {
                                        if (c10 != 2) {
                                            if (c10 != 3) {
                                                if (c10 == 4) {
                                                    i12 = R.anim.slide_left_out;
                                                }
                                            } else {
                                                i12 = R.anim.slide_down_out;
                                            }
                                        } else {
                                            i12 = R.anim.fade_out;
                                        }
                                    } else {
                                        i12 = R.anim.slide_up_out;
                                    }
                                } else {
                                    i12 = R.anim.slide_right_out;
                                }
                                aVar = new pi.a(i11, i12);
                            }
                            i12 = -1;
                            aVar = new pi.a(i11, i12);
                        }
                        i11 = -1;
                        if (jSONObject5.has("exit")) {
                        }
                        i12 = -1;
                        aVar = new pi.a(i11, i12);
                    }
                    return new ui.c(eVar, d11, c12, aVar);
                }
            } else if (i10 != 0) {
                int i15 = i10 - 1;
                if (i15 != 0) {
                    if (i15 != 1) {
                        if (i15 != 2) {
                            if (i15 != 3) {
                                if (i15 == 4) {
                                    if (jSONObject2.has("float")) {
                                        try {
                                            i14 = defpackage.e.B(jSONObject2.getString("float").trim().toUpperCase());
                                        } catch (Exception unused) {
                                        }
                                    }
                                    return new ui.b(eVar, i14);
                                }
                            } else if (jSONObject2.has("rating_style")) {
                                JSONObject jSONObject6 = jSONObject2.getJSONObject("rating_style");
                                return new ui.f(eVar, d(jSONObject2), e(jSONObject6.getJSONObject("color")), jSONObject6.getInt("number_of_stars"), jSONObject6.getBoolean("half_step_allowed"), jSONObject2.getDouble("realHeight"));
                            } else {
                                throw new ParseException("Mandatory key \"rating_style\" missing.");
                            }
                        } else {
                            return new ui.d(eVar, d(jSONObject2), jSONObject2.getDouble("realHeight"), jSONObject2.getDouble("realWidth"));
                        }
                    } else {
                        return new ui.g(eVar, i(jSONObject2), c(jSONObject2, jSONObject), d(jSONObject2));
                    }
                } else {
                    return new ui.a(eVar, i(jSONObject2), c(jSONObject2, jSONObject), d(jSONObject2), jSONObject2.getInt("min_height"));
                }
            } else {
                throw null;
            }
            return null;
        }
        throw null;
    }

    public static qi.i m(int i6, JSONObject jSONObject, JSONObject jSONObject2) {
        String str;
        int l2 = b0.l(jSONObject2.getString("track_type").trim().toUpperCase());
        if (jSONObject2.has("value")) {
            str = k(jSONObject, jSONObject2.getJSONObject("value").getString("_ref"));
        } else {
            str = null;
        }
        return new qi.i(i6, l2, str, k(jSONObject, jSONObject2.getJSONObject(SessionManager.KEY_NAME).getString("_ref")), h(jSONObject, jSONObject2));
    }

    public final bj.a a(JSONObject jSONObject, JSONObject jSONObject2) {
        String str;
        try {
            int F = defpackage.b.F(jSONObject2.getString("action_type").trim().toUpperCase());
            switch (v.h.d(F)) {
                case 0:
                    return new qi.e(F);
                case 1:
                    return m(F, jSONObject, jSONObject2);
                case 2:
                    return new bj.c(F, defpackage.c.H(jSONObject2.getString("navigation_type").trim().toUpperCase()), k(jSONObject, jSONObject2.getJSONObject("value").getString("_ref")), h(jSONObject, jSONObject2));
                case 3:
                    return new qi.g(F, k(jSONObject, jSONObject2.getJSONObject("value").getString("_ref")));
                case 4:
                    if (jSONObject2.has("message")) {
                        str = k(jSONObject, jSONObject2.getJSONObject("message").getString("_ref"));
                    } else {
                        str = null;
                    }
                    return new qi.d(F, str, k(jSONObject, jSONObject2.getJSONObject("value").getString("_ref")));
                case 5:
                    return new qi.a(F, k(jSONObject, jSONObject2.getJSONObject("value").getString("_ref")));
                case 6:
                    return new qi.h(F, k(jSONObject, jSONObject2.getJSONObject("value").getString("_ref")), k(jSONObject, jSONObject2.getJSONObject("message").getString("_ref")));
                case 7:
                    return new bj.b(F, h(jSONObject, jSONObject2));
                case 8:
                    return f(F, jSONObject, jSONObject2);
                case 9:
                    return n(F, jSONObject, jSONObject2);
                case 10:
                    return new bj.d(F, -1);
                case 11:
                    return new qi.f(F);
            }
        } catch (Exception e10) {
            r rVar = new r(16);
            hh.a aVar = hh.g.f17610d;
            g.a.a(1, e10, rVar);
        }
        return null;
    }

    public final ArrayList b(JSONObject jSONObject, JSONObject jSONObject2) {
        ArrayList arrayList = new ArrayList();
        if (jSONObject.length() == 0) {
            return arrayList;
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            bj.a a10 = a(jSONObject2, j(jSONObject2, jSONObject.getJSONObject(keys.next()).getString("_ref")));
            if (a10 != null) {
                arrayList.add(a10);
            }
        }
        return arrayList;
    }

    public final qi.c f(int i6, JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject2.has("conditions")) {
            pi.k o10 = o(jSONObject, j(jSONObject, jSONObject2.getJSONObject("widget_id").getString("_ref")));
            JSONArray jSONArray = jSONObject2.getJSONArray("conditions");
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i10);
                arrayList.add(new qi.b(jSONObject3.getJSONObject("attribute"), b(jSONObject3.getJSONObject("actions"), jSONObject)));
            }
            return new qi.c(i6, arrayList, o10.f34976b);
        }
        throw new ParseException("Mandatory key \"conditions\" missing.");
    }

    public final pi.i g(JSONObject jSONObject, JSONObject jSONObject2, boolean z10) {
        ui.e l2 = l(jSONObject, j(jSONObject, jSONObject2.getJSONObject("style").getString("_ref")), 2, 0);
        if (l2 != null) {
            int i6 = jSONObject2.getInt("id");
            int C = defpackage.d.C(jSONObject2.getString(Constants.DAYMODEL_POSITION).trim().toUpperCase());
            JSONArray jSONArray = jSONObject2.getJSONArray("widgets");
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i10);
                int D = defpackage.d.D(jSONObject3.getString("type").trim().toUpperCase());
                if (D == 1) {
                    arrayList.add(new q(D, o(jSONObject, j(jSONObject, jSONObject3.getString("_ref")))));
                } else if (D == 2) {
                    arrayList.add(new q(D, g(jSONObject, j(jSONObject, jSONObject3.getString("_ref")), false)));
                }
            }
            return new pi.i(i6, l2, C, z10, arrayList);
        }
        throw new ParseException("Style could not be parsed.");
    }

    public final qi.j n(int i6, JSONObject jSONObject, JSONObject jSONObject2) {
        pi.k o10 = o(jSONObject, j(jSONObject, jSONObject2.getJSONObject("widget_id").getString("_ref")));
        b0.m(jSONObject2.getString("input_type").trim().toUpperCase());
        return new qi.j(i6, 1, o10.f34976b, b(jSONObject2.getJSONObject("actions"), jSONObject));
    }

    public final pi.k o(JSONObject jSONObject, JSONObject jSONObject2) {
        String str;
        int p10 = pl.a.p(jSONObject2.getString("type").trim().toUpperCase());
        int i6 = jSONObject2.getInt("id");
        JSONObject j10 = j(jSONObject, jSONObject2.getJSONObject("component").getString("_ref"));
        ui.e l2 = l(jSONObject, j(jSONObject, j10.getJSONObject("style").getString("_ref")), 1, p10);
        if (l2 != null) {
            if (p10 != 4 && !j10.has("content")) {
                throw new ParseException("Mandatory param content missing");
            }
            ArrayList arrayList = null;
            if (j10.has("content")) {
                str = k(jSONObject, j10.getJSONObject("content").getString("_ref"));
            } else {
                str = null;
            }
            z zVar = new z(str, 14, l2);
            if (jSONObject2.has("action")) {
                JSONObject jSONObject3 = jSONObject2.getJSONObject("action");
                arrayList = new ArrayList();
                Iterator<String> keys = jSONObject3.keys();
                while (keys.hasNext()) {
                    bj.a a10 = a(jSONObject, j(jSONObject, jSONObject3.getJSONObject(keys.next()).getString("_ref")));
                    if (a10 != null) {
                        arrayList.add(a10);
                    }
                }
            }
            return new pi.k(i6, p10, zVar, arrayList);
        }
        throw new ParseException("Style could not be parsed.");
    }
}
