package com.google.crypto.tink.hybrid;

import com.google.crypto.tink.HybridEncrypt;
import com.google.crypto.tink.KeyTypeManager;
import com.google.crypto.tink.proto.EciesAeadHkdfParams;
import com.google.crypto.tink.proto.EciesAeadHkdfPublicKey;
import com.google.crypto.tink.proto.EciesHkdfKemParams;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.subtle.EciesAeadHkdfHybridEncrypt;
import com.google.crypto.tink.subtle.EllipticCurves;
import com.google.crypto.tink.subtle.Validators;
import java.security.GeneralSecurityException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public class EciesAeadHkdfPublicKeyManager extends KeyTypeManager<EciesAeadHkdfPublicKey> {
    @Override // com.google.crypto.tink.KeyTypeManager
    public String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey";
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public int getVersion() {
        return 0;
    }

    public EciesAeadHkdfPublicKeyManager() {
        super(EciesAeadHkdfPublicKey.class, new KeyTypeManager.PrimitiveFactory<HybridEncrypt, EciesAeadHkdfPublicKey>(HybridEncrypt.class) { // from class: com.google.crypto.tink.hybrid.EciesAeadHkdfPublicKeyManager.1
            @Override // com.google.crypto.tink.KeyTypeManager.PrimitiveFactory
            public HybridEncrypt getPrimitive(EciesAeadHkdfPublicKey recipientKeyProto) throws GeneralSecurityException {
                EciesAeadHkdfParams params = recipientKeyProto.getParams();
                EciesHkdfKemParams kemParams = params.getKemParams();
                return new EciesAeadHkdfHybridEncrypt(EllipticCurves.getEcPublicKey(HybridUtil.toCurveType(kemParams.getCurveType()), recipientKeyProto.getX().toByteArray(), recipientKeyProto.getY().toByteArray()), kemParams.getHkdfSalt().toByteArray(), HybridUtil.toHmacAlgo(kemParams.getHkdfHashType()), HybridUtil.toPointFormatType(params.getEcPointFormat()), new RegistryEciesAeadHkdfDemHelper(params.getDemParams().getAeadDem()));
            }
        });
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public KeyData.KeyMaterialType keyMaterialType() {
        return KeyData.KeyMaterialType.ASYMMETRIC_PUBLIC;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.crypto.tink.KeyTypeManager
    public EciesAeadHkdfPublicKey parseKey(ByteString byteString) throws InvalidProtocolBufferException {
        return EciesAeadHkdfPublicKey.parseFrom(byteString, ExtensionRegistryLite.getEmptyRegistry());
    }

    @Override // com.google.crypto.tink.KeyTypeManager
    public void validateKey(EciesAeadHkdfPublicKey key) throws GeneralSecurityException {
        Validators.validateVersion(key.getVersion(), getVersion());
        HybridUtil.validate(key.getParams());
    }
}
