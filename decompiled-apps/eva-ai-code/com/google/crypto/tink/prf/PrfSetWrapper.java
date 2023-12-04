package com.google.crypto.tink.prf;

import com.google.crypto.tink.PrimitiveSet;
import com.google.crypto.tink.PrimitiveWrapper;
import com.google.crypto.tink.Registry;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Immutable
/* loaded from: classes7.dex */
public class PrfSetWrapper implements PrimitiveWrapper<Prf, PrfSet> {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes7.dex */
    public static class WrappedPrfSet extends PrfSet {
        private final Map<Integer, Prf> keyIdToPrfMap;
        private final int primaryKeyId;

        private WrappedPrfSet(PrimitiveSet<Prf> primitives) throws GeneralSecurityException {
            if (primitives.getRawPrimitives().isEmpty()) {
                throw new GeneralSecurityException("No primitives provided.");
            }
            if (primitives.getPrimary() == null) {
                throw new GeneralSecurityException("Primary key not set.");
            }
            this.primaryKeyId = primitives.getPrimary().getKeyId();
            List<PrimitiveSet.Entry<Prf>> rawPrimitives = primitives.getRawPrimitives();
            HashMap hashMap = new HashMap();
            for (PrimitiveSet.Entry<Prf> entry : rawPrimitives) {
                if (!entry.getOutputPrefixType().equals(OutputPrefixType.RAW)) {
                    throw new GeneralSecurityException("Key " + entry.getKeyId() + " has non raw prefix type");
                }
                hashMap.put(Integer.valueOf(entry.getKeyId()), entry.getPrimitive());
            }
            this.keyIdToPrfMap = Collections.unmodifiableMap(hashMap);
        }

        @Override // com.google.crypto.tink.prf.PrfSet
        public int getPrimaryId() {
            return this.primaryKeyId;
        }

        @Override // com.google.crypto.tink.prf.PrfSet
        public Map<Integer, Prf> getPrfs() throws GeneralSecurityException {
            return this.keyIdToPrfMap;
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.crypto.tink.PrimitiveWrapper
    public PrfSet wrap(PrimitiveSet<Prf> set) throws GeneralSecurityException {
        return new WrappedPrfSet(set);
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public Class<PrfSet> getPrimitiveClass() {
        return PrfSet.class;
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public Class<Prf> getInputPrimitiveClass() {
        return Prf.class;
    }

    public static void register() throws GeneralSecurityException {
        Registry.registerPrimitiveWrapper(new PrfSetWrapper());
    }
}
