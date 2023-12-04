package com.ifriend.data.storages.config;

import android.content.Context;
import com.ifriend.data.BuildConfig;
import com.ifriend.data.networking.OkHttpClientProviderKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AppConfigStorageImpl.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ifriend/data/storages/config/AppConfigStorageImpl;", "Lcom/ifriend/data/storages/config/AppConfigStorage;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getApiUrl", "", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AppConfigStorageImpl implements AppConfigStorage {
    private final Context context;

    public AppConfigStorageImpl(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    @Override // com.ifriend.data.storages.config.AppConfigStorage
    public String getApiUrl() {
        String string = this.context.getSharedPreferences(OkHttpClientProviderKt.DEBUG_KEY, 0).getString(OkHttpClientProviderKt.API_URL_KEY, BuildConfig.API_URL);
        return string == null ? "" : string;
    }
}
