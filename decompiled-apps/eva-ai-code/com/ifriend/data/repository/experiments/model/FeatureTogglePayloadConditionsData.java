package com.ifriend.data.repository.experiments.model;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
/* compiled from: DataFeatureTogglePayload.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \"*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002!\"B+\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0010\b\u0001\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tB\u0017\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006¢\u0006\u0002\u0010\nJ\u0011\u0010\u000f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006HÆ\u0003J!\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J;\u0010\u0017\u001a\u00020\u0018\"\u0004\b\u0001\u0010\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u00190\u00002\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H\u00190 HÇ\u0001R$\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006#"}, d2 = {"Lcom/ifriend/data/repository/experiments/model/FeatureTogglePayloadConditionsData;", ExifInterface.GPS_DIRECTION_TRUE, "", "seen1", "", "payload", "Lcom/ifriend/data/repository/experiments/model/FeatureToggleConditionsData;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/ifriend/data/repository/experiments/model/FeatureToggleConditionsData;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lcom/ifriend/data/repository/experiments/model/FeatureToggleConditionsData;)V", "getPayload$annotations", "()V", "getPayload", "()Lcom/ifriend/data/repository/experiments/model/FeatureToggleConditionsData;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "T0", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "typeSerial0", "Lkotlinx/serialization/KSerializer;", "$serializer", "Companion", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
/* loaded from: classes6.dex */
public final class FeatureTogglePayloadConditionsData<T> {
    private static final SerialDescriptor $cachedDescriptor;
    public static final Companion Companion = new Companion(null);
    private final FeatureToggleConditionsData<T> payload;

    public FeatureTogglePayloadConditionsData() {
        this((FeatureToggleConditionsData) null, 1, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FeatureTogglePayloadConditionsData copy$default(FeatureTogglePayloadConditionsData featureTogglePayloadConditionsData, FeatureToggleConditionsData featureToggleConditionsData, int i, Object obj) {
        if ((i & 1) != 0) {
            featureToggleConditionsData = featureTogglePayloadConditionsData.payload;
        }
        return featureTogglePayloadConditionsData.copy(featureToggleConditionsData);
    }

    @SerialName("payload")
    public static /* synthetic */ void getPayload$annotations() {
    }

    public final FeatureToggleConditionsData<T> component1() {
        return this.payload;
    }

    public final FeatureTogglePayloadConditionsData<T> copy(FeatureToggleConditionsData<T> featureToggleConditionsData) {
        return new FeatureTogglePayloadConditionsData<>(featureToggleConditionsData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FeatureTogglePayloadConditionsData) && Intrinsics.areEqual(this.payload, ((FeatureTogglePayloadConditionsData) obj).payload);
    }

    public int hashCode() {
        FeatureToggleConditionsData<T> featureToggleConditionsData = this.payload;
        if (featureToggleConditionsData == null) {
            return 0;
        }
        return featureToggleConditionsData.hashCode();
    }

    public String toString() {
        FeatureToggleConditionsData<T> featureToggleConditionsData = this.payload;
        return "FeatureTogglePayloadConditionsData(payload=" + featureToggleConditionsData + ")";
    }

    /* compiled from: DataFeatureTogglePayload.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J)\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u00050\u0004\"\u0004\b\u0001\u0010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0004HÆ\u0001¨\u0006\b"}, d2 = {"Lcom/ifriend/data/repository/experiments/model/FeatureTogglePayloadConditionsData$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/ifriend/data/repository/experiments/model/FeatureTogglePayloadConditionsData;", "T0", "typeSerial0", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final <T0> KSerializer<FeatureTogglePayloadConditionsData<T0>> serializer(KSerializer<T0> typeSerial0) {
            Intrinsics.checkNotNullParameter(typeSerial0, "typeSerial0");
            return new FeatureTogglePayloadConditionsData$$serializer(typeSerial0);
        }
    }

    static {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.ifriend.data.repository.experiments.model.FeatureTogglePayloadConditionsData", null, 1);
        pluginGeneratedSerialDescriptor.addElement("payload", true);
        $cachedDescriptor = pluginGeneratedSerialDescriptor;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ FeatureTogglePayloadConditionsData(int i, @SerialName("payload") FeatureToggleConditionsData featureToggleConditionsData, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 0) != 0) {
            PluginExceptionsKt.throwMissingFieldException(i, 0, $cachedDescriptor);
        }
        if ((i & 1) == 0) {
            this.payload = null;
        } else {
            this.payload = featureToggleConditionsData;
        }
    }

    public FeatureTogglePayloadConditionsData(FeatureToggleConditionsData<T> featureToggleConditionsData) {
        this.payload = featureToggleConditionsData;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self(FeatureTogglePayloadConditionsData featureTogglePayloadConditionsData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor, KSerializer kSerializer) {
        boolean z = true;
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && featureTogglePayloadConditionsData.payload == null) {
            z = false;
        }
        if (z) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, FeatureToggleConditionsData.Companion.serializer(kSerializer), featureTogglePayloadConditionsData.payload);
        }
    }

    public /* synthetic */ FeatureTogglePayloadConditionsData(FeatureToggleConditionsData featureToggleConditionsData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : featureToggleConditionsData);
    }

    public final FeatureToggleConditionsData<T> getPayload() {
        return this.payload;
    }
}
