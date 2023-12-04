package com.google.crypto.tink;

import com.google.crypto.tink.KeyTypeManager;
import com.google.crypto.tink.PrimitiveSet;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.proto.KeyStatusType;
import com.google.crypto.tink.proto.Keyset;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.MessageLite;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;
/* loaded from: classes7.dex */
public final class Registry {
    private static final Logger logger = Logger.getLogger(Registry.class.getName());
    private static final ConcurrentMap<String, KeyManagerContainer> keyManagerMap = new ConcurrentHashMap();
    private static final ConcurrentMap<String, KeyDeriverContainer> keyDeriverMap = new ConcurrentHashMap();
    private static final ConcurrentMap<String, Boolean> newKeyAllowedMap = new ConcurrentHashMap();
    private static final ConcurrentMap<String, Catalogue<?>> catalogueMap = new ConcurrentHashMap();
    private static final ConcurrentMap<Class<?>, PrimitiveWrapper<?, ?>> primitiveWrapperMap = new ConcurrentHashMap();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes7.dex */
    public interface KeyDeriverContainer {
        KeyData deriveKey(ByteString serializedKeyFormat, InputStream stream) throws GeneralSecurityException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes7.dex */
    public interface KeyManagerContainer {
        Class<?> getImplementingClass();

        <P> KeyManager<P> getKeyManager(Class<P> primitiveClass) throws GeneralSecurityException;

        KeyManager<?> getUntypedKeyManager();

        MessageLite parseKey(ByteString serializedKey) throws GeneralSecurityException, InvalidProtocolBufferException;

        Class<?> publicKeyManagerClassOrNull();

        Set<Class<?>> supportedPrimitives();
    }

    private static <P> KeyManagerContainer createContainerFor(final KeyManager<P> keyManager) {
        return new KeyManagerContainer() { // from class: com.google.crypto.tink.Registry.1
            @Override // com.google.crypto.tink.Registry.KeyManagerContainer
            public MessageLite parseKey(ByteString serializedKey) throws GeneralSecurityException, InvalidProtocolBufferException {
                return null;
            }

            @Override // com.google.crypto.tink.Registry.KeyManagerContainer
            public Class<?> publicKeyManagerClassOrNull() {
                return null;
            }

            @Override // com.google.crypto.tink.Registry.KeyManagerContainer
            public <Q> KeyManager<Q> getKeyManager(Class<Q> primitiveClass) throws GeneralSecurityException {
                if (!KeyManager.this.getPrimitiveClass().equals(primitiveClass)) {
                    throw new InternalError("This should never be called, as we always first check supportedPrimitives.");
                }
                return KeyManager.this;
            }

            @Override // com.google.crypto.tink.Registry.KeyManagerContainer
            public KeyManager<?> getUntypedKeyManager() {
                return KeyManager.this;
            }

            @Override // com.google.crypto.tink.Registry.KeyManagerContainer
            public Class<?> getImplementingClass() {
                return KeyManager.this.getClass();
            }

            @Override // com.google.crypto.tink.Registry.KeyManagerContainer
            public Set<Class<?>> supportedPrimitives() {
                return Collections.singleton(KeyManager.this.getPrimitiveClass());
            }
        };
    }

    private static <KeyProtoT extends MessageLite> KeyManagerContainer createContainerFor(final KeyTypeManager<KeyProtoT> keyManager) {
        return new KeyManagerContainer() { // from class: com.google.crypto.tink.Registry.2
            @Override // com.google.crypto.tink.Registry.KeyManagerContainer
            public Class<?> publicKeyManagerClassOrNull() {
                return null;
            }

            @Override // com.google.crypto.tink.Registry.KeyManagerContainer
            public <Q> KeyManager<Q> getKeyManager(Class<Q> primitiveClass) throws GeneralSecurityException {
                try {
                    return new KeyManagerImpl(KeyTypeManager.this, primitiveClass);
                } catch (IllegalArgumentException e) {
                    throw new GeneralSecurityException("Primitive type not supported", e);
                }
            }

            @Override // com.google.crypto.tink.Registry.KeyManagerContainer
            public KeyManager<?> getUntypedKeyManager() {
                KeyTypeManager keyTypeManager = KeyTypeManager.this;
                return new KeyManagerImpl(keyTypeManager, keyTypeManager.firstSupportedPrimitiveClass());
            }

            @Override // com.google.crypto.tink.Registry.KeyManagerContainer
            public Class<?> getImplementingClass() {
                return KeyTypeManager.this.getClass();
            }

            @Override // com.google.crypto.tink.Registry.KeyManagerContainer
            public Set<Class<?>> supportedPrimitives() {
                return KeyTypeManager.this.supportedPrimitives();
            }

            @Override // com.google.crypto.tink.Registry.KeyManagerContainer
            public MessageLite parseKey(ByteString serializedKey) throws GeneralSecurityException, InvalidProtocolBufferException {
                MessageLite parseKey = KeyTypeManager.this.parseKey(serializedKey);
                KeyTypeManager.this.validateKey(parseKey);
                return parseKey;
            }
        };
    }

    private static <KeyProtoT extends MessageLite, PublicKeyProtoT extends MessageLite> KeyManagerContainer createPrivateKeyContainerFor(final PrivateKeyTypeManager<KeyProtoT, PublicKeyProtoT> privateKeyTypeManager, final KeyTypeManager<PublicKeyProtoT> publicKeyTypeManager) {
        return new KeyManagerContainer() { // from class: com.google.crypto.tink.Registry.3
            @Override // com.google.crypto.tink.Registry.KeyManagerContainer
            public <Q> KeyManager<Q> getKeyManager(Class<Q> primitiveClass) throws GeneralSecurityException {
                try {
                    return new PrivateKeyManagerImpl(PrivateKeyTypeManager.this, publicKeyTypeManager, primitiveClass);
                } catch (IllegalArgumentException e) {
                    throw new GeneralSecurityException("Primitive type not supported", e);
                }
            }

            @Override // com.google.crypto.tink.Registry.KeyManagerContainer
            public KeyManager<?> getUntypedKeyManager() {
                PrivateKeyTypeManager privateKeyTypeManager2 = PrivateKeyTypeManager.this;
                return new PrivateKeyManagerImpl(privateKeyTypeManager2, publicKeyTypeManager, privateKeyTypeManager2.firstSupportedPrimitiveClass());
            }

            @Override // com.google.crypto.tink.Registry.KeyManagerContainer
            public Class<?> getImplementingClass() {
                return PrivateKeyTypeManager.this.getClass();
            }

            @Override // com.google.crypto.tink.Registry.KeyManagerContainer
            public Set<Class<?>> supportedPrimitives() {
                return PrivateKeyTypeManager.this.supportedPrimitives();
            }

            @Override // com.google.crypto.tink.Registry.KeyManagerContainer
            public Class<?> publicKeyManagerClassOrNull() {
                return publicKeyTypeManager.getClass();
            }

            /* JADX WARN: Type inference failed for: r2v1, types: [com.google.crypto.tink.shaded.protobuf.MessageLite] */
            @Override // com.google.crypto.tink.Registry.KeyManagerContainer
            public MessageLite parseKey(ByteString serializedKey) throws GeneralSecurityException, InvalidProtocolBufferException {
                ?? parseKey = PrivateKeyTypeManager.this.parseKey(serializedKey);
                PrivateKeyTypeManager.this.validateKey(parseKey);
                return parseKey;
            }
        };
    }

    private static <KeyProtoT extends MessageLite> KeyDeriverContainer createDeriverFor(final KeyTypeManager<KeyProtoT> keyManager) {
        return new KeyDeriverContainer() { // from class: com.google.crypto.tink.Registry.4
            /* JADX WARN: Unknown type variable: KeyProtoT in type: com.google.crypto.tink.KeyTypeManager$KeyFactory<KeyFormatProtoT extends com.google.crypto.tink.shaded.protobuf.MessageLite, KeyProtoT> */
            private <KeyFormatProtoT extends MessageLite> MessageLite deriveKeyWithFactory(ByteString serializedKeyFormat, InputStream stream, KeyTypeManager.KeyFactory<KeyFormatProtoT, KeyProtoT> keyFactory) throws GeneralSecurityException {
                try {
                    KeyFormatProtoT parseKeyFormat = keyFactory.parseKeyFormat(serializedKeyFormat);
                    keyFactory.validateKeyFormat(parseKeyFormat);
                    return (MessageLite) keyFactory.deriveKey(parseKeyFormat, stream);
                } catch (InvalidProtocolBufferException e) {
                    throw new GeneralSecurityException("parsing key format failed in deriveKey", e);
                }
            }

            @Override // com.google.crypto.tink.Registry.KeyDeriverContainer
            public KeyData deriveKey(ByteString serializedKeyFormat, InputStream stream) throws GeneralSecurityException {
                return KeyData.newBuilder().setTypeUrl(KeyTypeManager.this.getKeyType()).setValue(deriveKeyWithFactory(serializedKeyFormat, stream, KeyTypeManager.this.keyFactory()).toByteString()).setKeyMaterialType(KeyTypeManager.this.keyMaterialType()).build();
            }
        };
    }

    private static synchronized KeyManagerContainer getKeyManagerContainerOrThrow(String typeUrl) throws GeneralSecurityException {
        KeyManagerContainer keyManagerContainer;
        synchronized (Registry.class) {
            ConcurrentMap<String, KeyManagerContainer> concurrentMap = keyManagerMap;
            if (!concurrentMap.containsKey(typeUrl)) {
                throw new GeneralSecurityException("No key manager found for key type " + typeUrl);
            }
            keyManagerContainer = concurrentMap.get(typeUrl);
        }
        return keyManagerContainer;
    }

    static synchronized void reset() {
        synchronized (Registry.class) {
            keyManagerMap.clear();
            keyDeriverMap.clear();
            newKeyAllowedMap.clear();
            catalogueMap.clear();
            primitiveWrapperMap.clear();
        }
    }

    @Deprecated
    public static synchronized void addCatalogue(String catalogueName, Catalogue<?> catalogue) throws GeneralSecurityException {
        synchronized (Registry.class) {
            if (catalogueName == null) {
                throw new IllegalArgumentException("catalogueName must be non-null.");
            }
            if (catalogue == null) {
                throw new IllegalArgumentException("catalogue must be non-null.");
            }
            ConcurrentMap<String, Catalogue<?>> concurrentMap = catalogueMap;
            if (concurrentMap.containsKey(catalogueName.toLowerCase(Locale.US)) && !catalogue.getClass().equals(concurrentMap.get(catalogueName.toLowerCase(Locale.US)).getClass())) {
                Logger logger2 = logger;
                logger2.warning("Attempted overwrite of a catalogueName catalogue for name " + catalogueName);
                throw new GeneralSecurityException("catalogue for name " + catalogueName + " has been already registered");
            }
            concurrentMap.put(catalogueName.toLowerCase(Locale.US), catalogue);
        }
    }

    @Deprecated
    public static Catalogue<?> getCatalogue(String catalogueName) throws GeneralSecurityException {
        if (catalogueName == null) {
            throw new IllegalArgumentException("catalogueName must be non-null.");
        }
        Catalogue<?> catalogue = catalogueMap.get(catalogueName.toLowerCase(Locale.US));
        if (catalogue == null) {
            String format = String.format("no catalogue found for %s. ", catalogueName);
            if (catalogueName.toLowerCase(Locale.US).startsWith("tinkaead")) {
                format = format + "Maybe call AeadConfig.register().";
            }
            if (catalogueName.toLowerCase(Locale.US).startsWith("tinkdeterministicaead")) {
                format = format + "Maybe call DeterministicAeadConfig.register().";
            } else if (catalogueName.toLowerCase(Locale.US).startsWith("tinkstreamingaead")) {
                format = format + "Maybe call StreamingAeadConfig.register().";
            } else if (catalogueName.toLowerCase(Locale.US).startsWith("tinkhybriddecrypt") || catalogueName.toLowerCase(Locale.US).startsWith("tinkhybridencrypt")) {
                format = format + "Maybe call HybridConfig.register().";
            } else if (catalogueName.toLowerCase(Locale.US).startsWith("tinkmac")) {
                format = format + "Maybe call MacConfig.register().";
            } else if (catalogueName.toLowerCase(Locale.US).startsWith("tinkpublickeysign") || catalogueName.toLowerCase(Locale.US).startsWith("tinkpublickeyverify")) {
                format = format + "Maybe call SignatureConfig.register().";
            } else if (catalogueName.toLowerCase(Locale.US).startsWith("tink")) {
                format = format + "Maybe call TinkConfig.register().";
            }
            throw new GeneralSecurityException(format);
        }
        return catalogue;
    }

    private static <T> T checkNotNull(T reference) {
        reference.getClass();
        return reference;
    }

    public static synchronized <P> void registerKeyManager(final KeyManager<P> manager) throws GeneralSecurityException {
        synchronized (Registry.class) {
            registerKeyManager((KeyManager) manager, true);
        }
    }

    private static synchronized void ensureKeyManagerInsertable(String typeUrl, Class<?> implementingClass, boolean newKeyAllowed) throws GeneralSecurityException {
        synchronized (Registry.class) {
            ConcurrentMap<String, KeyManagerContainer> concurrentMap = keyManagerMap;
            if (concurrentMap.containsKey(typeUrl)) {
                KeyManagerContainer keyManagerContainer = concurrentMap.get(typeUrl);
                if (!keyManagerContainer.getImplementingClass().equals(implementingClass)) {
                    Logger logger2 = logger;
                    logger2.warning("Attempted overwrite of a registered key manager for key type " + typeUrl);
                    throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", typeUrl, keyManagerContainer.getImplementingClass().getName(), implementingClass.getName()));
                }
                if (newKeyAllowed && !newKeyAllowedMap.get(typeUrl).booleanValue()) {
                    throw new GeneralSecurityException("New keys are already disallowed for key type " + typeUrl);
                }
            }
        }
    }

    public static synchronized <P> void registerKeyManager(final KeyManager<P> manager, boolean newKeyAllowed) throws GeneralSecurityException {
        synchronized (Registry.class) {
            if (manager == null) {
                throw new IllegalArgumentException("key manager must be non-null.");
            }
            String keyType = manager.getKeyType();
            ensureKeyManagerInsertable(keyType, manager.getClass(), newKeyAllowed);
            keyManagerMap.putIfAbsent(keyType, createContainerFor(manager));
            newKeyAllowedMap.put(keyType, Boolean.valueOf(newKeyAllowed));
        }
    }

    public static synchronized <KeyProtoT extends MessageLite> void registerKeyManager(final KeyTypeManager<KeyProtoT> manager, boolean newKeyAllowed) throws GeneralSecurityException {
        synchronized (Registry.class) {
            if (manager == null) {
                throw new IllegalArgumentException("key manager must be non-null.");
            }
            String keyType = manager.getKeyType();
            ensureKeyManagerInsertable(keyType, manager.getClass(), newKeyAllowed);
            ConcurrentMap<String, KeyManagerContainer> concurrentMap = keyManagerMap;
            if (!concurrentMap.containsKey(keyType)) {
                concurrentMap.put(keyType, createContainerFor(manager));
                keyDeriverMap.put(keyType, createDeriverFor(manager));
            }
            newKeyAllowedMap.put(keyType, Boolean.valueOf(newKeyAllowed));
        }
    }

    public static synchronized <KeyProtoT extends MessageLite, PublicKeyProtoT extends MessageLite> void registerAsymmetricKeyManagers(final PrivateKeyTypeManager<KeyProtoT, PublicKeyProtoT> privateKeyTypeManager, final KeyTypeManager<PublicKeyProtoT> publicKeyTypeManager, boolean newKeyAllowed) throws GeneralSecurityException {
        Class<?> publicKeyManagerClassOrNull;
        synchronized (Registry.class) {
            if (privateKeyTypeManager == null || publicKeyTypeManager == null) {
                throw new IllegalArgumentException("given key managers must be non-null.");
            }
            String keyType = privateKeyTypeManager.getKeyType();
            String keyType2 = publicKeyTypeManager.getKeyType();
            ensureKeyManagerInsertable(keyType, privateKeyTypeManager.getClass(), newKeyAllowed);
            ensureKeyManagerInsertable(keyType2, publicKeyTypeManager.getClass(), false);
            if (keyType.equals(keyType2)) {
                throw new GeneralSecurityException("Private and public key type must be different.");
            }
            ConcurrentMap<String, KeyManagerContainer> concurrentMap = keyManagerMap;
            if (concurrentMap.containsKey(keyType) && (publicKeyManagerClassOrNull = concurrentMap.get(keyType).publicKeyManagerClassOrNull()) != null && !publicKeyManagerClassOrNull.equals(publicKeyTypeManager.getClass())) {
                Logger logger2 = logger;
                logger2.warning("Attempted overwrite of a registered key manager for key type " + keyType + " with inconsistent public key type " + keyType2);
                throw new GeneralSecurityException(String.format("public key manager corresponding to %s is already registered with %s, cannot be re-registered with %s", privateKeyTypeManager.getClass().getName(), publicKeyManagerClassOrNull.getName(), publicKeyTypeManager.getClass().getName()));
            }
            if (!concurrentMap.containsKey(keyType) || concurrentMap.get(keyType).publicKeyManagerClassOrNull() == null) {
                concurrentMap.put(keyType, createPrivateKeyContainerFor(privateKeyTypeManager, publicKeyTypeManager));
                keyDeriverMap.put(keyType, createDeriverFor(privateKeyTypeManager));
            }
            ConcurrentMap<String, Boolean> concurrentMap2 = newKeyAllowedMap;
            concurrentMap2.put(keyType, Boolean.valueOf(newKeyAllowed));
            if (!concurrentMap.containsKey(keyType2)) {
                concurrentMap.put(keyType2, createContainerFor(publicKeyTypeManager));
            }
            concurrentMap2.put(keyType2, false);
        }
    }

    @Deprecated
    public static synchronized <P> void registerKeyManager(String typeUrl, final KeyManager<P> manager) throws GeneralSecurityException {
        synchronized (Registry.class) {
            registerKeyManager(typeUrl, manager, true);
        }
    }

    @Deprecated
    public static synchronized <P> void registerKeyManager(String typeUrl, final KeyManager<P> manager, boolean newKeyAllowed) throws GeneralSecurityException {
        synchronized (Registry.class) {
            try {
                if (manager == null) {
                    throw new IllegalArgumentException("key manager must be non-null.");
                }
                if (!typeUrl.equals(manager.getKeyType())) {
                    throw new GeneralSecurityException("Manager does not support key type " + typeUrl + ".");
                }
                registerKeyManager(manager, newKeyAllowed);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized <B, P> void registerPrimitiveWrapper(final PrimitiveWrapper<B, P> wrapper) throws GeneralSecurityException {
        synchronized (Registry.class) {
            if (wrapper == null) {
                throw new IllegalArgumentException("wrapper must be non-null");
            }
            Class<P> primitiveClass = wrapper.getPrimitiveClass();
            ConcurrentMap<Class<?>, PrimitiveWrapper<?, ?>> concurrentMap = primitiveWrapperMap;
            if (concurrentMap.containsKey(primitiveClass)) {
                PrimitiveWrapper<?, ?> primitiveWrapper = concurrentMap.get(primitiveClass);
                if (!wrapper.getClass().equals(primitiveWrapper.getClass())) {
                    Logger logger2 = logger;
                    logger2.warning("Attempted overwrite of a registered SetWrapper for type " + primitiveClass);
                    throw new GeneralSecurityException(String.format("SetWrapper for primitive (%s) is already registered to be %s, cannot be re-registered with %s", primitiveClass.getName(), primitiveWrapper.getClass().getName(), wrapper.getClass().getName()));
                }
            }
            concurrentMap.put(primitiveClass, wrapper);
        }
    }

    @Deprecated
    public static <P> KeyManager<P> getKeyManager(String typeUrl) throws GeneralSecurityException {
        return getKeyManagerInternal(typeUrl, null);
    }

    public static KeyManager<?> getUntypedKeyManager(String typeUrl) throws GeneralSecurityException {
        return getKeyManagerContainerOrThrow(typeUrl).getUntypedKeyManager();
    }

    public static <P> KeyManager<P> getKeyManager(String typeUrl, Class<P> primitiveClass) throws GeneralSecurityException {
        return getKeyManagerInternal(typeUrl, (Class) checkNotNull(primitiveClass));
    }

    private static String toCommaSeparatedString(Set<Class<?>> setOfClasses) {
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Class<?> cls : setOfClasses) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(cls.getCanonicalName());
            z = false;
        }
        return sb.toString();
    }

    private static <P> KeyManager<P> getKeyManagerInternal(String typeUrl, Class<P> primitiveClass) throws GeneralSecurityException {
        KeyManagerContainer keyManagerContainerOrThrow = getKeyManagerContainerOrThrow(typeUrl);
        if (primitiveClass == null) {
            return (KeyManager<P>) keyManagerContainerOrThrow.getUntypedKeyManager();
        }
        if (keyManagerContainerOrThrow.supportedPrimitives().contains(primitiveClass)) {
            return keyManagerContainerOrThrow.getKeyManager(primitiveClass);
        }
        throw new GeneralSecurityException("Primitive type " + primitiveClass.getName() + " not supported by key manager of type " + keyManagerContainerOrThrow.getImplementingClass() + ", supported primitives: " + toCommaSeparatedString(keyManagerContainerOrThrow.supportedPrimitives()));
    }

    public static synchronized KeyData newKeyData(com.google.crypto.tink.proto.KeyTemplate keyTemplate) throws GeneralSecurityException {
        KeyData newKeyData;
        synchronized (Registry.class) {
            KeyManager<?> untypedKeyManager = getUntypedKeyManager(keyTemplate.getTypeUrl());
            if (newKeyAllowedMap.get(keyTemplate.getTypeUrl()).booleanValue()) {
                newKeyData = untypedKeyManager.newKeyData(keyTemplate.getValue());
            } else {
                throw new GeneralSecurityException("newKey-operation not permitted for key type " + keyTemplate.getTypeUrl());
            }
        }
        return newKeyData;
    }

    public static synchronized KeyData newKeyData(KeyTemplate keyTemplate) throws GeneralSecurityException {
        KeyData newKeyData;
        synchronized (Registry.class) {
            newKeyData = newKeyData(keyTemplate.getProto());
        }
        return newKeyData;
    }

    public static synchronized MessageLite newKey(com.google.crypto.tink.proto.KeyTemplate keyTemplate) throws GeneralSecurityException {
        MessageLite newKey;
        synchronized (Registry.class) {
            KeyManager<?> untypedKeyManager = getUntypedKeyManager(keyTemplate.getTypeUrl());
            if (newKeyAllowedMap.get(keyTemplate.getTypeUrl()).booleanValue()) {
                newKey = untypedKeyManager.newKey(keyTemplate.getValue());
            } else {
                throw new GeneralSecurityException("newKey-operation not permitted for key type " + keyTemplate.getTypeUrl());
            }
        }
        return newKey;
    }

    public static synchronized MessageLite newKey(String typeUrl, MessageLite format) throws GeneralSecurityException {
        MessageLite newKey;
        synchronized (Registry.class) {
            KeyManager keyManager = getKeyManager(typeUrl);
            if (newKeyAllowedMap.get(typeUrl).booleanValue()) {
                newKey = keyManager.newKey(format);
            } else {
                throw new GeneralSecurityException("newKey-operation not permitted for key type " + typeUrl);
            }
        }
        return newKey;
    }

    static synchronized KeyData deriveKey(com.google.crypto.tink.proto.KeyTemplate keyTemplate, InputStream randomStream) throws GeneralSecurityException {
        KeyData deriveKey;
        synchronized (Registry.class) {
            String typeUrl = keyTemplate.getTypeUrl();
            ConcurrentMap<String, KeyDeriverContainer> concurrentMap = keyDeriverMap;
            if (!concurrentMap.containsKey(typeUrl)) {
                throw new GeneralSecurityException("No keymanager registered or key manager cannot derive keys for " + typeUrl);
            }
            deriveKey = concurrentMap.get(typeUrl).deriveKey(keyTemplate.getValue(), randomStream);
        }
        return deriveKey;
    }

    public static KeyData getPublicKeyData(String typeUrl, ByteString serializedPrivateKey) throws GeneralSecurityException {
        KeyManager keyManager = getKeyManager(typeUrl);
        if (!(keyManager instanceof PrivateKeyManager)) {
            throw new GeneralSecurityException("manager for key type " + typeUrl + " is not a PrivateKeyManager");
        }
        return ((PrivateKeyManager) keyManager).getPublicKeyData(serializedPrivateKey);
    }

    @Deprecated
    public static <P> P getPrimitive(String typeUrl, MessageLite key) throws GeneralSecurityException {
        return (P) getPrimitiveInternal(typeUrl, key, (Class<Object>) null);
    }

    public static <P> P getPrimitive(String typeUrl, MessageLite key, Class<P> primitiveClass) throws GeneralSecurityException {
        return (P) getPrimitiveInternal(typeUrl, key, (Class) checkNotNull(primitiveClass));
    }

    private static <P> P getPrimitiveInternal(String typeUrl, MessageLite key, Class<P> primitiveClass) throws GeneralSecurityException {
        return (P) getKeyManagerInternal(typeUrl, primitiveClass).getPrimitive(key);
    }

    @Deprecated
    public static <P> P getPrimitive(String typeUrl, ByteString serializedKey) throws GeneralSecurityException {
        return (P) getPrimitiveInternal(typeUrl, serializedKey, (Class<Object>) null);
    }

    public static <P> P getPrimitive(String typeUrl, ByteString serializedKey, Class<P> primitiveClass) throws GeneralSecurityException {
        return (P) getPrimitiveInternal(typeUrl, serializedKey, (Class) checkNotNull(primitiveClass));
    }

    private static <P> P getPrimitiveInternal(String typeUrl, ByteString serializedKey, Class<P> primitiveClass) throws GeneralSecurityException {
        return (P) getKeyManagerInternal(typeUrl, primitiveClass).getPrimitive(serializedKey);
    }

    @Deprecated
    public static <P> P getPrimitive(String typeUrl, byte[] serializedKey) throws GeneralSecurityException {
        return (P) getPrimitive(typeUrl, ByteString.copyFrom(serializedKey));
    }

    public static <P> P getPrimitive(String typeUrl, byte[] serializedKey, Class<P> primitiveClass) throws GeneralSecurityException {
        return (P) getPrimitive(typeUrl, ByteString.copyFrom(serializedKey), primitiveClass);
    }

    @Deprecated
    public static <P> P getPrimitive(KeyData keyData) throws GeneralSecurityException {
        return (P) getPrimitive(keyData.getTypeUrl(), keyData.getValue());
    }

    public static <P> P getPrimitive(KeyData keyData, Class<P> primitiveClass) throws GeneralSecurityException {
        return (P) getPrimitive(keyData.getTypeUrl(), keyData.getValue(), primitiveClass);
    }

    public static <P> PrimitiveSet<P> getPrimitives(KeysetHandle keysetHandle, Class<P> primitiveClass) throws GeneralSecurityException {
        return getPrimitives(keysetHandle, null, primitiveClass);
    }

    public static <P> PrimitiveSet<P> getPrimitives(KeysetHandle keysetHandle, final KeyManager<P> customManager, Class<P> primitiveClass) throws GeneralSecurityException {
        return getPrimitivesInternal(keysetHandle, customManager, (Class) checkNotNull(primitiveClass));
    }

    private static <P> PrimitiveSet<P> getPrimitivesInternal(KeysetHandle keysetHandle, final KeyManager<P> customManager, Class<P> primitiveClass) throws GeneralSecurityException {
        P p;
        Util.validateKeyset(keysetHandle.getKeyset());
        PrimitiveSet<P> newPrimitiveSet = PrimitiveSet.newPrimitiveSet(primitiveClass);
        for (Keyset.Key key : keysetHandle.getKeyset().getKeyList()) {
            if (key.getStatus() == KeyStatusType.ENABLED) {
                if (customManager != null && customManager.doesSupport(key.getKeyData().getTypeUrl())) {
                    p = customManager.getPrimitive(key.getKeyData().getValue());
                } else {
                    p = (P) getPrimitiveInternal(key.getKeyData().getTypeUrl(), key.getKeyData().getValue(), primitiveClass);
                }
                PrimitiveSet.Entry<P> addPrimitive = newPrimitiveSet.addPrimitive(p, key);
                if (key.getKeyId() == keysetHandle.getKeyset().getPrimaryKeyId()) {
                    newPrimitiveSet.setPrimary(addPrimitive);
                }
            }
        }
        return newPrimitiveSet;
    }

    public static <B, P> P wrap(PrimitiveSet<B> primitiveSet, Class<P> clazz) throws GeneralSecurityException {
        PrimitiveWrapper<?, ?> primitiveWrapper = primitiveWrapperMap.get(clazz);
        if (primitiveWrapper == null) {
            throw new GeneralSecurityException("No wrapper found for " + primitiveSet.getPrimitiveClass().getName());
        } else if (!primitiveWrapper.getInputPrimitiveClass().equals(primitiveSet.getPrimitiveClass())) {
            throw new GeneralSecurityException("Wrong input primitive class, expected " + primitiveWrapper.getInputPrimitiveClass() + ", got " + primitiveSet.getPrimitiveClass());
        } else {
            return (P) primitiveWrapper.wrap(primitiveSet);
        }
    }

    public static <P> P wrap(PrimitiveSet<P> primitiveSet) throws GeneralSecurityException {
        return (P) wrap(primitiveSet, primitiveSet.getPrimitiveClass());
    }

    public static Class<?> getInputPrimitive(Class<?> wrappedPrimitive) {
        PrimitiveWrapper<?, ?> primitiveWrapper = primitiveWrapperMap.get(wrappedPrimitive);
        if (primitiveWrapper == null) {
            return null;
        }
        return primitiveWrapper.getInputPrimitiveClass();
    }

    static MessageLite parseKeyData(KeyData keyData) throws GeneralSecurityException, InvalidProtocolBufferException {
        return getKeyManagerContainerOrThrow(keyData.getTypeUrl()).parseKey(keyData.getValue());
    }

    private Registry() {
    }
}
