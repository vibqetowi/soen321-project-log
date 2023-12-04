package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.tokens.TimeInputTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TimePicker.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TimePickerKt$TimePickerTextField$1$1$2 extends Lambda implements Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit> {
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ TextFieldColors $textFieldColors;
    final /* synthetic */ TextFieldValue $value;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimePickerKt$TimePickerTextField$1$1$2(TextFieldValue textFieldValue, MutableInteractionSource mutableInteractionSource, TextFieldColors textFieldColors) {
        super(3);
        this.$value = textFieldValue;
        this.$interactionSource = mutableInteractionSource;
        this.$textFieldColors = textFieldColors;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function2, Composer composer, Integer num) {
        invoke((Function2<? super Composer, ? super Integer, Unit>) function2, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Function2<? super Composer, ? super Integer, Unit> it, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(it, "it");
        ComposerKt.sourceInformation(composer, "C1448@55094L864:TimePicker.kt#uh7d8r");
        if ((i & 14) == 0) {
            i2 = i | (composer.changedInstance(it) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 91) != 18 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2133555260, i2, -1, "androidx.compose.material3.TimePickerTextField.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1447)");
            }
            OutlinedTextFieldDefaults.INSTANCE.DecorationBox(this.$value.getText(), it, true, true, VisualTransformation.Companion.getNone(), this.$interactionSource, false, null, null, null, null, null, null, null, this.$textFieldColors, PaddingKt.m741PaddingValues0680j_4(Dp.m5607constructorimpl(0)), ComposableLambdaKt.composableLambda(composer, -968963953, true, new AnonymousClass1(this.$interactionSource, this.$textFieldColors)), composer, ((i2 << 3) & 112) | 224640, 14352384, 16320);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TimePicker.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material3.TimePickerKt$TimePickerTextField$1$1$2$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ MutableInteractionSource $interactionSource;
        final /* synthetic */ TextFieldColors $textFieldColors;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(MutableInteractionSource mutableInteractionSource, TextFieldColors textFieldColors) {
            super(2);
            this.$interactionSource = mutableInteractionSource;
            this.$textFieldColors = textFieldColors;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C1462@55828L9,1458@55582L336:TimePicker.kt#uh7d8r");
            if ((i & 11) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-968963953, i, -1, "androidx.compose.material3.TimePickerTextField.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1457)");
                }
                OutlinedTextFieldDefaults.INSTANCE.m1909ContainerBoxnbWgWpA(true, false, this.$interactionSource, this.$textFieldColors, ShapesKt.toShape(TimeInputTokens.INSTANCE.getTimeFieldContainerShape(), composer, 6), 0.0f, 0.0f, composer, 12583350, 96);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    }
}
