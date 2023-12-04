package com.ifriend.data.networking;

import android.content.Context;
import com.ifriend.common_utils.Logger;
import com.ifriend.core.remote.interceptors.TimeoutInterceptor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
/* compiled from: OkHttpClientProvider.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, d2 = {"Lcom/ifriend/data/networking/OkHttpClientProvider;", "", "()V", "provide", "Lokhttp3/OkHttpClient;", "context", "Landroid/content/Context;", "timeOut", "", "logger", "Lcom/ifriend/common_utils/Logger;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OkHttpClientProvider {
    public static final OkHttpClientProvider INSTANCE = new OkHttpClientProvider();

    private OkHttpClientProvider() {
    }

    public static /* synthetic */ OkHttpClient provide$default(OkHttpClientProvider okHttpClientProvider, Context context, long j, Logger logger, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 30;
        }
        return okHttpClientProvider.provide(context, j, logger);
    }

    public final OkHttpClient provide(Context context, long j, Logger logger) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(logger, "logger");
        return new OkHttpClient.Builder().addInterceptor(new LoggerInterceptor(null, null, logger, 3, null)).addInterceptor(new UserAgentHeaderInterceptor(context)).addInterceptor(new TimeoutInterceptor()).readTimeout(j, TimeUnit.SECONDS).writeTimeout(j, TimeUnit.SECONDS).build();
    }
}
