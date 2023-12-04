package com.google.api.gax.core;

import com.google.auth.Credentials;
import java.io.IOException;
/* loaded from: classes7.dex */
public interface CredentialsProvider {
    Credentials getCredentials() throws IOException;
}
