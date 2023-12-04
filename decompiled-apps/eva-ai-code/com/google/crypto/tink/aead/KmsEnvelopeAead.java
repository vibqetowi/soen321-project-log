package com.google.crypto.tink.aead;

import com.google.crypto.tink.Aead;
import com.google.crypto.tink.Registry;
import com.google.crypto.tink.proto.KeyTemplate;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
/* loaded from: classes7.dex */
public final class KmsEnvelopeAead implements Aead {
    private static final byte[] EMPTY_AAD = new byte[0];
    private static final int LENGTH_ENCRYPTED_DEK = 4;
    private final KeyTemplate dekTemplate;
    private final Aead remote;

    public KmsEnvelopeAead(KeyTemplate dekTemplate, Aead remote) {
        this.dekTemplate = dekTemplate;
        this.remote = remote;
    }

    @Override // com.google.crypto.tink.Aead
    public byte[] encrypt(final byte[] plaintext, final byte[] associatedData) throws GeneralSecurityException {
        byte[] byteArray = Registry.newKey(this.dekTemplate).toByteArray();
        return buildCiphertext(this.remote.encrypt(byteArray, EMPTY_AAD), ((Aead) Registry.getPrimitive(this.dekTemplate.getTypeUrl(), byteArray, Aead.class)).encrypt(plaintext, associatedData));
    }

    @Override // com.google.crypto.tink.Aead
    public byte[] decrypt(final byte[] ciphertext, final byte[] associatedData) throws GeneralSecurityException {
        try {
            ByteBuffer wrap = ByteBuffer.wrap(ciphertext);
            int i = wrap.getInt();
            if (i <= 0 || i > ciphertext.length - 4) {
                throw new GeneralSecurityException("invalid ciphertext");
            }
            byte[] bArr = new byte[i];
            wrap.get(bArr, 0, i);
            byte[] bArr2 = new byte[wrap.remaining()];
            wrap.get(bArr2, 0, wrap.remaining());
            return ((Aead) Registry.getPrimitive(this.dekTemplate.getTypeUrl(), this.remote.decrypt(bArr, EMPTY_AAD), Aead.class)).decrypt(bArr2, associatedData);
        } catch (IndexOutOfBoundsException | NegativeArraySizeException | BufferUnderflowException e) {
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }

    private byte[] buildCiphertext(final byte[] encryptedDek, final byte[] payload) {
        return ByteBuffer.allocate(encryptedDek.length + 4 + payload.length).putInt(encryptedDek.length).put(encryptedDek).put(payload).array();
    }
}
