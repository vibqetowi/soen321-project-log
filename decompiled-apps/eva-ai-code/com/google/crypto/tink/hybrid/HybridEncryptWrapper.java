package com.google.crypto.tink.hybrid;

import com.google.crypto.tink.HybridEncrypt;
import com.google.crypto.tink.PrimitiveSet;
import com.google.crypto.tink.PrimitiveWrapper;
import com.google.crypto.tink.Registry;
import com.google.crypto.tink.subtle.Bytes;
import java.security.GeneralSecurityException;
/* loaded from: classes7.dex */
class HybridEncryptWrapper implements PrimitiveWrapper<HybridEncrypt, HybridEncrypt> {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes7.dex */
    public static class WrappedHybridEncrypt implements HybridEncrypt {
        final PrimitiveSet<HybridEncrypt> primitives;

        public WrappedHybridEncrypt(final PrimitiveSet<HybridEncrypt> primitives) {
            this.primitives = primitives;
        }

        @Override // com.google.crypto.tink.HybridEncrypt
        public byte[] encrypt(final byte[] plaintext, final byte[] contextInfo) throws GeneralSecurityException {
            return Bytes.concat(this.primitives.getPrimary().getIdentifier(), this.primitives.getPrimary().getPrimitive().encrypt(plaintext, contextInfo));
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.crypto.tink.PrimitiveWrapper
    public HybridEncrypt wrap(final PrimitiveSet<HybridEncrypt> primitives) {
        return new WrappedHybridEncrypt(primitives);
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public Class<HybridEncrypt> getPrimitiveClass() {
        return HybridEncrypt.class;
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public Class<HybridEncrypt> getInputPrimitiveClass() {
        return HybridEncrypt.class;
    }

    public static void register() throws GeneralSecurityException {
        Registry.registerPrimitiveWrapper(new HybridEncryptWrapper());
    }
}
