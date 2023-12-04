package com.ifriend.core.remote.interceptors;

import com.ifriend.core.remote.common.ApiServiceConst;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
/* compiled from: TimeoutInterceptor.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/ifriend/core/remote/interceptors/TimeoutInterceptor;", "Lokhttp3/Interceptor;", "()V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "remote-datasource"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TimeoutInterceptor implements Interceptor {
    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Request request = chain.request();
        String header = request.header(ApiServiceConst.HTTP_WRITE_TIMEOUT);
        int parseInt = header != null ? Integer.parseInt(header) : 0;
        if (parseInt > 0) {
            return chain.withWriteTimeout(parseInt, TimeUnit.SECONDS).proceed(request.newBuilder().removeHeader(ApiServiceConst.HTTP_WRITE_TIMEOUT).build());
        }
        return chain.proceed(request);
    }
}
