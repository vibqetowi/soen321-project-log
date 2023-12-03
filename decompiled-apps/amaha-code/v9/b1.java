package v9;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes.dex */
public final class b1 {

    /* renamed from: e  reason: collision with root package name */
    public static final Uri f34849e = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* renamed from: a  reason: collision with root package name */
    public final String f34850a;

    /* renamed from: b  reason: collision with root package name */
    public final String f34851b;

    /* renamed from: c  reason: collision with root package name */
    public final int f34852c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f34853d;

    public b1(int i6, String str, String str2, boolean z10) {
        o.e(str);
        this.f34850a = str;
        o.e(str2);
        this.f34851b = str2;
        this.f34852c = i6;
        this.f34853d = z10;
    }

    public final Intent a(Context context) {
        Bundle bundle;
        Intent intent = null;
        String str = this.f34850a;
        if (str != null) {
            if (this.f34853d) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("serviceActionBundleKey", str);
                try {
                    bundle = context.getContentResolver().call(f34849e, "serviceIntentCall", (String) null, bundle2);
                } catch (IllegalArgumentException e10) {
                    Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e10.toString()));
                    bundle = null;
                }
                if (bundle != null) {
                    intent = (Intent) bundle.getParcelable("serviceResponseIntentKey");
                }
                if (intent == null) {
                    Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action: ".concat(String.valueOf(str)));
                }
            }
            if (intent == null) {
                return new Intent(str).setPackage(this.f34851b);
            }
            return intent;
        }
        return new Intent().setComponent(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj;
        if (m.a(this.f34850a, b1Var.f34850a) && m.a(this.f34851b, b1Var.f34851b) && m.a(null, null) && this.f34852c == b1Var.f34852c && this.f34853d == b1Var.f34853d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f34850a, this.f34851b, null, Integer.valueOf(this.f34852c), Boolean.valueOf(this.f34853d)});
    }

    public final String toString() {
        String str = this.f34850a;
        if (str != null) {
            return str;
        }
        o.h(null);
        throw null;
    }
}
