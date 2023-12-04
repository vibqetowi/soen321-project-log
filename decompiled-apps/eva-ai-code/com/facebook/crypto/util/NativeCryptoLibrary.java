package com.facebook.crypto.util;

import com.facebook.crypto.exception.CryptoInitializationException;
/* loaded from: classes2.dex */
public interface NativeCryptoLibrary {
    void ensureCryptoLoaded() throws CryptoInitializationException;
}
