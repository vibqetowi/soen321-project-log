package com.ifriend.data.config;

import com.ifriend.domain.config.LocalDefaultsConfigBuilder;
import com.ifriend.domain.config.NeuronsPackagesGroup;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: LocalDefaultsConfig.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "Lcom/ifriend/domain/config/LocalDefaultsConfigBuilder$FeatureBuilder;", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class LocalDefaultsConfig$neurons$4 extends Lambda implements Function1<LocalDefaultsConfigBuilder.FeatureBuilder<String>, Unit> {
    public static final LocalDefaultsConfig$neurons$4 INSTANCE = new LocalDefaultsConfig$neurons$4();

    LocalDefaultsConfig$neurons$4() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(LocalDefaultsConfigBuilder.FeatureBuilder<String> featureBuilder) {
        invoke2(featureBuilder);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(LocalDefaultsConfigBuilder.FeatureBuilder<String> feature) {
        Intrinsics.checkNotNullParameter(feature, "$this$feature");
        feature.byTags(CollectionsKt.listOf("ai.neurons.group1"), NeuronsPackagesGroup.EXP1);
        feature.byTags(CollectionsKt.listOf("ai.neurons.group2"), NeuronsPackagesGroup.EXP2);
    }
}
