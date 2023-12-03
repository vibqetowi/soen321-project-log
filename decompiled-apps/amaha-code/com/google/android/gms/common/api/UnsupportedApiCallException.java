package com.google.android.gms.common.api;

import s9.d;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes.dex */
public final class UnsupportedApiCallException extends UnsupportedOperationException {

    /* renamed from: u  reason: collision with root package name */
    public final d f7302u;

    public UnsupportedApiCallException(d dVar) {
        this.f7302u = dVar;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Missing ".concat(String.valueOf(this.f7302u));
    }
}
