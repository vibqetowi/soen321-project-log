package com.google.crypto.tink.subtle;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
/* loaded from: classes7.dex */
public interface StreamSegmentDecrypter {
    void decryptSegment(ByteBuffer ciphertext, int segmentNr, boolean isLastSegment, ByteBuffer plaintext) throws GeneralSecurityException;

    void init(ByteBuffer header, byte[] aad) throws GeneralSecurityException;
}
