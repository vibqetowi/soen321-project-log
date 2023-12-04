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
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 #*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\"#B%\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00018\u0000\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB\u0011\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\tJ\u0010\u0010\u000f\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0002\u0010\rJ \u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u0000HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J;\u0010\u0018\u001a\u00020\u0019\"\u0004\b\u0001\u0010\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u001a0\u00002\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\f\u0010 \u001a\b\u0012\u0004\u0012\u0002H\u001a0!HÇ\u0001R \u0010\u0005\u001a\u0004\u0018\u00018\u00008\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u000e\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006$"}, d2 = {"Lcom/ifriend/data/repository/experiments/model/FeatureTogglePayloadData;", ExifInterface.GPS_DIRECTION_TRUE, "", "seen1", "", "payload", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/Object;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/Object;)V", "getPayload$annotations", "()V", "getPayload", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lcom/ifriend/data/repository/experiments/model/FeatureTogglePayloadData;", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "T0", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "typeSerial0", "Lkotlinx/serialization/KSerializer;", "$serializer", "Companion", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
/* loaded from: classes6.dex */
public final class FeatureTogglePayloadData<T> {
    private static final SerialDescriptor $cachedDescriptor;
    public static final Companion Companion = new Companion(null);
    private final T payload;

    public FeatureTogglePayloadData() {
        this((Object) null, 1, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FeatureTogglePayloadData copy$default(FeatureTogglePayloadData featureTogglePayloadData, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = featureTogglePayloadData.payload;
        }
        return featureTogglePayloadData.copy(obj);
    }

    @SerialName("payload")
    public static /* synthetic */ void getPayload$annotations() {
    }

    public final T component1() {
        return this.payload;
    }

    public final FeatureTogglePayloadData<T> copy(T t) {
        return new FeatureTogglePayloadData<>(t);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FeatureTogglePayloadData) && Intrinsics.areEqual(this.payload, ((FeatureTogglePayloadData) obj).payload);
    }

    public int hashCode() {
        T t = this.payload;
        if (t == null) {
            return 0;
        }
        return t.hashCode();
    }

    public String toString() {
        T t = this.payload;
        return "FeatureTogglePayloadData(payload=" + t + ")";
    }

    /* compiled from: DataFeatureTogglePayload.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J)\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u00050\u0004\"\u0004\b\u0001\u0010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0004HÆ\u0001¨\u0006\b"}, d2 = {"Lcom/ifriend/data/repository/experiments/model/FeatureTogglePayloadData$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/ifriend/data/repository/experiments/model/FeatureTogglePayloadData;", "T0", "typeSerial0", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final <T0> KSerializer<FeatureTogglePayloadData<T0>> serializer(KSerializer<T0> typeSerial0) {
            Intrinsics.checkNotNullParameter(typeSerial0, "typeSerial0");
            return new FeatureTogglePayloadData$$serializer(typeSerial0);
        }
    }

    static {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.ifriend.data.repository.experiments.model.FeatureTogglePayloadData", null, 1);
        pluginGeneratedSerialDescriptor.addElement("payload", true);
        $cachedDescriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ FeatureTogglePayloadData(int i, @SerialName("payload") Object obj, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 0) != 0) {
            PluginExceptionsKt.throwMissingFieldException(i, 0, $cachedDescriptor);
        }
        if ((i & 1) == 0) {
            this.payload = null;
        } else {
            this.payload = obj;
        }
    }

    public FeatureTogglePayloadData(T t) {
        this.payload = t;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self(FeatureTogglePayloadData featureTogglePayloadData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor, KSerializer kSerializer) {
        boolean z = true;
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && featureTogglePayloadData.payload == null) {
            z = false;
        }
        if (z) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializer, featureTogglePayloadData.payload);
        }
    }

    public /* synthetic */ FeatureTogglePayloadData(Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : obj);
    }

    public final T getPayload() {
        return this.payload;
    }
}
