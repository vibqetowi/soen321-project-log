package ta;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class f3 {

    /* renamed from: a  reason: collision with root package name */
    public final String f32556a;

    /* renamed from: b  reason: collision with root package name */
    public final Bundle f32557b;

    /* renamed from: c  reason: collision with root package name */
    public Bundle f32558c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ j3 f32559d;

    public f3(j3 j3Var) {
        this.f32559d = j3Var;
        v9.o.e("default_event_parameters");
        this.f32556a = "default_event_parameters";
        this.f32557b = new Bundle();
    }

    public final Bundle a() {
        char c10;
        if (this.f32558c == null) {
            j3 j3Var = this.f32559d;
            String string = j3Var.l().getString(this.f32556a, null);
            if (string != null) {
                try {
                    Bundle bundle = new Bundle();
                    JSONArray jSONArray = new JSONArray(string);
                    for (int i6 = 0; i6 < jSONArray.length(); i6++) {
                        try {
                            JSONObject jSONObject = jSONArray.getJSONObject(i6);
                            String string2 = jSONObject.getString("n");
                            String string3 = jSONObject.getString("t");
                            int hashCode = string3.hashCode();
                            if (hashCode != 100) {
                                if (hashCode != 108) {
                                    if (hashCode == 115 && string3.equals("s")) {
                                        c10 = 0;
                                    }
                                    c10 = 65535;
                                } else {
                                    if (string3.equals("l")) {
                                        c10 = 2;
                                    }
                                    c10 = 65535;
                                }
                            } else {
                                if (string3.equals("d")) {
                                    c10 = 1;
                                }
                                c10 = 65535;
                            }
                            if (c10 != 0) {
                                if (c10 != 1) {
                                    if (c10 != 2) {
                                        w2 w2Var = j3Var.f32943u.C;
                                        y3.k(w2Var);
                                        w2Var.f32925z.c(string3, "Unrecognized persisted bundle type. Type");
                                    } else {
                                        bundle.putLong(string2, Long.parseLong(jSONObject.getString("v")));
                                    }
                                } else {
                                    bundle.putDouble(string2, Double.parseDouble(jSONObject.getString("v")));
                                }
                            } else {
                                bundle.putString(string2, jSONObject.getString("v"));
                            }
                        } catch (NumberFormatException | JSONException unused) {
                            w2 w2Var2 = j3Var.f32943u.C;
                            y3.k(w2Var2);
                            w2Var2.f32925z.b("Error reading value from SharedPreferences. Value dropped");
                        }
                    }
                    this.f32558c = bundle;
                } catch (JSONException unused2) {
                    w2 w2Var3 = j3Var.f32943u.C;
                    y3.k(w2Var3);
                    w2Var3.f32925z.b("Error loading bundle from SharedPreferences. Values will be lost");
                }
            }
            if (this.f32558c == null) {
                this.f32558c = this.f32557b;
            }
        }
        return this.f32558c;
    }

    public final void b(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        j3 j3Var = this.f32559d;
        SharedPreferences.Editor edit = j3Var.l().edit();
        int size = bundle.size();
        String str = this.f32556a;
        if (size == 0) {
            edit.remove(str);
        } else {
            JSONArray jSONArray = new JSONArray();
            for (String str2 : bundle.keySet()) {
                Object obj = bundle.get(str2);
                if (obj != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("n", str2);
                        jSONObject.put("v", obj.toString());
                        if (obj instanceof String) {
                            jSONObject.put("t", "s");
                        } else if (obj instanceof Long) {
                            jSONObject.put("t", "l");
                        } else if (obj instanceof Double) {
                            jSONObject.put("t", "d");
                        } else {
                            w2 w2Var = j3Var.f32943u.C;
                            y3.k(w2Var);
                            w2Var.f32925z.c(obj.getClass(), "Cannot serialize bundle value to SharedPreferences. Type");
                        }
                        jSONArray.put(jSONObject);
                    } catch (JSONException e10) {
                        w2 w2Var2 = j3Var.f32943u.C;
                        y3.k(w2Var2);
                        w2Var2.f32925z.c(e10, "Cannot serialize bundle value to SharedPreferences");
                    }
                }
            }
            edit.putString(str, jSONArray.toString());
        }
        edit.apply();
        this.f32558c = bundle;
    }
}
