package com.google.api.client.http;

import java.io.IOException;
/* loaded from: classes7.dex */
public interface HttpIOExceptionHandler {
    boolean handleIOException(HttpRequest httpRequest, boolean z) throws IOException;
}
