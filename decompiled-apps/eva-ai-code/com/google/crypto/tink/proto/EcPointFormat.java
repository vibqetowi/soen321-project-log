package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.Internal;
/* loaded from: classes7.dex */
public enum EcPointFormat implements Internal.EnumLite {
    UNKNOWN_FORMAT(0),
    UNCOMPRESSED(1),
    COMPRESSED(2),
    DO_NOT_USE_CRUNCHY_UNCOMPRESSED(3),
    UNRECOGNIZED(-1);
    
    public static final int COMPRESSED_VALUE = 2;
    public static final int DO_NOT_USE_CRUNCHY_UNCOMPRESSED_VALUE = 3;
    public static final int UNCOMPRESSED_VALUE = 1;
    public static final int UNKNOWN_FORMAT_VALUE = 0;
    private static final Internal.EnumLiteMap<EcPointFormat> internalValueMap = new Internal.EnumLiteMap<EcPointFormat>() { // from class: com.google.crypto.tink.proto.EcPointFormat.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap
        public EcPointFormat findValueByNumber(int number) {
            return EcPointFormat.forNumber(number);
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
    public static EcPointFormat valueOf(int value) {
        return forNumber(value);
    }

    public static EcPointFormat forNumber(int value) {
        if (value != 0) {
            if (value != 1) {
                if (value != 2) {
                    if (value != 3) {
                        return null;
                    }
                    return DO_NOT_USE_CRUNCHY_UNCOMPRESSED;
                }
                return COMPRESSED;
            }
            return UNCOMPRESSED;
        }
        return UNKNOWN_FORMAT;
    }

    public static Internal.EnumLiteMap<EcPointFormat> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return EcPointFormatVerifier.INSTANCE;
    }

    /* loaded from: classes7.dex */
    private static final class EcPointFormatVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new EcPointFormatVerifier();

        private EcPointFormatVerifier() {
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier
        public boolean isInRange(int number) {
            return EcPointFormat.forNumber(number) != null;
        }
    }

    EcPointFormat(int value) {
        this.value = value;
    }
}
