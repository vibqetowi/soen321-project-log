package com.google.crypto.tink.subtle;

import java.security.InvalidKeyException;
import java.util.Arrays;
/* loaded from: classes7.dex */
class XChaCha20 extends ChaCha20Base {
    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.subtle.ChaCha20Base
    public int nonceSizeInBytes() {
        return 24;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public XChaCha20(byte[] key, int initialCounter) throws InvalidKeyException {
        super(key, initialCounter);
    }

    @Override // com.google.crypto.tink.subtle.ChaCha20Base
    int[] createInitialState(final int[] nonce, int counter) {
        if (nonce.length != nonceSizeInBytes() / 4) {
            throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", Integer.valueOf(nonce.length * 32)));
        }
        int[] iArr = new int[16];
        ChaCha20Base.setSigmaAndKey(iArr, hChaCha20(this.key, nonce));
        iArr[12] = counter;
        iArr[13] = 0;
        iArr[14] = nonce[4];
        iArr[15] = nonce[5];
        return iArr;
    }

    static int[] hChaCha20(final int[] key, final int[] nonce) {
        ChaCha20Base.setSigmaAndKey(r0, key);
        int[] iArr = {0, 0, 0, 0, iArr[12], iArr[13], iArr[14], iArr[15], 0, 0, 0, 0, nonce[0], nonce[1], nonce[2], nonce[3]};
        ChaCha20Base.shuffleState(iArr);
        return Arrays.copyOf(iArr, 8);
    }
}
