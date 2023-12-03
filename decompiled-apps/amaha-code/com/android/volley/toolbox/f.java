package com.android.volley.toolbox;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: HttpResponse.java */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final int f5892a;

    /* renamed from: b  reason: collision with root package name */
    public final List<e4.f> f5893b;

    /* renamed from: c  reason: collision with root package name */
    public final int f5894c;

    /* renamed from: d  reason: collision with root package name */
    public final InputStream f5895d;

    public f(int i6, ArrayList arrayList) {
        this(i6, arrayList, -1, null);
    }

    public final InputStream a() {
        InputStream inputStream = this.f5895d;
        if (inputStream != null) {
            return inputStream;
        }
        return null;
    }

    public final List<e4.f> b() {
        return Collections.unmodifiableList(this.f5893b);
    }

    public f(int i6, ArrayList arrayList, int i10, InputStream inputStream) {
        this.f5892a = i6;
        this.f5893b = arrayList;
        this.f5894c = i10;
        this.f5895d = inputStream;
    }
}
