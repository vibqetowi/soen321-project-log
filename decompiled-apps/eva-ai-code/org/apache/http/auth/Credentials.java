package org.apache.http.auth;

import java.security.Principal;
/* loaded from: classes5.dex */
public interface Credentials {
    String getPassword();

    Principal getUserPrincipal();
}
