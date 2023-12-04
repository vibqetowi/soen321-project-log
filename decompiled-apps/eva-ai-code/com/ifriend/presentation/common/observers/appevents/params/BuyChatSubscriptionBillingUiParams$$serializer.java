package com.ifriend.presentation.common.observers.appevents.params;

import com.ifriend.analytics.usecase.purchase.PurchaseSource;
import com.ifriend.presentation.extensions.UUIDSerializer;
import com.ifriend.presentation.features.purchases.billing.models.PurchaseReason;
import com.ifriend.presentation.features.purchases.common.model.UpgradeType;
import java.util.UUID;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
/* compiled from: AppUiParams.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"com/ifriend/presentation/common/observers/appevents/params/BuyChatSubscriptionBillingUiParams.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/ifriend/presentation/common/observers/appevents/params/BuyChatSubscriptionBillingUiParams;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* loaded from: classes6.dex */
public final class BuyChatSubscriptionBillingUiParams$$serializer implements GeneratedSerializer<BuyChatSubscriptionBillingUiParams> {
    public static final int $stable;
    public static final BuyChatSubscriptionBillingUiParams$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        BuyChatSubscriptionBillingUiParams$$serializer buyChatSubscriptionBillingUiParams$$serializer = new BuyChatSubscriptionBillingUiParams$$serializer();
        INSTANCE = buyChatSubscriptionBillingUiParams$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.ifriend.presentation.common.observers.appevents.params.BuyChatSubscriptionBillingUiParams", buyChatSubscriptionBillingUiParams$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement("requestId", true);
        pluginGeneratedSerialDescriptor.addElement("chatId", false);
        pluginGeneratedSerialDescriptor.addElement("goToBuyNeuronsAfterUpgrade", false);
        pluginGeneratedSerialDescriptor.addElement("upgradeType", false);
        pluginGeneratedSerialDescriptor.addElement("purchaseReason", false);
        pluginGeneratedSerialDescriptor.addElement("purchaseSource", true);
        descriptor = pluginGeneratedSerialDescriptor;
        $stable = 8;
    }

    private BuyChatSubscriptionBillingUiParams$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        kSerializerArr = BuyChatSubscriptionBillingUiParams.$childSerializers;
        return new KSerializer[]{UUIDSerializer.INSTANCE, StringSerializer.INSTANCE, BooleanSerializer.INSTANCE, kSerializerArr[3], kSerializerArr[4], kSerializerArr[5]};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public BuyChatSubscriptionBillingUiParams deserialize(Decoder decoder) {
        KSerializer[] kSerializerArr;
        PurchaseReason purchaseReason;
        PurchaseSource purchaseSource;
        boolean z;
        UpgradeType upgradeType;
        String str;
        UUID uuid;
        int i;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        kSerializerArr = BuyChatSubscriptionBillingUiParams.$childSerializers;
        int i2 = 2;
        if (beginStructure.decodeSequentially()) {
            String decodeStringElement = beginStructure.decodeStringElement(descriptor2, 1);
            boolean decodeBooleanElement = beginStructure.decodeBooleanElement(descriptor2, 2);
            purchaseSource = (PurchaseSource) beginStructure.decodeSerializableElement(descriptor2, 5, kSerializerArr[5], null);
            uuid = (UUID) beginStructure.decodeSerializableElement(descriptor2, 0, UUIDSerializer.INSTANCE, null);
            z = decodeBooleanElement;
            i = 63;
            upgradeType = (UpgradeType) beginStructure.decodeSerializableElement(descriptor2, 3, kSerializerArr[3], null);
            purchaseReason = (PurchaseReason) beginStructure.decodeSerializableElement(descriptor2, 4, kSerializerArr[4], null);
            str = decodeStringElement;
        } else {
            boolean z2 = true;
            boolean z3 = false;
            UUID uuid2 = null;
            String str2 = null;
            UpgradeType upgradeType2 = null;
            PurchaseReason purchaseReason2 = null;
            PurchaseSource purchaseSource2 = null;
            int i3 = 0;
            while (z2) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                switch (decodeElementIndex) {
                    case -1:
                        z2 = false;
                        i2 = 2;
                    case 0:
                        uuid2 = (UUID) beginStructure.decodeSerializableElement(descriptor2, 0, UUIDSerializer.INSTANCE, uuid2);
                        i3 |= 1;
                        i2 = 2;
                    case 1:
                        str2 = beginStructure.decodeStringElement(descriptor2, 1);
                        i3 |= 2;
                    case 2:
                        z3 = beginStructure.decodeBooleanElement(descriptor2, i2);
                        i3 |= 4;
                    case 3:
                        upgradeType2 = (UpgradeType) beginStructure.decodeSerializableElement(descriptor2, 3, kSerializerArr[3], upgradeType2);
                        i3 |= 8;
                    case 4:
                        purchaseReason2 = (PurchaseReason) beginStructure.decodeSerializableElement(descriptor2, 4, kSerializerArr[4], purchaseReason2);
                        i3 |= 16;
                    case 5:
                        purchaseSource2 = (PurchaseSource) beginStructure.decodeSerializableElement(descriptor2, 5, kSerializerArr[5], purchaseSource2);
                        i3 |= 32;
                    default:
                        throw new UnknownFieldException(decodeElementIndex);
                }
            }
            purchaseReason = purchaseReason2;
            purchaseSource = purchaseSource2;
            z = z3;
            upgradeType = upgradeType2;
            str = str2;
            uuid = uuid2;
            i = i3;
        }
        beginStructure.endStructure(descriptor2);
        return new BuyChatSubscriptionBillingUiParams(i, uuid, str, z, upgradeType, purchaseReason, purchaseSource, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, BuyChatSubscriptionBillingUiParams value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        BuyChatSubscriptionBillingUiParams.write$Self(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
