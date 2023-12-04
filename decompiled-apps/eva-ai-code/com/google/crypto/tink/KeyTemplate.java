package com.google.crypto.tink;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.errorprone.annotations.Immutable;
@Immutable
/* loaded from: classes7.dex */
public final class KeyTemplate {
    private final com.google.crypto.tink.proto.KeyTemplate kt;

    /* loaded from: classes7.dex */
    public enum OutputPrefixType {
        TINK,
        LEGACY,
        RAW,
        CRUNCHY
    }

    private static OutputPrefixType fromProto(com.google.crypto.tink.proto.OutputPrefixType outputPrefixType) {
        int i = AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[outputPrefixType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return OutputPrefixType.CRUNCHY;
                    }
                    throw new IllegalArgumentException("Unknown output prefix type");
                }
                return OutputPrefixType.RAW;
            }
            return OutputPrefixType.LEGACY;
        }
        return OutputPrefixType.TINK;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.crypto.tink.KeyTemplate$1  reason: invalid class name */
    /* loaded from: classes7.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$KeyTemplate$OutputPrefixType;
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType;

        static {
            int[] iArr = new int[OutputPrefixType.values().length];
            $SwitchMap$com$google$crypto$tink$KeyTemplate$OutputPrefixType = iArr;
            try {
                iArr[OutputPrefixType.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$KeyTemplate$OutputPrefixType[OutputPrefixType.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$KeyTemplate$OutputPrefixType[OutputPrefixType.RAW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$KeyTemplate$OutputPrefixType[OutputPrefixType.CRUNCHY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[com.google.crypto.tink.proto.OutputPrefixType.values().length];
            $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType = iArr2;
            try {
                iArr2[com.google.crypto.tink.proto.OutputPrefixType.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[com.google.crypto.tink.proto.OutputPrefixType.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[com.google.crypto.tink.proto.OutputPrefixType.RAW.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[com.google.crypto.tink.proto.OutputPrefixType.CRUNCHY.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    private static com.google.crypto.tink.proto.OutputPrefixType toProto(OutputPrefixType outputPrefixType) {
        int i = AnonymousClass1.$SwitchMap$com$google$crypto$tink$KeyTemplate$OutputPrefixType[outputPrefixType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return com.google.crypto.tink.proto.OutputPrefixType.CRUNCHY;
                    }
                    throw new IllegalArgumentException("Unknown output prefix type");
                }
                return com.google.crypto.tink.proto.OutputPrefixType.RAW;
            }
            return com.google.crypto.tink.proto.OutputPrefixType.LEGACY;
        }
        return com.google.crypto.tink.proto.OutputPrefixType.TINK;
    }

    public static KeyTemplate create(String typeUrl, byte[] value, OutputPrefixType outputPrefixType) {
        return new KeyTemplate(com.google.crypto.tink.proto.KeyTemplate.newBuilder().setTypeUrl(typeUrl).setValue(ByteString.copyFrom(value)).setOutputPrefixType(toProto(outputPrefixType)).build());
    }

    private KeyTemplate(com.google.crypto.tink.proto.KeyTemplate kt) {
        this.kt = kt;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.google.crypto.tink.proto.KeyTemplate getProto() {
        return this.kt;
    }

    public String getTypeUrl() {
        return this.kt.getTypeUrl();
    }

    public byte[] getValue() {
        return this.kt.getValue().toByteArray();
    }

    public OutputPrefixType getOutputPrefixType() {
        return fromProto(this.kt.getOutputPrefixType());
    }
}
