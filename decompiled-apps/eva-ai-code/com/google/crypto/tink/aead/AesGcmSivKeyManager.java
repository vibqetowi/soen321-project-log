package com.google.crypto.tink.aead;

import com.google.crypto.tink.Aead;
import com.google.crypto.tink.KeyTemplate;
import com.google.crypto.tink.KeyTypeManager;
import com.google.crypto.tink.Registry;
import com.google.crypto.tink.aead.subtle.AesGcmSiv;
import com.google.crypto.tink.proto.AesGcmSivKey;
import com.google.crypto.tink.proto.AesGcmSivKeyFormat;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.subtle.Random;
import com.google.crypto.tink.subtle.Validators;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
/* loaded from: classes7.dex */
public final class AesGcmSivKeyManager extends KeyTypeManager<AesGcmSivKey> {
    @Override // com.google.crypto.tink.KeyTypeManager
    public String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public int getVersion() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AesGcmSivKeyManager() {
        super(AesGcmSivKey.class, new KeyTypeManager.PrimitiveFactory<Aead, AesGcmSivKey>(Aead.class) { // from class: com.google.crypto.tink.aead.AesGcmSivKeyManager.1
            @Override // com.google.crypto.tink.KeyTypeManager.PrimitiveFactory
            public Aead getPrimitive(AesGcmSivKey key) throws GeneralSecurityException {
                return new AesGcmSiv(key.getKeyValue().toByteArray());
            }
        });
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public KeyData.KeyMaterialType keyMaterialType() {
        return KeyData.KeyMaterialType.SYMMETRIC;
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public void validateKey(AesGcmSivKey key) throws GeneralSecurityException {
        Validators.validateVersion(key.getVersion(), getVersion());
        Validators.validateAesKeySize(key.getKeyValue().size());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.crypto.tink.KeyTypeManager
    public AesGcmSivKey parseKey(ByteString byteString) throws InvalidProtocolBufferException {
        return AesGcmSivKey.parseFrom(byteString, ExtensionRegistryLite.getEmptyRegistry());
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public KeyTypeManager.KeyFactory<?, AesGcmSivKey> keyFactory() {
        return new KeyTypeManager.KeyFactory<AesGcmSivKeyFormat, AesGcmSivKey>(AesGcmSivKeyFormat.class) { // from class: com.google.crypto.tink.aead.AesGcmSivKeyManager.2
            @Override // com.google.crypto.tink.KeyTypeManager.KeyFactory
            public void validateKeyFormat(AesGcmSivKeyFormat format) throws GeneralSecurityException {
                Validators.validateAesKeySize(format.getKeySize());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.crypto.tink.KeyTypeManager.KeyFactory
            public AesGcmSivKeyFormat parseKeyFormat(ByteString byteString) throws InvalidProtocolBufferException {
                return AesGcmSivKeyFormat.parseFrom(byteString, ExtensionRegistryLite.getEmptyRegistry());
            }

            @Override // com.google.crypto.tink.KeyTypeManager.KeyFactory
            public AesGcmSivKey createKey(AesGcmSivKeyFormat format) {
                return AesGcmSivKey.newBuilder().setKeyValue(ByteString.copyFrom(Random.randBytes(format.getKeySize()))).setVersion(AesGcmSivKeyManager.this.getVersion()).build();
            }

            @Override // com.google.crypto.tink.KeyTypeManager.KeyFactory
            public AesGcmSivKey deriveKey(AesGcmSivKeyFormat format, InputStream inputStream) throws GeneralSecurityException {
                Validators.validateVersion(format.getVersion(), AesGcmSivKeyManager.this.getVersion());
                byte[] bArr = new byte[format.getKeySize()];
                try {
                    if (inputStream.read(bArr) != format.getKeySize()) {
                        throw new GeneralSecurityException("Not enough pseudorandomness given");
                    }
                    return AesGcmSivKey.newBuilder().setKeyValue(ByteString.copyFrom(bArr)).setVersion(AesGcmSivKeyManager.this.getVersion()).build();
                } catch (IOException e) {
                    throw new GeneralSecurityException("Reading pseudorandomness failed", e);
                }
            }
        };
    }

    private static boolean canUseAesGcmSive() {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        }
    }

    public static void register(boolean newKeyAllowed) throws GeneralSecurityException {
        if (canUseAesGcmSive()) {
            Registry.registerKeyManager(new AesGcmSivKeyManager(), newKeyAllowed);
        }
    }

    public static final KeyTemplate aes128GcmSivTemplate() {
        return createKeyTemplate(16, KeyTemplate.OutputPrefixType.TINK);
    }

    public static final KeyTemplate rawAes128GcmSivTemplate() {
        return createKeyTemplate(16, KeyTemplate.OutputPrefixType.RAW);
    }

    public static final KeyTemplate aes256GcmSivTemplate() {
        return createKeyTemplate(32, KeyTemplate.OutputPrefixType.TINK);
    }

    public static final KeyTemplate rawAes256GcmSivTemplate() {
        return createKeyTemplate(32, KeyTemplate.OutputPrefixType.RAW);
    }

    private static KeyTemplate createKeyTemplate(int keySize, KeyTemplate.OutputPrefixType prefixType) {
        return KeyTemplate.create(new AesGcmSivKeyManager().getKeyType(), AesGcmSivKeyFormat.newBuilder().setKeySize(keySize).build().toByteArray(), prefixType);
    }
}
