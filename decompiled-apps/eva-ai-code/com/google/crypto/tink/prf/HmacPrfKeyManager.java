package com.google.crypto.tink.prf;

import com.google.crypto.tink.KeyTemplate;
import com.google.crypto.tink.KeyTypeManager;
import com.google.crypto.tink.Registry;
import com.google.crypto.tink.proto.HashType;
import com.google.crypto.tink.proto.HmacPrfKey;
import com.google.crypto.tink.proto.HmacPrfKeyFormat;
import com.google.crypto.tink.proto.HmacPrfParams;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.subtle.PrfHmacJce;
import com.google.crypto.tink.subtle.Random;
import com.google.crypto.tink.subtle.Validators;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;
/* loaded from: classes7.dex */
public final class HmacPrfKeyManager extends KeyTypeManager<HmacPrfKey> {
    private static final int MIN_KEY_SIZE_IN_BYTES = 16;

    @Override // com.google.crypto.tink.KeyTypeManager
    public String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.HmacPrfKey";
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public int getVersion() {
        return 0;
    }

    public HmacPrfKeyManager() {
        super(HmacPrfKey.class, new KeyTypeManager.PrimitiveFactory<Prf, HmacPrfKey>(Prf.class) { // from class: com.google.crypto.tink.prf.HmacPrfKeyManager.1
            @Override // com.google.crypto.tink.KeyTypeManager.PrimitiveFactory
            public Prf getPrimitive(HmacPrfKey key) throws GeneralSecurityException {
                HashType hash = key.getParams().getHash();
                SecretKeySpec secretKeySpec = new SecretKeySpec(key.getKeyValue().toByteArray(), "HMAC");
                int i = AnonymousClass3.$SwitchMap$com$google$crypto$tink$proto$HashType[hash.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            return new PrfHmacJce("HMACSHA512", secretKeySpec);
                        }
                        throw new GeneralSecurityException("unknown hash");
                    }
                    return new PrfHmacJce("HMACSHA256", secretKeySpec);
                }
                return new PrfHmacJce("HMACSHA1", secretKeySpec);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.crypto.tink.prf.HmacPrfKeyManager$3  reason: invalid class name */
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

    @Override // com.google.crypto.tink.KeyTypeManager
    public KeyData.KeyMaterialType keyMaterialType() {
        return KeyData.KeyMaterialType.SYMMETRIC;
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public void validateKey(HmacPrfKey key) throws GeneralSecurityException {
        Validators.validateVersion(key.getVersion(), getVersion());
        if (key.getKeyValue().size() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        validateParams(key.getParams());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.crypto.tink.KeyTypeManager
    public HmacPrfKey parseKey(ByteString byteString) throws InvalidProtocolBufferException {
        return HmacPrfKey.parseFrom(byteString, ExtensionRegistryLite.getEmptyRegistry());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void validateParams(HmacPrfParams params) throws GeneralSecurityException {
        if (params.getHash() != HashType.SHA1 && params.getHash() != HashType.SHA256 && params.getHash() != HashType.SHA512) {
            throw new GeneralSecurityException("unknown hash type");
        }
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public KeyTypeManager.KeyFactory<?, HmacPrfKey> keyFactory() {
        return new KeyTypeManager.KeyFactory<HmacPrfKeyFormat, HmacPrfKey>(HmacPrfKeyFormat.class) { // from class: com.google.crypto.tink.prf.HmacPrfKeyManager.2
            @Override // com.google.crypto.tink.KeyTypeManager.KeyFactory
            public void validateKeyFormat(HmacPrfKeyFormat format) throws GeneralSecurityException {
                if (format.getKeySize() >= 16) {
                    HmacPrfKeyManager.validateParams(format.getParams());
                    return;
                }
                throw new GeneralSecurityException("key too short");
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.crypto.tink.KeyTypeManager.KeyFactory
            public HmacPrfKeyFormat parseKeyFormat(ByteString byteString) throws InvalidProtocolBufferException {
                return HmacPrfKeyFormat.parseFrom(byteString, ExtensionRegistryLite.getEmptyRegistry());
            }

            @Override // com.google.crypto.tink.KeyTypeManager.KeyFactory
            public HmacPrfKey createKey(HmacPrfKeyFormat format) {
                return HmacPrfKey.newBuilder().setVersion(HmacPrfKeyManager.this.getVersion()).setParams(format.getParams()).setKeyValue(ByteString.copyFrom(Random.randBytes(format.getKeySize()))).build();
            }

            @Override // com.google.crypto.tink.KeyTypeManager.KeyFactory
            public HmacPrfKey deriveKey(HmacPrfKeyFormat format, InputStream inputStream) throws GeneralSecurityException {
                Validators.validateVersion(format.getVersion(), HmacPrfKeyManager.this.getVersion());
                byte[] bArr = new byte[format.getKeySize()];
                try {
                    if (inputStream.read(bArr) != format.getKeySize()) {
                        throw new GeneralSecurityException("Not enough pseudorandomness given");
                    }
                    return HmacPrfKey.newBuilder().setVersion(HmacPrfKeyManager.this.getVersion()).setParams(format.getParams()).setKeyValue(ByteString.copyFrom(bArr)).build();
                } catch (IOException e) {
                    throw new GeneralSecurityException("Reading pseudorandomness failed", e);
                }
            }
        };
    }

    public static void register(boolean newKeyAllowed) throws GeneralSecurityException {
        Registry.registerKeyManager(new HmacPrfKeyManager(), newKeyAllowed);
    }

    public static final KeyTemplate hmacSha256Template() {
        return createTemplate(32, HashType.SHA256);
    }

    public static final KeyTemplate hmacSha512Template() {
        return createTemplate(64, HashType.SHA512);
    }

    private static KeyTemplate createTemplate(int keySize, HashType hashType) {
        return KeyTemplate.create(new HmacPrfKeyManager().getKeyType(), HmacPrfKeyFormat.newBuilder().setParams(HmacPrfParams.newBuilder().setHash(hashType).build()).setKeySize(keySize).build().toByteArray(), KeyTemplate.OutputPrefixType.RAW);
    }
}
