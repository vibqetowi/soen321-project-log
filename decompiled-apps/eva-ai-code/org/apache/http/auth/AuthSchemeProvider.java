package org.apache.http.auth;

import org.apache.http.protocol.HttpContext;
/* loaded from: classes5.dex */
public interface AuthSchemeProvider {
    AuthScheme create(HttpContext httpContext);
}
