package u5;

import android.util.Patterns;
import com.theinnerhour.b2b.utils.SessionManager;
import gv.r;
import is.e0;
import java.io.File;
import java.io.FileInputStream;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.jvm.internal.i;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: FeatureExtractor.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f33808a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static Map<String, String> f33809b;

    /* renamed from: c  reason: collision with root package name */
    public static Map<String, String> f33810c;

    /* renamed from: d  reason: collision with root package name */
    public static Map<String, String> f33811d;

    /* renamed from: e  reason: collision with root package name */
    public static JSONObject f33812e;
    public static boolean f;

    public static final float[] a(JSONObject jSONObject, String str) {
        String lowerCase;
        JSONObject jSONObject2;
        String screenName;
        JSONArray jSONArray;
        a aVar;
        JSONObject b10;
        if (b6.a.b(a.class)) {
            return null;
        }
        try {
            if (!f) {
                return null;
            }
            float[] fArr = new float[30];
            for (int i6 = 0; i6 < 30; i6++) {
                fArr[i6] = 0.0f;
            }
            try {
                lowerCase = str.toLowerCase();
                i.f(lowerCase, "(this as java.lang.String).toLowerCase()");
                jSONObject2 = new JSONObject(jSONObject.optJSONObject("view").toString());
                screenName = jSONObject.optString("screenname");
                jSONArray = new JSONArray();
                aVar = f33808a;
                aVar.h(jSONArray, jSONObject2);
                aVar.k(fArr, aVar.g(jSONObject2));
                b10 = aVar.b(jSONObject2);
            } catch (JSONException unused) {
            }
            if (b10 == null) {
                return null;
            }
            i.f(screenName, "screenName");
            String jSONObject3 = jSONObject2.toString();
            i.f(jSONObject3, "viewTree.toString()");
            aVar.k(fArr, aVar.f(b10, jSONArray, screenName, jSONObject3, lowerCase));
            return fArr;
        } catch (Throwable th2) {
            b6.a.a(a.class, th2);
            return null;
        }
    }

    public static final String c(String str, String activityName, String str2) {
        if (b6.a.b(a.class)) {
            return null;
        }
        try {
            i.g(activityName, "activityName");
            String str3 = str2 + " | " + activityName + ", " + str;
            if (str3 != null) {
                String lowerCase = str3.toLowerCase();
                i.f(lowerCase, "(this as java.lang.String).toLowerCase()");
                return lowerCase;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        } catch (Throwable th2) {
            b6.a.a(a.class, th2);
            return null;
        }
    }

    public static final void d(File file) {
        if (b6.a.b(a.class)) {
            return;
        }
        try {
            try {
                f33812e = new JSONObject();
                FileInputStream fileInputStream = new FileInputStream(file);
                byte[] bArr = new byte[fileInputStream.available()];
                fileInputStream.read(bArr);
                fileInputStream.close();
                f33812e = new JSONObject(new String(bArr, gv.a.f16927b));
                f33809b = e0.u0(new hs.f("ENGLISH", "1"), new hs.f("GERMAN", "2"), new hs.f("SPANISH", "3"), new hs.f("JAPANESE", "4"));
                f33810c = e0.u0(new hs.f("VIEW_CONTENT", "0"), new hs.f("SEARCH", "1"), new hs.f("ADD_TO_CART", "2"), new hs.f("ADD_TO_WISHLIST", "3"), new hs.f("INITIATE_CHECKOUT", "4"), new hs.f("ADD_PAYMENT_INFO", "5"), new hs.f("PURCHASE", "6"), new hs.f("LEAD", "7"), new hs.f("COMPLETE_REGISTRATION", "8"));
                f33811d = e0.u0(new hs.f("BUTTON_TEXT", "1"), new hs.f("PAGE_TITLE", "2"), new hs.f("RESOLVED_DOCUMENT_LINK", "3"), new hs.f("BUTTON_ID", "4"));
                f = true;
            } catch (Throwable th2) {
                b6.a.a(a.class, th2);
            }
        } catch (Exception unused) {
        }
    }

    public final JSONObject b(JSONObject jSONObject) {
        int length;
        if (b6.a.b(this)) {
            return null;
        }
        try {
        } catch (JSONException unused) {
        } catch (Throwable th2) {
            b6.a.a(this, th2);
        }
        if (jSONObject.optBoolean("is_interacted")) {
            return jSONObject;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("childviews");
        if (optJSONArray != null && (length = optJSONArray.length()) > 0) {
            int i6 = 0;
            while (true) {
                int i10 = i6 + 1;
                JSONObject jSONObject2 = optJSONArray.getJSONObject(i6);
                i.f(jSONObject2, "children.getJSONObject(i)");
                JSONObject b10 = b(jSONObject2);
                if (b10 != null) {
                    return b10;
                }
                if (i10 >= length) {
                    break;
                }
                i6 = i10;
            }
        }
        return null;
    }

    public final boolean e(String[] strArr, String[] strArr2) {
        if (b6.a.b(this)) {
            return false;
        }
        try {
            int length = strArr.length;
            int i6 = 0;
            while (i6 < length) {
                String str = strArr[i6];
                i6++;
                int length2 = strArr2.length;
                int i10 = 0;
                while (i10 < length2) {
                    String str2 = strArr2[i10];
                    i10++;
                    if (r.J0(str2, str)) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Throwable th2) {
            b6.a.a(this, th2);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0062 A[Catch: JSONException -> 0x006f, all -> 0x0177, TRY_LEAVE, TryCatch #0 {all -> 0x0177, blocks: (B:6:0x0018, B:9:0x001e, B:10:0x0023, B:12:0x002c, B:14:0x0030, B:15:0x0033, B:18:0x003a, B:29:0x0062, B:26:0x005c, B:34:0x0073, B:38:0x00bc, B:42:0x00ca, B:46:0x00da, B:50:0x00ea, B:54:0x00fa, B:58:0x010a, B:62:0x011a, B:66:0x0128, B:70:0x0136, B:74:0x0146, B:78:0x0156, B:82:0x0164, B:86:0x0172), top: B:92:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006c A[LOOP:1: B:18:0x003a->B:32:0x006c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x006f A[EDGE_INSN: B:99:0x006f->B:33:0x006f ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float[] f(JSONObject jSONObject, JSONArray jSONArray, String str, String str2, String str3) {
        float f2;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        float f21;
        float f22;
        boolean z10;
        if (b6.a.b(this)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            for (int i6 = 0; i6 < 30; i6++) {
                fArr[i6] = 0.0f;
            }
            int length = jSONArray.length();
            if (length > 1) {
                f2 = length - 1.0f;
            } else {
                f2 = 0.0f;
            }
            fArr[3] = f2;
            try {
                int length2 = jSONArray.length();
                if (length2 > 0) {
                    int i10 = 0;
                    while (true) {
                        int i11 = i10 + 1;
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                        i.f(jSONObject2, "siblings.getJSONObject(i)");
                        if (!b6.a.b(this)) {
                            try {
                            } catch (Throwable th2) {
                                b6.a.a(this, th2);
                            }
                            if (((jSONObject2.optInt("classtypebitmask") & 1) << 5) > 0) {
                                z10 = true;
                                if (z10) {
                                    fArr[9] = fArr[9] + 1.0f;
                                }
                                if (i11 < length2) {
                                    break;
                                }
                                i10 = i11;
                            }
                        }
                        z10 = false;
                        if (z10) {
                        }
                        if (i11 < length2) {
                        }
                    }
                }
            } catch (JSONException unused) {
            }
            fArr[13] = -1.0f;
            fArr[14] = -1.0f;
            String str4 = str + '|' + str3;
            StringBuilder sb2 = new StringBuilder();
            StringBuilder sb3 = new StringBuilder();
            l(jSONObject, sb3, sb2);
            String sb4 = sb2.toString();
            i.f(sb4, "hintSB.toString()");
            String sb5 = sb3.toString();
            i.f(sb5, "textSB.toString()");
            if (j("COMPLETE_REGISTRATION", "BUTTON_TEXT", sb5)) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            fArr[15] = f10;
            if (j("COMPLETE_REGISTRATION", "PAGE_TITLE", str4)) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            fArr[16] = f11;
            if (j("COMPLETE_REGISTRATION", "BUTTON_ID", sb4)) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            fArr[17] = f12;
            if (r.J0(str2, SessionManager.KEY_PASS)) {
                f13 = 1.0f;
            } else {
                f13 = 0.0f;
            }
            fArr[18] = f13;
            if (i("(?i)(confirm.*password)|(password.*(confirmation|confirm)|confirmation)", str2)) {
                f14 = 1.0f;
            } else {
                f14 = 0.0f;
            }
            fArr[19] = f14;
            if (i("(?i)(sign in)|login|signIn", str2)) {
                f15 = 1.0f;
            } else {
                f15 = 0.0f;
            }
            fArr[20] = f15;
            if (i("(?i)(sign.*(up|now)|registration|register|(create|apply).*(profile|account)|open.*account|account.*(open|creation|application)|enroll|join.*now)", str2)) {
                f16 = 1.0f;
            } else {
                f16 = 0.0f;
            }
            fArr[21] = f16;
            if (j("PURCHASE", "BUTTON_TEXT", sb5)) {
                f17 = 1.0f;
            } else {
                f17 = 0.0f;
            }
            fArr[22] = f17;
            if (j("PURCHASE", "PAGE_TITLE", str4)) {
                f18 = 1.0f;
            } else {
                f18 = 0.0f;
            }
            fArr[24] = f18;
            if (i("(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart", sb5)) {
                f19 = 1.0f;
            } else {
                f19 = 0.0f;
            }
            fArr[25] = f19;
            if (i("(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart|shop|buy", str4)) {
                f20 = 1.0f;
            } else {
                f20 = 0.0f;
            }
            fArr[27] = f20;
            if (j("LEAD", "BUTTON_TEXT", sb5)) {
                f21 = 1.0f;
            } else {
                f21 = 0.0f;
            }
            fArr[28] = f21;
            if (j("LEAD", "PAGE_TITLE", str4)) {
                f22 = 1.0f;
            } else {
                f22 = 0.0f;
            }
            fArr[29] = f22;
            return fArr;
        } catch (Throwable th3) {
            b6.a.a(this, th3);
            return null;
        }
    }

    public final float[] g(JSONObject jSONObject) {
        if (b6.a.b(this)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            int i6 = 0;
            for (int i10 = 0; i10 < 30; i10++) {
                fArr[i10] = 0.0f;
            }
            String optString = jSONObject.optString("text");
            i.f(optString, "node.optString(TEXT_KEY)");
            String lowerCase = optString.toLowerCase();
            i.f(lowerCase, "(this as java.lang.String).toLowerCase()");
            String optString2 = jSONObject.optString("hint");
            i.f(optString2, "node.optString(HINT_KEY)");
            String lowerCase2 = optString2.toLowerCase();
            i.f(lowerCase2, "(this as java.lang.String).toLowerCase()");
            String optString3 = jSONObject.optString("classname");
            i.f(optString3, "node.optString(CLASS_NAME_KEY)");
            String lowerCase3 = optString3.toLowerCase();
            i.f(lowerCase3, "(this as java.lang.String).toLowerCase()");
            int optInt = jSONObject.optInt("inputtype", -1);
            String[] strArr = {lowerCase, lowerCase2};
            if (e(new String[]{"$", "amount", "price", "total"}, strArr)) {
                fArr[0] = fArr[0] + 1.0f;
            }
            if (e(new String[]{SessionManager.KEY_PASS, "pwd"}, strArr)) {
                fArr[1] = fArr[1] + 1.0f;
            }
            if (e(new String[]{"tel", "phone"}, strArr)) {
                fArr[2] = fArr[2] + 1.0f;
            }
            if (e(new String[]{"search"}, strArr)) {
                fArr[4] = fArr[4] + 1.0f;
            }
            if (optInt >= 0) {
                fArr[5] = fArr[5] + 1.0f;
            }
            if (optInt == 3 || optInt == 2) {
                fArr[6] = fArr[6] + 1.0f;
            }
            if (optInt == 32 || Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
                fArr[7] = fArr[7] + 1.0f;
            }
            if (r.J0(lowerCase3, "checkbox")) {
                fArr[8] = fArr[8] + 1.0f;
            }
            if (e(new String[]{"complete", "confirm", "done", "submit"}, new String[]{lowerCase})) {
                fArr[10] = fArr[10] + 1.0f;
            }
            if (r.J0(lowerCase3, "radio") && r.J0(lowerCase3, "button")) {
                fArr[12] = fArr[12] + 1.0f;
            }
            try {
                JSONArray optJSONArray = jSONObject.optJSONArray("childviews");
                int length = optJSONArray.length();
                if (length > 0) {
                    while (true) {
                        int i11 = i6 + 1;
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i6);
                        i.f(jSONObject2, "childViews.getJSONObject(i)");
                        k(fArr, g(jSONObject2));
                        if (i11 >= length) {
                            break;
                        }
                        i6 = i11;
                    }
                }
            } catch (JSONException unused) {
            }
            return fArr;
        } catch (Throwable th2) {
            b6.a.a(this, th2);
            return null;
        }
    }

    public final boolean h(JSONArray jSONArray, JSONObject jSONObject) {
        boolean z10;
        boolean z11;
        if (b6.a.b(this)) {
            return false;
        }
        try {
            if (jSONObject.optBoolean("is_interacted")) {
                return true;
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("childviews");
            int length = optJSONArray.length();
            if (length > 0) {
                int i6 = 0;
                while (true) {
                    int i10 = i6 + 1;
                    if (optJSONArray.getJSONObject(i6).optBoolean("is_interacted")) {
                        z10 = true;
                        z11 = true;
                        break;
                    } else if (i10 >= length) {
                        break;
                    } else {
                        i6 = i10;
                    }
                }
            }
            z10 = false;
            z11 = false;
            JSONArray jSONArray2 = new JSONArray();
            if (z10) {
                int length2 = optJSONArray.length();
                if (length2 > 0) {
                    int i11 = 0;
                    while (true) {
                        int i12 = i11 + 1;
                        jSONArray.put(optJSONArray.getJSONObject(i11));
                        if (i12 >= length2) {
                            break;
                        }
                        i11 = i12;
                    }
                }
            } else {
                int length3 = optJSONArray.length();
                if (length3 > 0) {
                    int i13 = 0;
                    while (true) {
                        int i14 = i13 + 1;
                        JSONObject child = optJSONArray.getJSONObject(i13);
                        i.f(child, "child");
                        if (h(jSONArray, child)) {
                            jSONArray2.put(child);
                            z11 = true;
                        }
                        if (i14 >= length3) {
                            break;
                        }
                        i13 = i14;
                    }
                }
                jSONObject.put("childviews", jSONArray2);
            }
            return z11;
        } catch (JSONException unused) {
            return false;
        } catch (Throwable th2) {
            b6.a.a(this, th2);
            return false;
        }
    }

    public final boolean i(String str, String str2) {
        if (b6.a.b(this)) {
            return false;
        }
        try {
            return Pattern.compile(str).matcher(str2).find();
        } catch (Throwable th2) {
            b6.a.a(this, th2);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0052 A[Catch: all -> 0x007c, TryCatch #0 {all -> 0x007c, blocks: (B:5:0x000a, B:7:0x000f, B:31:0x005f, B:23:0x0045, B:26:0x004e, B:28:0x0052, B:33:0x0064, B:34:0x0069, B:15:0x002a, B:18:0x0034, B:20:0x0038, B:35:0x006a, B:36:0x006f, B:10:0x0019, B:12:0x001d, B:37:0x0070, B:38:0x0075, B:39:0x0076, B:40:0x007b), top: B:44:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005f A[Catch: all -> 0x007c, TryCatch #0 {all -> 0x007c, blocks: (B:5:0x000a, B:7:0x000f, B:31:0x005f, B:23:0x0045, B:26:0x004e, B:28:0x0052, B:33:0x0064, B:34:0x0069, B:15:0x002a, B:18:0x0034, B:20:0x0038, B:35:0x006a, B:36:0x006f, B:10:0x0019, B:12:0x001d, B:37:0x0070, B:38:0x0075, B:39:0x0076, B:40:0x007b), top: B:44:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0064 A[Catch: all -> 0x007c, TryCatch #0 {all -> 0x007c, blocks: (B:5:0x000a, B:7:0x000f, B:31:0x005f, B:23:0x0045, B:26:0x004e, B:28:0x0052, B:33:0x0064, B:34:0x0069, B:15:0x002a, B:18:0x0034, B:20:0x0038, B:35:0x006a, B:36:0x006f, B:10:0x0019, B:12:0x001d, B:37:0x0070, B:38:0x0075, B:39:0x0076, B:40:0x007b), top: B:44:0x000a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean j(String str, String str2, String str3) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        JSONObject optJSONObject3;
        JSONObject optJSONObject4;
        Map<String, String> map;
        if (b6.a.b(this)) {
            return false;
        }
        try {
            JSONObject jSONObject = f33812e;
            String str4 = null;
            if (jSONObject != null) {
                JSONObject optJSONObject5 = jSONObject.optJSONObject("rulesForLanguage");
                if (optJSONObject5 == null) {
                    optJSONObject = null;
                } else {
                    Map<String, String> map2 = f33809b;
                    if (map2 != null) {
                        optJSONObject = optJSONObject5.optJSONObject(map2.get("ENGLISH"));
                    } else {
                        i.q("languageInfo");
                        throw null;
                    }
                }
                if (optJSONObject != null && (optJSONObject2 = optJSONObject.optJSONObject("rulesForEvent")) != null) {
                    Map<String, String> map3 = f33810c;
                    if (map3 != null) {
                        optJSONObject3 = optJSONObject2.optJSONObject(map3.get(str));
                        if (optJSONObject3 != null && (optJSONObject4 = optJSONObject3.optJSONObject("positiveRules")) != null) {
                            map = f33811d;
                            if (map == null) {
                                str4 = optJSONObject4.optString(map.get(str2));
                            } else {
                                i.q("textTypeInfo");
                                throw null;
                            }
                        }
                        if (str4 != null) {
                            return false;
                        }
                        return i(str4, str3);
                    }
                    i.q("eventInfo");
                    throw null;
                }
                optJSONObject3 = null;
                if (optJSONObject3 != null) {
                    map = f33811d;
                    if (map == null) {
                    }
                }
                if (str4 != null) {
                }
            } else {
                i.q("rules");
                throw null;
            }
        } catch (Throwable th2) {
            b6.a.a(this, th2);
            return false;
        }
    }

    public final void k(float[] fArr, float[] fArr2) {
        if (b6.a.b(this)) {
            return;
        }
        try {
            int length = fArr.length - 1;
            if (length >= 0) {
                int i6 = 0;
                while (true) {
                    int i10 = i6 + 1;
                    fArr[i6] = fArr[i6] + fArr2[i6];
                    if (i10 <= length) {
                        i6 = i10;
                    } else {
                        return;
                    }
                }
            }
        } catch (Throwable th2) {
            b6.a.a(this, th2);
        }
    }

    public final void l(JSONObject jSONObject, StringBuilder sb2, StringBuilder sb3) {
        boolean z10;
        int length;
        if (b6.a.b(this)) {
            return;
        }
        try {
            String optString = jSONObject.optString("text", "");
            i.f(optString, "view.optString(TEXT_KEY, \"\")");
            String lowerCase = optString.toLowerCase();
            i.f(lowerCase, "(this as java.lang.String).toLowerCase()");
            String optString2 = jSONObject.optString("hint", "");
            i.f(optString2, "view.optString(HINT_KEY, \"\")");
            String lowerCase2 = optString2.toLowerCase();
            i.f(lowerCase2, "(this as java.lang.String).toLowerCase()");
            int i6 = 0;
            boolean z11 = true;
            if (lowerCase.length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                sb2.append(lowerCase);
                sb2.append(" ");
            }
            if (lowerCase2.length() <= 0) {
                z11 = false;
            }
            if (z11) {
                sb3.append(lowerCase2);
                sb3.append(" ");
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("childviews");
            if (optJSONArray == null || (length = optJSONArray.length()) <= 0) {
                return;
            }
            while (true) {
                int i10 = i6 + 1;
                try {
                    JSONObject currentChildView = optJSONArray.getJSONObject(i6);
                    i.f(currentChildView, "currentChildView");
                    l(currentChildView, sb2, sb3);
                } catch (JSONException unused) {
                }
                if (i10 < length) {
                    i6 = i10;
                } else {
                    return;
                }
            }
        } catch (Throwable th2) {
            b6.a.a(this, th2);
        }
    }
}
