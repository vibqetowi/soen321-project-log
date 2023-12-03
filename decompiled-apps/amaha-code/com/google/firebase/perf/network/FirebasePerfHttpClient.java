package com.google.firebase.perf.network;

import androidx.annotation.Keep;
import ef.d;
import gf.f;
import gf.g;
import java.io.IOException;
import jf.e;
import kf.i;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.protocol.HttpContext;
/* loaded from: classes.dex */
public class FirebasePerfHttpClient {
    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest) {
        i iVar = new i();
        d c10 = d.c(e.M);
        try {
            c10.k(httpUriRequest.getURI().toString());
            c10.d(httpUriRequest.getMethod());
            Long a10 = g.a(httpUriRequest);
            if (a10 != null) {
                c10.f(a10.longValue());
            }
            iVar.c();
            c10.g(iVar.b());
            HttpResponse execute = httpClient.execute(httpUriRequest);
            c10.j(iVar.a());
            c10.e(execute.getStatusLine().getStatusCode());
            Long a11 = g.a(execute);
            if (a11 != null) {
                c10.i(a11.longValue());
            }
            String b10 = g.b(execute);
            if (b10 != null) {
                c10.h(b10);
            }
            c10.b();
            return execute;
        } catch (IOException e10) {
            b.t(iVar, c10, c10);
            throw e10;
        }
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest, HttpContext httpContext) {
        i iVar = new i();
        d c10 = d.c(e.M);
        try {
            c10.k(httpUriRequest.getURI().toString());
            c10.d(httpUriRequest.getMethod());
            Long a10 = g.a(httpUriRequest);
            if (a10 != null) {
                c10.f(a10.longValue());
            }
            iVar.c();
            c10.g(iVar.b());
            HttpResponse execute = httpClient.execute(httpUriRequest, httpContext);
            c10.j(iVar.a());
            c10.e(execute.getStatusLine().getStatusCode());
            Long a11 = g.a(execute);
            if (a11 != null) {
                c10.i(a11.longValue());
            }
            String b10 = g.b(execute);
            if (b10 != null) {
                c10.h(b10);
            }
            c10.b();
            return execute;
        } catch (IOException e10) {
            b.t(iVar, c10, c10);
            throw e10;
        }
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler) {
        i iVar = new i();
        d c10 = d.c(e.M);
        try {
            c10.k(httpUriRequest.getURI().toString());
            c10.d(httpUriRequest.getMethod());
            Long a10 = g.a(httpUriRequest);
            if (a10 != null) {
                c10.f(a10.longValue());
            }
            iVar.c();
            c10.g(iVar.b());
            return (T) httpClient.execute(httpUriRequest, new f(responseHandler, iVar, c10));
        } catch (IOException e10) {
            b.t(iVar, c10, c10);
            throw e10;
        }
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler, HttpContext httpContext) {
        i iVar = new i();
        d c10 = d.c(e.M);
        try {
            c10.k(httpUriRequest.getURI().toString());
            c10.d(httpUriRequest.getMethod());
            Long a10 = g.a(httpUriRequest);
            if (a10 != null) {
                c10.f(a10.longValue());
            }
            iVar.c();
            c10.g(iVar.b());
            return (T) httpClient.execute(httpUriRequest, new f(responseHandler, iVar, c10), httpContext);
        } catch (IOException e10) {
            b.t(iVar, c10, c10);
            throw e10;
        }
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest) {
        i iVar = new i();
        d c10 = d.c(e.M);
        try {
            c10.k(httpHost.toURI() + httpRequest.getRequestLine().getUri());
            c10.d(httpRequest.getRequestLine().getMethod());
            Long a10 = g.a(httpRequest);
            if (a10 != null) {
                c10.f(a10.longValue());
            }
            iVar.c();
            c10.g(iVar.b());
            HttpResponse execute = httpClient.execute(httpHost, httpRequest);
            c10.j(iVar.a());
            c10.e(execute.getStatusLine().getStatusCode());
            Long a11 = g.a(execute);
            if (a11 != null) {
                c10.i(a11.longValue());
            }
            String b10 = g.b(execute);
            if (b10 != null) {
                c10.h(b10);
            }
            c10.b();
            return execute;
        } catch (IOException e10) {
            b.t(iVar, c10, c10);
            throw e10;
        }
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) {
        i iVar = new i();
        d c10 = d.c(e.M);
        try {
            c10.k(httpHost.toURI() + httpRequest.getRequestLine().getUri());
            c10.d(httpRequest.getRequestLine().getMethod());
            Long a10 = g.a(httpRequest);
            if (a10 != null) {
                c10.f(a10.longValue());
            }
            iVar.c();
            c10.g(iVar.b());
            HttpResponse execute = httpClient.execute(httpHost, httpRequest, httpContext);
            c10.j(iVar.a());
            c10.e(execute.getStatusLine().getStatusCode());
            Long a11 = g.a(execute);
            if (a11 != null) {
                c10.i(a11.longValue());
            }
            String b10 = g.b(execute);
            if (b10 != null) {
                c10.h(b10);
            }
            c10.b();
            return execute;
        } catch (IOException e10) {
            b.t(iVar, c10, c10);
            throw e10;
        }
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler) {
        i iVar = new i();
        d c10 = d.c(e.M);
        try {
            c10.k(httpHost.toURI() + httpRequest.getRequestLine().getUri());
            c10.d(httpRequest.getRequestLine().getMethod());
            Long a10 = g.a(httpRequest);
            if (a10 != null) {
                c10.f(a10.longValue());
            }
            iVar.c();
            c10.g(iVar.b());
            return (T) httpClient.execute(httpHost, httpRequest, new f(responseHandler, iVar, c10));
        } catch (IOException e10) {
            b.t(iVar, c10, c10);
            throw e10;
        }
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) {
        i iVar = new i();
        d c10 = d.c(e.M);
        try {
            c10.k(httpHost.toURI() + httpRequest.getRequestLine().getUri());
            c10.d(httpRequest.getRequestLine().getMethod());
            Long a10 = g.a(httpRequest);
            if (a10 != null) {
                c10.f(a10.longValue());
            }
            iVar.c();
            c10.g(iVar.b());
            return (T) httpClient.execute(httpHost, httpRequest, new f(responseHandler, iVar, c10), httpContext);
        } catch (IOException e10) {
            b.t(iVar, c10, c10);
            throw e10;
        }
    }
}
