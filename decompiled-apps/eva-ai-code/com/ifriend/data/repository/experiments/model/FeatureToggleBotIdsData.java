package com.ifriend.data.repository.experiments.model;

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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
/* compiled from: DataFeatureTogglePayload.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002$%B7\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bB#\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\fJ\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0013J,\u0010\u0017\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0006HÖ\u0001J!\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#HÇ\u0001R$\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R \u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u0014\u0012\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0013¨\u0006&"}, d2 = {"Lcom/ifriend/data/repository/experiments/model/FeatureToggleBotIdsData;", "", "seen1", "", "ids", "", "", "include", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/util/List;Ljava/lang/Boolean;)V", "getIds$annotations", "()V", "getIds", "()Ljava/util/List;", "getInclude$annotations", "getInclude", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "copy", "(Ljava/util/List;Ljava/lang/Boolean;)Lcom/ifriend/data/repository/experiments/model/FeatureToggleBotIdsData;", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
/* loaded from: classes6.dex */
public final class FeatureToggleBotIdsData {
    private final List<String> ids;
    private final Boolean include;
    public static final Companion Companion = new Companion(null);
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(StringSerializer.INSTANCE), null};

    public FeatureToggleBotIdsData() {
        this((List) null, (Boolean) null, 3, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FeatureToggleBotIdsData copy$default(FeatureToggleBotIdsData featureToggleBotIdsData, List list, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            list = featureToggleBotIdsData.ids;
        }
        if ((i & 2) != 0) {
            bool = featureToggleBotIdsData.include;
        }
        return featureToggleBotIdsData.copy(list, bool);
    }

    @SerialName("list")
    public static /* synthetic */ void getIds$annotations() {
    }

    @SerialName("include")
    public static /* synthetic */ void getInclude$annotations() {
    }

    public final List<String> component1() {
        return this.ids;
    }

    public final Boolean component2() {
        return this.include;
    }

    public final FeatureToggleBotIdsData copy(List<String> list, Boolean bool) {
        return new FeatureToggleBotIdsData(list, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FeatureToggleBotIdsData) {
            FeatureToggleBotIdsData featureToggleBotIdsData = (FeatureToggleBotIdsData) obj;
            return Intrinsics.areEqual(this.ids, featureToggleBotIdsData.ids) && Intrinsics.areEqual(this.include, featureToggleBotIdsData.include);
        }
        return false;
    }

    public int hashCode() {
        List<String> list = this.ids;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Boolean bool = this.include;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        List<String> list = this.ids;
        Boolean bool = this.include;
        return "FeatureToggleBotIdsData(ids=" + list + ", include=" + bool + ")";
    }

    /* compiled from: DataFeatureTogglePayload.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/ifriend/data/repository/experiments/model/FeatureToggleBotIdsData$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/ifriend/data/repository/experiments/model/FeatureToggleBotIdsData;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<FeatureToggleBotIdsData> serializer() {
            return FeatureToggleBotIdsData$$serializer.INSTANCE;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ FeatureToggleBotIdsData(int i, @SerialName("list") List list, @SerialName("include") Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 0) != 0) {
            PluginExceptionsKt.throwMissingFieldException(i, 0, FeatureToggleBotIdsData$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.ids = null;
        } else {
            this.ids = list;
        }
        if ((i & 2) == 0) {
            this.include = null;
        } else {
            this.include = bool;
        }
    }

    public FeatureToggleBotIdsData(List<String> list, Boolean bool) {
        this.ids = list;
        this.include = bool;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self(FeatureToggleBotIdsData featureToggleBotIdsData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || featureToggleBotIdsData.ids != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], featureToggleBotIdsData.ids);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || featureToggleBotIdsData.include != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, BooleanSerializer.INSTANCE, featureToggleBotIdsData.include);
        }
    }

    public /* synthetic */ FeatureToggleBotIdsData(List list, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : bool);
    }

    public final List<String> getIds() {
        return this.ids;
    }

    public final Boolean getInclude() {
        return this.include;
    }
}
