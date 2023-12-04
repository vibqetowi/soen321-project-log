package com.google.crypto.tink.mac;

import com.google.crypto.tink.Mac;
import com.google.crypto.tink.PrimitiveSet;
import com.google.crypto.tink.PrimitiveWrapper;
import com.google.crypto.tink.Registry;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.subtle.Bytes;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Logger;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public class MacWrapper implements PrimitiveWrapper<Mac, Mac> {
    private static final Logger logger = Logger.getLogger(MacWrapper.class.getName());

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes7.dex */
    public static class WrappedMac implements Mac {
        private final byte[] formatVersion;
        private final PrimitiveSet<Mac> primitives;

        private WrappedMac(PrimitiveSet<Mac> primitives) {
            this.formatVersion = new byte[]{0};
            this.primitives = primitives;
        }

        @Override // com.google.crypto.tink.Mac
        public byte[] computeMac(final byte[] data) throws GeneralSecurityException {
            if (this.primitives.getPrimary().getOutputPrefixType().equals(OutputPrefixType.LEGACY)) {
                return Bytes.concat(this.primitives.getPrimary().getIdentifier(), this.primitives.getPrimary().getPrimitive().computeMac(Bytes.concat(data, this.formatVersion)));
            }
            return Bytes.concat(this.primitives.getPrimary().getIdentifier(), this.primitives.getPrimary().getPrimitive().computeMac(data));
        }

        @Override // com.google.crypto.tink.Mac
        public void verifyMac(final byte[] mac, final byte[] data) throws GeneralSecurityException {
            if (mac.length <= 5) {
                throw new GeneralSecurityException("tag too short");
            }
            byte[] copyOf = Arrays.copyOf(mac, 5);
            byte[] copyOfRange = Arrays.copyOfRange(mac, 5, mac.length);
            for (PrimitiveSet.Entry<Mac> entry : this.primitives.getPrimitive(copyOf)) {
                try {
                    if (entry.getOutputPrefixType().equals(OutputPrefixType.LEGACY)) {
                        entry.getPrimitive().verifyMac(copyOfRange, Bytes.concat(data, this.formatVersion));
                        return;
                    } else {
                        entry.getPrimitive().verifyMac(copyOfRange, data);
                        return;
                    }
                } catch (GeneralSecurityException e) {
                    Logger logger = MacWrapper.logger;
                    logger.info("tag prefix matches a key, but cannot verify: " + e);
                }
            }
            for (PrimitiveSet.Entry<Mac> entry2 : this.primitives.getRawPrimitives()) {
                try {
                    entry2.getPrimitive().verifyMac(mac, data);
                    return;
                } catch (GeneralSecurityException unused) {
                }
            }
            throw new GeneralSecurityException("invalid MAC");
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.crypto.tink.PrimitiveWrapper
    public Mac wrap(final PrimitiveSet<Mac> primitives) throws GeneralSecurityException {
        return new WrappedMac(primitives);
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public Class<Mac> getPrimitiveClass() {
        return Mac.class;
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public Class<Mac> getInputPrimitiveClass() {
        return Mac.class;
    }

    public static void register() throws GeneralSecurityException {
        Registry.registerPrimitiveWrapper(new MacWrapper());
    }
}
