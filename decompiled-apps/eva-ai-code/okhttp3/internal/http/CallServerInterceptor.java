package okhttp3.internal.http;

import java.io.IOException;
import java.net.ProtocolException;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.http2.ConnectionShutdownException;
import okio.BufferedSink;
import okio.Okio;
/* compiled from: CallServerInterceptor.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lokhttp3/internal/http/CallServerInterceptor;", "Lokhttp3/Interceptor;", "forWebSocket", "", "(Z)V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "shouldIgnoreAndWaitForRealResponse", "code", "", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CallServerInterceptor implements Interceptor {
    private final boolean forWebSocket;

    private final boolean shouldIgnoreAndWaitForRealResponse(int i) {
        if (i == 100) {
            return true;
        }
        return 102 <= i && i < 200;
    }

    public CallServerInterceptor(boolean z) {
        this.forWebSocket = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e2 A[Catch: IOException -> 0x019d, TryCatch #1 {IOException -> 0x019d, blocks: (B:39:0x00ab, B:41:0x00b4, B:42:0x00b8, B:44:0x00e2, B:46:0x00eb, B:47:0x00ee, B:48:0x0112, B:52:0x011d, B:54:0x013c, B:56:0x014a, B:63:0x0160, B:69:0x0173, B:73:0x0191, B:74:0x019b, B:72:0x0189, B:66:0x0169, B:58:0x0155, B:53:0x012c), top: B:85:0x00ab }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0169 A[Catch: IOException -> 0x019d, TryCatch #1 {IOException -> 0x019d, blocks: (B:39:0x00ab, B:41:0x00b4, B:42:0x00b8, B:44:0x00e2, B:46:0x00eb, B:47:0x00ee, B:48:0x0112, B:52:0x011d, B:54:0x013c, B:56:0x014a, B:63:0x0160, B:69:0x0173, B:73:0x0191, B:74:0x019b, B:72:0x0189, B:66:0x0169, B:58:0x0155, B:53:0x012c), top: B:85:0x00ab }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0173 A[Catch: IOException -> 0x019d, TryCatch #1 {IOException -> 0x019d, blocks: (B:39:0x00ab, B:41:0x00b4, B:42:0x00b8, B:44:0x00e2, B:46:0x00eb, B:47:0x00ee, B:48:0x0112, B:52:0x011d, B:54:0x013c, B:56:0x014a, B:63:0x0160, B:69:0x0173, B:73:0x0191, B:74:0x019b, B:72:0x0189, B:66:0x0169, B:58:0x0155, B:53:0x012c), top: B:85:0x00ab }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ab A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v26 */
    @Override // okhttp3.Interceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Response intercept(Interceptor.Chain chain) throws IOException {
        boolean z;
        Response.Builder builder;
        Response.Builder builder2;
        Response build;
        int code;
        Response build2;
        ResponseBody body;
        Object obj;
        Intrinsics.checkNotNullParameter(chain, "chain");
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        Exchange exchange$okhttp = realInterceptorChain.getExchange$okhttp();
        Intrinsics.checkNotNull(exchange$okhttp);
        Request request$okhttp = realInterceptorChain.getRequest$okhttp();
        RequestBody body2 = request$okhttp.body();
        long currentTimeMillis = System.currentTimeMillis();
        Long l = null;
        try {
            exchange$okhttp.writeRequestHeaders(request$okhttp);
            builder = HttpMethod.permitsRequestBody(request$okhttp.method());
            try {
                if (builder != 0 && body2 != null) {
                    if (StringsKt.equals("100-continue", request$okhttp.header("Expect"), true)) {
                        exchange$okhttp.flushRequest();
                        builder = exchange$okhttp.readResponseHeaders(true);
                        try {
                            exchange$okhttp.responseHeadersStart();
                            z = false;
                            obj = builder;
                        } catch (IOException e) {
                            e = e;
                            z = true;
                            if (e instanceof ConnectionShutdownException) {
                                throw e;
                            }
                            builder2 = builder;
                            if (!exchange$okhttp.getHasFailure$okhttp()) {
                                throw e;
                            }
                            if (builder2 == null) {
                            }
                            build = builder2.request(request$okhttp).handshake(exchange$okhttp.getConnection$okhttp().handshake()).sentRequestAtMillis(currentTimeMillis).receivedResponseAtMillis(System.currentTimeMillis()).build();
                            code = build.code();
                            if (shouldIgnoreAndWaitForRealResponse(code)) {
                            }
                            exchange$okhttp.responseHeadersEnd(build);
                            if (!this.forWebSocket) {
                            }
                            build2 = build.newBuilder().body(exchange$okhttp.openResponseBody(build)).build();
                            if (!StringsKt.equals("close", build2.request().header("Connection"), true)) {
                            }
                            exchange$okhttp.noNewExchangesOnConnection();
                            if (code != 204) {
                            }
                            body = build2.body();
                            if ((body != null ? -1L : body.contentLength()) > 0) {
                            }
                            return build2;
                        }
                    } else {
                        z = true;
                        obj = null;
                    }
                    if (obj == null) {
                        if (body2.isDuplex()) {
                            exchange$okhttp.flushRequest();
                            body2.writeTo(Okio.buffer(exchange$okhttp.createRequestBody(request$okhttp, true)));
                            builder = obj;
                        } else {
                            BufferedSink buffer = Okio.buffer(exchange$okhttp.createRequestBody(request$okhttp, false));
                            body2.writeTo(buffer);
                            buffer.close();
                            builder = obj;
                        }
                    } else {
                        exchange$okhttp.noRequestBody();
                        builder = obj;
                        if (!exchange$okhttp.getConnection$okhttp().isMultiplexed$okhttp()) {
                            exchange$okhttp.noNewExchangesOnConnection();
                            builder = obj;
                        }
                    }
                } else {
                    exchange$okhttp.noRequestBody();
                    z = true;
                    builder = 0;
                }
                if (body2 == null || !body2.isDuplex()) {
                    exchange$okhttp.finishRequest();
                }
                e = null;
                builder2 = builder;
            } catch (IOException e2) {
                e = e2;
            }
        } catch (IOException e3) {
            e = e3;
            z = true;
            builder = null;
        }
        if (builder2 == null) {
            try {
                builder2 = exchange$okhttp.readResponseHeaders(false);
                Intrinsics.checkNotNull(builder2);
                if (z) {
                    exchange$okhttp.responseHeadersStart();
                    z = false;
                }
            } catch (IOException e4) {
                if (e != null) {
                    ExceptionsKt.addSuppressed(e, e4);
                    throw e;
                }
                throw e4;
            }
        }
        build = builder2.request(request$okhttp).handshake(exchange$okhttp.getConnection$okhttp().handshake()).sentRequestAtMillis(currentTimeMillis).receivedResponseAtMillis(System.currentTimeMillis()).build();
        code = build.code();
        if (shouldIgnoreAndWaitForRealResponse(code)) {
            Response.Builder readResponseHeaders = exchange$okhttp.readResponseHeaders(false);
            Intrinsics.checkNotNull(readResponseHeaders);
            if (z) {
                exchange$okhttp.responseHeadersStart();
            }
            build = readResponseHeaders.request(request$okhttp).handshake(exchange$okhttp.getConnection$okhttp().handshake()).sentRequestAtMillis(currentTimeMillis).receivedResponseAtMillis(System.currentTimeMillis()).build();
            code = build.code();
        }
        exchange$okhttp.responseHeadersEnd(build);
        if (!this.forWebSocket && code == 101) {
            build2 = build.newBuilder().body(Util.EMPTY_RESPONSE).build();
        } else {
            build2 = build.newBuilder().body(exchange$okhttp.openResponseBody(build)).build();
        }
        if (!StringsKt.equals("close", build2.request().header("Connection"), true) || StringsKt.equals("close", Response.header$default(build2, "Connection", null, 2, null), true)) {
            exchange$okhttp.noNewExchangesOnConnection();
        }
        if (code != 204 || code == 205) {
            body = build2.body();
            if ((body != null ? -1L : body.contentLength()) > 0) {
                StringBuilder sb = new StringBuilder("HTTP ");
                sb.append(code);
                sb.append(" had non-zero Content-Length: ");
                ResponseBody body3 = build2.body();
                if (body3 != null) {
                    l = Long.valueOf(body3.contentLength());
                }
                sb.append(l);
                throw new ProtocolException(sb.toString());
            }
        }
        return build2;
    }
}
