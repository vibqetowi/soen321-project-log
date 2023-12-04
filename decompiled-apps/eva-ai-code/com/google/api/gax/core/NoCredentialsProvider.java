package com.google.api.gax.core;

import com.google.auth.Credentials;
/* loaded from: classes7.dex */
public final class NoCredentialsProvider implements CredentialsProvider {
    @Override // com.google.api.gax.core.CredentialsProvider
    public Credentials getCredentials() {
        return null;
    }

    public static NoCredentialsProvider create() {
        return new NoCredentialsProvider();
    }
}
