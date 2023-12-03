package od;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;
/* compiled from: KeysMap.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f27349a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final int f27350b = 64;

    /* renamed from: c  reason: collision with root package name */
    public final int f27351c;

    public b(int i6) {
        this.f27351c = i6;
    }

    public static String a(int i6, String str) {
        if (str != null) {
            String trim = str.trim();
            if (trim.length() > i6) {
                return trim.substring(0, i6);
            }
            return trim;
        }
        return str;
    }

    public final synchronized void b(Map<String, String> map) {
        String a10;
        int i6 = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            if (key != null) {
                String a11 = a(this.f27351c, key);
                if (this.f27349a.size() >= this.f27350b && !this.f27349a.containsKey(a11)) {
                    i6++;
                }
                String value = entry.getValue();
                HashMap hashMap = this.f27349a;
                if (value == null) {
                    a10 = "";
                } else {
                    a10 = a(this.f27351c, value);
                }
                hashMap.put(a11, a10);
            } else {
                throw new IllegalArgumentException("Custom attribute key must not be null.");
            }
        }
        if (i6 > 0) {
            Log.w("FirebaseCrashlytics", "Ignored " + i6 + " entries when adding custom keys. Maximum allowable: " + this.f27350b, null);
        }
    }
}
