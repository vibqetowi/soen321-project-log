package com.android.volley.toolbox;

import e4.l;
import java.io.UnsupportedEncodingException;
/* compiled from: StringRequest.java */
/* loaded from: classes.dex */
public class l extends e4.j<String> {
    private l.b<String> mListener;
    private final Object mLock;

    public l(int i6, String str, l.b<String> bVar, l.a aVar) {
        super(i6, str, aVar);
        this.mLock = new Object();
        this.mListener = bVar;
    }

    @Override // e4.j
    public void cancel() {
        super.cancel();
        synchronized (this.mLock) {
            this.mListener = null;
        }
    }

    @Override // e4.j
    public e4.l<String> parseNetworkResponse(e4.i iVar) {
        String str;
        try {
            str = new String(iVar.f13769b, e.b("ISO-8859-1", iVar.f13770c));
        } catch (UnsupportedEncodingException unused) {
            str = new String(iVar.f13769b);
        }
        return new e4.l<>(str, e.a(iVar));
    }

    @Override // e4.j
    public void deliverResponse(String str) {
        l.b<String> bVar;
        synchronized (this.mLock) {
            bVar = this.mListener;
        }
        if (bVar != null) {
            bVar.a(str);
        }
    }

    public l(String str, l.b<String> bVar, l.a aVar) {
        this(0, str, bVar, aVar);
    }
}
