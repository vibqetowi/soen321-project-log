package com.google.api.client.http;

import java.io.IOException;
/* loaded from: classes7.dex */
public interface HttpUnsuccessfulResponseHandler {
    boolean handleResponse(HttpRequest httpRequest, HttpResponse httpResponse, boolean z) throws IOException;
}
