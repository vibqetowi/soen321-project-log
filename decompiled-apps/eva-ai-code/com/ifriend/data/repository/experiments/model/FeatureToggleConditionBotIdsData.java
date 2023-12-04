package com.ifriend.data.repository.experiments.model;

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
import kotlinx.serialization.internal.SerializationConstructorMarker;
/* compiled from: DataFeatureTogglePayload.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001d\u001eB%\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB\u0011\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\tJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0015\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J!\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cHÇ\u0001R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u001f"}, d2 = {"Lcom/ifriend/data/repository/experiments/model/FeatureToggleConditionBotIdsData;", "", "seen1", "", "chatIdsCondition", "Lcom/ifriend/data/repository/experiments/model/FeatureToggleBotIdsData;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/ifriend/data/repository/experiments/model/FeatureToggleBotIdsData;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lcom/ifriend/data/repository/experiments/model/FeatureToggleBotIdsData;)V", "getChatIdsCondition$annotations", "()V", "getChatIdsCondition", "()Lcom/ifriend/data/repository/experiments/model/FeatureToggleBotIdsData;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
/* loaded from: classes6.dex */
public final class FeatureToggleConditionBotIdsData {
    public static final Companion Companion = new Companion(null);
    private final FeatureToggleBotIdsData chatIdsCondition;

    public FeatureToggleConditionBotIdsData() {
        this((FeatureToggleBotIdsData) null, 1, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ FeatureToggleConditionBotIdsData copy$default(FeatureToggleConditionBotIdsData featureToggleConditionBotIdsData, FeatureToggleBotIdsData featureToggleBotIdsData, int i, Object obj) {
        if ((i & 1) != 0) {
            featureToggleBotIdsData = featureToggleConditionBotIdsData.chatIdsCondition;
        }
        return featureToggleConditionBotIdsData.copy(featureToggleBotIdsData);
    }

    @SerialName("botUIDs")
    public static /* synthetic */ void getChatIdsCondition$annotations() {
    }

    public final FeatureToggleBotIdsData component1() {
        return this.chatIdsCondition;
    }

    public final FeatureToggleConditionBotIdsData copy(FeatureToggleBotIdsData featureToggleBotIdsData) {
        return new FeatureToggleConditionBotIdsData(featureToggleBotIdsData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FeatureToggleConditionBotIdsData) && Intrinsics.areEqual(this.chatIdsCondition, ((FeatureToggleConditionBotIdsData) obj).chatIdsCondition);
    }

    public int hashCode() {
        FeatureToggleBotIdsData featureToggleBotIdsData = this.chatIdsCondition;
        if (featureToggleBotIdsData == null) {
            return 0;
        }
        return featureToggleBotIdsData.hashCode();
    }

    public String toString() {
        FeatureToggleBotIdsData featureToggleBotIdsData = this.chatIdsCondition;
        return "FeatureToggleConditionBotIdsData(chatIdsCondition=" + featureToggleBotIdsData + ")";
    }

    /* compiled from: DataFeatureTogglePayload.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/ifriend/data/repository/experiments/model/FeatureToggleConditionBotIdsData$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/ifriend/data/repository/experiments/model/FeatureToggleConditionBotIdsData;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<FeatureToggleConditionBotIdsData> serializer() {
            return FeatureToggleConditionBotIdsData$$serializer.INSTANCE;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ FeatureToggleConditionBotIdsData(int i, @SerialName("botUIDs") FeatureToggleBotIdsData featureToggleBotIdsData, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 0) != 0) {
            PluginExceptionsKt.throwMissingFieldException(i, 0, FeatureToggleConditionBotIdsData$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.chatIdsCondition = null;
        } else {
            this.chatIdsCondition = featureToggleBotIdsData;
        }
    }

    public FeatureToggleConditionBotIdsData(FeatureToggleBotIdsData featureToggleBotIdsData) {
        this.chatIdsCondition = featureToggleBotIdsData;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self(FeatureToggleConditionBotIdsData featureToggleConditionBotIdsData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        boolean z = true;
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && featureToggleConditionBotIdsData.chatIdsCondition == null) {
            z = false;
        }
        if (z) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, FeatureToggleBotIdsData$$serializer.INSTANCE, featureToggleConditionBotIdsData.chatIdsCondition);
        }
    }

    public /* synthetic */ FeatureToggleConditionBotIdsData(FeatureToggleBotIdsData featureToggleBotIdsData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : featureToggleBotIdsData);
    }

    public final FeatureToggleBotIdsData getChatIdsCondition() {
        return this.chatIdsCondition;
    }
}
