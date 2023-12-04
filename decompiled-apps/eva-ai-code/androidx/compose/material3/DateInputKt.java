package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Dp;
import com.google.firebase.messaging.Constants;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
/* compiled from: DateInput.kt */
@Metadata(d1 = {"\u0000h\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a1\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eH\u0001¢\u0006\u0002\u0010\u0011\u001a\u008f\u0001\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00142\u0013\u0010\u0015\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0013\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\u0016¢\u0006\u0002\b\u00172\u0006\u0010\t\u001a\u00020\n2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0014\u0010\u001b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0004\u0012\u00020\b0\u000e2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b$\u0010%\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0013\u0010\u0004\u001a\u00020\u0005X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0006\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006&"}, d2 = {"InputTextFieldPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "getInputTextFieldPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "InputTextNonErroneousBottomPadding", "Landroidx/compose/ui/unit/Dp;", "F", "DateInputContent", "", "stateData", "Landroidx/compose/material3/StateData;", "dateFormatter", "Landroidx/compose/material3/DatePickerFormatter;", "dateValidator", "Lkotlin/Function1;", "", "", "(Landroidx/compose/material3/StateData;Landroidx/compose/material3/DatePickerFormatter;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "DateInputTextField", "modifier", "Landroidx/compose/ui/Modifier;", Constants.ScionAnalytics.PARAM_LABEL, "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "placeholder", "initialDate", "Landroidx/compose/material3/CalendarDate;", "onDateChanged", "inputIdentifier", "Landroidx/compose/material3/InputIdentifier;", "dateInputValidator", "Landroidx/compose/material3/DateInputValidator;", "dateInputFormat", "Landroidx/compose/material3/DateInputFormat;", "locale", "Ljava/util/Locale;", "DateInputTextField-zm97o8M", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/material3/StateData;Landroidx/compose/material3/CalendarDate;Lkotlin/jvm/functions/Function1;ILandroidx/compose/material3/DateInputValidator;Landroidx/compose/material3/DateInputFormat;Ljava/util/Locale;Landroidx/compose/runtime/Composer;I)V", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DateInputKt {
    private static final PaddingValues InputTextFieldPadding;
    private static final float InputTextNonErroneousBottomPadding = Dp.m5607constructorimpl(16);

    public static final void DateInputContent(StateData stateData, DatePickerFormatter dateFormatter, Function1<? super Long, Boolean> dateValidator, Composer composer, int i) {
        int i2;
        int i3;
        DateInputFormat dateInputFormat;
        String str;
        Composer composer2;
        Intrinsics.checkNotNullParameter(stateData, "stateData");
        Intrinsics.checkNotNullParameter(dateFormatter, "dateFormatter");
        Intrinsics.checkNotNullParameter(dateValidator, "dateValidator");
        Composer startRestartGroup = composer.startRestartGroup(814303288);
        ComposerKt.sourceInformation(startRestartGroup, "C(DateInputContent)P(2)54@2202L15,55@2244L97,58@2369L45,59@2449L44,60@2527L45,61@2602L503,74@3194L42,87@3730L52,75@3241L730:DateInput.kt#uh7d8r");
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(stateData) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(dateFormatter) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changedInstance(dateValidator) ? 256 : 128;
        }
        int i4 = i2;
        if ((i4 & 731) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(814303288, i4, -1, "androidx.compose.material3.DateInputContent (DateInput.kt:48)");
            }
            Locale defaultLocale = CalendarModel_androidKt.defaultLocale(startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean changed = startRestartGroup.changed(defaultLocale);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = stateData.getCalendarModel().getDateInputFormat(defaultLocale);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            DateInputFormat dateInputFormat2 = (DateInputFormat) rememberedValue;
            String m2058getStringNWtq28 = Strings_androidKt.m2058getStringNWtq28(Strings.Companion.m2004getDateInputInvalidForPatternadMyvUU(), startRestartGroup, 6);
            String m2058getStringNWtq282 = Strings_androidKt.m2058getStringNWtq28(Strings.Companion.m2006getDateInputInvalidYearRangeadMyvUU(), startRestartGroup, 6);
            String m2058getStringNWtq283 = Strings_androidKt.m2058getStringNWtq28(Strings.Companion.m2005getDateInputInvalidNotAllowedadMyvUU(), startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(511388516);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
            boolean changed2 = startRestartGroup.changed(dateInputFormat2) | startRestartGroup.changed(dateFormatter);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                i3 = 6;
                dateInputFormat = dateInputFormat2;
                str = "CC(remember)P(1):Composables.kt#9igjgp";
                DateInputValidator dateInputValidator = new DateInputValidator(stateData, dateInputFormat2, dateFormatter, dateValidator, m2058getStringNWtq28, m2058getStringNWtq282, m2058getStringNWtq283, "");
                startRestartGroup.updateRememberedValue(dateInputValidator);
                rememberedValue2 = dateInputValidator;
            } else {
                i3 = 6;
                dateInputFormat = dateInputFormat2;
                str = "CC(remember)P(1):Composables.kt#9igjgp";
            }
            startRestartGroup.endReplaceableGroup();
            DateInputValidator dateInputValidator2 = (DateInputValidator) rememberedValue2;
            String upperCase = dateInputFormat.getPatternWithDelimiters().toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            String m2058getStringNWtq284 = Strings_androidKt.m2058getStringNWtq28(Strings.Companion.m2007getDateInputLabeladMyvUU(), startRestartGroup, i3);
            Modifier padding = PaddingKt.padding(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), InputTextFieldPadding);
            ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(startRestartGroup, -438341159, true, new DateInputKt$DateInputContent$1(m2058getStringNWtq284, upperCase));
            ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(startRestartGroup, 1914447672, true, new DateInputKt$DateInputContent$2(upperCase));
            CalendarDate value = stateData.getSelectedStartDate().getValue();
            startRestartGroup.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(startRestartGroup, str);
            boolean changed3 = startRestartGroup.changed(stateData);
            DateInputKt$DateInputContent$3$1 rememberedValue3 = startRestartGroup.rememberedValue();
            if (changed3 || rememberedValue3 == Composer.Companion.getEmpty()) {
                rememberedValue3 = new DateInputKt$DateInputContent$3$1(stateData);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            startRestartGroup.endReplaceableGroup();
            composer2 = startRestartGroup;
            m1725DateInputTextFieldzm97o8M(padding, composableLambda, composableLambda2, stateData, value, (Function1) rememberedValue3, InputIdentifier.Companion.m1845getSingleDateInputJ2x2o4M(), dateInputValidator2, dateInputFormat, defaultLocale, startRestartGroup, ((i4 << 9) & 7168) | 1075315126);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new DateInputKt$DateInputContent$4(stateData, dateFormatter, dateValidator, i));
    }

    /* renamed from: DateInputTextField-zm97o8M  reason: not valid java name */
    public static final void m1725DateInputTextFieldzm97o8M(Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, StateData stateData, CalendarDate calendarDate, Function1<? super CalendarDate, Unit> onDateChanged, int i, DateInputValidator dateInputValidator, DateInputFormat dateInputFormat, Locale locale, Composer composer, int i2) {
        float f;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(stateData, "stateData");
        Intrinsics.checkNotNullParameter(onDateChanged, "onDateChanged");
        Intrinsics.checkNotNullParameter(dateInputValidator, "dateInputValidator");
        Intrinsics.checkNotNullParameter(dateInputFormat, "dateInputFormat");
        Intrinsics.checkNotNullParameter(locale, "locale");
        Composer startRestartGroup = composer.startRestartGroup(626552973);
        ComposerKt.sourceInformation(startRestartGroup, "C(DateInputTextField)P(6,4,8,9,2,7,3:c#material3.InputIdentifier,1)109@4431L39,110@4487L528,166@6737L88,127@5021L2277:DateInput.kt#uh7d8r");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(626552973, i2, -1, "androidx.compose.material3.DateInputTextField (DateInput.kt:97)");
        }
        MutableState mutableState = (MutableState) RememberSaveableKt.m2907rememberSaveable(new Object[0], (Saver<Object, ? extends Object>) null, (String) null, (Function0<? extends Object>) DateInputKt$DateInputTextField$errorText$1.INSTANCE, startRestartGroup, 3080, 6);
        MutableState rememberSaveable = RememberSaveableKt.rememberSaveable(new Object[0], (Saver) TextFieldValue.Companion.getSaver(), (String) null, (Function0) new DateInputKt$DateInputTextField$text$2(stateData, calendarDate, dateInputFormat, locale), startRestartGroup, 72, 4);
        TextFieldValue DateInputTextField_zm97o8M$lambda$3 = DateInputTextField_zm97o8M$lambda$3(rememberSaveable);
        DateInputKt$DateInputTextField$1 dateInputKt$DateInputTextField$1 = new DateInputKt$DateInputTextField$1(dateInputFormat, mutableState, onDateChanged, stateData, dateInputValidator, i, locale, rememberSaveable);
        if (!(!StringsKt.isBlank((CharSequence) mutableState.getValue()))) {
            f = InputTextNonErroneousBottomPadding;
        } else {
            f = Dp.m5607constructorimpl(0);
        }
        Modifier m752paddingqDBjuR0$default = PaddingKt.m752paddingqDBjuR0$default(modifier, 0.0f, 0.0f, 0.0f, f, 7, null);
        startRestartGroup.startReplaceableGroup(1157296644);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean changed = startRestartGroup.changed(mutableState);
        DateInputKt$DateInputTextField$2$1 rememberedValue = startRestartGroup.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new DateInputKt$DateInputTextField$2$1(mutableState);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        int i3 = i2 << 15;
        OutlinedTextFieldKt.OutlinedTextField(DateInputTextField_zm97o8M$lambda$3, (Function1<? super TextFieldValue, Unit>) dateInputKt$DateInputTextField$1, SemanticsModifierKt.semantics$default(m752paddingqDBjuR0$default, false, (Function1) rememberedValue, 1, null), false, false, (TextStyle) null, function2, function22, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(startRestartGroup, 785795078, true, new DateInputKt$DateInputTextField$3(mutableState)), !StringsKt.isBlank((CharSequence) mutableState.getValue()), (VisualTransformation) new DateVisualTransformation(dateInputFormat), new KeyboardOptions(0, false, KeyboardType.Companion.m5314getNumberPjHm6EE(), ImeAction.Companion.m5266getDoneeUduSuo(), 1, null), (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, startRestartGroup, (3670016 & i3) | (i3 & 29360128), 12779904, 0, 8195896);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new DateInputKt$DateInputTextField$4(modifier, function2, function22, stateData, calendarDate, onDateChanged, i, dateInputValidator, dateInputFormat, locale, i2));
    }

    private static final TextFieldValue DateInputTextField_zm97o8M$lambda$3(MutableState<TextFieldValue> mutableState) {
        return mutableState.getValue();
    }

    public static final PaddingValues getInputTextFieldPadding() {
        return InputTextFieldPadding;
    }

    static {
        float f = 24;
        InputTextFieldPadding = PaddingKt.m745PaddingValuesa9UjIt4$default(Dp.m5607constructorimpl(f), Dp.m5607constructorimpl(10), Dp.m5607constructorimpl(f), 0.0f, 8, null);
    }
}
