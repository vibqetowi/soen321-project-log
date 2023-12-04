package com.google.crypto.tink;

import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.proto.Keyset;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.security.GeneralSecurityException;
@Deprecated
/* loaded from: classes7.dex */
public final class NoSecretKeysetHandle {
    @Deprecated
    public static final KeysetHandle parseFrom(final byte[] serialized) throws GeneralSecurityException {
        try {
            Keyset parseFrom = Keyset.parseFrom(serialized, ExtensionRegistryLite.getEmptyRegistry());
            validate(parseFrom);
            return KeysetHandle.fromKeyset(parseFrom);
        } catch (InvalidProtocolBufferException unused) {
            throw new GeneralSecurityException("invalid keyset");
        }
    }

    public static final KeysetHandle read(KeysetReader reader) throws GeneralSecurityException, IOException {
        Keyset read = reader.read();
        validate(read);
        return KeysetHandle.fromKeyset(read);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void validate(Keyset keyset) throws GeneralSecurityException {
        for (Keyset.Key key : keyset.getKeyList()) {
            if (key.getKeyData().getKeyMaterialType() == KeyData.KeyMaterialType.UNKNOWN_KEYMATERIAL || key.getKeyData().getKeyMaterialType() == KeyData.KeyMaterialType.SYMMETRIC || key.getKeyData().getKeyMaterialType() == KeyData.KeyMaterialType.ASYMMETRIC_PRIVATE) {
                throw new GeneralSecurityException("keyset contains secret key material");
            }
            while (r3.hasNext()) {
            }
        }
    }
}
