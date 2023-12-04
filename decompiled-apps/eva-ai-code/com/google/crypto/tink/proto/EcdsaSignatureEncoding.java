package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.Internal;
/* loaded from: classes7.dex */
public enum EcdsaSignatureEncoding implements Internal.EnumLite {
    UNKNOWN_ENCODING(0),
    IEEE_P1363(1),
    DER(2),
    UNRECOGNIZED(-1);
    
    public static final int DER_VALUE = 2;
    public static final int IEEE_P1363_VALUE = 1;
    public static final int UNKNOWN_ENCODING_VALUE = 0;
    private static final Internal.EnumLiteMap<EcdsaSignatureEncoding> internalValueMap = new Internal.EnumLiteMap<EcdsaSignatureEncoding>() { // from class: com.google.crypto.tink.proto.EcdsaSignatureEncoding.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap
        public EcdsaSignatureEncoding findValueByNumber(int number) {
            return EcdsaSignatureEncoding.forNumber(number);
        }
    };
    private final int value;

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this == UNRECOGNIZED) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        return this.value;
    }

    @Deprecated
    public static EcdsaSignatureEncoding valueOf(int value) {
        return forNumber(value);
    }

    public static EcdsaSignatureEncoding forNumber(int value) {
        if (value != 0) {
            if (value != 1) {
                if (value != 2) {
                    return null;
                }
                return DER;
            }
            return IEEE_P1363;
        }
        return UNKNOWN_ENCODING;
    }

    public static Internal.EnumLiteMap<EcdsaSignatureEncoding> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return EcdsaSignatureEncodingVerifier.INSTANCE;
    }

    /* loaded from: classes7.dex */
    private static final class EcdsaSignatureEncodingVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new EcdsaSignatureEncodingVerifier();

        private EcdsaSignatureEncodingVerifier() {
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier
        public boolean isInRange(int number) {
            return EcdsaSignatureEncoding.forNumber(number) != null;
        }
    }

    EcdsaSignatureEncoding(int value) {
        this.value = value;
    }
}
