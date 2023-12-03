package com.google.android.exoplayer2.upstream;

import java.io.IOException;
/* loaded from: classes.dex */
public class DataSourceException extends IOException {

    /* renamed from: v  reason: collision with root package name */
    public static final /* synthetic */ int f7152v = 0;

    /* renamed from: u  reason: collision with root package name */
    public final int f7153u;

    public DataSourceException(int i6) {
        this.f7153u = i6;
    }

    public DataSourceException(Throwable th2, int i6) {
        super(th2);
        this.f7153u = i6;
    }

    public DataSourceException(String str, int i6) {
        super(str);
        this.f7153u = i6;
    }

    public DataSourceException(int i6, String str, Throwable th2) {
        super(str, th2);
        this.f7153u = i6;
    }
}
