package com.google.crypto.tink;

import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.MessageLite;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/* loaded from: classes7.dex */
public abstract class KeyTypeManager<KeyProtoT extends MessageLite> {
    private final Class<KeyProtoT> clazz;
    private final Map<Class<?>, PrimitiveFactory<?, KeyProtoT>> factories;
    private final Class<?> firstPrimitiveClass;

    public abstract String getKeyType();

    public abstract int getVersion();

    public abstract KeyData.KeyMaterialType keyMaterialType();

    public abstract KeyProtoT parseKey(ByteString byteString) throws InvalidProtocolBufferException;

    public abstract void validateKey(KeyProtoT keyProto) throws GeneralSecurityException;

    /* loaded from: classes7.dex */
    protected static abstract class PrimitiveFactory<PrimitiveT, KeyT> {
        private final Class<PrimitiveT> clazz;

        public abstract PrimitiveT getPrimitive(KeyT key) throws GeneralSecurityException;

        public PrimitiveFactory(Class<PrimitiveT> clazz) {
            this.clazz = clazz;
        }

        final Class<PrimitiveT> getPrimitiveClass() {
            return this.clazz;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @SafeVarargs
    public KeyTypeManager(Class<KeyProtoT> clazz, PrimitiveFactory<?, KeyProtoT>... factories) {
        this.clazz = clazz;
        HashMap hashMap = new HashMap();
        for (PrimitiveFactory<?, KeyProtoT> primitiveFactory : factories) {
            if (hashMap.containsKey(primitiveFactory.getPrimitiveClass())) {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + primitiveFactory.getPrimitiveClass().getCanonicalName());
            }
            hashMap.put(primitiveFactory.getPrimitiveClass(), primitiveFactory);
        }
        if (factories.length > 0) {
            this.firstPrimitiveClass = factories[0].getPrimitiveClass();
        } else {
            this.firstPrimitiveClass = Void.class;
        }
        this.factories = Collections.unmodifiableMap(hashMap);
    }

    public final Class<KeyProtoT> getKeyClass() {
        return this.clazz;
    }

    public final <P> P getPrimitive(KeyProtoT key, Class<P> primitiveClass) throws GeneralSecurityException {
        PrimitiveFactory<?, KeyProtoT> primitiveFactory = this.factories.get(primitiveClass);
        if (primitiveFactory == null) {
            throw new IllegalArgumentException("Requested primitive class " + primitiveClass.getCanonicalName() + " not supported.");
        }
        return (P) primitiveFactory.getPrimitive(key);
    }

    public final Set<Class<?>> supportedPrimitives() {
        return this.factories.keySet();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Class<?> firstSupportedPrimitiveClass() {
        return this.firstPrimitiveClass;
    }

    /* loaded from: classes7.dex */
    public static abstract class KeyFactory<KeyFormatProtoT extends MessageLite, KeyT> {
        private final Class<KeyFormatProtoT> clazz;

        public abstract KeyT createKey(KeyFormatProtoT keyFormat) throws GeneralSecurityException;

        public abstract KeyFormatProtoT parseKeyFormat(ByteString byteString) throws InvalidProtocolBufferException;

        public abstract void validateKeyFormat(KeyFormatProtoT keyFormatProto) throws GeneralSecurityException;

        public KeyFactory(Class<KeyFormatProtoT> clazz) {
            this.clazz = clazz;
        }

        public final Class<KeyFormatProtoT> getKeyFormatClass() {
            return this.clazz;
        }

        public KeyT deriveKey(KeyFormatProtoT keyFormat, InputStream pseudoRandomness) throws GeneralSecurityException {
            throw new GeneralSecurityException("deriveKey not implemented for key of type " + this.clazz.toString());
        }
    }

    public KeyFactory<?, KeyProtoT> keyFactory() {
        throw new UnsupportedOperationException("Creating keys is not supported.");
    }
}
