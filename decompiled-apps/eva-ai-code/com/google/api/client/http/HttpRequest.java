package com.google.api.client.http;

import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.api.client.util.LoggingStreamingContent;
import com.google.api.client.util.ObjectParser;
import com.google.api.client.util.Preconditions;
import com.google.api.client.util.Sleeper;
import com.google.api.client.util.StringUtils;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import io.opencensus.common.Scope;
import io.opencensus.contrib.http.util.HttpTraceAttributeConstants;
import io.opencensus.trace.AttributeValue;
import io.opencensus.trace.Span;
import io.opencensus.trace.Tracer;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.logging.Level;
import java.util.logging.Logger;
/* loaded from: classes7.dex */
public final class HttpRequest {
    public static final int DEFAULT_NUMBER_OF_RETRIES = 10;
    public static final String USER_AGENT_SUFFIX;
    public static final String VERSION;
    @Deprecated
    private BackOffPolicy backOffPolicy;
    private HttpContent content;
    private HttpEncoding encoding;
    private HttpExecuteInterceptor executeInterceptor;
    private HttpIOExceptionHandler ioExceptionHandler;
    private ObjectParser objectParser;
    private String requestMethod;
    private HttpResponseInterceptor responseInterceptor;
    private boolean suppressUserAgentSuffix;
    private final HttpTransport transport;
    private HttpUnsuccessfulResponseHandler unsuccessfulResponseHandler;
    private GenericUrl url;
    private HttpHeaders headers = new HttpHeaders();
    private HttpHeaders responseHeaders = new HttpHeaders();
    private int numRetries = 10;
    private int contentLoggingLimit = 16384;
    private boolean loggingEnabled = true;
    private boolean curlLoggingEnabled = true;
    private int connectTimeout = AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH;
    private int readTimeout = AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH;
    private int writeTimeout = 0;
    private boolean followRedirects = true;
    private boolean useRawRedirectUrls = false;
    private boolean throwExceptionOnExecuteError = true;
    @Deprecated
    private boolean retryOnExecuteIOException = false;
    private Sleeper sleeper = Sleeper.DEFAULT;
    private final Tracer tracer = OpenCensusUtils.getTracer();
    private boolean responseReturnRawInputStream = false;

    static {
        String version = getVersion();
        VERSION = version;
        USER_AGENT_SUFFIX = "Google-HTTP-Java-Client/" + version + " (gzip)";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public HttpRequest(HttpTransport httpTransport, String str) {
        this.transport = httpTransport;
        setRequestMethod(str);
    }

    public HttpTransport getTransport() {
        return this.transport;
    }

    public String getRequestMethod() {
        return this.requestMethod;
    }

    public HttpRequest setRequestMethod(String str) {
        Preconditions.checkArgument(str == null || HttpMediaType.matchesToken(str));
        this.requestMethod = str;
        return this;
    }

    public GenericUrl getUrl() {
        return this.url;
    }

    public HttpRequest setUrl(GenericUrl genericUrl) {
        this.url = (GenericUrl) Preconditions.checkNotNull(genericUrl);
        return this;
    }

    public HttpContent getContent() {
        return this.content;
    }

    public HttpRequest setContent(HttpContent httpContent) {
        this.content = httpContent;
        return this;
    }

    public HttpEncoding getEncoding() {
        return this.encoding;
    }

    public HttpRequest setEncoding(HttpEncoding httpEncoding) {
        this.encoding = httpEncoding;
        return this;
    }

    @Deprecated
    public BackOffPolicy getBackOffPolicy() {
        return this.backOffPolicy;
    }

    @Deprecated
    public HttpRequest setBackOffPolicy(BackOffPolicy backOffPolicy) {
        this.backOffPolicy = backOffPolicy;
        return this;
    }

    public int getContentLoggingLimit() {
        return this.contentLoggingLimit;
    }

    public HttpRequest setContentLoggingLimit(int i) {
        Preconditions.checkArgument(i >= 0, "The content logging limit must be non-negative.");
        this.contentLoggingLimit = i;
        return this;
    }

    public boolean isLoggingEnabled() {
        return this.loggingEnabled;
    }

    public HttpRequest setLoggingEnabled(boolean z) {
        this.loggingEnabled = z;
        return this;
    }

    public boolean isCurlLoggingEnabled() {
        return this.curlLoggingEnabled;
    }

    public HttpRequest setCurlLoggingEnabled(boolean z) {
        this.curlLoggingEnabled = z;
        return this;
    }

    public int getConnectTimeout() {
        return this.connectTimeout;
    }

    public HttpRequest setConnectTimeout(int i) {
        Preconditions.checkArgument(i >= 0);
        this.connectTimeout = i;
        return this;
    }

    public int getReadTimeout() {
        return this.readTimeout;
    }

    public HttpRequest setReadTimeout(int i) {
        Preconditions.checkArgument(i >= 0);
        this.readTimeout = i;
        return this;
    }

    public int getWriteTimeout() {
        return this.writeTimeout;
    }

    public HttpRequest setWriteTimeout(int i) {
        Preconditions.checkArgument(i >= 0);
        this.writeTimeout = i;
        return this;
    }

    public HttpHeaders getHeaders() {
        return this.headers;
    }

    public HttpRequest setHeaders(HttpHeaders httpHeaders) {
        this.headers = (HttpHeaders) Preconditions.checkNotNull(httpHeaders);
        return this;
    }

    public HttpHeaders getResponseHeaders() {
        return this.responseHeaders;
    }

    public HttpRequest setResponseHeaders(HttpHeaders httpHeaders) {
        this.responseHeaders = (HttpHeaders) Preconditions.checkNotNull(httpHeaders);
        return this;
    }

    public HttpExecuteInterceptor getInterceptor() {
        return this.executeInterceptor;
    }

    public HttpRequest setInterceptor(HttpExecuteInterceptor httpExecuteInterceptor) {
        this.executeInterceptor = httpExecuteInterceptor;
        return this;
    }

    public HttpUnsuccessfulResponseHandler getUnsuccessfulResponseHandler() {
        return this.unsuccessfulResponseHandler;
    }

    public HttpRequest setUnsuccessfulResponseHandler(HttpUnsuccessfulResponseHandler httpUnsuccessfulResponseHandler) {
        this.unsuccessfulResponseHandler = httpUnsuccessfulResponseHandler;
        return this;
    }

    public HttpIOExceptionHandler getIOExceptionHandler() {
        return this.ioExceptionHandler;
    }

    public HttpRequest setIOExceptionHandler(HttpIOExceptionHandler httpIOExceptionHandler) {
        this.ioExceptionHandler = httpIOExceptionHandler;
        return this;
    }

    public HttpResponseInterceptor getResponseInterceptor() {
        return this.responseInterceptor;
    }

    public HttpRequest setResponseInterceptor(HttpResponseInterceptor httpResponseInterceptor) {
        this.responseInterceptor = httpResponseInterceptor;
        return this;
    }

    public int getNumberOfRetries() {
        return this.numRetries;
    }

    public HttpRequest setNumberOfRetries(int i) {
        Preconditions.checkArgument(i >= 0);
        this.numRetries = i;
        return this;
    }

    public HttpRequest setParser(ObjectParser objectParser) {
        this.objectParser = objectParser;
        return this;
    }

    public final ObjectParser getParser() {
        return this.objectParser;
    }

    public boolean getFollowRedirects() {
        return this.followRedirects;
    }

    public HttpRequest setFollowRedirects(boolean z) {
        this.followRedirects = z;
        return this;
    }

    public boolean getUseRawRedirectUrls() {
        return this.useRawRedirectUrls;
    }

    public HttpRequest setUseRawRedirectUrls(boolean z) {
        this.useRawRedirectUrls = z;
        return this;
    }

    public boolean getThrowExceptionOnExecuteError() {
        return this.throwExceptionOnExecuteError;
    }

    public HttpRequest setThrowExceptionOnExecuteError(boolean z) {
        this.throwExceptionOnExecuteError = z;
        return this;
    }

    @Deprecated
    public boolean getRetryOnExecuteIOException() {
        return this.retryOnExecuteIOException;
    }

    @Deprecated
    public HttpRequest setRetryOnExecuteIOException(boolean z) {
        this.retryOnExecuteIOException = z;
        return this;
    }

    public boolean getSuppressUserAgentSuffix() {
        return this.suppressUserAgentSuffix;
    }

    public HttpRequest setSuppressUserAgentSuffix(boolean z) {
        this.suppressUserAgentSuffix = z;
        return this;
    }

    public boolean getResponseReturnRawInputStream() {
        return this.responseReturnRawInputStream;
    }

    public HttpRequest setResponseReturnRawInputStream(boolean z) {
        this.responseReturnRawInputStream = z;
        return this;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(4:(9:(2:20|(24:22|(1:24)|25|(2:27|(1:29)(1:30))|31|(1:33)|34|(1:175)(1:38)|39|(7:41|(1:43)(1:173)|44|(1:46)(1:172)|(5:48|(2:50|(1:52))(1:170)|(2:54|(1:56))|57|(1:59))(1:171)|(1:61)|62)(1:174)|(2:64|(3:66|(1:68)|69))|(1:169)(1:72)|73|74|75|(1:77)|78|79|80|(3:111|112|(7:114|(1:116)(1:136)|(3:118|(1:(3:126|127|(2:129|130)))|120)|133|(1:135)|85|(4:88|(1:90)|91|(4:93|(1:95)|96|(1:108)(3:100|101|102))(1:109))(1:87)))|(1:83)(1:110)|84|85|(0)(0)))(1:177)|78|79|80|(0)|(0)(0)|84|85|(0)(0))|74|75|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0289, code lost:
        if (r1.retryOnExecuteIOException == false) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x02a0, code lost:
        if (r9 != false) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x02a2, code lost:
        r8.log(java.util.logging.Level.WARNING, "exception thrown while executing request", (java.lang.Throwable) r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x02a9, code lost:
        r4.close();
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0286, code lost:
        r0 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x033e A[LOOP:0: B:10:0x0035->B:168:0x033e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02af A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x030b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0257 A[Catch: all -> 0x0283, IOException -> 0x0286, TRY_LEAVE, TryCatch #1 {IOException -> 0x0286, blocks: (B:87:0x0251, B:89:0x0257, B:93:0x0279, B:95:0x027f, B:96:0x0282), top: B:172:0x0251, outer: #0 }] */
    /* JADX WARN: Type inference failed for: r14v4, types: [com.google.api.client.util.LoggingStreamingContent] */
    /* JADX WARN: Type inference failed for: r5v14, types: [com.google.api.client.http.HttpEncodingStreamingContent] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public HttpResponse execute() throws IOException {
        StringBuilder sb;
        StringBuilder sb2;
        HttpContent httpContent;
        Span span;
        int i;
        Span span2;
        Scope withSpan;
        HttpResponse httpResponse;
        boolean z;
        BackOffPolicy backOffPolicy;
        LowLevelHttpResponse execute;
        String name;
        long j;
        HttpRequest httpRequest = this;
        Preconditions.checkArgument(httpRequest.numRetries >= 0);
        int i2 = httpRequest.numRetries;
        BackOffPolicy backOffPolicy2 = httpRequest.backOffPolicy;
        if (backOffPolicy2 != null) {
            backOffPolicy2.reset();
        }
        Preconditions.checkNotNull(httpRequest.requestMethod);
        Preconditions.checkNotNull(httpRequest.url);
        Span startSpan = httpRequest.tracer.spanBuilder(OpenCensusUtils.SPAN_NAME_HTTP_REQUEST_EXECUTE).setRecordEvents(OpenCensusUtils.isRecordEvent()).startSpan();
        int i3 = i2;
        HttpResponse httpResponse2 = null;
        while (true) {
            startSpan.addAnnotation("retry #" + (httpRequest.numRetries - i3));
            if (httpResponse2 != null) {
                httpResponse2.ignore();
            }
            HttpExecuteInterceptor httpExecuteInterceptor = httpRequest.executeInterceptor;
            if (httpExecuteInterceptor != null) {
                httpExecuteInterceptor.intercept(httpRequest);
            }
            String build = httpRequest.url.build();
            addSpanAttribute(startSpan, HttpTraceAttributeConstants.HTTP_METHOD, httpRequest.requestMethod);
            addSpanAttribute(startSpan, HttpTraceAttributeConstants.HTTP_HOST, httpRequest.url.getHost());
            addSpanAttribute(startSpan, HttpTraceAttributeConstants.HTTP_PATH, httpRequest.url.getRawPath());
            addSpanAttribute(startSpan, HttpTraceAttributeConstants.HTTP_URL, build);
            LowLevelHttpRequest buildRequest = httpRequest.transport.buildRequest(httpRequest.requestMethod, build);
            Logger logger = HttpTransport.LOGGER;
            boolean z2 = httpRequest.loggingEnabled && logger.isLoggable(Level.CONFIG);
            try {
                try {
                    if (z2) {
                        sb = new StringBuilder();
                        sb.append("-------------- REQUEST  --------------");
                        sb.append(StringUtils.LINE_SEPARATOR);
                        sb.append(httpRequest.requestMethod);
                        sb.append(' ');
                        sb.append(build);
                        sb.append(StringUtils.LINE_SEPARATOR);
                        if (httpRequest.curlLoggingEnabled) {
                            sb2 = new StringBuilder("curl -v --compressed");
                            if (!httpRequest.requestMethod.equals("GET")) {
                                sb2.append(" -X ");
                                sb2.append(httpRequest.requestMethod);
                            }
                            String userAgent = httpRequest.headers.getUserAgent();
                            if (!httpRequest.suppressUserAgentSuffix) {
                                if (userAgent == null) {
                                    HttpHeaders httpHeaders = httpRequest.headers;
                                    String str = USER_AGENT_SUFFIX;
                                    httpHeaders.setUserAgent(str);
                                    addSpanAttribute(startSpan, HttpTraceAttributeConstants.HTTP_USER_AGENT, str);
                                } else {
                                    String str2 = userAgent + " " + USER_AGENT_SUFFIX;
                                    httpRequest.headers.setUserAgent(str2);
                                    addSpanAttribute(startSpan, HttpTraceAttributeConstants.HTTP_USER_AGENT, str2);
                                }
                            }
                            OpenCensusUtils.propagateTracingContext(startSpan, httpRequest.headers);
                            HttpHeaders.serializeHeaders(httpRequest.headers, sb, sb2, logger, buildRequest);
                            if (!httpRequest.suppressUserAgentSuffix) {
                                httpRequest.headers.setUserAgent(userAgent);
                            }
                            httpContent = httpRequest.content;
                            boolean z3 = httpContent != null || httpContent.retrySupported();
                            if (httpContent == null) {
                                String type = httpRequest.content.getType();
                                if (z2) {
                                    span = startSpan;
                                    httpContent = new LoggingStreamingContent(httpContent, HttpTransport.LOGGER, Level.CONFIG, httpRequest.contentLoggingLimit);
                                } else {
                                    span = startSpan;
                                }
                                HttpEncoding httpEncoding = httpRequest.encoding;
                                if (httpEncoding == null) {
                                    j = httpRequest.content.getLength();
                                    name = null;
                                } else {
                                    name = httpEncoding.getName();
                                    httpContent = new HttpEncodingStreamingContent(httpContent, httpRequest.encoding);
                                    j = -1;
                                }
                                if (z2) {
                                    if (type != null) {
                                        i = i3;
                                        String str3 = "Content-Type: " + type;
                                        sb.append(str3);
                                        sb.append(StringUtils.LINE_SEPARATOR);
                                        if (sb2 != null) {
                                            sb2.append(" -H '" + str3 + "'");
                                        }
                                    } else {
                                        i = i3;
                                    }
                                    if (name != null) {
                                        String str4 = "Content-Encoding: " + name;
                                        sb.append(str4);
                                        sb.append(StringUtils.LINE_SEPARATOR);
                                        if (sb2 != null) {
                                            sb2.append(" -H '" + str4 + "'");
                                        }
                                    }
                                    if (j >= 0) {
                                        sb.append("Content-Length: " + j);
                                        sb.append(StringUtils.LINE_SEPARATOR);
                                    }
                                } else {
                                    i = i3;
                                }
                                if (sb2 != null) {
                                    sb2.append(" -d '@-'");
                                }
                                buildRequest.setContentType(type);
                                buildRequest.setContentEncoding(name);
                                buildRequest.setContentLength(j);
                                buildRequest.setStreamingContent(httpContent);
                            } else {
                                span = startSpan;
                                i = i3;
                            }
                            if (z2) {
                                logger.config(sb.toString());
                                if (sb2 != null) {
                                    sb2.append(" -- '");
                                    sb2.append(build.replaceAll("'", "'\"'\"'"));
                                    sb2.append("'");
                                    if (httpContent != null) {
                                        sb2.append(" << $$$");
                                    }
                                    logger.config(sb2.toString());
                                }
                            }
                            boolean z4 = !z3 && i > 0;
                            httpRequest = this;
                            buildRequest.setTimeout(httpRequest.connectTimeout, httpRequest.readTimeout);
                            buildRequest.setWriteTimeout(httpRequest.writeTimeout);
                            span2 = span;
                            withSpan = httpRequest.tracer.withSpan(span2);
                            OpenCensusUtils.recordSentMessageEvent(span2, buildRequest.getContentLength());
                            execute = buildRequest.execute();
                            if (execute != null) {
                                OpenCensusUtils.recordReceivedMessageEvent(span2, execute.getContentLength());
                                span2.putAttribute(HttpTraceAttributeConstants.HTTP_STATUS_CODE, AttributeValue.longAttributeValue(execute.getStatusCode()));
                            }
                            HttpResponse httpResponse3 = new HttpResponse(httpRequest, execute);
                            withSpan.close();
                            httpResponse = httpResponse3;
                            e = null;
                            Integer num = null;
                            if (httpResponse != null) {
                                try {
                                    if (!httpResponse.isSuccessStatusCode()) {
                                        HttpUnsuccessfulResponseHandler httpUnsuccessfulResponseHandler = httpRequest.unsuccessfulResponseHandler;
                                        boolean handleResponse = httpUnsuccessfulResponseHandler != null ? httpUnsuccessfulResponseHandler.handleResponse(httpRequest, httpResponse, z4) : false;
                                        if (!handleResponse) {
                                            if (!httpRequest.handleRedirect(httpResponse.getStatusCode(), httpResponse.getHeaders())) {
                                                if (z4 && (backOffPolicy = httpRequest.backOffPolicy) != null && backOffPolicy.isBackOffRequired(httpResponse.getStatusCode())) {
                                                    long nextBackOffMillis = httpRequest.backOffPolicy.getNextBackOffMillis();
                                                    if (nextBackOffMillis != -1) {
                                                        try {
                                                            httpRequest.sleeper.sleep(nextBackOffMillis);
                                                        } catch (InterruptedException unused) {
                                                        }
                                                    }
                                                }
                                            }
                                            handleResponse = true;
                                        }
                                        z = z4 & handleResponse;
                                        if (z) {
                                            httpResponse.ignore();
                                        }
                                        i3 = i - 1;
                                        if (!z) {
                                            if (httpResponse != null) {
                                                num = Integer.valueOf(httpResponse.getStatusCode());
                                            }
                                            span2.end(OpenCensusUtils.getEndSpanOptions(num));
                                            if (httpResponse == null) {
                                                throw e;
                                            }
                                            HttpResponseInterceptor httpResponseInterceptor = httpRequest.responseInterceptor;
                                            if (httpResponseInterceptor != null) {
                                                httpResponseInterceptor.interceptResponse(httpResponse);
                                            }
                                            if (!httpRequest.throwExceptionOnExecuteError || httpResponse.isSuccessStatusCode()) {
                                                return httpResponse;
                                            }
                                            try {
                                                throw new HttpResponseException(httpResponse);
                                            } finally {
                                                httpResponse.disconnect();
                                            }
                                        }
                                        httpResponse2 = httpResponse;
                                        startSpan = span2;
                                    }
                                } catch (Throwable th) {
                                    if (httpResponse != null) {
                                    }
                                    throw th;
                                }
                            }
                            z = z4 & (httpResponse != null);
                            i3 = i - 1;
                            if (!z) {
                            }
                        }
                    } else {
                        sb = null;
                    }
                    HttpResponse httpResponse32 = new HttpResponse(httpRequest, execute);
                    withSpan.close();
                    httpResponse = httpResponse32;
                    e = null;
                    Integer num2 = null;
                    if (httpResponse != null) {
                    }
                    z = z4 & (httpResponse != null);
                    i3 = i - 1;
                    if (!z) {
                    }
                } catch (Throwable th2) {
                    InputStream content = execute.getContent();
                    if (content != null) {
                        content.close();
                    }
                    throw th2;
                    break;
                }
                execute = buildRequest.execute();
                if (execute != null) {
                }
            } catch (Throwable th3) {
                withSpan.close();
                throw th3;
            }
            sb2 = null;
            String userAgent2 = httpRequest.headers.getUserAgent();
            if (!httpRequest.suppressUserAgentSuffix) {
            }
            OpenCensusUtils.propagateTracingContext(startSpan, httpRequest.headers);
            HttpHeaders.serializeHeaders(httpRequest.headers, sb, sb2, logger, buildRequest);
            if (!httpRequest.suppressUserAgentSuffix) {
            }
            httpContent = httpRequest.content;
            if (httpContent != null) {
            }
            if (httpContent == null) {
            }
            if (z2) {
            }
            if (z3) {
            }
            httpRequest = this;
            buildRequest.setTimeout(httpRequest.connectTimeout, httpRequest.readTimeout);
            buildRequest.setWriteTimeout(httpRequest.writeTimeout);
            span2 = span;
            withSpan = httpRequest.tracer.withSpan(span2);
            OpenCensusUtils.recordSentMessageEvent(span2, buildRequest.getContentLength());
        }
        span2.end(OpenCensusUtils.getEndSpanOptions(null));
        throw e;
    }

    public Future<HttpResponse> executeAsync(Executor executor) {
        FutureTask futureTask = new FutureTask(new Callable<HttpResponse>() { // from class: com.google.api.client.http.HttpRequest.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public HttpResponse call() throws Exception {
                return HttpRequest.this.execute();
            }
        });
        executor.execute(futureTask);
        return futureTask;
    }

    public Future<HttpResponse> executeAsync() {
        return executeAsync(Executors.newFixedThreadPool(1, new ThreadFactoryBuilder().setDaemon(true).build()));
    }

    public boolean handleRedirect(int i, HttpHeaders httpHeaders) {
        String location = httpHeaders.getLocation();
        if (getFollowRedirects() && HttpStatusCodes.isRedirect(i) && location != null) {
            setUrl(new GenericUrl(this.url.toURL(location), this.useRawRedirectUrls));
            if (i == 303) {
                setRequestMethod("GET");
                setContent(null);
            }
            this.headers.setAuthorization((String) null);
            this.headers.setIfMatch(null);
            this.headers.setIfNoneMatch(null);
            this.headers.setIfModifiedSince(null);
            this.headers.setIfUnmodifiedSince(null);
            this.headers.setIfRange(null);
            return true;
        }
        return false;
    }

    public Sleeper getSleeper() {
        return this.sleeper;
    }

    public HttpRequest setSleeper(Sleeper sleeper) {
        this.sleeper = (Sleeper) Preconditions.checkNotNull(sleeper);
        return this;
    }

    private static void addSpanAttribute(Span span, String str, String str2) {
        if (str2 != null) {
            span.putAttribute(str, AttributeValue.stringAttributeValue(str2));
        }
    }

    private static String getVersion() {
        String str = "unknown-version";
        try {
            InputStream resourceAsStream = HttpRequest.class.getResourceAsStream("/com/google/api/client/http/google-http-client.properties");
            if (resourceAsStream != null) {
                Properties properties = new Properties();
                properties.load(resourceAsStream);
                str = properties.getProperty("google-http-client.version");
            }
            if (resourceAsStream != null) {
                resourceAsStream.close();
            }
        } catch (IOException unused) {
        }
        return str;
    }
}
