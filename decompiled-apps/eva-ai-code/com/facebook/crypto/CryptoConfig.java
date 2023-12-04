package com.facebook.crypto;
/* loaded from: classes2.dex */
public enum CryptoConfig {
    KEY_128((byte) 1, 16, 12, 16),
    KEY_256((byte) 2, 32, 12, 16);
    
    public final byte cipherId;
    public final int ivLength;
    public final int keyLength;
    public final int tagLength;

    CryptoConfig(byte b, int i, int i2, int i3) {
        this.cipherId = b;
        this.keyLength = i;
        this.ivLength = i2;
        this.tagLength = i3;
    }
}
