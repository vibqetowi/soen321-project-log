package e4;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.android.volley.VolleyError;
import e4.a;
import e4.k;
import e4.l;
import e4.o;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
/* compiled from: Request.java */
/* loaded from: classes.dex */
public abstract class j<T> implements Comparable<j<T>> {
    private static final String DEFAULT_PARAMS_ENCODING = "UTF-8";
    private a.C0214a mCacheEntry;
    private boolean mCanceled;
    private final int mDefaultTrafficStatsTag;
    private l.a mErrorListener;
    private final o.a mEventLog;
    private final Object mLock;
    private final int mMethod;
    private b mRequestCompleteListener;
    private k mRequestQueue;
    private boolean mResponseDelivered;
    private n mRetryPolicy;
    private Integer mSequence;
    private boolean mShouldCache;
    private boolean mShouldRetryConnectionErrors;
    private boolean mShouldRetryServerErrors;
    private Object mTag;
    private final String mUrl;

    /* compiled from: Request.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ String f13773u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ long f13774v;

        public a(String str, long j10) {
            this.f13773u = str;
            this.f13774v = j10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            j jVar = j.this;
            jVar.mEventLog.a(this.f13774v, this.f13773u);
            jVar.mEventLog.b(jVar.toString());
        }
    }

    /* compiled from: Request.java */
    /* loaded from: classes.dex */
    public interface b {
    }

    /* compiled from: Request.java */
    /* loaded from: classes.dex */
    public enum c {
        /* JADX INFO: Fake field, exist only in values array */
        LOW,
        NORMAL,
        /* JADX INFO: Fake field, exist only in values array */
        HIGH,
        /* JADX INFO: Fake field, exist only in values array */
        IMMEDIATE
    }

    @Deprecated
    public j(String str, l.a aVar) {
        this(-1, str, aVar);
    }

    private byte[] encodeParameters(Map<String, String> map, String str) {
        StringBuilder sb2 = new StringBuilder();
        try {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry.getKey() != null && entry.getValue() != null) {
                    sb2.append(URLEncoder.encode(entry.getKey(), str));
                    sb2.append('=');
                    sb2.append(URLEncoder.encode(entry.getValue(), str));
                    sb2.append('&');
                } else {
                    throw new IllegalArgumentException(String.format("Request#getParams() or Request#getPostParams() returned a map containing a null key or value: (%s, %s). All keys and values must be non-null.", entry.getKey(), entry.getValue()));
                }
            }
            return sb2.toString().getBytes(str);
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException(defpackage.c.r("Encoding not supported: ", str), e10);
        }
    }

    private static int findDefaultTrafficStatsTag(String str) {
        Uri parse;
        String host;
        if (!TextUtils.isEmpty(str) && (parse = Uri.parse(str)) != null && (host = parse.getHost()) != null) {
            return host.hashCode();
        }
        return 0;
    }

    public void addMarker(String str) {
        if (o.a.f13794c) {
            this.mEventLog.a(Thread.currentThread().getId(), str);
        }
    }

    public void cancel() {
        synchronized (this.mLock) {
            this.mCanceled = true;
            this.mErrorListener = null;
        }
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return compareTo((j) ((j) obj));
    }

    public void deliverError(VolleyError volleyError) {
        l.a aVar;
        synchronized (this.mLock) {
            aVar = this.mErrorListener;
        }
        if (aVar != null) {
            aVar.onErrorResponse(volleyError);
        }
    }

    public abstract void deliverResponse(T t3);

    public void finish(String str) {
        k kVar = this.mRequestQueue;
        if (kVar != null) {
            synchronized (kVar.f13779b) {
                kVar.f13779b.remove(this);
            }
            synchronized (kVar.f13786j) {
                Iterator it = kVar.f13786j.iterator();
                while (it.hasNext()) {
                    ((k.b) it.next()).a();
                }
            }
            kVar.a(this, 5);
        }
        if (o.a.f13794c) {
            long id2 = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new a(str, id2));
                return;
            }
            this.mEventLog.a(id2, str);
            this.mEventLog.b(toString());
        }
    }

    public byte[] getBody() {
        Map<String, String> params = getParams();
        if (params != null && params.size() > 0) {
            return encodeParameters(params, getParamsEncoding());
        }
        return null;
    }

    public String getBodyContentType() {
        return "application/x-www-form-urlencoded; charset=" + getParamsEncoding();
    }

    public a.C0214a getCacheEntry() {
        return this.mCacheEntry;
    }

    public String getCacheKey() {
        String url = getUrl();
        int method = getMethod();
        if (method != 0 && method != -1) {
            return Integer.toString(method) + '-' + url;
        }
        return url;
    }

    public l.a getErrorListener() {
        l.a aVar;
        synchronized (this.mLock) {
            aVar = this.mErrorListener;
        }
        return aVar;
    }

    public Map<String, String> getHeaders() {
        return Collections.emptyMap();
    }

    public int getMethod() {
        return this.mMethod;
    }

    public Map<String, String> getParams() {
        return null;
    }

    public String getParamsEncoding() {
        return DEFAULT_PARAMS_ENCODING;
    }

    @Deprecated
    public byte[] getPostBody() {
        Map<String, String> postParams = getPostParams();
        if (postParams != null && postParams.size() > 0) {
            return encodeParameters(postParams, getPostParamsEncoding());
        }
        return null;
    }

    @Deprecated
    public String getPostBodyContentType() {
        return getBodyContentType();
    }

    @Deprecated
    public Map<String, String> getPostParams() {
        return getParams();
    }

    @Deprecated
    public String getPostParamsEncoding() {
        return getParamsEncoding();
    }

    public c getPriority() {
        return c.NORMAL;
    }

    public n getRetryPolicy() {
        return this.mRetryPolicy;
    }

    public final int getSequence() {
        Integer num = this.mSequence;
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("getSequence called before setSequence");
    }

    public Object getTag() {
        return this.mTag;
    }

    public final int getTimeoutMs() {
        return getRetryPolicy().b();
    }

    public int getTrafficStatsTag() {
        return this.mDefaultTrafficStatsTag;
    }

    public String getUrl() {
        return this.mUrl;
    }

    public boolean hasHadResponseDelivered() {
        boolean z10;
        synchronized (this.mLock) {
            z10 = this.mResponseDelivered;
        }
        return z10;
    }

    public boolean isCanceled() {
        boolean z10;
        synchronized (this.mLock) {
            z10 = this.mCanceled;
        }
        return z10;
    }

    public void markDelivered() {
        synchronized (this.mLock) {
            this.mResponseDelivered = true;
        }
    }

    public void notifyListenerResponseNotUsable() {
        b bVar;
        synchronized (this.mLock) {
            bVar = this.mRequestCompleteListener;
        }
        if (bVar != null) {
            ((p) bVar).b(this);
        }
    }

    public void notifyListenerResponseReceived(l<?> lVar) {
        b bVar;
        synchronized (this.mLock) {
            bVar = this.mRequestCompleteListener;
        }
        if (bVar != null) {
            ((p) bVar).c(this, lVar);
        }
    }

    public abstract l<T> parseNetworkResponse(i iVar);

    public void sendEvent(int i6) {
        k kVar = this.mRequestQueue;
        if (kVar != null) {
            kVar.a(this, i6);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j<?> setCacheEntry(a.C0214a c0214a) {
        this.mCacheEntry = c0214a;
        return this;
    }

    public void setNetworkRequestCompleteListener(b bVar) {
        synchronized (this.mLock) {
            this.mRequestCompleteListener = bVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j<?> setRequestQueue(k kVar) {
        this.mRequestQueue = kVar;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j<?> setRetryPolicy(n nVar) {
        this.mRetryPolicy = nVar;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final j<?> setSequence(int i6) {
        this.mSequence = Integer.valueOf(i6);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final j<?> setShouldCache(boolean z10) {
        this.mShouldCache = z10;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final j<?> setShouldRetryConnectionErrors(boolean z10) {
        this.mShouldRetryConnectionErrors = z10;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final j<?> setShouldRetryServerErrors(boolean z10) {
        this.mShouldRetryServerErrors = z10;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j<?> setTag(Object obj) {
        this.mTag = obj;
        return this;
    }

    public final boolean shouldCache() {
        return this.mShouldCache;
    }

    public final boolean shouldRetryConnectionErrors() {
        return this.mShouldRetryConnectionErrors;
    }

    public final boolean shouldRetryServerErrors() {
        return this.mShouldRetryServerErrors;
    }

    public String toString() {
        String str;
        String str2 = "0x" + Integer.toHexString(getTrafficStatsTag());
        StringBuilder sb2 = new StringBuilder();
        if (isCanceled()) {
            str = "[X] ";
        } else {
            str = "[ ] ";
        }
        sb2.append(str);
        sb2.append(getUrl());
        sb2.append(" ");
        sb2.append(str2);
        sb2.append(" ");
        sb2.append(getPriority());
        sb2.append(" ");
        sb2.append(this.mSequence);
        return sb2.toString();
    }

    public j(int i6, String str, l.a aVar) {
        this.mEventLog = o.a.f13794c ? new o.a() : null;
        this.mLock = new Object();
        this.mShouldCache = true;
        this.mCanceled = false;
        this.mResponseDelivered = false;
        this.mShouldRetryServerErrors = false;
        this.mShouldRetryConnectionErrors = false;
        this.mCacheEntry = null;
        this.mMethod = i6;
        this.mUrl = str;
        this.mErrorListener = aVar;
        setRetryPolicy(new d(2500, 1));
        this.mDefaultTrafficStatsTag = findDefaultTrafficStatsTag(str);
    }

    public int compareTo(j<T> jVar) {
        c priority = getPriority();
        c priority2 = jVar.getPriority();
        return priority == priority2 ? this.mSequence.intValue() - jVar.mSequence.intValue() : priority2.ordinal() - priority.ordinal();
    }

    public VolleyError parseNetworkError(VolleyError volleyError) {
        return volleyError;
    }
}
