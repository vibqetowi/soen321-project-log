package com.ifriend.data.networking;

import com.facebook.share.internal.ShareConstants;
import com.ifriend.common_utils.Logger;
import java.net.SocketTimeoutException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
/* compiled from: OkHttpClientProvider.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\rB!\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ifriend/data/networking/LoggerInterceptor;", "Lokhttp3/Interceptor;", "requestToLog", "Lcom/ifriend/data/networking/RequestToLogMapper;", "responseToLog", "Lcom/ifriend/data/networking/ResponseToLogMapper;", "logger", "Lcom/ifriend/common_utils/Logger;", "(Lcom/ifriend/data/networking/RequestToLogMapper;Lcom/ifriend/data/networking/ResponseToLogMapper;Lcom/ifriend/common_utils/Logger;)V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "InterceptedTimeoutException", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LoggerInterceptor implements Interceptor {
    private final Logger logger;
    private final RequestToLogMapper requestToLog;
    private final ResponseToLogMapper responseToLog;

    public LoggerInterceptor(RequestToLogMapper requestToLog, ResponseToLogMapper responseToLog, Logger logger) {
        Intrinsics.checkNotNullParameter(requestToLog, "requestToLog");
        Intrinsics.checkNotNullParameter(responseToLog, "responseToLog");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.requestToLog = requestToLog;
        this.responseToLog = responseToLog;
        this.logger = logger;
    }

    public /* synthetic */ LoggerInterceptor(RequestToLogMapper requestToLogMapper, ResponseToLogMapper responseToLogMapper, Logger logger, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new RequestToLogMapper() : requestToLogMapper, (i & 2) != 0 ? new ResponseToLogMapper() : responseToLogMapper, logger);
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Request request = chain.request();
        this.logger.log(this.requestToLog.map(request));
        try {
            Response proceed = chain.proceed(request);
            this.logger.log(this.responseToLog.map(request, proceed));
            return proceed;
        } catch (SocketTimeoutException e) {
            Logger logger = this.logger;
            HttpUrl url = request.url();
            logger.logException(new InterceptedTimeoutException("Timeout in " + url, e));
            throw e;
        }
    }

    /* compiled from: OkHttpClientProvider.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ifriend/data/networking/LoggerInterceptor$InterceptedTimeoutException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "", "parent", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class InterceptedTimeoutException extends Exception {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InterceptedTimeoutException(String message, Throwable parent) {
            super(message, parent);
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(parent, "parent");
        }
    }
}
