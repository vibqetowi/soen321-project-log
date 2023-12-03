package h5;

import android.content.SharedPreferences;
/* compiled from: ProfileCache.kt */
/* loaded from: classes.dex */
public final class y {

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f17335a;

    public y() {
        SharedPreferences sharedPreferences = p.a().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);
        kotlin.jvm.internal.i.f(sharedPreferences, "FacebookSdk.getApplicationContext()\n            .getSharedPreferences(SHARED_PREFERENCES_NAME, Context.MODE_PRIVATE)");
        this.f17335a = sharedPreferences;
    }
}
