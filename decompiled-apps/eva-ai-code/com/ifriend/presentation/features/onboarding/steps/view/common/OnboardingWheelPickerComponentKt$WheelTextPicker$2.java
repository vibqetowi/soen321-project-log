package com.ifriend.presentation.features.onboarding.steps.view.common;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: OnboardingWheelPickerComponent.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/lazy/LazyItemScope;", FirebaseAnalytics.Param.INDEX, "", "invoke", "(Landroidx/compose/foundation/lazy/LazyItemScope;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OnboardingWheelPickerComponentKt$WheelTextPicker$2 extends Lambda implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ long $color;
    final /* synthetic */ TextStyle $style;
    final /* synthetic */ List<String> $texts;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingWheelPickerComponentKt$WheelTextPicker$2(List<String> list, long j, TextStyle textStyle, int i) {
        super(4);
        this.$texts = list;
        this.$color = j;
        this.$style = textStyle;
        this.$$dirty = i;
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
        invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(LazyItemScope WheelPicker, int i, Composer composer, int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(WheelPicker, "$this$WheelPicker");
        if ((i2 & 112) == 0) {
            i3 = (composer.changed(i) ? 32 : 16) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 721) != 144 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1322901723, i2, -1, "com.ifriend.presentation.features.onboarding.steps.view.common.WheelTextPicker.<anonymous> (OnboardingWheelPickerComponent.kt:70)");
            }
            String str = this.$texts.get(i);
            long j = this.$color;
            TextStyle textStyle = this.$style;
            int i4 = this.$$dirty;
            TextKt.m2145Text4IGK_g(str, (Modifier) null, j, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyle, composer, (i4 >> 12) & 896, ((i4 << 3) & 3670016) | CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE, 57338);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
