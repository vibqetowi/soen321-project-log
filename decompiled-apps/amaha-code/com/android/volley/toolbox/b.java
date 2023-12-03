package com.android.volley.toolbox;

import android.os.SystemClock;
import com.android.volley.AuthFailureError;
import com.android.volley.ClientError;
import com.android.volley.NetworkError;
import com.android.volley.NoConnectionError;
import com.android.volley.ServerError;
import com.android.volley.TimeoutError;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.j;
import e4.a;
import e4.o;
import j$.util.DesugarTimeZone;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
/* compiled from: BasicNetwork.java */
/* loaded from: classes.dex */
public final class b implements e4.g {

    /* renamed from: a  reason: collision with root package name */
    public final a f5872a;

    /* renamed from: b  reason: collision with root package name */
    public final c f5873b;

    public b(g gVar) {
        c cVar = new c();
        this.f5872a = gVar;
        this.f5873b = cVar;
    }

    public final e4.i a(e4.j<?> jVar) {
        byte[] bArr;
        IOException e10;
        j.a aVar;
        e4.i iVar;
        j.a aVar2;
        String str;
        int timeoutMs;
        Map map;
        byte[] bArr2;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            Collections.emptyList();
            f fVar = null;
            try {
                a.C0214a cacheEntry = jVar.getCacheEntry();
                if (cacheEntry == null) {
                    map = Collections.emptyMap();
                } else {
                    HashMap hashMap = new HashMap();
                    String str2 = cacheEntry.f13739b;
                    if (str2 != null) {
                        hashMap.put("If-None-Match", str2);
                    }
                    long j10 = cacheEntry.f13741d;
                    if (j10 > 0) {
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
                        hashMap.put("If-Modified-Since", simpleDateFormat.format(new Date(j10)));
                    }
                    map = hashMap;
                }
                f d10 = this.f5872a.d(jVar, map);
                try {
                    int i6 = d10.f5892a;
                    List<e4.f> b10 = d10.b();
                    if (i6 == 304) {
                        return j.a(jVar, SystemClock.elapsedRealtime() - elapsedRealtime, b10);
                    }
                    InputStream a10 = d10.a();
                    if (a10 != null) {
                        bArr2 = j.b(a10, d10.f5894c, this.f5873b);
                    } else {
                        bArr2 = new byte[0];
                    }
                    j.c(SystemClock.elapsedRealtime() - elapsedRealtime, jVar, bArr2, i6);
                    if (i6 >= 200 && i6 <= 299) {
                        return new e4.i(i6, bArr2, false, SystemClock.elapsedRealtime() - elapsedRealtime, b10);
                    }
                    throw new IOException();
                } catch (IOException e11) {
                    e10 = e11;
                    bArr = null;
                    fVar = d10;
                    if (e10 instanceof SocketTimeoutException) {
                        aVar = new j.a("socket", new TimeoutError());
                    } else if (!(e10 instanceof MalformedURLException)) {
                        if (fVar != null) {
                            int i10 = fVar.f5892a;
                            o.c("Unexpected response code %d for %s", Integer.valueOf(i10), jVar.getUrl());
                            if (bArr != null) {
                                iVar = new e4.i(i10, bArr, false, SystemClock.elapsedRealtime() - elapsedRealtime, fVar.b());
                                if (i10 != 401 && i10 != 403) {
                                    if (i10 >= 400 && i10 <= 499) {
                                        throw new ClientError(iVar);
                                    }
                                    if (i10 >= 500 && i10 <= 599 && jVar.shouldRetryServerErrors()) {
                                        aVar2 = new j.a("server", new ServerError(iVar));
                                    } else {
                                        throw new ServerError(iVar);
                                    }
                                } else {
                                    aVar2 = new j.a("auth", new AuthFailureError(iVar));
                                }
                                aVar = aVar2;
                            } else {
                                aVar = new j.a("network", new NetworkError());
                            }
                        } else if (jVar.shouldRetryConnectionErrors()) {
                            aVar = new j.a("connection", new NoConnectionError());
                        } else {
                            throw new NoConnectionError(e10);
                        }
                    } else {
                        throw new RuntimeException("Bad URL " + jVar.getUrl(), e10);
                    }
                    str = aVar.f5897a;
                    e4.n retryPolicy = jVar.getRetryPolicy();
                    timeoutMs = jVar.getTimeoutMs();
                    try {
                        retryPolicy.a(aVar.f5898b);
                        jVar.addMarker(String.format("%s-retry [timeout=%s]", str, Integer.valueOf(timeoutMs)));
                    } catch (VolleyError e12) {
                        jVar.addMarker(String.format("%s-timeout-giveup [timeout=%s]", str, Integer.valueOf(timeoutMs)));
                        throw e12;
                    }
                }
            } catch (IOException e13) {
                bArr = null;
                e10 = e13;
            }
            jVar.addMarker(String.format("%s-retry [timeout=%s]", str, Integer.valueOf(timeoutMs)));
        }
        throw new ServerError(iVar);
    }
}
