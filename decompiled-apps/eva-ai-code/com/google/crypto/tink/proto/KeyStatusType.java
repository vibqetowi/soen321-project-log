package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.Internal;
/* loaded from: classes7.dex */
public enum KeyStatusType implements Internal.EnumLite {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);
    
    public static final int DESTROYED_VALUE = 3;
    public static final int DISABLED_VALUE = 2;
    public static final int ENABLED_VALUE = 1;
    public static final int UNKNOWN_STATUS_VALUE = 0;
    private static final Internal.EnumLiteMap<KeyStatusType> internalValueMap = new Internal.EnumLiteMap<KeyStatusType>() { // from class: com.google.crypto.tink.proto.KeyStatusType.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumLiteMap
        public KeyStatusType findValueByNumber(int number) {
            return KeyStatusType.forNumber(number);
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
    public static KeyStatusType valueOf(int value) {
        return forNumber(value);
    }

    public static KeyStatusType forNumber(int value) {
        if (value != 0) {
            if (value != 1) {
                if (value != 2) {
                    if (value != 3) {
                        return null;
                    }
                    return DESTROYED;
                }
                return DISABLED;
            }
            return ENABLED;
        }
        return UNKNOWN_STATUS;
    }

    public static Internal.EnumLiteMap<KeyStatusType> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return KeyStatusTypeVerifier.INSTANCE;
    }

    /* loaded from: classes7.dex */
    private static final class KeyStatusTypeVerifier implements Internal.EnumVerifier {
        static final Internal.EnumVerifier INSTANCE = new KeyStatusTypeVerifier();

        private KeyStatusTypeVerifier() {
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Internal.EnumVerifier
        public boolean isInRange(int number) {
            return KeyStatusType.forNumber(number) != null;
        }
    }

    KeyStatusType(int value) {
        this.value = value;
    }
}
