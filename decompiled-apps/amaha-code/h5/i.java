package h5;

import android.content.SharedPreferences;
/* compiled from: AuthenticationTokenCache.kt */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f17249a;

    public i() {
        SharedPreferences sharedPreferences = p.a().getSharedPreferences("com.facebook.AuthenticationTokenManager.SharedPreferences", 0);
        kotlin.jvm.internal.i.f(sharedPreferences, "FacebookSdk.getApplicationContext()\n              .getSharedPreferences(\n                  AuthenticationTokenManager.SHARED_PREFERENCES_NAME, Context.MODE_PRIVATE)");
        this.f17249a = sharedPreferences;
    }
}
