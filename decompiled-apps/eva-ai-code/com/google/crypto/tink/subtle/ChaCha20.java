package com.google.crypto.tink.subtle;

import java.security.InvalidKeyException;
/* loaded from: classes7.dex */
class ChaCha20 extends ChaCha20Base {
    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.subtle.ChaCha20Base
    public int nonceSizeInBytes() {
        return 12;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ChaCha20(final byte[] key, int initialCounter) throws InvalidKeyException {
        super(key, initialCounter);
    }

    @Override // com.google.crypto.tink.subtle.ChaCha20Base
    int[] createInitialState(final int[] nonce, int counter) {
        if (nonce.length != nonceSizeInBytes() / 4) {
            throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(nonce.length * 32)));
        }
        int[] iArr = new int[16];
        ChaCha20Base.setSigmaAndKey(iArr, this.key);
        iArr[12] = counter;
        System.arraycopy(nonce, 0, iArr, 13, nonce.length);
        return iArr;
    }
}
