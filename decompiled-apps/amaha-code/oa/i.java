package oa;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import c4.p;
import com.android.billingclient.api.Purchase;
import java.util.ArrayList;
import org.json.JSONException;
/* compiled from: com.android.billingclient:billing@@5.0.0 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final int f27330a = Runtime.getRuntime().availableProcessors();

    public static int a(Bundle bundle, String str) {
        if (bundle == null) {
            f(str, "Unexpected null bundle received!");
            return 6;
        }
        Object obj = bundle.get("RESPONSE_CODE");
        if (obj == null) {
            e(str, "getResponseCodeFromBundle() got null response code, assuming OK");
            return 0;
        } else if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        } else {
            f(str, "Unexpected type for bundle response code: ".concat(obj.getClass().getName()));
            return 6;
        }
    }

    public static Bundle b(String str, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putString("playBillingLibraryVersion", str);
        bundle.putBoolean("enablePendingPurchases", true);
        bundle.putString("SKU_DETAILS_RESPONSE_FORMAT", "PRODUCT_DETAILS");
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        boolean z10 = false;
        for (int i6 = 0; i6 < size; i6++) {
            p.b bVar = (p.b) arrayList.get(i6);
            arrayList2.add(null);
            z10 |= !TextUtils.isEmpty(null);
        }
        if (z10) {
            bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList2);
        }
        return bundle;
    }

    public static c4.g c(Intent intent, String str) {
        if (intent == null) {
            f("BillingHelper", "Got null intent!");
            c4.g gVar = new c4.g();
            gVar.f4918a = 6;
            gVar.f4919b = "An internal error occurred.";
            return gVar;
        }
        int a10 = a(intent.getExtras(), str);
        String d10 = d(intent.getExtras(), str);
        c4.g gVar2 = new c4.g();
        gVar2.f4918a = a10;
        gVar2.f4919b = d10;
        return gVar2;
    }

    public static String d(Bundle bundle, String str) {
        if (bundle == null) {
            f(str, "Unexpected null bundle received!");
            return "";
        }
        Object obj = bundle.get("DEBUG_MESSAGE");
        if (obj == null) {
            e(str, "getDebugMessageFromBundle() got null response code, assuming OK");
            return "";
        } else if (obj instanceof String) {
            return (String) obj;
        } else {
            f(str, "Unexpected type for debug message: ".concat(obj.getClass().getName()));
            return "";
        }
    }

    public static void e(String str, String str2) {
        if (Log.isLoggable(str, 2)) {
            if (!str2.isEmpty()) {
                int i6 = 40000;
                while (!str2.isEmpty() && i6 > 0) {
                    int min = Math.min(str2.length(), Math.min(4000, i6));
                    Log.v(str, str2.substring(0, min));
                    str2 = str2.substring(min);
                    i6 -= min;
                }
                return;
            }
            Log.v(str, str2);
        }
    }

    public static void f(String str, String str2) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2);
        }
    }

    public static void g(String str, String str2, Exception exc) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2, exc);
        }
    }

    public static Purchase h(String str, String str2) {
        if (str != null && str2 != null) {
            try {
                return new Purchase(str, str2);
            } catch (JSONException e10) {
                f("BillingHelper", "Got JSONException while parsing purchase data: ".concat(e10.toString()));
                return null;
            }
        }
        e("BillingHelper", "Received a null purchase data.");
        return null;
    }
}
