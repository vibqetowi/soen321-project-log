package com.google.crypto.tink.signature;

import com.google.crypto.tink.KeyTypeManager;
import com.google.crypto.tink.PublicKeyVerify;
import com.google.crypto.tink.proto.EcdsaPublicKey;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.subtle.EcdsaVerifyJce;
import com.google.crypto.tink.subtle.EllipticCurves;
import com.google.crypto.tink.subtle.Validators;
import java.security.GeneralSecurityException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public class EcdsaVerifyKeyManager extends KeyTypeManager<EcdsaPublicKey> {
    @Override // com.google.crypto.tink.KeyTypeManager
    public String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.EcdsaPublicKey";
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public int getVersion() {
        return 0;
    }

    public EcdsaVerifyKeyManager() {
        super(EcdsaPublicKey.class, new KeyTypeManager.PrimitiveFactory<PublicKeyVerify, EcdsaPublicKey>(PublicKeyVerify.class) { // from class: com.google.crypto.tink.signature.EcdsaVerifyKeyManager.1
            @Override // com.google.crypto.tink.KeyTypeManager.PrimitiveFactory
            public PublicKeyVerify getPrimitive(EcdsaPublicKey keyProto) throws GeneralSecurityException {
                return new EcdsaVerifyJce(EllipticCurves.getEcPublicKey(SigUtil.toCurveType(keyProto.getParams().getCurve()), keyProto.getX().toByteArray(), keyProto.getY().toByteArray()), SigUtil.toHashType(keyProto.getParams().getHashType()), SigUtil.toEcdsaEncoding(keyProto.getParams().getEncoding()));
            }
        });
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public KeyData.KeyMaterialType keyMaterialType() {
        return KeyData.KeyMaterialType.ASYMMETRIC_PUBLIC;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.crypto.tink.KeyTypeManager
    public EcdsaPublicKey parseKey(ByteString byteString) throws InvalidProtocolBufferException {
        return EcdsaPublicKey.parseFrom(byteString, ExtensionRegistryLite.getEmptyRegistry());
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public void validateKey(EcdsaPublicKey pubKey) throws GeneralSecurityException {
        Validators.validateVersion(pubKey.getVersion(), getVersion());
        SigUtil.validateEcdsaParams(pubKey.getParams());
    }
}
