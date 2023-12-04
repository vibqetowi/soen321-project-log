package com.google.crypto.tink.signature;

import com.google.crypto.tink.PrimitiveSet;
import com.google.crypto.tink.PrimitiveWrapper;
import com.google.crypto.tink.PublicKeyVerify;
import com.google.crypto.tink.Registry;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.subtle.Bytes;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Logger;
/* loaded from: classes7.dex */
class PublicKeyVerifyWrapper implements PrimitiveWrapper<PublicKeyVerify, PublicKeyVerify> {
    private static final Logger logger = Logger.getLogger(PublicKeyVerifyWrapper.class.getName());

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes7.dex */
    public static class WrappedPublicKeyVerify implements PublicKeyVerify {
        private final PrimitiveSet<PublicKeyVerify> primitives;

        public WrappedPublicKeyVerify(PrimitiveSet<PublicKeyVerify> primitives) {
            this.primitives = primitives;
        }

        @Override // com.google.crypto.tink.PublicKeyVerify
        public void verify(final byte[] signature, final byte[] data) throws GeneralSecurityException {
            if (signature.length <= 5) {
                throw new GeneralSecurityException("signature too short");
            }
            byte[] copyOfRange = Arrays.copyOfRange(signature, 0, 5);
            byte[] copyOfRange2 = Arrays.copyOfRange(signature, 5, signature.length);
            for (PrimitiveSet.Entry<PublicKeyVerify> entry : this.primitives.getPrimitive(copyOfRange)) {
                try {
                    if (entry.getOutputPrefixType().equals(OutputPrefixType.LEGACY)) {
                        entry.getPrimitive().verify(copyOfRange2, Bytes.concat(data, new byte[]{0}));
                        return;
                    } else {
                        entry.getPrimitive().verify(copyOfRange2, data);
                        return;
                    }
                } catch (GeneralSecurityException e) {
                    Logger logger = PublicKeyVerifyWrapper.logger;
                    logger.info("signature prefix matches a key, but cannot verify: " + e.toString());
                }
            }
            for (PrimitiveSet.Entry<PublicKeyVerify> entry2 : this.primitives.getRawPrimitives()) {
                try {
                    entry2.getPrimitive().verify(signature, data);
                    return;
                } catch (GeneralSecurityException unused) {
                }
            }
            throw new GeneralSecurityException("invalid signature");
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.crypto.tink.PrimitiveWrapper
    public PublicKeyVerify wrap(final PrimitiveSet<PublicKeyVerify> primitives) {
        return new WrappedPublicKeyVerify(primitives);
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public Class<PublicKeyVerify> getPrimitiveClass() {
        return PublicKeyVerify.class;
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public Class<PublicKeyVerify> getInputPrimitiveClass() {
        return PublicKeyVerify.class;
    }

    public static void register() throws GeneralSecurityException {
        Registry.registerPrimitiveWrapper(new PublicKeyVerifyWrapper());
    }
}
