package com.google.firebase.perf.network;

import com.google.firebase.perf.metrics.NetworkRequestMetricBuilder;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ProtocolException;
import java.net.URL;
import java.security.Permission;
import java.security.Principal;
import java.security.cert.Certificate;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
/* loaded from: classes7.dex */
public final class InstrHttpsURLConnection extends HttpsURLConnection {
    private final InstrURLConnectionBase delegate;
    private final HttpsURLConnection httpsURLConnection;

    /* JADX INFO: Access modifiers changed from: package-private */
    public InstrHttpsURLConnection(HttpsURLConnection httpsURLConnection, Timer timer, NetworkRequestMetricBuilder networkRequestMetricBuilder) {
        super(httpsURLConnection.getURL());
        this.httpsURLConnection = httpsURLConnection;
        this.delegate = new InstrURLConnectionBase(httpsURLConnection, timer, networkRequestMetricBuilder);
    }

    @Override // java.net.URLConnection
    public void connect() throws IOException {
        this.delegate.connect();
    }

    @Override // java.net.HttpURLConnection
    public void disconnect() {
        this.delegate.disconnect();
    }

    @Override // java.net.URLConnection
    public Object getContent() throws IOException {
        return this.delegate.getContent();
    }

    @Override // java.net.URLConnection
    public Object getContent(Class[] clsArr) throws IOException {
        return this.delegate.getContent(clsArr);
    }

    @Override // java.net.URLConnection
    public InputStream getInputStream() throws IOException {
        return this.delegate.getInputStream();
    }

    @Override // java.net.URLConnection
    public long getLastModified() {
        return this.delegate.getLastModified();
    }

    @Override // java.net.URLConnection
    public OutputStream getOutputStream() throws IOException {
        return this.delegate.getOutputStream();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public Permission getPermission() throws IOException {
        return this.delegate.getPermission();
    }

    @Override // java.net.HttpURLConnection
    public int getResponseCode() throws IOException {
        return this.delegate.getResponseCode();
    }

    @Override // java.net.HttpURLConnection
    public String getResponseMessage() throws IOException {
        return this.delegate.getResponseMessage();
    }

    @Override // java.net.URLConnection
    public long getExpiration() {
        return this.delegate.getExpiration();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public String getHeaderField(int i) {
        return this.delegate.getHeaderField(i);
    }

    @Override // java.net.URLConnection
    public String getHeaderField(String str) {
        return this.delegate.getHeaderField(str);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public long getHeaderFieldDate(String str, long j) {
        return this.delegate.getHeaderFieldDate(str, j);
    }

    @Override // java.net.URLConnection
    public int getHeaderFieldInt(String str, int i) {
        return this.delegate.getHeaderFieldInt(str, i);
    }

    @Override // java.net.URLConnection
    public long getHeaderFieldLong(String str, long j) {
        return this.delegate.getHeaderFieldLong(str, j);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public String getHeaderFieldKey(int i) {
        return this.delegate.getHeaderFieldKey(i);
    }

    @Override // java.net.URLConnection
    public Map<String, List<String>> getHeaderFields() {
        return this.delegate.getHeaderFields();
    }

    @Override // java.net.URLConnection
    public String getContentEncoding() {
        return this.delegate.getContentEncoding();
    }

    @Override // java.net.URLConnection
    public int getContentLength() {
        return this.delegate.getContentLength();
    }

    @Override // java.net.URLConnection
    public long getContentLengthLong() {
        return this.delegate.getContentLengthLong();
    }

    @Override // java.net.URLConnection
    public String getContentType() {
        return this.delegate.getContentType();
    }

    @Override // java.net.URLConnection
    public long getDate() {
        return this.delegate.getDate();
    }

    @Override // java.net.URLConnection
    public void addRequestProperty(String str, String str2) {
        this.delegate.addRequestProperty(str, str2);
    }

    public boolean equals(Object obj) {
        return this.delegate.equals(obj);
    }

    @Override // java.net.URLConnection
    public boolean getAllowUserInteraction() {
        return this.delegate.getAllowUserInteraction();
    }

    @Override // java.net.URLConnection
    public int getConnectTimeout() {
        return this.delegate.getConnectTimeout();
    }

    @Override // java.net.URLConnection
    public boolean getDefaultUseCaches() {
        return this.delegate.getDefaultUseCaches();
    }

    @Override // java.net.URLConnection
    public boolean getDoInput() {
        return this.delegate.getDoInput();
    }

    @Override // java.net.URLConnection
    public boolean getDoOutput() {
        return this.delegate.getDoOutput();
    }

    @Override // java.net.HttpURLConnection
    public InputStream getErrorStream() {
        return this.delegate.getErrorStream();
    }

    @Override // java.net.URLConnection
    public long getIfModifiedSince() {
        return this.delegate.getIfModifiedSince();
    }

    @Override // java.net.HttpURLConnection
    public boolean getInstanceFollowRedirects() {
        return this.delegate.getInstanceFollowRedirects();
    }

    @Override // java.net.URLConnection
    public int getReadTimeout() {
        return this.delegate.getReadTimeout();
    }

    @Override // java.net.HttpURLConnection
    public String getRequestMethod() {
        return this.delegate.getRequestMethod();
    }

    @Override // java.net.URLConnection
    public Map<String, List<String>> getRequestProperties() {
        return this.delegate.getRequestProperties();
    }

    @Override // java.net.URLConnection
    public String getRequestProperty(String str) {
        return this.delegate.getRequestProperty(str);
    }

    @Override // java.net.URLConnection
    public URL getURL() {
        return this.delegate.getURL();
    }

    @Override // java.net.URLConnection
    public boolean getUseCaches() {
        return this.delegate.getUseCaches();
    }

    public int hashCode() {
        return this.delegate.hashCode();
    }

    @Override // java.net.URLConnection
    public void setAllowUserInteraction(boolean z) {
        this.delegate.setAllowUserInteraction(z);
    }

    @Override // java.net.HttpURLConnection
    public void setChunkedStreamingMode(int i) {
        this.delegate.setChunkedStreamingMode(i);
    }

    @Override // java.net.URLConnection
    public void setConnectTimeout(int i) {
        this.delegate.setConnectTimeout(i);
    }

    @Override // java.net.URLConnection
    public void setDefaultUseCaches(boolean z) {
        this.delegate.setDefaultUseCaches(z);
    }

    @Override // java.net.URLConnection
    public void setDoInput(boolean z) {
        this.delegate.setDoInput(z);
    }

    @Override // java.net.URLConnection
    public void setDoOutput(boolean z) {
        this.delegate.setDoOutput(z);
    }

    @Override // java.net.HttpURLConnection
    public void setFixedLengthStreamingMode(int i) {
        this.delegate.setFixedLengthStreamingMode(i);
    }

    @Override // java.net.HttpURLConnection
    public void setFixedLengthStreamingMode(long j) {
        this.delegate.setFixedLengthStreamingMode(j);
    }

    @Override // java.net.URLConnection
    public void setIfModifiedSince(long j) {
        this.delegate.setIfModifiedSince(j);
    }

    @Override // java.net.HttpURLConnection
    public void setInstanceFollowRedirects(boolean z) {
        this.delegate.setInstanceFollowRedirects(z);
    }

    @Override // java.net.URLConnection
    public void setReadTimeout(int i) {
        this.delegate.setReadTimeout(i);
    }

    @Override // java.net.HttpURLConnection
    public void setRequestMethod(String str) throws ProtocolException {
        this.delegate.setRequestMethod(str);
    }

    @Override // java.net.URLConnection
    public void setRequestProperty(String str, String str2) {
        this.delegate.setRequestProperty(str, str2);
    }

    @Override // java.net.URLConnection
    public void setUseCaches(boolean z) {
        this.delegate.setUseCaches(z);
    }

    @Override // java.net.URLConnection
    public String toString() {
        return this.delegate.toString();
    }

    @Override // java.net.HttpURLConnection
    public boolean usingProxy() {
        return this.delegate.usingProxy();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public String getCipherSuite() {
        return this.httpsURLConnection.getCipherSuite();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public HostnameVerifier getHostnameVerifier() {
        return this.httpsURLConnection.getHostnameVerifier();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public Certificate[] getLocalCertificates() {
        return this.httpsURLConnection.getLocalCertificates();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public Principal getLocalPrincipal() {
        return this.httpsURLConnection.getLocalPrincipal();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public Principal getPeerPrincipal() throws SSLPeerUnverifiedException {
        return this.httpsURLConnection.getPeerPrincipal();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public Certificate[] getServerCertificates() throws SSLPeerUnverifiedException {
        return this.httpsURLConnection.getServerCertificates();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public SSLSocketFactory getSSLSocketFactory() {
        return this.httpsURLConnection.getSSLSocketFactory();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public void setHostnameVerifier(HostnameVerifier hostnameVerifier) {
        this.httpsURLConnection.setHostnameVerifier(hostnameVerifier);
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public void setSSLSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.httpsURLConnection.setSSLSocketFactory(sSLSocketFactory);
    }
}
