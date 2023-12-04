package com.google.crypto.tink;

import com.google.crypto.tink.proto.KeyTypeEntry;
import com.google.crypto.tink.proto.RegistryConfig;
import java.security.GeneralSecurityException;
/* loaded from: classes7.dex */
public final class Config {
    public static KeyTypeEntry getTinkKeyTypeEntry(String catalogueName, String primitiveName, String keyProtoName, int keyManagerVersion, boolean newKeyAllowed) {
        KeyTypeEntry.Builder primitiveName2 = KeyTypeEntry.newBuilder().setPrimitiveName(primitiveName);
        return primitiveName2.setTypeUrl("type.googleapis.com/google.crypto.tink." + keyProtoName).setKeyManagerVersion(keyManagerVersion).setNewKeyAllowed(newKeyAllowed).setCatalogueName(catalogueName).build();
    }

    public static void register(RegistryConfig config) throws GeneralSecurityException {
        for (KeyTypeEntry keyTypeEntry : config.getEntryList()) {
            registerKeyType(keyTypeEntry);
        }
    }

    public static void registerKeyType(KeyTypeEntry entry) throws GeneralSecurityException {
        validate(entry);
        if (entry.getCatalogueName().equals("TinkAead") || entry.getCatalogueName().equals("TinkMac") || entry.getCatalogueName().equals("TinkHybridDecrypt") || entry.getCatalogueName().equals("TinkHybridEncrypt") || entry.getCatalogueName().equals("TinkPublicKeySign") || entry.getCatalogueName().equals("TinkPublicKeyVerify") || entry.getCatalogueName().equals("TinkStreamingAead") || entry.getCatalogueName().equals("TinkDeterministicAead")) {
            return;
        }
        Catalogue<?> catalogue = Registry.getCatalogue(entry.getCatalogueName());
        Registry.registerPrimitiveWrapper(catalogue.getPrimitiveWrapper());
        Registry.registerKeyManager(catalogue.getKeyManager(entry.getTypeUrl(), entry.getPrimitiveName(), entry.getKeyManagerVersion()), entry.getNewKeyAllowed());
    }

    private static void validate(KeyTypeEntry entry) throws GeneralSecurityException {
        if (entry.getTypeUrl().isEmpty()) {
            throw new GeneralSecurityException("Missing type_url.");
        }
        if (entry.getPrimitiveName().isEmpty()) {
            throw new GeneralSecurityException("Missing primitive_name.");
        }
        if (entry.getCatalogueName().isEmpty()) {
            throw new GeneralSecurityException("Missing catalogue_name.");
        }
    }
}
