package com.android.volley.toolbox;

import android.util.Log;
import e4.l;
import e4.o;
import java.io.UnsupportedEncodingException;
/* compiled from: JsonRequest.java */
/* loaded from: classes.dex */
public abstract class i<T> extends e4.j<T> {
    protected static final String PROTOCOL_CHARSET = "utf-8";
    private static final String PROTOCOL_CONTENT_TYPE = String.format("application/json; charset=%s", PROTOCOL_CHARSET);
    private l.b<T> mListener;
    private final Object mLock;
    private final String mRequestBody;

    @Deprecated
    public i(String str, String str2, l.b<T> bVar, l.a aVar) {
        this(-1, str, str2, bVar, aVar);
    }

    @Override // e4.j
    public void cancel() {
        super.cancel();
        synchronized (this.mLock) {
            this.mListener = null;
        }
    }

    @Override // e4.j
    public void deliverResponse(T t3) {
        l.b<T> bVar;
        synchronized (this.mLock) {
            bVar = this.mListener;
        }
        if (bVar != null) {
            bVar.a(t3);
        }
    }

    @Override // e4.j
    public byte[] getBody() {
        try {
            String str = this.mRequestBody;
            if (str == null) {
                return null;
            }
            return str.getBytes(PROTOCOL_CHARSET);
        } catch (UnsupportedEncodingException unused) {
            Log.wtf("Volley", o.a("Unsupported Encoding while trying to get the bytes of %s using %s", this.mRequestBody, PROTOCOL_CHARSET));
            return null;
        }
    }

    @Override // e4.j
    public String getBodyContentType() {
        return PROTOCOL_CONTENT_TYPE;
    }

    @Override // e4.j
    @Deprecated
    public byte[] getPostBody() {
        return getBody();
    }

    @Override // e4.j
    @Deprecated
    public String getPostBodyContentType() {
        return getBodyContentType();
    }

    @Override // e4.j
    public abstract e4.l<T> parseNetworkResponse(e4.i iVar);

    public i(int i6, String str, String str2, l.b<T> bVar, l.a aVar) {
        super(i6, str, aVar);
        this.mLock = new Object();
        this.mListener = bVar;
        this.mRequestBody = str2;
    }
}
