package androidx.compose.material3;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.tokens.TimeInputTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TimePicker.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TimePickerKt$TimeInputImpl$1$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ TimePickerColors $colors;
    final /* synthetic */ MutableState<TextFieldValue> $hourValue$delegate;
    final /* synthetic */ MutableState<TextFieldValue> $minuteValue$delegate;
    final /* synthetic */ TimePickerState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimePickerKt$TimeInputImpl$1$1(MutableState<TextFieldValue> mutableState, TimePickerState timePickerState, int i, TimePickerColors timePickerColors, MutableState<TextFieldValue> mutableState2) {
        super(2);
        this.$hourValue$delegate = mutableState;
        this.$state = timePickerState;
        this.$$dirty = i;
        this.$colors = timePickerColors;
        this.$minuteValue$delegate = mutableState2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r42v0, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v3 */
    public final void invoke(Composer composer, int i) {
        TextFieldValue TimeInputImpl$lambda$5;
        float f;
        TextFieldValue TimeInputImpl$lambda$8;
        ComposerKt.sourceInformation(composer, "C719@30761L411,731@31241L353,746@31903L38,717@30672L1318,749@32003L85,752@32197L376,765@32645L331,780@33287L38,750@32101L1273:TimePicker.kt#uh7d8r");
        if ((i & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1306700887, i, -1, "androidx.compose.material3.TimeInputImpl.<anonymous>.<anonymous> (TimePicker.kt:715)");
            }
            Modifier.Companion companion = Modifier.Companion;
            MutableState<TextFieldValue> mutableState = this.$hourValue$delegate;
            TimePickerState timePickerState = this.$state;
            composer.startReplaceableGroup(511388516);
            ComposerKt.sourceInformation(composer, "CC(remember)P(1,2):Composables.kt#9igjgp");
            boolean changed = composer.changed(mutableState) | composer.changed(timePickerState);
            TimePickerKt$TimeInputImpl$1$1$1$1 rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new TimePickerKt$TimeInputImpl$1$1$1$1(timePickerState, mutableState);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            Modifier onKeyEvent = KeyInputModifierKt.onKeyEvent(companion, (Function1) rememberedValue);
            TimeInputImpl$lambda$5 = TimePickerKt.TimeInputImpl$lambda$5(this.$hourValue$delegate);
            TimePickerState timePickerState2 = this.$state;
            MutableState<TextFieldValue> mutableState2 = this.$hourValue$delegate;
            composer.startReplaceableGroup(511388516);
            ComposerKt.sourceInformation(composer, "CC(remember)P(1,2):Composables.kt#9igjgp");
            boolean changed2 = composer.changed(timePickerState2) | composer.changed(mutableState2);
            TimePickerKt$TimeInputImpl$1$1$2$1 rememberedValue2 = composer.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new TimePickerKt$TimeInputImpl$1$1$2$1(timePickerState2, mutableState2);
                composer.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceableGroup();
            Function1 function1 = rememberedValue2;
            TimePickerState timePickerState3 = this.$state;
            int m1972getHourJiIwxys = Selection.Companion.m1972getHourJiIwxys();
            KeyboardOptions keyboardOptions = new KeyboardOptions(0, false, KeyboardType.Companion.m5314getNumberPjHm6EE(), ImeAction.Companion.m5268getNexteUduSuo(), 3, null);
            TimePickerState timePickerState4 = this.$state;
            composer.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean changed3 = composer.changed(timePickerState4);
            TimePickerKt$TimeInputImpl$1$1$3$1 rememberedValue3 = composer.rememberedValue();
            if (changed3 || rememberedValue3 == Composer.Companion.getEmpty()) {
                rememberedValue3 = new TimePickerKt$TimeInputImpl$1$1$3$1(timePickerState4);
                composer.updateRememberedValue(rememberedValue3);
            }
            composer.endReplaceableGroup();
            KeyboardActions keyboardActions = new KeyboardActions(null, null, rememberedValue3, null, null, null, 59, null);
            TimePickerColors timePickerColors = this.$colors;
            int i2 = this.$$dirty;
            TimePickerKt.m2161TimePickerTextFieldlxUZ_iY(onKeyEvent, TimeInputImpl$lambda$5, function1, timePickerState3, m1972getHourJiIwxys, keyboardOptions, keyboardActions, timePickerColors, composer, ((i2 << 3) & 7168) | 24576 | ((i2 << 18) & 29360128), 0);
            f = TimePickerKt.DisplaySeparatorWidth;
            TimePickerKt.DisplaySeparator(SizeKt.m797sizeVpY3zN4(Modifier.Companion, f, TimeInputTokens.INSTANCE.m2747getPeriodSelectorContainerHeightD9Ej5fM()), composer, 6);
            Modifier.Companion companion2 = Modifier.Companion;
            MutableState<TextFieldValue> mutableState3 = this.$minuteValue$delegate;
            TimePickerState timePickerState5 = this.$state;
            composer.startReplaceableGroup(511388516);
            ComposerKt.sourceInformation(composer, "CC(remember)P(1,2):Composables.kt#9igjgp");
            boolean changed4 = composer.changed(mutableState3) | composer.changed(timePickerState5);
            TimePickerKt$TimeInputImpl$1$1$4$1 rememberedValue4 = composer.rememberedValue();
            if (changed4 || rememberedValue4 == Composer.Companion.getEmpty()) {
                rememberedValue4 = new TimePickerKt$TimeInputImpl$1$1$4$1(timePickerState5, mutableState3);
                composer.updateRememberedValue(rememberedValue4);
            }
            composer.endReplaceableGroup();
            Modifier onPreviewKeyEvent = KeyInputModifierKt.onPreviewKeyEvent(companion2, (Function1) rememberedValue4);
            TimeInputImpl$lambda$8 = TimePickerKt.TimeInputImpl$lambda$8(this.$minuteValue$delegate);
            TimePickerState timePickerState6 = this.$state;
            MutableState<TextFieldValue> mutableState4 = this.$minuteValue$delegate;
            composer.startReplaceableGroup(511388516);
            ComposerKt.sourceInformation(composer, "CC(remember)P(1,2):Composables.kt#9igjgp");
            boolean changed5 = composer.changed(timePickerState6) | composer.changed(mutableState4);
            TimePickerKt$TimeInputImpl$1$1$5$1 rememberedValue5 = composer.rememberedValue();
            if (changed5 || rememberedValue5 == Composer.Companion.getEmpty()) {
                rememberedValue5 = new TimePickerKt$TimeInputImpl$1$1$5$1(timePickerState6, mutableState4);
                composer.updateRememberedValue(rememberedValue5);
            }
            composer.endReplaceableGroup();
            Function1 function12 = rememberedValue5;
            TimePickerState timePickerState7 = this.$state;
            int m1973getMinuteJiIwxys = Selection.Companion.m1973getMinuteJiIwxys();
            KeyboardOptions keyboardOptions2 = new KeyboardOptions(0, false, KeyboardType.Companion.m5314getNumberPjHm6EE(), ImeAction.Companion.m5266getDoneeUduSuo(), 3, null);
            TimePickerState timePickerState8 = this.$state;
            composer.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean changed6 = composer.changed(timePickerState8);
            TimePickerKt$TimeInputImpl$1$1$6$1 rememberedValue6 = composer.rememberedValue();
            if (changed6 || rememberedValue6 == Composer.Companion.getEmpty()) {
                rememberedValue6 = new TimePickerKt$TimeInputImpl$1$1$6$1(timePickerState8);
                composer.updateRememberedValue(rememberedValue6);
            }
            composer.endReplaceableGroup();
            KeyboardActions keyboardActions2 = new KeyboardActions(null, null, rememberedValue6, null, null, null, 59, null);
            TimePickerColors timePickerColors2 = this.$colors;
            int i3 = this.$$dirty;
            TimePickerKt.m2161TimePickerTextFieldlxUZ_iY(onPreviewKeyEvent, TimeInputImpl$lambda$8, function12, timePickerState7, m1973getMinuteJiIwxys, keyboardOptions2, keyboardActions2, timePickerColors2, composer, ((i3 << 3) & 7168) | 24576 | ((i3 << 18) & 29360128), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
