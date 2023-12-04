package com.airbnb.lottie.compose;

import android.graphics.Matrix;
import android.graphics.Typeface;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.ScaleFactor;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSizeKt;
import com.airbnb.lottie.AsyncUpdates;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.RenderMode;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.math.MathKt;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LottieAnimation.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LottieAnimationKt$LottieAnimation$2 extends Lambda implements Function1<DrawScope, Unit> {
    final /* synthetic */ Alignment $alignment;
    final /* synthetic */ boolean $applyOpacityToLayers;
    final /* synthetic */ AsyncUpdates $asyncUpdates;
    final /* synthetic */ boolean $clipToCompositionBounds;
    final /* synthetic */ LottieComposition $composition;
    final /* synthetic */ ContentScale $contentScale;
    final /* synthetic */ LottieDrawable $drawable;
    final /* synthetic */ LottieDynamicProperties $dynamicProperties;
    final /* synthetic */ boolean $enableMergePaths;
    final /* synthetic */ Map<String, Typeface> $fontMap;
    final /* synthetic */ boolean $maintainOriginalImageBounds;
    final /* synthetic */ Matrix $matrix;
    final /* synthetic */ boolean $outlineMasksAndMattes;
    final /* synthetic */ Function0<Float> $progress;
    final /* synthetic */ RenderMode $renderMode;
    final /* synthetic */ MutableState<LottieDynamicProperties> $setDynamicProperties$delegate;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LottieAnimationKt$LottieAnimation$2(LottieComposition lottieComposition, ContentScale contentScale, Alignment alignment, Matrix matrix, LottieDrawable lottieDrawable, boolean z, RenderMode renderMode, AsyncUpdates asyncUpdates, Map<String, ? extends Typeface> map, LottieDynamicProperties lottieDynamicProperties, boolean z2, boolean z3, boolean z4, boolean z5, Function0<Float> function0, MutableState<LottieDynamicProperties> mutableState) {
        super(1);
        this.$composition = lottieComposition;
        this.$contentScale = contentScale;
        this.$alignment = alignment;
        this.$matrix = matrix;
        this.$drawable = lottieDrawable;
        this.$enableMergePaths = z;
        this.$renderMode = renderMode;
        this.$asyncUpdates = asyncUpdates;
        this.$fontMap = map;
        this.$dynamicProperties = lottieDynamicProperties;
        this.$outlineMasksAndMattes = z2;
        this.$applyOpacityToLayers = z3;
        this.$maintainOriginalImageBounds = z4;
        this.$clipToCompositionBounds = z5;
        this.$progress = function0;
        this.$setDynamicProperties$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
        invoke2(drawScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(DrawScope Canvas) {
        long m6211timesUQTWf7w;
        LottieDynamicProperties LottieAnimation$lambda$3;
        LottieDynamicProperties LottieAnimation$lambda$32;
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        LottieComposition lottieComposition = this.$composition;
        ContentScale contentScale = this.$contentScale;
        Alignment alignment = this.$alignment;
        Matrix matrix = this.$matrix;
        LottieDrawable lottieDrawable = this.$drawable;
        boolean z = this.$enableMergePaths;
        RenderMode renderMode = this.$renderMode;
        AsyncUpdates asyncUpdates = this.$asyncUpdates;
        Map<String, Typeface> map = this.$fontMap;
        LottieDynamicProperties lottieDynamicProperties = this.$dynamicProperties;
        boolean z2 = this.$outlineMasksAndMattes;
        boolean z3 = this.$applyOpacityToLayers;
        boolean z4 = this.$maintainOriginalImageBounds;
        boolean z5 = this.$clipToCompositionBounds;
        Function0<Float> function0 = this.$progress;
        MutableState<LottieDynamicProperties> mutableState = this.$setDynamicProperties$delegate;
        Canvas canvas = Canvas.getDrawContext().getCanvas();
        long Size = SizeKt.Size(lottieComposition.getBounds().width(), lottieComposition.getBounds().height());
        long IntSize = IntSizeKt.IntSize(MathKt.roundToInt(Size.m3087getWidthimpl(Canvas.mo3762getSizeNHjbRc())), MathKt.roundToInt(Size.m3084getHeightimpl(Canvas.mo3762getSizeNHjbRc())));
        long mo4536computeScaleFactorH7hwNQA = contentScale.mo4536computeScaleFactorH7hwNQA(Size, Canvas.mo3762getSizeNHjbRc());
        m6211timesUQTWf7w = LottieAnimationKt.m6211timesUQTWf7w(Size, mo4536computeScaleFactorH7hwNQA);
        long mo2908alignKFBX0sM = alignment.mo2908alignKFBX0sM(m6211timesUQTWf7w, IntSize, Canvas.getLayoutDirection());
        matrix.reset();
        matrix.preTranslate(IntOffset.m5725getXimpl(mo2908alignKFBX0sM), IntOffset.m5726getYimpl(mo2908alignKFBX0sM));
        matrix.preScale(ScaleFactor.m4623getScaleXimpl(mo4536computeScaleFactorH7hwNQA), ScaleFactor.m4624getScaleYimpl(mo4536computeScaleFactorH7hwNQA));
        lottieDrawable.enableMergePathsForKitKatAndAbove(z);
        lottieDrawable.setRenderMode(renderMode);
        lottieDrawable.setAsyncUpdates(asyncUpdates);
        lottieDrawable.setComposition(lottieComposition);
        lottieDrawable.setFontMap(map);
        LottieAnimation$lambda$3 = LottieAnimationKt.LottieAnimation$lambda$3(mutableState);
        if (lottieDynamicProperties != LottieAnimation$lambda$3) {
            LottieAnimation$lambda$32 = LottieAnimationKt.LottieAnimation$lambda$3(mutableState);
            if (LottieAnimation$lambda$32 != null) {
                LottieAnimation$lambda$32.removeFrom$lottie_compose_release(lottieDrawable);
            }
            if (lottieDynamicProperties != null) {
                lottieDynamicProperties.addTo$lottie_compose_release(lottieDrawable);
            }
            mutableState.setValue(lottieDynamicProperties);
        }
        lottieDrawable.setOutlineMasksAndMattes(z2);
        lottieDrawable.setApplyingOpacityToLayersEnabled(z3);
        lottieDrawable.setMaintainOriginalImageBounds(z4);
        lottieDrawable.setClipToCompositionBounds(z5);
        lottieDrawable.setProgress(function0.invoke().floatValue());
        lottieDrawable.setBounds(0, 0, lottieComposition.getBounds().width(), lottieComposition.getBounds().height());
        lottieDrawable.draw(AndroidCanvas_androidKt.getNativeCanvas(canvas), matrix);
    }
}
