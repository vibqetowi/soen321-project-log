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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LottieAnimation.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LottieAnimationKt$LottieAnimation$7 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ Alignment $alignment;
    final /* synthetic */ boolean $applyOpacityToLayers;
    final /* synthetic */ AsyncUpdates $asyncUpdates;
    final /* synthetic */ LottieClipSpec $clipSpec;
    final /* synthetic */ boolean $clipToCompositionBounds;
    final /* synthetic */ LottieComposition $composition;
    final /* synthetic */ ContentScale $contentScale;
    final /* synthetic */ LottieDynamicProperties $dynamicProperties;
    final /* synthetic */ boolean $enableMergePaths;
    final /* synthetic */ Map<String, Typeface> $fontMap;
    final /* synthetic */ boolean $isPlaying;
    final /* synthetic */ int $iterations;
    final /* synthetic */ boolean $maintainOriginalImageBounds;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ boolean $outlineMasksAndMattes;
    final /* synthetic */ RenderMode $renderMode;
    final /* synthetic */ boolean $restartOnPlay;
    final /* synthetic */ boolean $reverseOnRepeat;
    final /* synthetic */ float $speed;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LottieAnimationKt$LottieAnimation$7(LottieComposition lottieComposition, Modifier modifier, boolean z, boolean z2, LottieClipSpec lottieClipSpec, float f, int i, boolean z3, boolean z4, boolean z5, RenderMode renderMode, boolean z6, boolean z7, LottieDynamicProperties lottieDynamicProperties, Alignment alignment, ContentScale contentScale, boolean z8, Map<String, ? extends Typeface> map, AsyncUpdates asyncUpdates, int i2, int i3, int i4) {
        super(2);
        this.$composition = lottieComposition;
        this.$modifier = modifier;
        this.$isPlaying = z;
        this.$restartOnPlay = z2;
        this.$clipSpec = lottieClipSpec;
        this.$speed = f;
        this.$iterations = i;
        this.$outlineMasksAndMattes = z3;
        this.$applyOpacityToLayers = z4;
        this.$enableMergePaths = z5;
        this.$renderMode = renderMode;
        this.$reverseOnRepeat = z6;
        this.$maintainOriginalImageBounds = z7;
        this.$dynamicProperties = lottieDynamicProperties;
        this.$alignment = alignment;
        this.$contentScale = contentScale;
        this.$clipToCompositionBounds = z8;
        this.$fontMap = map;
        this.$asyncUpdates = asyncUpdates;
        this.$$changed = i2;
        this.$$changed1 = i3;
        this.$$default = i4;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        LottieAnimationKt.LottieAnimation(this.$composition, this.$modifier, this.$isPlaying, this.$restartOnPlay, this.$clipSpec, this.$speed, this.$iterations, this.$outlineMasksAndMattes, this.$applyOpacityToLayers, this.$enableMergePaths, this.$renderMode, this.$reverseOnRepeat, this.$maintainOriginalImageBounds, this.$dynamicProperties, this.$alignment, this.$contentScale, this.$clipToCompositionBounds, this.$fontMap, this.$asyncUpdates, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), RecomposeScopeImplKt.updateChangedFlags(this.$$changed1), this.$$default);
    }
}
