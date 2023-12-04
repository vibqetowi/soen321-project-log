package com.google.crypto.tink.daead;

import com.google.crypto.tink.proto.AesSivKeyFormat;
import com.google.crypto.tink.proto.KeyTemplate;
import com.google.crypto.tink.proto.OutputPrefixType;
@Deprecated
/* loaded from: classes7.dex */
public final class DeterministicAeadKeyTemplates {
    public static final KeyTemplate AES256_SIV = createAesSivKeyTemplate(64);

    public static KeyTemplate createAesSivKeyTemplate(int keySize) {
        return KeyTemplate.newBuilder().setValue(AesSivKeyFormat.newBuilder().setKeySize(keySize).build().toByteString()).setTypeUrl(new AesSivKeyManager().getKeyType()).setOutputPrefixType(OutputPrefixType.TINK).build();
    }
}
