package org.apache.http.client;

import org.apache.http.util.TextUtils;
/* loaded from: classes5.dex */
public class HttpResponseException extends ClientProtocolException {
    private static final long serialVersionUID = -7186627969477257933L;
    private final String reasonPhrase;
    private final int statusCode;

    public HttpResponseException(int i, String str) {
        super(String.format("status code: %d".concat(TextUtils.isBlank(str) ? "" : ", reason phrase: %s"), Integer.valueOf(i), str));
        this.statusCode = i;
        this.reasonPhrase = str;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public String getReasonPhrase() {
        return this.reasonPhrase;
    }
}
