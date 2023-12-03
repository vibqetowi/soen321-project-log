package h5;

import android.util.Log;
import androidx.recyclerview.widget.k;
import com.facebook.FacebookException;
import h5.a;
import h5.f;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
import w5.v;
/* compiled from: GraphResponse.kt */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ int f17315e = 0;

    /* renamed from: a  reason: collision with root package name */
    public final HttpURLConnection f17316a;

    /* renamed from: b  reason: collision with root package name */
    public final JSONObject f17317b;

    /* renamed from: c  reason: collision with root package name */
    public final n f17318c;

    /* renamed from: d  reason: collision with root package name */
    public final JSONObject f17319d;

    /* compiled from: GraphResponse.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public static ArrayList a(List requests, HttpURLConnection httpURLConnection, FacebookException facebookException) {
            kotlin.jvm.internal.i.g(requests, "requests");
            ArrayList arrayList = new ArrayList(is.i.H1(requests, 10));
            Iterator it = requests.iterator();
            while (it.hasNext()) {
                arrayList.add(new u((q) it.next(), httpURLConnection, new n(facebookException)));
            }
            return arrayList;
        }

        /* JADX WARN: Removed duplicated region for block: B:48:0x00e0 A[Catch: JSONException -> 0x011e, TryCatch #0 {JSONException -> 0x011e, blocks: (B:5:0x0018, B:7:0x001e, B:9:0x0028, B:11:0x002c, B:14:0x0038, B:48:0x00e0, B:35:0x007c, B:32:0x0072, B:29:0x0068, B:26:0x0060, B:23:0x0059, B:20:0x004f, B:17:0x0045, B:36:0x0083, B:39:0x0090, B:41:0x0099, B:45:0x00b0, B:56:0x00fa, B:58:0x010c, B:59:0x0112), top: B:101:0x0018 }] */
        /* JADX WARN: Removed duplicated region for block: B:64:0x0122  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x01b9  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static u b(q request, HttpURLConnection httpURLConnection, Object obj, Object obj2) {
            n nVar;
            Boolean valueOf;
            h5.a aVar;
            boolean z10;
            n nVar2;
            String optString;
            int optInt;
            String str;
            boolean z11;
            String str2;
            String str3;
            boolean z12;
            int i6;
            String str4;
            String str5;
            String str6;
            String str7;
            boolean z13;
            Object NULL = obj;
            if (NULL instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) NULL;
                boolean z14 = false;
                if (jSONObject.has("code")) {
                    int i10 = jSONObject.getInt("code");
                    Object t3 = w5.e0.t("body", "FACEBOOK_NON_JSON_RESULT", jSONObject);
                    if (t3 != null && (t3 instanceof JSONObject)) {
                        int i11 = -1;
                        if (((JSONObject) t3).has("error")) {
                            JSONObject jSONObject2 = (JSONObject) w5.e0.t("error", null, (JSONObject) t3);
                            if (jSONObject2 == null) {
                                str = null;
                            } else {
                                str = jSONObject2.optString("type", null);
                            }
                            if (jSONObject2 == null) {
                                optString = null;
                            } else {
                                optString = jSONObject2.optString("message", null);
                            }
                            if (jSONObject2 == null) {
                                optInt = -1;
                            } else {
                                optInt = jSONObject2.optInt("code", -1);
                            }
                            if (jSONObject2 != null) {
                                i11 = jSONObject2.optInt("error_subcode", -1);
                            }
                            if (jSONObject2 == null) {
                                str3 = null;
                            } else {
                                str3 = jSONObject2.optString("error_user_msg", null);
                            }
                            if (jSONObject2 == null) {
                                str2 = null;
                            } else {
                                str2 = jSONObject2.optString("error_user_title", null);
                            }
                            if (jSONObject2 == null) {
                                z11 = false;
                            } else {
                                z11 = jSONObject2.optBoolean("is_transient", false);
                            }
                        } else {
                            if (!((JSONObject) t3).has("error_code") && !((JSONObject) t3).has("error_msg") && !((JSONObject) t3).has("error_reason")) {
                                z12 = false;
                                i6 = -1;
                                str4 = null;
                                str5 = null;
                                str6 = null;
                                str7 = null;
                                z13 = false;
                                if (z12) {
                                    JSONObject jSONObject3 = (JSONObject) t3;
                                    nVar2 = new n(i10, i11, i6, str4, str5, str6, str7, obj2, null, z13);
                                    nVar = nVar2;
                                    if (nVar != null) {
                                        int i12 = u.f17315e;
                                        Log.e("h5.u", nVar.toString());
                                        if (nVar.f17260v == 190) {
                                            w5.e0 e0Var = w5.e0.f36453a;
                                            h5.a aVar2 = request.f17290a;
                                            if (aVar2 != null) {
                                                Date date = h5.a.F;
                                                if (kotlin.jvm.internal.i.b(aVar2, a.b.b())) {
                                                    z14 = true;
                                                }
                                            }
                                            if (z14) {
                                                int i13 = nVar.f17261w;
                                                f.a aVar3 = f.f;
                                                if (i13 != 493) {
                                                    Date date2 = h5.a.F;
                                                    aVar3.a().c(null, true);
                                                } else {
                                                    Date date3 = h5.a.F;
                                                    h5.a b10 = a.b.b();
                                                    if (b10 == null) {
                                                        valueOf = null;
                                                    } else {
                                                        valueOf = Boolean.valueOf(new Date().after(b10.f17176u));
                                                    }
                                                    if (kotlin.jvm.internal.i.b(valueOf, Boolean.FALSE) && (aVar = aVar3.a().f17216c) != null) {
                                                        aVar3.a().c(new h5.a(aVar.f17180y, aVar.B, aVar.C, aVar.f17177v, aVar.f17178w, aVar.f17179x, aVar.f17181z, new Date(), new Date(), aVar.D), true);
                                                    }
                                                }
                                            }
                                        }
                                        return new u(request, httpURLConnection, nVar);
                                    }
                                    Object t10 = w5.e0.t("body", "FACEBOOK_NON_JSON_RESULT", jSONObject);
                                    if (t10 instanceof JSONObject) {
                                        JSONObject jSONObject4 = (JSONObject) t10;
                                        return new u(request, httpURLConnection, jSONObject4.toString(), jSONObject4);
                                    } else if (t10 instanceof JSONArray) {
                                        JSONArray jSONArray = (JSONArray) t10;
                                        String rawResponse = jSONArray.toString();
                                        kotlin.jvm.internal.i.g(request, "request");
                                        kotlin.jvm.internal.i.g(rawResponse, "rawResponse");
                                        return new u(request, httpURLConnection, null, jSONArray, null);
                                    } else {
                                        NULL = JSONObject.NULL;
                                        kotlin.jvm.internal.i.f(NULL, "NULL");
                                    }
                                }
                            }
                            String optString2 = ((JSONObject) t3).optString("error_reason", null);
                            optString = ((JSONObject) t3).optString("error_msg", null);
                            optInt = ((JSONObject) t3).optInt("error_code", -1);
                            i11 = ((JSONObject) t3).optInt("error_subcode", -1);
                            str = optString2;
                            z11 = false;
                            str2 = null;
                            str3 = null;
                        }
                        z13 = z11;
                        str4 = str;
                        str6 = str2;
                        str5 = optString;
                        str7 = str3;
                        z12 = true;
                        i6 = i11;
                        i11 = optInt;
                        if (z12) {
                        }
                    }
                    if (i10 <= 299 && 200 <= i10) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        if (jSONObject.has("body")) {
                            JSONObject jSONObject5 = (JSONObject) w5.e0.t("body", "FACEBOOK_NON_JSON_RESULT", jSONObject);
                        }
                        nVar2 = new n(i10, -1, -1, null, null, null, null, obj2, null, false);
                        nVar = nVar2;
                        if (nVar != null) {
                        }
                    }
                }
                nVar = null;
                if (nVar != null) {
                }
            }
            if (NULL == JSONObject.NULL) {
                return new u(request, httpURLConnection, NULL.toString(), null);
            }
            throw new FacebookException(kotlin.jvm.internal.i.n(NULL.getClass().getSimpleName(), "Got unexpected object type in response, class: "));
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0074  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static ArrayList c(InputStream inputStream, HttpURLConnection httpURLConnection, t requests) {
            JSONArray jSONArray;
            int responseCode;
            kotlin.jvm.internal.i.g(requests, "requests");
            String I = w5.e0.I(inputStream);
            v.a aVar = w5.v.f36544d;
            p.i(w.INCLUDE_RAW_RESPONSES);
            Object resultObject = new JSONTokener(I).nextValue();
            kotlin.jvm.internal.i.f(resultObject, "resultObject");
            int size = requests.size();
            ArrayList arrayList = new ArrayList(size);
            int i6 = 0;
            if (size == 1) {
                q qVar = (q) requests.get(0);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("body", resultObject);
                    if (httpURLConnection == null) {
                        responseCode = k.d.DEFAULT_DRAG_ANIMATION_DURATION;
                    } else {
                        responseCode = httpURLConnection.getResponseCode();
                    }
                    jSONObject.put("code", responseCode);
                    JSONArray jSONArray2 = new JSONArray();
                    jSONArray2.put(jSONObject);
                    jSONArray = jSONArray2;
                } catch (IOException e10) {
                    arrayList.add(new u(qVar, httpURLConnection, new n(e10)));
                } catch (JSONException e11) {
                    arrayList.add(new u(qVar, httpURLConnection, new n(e11)));
                }
                if (jSONArray instanceof JSONArray) {
                    JSONArray jSONArray3 = (JSONArray) jSONArray;
                    if (jSONArray3.length() == size) {
                        int length = jSONArray3.length();
                        if (length > 0) {
                            while (true) {
                                int i10 = i6 + 1;
                                q qVar2 = (q) requests.get(i6);
                                try {
                                    Object obj = ((JSONArray) jSONArray).get(i6);
                                    kotlin.jvm.internal.i.f(obj, "obj");
                                    arrayList.add(b(qVar2, httpURLConnection, obj, resultObject));
                                } catch (FacebookException e12) {
                                    arrayList.add(new u(qVar2, httpURLConnection, new n(e12)));
                                } catch (JSONException e13) {
                                    arrayList.add(new u(qVar2, httpURLConnection, new n(e13)));
                                }
                                if (i10 >= length) {
                                    break;
                                }
                                i6 = i10;
                            }
                        }
                        v.a aVar2 = w5.v.f36544d;
                        p.i(w.REQUESTS);
                        return arrayList;
                    }
                }
                throw new FacebookException("Unexpected number of results");
            }
            jSONArray = resultObject;
            if (jSONArray instanceof JSONArray) {
            }
            throw new FacebookException("Unexpected number of results");
        }
    }

    public u(q request, HttpURLConnection httpURLConnection, JSONObject jSONObject, JSONArray jSONArray, n nVar) {
        kotlin.jvm.internal.i.g(request, "request");
        this.f17316a = httpURLConnection;
        this.f17317b = jSONObject;
        this.f17318c = nVar;
        this.f17319d = jSONObject;
    }

    public final String toString() {
        String str;
        int responseCode;
        try {
            Locale locale = Locale.US;
            Object[] objArr = new Object[1];
            HttpURLConnection httpURLConnection = this.f17316a;
            if (httpURLConnection == null) {
                responseCode = k.d.DEFAULT_DRAG_ANIMATION_DURATION;
            } else {
                responseCode = httpURLConnection.getResponseCode();
            }
            objArr[0] = Integer.valueOf(responseCode);
            str = String.format(locale, "%d", Arrays.copyOf(objArr, 1));
            kotlin.jvm.internal.i.f(str, "java.lang.String.format(locale, format, *args)");
        } catch (IOException unused) {
            str = "unknown";
        }
        StringBuilder g5 = defpackage.d.g("{Response:  responseCode: ", str, ", graphObject: ");
        g5.append(this.f17317b);
        g5.append(", error: ");
        g5.append(this.f17318c);
        g5.append("}");
        String sb2 = g5.toString();
        kotlin.jvm.internal.i.f(sb2, "StringBuilder()\n        .append(\"{Response: \")\n        .append(\" responseCode: \")\n        .append(responseCode)\n        .append(\", graphObject: \")\n        .append(graphObject)\n        .append(\", error: \")\n        .append(error)\n        .append(\"}\")\n        .toString()");
        return sb2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public u(q request, HttpURLConnection httpURLConnection, String rawResponse, JSONObject jSONObject) {
        this(request, httpURLConnection, jSONObject, null, null);
        kotlin.jvm.internal.i.g(request, "request");
        kotlin.jvm.internal.i.g(rawResponse, "rawResponse");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public u(q request, HttpURLConnection httpURLConnection, n nVar) {
        this(request, httpURLConnection, null, null, nVar);
        kotlin.jvm.internal.i.g(request, "request");
    }
}
