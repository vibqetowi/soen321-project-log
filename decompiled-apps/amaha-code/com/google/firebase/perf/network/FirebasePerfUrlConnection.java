package com.google.firebase.perf.network;

import androidx.annotation.Keep;
import gd.d;
import gf.c;
import gf.g;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import jf.e;
import kf.i;
/* loaded from: classes.dex */
public class FirebasePerfUrlConnection {
    @Keep
    public static Object getContent(URL url) {
        d dVar = new d(5, url);
        e eVar = e.M;
        i iVar = new i();
        iVar.c();
        long j10 = iVar.f23322u;
        ef.d dVar2 = new ef.d(eVar);
        try {
            URLConnection openConnection = ((URL) dVar.f16400v).openConnection();
            if (openConnection instanceof HttpsURLConnection) {
                return new gf.d((HttpsURLConnection) openConnection, iVar, dVar2).getContent();
            }
            if (openConnection instanceof HttpURLConnection) {
                return new c((HttpURLConnection) openConnection, iVar, dVar2).getContent();
            }
            return openConnection.getContent();
        } catch (IOException e10) {
            dVar2.g(j10);
            dVar2.j(iVar.a());
            dVar2.k(dVar.toString());
            g.c(dVar2);
            throw e10;
        }
    }

    @Keep
    public static Object instrument(Object obj) {
        if (obj instanceof HttpsURLConnection) {
            return new gf.d((HttpsURLConnection) obj, new i(), new ef.d(e.M));
        }
        if (obj instanceof HttpURLConnection) {
            return new c((HttpURLConnection) obj, new i(), new ef.d(e.M));
        }
        return obj;
    }

    @Keep
    public static InputStream openStream(URL url) {
        d dVar = new d(5, url);
        e eVar = e.M;
        i iVar = new i();
        iVar.c();
        long j10 = iVar.f23322u;
        ef.d dVar2 = new ef.d(eVar);
        try {
            URLConnection openConnection = ((URL) dVar.f16400v).openConnection();
            if (openConnection instanceof HttpsURLConnection) {
                return new gf.d((HttpsURLConnection) openConnection, iVar, dVar2).getInputStream();
            }
            if (openConnection instanceof HttpURLConnection) {
                return new c((HttpURLConnection) openConnection, iVar, dVar2).getInputStream();
            }
            return openConnection.getInputStream();
        } catch (IOException e10) {
            dVar2.g(j10);
            dVar2.j(iVar.a());
            dVar2.k(dVar.toString());
            g.c(dVar2);
            throw e10;
        }
    }

    @Keep
    public static Object getContent(URL url, Class[] clsArr) {
        d dVar = new d(5, url);
        e eVar = e.M;
        i iVar = new i();
        iVar.c();
        long j10 = iVar.f23322u;
        ef.d dVar2 = new ef.d(eVar);
        try {
            URLConnection openConnection = ((URL) dVar.f16400v).openConnection();
            if (openConnection instanceof HttpsURLConnection) {
                return new gf.d((HttpsURLConnection) openConnection, iVar, dVar2).getContent(clsArr);
            }
            if (openConnection instanceof HttpURLConnection) {
                return new c((HttpURLConnection) openConnection, iVar, dVar2).getContent(clsArr);
            }
            return openConnection.getContent(clsArr);
        } catch (IOException e10) {
            dVar2.g(j10);
            dVar2.j(iVar.a());
            dVar2.k(dVar.toString());
            g.c(dVar2);
            throw e10;
        }
    }
}
