package com.ifriend.presentation.features.purchases.neurons.view;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import androidx.exifinterface.media.ExifInterface;
import com.ifriend.presentation.features.purchases.neurons.model.BuyNeuronsProductUiParams;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: LazyGridDsl.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u000b¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;", "it", "", "invoke", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;ILandroidx/compose/runtime/Composer;I)V", "androidx/compose/foundation/lazy/grid/LazyGridDslKt$items$5"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BuyNeuronsBottomSheetKt$BuyNeuronsContent$1$1$1$invoke$$inlined$items$default$5 extends Lambda implements Function4<LazyGridItemScope, Integer, Composer, Integer, Unit> {
    final /* synthetic */ BuyNeuronsClicks $clicks$inlined;
    final /* synthetic */ List $items;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyNeuronsBottomSheetKt$BuyNeuronsContent$1$1$1$invoke$$inlined$items$default$5(List list, BuyNeuronsClicks buyNeuronsClicks) {
        super(4);
        this.$items = list;
        this.$clicks$inlined = buyNeuronsClicks;
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Unit invoke(LazyGridItemScope lazyGridItemScope, Integer num, Composer composer, Integer num2) {
        invoke(lazyGridItemScope, num.intValue(), composer, num2.intValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r12v14 */
    public final void invoke(LazyGridItemScope items, int i, Composer composer, int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(items, "$this$items");
        ComposerKt.sourceInformation(composer, "C455@19203L22:LazyGridDsl.kt#7791vq");
        if ((i2 & 14) == 0) {
            i3 = (composer.changed(items) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= composer.changed(i) ? 32 : 16;
        }
        if ((i3 & 731) == 146 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(699646206, i3, -1, "androidx.compose.foundation.lazy.grid.items.<anonymous> (LazyGridDsl.kt:454)");
        }
        BuyNeuronsProductUiParams buyNeuronsProductUiParams = (BuyNeuronsProductUiParams) this.$items.get(i);
        Function1<BuyNeuronsProductUiParams, Unit> onItemClick = this.$clicks$inlined.getOnItemClick();
        int i4 = ((i3 & 14) >> 3) & 14;
        composer.startReplaceableGroup(-546522171);
        ComposerKt.sourceInformation(composer, "CC(rememberAction)P(1,2)");
        composer.startReplaceableGroup(511388516);
        ComposerKt.sourceInformation(composer, "CC(remember)P(1,2):Composables.kt#9igjgp");
        boolean changed = composer.changed(onItemClick) | composer.changed(buyNeuronsProductUiParams);
        BuyNeuronsBottomSheetKt$BuyNeuronsContent$1$1$1$invoke$lambda$1$$inlined$rememberAction$1 rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new BuyNeuronsBottomSheetKt$BuyNeuronsContent$1$1$1$invoke$lambda$1$$inlined$rememberAction$1(this.$clicks$inlined, buyNeuronsProductUiParams);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        BuyNeuronsBottomSheetKt.BuyNeuronsItem(buyNeuronsProductUiParams, rememberedValue, PaddingKt.m750paddingVpY3zN4$default(Modifier.Companion, Dp.m5607constructorimpl(1), 0.0f, 2, null), composer, i4 | 384, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
