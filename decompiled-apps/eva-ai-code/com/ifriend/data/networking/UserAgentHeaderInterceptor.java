package com.ifriend.data.networking;

import android.content.Context;
import android.os.Build;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.ifriend.domain.config.ConfigKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.OkHttp;
import okhttp3.Response;
/* compiled from: OkHttpClientProvider.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\u0006X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\bR\u0014\u0010\r\u001a\u00020\u0006X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\bR\u0019\u0010\u000f\u001a\n \u0010*\u0004\u0018\u00010\u00060\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/ifriend/data/networking/UserAgentHeaderInterceptor;", "Lokhttp3/Interceptor;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "UserAgentValue", "", "getUserAgentValue", "()Ljava/lang/String;", ConfigKeys.CURRENT_DEVICE, "getCurrentDevice", ConfigKeys.HTTP_ENGINE, "getHttpEngine", ConfigKeys.PRODUCT_NAME, "getProductName", "productVersion", "kotlin.jvm.PlatformType", "getProductVersion", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UserAgentHeaderInterceptor implements Interceptor {
    private final String UserAgentValue;
    private final String currentDevice;
    private final String httpEngine;
    private final String productName;
    private final String productVersion;

    public UserAgentHeaderInterceptor(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.productName = "iFriend";
        String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        this.productVersion = str;
        String str2 = "Android/" + Build.VERSION.RELEASE + "; " + Build.MANUFACTURER + " " + Build.MODEL;
        this.currentDevice = str2;
        this.httpEngine = OkHttp.VERSION;
        this.UserAgentValue = "Dating/1.0.0 iFriend" + RemoteSettings.FORWARD_SLASH_STRING + str + " (" + str2 + ") " + OkHttp.VERSION;
    }

    public final String getProductName() {
        return this.productName;
    }

    public final String getProductVersion() {
        return this.productVersion;
    }

    public final String getCurrentDevice() {
        return this.currentDevice;
    }

    public final String getHttpEngine() {
        return this.httpEngine;
    }

    public final String getUserAgentValue() {
        return this.UserAgentValue;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        return chain.proceed(chain.request().newBuilder().addHeader("user-agent", this.UserAgentValue).build());
    }
}
