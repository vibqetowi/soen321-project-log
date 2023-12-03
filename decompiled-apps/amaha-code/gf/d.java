package gf;

import android.os.Build;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.security.Permission;
import java.security.Principal;
import java.security.cert.Certificate;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import kf.i;
/* compiled from: InstrHttpsURLConnection.java */
/* loaded from: classes.dex */
public final class d extends HttpsURLConnection {

    /* renamed from: a  reason: collision with root package name */
    public final e f16480a;

    /* renamed from: b  reason: collision with root package name */
    public final HttpsURLConnection f16481b;

    public d(HttpsURLConnection httpsURLConnection, i iVar, ef.d dVar) {
        super(httpsURLConnection.getURL());
        this.f16481b = httpsURLConnection;
        this.f16480a = new e(httpsURLConnection, iVar, dVar);
    }

    @Override // java.net.URLConnection
    public final void addRequestProperty(String str, String str2) {
        this.f16480a.f16482a.addRequestProperty(str, str2);
    }

    @Override // java.net.URLConnection
    public final void connect() {
        this.f16480a.a();
    }

    @Override // java.net.HttpURLConnection
    public final void disconnect() {
        e eVar = this.f16480a;
        long a10 = eVar.f16486e.a();
        ef.d dVar = eVar.f16483b;
        dVar.j(a10);
        dVar.b();
        eVar.f16482a.disconnect();
    }

    public final boolean equals(Object obj) {
        return this.f16480a.equals(obj);
    }

    @Override // java.net.URLConnection
    public final boolean getAllowUserInteraction() {
        return this.f16480a.f16482a.getAllowUserInteraction();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final String getCipherSuite() {
        return this.f16481b.getCipherSuite();
    }

    @Override // java.net.URLConnection
    public final int getConnectTimeout() {
        return this.f16480a.f16482a.getConnectTimeout();
    }

    @Override // java.net.URLConnection
    public final Object getContent() {
        return this.f16480a.b();
    }

    @Override // java.net.URLConnection
    public final String getContentEncoding() {
        e eVar = this.f16480a;
        eVar.i();
        return eVar.f16482a.getContentEncoding();
    }

    @Override // java.net.URLConnection
    public final int getContentLength() {
        e eVar = this.f16480a;
        eVar.i();
        return eVar.f16482a.getContentLength();
    }

    @Override // java.net.URLConnection
    public final long getContentLengthLong() {
        long contentLengthLong;
        e eVar = this.f16480a;
        eVar.i();
        if (Build.VERSION.SDK_INT >= 24) {
            contentLengthLong = eVar.f16482a.getContentLengthLong();
            return contentLengthLong;
        }
        return 0L;
    }

    @Override // java.net.URLConnection
    public final String getContentType() {
        e eVar = this.f16480a;
        eVar.i();
        return eVar.f16482a.getContentType();
    }

    @Override // java.net.URLConnection
    public final long getDate() {
        e eVar = this.f16480a;
        eVar.i();
        return eVar.f16482a.getDate();
    }

    @Override // java.net.URLConnection
    public final boolean getDefaultUseCaches() {
        return this.f16480a.f16482a.getDefaultUseCaches();
    }

    @Override // java.net.URLConnection
    public final boolean getDoInput() {
        return this.f16480a.f16482a.getDoInput();
    }

    @Override // java.net.URLConnection
    public final boolean getDoOutput() {
        return this.f16480a.f16482a.getDoOutput();
    }

    @Override // java.net.HttpURLConnection
    public final InputStream getErrorStream() {
        return this.f16480a.d();
    }

    @Override // java.net.URLConnection
    public final long getExpiration() {
        e eVar = this.f16480a;
        eVar.i();
        return eVar.f16482a.getExpiration();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final String getHeaderField(int i6) {
        e eVar = this.f16480a;
        eVar.i();
        return eVar.f16482a.getHeaderField(i6);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final long getHeaderFieldDate(String str, long j10) {
        e eVar = this.f16480a;
        eVar.i();
        return eVar.f16482a.getHeaderFieldDate(str, j10);
    }

    @Override // java.net.URLConnection
    public final int getHeaderFieldInt(String str, int i6) {
        e eVar = this.f16480a;
        eVar.i();
        return eVar.f16482a.getHeaderFieldInt(str, i6);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final String getHeaderFieldKey(int i6) {
        e eVar = this.f16480a;
        eVar.i();
        return eVar.f16482a.getHeaderFieldKey(i6);
    }

    @Override // java.net.URLConnection
    public final long getHeaderFieldLong(String str, long j10) {
        long headerFieldLong;
        e eVar = this.f16480a;
        eVar.i();
        if (Build.VERSION.SDK_INT >= 24) {
            headerFieldLong = eVar.f16482a.getHeaderFieldLong(str, j10);
            return headerFieldLong;
        }
        return 0L;
    }

    @Override // java.net.URLConnection
    public final Map<String, List<String>> getHeaderFields() {
        e eVar = this.f16480a;
        eVar.i();
        return eVar.f16482a.getHeaderFields();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final HostnameVerifier getHostnameVerifier() {
        return this.f16481b.getHostnameVerifier();
    }

    @Override // java.net.URLConnection
    public final long getIfModifiedSince() {
        return this.f16480a.f16482a.getIfModifiedSince();
    }

    @Override // java.net.URLConnection
    public final InputStream getInputStream() {
        return this.f16480a.e();
    }

    @Override // java.net.HttpURLConnection
    public final boolean getInstanceFollowRedirects() {
        return this.f16480a.f16482a.getInstanceFollowRedirects();
    }

    @Override // java.net.URLConnection
    public final long getLastModified() {
        e eVar = this.f16480a;
        eVar.i();
        return eVar.f16482a.getLastModified();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final Certificate[] getLocalCertificates() {
        return this.f16481b.getLocalCertificates();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final Principal getLocalPrincipal() {
        return this.f16481b.getLocalPrincipal();
    }

    @Override // java.net.URLConnection
    public final OutputStream getOutputStream() {
        return this.f16480a.f();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final Principal getPeerPrincipal() {
        return this.f16481b.getPeerPrincipal();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final Permission getPermission() {
        e eVar = this.f16480a;
        eVar.getClass();
        try {
            return eVar.f16482a.getPermission();
        } catch (IOException e10) {
            long a10 = eVar.f16486e.a();
            ef.d dVar = eVar.f16483b;
            dVar.j(a10);
            g.c(dVar);
            throw e10;
        }
    }

    @Override // java.net.URLConnection
    public final int getReadTimeout() {
        return this.f16480a.f16482a.getReadTimeout();
    }

    @Override // java.net.HttpURLConnection
    public final String getRequestMethod() {
        return this.f16480a.f16482a.getRequestMethod();
    }

    @Override // java.net.URLConnection
    public final Map<String, List<String>> getRequestProperties() {
        return this.f16480a.f16482a.getRequestProperties();
    }

    @Override // java.net.URLConnection
    public final String getRequestProperty(String str) {
        return this.f16480a.f16482a.getRequestProperty(str);
    }

    @Override // java.net.HttpURLConnection
    public final int getResponseCode() {
        return this.f16480a.g();
    }

    @Override // java.net.HttpURLConnection
    public final String getResponseMessage() {
        return this.f16480a.h();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final SSLSocketFactory getSSLSocketFactory() {
        return this.f16481b.getSSLSocketFactory();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final Certificate[] getServerCertificates() {
        return this.f16481b.getServerCertificates();
    }

    @Override // java.net.URLConnection
    public final URL getURL() {
        return this.f16480a.f16482a.getURL();
    }

    @Override // java.net.URLConnection
    public final boolean getUseCaches() {
        return this.f16480a.f16482a.getUseCaches();
    }

    public final int hashCode() {
        return this.f16480a.hashCode();
    }

    @Override // java.net.URLConnection
    public final void setAllowUserInteraction(boolean z10) {
        this.f16480a.f16482a.setAllowUserInteraction(z10);
    }

    @Override // java.net.HttpURLConnection
    public final void setChunkedStreamingMode(int i6) {
        this.f16480a.f16482a.setChunkedStreamingMode(i6);
    }

    @Override // java.net.URLConnection
    public final void setConnectTimeout(int i6) {
        this.f16480a.f16482a.setConnectTimeout(i6);
    }

    @Override // java.net.URLConnection
    public final void setDefaultUseCaches(boolean z10) {
        this.f16480a.f16482a.setDefaultUseCaches(z10);
    }

    @Override // java.net.URLConnection
    public final void setDoInput(boolean z10) {
        this.f16480a.f16482a.setDoInput(z10);
    }

    @Override // java.net.URLConnection
    public final void setDoOutput(boolean z10) {
        this.f16480a.f16482a.setDoOutput(z10);
    }

    @Override // java.net.HttpURLConnection
    public final void setFixedLengthStreamingMode(int i6) {
        this.f16480a.f16482a.setFixedLengthStreamingMode(i6);
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final void setHostnameVerifier(HostnameVerifier hostnameVerifier) {
        this.f16481b.setHostnameVerifier(hostnameVerifier);
    }

    @Override // java.net.URLConnection
    public final void setIfModifiedSince(long j10) {
        this.f16480a.f16482a.setIfModifiedSince(j10);
    }

    @Override // java.net.HttpURLConnection
    public final void setInstanceFollowRedirects(boolean z10) {
        this.f16480a.f16482a.setInstanceFollowRedirects(z10);
    }

    @Override // java.net.URLConnection
    public final void setReadTimeout(int i6) {
        this.f16480a.f16482a.setReadTimeout(i6);
    }

    @Override // java.net.HttpURLConnection
    public final void setRequestMethod(String str) {
        this.f16480a.f16482a.setRequestMethod(str);
    }

    @Override // java.net.URLConnection
    public final void setRequestProperty(String str, String str2) {
        e eVar = this.f16480a;
        eVar.getClass();
        if ("User-Agent".equalsIgnoreCase(str)) {
            eVar.f16483b.f13955z = str2;
        }
        eVar.f16482a.setRequestProperty(str, str2);
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public final void setSSLSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.f16481b.setSSLSocketFactory(sSLSocketFactory);
    }

    @Override // java.net.URLConnection
    public final void setUseCaches(boolean z10) {
        this.f16480a.f16482a.setUseCaches(z10);
    }

    @Override // java.net.URLConnection
    public final String toString() {
        return this.f16480a.toString();
    }

    @Override // java.net.HttpURLConnection
    public final boolean usingProxy() {
        return this.f16480a.f16482a.usingProxy();
    }

    @Override // java.net.URLConnection
    public final Object getContent(Class[] clsArr) {
        return this.f16480a.c(clsArr);
    }

    @Override // java.net.URLConnection
    public final String getHeaderField(String str) {
        e eVar = this.f16480a;
        eVar.i();
        return eVar.f16482a.getHeaderField(str);
    }

    @Override // java.net.HttpURLConnection
    public final void setFixedLengthStreamingMode(long j10) {
        this.f16480a.f16482a.setFixedLengthStreamingMode(j10);
    }
}
