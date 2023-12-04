package com.google.crypto.tink;

import com.google.crypto.tink.proto.EncryptedKeyset;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.proto.Keyset;
import com.google.crypto.tink.proto.KeysetInfo;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.security.GeneralSecurityException;
/* loaded from: classes7.dex */
public final class KeysetHandle {
    private final Keyset keyset;

    private KeysetHandle(Keyset keyset) {
        this.keyset = keyset;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final KeysetHandle fromKeyset(Keyset keyset) throws GeneralSecurityException {
        assertEnoughKeyMaterial(keyset);
        return new KeysetHandle(keyset);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Keyset getKeyset() {
        return this.keyset;
    }

    public KeysetInfo getKeysetInfo() {
        return Util.getKeysetInfo(this.keyset);
    }

    @Deprecated
    public static final KeysetHandle generateNew(com.google.crypto.tink.proto.KeyTemplate keyTemplate) throws GeneralSecurityException {
        return KeysetManager.withEmptyKeyset().rotate(keyTemplate).getKeysetHandle();
    }

    public static final KeysetHandle generateNew(KeyTemplate keyTemplate) throws GeneralSecurityException {
        return KeysetManager.withEmptyKeyset().rotate(keyTemplate.getProto()).getKeysetHandle();
    }

    public static final KeysetHandle read(KeysetReader reader, Aead masterKey) throws GeneralSecurityException, IOException {
        EncryptedKeyset readEncrypted = reader.readEncrypted();
        assertEnoughEncryptedKeyMaterial(readEncrypted);
        return new KeysetHandle(decrypt(readEncrypted, masterKey));
    }

    public static final KeysetHandle readNoSecret(KeysetReader reader) throws GeneralSecurityException, IOException {
        try {
            Keyset read = reader.read();
            assertNoSecretKeyMaterial(read);
            return fromKeyset(read);
        } catch (InvalidProtocolBufferException unused) {
            throw new GeneralSecurityException("invalid keyset");
        }
    }

    public static final KeysetHandle readNoSecret(final byte[] serialized) throws GeneralSecurityException {
        try {
            Keyset parseFrom = Keyset.parseFrom(serialized, ExtensionRegistryLite.getEmptyRegistry());
            assertNoSecretKeyMaterial(parseFrom);
            return fromKeyset(parseFrom);
        } catch (InvalidProtocolBufferException unused) {
            throw new GeneralSecurityException("invalid keyset");
        }
    }

    public void write(KeysetWriter keysetWriter, Aead masterKey) throws GeneralSecurityException, IOException {
        keysetWriter.write(encrypt(this.keyset, masterKey));
    }

    public void writeNoSecret(KeysetWriter writer) throws GeneralSecurityException, IOException {
        assertNoSecretKeyMaterial(this.keyset);
        writer.write(this.keyset);
    }

    private static EncryptedKeyset encrypt(Keyset keyset, Aead masterKey) throws GeneralSecurityException {
        byte[] encrypt = masterKey.encrypt(keyset.toByteArray(), new byte[0]);
        try {
            if (!Keyset.parseFrom(masterKey.decrypt(encrypt, new byte[0]), ExtensionRegistryLite.getEmptyRegistry()).equals(keyset)) {
                throw new GeneralSecurityException("cannot encrypt keyset");
            }
            return EncryptedKeyset.newBuilder().setEncryptedKeyset(ByteString.copyFrom(encrypt)).setKeysetInfo(Util.getKeysetInfo(keyset)).build();
        } catch (InvalidProtocolBufferException unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    private static Keyset decrypt(EncryptedKeyset encryptedKeyset, Aead masterKey) throws GeneralSecurityException {
        try {
            Keyset parseFrom = Keyset.parseFrom(masterKey.decrypt(encryptedKeyset.getEncryptedKeyset().toByteArray(), new byte[0]), ExtensionRegistryLite.getEmptyRegistry());
            assertEnoughKeyMaterial(parseFrom);
            return parseFrom;
        } catch (InvalidProtocolBufferException unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    public KeysetHandle getPublicKeysetHandle() throws GeneralSecurityException {
        if (this.keyset == null) {
            throw new GeneralSecurityException("cleartext keyset is not available");
        }
        Keyset.Builder newBuilder = Keyset.newBuilder();
        for (Keyset.Key key : this.keyset.getKeyList()) {
            newBuilder.addKey(Keyset.Key.newBuilder().mergeFrom((Keyset.Key.Builder) key).setKeyData(createPublicKeyData(key.getKeyData())).build());
        }
        newBuilder.setPrimaryKeyId(this.keyset.getPrimaryKeyId());
        return new KeysetHandle(newBuilder.build());
    }

    private static KeyData createPublicKeyData(KeyData privateKeyData) throws GeneralSecurityException {
        if (privateKeyData.getKeyMaterialType() != KeyData.KeyMaterialType.ASYMMETRIC_PRIVATE) {
            throw new GeneralSecurityException("The keyset contains a non-private key");
        }
        KeyData publicKeyData = Registry.getPublicKeyData(privateKeyData.getTypeUrl(), privateKeyData.getValue());
        validate(publicKeyData);
        return publicKeyData;
    }

    private static void validate(KeyData keyData) throws GeneralSecurityException {
        Registry.getPrimitive(keyData);
    }

    public String toString() {
        return getKeysetInfo().toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void assertNoSecretKeyMaterial(Keyset keyset) throws GeneralSecurityException {
        for (Keyset.Key key : keyset.getKeyList()) {
            if (key.getKeyData().getKeyMaterialType() == KeyData.KeyMaterialType.UNKNOWN_KEYMATERIAL || key.getKeyData().getKeyMaterialType() == KeyData.KeyMaterialType.SYMMETRIC || key.getKeyData().getKeyMaterialType() == KeyData.KeyMaterialType.ASYMMETRIC_PRIVATE) {
                throw new GeneralSecurityException(String.format("keyset contains key material of type %s for type url %s", key.getKeyData().getKeyMaterialType(), key.getKeyData().getTypeUrl()));
            }
            while (r4.hasNext()) {
            }
        }
    }

    public static void assertEnoughKeyMaterial(Keyset keyset) throws GeneralSecurityException {
        if (keyset == null || keyset.getKeyCount() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    public static void assertEnoughEncryptedKeyMaterial(EncryptedKeyset keyset) throws GeneralSecurityException {
        if (keyset == null || keyset.getEncryptedKeyset().size() == 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    private <B, P> P getPrimitiveWithKnownInputPrimitive(Class<P> classObject, Class<B> inputPrimitiveClassObject) throws GeneralSecurityException {
        return (P) Registry.wrap(Registry.getPrimitives(this, inputPrimitiveClassObject), classObject);
    }

    public <P> P getPrimitive(Class<P> targetClassObject) throws GeneralSecurityException {
        Class<?> inputPrimitive = Registry.getInputPrimitive(targetClassObject);
        if (inputPrimitive == null) {
            throw new GeneralSecurityException("No wrapper found for " + targetClassObject.getName());
        }
        return (P) getPrimitiveWithKnownInputPrimitive(targetClassObject, inputPrimitive);
    }

    public <P> P getPrimitive(KeyManager<P> customKeyManager, Class<P> targetClassObject) throws GeneralSecurityException {
        if (customKeyManager == null) {
            throw new IllegalArgumentException("customKeyManager must be non-null.");
        }
        return (P) Registry.wrap(Registry.getPrimitives(this, customKeyManager, targetClassObject));
    }
}
