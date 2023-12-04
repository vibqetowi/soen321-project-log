package com.google.crypto.tink.aead;

import com.google.crypto.tink.Aead;
import com.google.crypto.tink.KeyTemplate;
import com.google.crypto.tink.KeyTypeManager;
import com.google.crypto.tink.Registry;
import com.google.crypto.tink.proto.AesGcmKey;
import com.google.crypto.tink.proto.AesGcmKeyFormat;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.subtle.AesGcmJce;
import com.google.crypto.tink.subtle.Random;
import com.google.crypto.tink.subtle.Validators;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
/* loaded from: classes7.dex */
public final class AesGcmKeyManager extends KeyTypeManager<AesGcmKey> {
    @Override // com.google.crypto.tink.KeyTypeManager
    public String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public int getVersion() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AesGcmKeyManager() {
        super(AesGcmKey.class, new KeyTypeManager.PrimitiveFactory<Aead, AesGcmKey>(Aead.class) { // from class: com.google.crypto.tink.aead.AesGcmKeyManager.1
            @Override // com.google.crypto.tink.KeyTypeManager.PrimitiveFactory
            public Aead getPrimitive(AesGcmKey key) throws GeneralSecurityException {
                return new AesGcmJce(key.getKeyValue().toByteArray());
            }
        });
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public KeyData.KeyMaterialType keyMaterialType() {
        return KeyData.KeyMaterialType.SYMMETRIC;
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public void validateKey(AesGcmKey key) throws GeneralSecurityException {
        Validators.validateVersion(key.getVersion(), getVersion());
        Validators.validateAesKeySize(key.getKeyValue().size());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.crypto.tink.KeyTypeManager
    public AesGcmKey parseKey(ByteString byteString) throws InvalidProtocolBufferException {
        return AesGcmKey.parseFrom(byteString, ExtensionRegistryLite.getEmptyRegistry());
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public KeyTypeManager.KeyFactory<?, AesGcmKey> keyFactory() {
        return new KeyTypeManager.KeyFactory<AesGcmKeyFormat, AesGcmKey>(AesGcmKeyFormat.class) { // from class: com.google.crypto.tink.aead.AesGcmKeyManager.2
            @Override // com.google.crypto.tink.KeyTypeManager.KeyFactory
            public void validateKeyFormat(AesGcmKeyFormat format) throws GeneralSecurityException {
                Validators.validateAesKeySize(format.getKeySize());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.crypto.tink.KeyTypeManager.KeyFactory
            public AesGcmKeyFormat parseKeyFormat(ByteString byteString) throws InvalidProtocolBufferException {
                return AesGcmKeyFormat.parseFrom(byteString, ExtensionRegistryLite.getEmptyRegistry());
            }

            @Override // com.google.crypto.tink.KeyTypeManager.KeyFactory
            public AesGcmKey createKey(AesGcmKeyFormat format) throws GeneralSecurityException {
                return AesGcmKey.newBuilder().setKeyValue(ByteString.copyFrom(Random.randBytes(format.getKeySize()))).setVersion(AesGcmKeyManager.this.getVersion()).build();
            }

            @Override // com.google.crypto.tink.KeyTypeManager.KeyFactory
            public AesGcmKey deriveKey(AesGcmKeyFormat format, InputStream inputStream) throws GeneralSecurityException {
                Validators.validateVersion(format.getVersion(), AesGcmKeyManager.this.getVersion());
                byte[] bArr = new byte[format.getKeySize()];
                try {
                    if (inputStream.read(bArr) != format.getKeySize()) {
                        throw new GeneralSecurityException("Not enough pseudorandomness given");
                    }
                    return AesGcmKey.newBuilder().setKeyValue(ByteString.copyFrom(bArr)).setVersion(AesGcmKeyManager.this.getVersion()).build();
                } catch (IOException e) {
                    throw new GeneralSecurityException("Reading pseudorandomness failed", e);
                }
            }
        };
    }

    public static void register(boolean newKeyAllowed) throws GeneralSecurityException {
        Registry.registerKeyManager(new AesGcmKeyManager(), newKeyAllowed);
    }

    public static final KeyTemplate aes128GcmTemplate() {
        return createKeyTemplate(16, KeyTemplate.OutputPrefixType.TINK);
    }

    public static final KeyTemplate rawAes128GcmTemplate() {
        return createKeyTemplate(16, KeyTemplate.OutputPrefixType.RAW);
    }

    public static final KeyTemplate aes256GcmTemplate() {
        return createKeyTemplate(32, KeyTemplate.OutputPrefixType.TINK);
    }

    public static final KeyTemplate rawAes256GcmTemplate() {
        return createKeyTemplate(32, KeyTemplate.OutputPrefixType.RAW);
    }

    private static KeyTemplate createKeyTemplate(int keySize, KeyTemplate.OutputPrefixType prefixType) {
        return KeyTemplate.create(new AesGcmKeyManager().getKeyType(), AesGcmKeyFormat.newBuilder().setKeySize(keySize).build().toByteArray(), prefixType);
    }
}
