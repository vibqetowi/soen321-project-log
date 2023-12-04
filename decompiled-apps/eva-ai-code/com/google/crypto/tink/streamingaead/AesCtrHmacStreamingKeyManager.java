package com.google.crypto.tink.streamingaead;

import com.google.crypto.tink.KeyTemplate;
import com.google.crypto.tink.KeyTypeManager;
import com.google.crypto.tink.Registry;
import com.google.crypto.tink.StreamingAead;
import com.google.crypto.tink.proto.AesCtrHmacStreamingKey;
import com.google.crypto.tink.proto.AesCtrHmacStreamingKeyFormat;
import com.google.crypto.tink.proto.AesCtrHmacStreamingParams;
import com.google.crypto.tink.proto.HashType;
import com.google.crypto.tink.proto.HmacParams;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.subtle.AesCtrHmacStreaming;
import com.google.crypto.tink.subtle.Random;
import com.google.crypto.tink.subtle.Validators;
import java.security.GeneralSecurityException;
/* loaded from: classes7.dex */
public final class AesCtrHmacStreamingKeyManager extends KeyTypeManager<AesCtrHmacStreamingKey> {
    private static final int MIN_TAG_SIZE_IN_BYTES = 10;
    private static final int NONCE_PREFIX_IN_BYTES = 7;

    @Override // com.google.crypto.tink.KeyTypeManager
    public String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacStreamingKey";
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public int getVersion() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AesCtrHmacStreamingKeyManager() {
        super(AesCtrHmacStreamingKey.class, new KeyTypeManager.PrimitiveFactory<StreamingAead, AesCtrHmacStreamingKey>(StreamingAead.class) { // from class: com.google.crypto.tink.streamingaead.AesCtrHmacStreamingKeyManager.1
            @Override // com.google.crypto.tink.KeyTypeManager.PrimitiveFactory
            public StreamingAead getPrimitive(AesCtrHmacStreamingKey key) throws GeneralSecurityException {
                return new AesCtrHmacStreaming(key.getKeyValue().toByteArray(), StreamingAeadUtil.toHmacAlgo(key.getParams().getHkdfHashType()), key.getParams().getDerivedKeySize(), StreamingAeadUtil.toHmacAlgo(key.getParams().getHmacParams().getHash()), key.getParams().getHmacParams().getTagSize(), key.getParams().getCiphertextSegmentSize(), 0);
            }
        });
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public KeyData.KeyMaterialType keyMaterialType() {
        return KeyData.KeyMaterialType.SYMMETRIC;
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public void validateKey(AesCtrHmacStreamingKey key) throws GeneralSecurityException {
        Validators.validateVersion(key.getVersion(), getVersion());
        if (key.getKeyValue().size() < 16) {
            throw new GeneralSecurityException("key_value must have at least 16 bytes");
        }
        if (key.getKeyValue().size() < key.getParams().getDerivedKeySize()) {
            throw new GeneralSecurityException("key_value must have at least as many bits as derived keys");
        }
        validateParams(key.getParams());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.crypto.tink.KeyTypeManager
    public AesCtrHmacStreamingKey parseKey(ByteString byteString) throws InvalidProtocolBufferException {
        return AesCtrHmacStreamingKey.parseFrom(byteString, ExtensionRegistryLite.getEmptyRegistry());
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public KeyTypeManager.KeyFactory<?, AesCtrHmacStreamingKey> keyFactory() {
        return new KeyTypeManager.KeyFactory<AesCtrHmacStreamingKeyFormat, AesCtrHmacStreamingKey>(AesCtrHmacStreamingKeyFormat.class) { // from class: com.google.crypto.tink.streamingaead.AesCtrHmacStreamingKeyManager.2
            @Override // com.google.crypto.tink.KeyTypeManager.KeyFactory
            public void validateKeyFormat(AesCtrHmacStreamingKeyFormat format) throws GeneralSecurityException {
                if (format.getKeySize() >= 16) {
                    AesCtrHmacStreamingKeyManager.validateParams(format.getParams());
                    return;
                }
                throw new GeneralSecurityException("key_size must be at least 16 bytes");
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.crypto.tink.KeyTypeManager.KeyFactory
            public AesCtrHmacStreamingKeyFormat parseKeyFormat(ByteString byteString) throws InvalidProtocolBufferException {
                return AesCtrHmacStreamingKeyFormat.parseFrom(byteString, ExtensionRegistryLite.getEmptyRegistry());
            }

            @Override // com.google.crypto.tink.KeyTypeManager.KeyFactory
            public AesCtrHmacStreamingKey createKey(AesCtrHmacStreamingKeyFormat format) throws GeneralSecurityException {
                return AesCtrHmacStreamingKey.newBuilder().setKeyValue(ByteString.copyFrom(Random.randBytes(format.getKeySize()))).setParams(format.getParams()).setVersion(AesCtrHmacStreamingKeyManager.this.getVersion()).build();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void validateParams(AesCtrHmacStreamingParams params) throws GeneralSecurityException {
        Validators.validateAesKeySize(params.getDerivedKeySize());
        if (params.getHkdfHashType() == HashType.UNKNOWN_HASH) {
            throw new GeneralSecurityException("unknown HKDF hash type");
        }
        if (params.getHmacParams().getHash() == HashType.UNKNOWN_HASH) {
            throw new GeneralSecurityException("unknown HMAC hash type");
        }
        validateHmacParams(params.getHmacParams());
        if (params.getCiphertextSegmentSize() < params.getDerivedKeySize() + params.getHmacParams().getTagSize() + 2 + 7) {
            throw new GeneralSecurityException("ciphertext_segment_size must be at least (derived_key_size + tag_size + NONCE_PREFIX_IN_BYTES + 2)");
        }
    }

    private static void validateHmacParams(HmacParams params) throws GeneralSecurityException {
        if (params.getTagSize() < 10) {
            throw new GeneralSecurityException("tag size too small");
        }
        int i = AnonymousClass3.$SwitchMap$com$google$crypto$tink$proto$HashType[params.getHash().ordinal()];
        if (i == 1) {
            if (params.getTagSize() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (i == 2) {
            if (params.getTagSize() > 32) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (i == 3) {
            if (params.getTagSize() > 64) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            throw new GeneralSecurityException("unknown hash type");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.crypto.tink.streamingaead.AesCtrHmacStreamingKeyManager$3  reason: invalid class name */
    /* loaded from: classes7.dex */
    public static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$HashType;

        static {
            int[] iArr = new int[HashType.values().length];
            $SwitchMap$com$google$crypto$tink$proto$HashType = iArr;
            try {
                iArr[HashType.SHA1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$HashType[HashType.SHA256.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$HashType[HashType.SHA512.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static void register(boolean newKeyAllowed) throws GeneralSecurityException {
        Registry.registerKeyManager(new AesCtrHmacStreamingKeyManager(), newKeyAllowed);
    }

    public static final KeyTemplate aes128CtrHmacSha2564KBTemplate() {
        return createKeyTemplate(16, HashType.SHA256, 16, HashType.SHA256, 32, 4096);
    }

    public static final KeyTemplate aes128CtrHmacSha2561MBTemplate() {
        return createKeyTemplate(16, HashType.SHA256, 16, HashType.SHA256, 32, 1048576);
    }

    public static final KeyTemplate aes256CtrHmacSha2564KBTemplate() {
        return createKeyTemplate(32, HashType.SHA256, 32, HashType.SHA256, 32, 4096);
    }

    public static final KeyTemplate aes256CtrHmacSha2561MBTemplate() {
        return createKeyTemplate(32, HashType.SHA256, 32, HashType.SHA256, 32, 1048576);
    }

    private static KeyTemplate createKeyTemplate(int mainKeySize, HashType hkdfHashType, int derivedKeySize, HashType macHashType, int tagSize, int ciphertextSegmentSize) {
        AesCtrHmacStreamingParams.Builder hkdfHashType2 = AesCtrHmacStreamingParams.newBuilder().setCiphertextSegmentSize(ciphertextSegmentSize).setDerivedKeySize(derivedKeySize).setHkdfHashType(hkdfHashType);
        return KeyTemplate.create(new AesCtrHmacStreamingKeyManager().getKeyType(), AesCtrHmacStreamingKeyFormat.newBuilder().setParams(hkdfHashType2.setHmacParams(HmacParams.newBuilder().setHash(macHashType).setTagSize(tagSize).build()).build()).setKeySize(mainKeySize).build().toByteArray(), KeyTemplate.OutputPrefixType.RAW);
    }
}
