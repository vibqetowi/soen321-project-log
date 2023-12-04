package com.airbnb.lottie.compose;

import android.graphics.Typeface;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ContentScale;
import com.airbnb.lottie.AsyncUpdates;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.RenderMode;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LottieAnimation.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LottieAnimationKt$LottieAnimation$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ Alignment $alignment;
    final /* synthetic */ boolean $applyOpacityToLayers;
    final /* synthetic */ AsyncUpdates $asyncUpdates;
    final /* synthetic */ boolean $clipToCompositionBounds;
    final /* synthetic */ LottieComposition $composition;
    final /* synthetic */ ContentScale $contentScale;
    final /* synthetic */ LottieDynamicProperties $dynamicProperties;
    final /* synthetic */ boolean $enableMergePaths;
    final /* synthetic */ Map<String, Typeface> $fontMap;
    final /* synthetic */ boolean $maintainOriginalImageBounds;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ boolean $outlineMasksAndMattes;
    final /* synthetic */ Function0<Float> $progress;
    final /* synthetic */ RenderMode $renderMode;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LottieAnimationKt$LottieAnimation$1(LottieComposition lottieComposition, Function0<Float> function0, Modifier modifier, boolean z, boolean z2, boolean z3, RenderMode renderMode, boolean z4, LottieDynamicProperties lottieDynamicProperties, Alignment alignment, ContentScale contentScale, boolean z5, Map<String, ? extends Typeface> map, AsyncUpdates asyncUpdates, int i, int i2, int i3) {
        super(2);
        this.$composition = lottieComposition;
        this.$progress = function0;
        this.$modifier = modifier;
        this.$outlineMasksAndMattes = z;
        this.$applyOpacityToLayers = z2;
        this.$enableMergePaths = z3;
        this.$renderMode = renderMode;
        this.$maintainOriginalImageBounds = z4;
        this.$dynamicProperties = lottieDynamicProperties;
        this.$alignment = alignment;
        this.$contentScale = contentScale;
        this.$clipToCompositionBounds = z5;
        this.$fontMap = map;
        this.$asyncUpdates = asyncUpdates;
        this.$$changed = i;
        this.$$changed1 = i2;
        this.$$default = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        LottieAnimationKt.LottieAnimation(this.$composition, this.$progress, this.$modifier, this.$outlineMasksAndMattes, this.$applyOpacityToLayers, this.$enableMergePaths, this.$renderMode, this.$maintainOriginalImageBounds, this.$dynamicProperties, this.$alignment, this.$contentScale, this.$clipToCompositionBounds, this.$fontMap, this.$asyncUpdates, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), RecomposeScopeImplKt.updateChangedFlags(this.$$changed1), this.$$default);
    }
}
