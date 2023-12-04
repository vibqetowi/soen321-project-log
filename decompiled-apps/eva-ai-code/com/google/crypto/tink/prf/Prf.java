package com.google.crypto.tink.prf;

import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;
@Immutable
/* loaded from: classes7.dex */
public interface Prf {
    byte[] compute(byte[] input, int outputLength) throws GeneralSecurityException;
}
