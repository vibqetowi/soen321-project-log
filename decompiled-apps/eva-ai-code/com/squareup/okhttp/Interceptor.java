package com.squareup.okhttp;

import java.io.IOException;
/* loaded from: classes4.dex */
public interface Interceptor {

    /* loaded from: classes4.dex */
    public interface Chain {
        Connection connection();

        Response proceed(Request request) throws IOException;

        Request request();
    }

    Response intercept(Chain chain) throws IOException;
}
