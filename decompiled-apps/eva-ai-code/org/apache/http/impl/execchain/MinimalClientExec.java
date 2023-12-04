package org.apache.http.impl.execchain;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.ConnectionReuseStrategy;
import org.apache.http.HttpClientConnection;
import org.apache.http.HttpEntity;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolException;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpExecutionAware;
import org.apache.http.client.methods.HttpRequestWrapper;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.client.protocol.RequestClientConnControl;
import org.apache.http.client.utils.URIUtils;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import org.apache.http.conn.ConnectionRequest;
import org.apache.http.conn.HttpClientConnectionManager;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.impl.conn.ConnectionShutdownException;
import org.apache.http.protocol.HttpProcessor;
import org.apache.http.protocol.HttpRequestExecutor;
import org.apache.http.protocol.ImmutableHttpProcessor;
import org.apache.http.protocol.RequestContent;
import org.apache.http.protocol.RequestTargetHost;
import org.apache.http.protocol.RequestUserAgent;
import org.apache.http.util.Args;
import org.apache.http.util.VersionInfo;
/* loaded from: classes5.dex */
public class MinimalClientExec implements ClientExecChain {
    private final HttpClientConnectionManager connManager;
    private final HttpProcessor httpProcessor;
    private final ConnectionKeepAliveStrategy keepAliveStrategy;
    private final Log log = LogFactory.getLog(getClass());
    private final HttpRequestExecutor requestExecutor;
    private final ConnectionReuseStrategy reuseStrategy;

    public MinimalClientExec(HttpRequestExecutor httpRequestExecutor, HttpClientConnectionManager httpClientConnectionManager, ConnectionReuseStrategy connectionReuseStrategy, ConnectionKeepAliveStrategy connectionKeepAliveStrategy) {
        Args.notNull(httpRequestExecutor, "HTTP request executor");
        Args.notNull(httpClientConnectionManager, "Client connection manager");
        Args.notNull(connectionReuseStrategy, "Connection reuse strategy");
        Args.notNull(connectionKeepAliveStrategy, "Connection keep alive strategy");
        this.httpProcessor = new ImmutableHttpProcessor(new RequestContent(), new RequestTargetHost(), new RequestClientConnControl(), new RequestUserAgent(VersionInfo.getUserAgent("Apache-HttpClient", "org.apache.http.client", getClass())));
        this.requestExecutor = httpRequestExecutor;
        this.connManager = httpClientConnectionManager;
        this.reuseStrategy = connectionReuseStrategy;
        this.keepAliveStrategy = connectionKeepAliveStrategy;
    }

    static void rewriteRequestURI(HttpRequestWrapper httpRequestWrapper, HttpRoute httpRoute, boolean z) throws ProtocolException {
        URI rewriteURI;
        try {
            URI uri = httpRequestWrapper.getURI();
            if (uri != null) {
                if (uri.isAbsolute()) {
                    rewriteURI = URIUtils.rewriteURI(uri, (HttpHost) null, z ? URIUtils.DROP_FRAGMENT_AND_NORMALIZE : URIUtils.DROP_FRAGMENT);
                } else {
                    rewriteURI = URIUtils.rewriteURI(uri);
                }
                httpRequestWrapper.setURI(rewriteURI);
            }
        } catch (URISyntaxException e) {
            throw new ProtocolException("Invalid URI: " + httpRequestWrapper.getRequestLine().getUri(), e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00b4 A[Catch: Error -> 0x0112, RuntimeException -> 0x0119, IOException -> 0x011e, HttpException -> 0x0123, ConnectionShutdownException -> 0x0128, TryCatch #3 {IOException -> 0x011e, Error -> 0x0112, ConnectionShutdownException -> 0x0128, RuntimeException -> 0x0119, HttpException -> 0x0123, blocks: (B:17:0x0057, B:19:0x005d, B:20:0x0061, B:21:0x0069, B:22:0x006a, B:24:0x0070, B:28:0x007a, B:29:0x0082, B:31:0x0088, B:32:0x008b, B:34:0x0093, B:36:0x009f, B:39:0x00b4, B:40:0x00b8, B:42:0x00e4, B:44:0x00f6, B:46:0x00fc, B:49:0x0103, B:51:0x0109, B:43:0x00f3), top: B:80:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e4 A[Catch: Error -> 0x0112, RuntimeException -> 0x0119, IOException -> 0x011e, HttpException -> 0x0123, ConnectionShutdownException -> 0x0128, TryCatch #3 {IOException -> 0x011e, Error -> 0x0112, ConnectionShutdownException -> 0x0128, RuntimeException -> 0x0119, HttpException -> 0x0123, blocks: (B:17:0x0057, B:19:0x005d, B:20:0x0061, B:21:0x0069, B:22:0x006a, B:24:0x0070, B:28:0x007a, B:29:0x0082, B:31:0x0088, B:32:0x008b, B:34:0x0093, B:36:0x009f, B:39:0x00b4, B:40:0x00b8, B:42:0x00e4, B:44:0x00f6, B:46:0x00fc, B:49:0x0103, B:51:0x0109, B:43:0x00f3), top: B:80:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f3 A[Catch: Error -> 0x0112, RuntimeException -> 0x0119, IOException -> 0x011e, HttpException -> 0x0123, ConnectionShutdownException -> 0x0128, TryCatch #3 {IOException -> 0x011e, Error -> 0x0112, ConnectionShutdownException -> 0x0128, RuntimeException -> 0x0119, HttpException -> 0x0123, blocks: (B:17:0x0057, B:19:0x005d, B:20:0x0061, B:21:0x0069, B:22:0x006a, B:24:0x0070, B:28:0x007a, B:29:0x0082, B:31:0x0088, B:32:0x008b, B:34:0x0093, B:36:0x009f, B:39:0x00b4, B:40:0x00b8, B:42:0x00e4, B:44:0x00f6, B:46:0x00fc, B:49:0x0103, B:51:0x0109, B:43:0x00f3), top: B:80:0x0057 }] */
    @Override // org.apache.http.impl.execchain.ClientExecChain
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CloseableHttpResponse execute(HttpRoute httpRoute, HttpRequestWrapper httpRequestWrapper, HttpClientContext httpClientContext, HttpExecutionAware httpExecutionAware) throws IOException, HttpException {
        Object obj;
        HttpResponse execute;
        HttpEntity entity;
        Args.notNull(httpRoute, "HTTP route");
        Args.notNull(httpRequestWrapper, "HTTP request");
        Args.notNull(httpClientContext, "HTTP context");
        rewriteRequestURI(httpRequestWrapper, httpRoute, httpClientContext.getRequestConfig().isNormalizeUri());
        ConnectionRequest requestConnection = this.connManager.requestConnection(httpRoute, null);
        if (httpExecutionAware != null) {
            if (httpExecutionAware.isAborted()) {
                requestConnection.cancel();
                throw new RequestAbortedException("Request aborted");
            }
            httpExecutionAware.setCancellable(requestConnection);
        }
        RequestConfig requestConfig = httpClientContext.getRequestConfig();
        try {
            int connectionRequestTimeout = requestConfig.getConnectionRequestTimeout();
            HttpClientConnection httpClientConnection = requestConnection.get(connectionRequestTimeout > 0 ? connectionRequestTimeout : 0L, TimeUnit.MILLISECONDS);
            ConnectionHolder connectionHolder = new ConnectionHolder(this.log, this.connManager, httpClientConnection);
            if (httpExecutionAware != null) {
                try {
                    if (httpExecutionAware.isAborted()) {
                        connectionHolder.close();
                        throw new RequestAbortedException("Request aborted");
                    }
                    httpExecutionAware.setCancellable(connectionHolder);
                } catch (IOException e) {
                    connectionHolder.abortConnection();
                    throw e;
                } catch (Error e2) {
                    this.connManager.shutdown();
                    throw e2;
                } catch (ConnectionShutdownException e3) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("Connection has been shut down");
                    interruptedIOException.initCause(e3);
                    throw interruptedIOException;
                } catch (RuntimeException e4) {
                    connectionHolder.abortConnection();
                    throw e4;
                } catch (HttpException e5) {
                    connectionHolder.abortConnection();
                    throw e5;
                }
            }
            if (!httpClientConnection.isOpen()) {
                int connectTimeout = requestConfig.getConnectTimeout();
                HttpClientConnectionManager httpClientConnectionManager = this.connManager;
                if (connectTimeout <= 0) {
                    connectTimeout = 0;
                }
                httpClientConnectionManager.connect(httpClientConnection, httpRoute, connectTimeout, httpClientContext);
                this.connManager.routeComplete(httpClientConnection, httpRoute, httpClientContext);
            }
            int socketTimeout = requestConfig.getSocketTimeout();
            if (socketTimeout >= 0) {
                httpClientConnection.setSocketTimeout(socketTimeout);
            }
            HttpRequest original = httpRequestWrapper.getOriginal();
            if (original instanceof HttpUriRequest) {
                URI uri = ((HttpUriRequest) original).getURI();
                if (uri.isAbsolute()) {
                    obj = new HttpHost(uri.getHost(), uri.getPort(), uri.getScheme());
                    if (obj == null) {
                        obj = httpRoute.getTargetHost();
                    }
                    httpClientContext.setAttribute("http.target_host", obj);
                    httpClientContext.setAttribute("http.request", httpRequestWrapper);
                    httpClientContext.setAttribute("http.connection", httpClientConnection);
                    httpClientContext.setAttribute("http.route", httpRoute);
                    this.httpProcessor.process(httpRequestWrapper, httpClientContext);
                    execute = this.requestExecutor.execute(httpRequestWrapper, httpClientConnection, httpClientContext);
                    this.httpProcessor.process(execute, httpClientContext);
                    if (!this.reuseStrategy.keepAlive(execute, httpClientContext)) {
                        connectionHolder.setValidFor(this.keepAliveStrategy.getKeepAliveDuration(execute, httpClientContext), TimeUnit.MILLISECONDS);
                        connectionHolder.markReusable();
                    } else {
                        connectionHolder.markNonReusable();
                    }
                    entity = execute.getEntity();
                    if (entity != null && entity.isStreaming()) {
                        return new HttpResponseProxy(execute, connectionHolder);
                    }
                    connectionHolder.releaseConnection();
                    return new HttpResponseProxy(execute, null);
                }
            }
            obj = null;
            if (obj == null) {
            }
            httpClientContext.setAttribute("http.target_host", obj);
            httpClientContext.setAttribute("http.request", httpRequestWrapper);
            httpClientContext.setAttribute("http.connection", httpClientConnection);
            httpClientContext.setAttribute("http.route", httpRoute);
            this.httpProcessor.process(httpRequestWrapper, httpClientContext);
            execute = this.requestExecutor.execute(httpRequestWrapper, httpClientConnection, httpClientContext);
            this.httpProcessor.process(execute, httpClientContext);
            if (!this.reuseStrategy.keepAlive(execute, httpClientContext)) {
            }
            entity = execute.getEntity();
            if (entity != null) {
                return new HttpResponseProxy(execute, connectionHolder);
            }
            connectionHolder.releaseConnection();
            return new HttpResponseProxy(execute, null);
        } catch (InterruptedException e6) {
            Thread.currentThread().interrupt();
            throw new RequestAbortedException("Request aborted", e6);
        } catch (ExecutionException e7) {
            e = e7;
            Throwable cause = e.getCause();
            if (cause != null) {
                e = cause;
            }
            throw new RequestAbortedException("Request execution failed", e);
        }
    }
}
