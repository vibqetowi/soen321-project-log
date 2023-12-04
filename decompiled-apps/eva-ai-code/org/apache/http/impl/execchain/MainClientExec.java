package org.apache.http.impl.execchain;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.ConnectionReuseStrategy;
import org.apache.http.HttpClientConnection;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.auth.AuthProtocolState;
import org.apache.http.auth.AuthState;
import org.apache.http.client.AuthenticationStrategy;
import org.apache.http.client.NonRepeatableRequestException;
import org.apache.http.client.UserTokenHandler;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpExecutionAware;
import org.apache.http.client.methods.HttpRequestWrapper;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import org.apache.http.conn.ConnectionRequest;
import org.apache.http.conn.HttpClientConnectionManager;
import org.apache.http.conn.routing.BasicRouteDirector;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.routing.HttpRouteDirector;
import org.apache.http.conn.routing.RouteTracker;
import org.apache.http.entity.BufferedHttpEntity;
import org.apache.http.impl.auth.HttpAuthenticator;
import org.apache.http.impl.conn.ConnectionShutdownException;
import org.apache.http.message.BasicHttpRequest;
import org.apache.http.protocol.HttpProcessor;
import org.apache.http.protocol.HttpRequestExecutor;
import org.apache.http.protocol.ImmutableHttpProcessor;
import org.apache.http.protocol.RequestTargetHost;
import org.apache.http.util.Args;
import org.apache.http.util.EntityUtils;
/* loaded from: classes5.dex */
public class MainClientExec implements ClientExecChain {
    private final HttpAuthenticator authenticator;
    private final HttpClientConnectionManager connManager;
    private final ConnectionKeepAliveStrategy keepAliveStrategy;
    private final Log log;
    private final AuthenticationStrategy proxyAuthStrategy;
    private final HttpProcessor proxyHttpProcessor;
    private final HttpRequestExecutor requestExecutor;
    private final ConnectionReuseStrategy reuseStrategy;
    private final HttpRouteDirector routeDirector;
    private final AuthenticationStrategy targetAuthStrategy;
    private final UserTokenHandler userTokenHandler;

    public MainClientExec(HttpRequestExecutor httpRequestExecutor, HttpClientConnectionManager httpClientConnectionManager, ConnectionReuseStrategy connectionReuseStrategy, ConnectionKeepAliveStrategy connectionKeepAliveStrategy, HttpProcessor httpProcessor, AuthenticationStrategy authenticationStrategy, AuthenticationStrategy authenticationStrategy2, UserTokenHandler userTokenHandler) {
        this.log = LogFactory.getLog(getClass());
        Args.notNull(httpRequestExecutor, "HTTP request executor");
        Args.notNull(httpClientConnectionManager, "Client connection manager");
        Args.notNull(connectionReuseStrategy, "Connection reuse strategy");
        Args.notNull(connectionKeepAliveStrategy, "Connection keep alive strategy");
        Args.notNull(httpProcessor, "Proxy HTTP processor");
        Args.notNull(authenticationStrategy, "Target authentication strategy");
        Args.notNull(authenticationStrategy2, "Proxy authentication strategy");
        Args.notNull(userTokenHandler, "User token handler");
        this.authenticator = new HttpAuthenticator();
        this.routeDirector = new BasicRouteDirector();
        this.requestExecutor = httpRequestExecutor;
        this.connManager = httpClientConnectionManager;
        this.reuseStrategy = connectionReuseStrategy;
        this.keepAliveStrategy = connectionKeepAliveStrategy;
        this.proxyHttpProcessor = httpProcessor;
        this.targetAuthStrategy = authenticationStrategy;
        this.proxyAuthStrategy = authenticationStrategy2;
        this.userTokenHandler = userTokenHandler;
    }

    public MainClientExec(HttpRequestExecutor httpRequestExecutor, HttpClientConnectionManager httpClientConnectionManager, ConnectionReuseStrategy connectionReuseStrategy, ConnectionKeepAliveStrategy connectionKeepAliveStrategy, AuthenticationStrategy authenticationStrategy, AuthenticationStrategy authenticationStrategy2, UserTokenHandler userTokenHandler) {
        this(httpRequestExecutor, httpClientConnectionManager, connectionReuseStrategy, connectionKeepAliveStrategy, new ImmutableHttpProcessor(new RequestTargetHost()), authenticationStrategy, authenticationStrategy2, userTokenHandler);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:52|53|(1:55)|(3:60|61|62)|63|(1:65)|66|(3:68|(1:70)|71)|72|(4:(3:183|184|(13:186|(1:188)|189|190|191|192|75|76|(7:148|149|(3:151|(1:153)(1:169)|154)(1:170)|155|156|157|158)(3:78|79|80)|81|82|83|(7:85|(1:87)(4:97|(1:101)|102|(1:106))|88|(1:90)|91|(2:93|94)(1:96)|95)(2:107|108)))|82|83|(0)(0))|74|75|76|(0)(0)|81) */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x0373, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0374, code lost:
        r22 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x0377, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x0378, code lost:
        r22 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x037c, code lost:
        r11 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0380, code lost:
        r11 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00eb, code lost:
        if (r28.isAborted() != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00f3, code lost:
        throw new org.apache.http.impl.execchain.RequestAbortedException(r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02c7 A[Catch: Error -> 0x00b7, ConnectionShutdownException -> 0x00ce, RuntimeException -> 0x033f, IOException -> 0x0341, HttpException -> 0x0344, TryCatch #0 {HttpException -> 0x0344, blocks: (B:147:0x0291, B:162:0x02c1, B:164:0x02c7, B:166:0x02d1, B:177:0x0308, B:179:0x0312, B:180:0x0315, B:182:0x031b, B:183:0x031e, B:167:0x02d5, B:169:0x02e0, B:171:0x02e6, B:172:0x02f0, B:174:0x02f8, B:176:0x02fe, B:186:0x0333, B:195:0x034b, B:196:0x034e, B:198:0x0354, B:201:0x035b, B:203:0x0361, B:160:0x02b0), top: B:258:0x0291 }] */
    /* JADX WARN: Removed duplicated region for block: B:226:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0242 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:285:0x032f A[SYNTHETIC] */
    @Override // org.apache.http.impl.execchain.ClientExecChain
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CloseableHttpResponse execute(HttpRoute httpRoute, HttpRequestWrapper httpRequestWrapper, HttpClientContext httpClientContext, HttpExecutionAware httpExecutionAware) throws IOException, HttpException {
        HttpException httpException;
        ConnectionHolder connectionHolder;
        RuntimeException runtimeException;
        AuthState authState;
        IOException iOException;
        ConnectionHolder connectionHolder2;
        int i;
        int i2;
        AuthState authState2;
        HttpClientConnection httpClientConnection;
        String str;
        Object obj;
        HttpResponse response;
        Object obj2;
        AuthState authState3;
        HttpResponse execute;
        HttpResponse httpResponse;
        String str2;
        HttpResponse httpResponse2;
        HttpRoute httpRoute2 = httpRoute;
        HttpExecutionAware httpExecutionAware2 = httpExecutionAware;
        Args.notNull(httpRoute2, "HTTP route");
        Args.notNull(httpRequestWrapper, "HTTP request");
        Args.notNull(httpClientContext, "HTTP context");
        AuthState targetAuthState = httpClientContext.getTargetAuthState();
        if (targetAuthState == null) {
            targetAuthState = new AuthState();
            httpClientContext.setAttribute("http.auth.target-scope", targetAuthState);
        }
        AuthState authState4 = targetAuthState;
        AuthState proxyAuthState = httpClientContext.getProxyAuthState();
        if (proxyAuthState == null) {
            proxyAuthState = new AuthState();
            httpClientContext.setAttribute("http.auth.proxy-scope", proxyAuthState);
        }
        AuthState authState5 = proxyAuthState;
        if (httpRequestWrapper instanceof HttpEntityEnclosingRequest) {
            RequestEntityProxy.enhance((HttpEntityEnclosingRequest) httpRequestWrapper);
        }
        Object userToken = httpClientContext.getUserToken();
        ConnectionRequest requestConnection = this.connManager.requestConnection(httpRoute2, userToken);
        String str3 = "Request aborted";
        if (httpExecutionAware2 != null) {
            if (httpExecutionAware.isAborted()) {
                requestConnection.cancel();
                throw new RequestAbortedException("Request aborted");
            }
            httpExecutionAware2.setCancellable(requestConnection);
        }
        RequestConfig requestConfig = httpClientContext.getRequestConfig();
        try {
            int connectionRequestTimeout = requestConfig.getConnectionRequestTimeout();
            HttpClientConnection httpClientConnection2 = requestConnection.get(connectionRequestTimeout > 0 ? connectionRequestTimeout : 0L, TimeUnit.MILLISECONDS);
            httpClientContext.setAttribute("http.connection", httpClientConnection2);
            if (requestConfig.isStaleConnectionCheckEnabled() && httpClientConnection2.isOpen()) {
                this.log.debug("Stale connection check");
                if (httpClientConnection2.isStale()) {
                    this.log.debug("Stale connection detected");
                    httpClientConnection2.close();
                }
            }
            ConnectionHolder connectionHolder3 = new ConnectionHolder(this.log, this.connManager, httpClientConnection2);
            if (httpExecutionAware2 != null) {
                try {
                    try {
                        httpExecutionAware2.setCancellable(connectionHolder3);
                    } catch (Error e) {
                        this.connManager.shutdown();
                        throw e;
                    } catch (ConnectionShutdownException e2) {
                        InterruptedIOException interruptedIOException = new InterruptedIOException("Connection has been shut down");
                        interruptedIOException.initCause(e2);
                        throw interruptedIOException;
                    }
                } catch (IOException e3) {
                    iOException = e3;
                    connectionHolder = connectionHolder3;
                    authState = authState5;
                    connectionHolder.abortConnection();
                    if (authState.isConnectionBased()) {
                    }
                    if (authState4.isConnectionBased()) {
                    }
                    throw iOException;
                } catch (RuntimeException e4) {
                    runtimeException = e4;
                    connectionHolder = connectionHolder3;
                    authState = authState5;
                    connectionHolder.abortConnection();
                    if (authState.isConnectionBased()) {
                    }
                    if (authState4.isConnectionBased()) {
                    }
                    throw runtimeException;
                } catch (HttpException e5) {
                    httpException = e5;
                    connectionHolder = connectionHolder3;
                    connectionHolder.abortConnection();
                    throw httpException;
                }
            }
            int i3 = 1;
            int i4 = 1;
            while (true) {
                if (i4 > i3 && !RequestEntityProxy.isRepeatable(httpRequestWrapper)) {
                    throw new NonRepeatableRequestException("Cannot retry request with a non-repeatable request entity.");
                }
                try {
                    if (httpClientConnection2.isOpen()) {
                        i = i4;
                        i2 = i3;
                        connectionHolder2 = connectionHolder3;
                        httpClientConnection = httpClientConnection2;
                        obj = userToken;
                        authState = authState5;
                        str = str3;
                    } else {
                        try {
                            Log log = this.log;
                            i = i4;
                            StringBuilder sb = new StringBuilder();
                            connectionHolder2 = connectionHolder3;
                            try {
                                try {
                                    sb.append("Opening connection ");
                                    sb.append(httpRoute2);
                                    log.debug(sb.toString());
                                    i2 = 1;
                                    authState2 = authState5;
                                    httpClientConnection = httpClientConnection2;
                                    authState = authState5;
                                    str = str3;
                                    obj = userToken;
                                } catch (HttpException e6) {
                                    e = e6;
                                    httpException = e;
                                    connectionHolder = connectionHolder2;
                                    connectionHolder.abortConnection();
                                    throw httpException;
                                }
                            } catch (IOException e7) {
                                e = e7;
                                authState = authState5;
                                iOException = e;
                                connectionHolder = connectionHolder2;
                                connectionHolder.abortConnection();
                                if (authState.isConnectionBased()) {
                                }
                                if (authState4.isConnectionBased()) {
                                }
                                throw iOException;
                            } catch (RuntimeException e8) {
                                e = e8;
                                authState = authState5;
                                runtimeException = e;
                                connectionHolder = connectionHolder2;
                                connectionHolder.abortConnection();
                                if (authState.isConnectionBased()) {
                                }
                                if (authState4.isConnectionBased()) {
                                }
                                throw runtimeException;
                            }
                            try {
                                try {
                                    establishRoute(authState2, httpClientConnection2, httpRoute, httpRequestWrapper, httpClientContext);
                                } catch (TunnelRefusedException e9) {
                                    if (this.log.isDebugEnabled()) {
                                        this.log.debug(e9.getMessage());
                                    }
                                    response = e9.getResponse();
                                    connectionHolder = connectionHolder2;
                                    if (obj == null) {
                                        obj2 = this.userTokenHandler.getUserToken(httpClientContext);
                                        httpClientContext.setAttribute("http.user-token", obj2);
                                    } else {
                                        obj2 = obj;
                                    }
                                    if (obj2 != null) {
                                        connectionHolder.setState(obj2);
                                    }
                                    HttpEntity entity = response.getEntity();
                                    if (entity != null && entity.isStreaming()) {
                                        return new HttpResponseProxy(response, connectionHolder);
                                    }
                                    connectionHolder.releaseConnection();
                                    return new HttpResponseProxy(response, null);
                                }
                            } catch (IOException e10) {
                                e = e10;
                                iOException = e;
                                connectionHolder = connectionHolder2;
                                connectionHolder.abortConnection();
                                if (authState.isConnectionBased()) {
                                }
                                if (authState4.isConnectionBased()) {
                                }
                                throw iOException;
                            } catch (RuntimeException e11) {
                                e = e11;
                                runtimeException = e;
                                connectionHolder = connectionHolder2;
                                connectionHolder.abortConnection();
                                if (authState.isConnectionBased()) {
                                }
                                if (authState4.isConnectionBased()) {
                                }
                                throw runtimeException;
                            }
                        } catch (IOException e12) {
                            e = e12;
                            connectionHolder2 = connectionHolder3;
                        } catch (RuntimeException e13) {
                            e = e13;
                            connectionHolder2 = connectionHolder3;
                        } catch (HttpException e14) {
                            e = e14;
                            connectionHolder2 = connectionHolder3;
                        }
                    }
                    try {
                        try {
                            int socketTimeout = requestConfig.getSocketTimeout();
                            if (socketTimeout >= 0) {
                                httpClientConnection.setSocketTimeout(socketTimeout);
                            }
                            if (httpExecutionAware2 != null && httpExecutionAware.isAborted()) {
                                throw new RequestAbortedException(str);
                            }
                            if (this.log.isDebugEnabled()) {
                                this.log.debug("Executing request " + httpRequestWrapper.getRequestLine());
                            }
                            if (!httpRequestWrapper.containsHeader("Authorization")) {
                                if (this.log.isDebugEnabled()) {
                                    this.log.debug("Target auth state: " + authState4.getState());
                                }
                                this.authenticator.generateAuthResponse(httpRequestWrapper, authState4, httpClientContext);
                            }
                            try {
                                if (!httpRequestWrapper.containsHeader("Proxy-Authorization")) {
                                    try {
                                        if (!httpRoute.isTunnelled()) {
                                            if (this.log.isDebugEnabled()) {
                                                this.log.debug("Proxy auth state: " + authState.getState());
                                            }
                                            authState3 = authState;
                                            try {
                                                this.authenticator.generateAuthResponse(httpRequestWrapper, authState3, httpClientContext);
                                                httpClientContext.setAttribute("http.request", httpRequestWrapper);
                                                execute = this.requestExecutor.execute(httpRequestWrapper, httpClientConnection, httpClientContext);
                                                if (!this.reuseStrategy.keepAlive(execute, httpClientContext)) {
                                                    try {
                                                        long keepAliveDuration = this.keepAliveStrategy.getKeepAliveDuration(execute, httpClientContext);
                                                        if (this.log.isDebugEnabled()) {
                                                            if (keepAliveDuration > 0) {
                                                                str2 = "for " + keepAliveDuration + " " + TimeUnit.MILLISECONDS;
                                                            } else {
                                                                str2 = "indefinitely";
                                                            }
                                                            httpResponse = execute;
                                                            this.log.debug("Connection can be kept alive " + str2);
                                                        } else {
                                                            httpResponse = execute;
                                                        }
                                                        connectionHolder = connectionHolder2;
                                                        try {
                                                            try {
                                                                connectionHolder.setValidFor(keepAliveDuration, TimeUnit.MILLISECONDS);
                                                                connectionHolder.markReusable();
                                                            } catch (HttpException e15) {
                                                                e = e15;
                                                                httpException = e;
                                                                connectionHolder.abortConnection();
                                                                throw httpException;
                                                            }
                                                        } catch (IOException e16) {
                                                            e = e16;
                                                            iOException = e;
                                                            authState = authState3;
                                                            connectionHolder.abortConnection();
                                                            if (authState.isConnectionBased()) {
                                                                authState.reset();
                                                            }
                                                            if (authState4.isConnectionBased()) {
                                                                authState4.reset();
                                                            }
                                                            throw iOException;
                                                        } catch (RuntimeException e17) {
                                                            e = e17;
                                                            runtimeException = e;
                                                            authState = authState3;
                                                            connectionHolder.abortConnection();
                                                            if (authState.isConnectionBased()) {
                                                                authState.reset();
                                                            }
                                                            if (authState4.isConnectionBased()) {
                                                                authState4.reset();
                                                            }
                                                            throw runtimeException;
                                                        }
                                                    } catch (IOException e18) {
                                                        e = e18;
                                                        connectionHolder = connectionHolder2;
                                                    } catch (RuntimeException e19) {
                                                        e = e19;
                                                        connectionHolder = connectionHolder2;
                                                    }
                                                } else {
                                                    httpResponse = execute;
                                                    connectionHolder = connectionHolder2;
                                                    try {
                                                        connectionHolder.markNonReusable();
                                                    } catch (IOException e20) {
                                                        e = e20;
                                                        authState = authState3;
                                                        iOException = e;
                                                        connectionHolder.abortConnection();
                                                        if (authState.isConnectionBased()) {
                                                        }
                                                        if (authState4.isConnectionBased()) {
                                                        }
                                                        throw iOException;
                                                    } catch (RuntimeException e21) {
                                                        e = e21;
                                                        authState = authState3;
                                                        runtimeException = e;
                                                        connectionHolder.abortConnection();
                                                        if (authState.isConnectionBased()) {
                                                        }
                                                        if (authState4.isConnectionBased()) {
                                                        }
                                                        throw runtimeException;
                                                    }
                                                }
                                                httpResponse2 = httpResponse;
                                                authState = authState3;
                                                if (needAuthentication(authState4, authState3, httpRoute, httpResponse2, httpClientContext)) {
                                                    response = httpResponse2;
                                                    break;
                                                }
                                                HttpEntity entity2 = httpResponse2.getEntity();
                                                if (connectionHolder.isReusable()) {
                                                    EntityUtils.consume(entity2);
                                                } else {
                                                    httpClientConnection.close();
                                                    if (authState.getState() == AuthProtocolState.SUCCESS && authState.isConnectionBased()) {
                                                        this.log.debug("Resetting proxy auth state");
                                                        authState.reset();
                                                    }
                                                    if (authState4.getState() == AuthProtocolState.SUCCESS && authState4.isConnectionBased()) {
                                                        this.log.debug("Resetting target auth state");
                                                        authState4.reset();
                                                    }
                                                }
                                                HttpRequest original = httpRequestWrapper.getOriginal();
                                                if (!original.containsHeader("Authorization")) {
                                                    httpRequestWrapper.removeHeaders("Authorization");
                                                }
                                                if (!original.containsHeader("Proxy-Authorization")) {
                                                    httpRequestWrapper.removeHeaders("Proxy-Authorization");
                                                }
                                                i4 = i + 1;
                                                httpClientConnection2 = httpClientConnection;
                                                connectionHolder3 = connectionHolder;
                                                str3 = str;
                                                i3 = i2;
                                                authState5 = authState;
                                                userToken = obj;
                                                httpRoute2 = httpRoute;
                                                httpExecutionAware2 = httpExecutionAware;
                                            } catch (IOException e22) {
                                                iOException = e22;
                                                authState = authState3;
                                                connectionHolder = connectionHolder2;
                                                connectionHolder.abortConnection();
                                                if (authState.isConnectionBased()) {
                                                }
                                                if (authState4.isConnectionBased()) {
                                                }
                                                throw iOException;
                                            } catch (RuntimeException e23) {
                                                runtimeException = e23;
                                                authState = authState3;
                                                connectionHolder = connectionHolder2;
                                                connectionHolder.abortConnection();
                                                if (authState.isConnectionBased()) {
                                                }
                                                if (authState4.isConnectionBased()) {
                                                }
                                                throw runtimeException;
                                            }
                                        }
                                    } catch (IOException e24) {
                                        e = e24;
                                        iOException = e;
                                        connectionHolder = connectionHolder2;
                                        connectionHolder.abortConnection();
                                        if (authState.isConnectionBased()) {
                                        }
                                        if (authState4.isConnectionBased()) {
                                        }
                                        throw iOException;
                                    } catch (RuntimeException e25) {
                                        e = e25;
                                        runtimeException = e;
                                        connectionHolder = connectionHolder2;
                                        connectionHolder.abortConnection();
                                        if (authState.isConnectionBased()) {
                                        }
                                        if (authState4.isConnectionBased()) {
                                        }
                                        throw runtimeException;
                                    }
                                }
                                if (needAuthentication(authState4, authState3, httpRoute, httpResponse2, httpClientContext)) {
                                }
                            } catch (IOException e26) {
                                e = e26;
                                iOException = e;
                                connectionHolder.abortConnection();
                                if (authState.isConnectionBased()) {
                                }
                                if (authState4.isConnectionBased()) {
                                }
                                throw iOException;
                            } catch (RuntimeException e27) {
                                e = e27;
                                runtimeException = e;
                                connectionHolder.abortConnection();
                                if (authState.isConnectionBased()) {
                                }
                                if (authState4.isConnectionBased()) {
                                }
                                throw runtimeException;
                            }
                            authState3 = authState;
                            httpClientContext.setAttribute("http.request", httpRequestWrapper);
                            execute = this.requestExecutor.execute(httpRequestWrapper, httpClientConnection, httpClientContext);
                            if (!this.reuseStrategy.keepAlive(execute, httpClientContext)) {
                            }
                            httpResponse2 = httpResponse;
                            authState = authState3;
                        } catch (HttpException e28) {
                            e = e28;
                            connectionHolder = connectionHolder2;
                        }
                    } catch (IOException e29) {
                        e = e29;
                    } catch (RuntimeException e30) {
                        e = e30;
                    }
                } catch (IOException e31) {
                    e = e31;
                    connectionHolder = connectionHolder3;
                    authState = authState5;
                } catch (RuntimeException e32) {
                    e = e32;
                    connectionHolder = connectionHolder3;
                    authState = authState5;
                } catch (HttpException e33) {
                    e = e33;
                    connectionHolder = connectionHolder3;
                }
            }
        } catch (InterruptedException e34) {
            Thread.currentThread().interrupt();
            throw new RequestAbortedException("Request aborted", e34);
        } catch (ExecutionException e35) {
            ExecutionException executionException = e35;
            Throwable cause = executionException.getCause();
            if (cause != null) {
                executionException = cause;
            }
            throw new RequestAbortedException("Request execution failed", executionException);
        }
    }

    void establishRoute(AuthState authState, HttpClientConnection httpClientConnection, HttpRoute httpRoute, HttpRequest httpRequest, HttpClientContext httpClientContext) throws HttpException, IOException {
        int nextStep;
        int connectTimeout = httpClientContext.getRequestConfig().getConnectTimeout();
        RouteTracker routeTracker = new RouteTracker(httpRoute);
        do {
            HttpRoute route = routeTracker.toRoute();
            nextStep = this.routeDirector.nextStep(httpRoute, route);
            boolean z = true;
            switch (nextStep) {
                case -1:
                    throw new HttpException("Unable to establish route: planned = " + httpRoute + "; current = " + route);
                case 0:
                    this.connManager.routeComplete(httpClientConnection, httpRoute, httpClientContext);
                    continue;
                case 1:
                    this.connManager.connect(httpClientConnection, httpRoute, connectTimeout > 0 ? connectTimeout : 0, httpClientContext);
                    routeTracker.connectTarget(httpRoute.isSecure());
                    continue;
                case 2:
                    this.connManager.connect(httpClientConnection, httpRoute, connectTimeout > 0 ? connectTimeout : 0, httpClientContext);
                    HttpHost proxyHost = httpRoute.getProxyHost();
                    if (!httpRoute.isSecure() || httpRoute.isTunnelled()) {
                        z = false;
                    }
                    routeTracker.connectProxy(proxyHost, z);
                    continue;
                case 3:
                    boolean createTunnelToTarget = createTunnelToTarget(authState, httpClientConnection, httpRoute, httpRequest, httpClientContext);
                    this.log.debug("Tunnel to target created.");
                    routeTracker.tunnelTarget(createTunnelToTarget);
                    continue;
                case 4:
                    int hopCount = route.getHopCount() - 1;
                    boolean createTunnelToProxy = createTunnelToProxy(httpRoute, hopCount, httpClientContext);
                    this.log.debug("Tunnel to proxy created.");
                    routeTracker.tunnelProxy(httpRoute.getHopTarget(hopCount), createTunnelToProxy);
                    continue;
                case 5:
                    this.connManager.upgrade(httpClientConnection, httpRoute, httpClientContext);
                    routeTracker.layerProtocol(httpRoute.isSecure());
                    continue;
                default:
                    throw new IllegalStateException("Unknown step indicator " + nextStep + " from RouteDirector.");
            }
        } while (nextStep > 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x009a, code lost:
        if (r16.reuseStrategy.keepAlive(r7, r21) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009c, code lost:
        r16.log.debug("Connection kept alive");
        org.apache.http.util.EntityUtils.consume(r7.getEntity());
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ab, code lost:
        r18.close();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean createTunnelToTarget(AuthState authState, HttpClientConnection httpClientConnection, HttpRoute httpRoute, HttpRequest httpRequest, HttpClientContext httpClientContext) throws HttpException, IOException {
        HttpResponse httpResponse;
        RequestConfig requestConfig = httpClientContext.getRequestConfig();
        int connectTimeout = requestConfig.getConnectTimeout();
        HttpHost targetHost = httpRoute.getTargetHost();
        HttpHost proxyHost = httpRoute.getProxyHost();
        BasicHttpRequest basicHttpRequest = new BasicHttpRequest("CONNECT", targetHost.toHostString(), httpRequest.getProtocolVersion());
        this.requestExecutor.preProcess(basicHttpRequest, this.proxyHttpProcessor, httpClientContext);
        while (true) {
            HttpResponse httpResponse2 = null;
            while (true) {
                if (httpResponse2 == null) {
                    if (!httpClientConnection.isOpen()) {
                        this.connManager.connect(httpClientConnection, httpRoute, connectTimeout > 0 ? connectTimeout : 0, httpClientContext);
                    }
                    basicHttpRequest.removeHeaders("Proxy-Authorization");
                    this.authenticator.generateAuthResponse(basicHttpRequest, authState, httpClientContext);
                    HttpResponse execute = this.requestExecutor.execute(basicHttpRequest, httpClientConnection, httpClientContext);
                    this.requestExecutor.postProcess(execute, this.proxyHttpProcessor, httpClientContext);
                    if (execute.getStatusLine().getStatusCode() < 200) {
                        throw new HttpException("Unexpected response to CONNECT request: " + execute.getStatusLine());
                    }
                    if (!requestConfig.isAuthenticationEnabled()) {
                        httpResponse = execute;
                    } else if (this.authenticator.isAuthenticationRequested(proxyHost, execute, this.proxyAuthStrategy, authState, httpClientContext) && this.authenticator.handleAuthChallenge(proxyHost, execute, this.proxyAuthStrategy, authState, httpClientContext)) {
                        break;
                    } else {
                        httpResponse = execute;
                    }
                    httpResponse2 = httpResponse;
                } else if (httpResponse2.getStatusLine().getStatusCode() > 299) {
                    HttpEntity entity = httpResponse2.getEntity();
                    if (entity != null) {
                        httpResponse2.setEntity(new BufferedHttpEntity(entity));
                    }
                    httpClientConnection.close();
                    throw new TunnelRefusedException("CONNECT refused by proxy: " + httpResponse2.getStatusLine(), httpResponse2);
                } else {
                    return false;
                }
            }
        }
    }

    private boolean createTunnelToProxy(HttpRoute httpRoute, int i, HttpClientContext httpClientContext) throws HttpException {
        throw new HttpException("Proxy chains are not supported.");
    }

    private boolean needAuthentication(AuthState authState, AuthState authState2, HttpRoute httpRoute, HttpResponse httpResponse, HttpClientContext httpClientContext) {
        if (httpClientContext.getRequestConfig().isAuthenticationEnabled()) {
            HttpHost targetHost = httpClientContext.getTargetHost();
            if (targetHost == null) {
                targetHost = httpRoute.getTargetHost();
            }
            if (targetHost.getPort() < 0) {
                targetHost = new HttpHost(targetHost.getHostName(), httpRoute.getTargetHost().getPort(), targetHost.getSchemeName());
            }
            boolean isAuthenticationRequested = this.authenticator.isAuthenticationRequested(targetHost, httpResponse, this.targetAuthStrategy, authState, httpClientContext);
            HttpHost proxyHost = httpRoute.getProxyHost();
            if (proxyHost == null) {
                proxyHost = httpRoute.getTargetHost();
            }
            boolean isAuthenticationRequested2 = this.authenticator.isAuthenticationRequested(proxyHost, httpResponse, this.proxyAuthStrategy, authState2, httpClientContext);
            if (isAuthenticationRequested) {
                return this.authenticator.handleAuthChallenge(targetHost, httpResponse, this.targetAuthStrategy, authState, httpClientContext);
            } else if (isAuthenticationRequested2) {
                return this.authenticator.handleAuthChallenge(proxyHost, httpResponse, this.proxyAuthStrategy, authState2, httpClientContext);
            } else {
                return false;
            }
        }
        return false;
    }
}
