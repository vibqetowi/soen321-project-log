package com.google.android.exoplayer2.upstream;

import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class HttpDataSource$InvalidResponseCodeException extends HttpDataSource$HttpDataSourceException {

    /* renamed from: w  reason: collision with root package name */
    public final int f7157w;

    /* renamed from: x  reason: collision with root package name */
    public final Map<String, List<String>> f7158x;

    public HttpDataSource$InvalidResponseCodeException(int i6, DataSourceException dataSourceException, Map map) {
        super(b.h(26, "Response code: ", i6), dataSourceException, 2004);
        this.f7157w = i6;
        this.f7158x = map;
    }
}
