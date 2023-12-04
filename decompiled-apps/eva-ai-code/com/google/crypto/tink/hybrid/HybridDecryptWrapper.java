package com.google.crypto.tink.hybrid;

import com.google.crypto.tink.HybridDecrypt;
import com.google.crypto.tink.PrimitiveSet;
import com.google.crypto.tink.PrimitiveWrapper;
import com.google.crypto.tink.Registry;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Logger;
/* loaded from: classes7.dex */
public class HybridDecryptWrapper implements PrimitiveWrapper<HybridDecrypt, HybridDecrypt> {
    private static final Logger logger = Logger.getLogger(HybridDecryptWrapper.class.getName());

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes7.dex */
    public static class WrappedHybridDecrypt implements HybridDecrypt {
        private final PrimitiveSet<HybridDecrypt> primitives;

        public WrappedHybridDecrypt(final PrimitiveSet<HybridDecrypt> primitives) {
            this.primitives = primitives;
        }

        @Override // com.google.crypto.tink.HybridDecrypt
        public byte[] decrypt(final byte[] ciphertext, final byte[] contextInfo) throws GeneralSecurityException {
            if (ciphertext.length > 5) {
                byte[] copyOfRange = Arrays.copyOfRange(ciphertext, 0, 5);
                byte[] copyOfRange2 = Arrays.copyOfRange(ciphertext, 5, ciphertext.length);
                for (PrimitiveSet.Entry<HybridDecrypt> entry : this.primitives.getPrimitive(copyOfRange)) {
                    try {
                        return entry.getPrimitive().decrypt(copyOfRange2, contextInfo);
                    } catch (GeneralSecurityException e) {
                        Logger logger = HybridDecryptWrapper.logger;
                        logger.info("ciphertext prefix matches a key, but cannot decrypt: " + e.toString());
                    }
                }
            }
            for (PrimitiveSet.Entry<HybridDecrypt> entry2 : this.primitives.getRawPrimitives()) {
                try {
                    return entry2.getPrimitive().decrypt(ciphertext, contextInfo);
                } catch (GeneralSecurityException unused) {
                }
            }
            throw new GeneralSecurityException("decryption failed");
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.crypto.tink.PrimitiveWrapper
    public HybridDecrypt wrap(final PrimitiveSet<HybridDecrypt> primitives) {
        return new WrappedHybridDecrypt(primitives);
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public Class<HybridDecrypt> getPrimitiveClass() {
        return HybridDecrypt.class;
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public Class<HybridDecrypt> getInputPrimitiveClass() {
        return HybridDecrypt.class;
    }

    public static void register() throws GeneralSecurityException {
        Registry.registerPrimitiveWrapper(new HybridDecryptWrapper());
    }
}
