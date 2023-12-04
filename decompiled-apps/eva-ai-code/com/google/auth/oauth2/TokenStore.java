package com.google.auth.oauth2;

import java.io.IOException;
/* loaded from: classes7.dex */
public interface TokenStore {
    void delete(String str) throws IOException;

    String load(String str) throws IOException;

    void store(String str, String str2) throws IOException;
}
