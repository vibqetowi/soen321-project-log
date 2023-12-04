package com.google.crypto.tink.signature;

import com.google.crypto.tink.PrimitiveSet;
import com.google.crypto.tink.PrimitiveWrapper;
import com.google.crypto.tink.PublicKeySign;
import com.google.crypto.tink.Registry;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.subtle.Bytes;
import java.security.GeneralSecurityException;
/* loaded from: classes7.dex */
public class PublicKeySignWrapper implements PrimitiveWrapper<PublicKeySign, PublicKeySign> {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes7.dex */
    public static class WrappedPublicKeySign implements PublicKeySign {
        private final PrimitiveSet<PublicKeySign> primitives;

        public WrappedPublicKeySign(final PrimitiveSet<PublicKeySign> primitives) {
            this.primitives = primitives;
        }

        @Override // com.google.crypto.tink.PublicKeySign
        public byte[] sign(final byte[] data) throws GeneralSecurityException {
            if (this.primitives.getPrimary().getOutputPrefixType().equals(OutputPrefixType.LEGACY)) {
                return Bytes.concat(this.primitives.getPrimary().getIdentifier(), this.primitives.getPrimary().getPrimitive().sign(Bytes.concat(data, new byte[]{0})));
            }
            return Bytes.concat(this.primitives.getPrimary().getIdentifier(), this.primitives.getPrimary().getPrimitive().sign(data));
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.crypto.tink.PrimitiveWrapper
    public PublicKeySign wrap(final PrimitiveSet<PublicKeySign> primitives) {
        return new WrappedPublicKeySign(primitives);
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public Class<PublicKeySign> getPrimitiveClass() {
        return PublicKeySign.class;
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public Class<PublicKeySign> getInputPrimitiveClass() {
        return PublicKeySign.class;
    }

    public static void register() throws GeneralSecurityException {
        Registry.registerPrimitiveWrapper(new PublicKeySignWrapper());
    }
}
