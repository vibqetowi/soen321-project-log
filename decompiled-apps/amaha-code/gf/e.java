package gf;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import kf.i;
import lf.h;
/* compiled from: InstrURLConnectionBase.java */
/* loaded from: classes.dex */
public final class e {
    public static final df.a f = df.a.d();

    /* renamed from: a  reason: collision with root package name */
    public final HttpURLConnection f16482a;

    /* renamed from: b  reason: collision with root package name */
    public final ef.d f16483b;

    /* renamed from: c  reason: collision with root package name */
    public long f16484c = -1;

    /* renamed from: d  reason: collision with root package name */
    public long f16485d = -1;

    /* renamed from: e  reason: collision with root package name */
    public final i f16486e;

    public e(HttpURLConnection httpURLConnection, i iVar, ef.d dVar) {
        this.f16482a = httpURLConnection;
        this.f16483b = dVar;
        this.f16486e = iVar;
        dVar.k(httpURLConnection.getURL().toString());
    }

    public final void a() {
        long j10 = this.f16484c;
        ef.d dVar = this.f16483b;
        i iVar = this.f16486e;
        if (j10 == -1) {
            iVar.c();
            long j11 = iVar.f23322u;
            this.f16484c = j11;
            dVar.g(j11);
        }
        try {
            this.f16482a.connect();
        } catch (IOException e10) {
            defpackage.b.t(iVar, dVar, dVar);
            throw e10;
        }
    }

    public final Object b() {
        i iVar = this.f16486e;
        i();
        HttpURLConnection httpURLConnection = this.f16482a;
        int responseCode = httpURLConnection.getResponseCode();
        ef.d dVar = this.f16483b;
        dVar.e(responseCode);
        try {
            Object content = httpURLConnection.getContent();
            if (content instanceof InputStream) {
                dVar.h(httpURLConnection.getContentType());
                return new a((InputStream) content, dVar, iVar);
            }
            dVar.h(httpURLConnection.getContentType());
            dVar.i(httpURLConnection.getContentLength());
            dVar.j(iVar.a());
            dVar.b();
            return content;
        } catch (IOException e10) {
            defpackage.b.t(iVar, dVar, dVar);
            throw e10;
        }
    }

    public final Object c(Class[] clsArr) {
        i iVar = this.f16486e;
        i();
        HttpURLConnection httpURLConnection = this.f16482a;
        int responseCode = httpURLConnection.getResponseCode();
        ef.d dVar = this.f16483b;
        dVar.e(responseCode);
        try {
            Object content = httpURLConnection.getContent(clsArr);
            if (content instanceof InputStream) {
                dVar.h(httpURLConnection.getContentType());
                return new a((InputStream) content, dVar, iVar);
            }
            dVar.h(httpURLConnection.getContentType());
            dVar.i(httpURLConnection.getContentLength());
            dVar.j(iVar.a());
            dVar.b();
            return content;
        } catch (IOException e10) {
            defpackage.b.t(iVar, dVar, dVar);
            throw e10;
        }
    }

    public final InputStream d() {
        HttpURLConnection httpURLConnection = this.f16482a;
        ef.d dVar = this.f16483b;
        i();
        try {
            dVar.e(httpURLConnection.getResponseCode());
        } catch (IOException unused) {
            f.a("IOException thrown trying to obtain the response code");
        }
        InputStream errorStream = httpURLConnection.getErrorStream();
        if (errorStream != null) {
            return new a(errorStream, dVar, this.f16486e);
        }
        return errorStream;
    }

    public final InputStream e() {
        i iVar = this.f16486e;
        i();
        HttpURLConnection httpURLConnection = this.f16482a;
        int responseCode = httpURLConnection.getResponseCode();
        ef.d dVar = this.f16483b;
        dVar.e(responseCode);
        dVar.h(httpURLConnection.getContentType());
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            if (inputStream != null) {
                return new a(inputStream, dVar, iVar);
            }
            return inputStream;
        } catch (IOException e10) {
            defpackage.b.t(iVar, dVar, dVar);
            throw e10;
        }
    }

    public final boolean equals(Object obj) {
        return this.f16482a.equals(obj);
    }

    public final OutputStream f() {
        i iVar = this.f16486e;
        ef.d dVar = this.f16483b;
        try {
            OutputStream outputStream = this.f16482a.getOutputStream();
            if (outputStream != null) {
                return new b(outputStream, dVar, iVar);
            }
            return outputStream;
        } catch (IOException e10) {
            defpackage.b.t(iVar, dVar, dVar);
            throw e10;
        }
    }

    public final int g() {
        i();
        long j10 = this.f16485d;
        i iVar = this.f16486e;
        ef.d dVar = this.f16483b;
        if (j10 == -1) {
            long a10 = iVar.a();
            this.f16485d = a10;
            h.a aVar = dVar.f13953x;
            aVar.u();
            h.T((h) aVar.f10073v, a10);
        }
        try {
            int responseCode = this.f16482a.getResponseCode();
            dVar.e(responseCode);
            return responseCode;
        } catch (IOException e10) {
            defpackage.b.t(iVar, dVar, dVar);
            throw e10;
        }
    }

    public final String h() {
        HttpURLConnection httpURLConnection = this.f16482a;
        i();
        long j10 = this.f16485d;
        i iVar = this.f16486e;
        ef.d dVar = this.f16483b;
        if (j10 == -1) {
            long a10 = iVar.a();
            this.f16485d = a10;
            h.a aVar = dVar.f13953x;
            aVar.u();
            h.T((h) aVar.f10073v, a10);
        }
        try {
            String responseMessage = httpURLConnection.getResponseMessage();
            dVar.e(httpURLConnection.getResponseCode());
            return responseMessage;
        } catch (IOException e10) {
            defpackage.b.t(iVar, dVar, dVar);
            throw e10;
        }
    }

    public final int hashCode() {
        return this.f16482a.hashCode();
    }

    public final void i() {
        long j10 = this.f16484c;
        ef.d dVar = this.f16483b;
        if (j10 == -1) {
            i iVar = this.f16486e;
            iVar.c();
            long j11 = iVar.f23322u;
            this.f16484c = j11;
            dVar.g(j11);
        }
        HttpURLConnection httpURLConnection = this.f16482a;
        String requestMethod = httpURLConnection.getRequestMethod();
        if (requestMethod != null) {
            dVar.d(requestMethod);
        } else if (httpURLConnection.getDoOutput()) {
            dVar.d("POST");
        } else {
            dVar.d("GET");
        }
    }

    public final String toString() {
        return this.f16482a.toString();
    }
}
