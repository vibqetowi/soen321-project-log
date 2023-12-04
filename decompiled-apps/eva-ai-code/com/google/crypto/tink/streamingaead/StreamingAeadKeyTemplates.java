package com.google.crypto.tink.streamingaead;

import com.google.crypto.tink.proto.AesCtrHmacStreamingKeyFormat;
import com.google.crypto.tink.proto.AesCtrHmacStreamingParams;
import com.google.crypto.tink.proto.AesGcmHkdfStreamingKeyFormat;
import com.google.crypto.tink.proto.AesGcmHkdfStreamingParams;
import com.google.crypto.tink.proto.HashType;
import com.google.crypto.tink.proto.HmacParams;
import com.google.crypto.tink.proto.KeyTemplate;
import com.google.crypto.tink.proto.OutputPrefixType;
@Deprecated
/* loaded from: classes7.dex */
public final class StreamingAeadKeyTemplates {
    public static final KeyTemplate AES128_CTR_HMAC_SHA256_4KB = createAesCtrHmacStreamingKeyTemplate(16, HashType.SHA256, 16, HashType.SHA256, 32, 4096);
    public static final KeyTemplate AES256_CTR_HMAC_SHA256_4KB = createAesCtrHmacStreamingKeyTemplate(32, HashType.SHA256, 32, HashType.SHA256, 32, 4096);
    public static final KeyTemplate AES128_GCM_HKDF_4KB = createAesGcmHkdfStreamingKeyTemplate(16, HashType.SHA256, 16, 4096);
    public static final KeyTemplate AES256_GCM_HKDF_4KB = createAesGcmHkdfStreamingKeyTemplate(32, HashType.SHA256, 32, 4096);
    public static final KeyTemplate AES256_GCM_HKDF_1MB = createAesGcmHkdfStreamingKeyTemplate(32, HashType.SHA256, 32, 1048576);

    public static KeyTemplate createAesCtrHmacStreamingKeyTemplate(int mainKeySize, HashType hkdfHashType, int derivedKeySize, HashType macHashType, int tagSize, int ciphertextSegmentSize) {
        AesCtrHmacStreamingParams.Builder hkdfHashType2 = AesCtrHmacStreamingParams.newBuilder().setCiphertextSegmentSize(ciphertextSegmentSize).setDerivedKeySize(derivedKeySize).setHkdfHashType(hkdfHashType);
        return KeyTemplate.newBuilder().setValue(AesCtrHmacStreamingKeyFormat.newBuilder().setParams(hkdfHashType2.setHmacParams(HmacParams.newBuilder().setHash(macHashType).setTagSize(tagSize).build()).build()).setKeySize(mainKeySize).build().toByteString()).setTypeUrl(new AesCtrHmacStreamingKeyManager().getKeyType()).setOutputPrefixType(OutputPrefixType.RAW).build();
    }

    public static KeyTemplate createAesGcmHkdfStreamingKeyTemplate(int mainKeySize, HashType hkdfHashType, int derivedKeySize, int ciphertextSegmentSize) {
        return KeyTemplate.newBuilder().setValue(AesGcmHkdfStreamingKeyFormat.newBuilder().setKeySize(mainKeySize).setParams(AesGcmHkdfStreamingParams.newBuilder().setCiphertextSegmentSize(ciphertextSegmentSize).setDerivedKeySize(derivedKeySize).setHkdfHashType(hkdfHashType).build()).build().toByteString()).setTypeUrl(new AesGcmHkdfStreamingKeyManager().getKeyType()).setOutputPrefixType(OutputPrefixType.RAW).build();
    }
}
