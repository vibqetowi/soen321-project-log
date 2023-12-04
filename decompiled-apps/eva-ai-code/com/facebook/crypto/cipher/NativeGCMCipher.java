package com.facebook.crypto.cipher;

import com.facebook.crypto.exception.CryptoInitializationException;
import com.facebook.crypto.util.Assertions;
import com.facebook.crypto.util.NativeCryptoLibrary;
/* loaded from: classes2.dex */
public class NativeGCMCipher {
    private static final String CIPHER_ALREADY_INIT = "Cipher has already been initialized";
    private static final String CIPHER_NOT_FINALIZED = "Cipher has not been finalized";
    private static final String CIPHER_NOT_INIT = "Cipher has not been initialized";
    public static final String FAILURE = "Failure";
    private long mCtxPtr;
    private STATE mCurrentState = STATE.UNINITIALIZED;
    private final NativeCryptoLibrary mNativeCryptoLibrary;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public enum STATE {
        UNINITIALIZED,
        ENCRYPT_INITIALIZED,
        DECRYPT_INITIALIZED,
        ENCRYPT_FINALIZED,
        DECRYPT_FINALIZED
    }

    private native int nativeDecryptFinal(byte[] bArr, int i);

    private native int nativeDecryptInit(byte[] bArr, byte[] bArr2);

    private native int nativeDestroy();

    private native int nativeEncryptFinal(byte[] bArr, int i);

    private native int nativeEncryptInit(byte[] bArr, byte[] bArr2);

    private static native int nativeFailure();

    private native int nativeGetCipherBlockSize();

    private native int nativeUpdate(byte[] bArr, int i, int i2, byte[] bArr2, int i3);

    private native int nativeUpdateAad(byte[] bArr, int i);

    public NativeGCMCipher(NativeCryptoLibrary nativeCryptoLibrary) {
        this.mNativeCryptoLibrary = nativeCryptoLibrary;
    }

    public void encryptInit(byte[] bArr, byte[] bArr2) throws NativeGCMCipherException, CryptoInitializationException {
        Assertions.checkState(this.mCurrentState == STATE.UNINITIALIZED, CIPHER_ALREADY_INIT);
        this.mNativeCryptoLibrary.ensureCryptoLoaded();
        if (nativeEncryptInit(bArr, bArr2) == nativeFailure()) {
            throw new NativeGCMCipherException("encryptInit");
        }
        this.mCurrentState = STATE.ENCRYPT_INITIALIZED;
    }

    public void decryptInit(byte[] bArr, byte[] bArr2) throws NativeGCMCipherException, CryptoInitializationException {
        Assertions.checkState(this.mCurrentState == STATE.UNINITIALIZED, CIPHER_ALREADY_INIT);
        this.mNativeCryptoLibrary.ensureCryptoLoaded();
        if (nativeDecryptInit(bArr, bArr2) == nativeFailure()) {
            throw new NativeGCMCipherException("decryptInit");
        }
        this.mCurrentState = STATE.DECRYPT_INITIALIZED;
    }

    public int update(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws NativeGCMCipherException {
        ensureInInitalizedState();
        int nativeUpdate = nativeUpdate(bArr, i, i2, bArr2, i3);
        if (nativeUpdate >= 0) {
            return nativeUpdate;
        }
        throw new NativeGCMCipherException(formatStrLocaleSafe("update: Offset = %d; DataLen = %d; Result = %d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(nativeUpdate)));
    }

    public void updateAad(byte[] bArr, int i) throws NativeGCMCipherException {
        ensureInInitalizedState();
        if (nativeUpdateAad(bArr, i) < 0) {
            throw new NativeGCMCipherException(formatStrLocaleSafe("updateAAd: DataLen = %d", Integer.valueOf(i)));
        }
    }

    public void encryptFinal(byte[] bArr, int i) throws NativeGCMCipherException {
        Assertions.checkState(this.mCurrentState == STATE.ENCRYPT_INITIALIZED, CIPHER_NOT_INIT);
        this.mCurrentState = STATE.ENCRYPT_FINALIZED;
        if (nativeEncryptFinal(bArr, i) == nativeFailure()) {
            throw new NativeGCMCipherException(formatStrLocaleSafe("encryptFinal: %d", Integer.valueOf(i)));
        }
    }

    public void decryptFinal(byte[] bArr, int i) throws NativeGCMCipherException {
        Assertions.checkState(this.mCurrentState == STATE.DECRYPT_INITIALIZED, CIPHER_NOT_INIT);
        this.mCurrentState = STATE.DECRYPT_FINALIZED;
        if (nativeDecryptFinal(bArr, i) == nativeFailure()) {
            throw new NativeGCMCipherException("The message could not be decrypted successfully.It has either been tampered with or the wrong resource is being decrypted.");
        }
    }

    public void destroy() throws NativeGCMCipherException {
        ensureInFinalizedState();
        if (nativeDestroy() == nativeFailure()) {
            throw new NativeGCMCipherException("destroy");
        }
        this.mCurrentState = STATE.UNINITIALIZED;
    }

    public int getCipherBlockSize() {
        ensureInInitalizedState();
        return nativeGetCipherBlockSize();
    }

    private void ensureInInitalizedState() {
        Assertions.checkState(this.mCurrentState == STATE.DECRYPT_INITIALIZED || this.mCurrentState == STATE.ENCRYPT_INITIALIZED, CIPHER_NOT_INIT);
    }

    private void ensureInFinalizedState() {
        Assertions.checkState(this.mCurrentState == STATE.DECRYPT_FINALIZED || this.mCurrentState == STATE.ENCRYPT_FINALIZED, CIPHER_NOT_FINALIZED);
    }

    private String formatStrLocaleSafe(String str, Object... objArr) {
        return String.format(null, str, objArr);
    }
}
