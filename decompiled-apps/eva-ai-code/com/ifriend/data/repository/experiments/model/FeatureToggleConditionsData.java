package com.ifriend.data.repository.experiments.model;

import androidx.exifinterface.media.ExifInterface;
import java.util.List;
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
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
/* compiled from: DataFeatureTogglePayload.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \"*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002!\"B+\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0010\b\u0001\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tB\u0017\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006¢\u0006\u0002\u0010\nJ\u0011\u0010\u000f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006HÆ\u0003J!\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J;\u0010\u0017\u001a\u00020\u0018\"\u0004\b\u0001\u0010\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u00190\u00002\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H\u00190 HÇ\u0001R$\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006#"}, d2 = {"Lcom/ifriend/data/repository/experiments/model/FeatureToggleConditionsData;", ExifInterface.GPS_DIRECTION_TRUE, "", "seen1", "", "conditions", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/util/List;)V", "getConditions$annotations", "()V", "getConditions", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "T0", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "typeSerial0", "Lkotlinx/serialization/KSerializer;", "$serializer", "Companion", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
/* loaded from: classes6.dex */
public final class FeatureToggleConditionsData<T> {
    private static final SerialDescriptor $cachedDescriptor;
    public static final Companion Companion = new Companion(null);
    private final List<T> conditions;

    public FeatureToggleConditionsData() {
        this((List) null, 1, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FeatureToggleConditionsData copy$default(FeatureToggleConditionsData featureToggleConditionsData, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = featureToggleConditionsData.conditions;
        }
        return featureToggleConditionsData.copy(list);
    }

    @SerialName("conditions")
    public static /* synthetic */ void getConditions$annotations() {
    }

    public final List<T> component1() {
        return this.conditions;
    }

    public final FeatureToggleConditionsData<T> copy(List<? extends T> list) {
        return new FeatureToggleConditionsData<>(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FeatureToggleConditionsData) && Intrinsics.areEqual(this.conditions, ((FeatureToggleConditionsData) obj).conditions);
    }

    public int hashCode() {
        List<T> list = this.conditions;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        List<T> list = this.conditions;
        return "FeatureToggleConditionsData(conditions=" + list + ")";
    }

    /* compiled from: DataFeatureTogglePayload.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J)\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u00050\u0004\"\u0004\b\u0001\u0010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0004HÆ\u0001¨\u0006\b"}, d2 = {"Lcom/ifriend/data/repository/experiments/model/FeatureToggleConditionsData$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/ifriend/data/repository/experiments/model/FeatureToggleConditionsData;", "T0", "typeSerial0", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final <T0> KSerializer<FeatureToggleConditionsData<T0>> serializer(KSerializer<T0> typeSerial0) {
            Intrinsics.checkNotNullParameter(typeSerial0, "typeSerial0");
            return new FeatureToggleConditionsData$$serializer(typeSerial0);
        }
    }

    static {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.ifriend.data.repository.experiments.model.FeatureToggleConditionsData", null, 1);
        pluginGeneratedSerialDescriptor.addElement("conditions", true);
        $cachedDescriptor = pluginGeneratedSerialDescriptor;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ FeatureToggleConditionsData(int i, @SerialName("conditions") List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 0) != 0) {
            PluginExceptionsKt.throwMissingFieldException(i, 0, $cachedDescriptor);
        }
        if ((i & 1) == 0) {
            this.conditions = null;
        } else {
            this.conditions = list;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FeatureToggleConditionsData(List<? extends T> list) {
        this.conditions = list;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self(FeatureToggleConditionsData featureToggleConditionsData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor, KSerializer kSerializer) {
        boolean z = true;
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && featureToggleConditionsData.conditions == null) {
            z = false;
        }
        if (z) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, new ArrayListSerializer(kSerializer), featureToggleConditionsData.conditions);
        }
    }

    public /* synthetic */ FeatureToggleConditionsData(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }

    public final List<T> getConditions() {
        return this.conditions;
    }
}
