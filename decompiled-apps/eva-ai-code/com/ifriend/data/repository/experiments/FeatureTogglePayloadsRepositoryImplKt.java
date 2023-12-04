package com.ifriend.data.repository.experiments;

import androidx.exifinterface.media.ExifInterface;
import com.ifriend.data.repository.experiments.model.FeatureToggleConditionsData;
import com.ifriend.data.repository.experiments.model.FeatureTogglePayloadConditionsData;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KTypeProjection;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.modules.SerializersModule;
/* compiled from: FeatureTogglePayloadsRepositoryImpl.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a#\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0082\b¨\u0006\u0006"}, d2 = {"getPayloadConditions", "", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/serialization/json/Json;", "jsonString", "", "data_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FeatureTogglePayloadsRepositoryImplKt {
    private static final /* synthetic */ <T> List<T> getPayloadConditions(Json json, String str) {
        Json json2 = json;
        SerializersModule serializersModule = json2.getSerializersModule();
        KTypeProjection.Companion companion = KTypeProjection.Companion;
        Intrinsics.reifiedOperationMarker(6, ExifInterface.GPS_DIRECTION_TRUE);
        FeatureToggleConditionsData<T> payload = ((FeatureTogglePayloadConditionsData) json2.decodeFromString(SerializersKt.serializer(serializersModule, Reflection.typeOf(FeatureTogglePayloadConditionsData.class, companion.invariant(null))), str)).getPayload();
        List<T> conditions = payload != null ? payload.getConditions() : null;
        return conditions == null ? CollectionsKt.emptyList() : conditions;
    }
}
