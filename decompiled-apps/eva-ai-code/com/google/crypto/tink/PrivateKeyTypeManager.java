package com.google.crypto.tink;

import com.google.crypto.tink.KeyTypeManager;
import com.google.crypto.tink.shaded.protobuf.MessageLite;
import java.security.GeneralSecurityException;
/* loaded from: classes7.dex */
public abstract class PrivateKeyTypeManager<KeyProtoT extends MessageLite, PublicKeyProtoT extends MessageLite> extends KeyTypeManager<KeyProtoT> {
    private final Class<PublicKeyProtoT> publicKeyClazz;

    public abstract PublicKeyProtoT getPublicKey(KeyProtoT keyProto) throws GeneralSecurityException;

    /* JADX INFO: Access modifiers changed from: protected */
    @SafeVarargs
    public PrivateKeyTypeManager(Class<KeyProtoT> clazz, Class<PublicKeyProtoT> publicKeyClazz, KeyTypeManager.PrimitiveFactory<?, KeyProtoT>... factories) {
        super(clazz, factories);
        this.publicKeyClazz = publicKeyClazz;
    }

    public final Class<PublicKeyProtoT> getPublicKeyClass() {
        return this.publicKeyClazz;
    }
}
