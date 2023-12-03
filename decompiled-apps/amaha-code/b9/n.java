package b9;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import c9.w;
import com.google.android.exoplayer2.upstream.DataSourceException;
import com.google.android.exoplayer2.upstream.HttpDataSource$HttpDataSourceException;
import com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
/* compiled from: DefaultHttpDataSource.java */
/* loaded from: classes.dex */
public final class n extends c {

    /* renamed from: e  reason: collision with root package name */
    public final boolean f4181e;
    public final int f;

    /* renamed from: g  reason: collision with root package name */
    public final int f4182g;

    /* renamed from: h  reason: collision with root package name */
    public final String f4183h;

    /* renamed from: i  reason: collision with root package name */
    public final p f4184i;

    /* renamed from: j  reason: collision with root package name */
    public final p f4185j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f4186k;

    /* renamed from: l  reason: collision with root package name */
    public final nc.h<String> f4187l;

    /* renamed from: m  reason: collision with root package name */
    public HttpURLConnection f4188m;

    /* renamed from: n  reason: collision with root package name */
    public InputStream f4189n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f4190o;

    /* renamed from: p  reason: collision with root package name */
    public int f4191p;

    /* renamed from: q  reason: collision with root package name */
    public long f4192q;
    public long r;

    /* compiled from: DefaultHttpDataSource.java */
    /* loaded from: classes.dex */
    public static final class a implements o {

        /* renamed from: b  reason: collision with root package name */
        public String f4194b;

        /* renamed from: a  reason: collision with root package name */
        public final p f4193a = new p();

        /* renamed from: c  reason: collision with root package name */
        public final int f4195c = 8000;

        /* renamed from: d  reason: collision with root package name */
        public final int f4196d = 8000;

        @Override // b9.f.a
        public final f a() {
            return new n(this.f4194b, this.f4195c, this.f4196d, this.f4193a);
        }
    }

    public n(String str, int i6, int i10, p pVar) {
        super(true);
        this.f4183h = str;
        this.f = i6;
        this.f4182g = i10;
        this.f4181e = false;
        this.f4184i = pVar;
        this.f4187l = null;
        this.f4185j = new p();
        this.f4186k = false;
    }

    public static void v(HttpURLConnection httpURLConnection, long j10) {
        int i6;
        if (httpURLConnection != null && (i6 = w.f5205a) >= 19 && i6 <= 20) {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                if (j10 == -1) {
                    if (inputStream.read() == -1) {
                        return;
                    }
                } else if (j10 <= 2048) {
                    return;
                }
                String name = inputStream.getClass().getName();
                if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                    Class<? super Object> superclass = inputStream.getClass().getSuperclass();
                    superclass.getClass();
                    Method declaredMethod = superclass.getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(inputStream, new Object[0]);
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // b9.f
    public final void close() {
        try {
            InputStream inputStream = this.f4189n;
            if (inputStream != null) {
                long j10 = this.f4192q;
                long j11 = -1;
                if (j10 != -1) {
                    j11 = j10 - this.r;
                }
                v(this.f4188m, j11);
                try {
                    inputStream.close();
                } catch (IOException e10) {
                    int i6 = w.f5205a;
                    throw new HttpDataSource$HttpDataSourceException(e10, 2000, 3);
                }
            }
        } finally {
            this.f4189n = null;
            r();
            if (this.f4190o) {
                this.f4190o = false;
                o();
            }
        }
    }

    @Override // b9.f
    public final Uri getUri() {
        HttpURLConnection httpURLConnection = this.f4188m;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b5  */
    @Override // b9.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long h(h hVar) {
        DataSourceException dataSourceException;
        boolean z10;
        long j10;
        long parseLong;
        long j11;
        long j12 = 0;
        this.r = 0L;
        this.f4192q = 0L;
        p(hVar);
        try {
            HttpURLConnection t3 = t(hVar);
            this.f4188m = t3;
            this.f4191p = t3.getResponseCode();
            t3.getResponseMessage();
            int i6 = this.f4191p;
            long j13 = hVar.f;
            long j14 = hVar.f4133g;
            if (i6 >= 200 && i6 <= 299) {
                final String contentType = t3.getContentType();
                nc.h<String> hVar2 = this.f4187l;
                if (hVar2 != null && !hVar2.apply(contentType)) {
                    r();
                    throw new HttpDataSource$HttpDataSourceException(contentType) { // from class: com.google.android.exoplayer2.upstream.HttpDataSource$InvalidContentTypeException
                        /* JADX WARN: Illegal instructions before constructor call */
                        {
                            super(r3, 2003);
                            String str;
                            String valueOf = String.valueOf(contentType);
                            if (valueOf.length() != 0) {
                                str = "Invalid content type: ".concat(valueOf);
                            } else {
                                str = new String("Invalid content type: ");
                            }
                        }
                    };
                }
                if (this.f4191p == 200 && j13 != 0) {
                    j12 = j13;
                }
                boolean equalsIgnoreCase = "gzip".equalsIgnoreCase(t3.getHeaderField("Content-Encoding"));
                if (!equalsIgnoreCase) {
                    if (j14 != -1) {
                        this.f4192q = j14;
                    } else {
                        String headerField = t3.getHeaderField("Content-Length");
                        String headerField2 = t3.getHeaderField("Content-Range");
                        Pattern pattern = q.f4199a;
                        if (!TextUtils.isEmpty(headerField)) {
                            try {
                                parseLong = Long.parseLong(headerField);
                            } catch (NumberFormatException unused) {
                                StringBuilder sb2 = new StringBuilder(ri.e.c(headerField, 28));
                                sb2.append("Unexpected Content-Length [");
                                sb2.append(headerField);
                                sb2.append("]");
                                Log.e("HttpUtil", sb2.toString());
                            }
                            if (!TextUtils.isEmpty(headerField2)) {
                                Matcher matcher = q.f4199a.matcher(headerField2);
                                if (matcher.matches()) {
                                    try {
                                        String group = matcher.group(2);
                                        group.getClass();
                                        long parseLong2 = Long.parseLong(group);
                                        String group2 = matcher.group(1);
                                        group2.getClass();
                                        long parseLong3 = (parseLong2 - Long.parseLong(group2)) + 1;
                                        if (parseLong < 0) {
                                            parseLong = parseLong3;
                                        } else if (parseLong != parseLong3) {
                                            StringBuilder sb3 = new StringBuilder(String.valueOf(headerField).length() + 26 + String.valueOf(headerField2).length());
                                            sb3.append("Inconsistent headers [");
                                            sb3.append(headerField);
                                            sb3.append("] [");
                                            sb3.append(headerField2);
                                            sb3.append("]");
                                            Log.w("HttpUtil", sb3.toString());
                                            parseLong = Math.max(parseLong, parseLong3);
                                        }
                                    } catch (NumberFormatException unused2) {
                                        StringBuilder sb4 = new StringBuilder(ri.e.c(headerField2, 27));
                                        sb4.append("Unexpected Content-Range [");
                                        sb4.append(headerField2);
                                        sb4.append("]");
                                        Log.e("HttpUtil", sb4.toString());
                                    }
                                }
                            }
                            if (parseLong == -1) {
                                j11 = parseLong - j12;
                            } else {
                                j11 = -1;
                            }
                            this.f4192q = j11;
                        }
                        parseLong = -1;
                        if (!TextUtils.isEmpty(headerField2)) {
                        }
                        if (parseLong == -1) {
                        }
                        this.f4192q = j11;
                    }
                } else {
                    this.f4192q = j14;
                }
                try {
                    this.f4189n = t3.getInputStream();
                    if (equalsIgnoreCase) {
                        this.f4189n = new GZIPInputStream(this.f4189n);
                    }
                    this.f4190o = true;
                    q(hVar);
                    try {
                        w(j12);
                        return this.f4192q;
                    } catch (IOException e10) {
                        r();
                        if (e10 instanceof HttpDataSource$HttpDataSourceException) {
                            throw ((HttpDataSource$HttpDataSourceException) e10);
                        }
                        throw new HttpDataSource$HttpDataSourceException(e10, 2000, 1);
                    }
                } catch (IOException e11) {
                    r();
                    throw new HttpDataSource$HttpDataSourceException(e11, 2000, 1);
                }
            }
            Map<String, List<String>> headerFields = t3.getHeaderFields();
            if (this.f4191p == 416) {
                String headerField3 = t3.getHeaderField("Content-Range");
                Pattern pattern2 = q.f4199a;
                if (!TextUtils.isEmpty(headerField3)) {
                    Matcher matcher2 = q.f4200b.matcher(headerField3);
                    if (matcher2.matches()) {
                        z10 = true;
                        String group3 = matcher2.group(1);
                        group3.getClass();
                        j10 = Long.parseLong(group3);
                        if (j13 == j10) {
                            this.f4190o = z10;
                            q(hVar);
                            if (j14 == -1) {
                                return 0L;
                            }
                            return j14;
                        }
                    }
                }
                z10 = true;
                j10 = -1;
                if (j13 == j10) {
                }
            }
            InputStream errorStream = t3.getErrorStream();
            try {
                if (errorStream != null) {
                    int i10 = w.f5205a;
                    byte[] bArr = new byte[4096];
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    while (true) {
                        int read = errorStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, read);
                    }
                    byteArrayOutputStream.toByteArray();
                } else {
                    int i11 = w.f5205a;
                }
            } catch (IOException unused3) {
                int i12 = w.f5205a;
            }
            r();
            if (this.f4191p == 416) {
                dataSourceException = new DataSourceException(2008);
            } else {
                dataSourceException = null;
            }
            throw new HttpDataSource$InvalidResponseCodeException(this.f4191p, dataSourceException, headerFields);
        } catch (IOException e12) {
            r();
            throw HttpDataSource$HttpDataSourceException.a(e12, 1);
        }
    }

    @Override // b9.c, b9.f
    public final Map<String, List<String>> j() {
        HttpURLConnection httpURLConnection = this.f4188m;
        if (httpURLConnection == null) {
            return Collections.emptyMap();
        }
        return httpURLConnection.getHeaderFields();
    }

    public final void r() {
        HttpURLConnection httpURLConnection = this.f4188m;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e10) {
                ca.a.Q("DefaultHttpDataSource", "Unexpected error while disconnecting", e10);
            }
            this.f4188m = null;
        }
    }

    @Override // b9.d
    public final int read(byte[] bArr, int i6, int i10) {
        if (i10 == 0) {
            return 0;
        }
        try {
            long j10 = this.f4192q;
            if (j10 != -1) {
                long j11 = j10 - this.r;
                if (j11 != 0) {
                    i10 = (int) Math.min(i10, j11);
                } else {
                    return -1;
                }
            }
            InputStream inputStream = this.f4189n;
            int i11 = w.f5205a;
            int read = inputStream.read(bArr, i6, i10);
            if (read != -1) {
                this.r += read;
                n(read);
                return read;
            }
            return -1;
        } catch (IOException e10) {
            int i12 = w.f5205a;
            throw HttpDataSource$HttpDataSourceException.a(e10, 2);
        }
    }

    public final URL s(URL url, String str) {
        String str2;
        if (str != null) {
            try {
                URL url2 = new URL(url, str);
                String protocol = url2.getProtocol();
                if (!"https".equals(protocol) && !"http".equals(protocol)) {
                    String valueOf = String.valueOf(protocol);
                    if (valueOf.length() != 0) {
                        str2 = "Unsupported protocol redirect: ".concat(valueOf);
                    } else {
                        str2 = new String("Unsupported protocol redirect: ");
                    }
                    throw new HttpDataSource$HttpDataSourceException(str2, 2001);
                } else if (!this.f4181e && !protocol.equals(url.getProtocol())) {
                    String protocol2 = url.getProtocol();
                    StringBuilder n10 = defpackage.e.n(protocol.length() + ri.e.c(protocol2, 41), "Disallowed cross-protocol redirect (", protocol2, " to ", protocol);
                    n10.append(")");
                    throw new HttpDataSource$HttpDataSourceException(n10.toString(), 2001);
                } else {
                    return url2;
                }
            } catch (MalformedURLException e10) {
                throw new HttpDataSource$HttpDataSourceException(e10, 2001, 1);
            }
        }
        throw new HttpDataSource$HttpDataSourceException("Null location redirect", 2001);
    }

    public final HttpURLConnection t(h hVar) {
        boolean z10;
        HttpURLConnection u10;
        boolean z11;
        h hVar2 = hVar;
        URL url = new URL(hVar2.f4128a.toString());
        int i6 = hVar2.f4130c;
        byte[] bArr = hVar2.f4131d;
        long j10 = hVar2.f;
        long j11 = hVar2.f4133g;
        if ((hVar2.f4135i & 1) == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z12 = this.f4181e;
        boolean z13 = this.f4186k;
        if (!z12 && !z13) {
            return u(url, i6, bArr, j10, j11, z10, true, hVar2.f4132e);
        }
        int i10 = 0;
        URL url2 = url;
        int i11 = i6;
        byte[] bArr2 = bArr;
        while (true) {
            int i12 = i10 + 1;
            if (i10 <= 20) {
                Map<String, String> map = hVar2.f4132e;
                URL url3 = url2;
                int i13 = i11;
                boolean z14 = z13;
                long j12 = j11;
                u10 = u(url2, i11, bArr2, j10, j11, z10, false, map);
                int responseCode = u10.getResponseCode();
                String headerField = u10.getHeaderField("Location");
                if ((i13 != 1 && i13 != 3) || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308)) {
                    if (i13 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                        break;
                    }
                    u10.disconnect();
                    if (z14 && responseCode == 302) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z11) {
                        bArr2 = null;
                        i11 = 1;
                    } else {
                        i11 = i13;
                    }
                    url2 = s(url3, headerField);
                } else {
                    u10.disconnect();
                    url2 = s(url3, headerField);
                    i11 = i13;
                }
                hVar2 = hVar;
                i10 = i12;
                z13 = z14;
                j11 = j12;
            } else {
                throw new HttpDataSource$HttpDataSourceException(new NoRouteToHostException(defpackage.b.h(31, "Too many redirects: ", i12)), 2001, 1);
            }
        }
        return u10;
    }

    public final HttpURLConnection u(URL url, int i6, byte[] bArr, long j10, long j11, boolean z10, boolean z11, Map<String, String> map) {
        Map<String, String> map2;
        String sb2;
        String str;
        boolean z12;
        String str2;
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
        httpURLConnection.setConnectTimeout(this.f);
        httpURLConnection.setReadTimeout(this.f4182g);
        HashMap hashMap = new HashMap();
        p pVar = this.f4184i;
        if (pVar != null) {
            hashMap.putAll(pVar.a());
        }
        p pVar2 = this.f4185j;
        synchronized (pVar2) {
            if (pVar2.f4198b == null) {
                pVar2.f4198b = Collections.unmodifiableMap(new HashMap(pVar2.f4197a));
            }
            map2 = pVar2.f4198b;
        }
        hashMap.putAll(map2);
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        Pattern pattern = q.f4199a;
        if (j10 == 0 && j11 == -1) {
            sb2 = null;
        } else {
            StringBuilder sb3 = new StringBuilder("bytes=");
            sb3.append(j10);
            sb3.append("-");
            if (j11 != -1) {
                sb3.append((j10 + j11) - 1);
            }
            sb2 = sb3.toString();
        }
        if (sb2 != null) {
            httpURLConnection.setRequestProperty("Range", sb2);
        }
        String str3 = this.f4183h;
        if (str3 != null) {
            httpURLConnection.setRequestProperty("User-Agent", str3);
        }
        if (z10) {
            str = "gzip";
        } else {
            str = "identity";
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", str);
        httpURLConnection.setInstanceFollowRedirects(z11);
        if (bArr != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        httpURLConnection.setDoOutput(z12);
        int i10 = h.f4127k;
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 == 3) {
                    str2 = "HEAD";
                } else {
                    throw new IllegalStateException();
                }
            } else {
                str2 = "POST";
            }
        } else {
            str2 = "GET";
        }
        httpURLConnection.setRequestMethod(str2);
        if (bArr != null) {
            httpURLConnection.setFixedLengthStreamingMode(bArr.length);
            httpURLConnection.connect();
            OutputStream outputStream = httpURLConnection.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            httpURLConnection.connect();
        }
        return httpURLConnection;
    }

    public final void w(long j10) {
        if (j10 == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j10 > 0) {
            int min = (int) Math.min(j10, 4096);
            InputStream inputStream = this.f4189n;
            int i6 = w.f5205a;
            int read = inputStream.read(bArr, 0, min);
            if (!Thread.currentThread().isInterrupted()) {
                if (read != -1) {
                    j10 -= read;
                    n(read);
                } else {
                    throw new HttpDataSource$HttpDataSourceException();
                }
            } else {
                throw new HttpDataSource$HttpDataSourceException(new InterruptedIOException(), 2000, 1);
            }
        }
    }
}
