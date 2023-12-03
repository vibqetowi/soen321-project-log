package h5;

import android.content.SharedPreferences;
/* compiled from: AccessTokenCache.kt */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f17187a;

    /* compiled from: AccessTokenCache.kt */
    /* loaded from: classes.dex */
    public static final class a {
    }

    public b() {
        SharedPreferences sharedPreferences = p.a().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);
        kotlin.jvm.internal.i.f(sharedPreferences, "FacebookSdk.getApplicationContext()\n              .getSharedPreferences(\n                  AccessTokenManager.SHARED_PREFERENCES_NAME, Context.MODE_PRIVATE)");
        new a();
        this.f17187a = sharedPreferences;
    }
}
