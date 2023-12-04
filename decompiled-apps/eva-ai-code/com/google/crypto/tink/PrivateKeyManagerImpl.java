package com.google.crypto.tink;

import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.MessageLite;
import java.security.GeneralSecurityException;
/* loaded from: classes7.dex */
public class PrivateKeyManagerImpl<PrimitiveT, KeyProtoT extends MessageLite, PublicKeyProtoT extends MessageLite> extends KeyManagerImpl<PrimitiveT, KeyProtoT> implements PrivateKeyManager<PrimitiveT> {
    private final PrivateKeyTypeManager<KeyProtoT, PublicKeyProtoT> privateKeyManager;
    private final KeyTypeManager<PublicKeyProtoT> publicKeyManager;

    public PrivateKeyManagerImpl(PrivateKeyTypeManager<KeyProtoT, PublicKeyProtoT> privateKeyManager, KeyTypeManager<PublicKeyProtoT> publicKeyManager, Class<PrimitiveT> primitiveClass) {
        super(privateKeyManager, primitiveClass);
        this.privateKeyManager = privateKeyManager;
        this.publicKeyManager = publicKeyManager;
    }

    @Override // com.google.crypto.tink.PrivateKeyManager
    public KeyData getPublicKeyData(ByteString serializedKey) throws GeneralSecurityException {
        try {
            KeyProtoT parseKey = this.privateKeyManager.parseKey(serializedKey);
            this.privateKeyManager.validateKey(parseKey);
            PublicKeyProtoT publicKey = this.privateKeyManager.getPublicKey(parseKey);
            this.publicKeyManager.validateKey(publicKey);
            return KeyData.newBuilder().setTypeUrl(this.publicKeyManager.getKeyType()).setValue(publicKey.toByteString()).setKeyMaterialType(this.publicKeyManager.keyMaterialType()).build();
        } catch (InvalidProtocolBufferException e) {
            throw new GeneralSecurityException("expected serialized proto of type ", e);
        }
    }
}
