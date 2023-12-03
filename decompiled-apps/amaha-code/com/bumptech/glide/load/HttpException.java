package com.bumptech.glide.load;

import java.io.IOException;
/* loaded from: classes.dex */
public final class HttpException extends IOException {
    public HttpException(int i6) {
        super(c.p("Http request failed with status code: ", i6), null);
    }

    public HttpException(String str) {
        super(str, null);
    }

    public HttpException(String str, int i6) {
        super(str, null);
    }
}
