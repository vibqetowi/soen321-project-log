package com.google.crypto.tink.daead;

import com.google.crypto.tink.DeterministicAead;
import com.google.crypto.tink.PrimitiveSet;
import com.google.crypto.tink.PrimitiveWrapper;
import com.google.crypto.tink.Registry;
import com.google.crypto.tink.subtle.Bytes;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Logger;
/* loaded from: classes7.dex */
public class DeterministicAeadWrapper implements PrimitiveWrapper<DeterministicAead, DeterministicAead> {
    private static final Logger logger = Logger.getLogger(DeterministicAeadWrapper.class.getName());

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes7.dex */
    public static class WrappedDeterministicAead implements DeterministicAead {
        private PrimitiveSet<DeterministicAead> primitives;

        public WrappedDeterministicAead(PrimitiveSet<DeterministicAead> primitives) {
            this.primitives = primitives;
        }

        @Override // com.google.crypto.tink.DeterministicAead
        public byte[] encryptDeterministically(final byte[] plaintext, final byte[] associatedData) throws GeneralSecurityException {
            return Bytes.concat(this.primitives.getPrimary().getIdentifier(), this.primitives.getPrimary().getPrimitive().encryptDeterministically(plaintext, associatedData));
        }

        @Override // com.google.crypto.tink.DeterministicAead
        public byte[] decryptDeterministically(final byte[] ciphertext, final byte[] associatedData) throws GeneralSecurityException {
            if (ciphertext.length > 5) {
                byte[] copyOfRange = Arrays.copyOfRange(ciphertext, 0, 5);
                byte[] copyOfRange2 = Arrays.copyOfRange(ciphertext, 5, ciphertext.length);
                for (PrimitiveSet.Entry<DeterministicAead> entry : this.primitives.getPrimitive(copyOfRange)) {
                    try {
                        return entry.getPrimitive().decryptDeterministically(copyOfRange2, associatedData);
                    } catch (GeneralSecurityException e) {
                        Logger logger = DeterministicAeadWrapper.logger;
                        logger.info("ciphertext prefix matches a key, but cannot decrypt: " + e.toString());
                    }
                }
            }
            for (PrimitiveSet.Entry<DeterministicAead> entry2 : this.primitives.getRawPrimitives()) {
                try {
                    return entry2.getPrimitive().decryptDeterministically(ciphertext, associatedData);
                } catch (GeneralSecurityException unused) {
                }
            }
            throw new GeneralSecurityException("decryption failed");
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.crypto.tink.PrimitiveWrapper
    public DeterministicAead wrap(final PrimitiveSet<DeterministicAead> primitives) {
        return new WrappedDeterministicAead(primitives);
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public Class<DeterministicAead> getPrimitiveClass() {
        return DeterministicAead.class;
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public Class<DeterministicAead> getInputPrimitiveClass() {
        return DeterministicAead.class;
    }

    public static void register() throws GeneralSecurityException {
        Registry.registerPrimitiveWrapper(new DeterministicAeadWrapper());
    }
}
