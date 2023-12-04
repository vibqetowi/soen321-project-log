package com.google.crypto.tink.shaded.protobuf;
/* loaded from: classes7.dex */
interface MutabilityOracle {
    public static final MutabilityOracle IMMUTABLE = new MutabilityOracle() { // from class: com.google.crypto.tink.shaded.protobuf.MutabilityOracle.1
        @Override // com.google.crypto.tink.shaded.protobuf.MutabilityOracle
        public void ensureMutable() {
            throw new UnsupportedOperationException();
        }
    };

    void ensureMutable();
}
