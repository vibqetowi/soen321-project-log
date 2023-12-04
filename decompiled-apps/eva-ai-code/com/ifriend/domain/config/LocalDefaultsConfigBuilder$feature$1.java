package com.ifriend.domain.config;

import androidx.exifinterface.media.ExifInterface;
import com.ifriend.domain.config.LocalDefaultsConfigBuilder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LocalDefaultsConfigBuilder.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "", "Lcom/ifriend/domain/config/LocalDefaultsConfigBuilder$FeatureBuilder;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LocalDefaultsConfigBuilder$feature$1 extends Lambda implements Function1<LocalDefaultsConfigBuilder.FeatureBuilder<T>, Unit> {
    public static final LocalDefaultsConfigBuilder$feature$1 INSTANCE = new LocalDefaultsConfigBuilder$feature$1();

    LocalDefaultsConfigBuilder$feature$1() {
        super(1);
    }

    public final void invoke(LocalDefaultsConfigBuilder.FeatureBuilder<T> featureBuilder) {
        Intrinsics.checkNotNullParameter(featureBuilder, "$this$null");
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
        invoke((LocalDefaultsConfigBuilder.FeatureBuilder) obj);
        return Unit.INSTANCE;
    }
}
