package com.android.volley;

import e4.i;
/* loaded from: classes.dex */
public class VolleyError extends Exception {

    /* renamed from: u  reason: collision with root package name */
    public final i f5870u;

    public VolleyError() {
        this.f5870u = null;
    }

    public VolleyError(i iVar) {
        this.f5870u = iVar;
    }

    public VolleyError(Exception exc) {
        super(exc);
        this.f5870u = null;
    }
}
