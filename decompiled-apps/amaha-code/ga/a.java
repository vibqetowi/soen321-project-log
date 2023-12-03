package ga;

import android.content.Context;
import android.content.SharedPreferences;
import c4.w;
import na.c;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static SharedPreferences f16393a;

    public static SharedPreferences a(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (SharedPreferences.class) {
            if (f16393a == null) {
                f16393a = (SharedPreferences) c.a(new w(1, context));
            }
            sharedPreferences = f16393a;
        }
        return sharedPreferences;
    }
}
