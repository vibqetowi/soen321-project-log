package com.ifriend.presentation.features.purchases.billing.models;

import com.ifriend.presentation.features.chat.common.models.MessageIdsParams;
import com.ifriend.presentation.features.chat.common.models.MessageIdsParams$$serializer;
import com.ifriend.presentation.features.purchases.billing.models.PurchaseReason;
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
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/* compiled from: PurchaseReason.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tHÖ\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eHÖ\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"com/ifriend/presentation/features/purchases/billing/models/PurchaseReason.BuyMessage.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/ifriend/presentation/features/purchases/billing/models/PurchaseReason$BuyMessage;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* loaded from: classes6.dex */
public final class PurchaseReason$BuyMessage$$serializer implements GeneratedSerializer<PurchaseReason.BuyMessage> {
    public static final int $stable;
    public static final PurchaseReason$BuyMessage$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        PurchaseReason$BuyMessage$$serializer purchaseReason$BuyMessage$$serializer = new PurchaseReason$BuyMessage$$serializer();
        INSTANCE = purchaseReason$BuyMessage$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.ifriend.presentation.features.purchases.billing.models.PurchaseReason.BuyMessage", purchaseReason$BuyMessage$$serializer, 1);
        pluginGeneratedSerialDescriptor.addElement("messageIds", false);
        descriptor = pluginGeneratedSerialDescriptor;
        $stable = 8;
    }

    private PurchaseReason$BuyMessage$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{MessageIdsParams$$serializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public PurchaseReason.BuyMessage deserialize(Decoder decoder) {
        MessageIdsParams messageIdsParams;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        int i = 1;
        if (beginStructure.decodeSequentially()) {
            messageIdsParams = (MessageIdsParams) beginStructure.decodeSerializableElement(descriptor2, 0, MessageIdsParams$$serializer.INSTANCE, null);
        } else {
            int i2 = 0;
            messageIdsParams = null;
            while (i != 0) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                if (decodeElementIndex == -1) {
                    i = 0;
                } else if (decodeElementIndex != 0) {
                    throw new UnknownFieldException(decodeElementIndex);
                } else {
                    messageIdsParams = (MessageIdsParams) beginStructure.decodeSerializableElement(descriptor2, 0, MessageIdsParams$$serializer.INSTANCE, messageIdsParams);
                    i2 |= 1;
                }
            }
            i = i2;
        }
        beginStructure.endStructure(descriptor2);
        return new PurchaseReason.BuyMessage(i, messageIdsParams, null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, PurchaseReason.BuyMessage value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        beginStructure.encodeSerializableElement(descriptor2, 0, MessageIdsParams$$serializer.INSTANCE, value.messageIds);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
