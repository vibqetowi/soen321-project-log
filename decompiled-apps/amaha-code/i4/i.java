package i4;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.HttpException;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import i4.d;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
/* compiled from: HttpUrlFetcher.java */
/* loaded from: classes.dex */
public final class i implements d<InputStream> {

    /* renamed from: u  reason: collision with root package name */
    public final o4.f f19818u;

    /* renamed from: v  reason: collision with root package name */
    public final int f19819v;

    /* renamed from: w  reason: collision with root package name */
    public HttpURLConnection f19820w;

    /* renamed from: x  reason: collision with root package name */
    public InputStream f19821x;

    /* renamed from: y  reason: collision with root package name */
    public volatile boolean f19822y;

    /* compiled from: HttpUrlFetcher.java */
    /* loaded from: classes.dex */
    public static class a {
    }

    static {
        new a();
    }

    public i(o4.f fVar, int i6) {
        this.f19818u = fVar;
        this.f19819v = i6;
    }

    @Override // i4.d
    public final Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // i4.d
    public final void b() {
        InputStream inputStream = this.f19821x;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f19820w;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f19820w = null;
    }

    @Override // i4.d
    public final void c(com.bumptech.glide.d dVar, d.a<? super InputStream> aVar) {
        StringBuilder sb2;
        o4.f fVar = this.f19818u;
        int i6 = d5.f.f12193b;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            try {
                aVar.f(d(fVar.d(), 0, null, fVar.f27057b.a()));
            } catch (IOException e10) {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    Log.d("HttpUrlFetcher", "Failed to load data for url", e10);
                }
                aVar.d(e10);
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    sb2 = new StringBuilder("Finished http url fetcher fetch in ");
                } else {
                    return;
                }
            }
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb2 = new StringBuilder("Finished http url fetcher fetch in ");
                sb2.append(d5.f.a(elapsedRealtimeNanos));
                Log.v("HttpUrlFetcher", sb2.toString());
            }
        } catch (Throwable th2) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + d5.f.a(elapsedRealtimeNanos));
            }
            throw th2;
        }
    }

    @Override // i4.d
    public final void cancel() {
        this.f19822y = true;
    }

    public final InputStream d(URL url, int i6, URL url2, Map<String, String> map) {
        boolean z10;
        boolean z11;
        if (i6 < 5) {
            if (url2 != null) {
                try {
                    if (url.toURI().equals(url2.toURI())) {
                        throw new HttpException("In re-direct loop");
                    }
                } catch (URISyntaxException unused) {
                }
            }
            this.f19820w = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
            for (Map.Entry<String, String> entry : map.entrySet()) {
                this.f19820w.addRequestProperty(entry.getKey(), entry.getValue());
            }
            this.f19820w.setConnectTimeout(this.f19819v);
            this.f19820w.setReadTimeout(this.f19819v);
            this.f19820w.setUseCaches(false);
            this.f19820w.setDoInput(true);
            this.f19820w.setInstanceFollowRedirects(false);
            this.f19820w.connect();
            this.f19821x = this.f19820w.getInputStream();
            if (this.f19822y) {
                return null;
            }
            int responseCode = this.f19820w.getResponseCode();
            int i10 = responseCode / 100;
            if (i10 == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                HttpURLConnection httpURLConnection = this.f19820w;
                if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
                    this.f19821x = new d5.c(httpURLConnection.getInputStream(), httpURLConnection.getContentLength());
                } else {
                    if (Log.isLoggable("HttpUrlFetcher", 3)) {
                        Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection.getContentEncoding());
                    }
                    this.f19821x = httpURLConnection.getInputStream();
                }
                return this.f19821x;
            }
            if (i10 == 3) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                String headerField = this.f19820w.getHeaderField("Location");
                if (!TextUtils.isEmpty(headerField)) {
                    URL url3 = new URL(url, headerField);
                    b();
                    return d(url3, i6 + 1, url, map);
                }
                throw new HttpException("Received empty or null redirect url");
            } else if (responseCode == -1) {
                throw new HttpException(responseCode);
            } else {
                throw new HttpException(this.f19820w.getResponseMessage(), 0);
            }
        }
        throw new HttpException("Too many (> 5) redirects!");
    }

    @Override // i4.d
    public final h4.a e() {
        return h4.a.REMOTE;
    }
}
