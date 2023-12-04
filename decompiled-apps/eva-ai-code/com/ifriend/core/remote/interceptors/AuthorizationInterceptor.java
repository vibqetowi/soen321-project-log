package com.ifriend.core.remote.interceptors;

import com.ifriend.core.common.exception.IOWrapperException;
import com.ifriend.core.local.api.AuthLocalDataSource;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
/* compiled from: AuthorizationInterceptor.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/ifriend/core/remote/interceptors/AuthorizationInterceptor;", "Lokhttp3/Interceptor;", "authLocalDataSource", "Lcom/ifriend/core/local/api/AuthLocalDataSource;", "(Lcom/ifriend/core/local/api/AuthLocalDataSource;)V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "Companion", "remote-datasource"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AuthorizationInterceptor implements Interceptor {
    private static final String AUTHORIZATION_SCHEME = "Token token=";
    public static final Companion Companion = new Companion(null);
    private static final String HEADER_AUTHORIZATION = "Authorization";
    private final AuthLocalDataSource authLocalDataSource;

    @Inject
    public AuthorizationInterceptor(AuthLocalDataSource authLocalDataSource) {
        Intrinsics.checkNotNullParameter(authLocalDataSource, "authLocalDataSource");
        this.authLocalDataSource = authLocalDataSource;
    }

    /* compiled from: AuthorizationInterceptor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ifriend/core/remote/interceptors/AuthorizationInterceptor$Companion;", "", "()V", "AUTHORIZATION_SCHEME", "", "HEADER_AUTHORIZATION", "remote-datasource"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        Object m7271constructorimpl;
        Object runBlocking$default;
        Intrinsics.checkNotNullParameter(chain, "chain");
        Request request = chain.request();
        try {
            Result.Companion companion = Result.Companion;
            AuthorizationInterceptor authorizationInterceptor = this;
            runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new AuthorizationInterceptor$intercept$accessToken$1$1(this, null), 1, null);
            m7271constructorimpl = Result.m7271constructorimpl((String) runBlocking$default);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m7271constructorimpl = Result.m7271constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m7274exceptionOrNullimpl = Result.m7274exceptionOrNullimpl(m7271constructorimpl);
        if (m7274exceptionOrNullimpl != null) {
            throw new IOWrapperException(m7274exceptionOrNullimpl);
        }
        Request.Builder newBuilder = request.newBuilder();
        return chain.proceed(newBuilder.addHeader("Authorization", "Token token=\"" + ((String) m7271constructorimpl) + "\"").build());
    }
}
