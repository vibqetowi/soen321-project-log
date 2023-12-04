package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: DateRangeInput.kt */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a1\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0001¢\u0006\u0002\u0010\r\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"TextFieldSpacing", "Landroidx/compose/ui/unit/Dp;", "F", "DateRangeInputContent", "", "stateData", "Landroidx/compose/material3/StateData;", "dateFormatter", "Landroidx/compose/material3/DatePickerFormatter;", "dateValidator", "Lkotlin/Function1;", "", "", "(Landroidx/compose/material3/StateData;Landroidx/compose/material3/DatePickerFormatter;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DateRangeInputKt {
    private static final float TextFieldSpacing = Dp.m5607constructorimpl(8);

    public static final void DateRangeInputContent(StateData stateData, DatePickerFormatter dateFormatter, Function1<? super Long, Boolean> dateValidator, Composer composer, int i) {
        int i2;
        int i3;
        DateInputFormat dateInputFormat;
        String str;
        Locale locale;
        Composer composer2;
        Intrinsics.checkNotNullParameter(stateData, "stateData");
        Intrinsics.checkNotNullParameter(dateFormatter, "dateFormatter");
        Intrinsics.checkNotNullParameter(dateValidator, "dateValidator");
        Composer startRestartGroup = composer.startRestartGroup(-1163802470);
        ComposerKt.sourceInformation(startRestartGroup, "C(DateRangeInputContent)P(2)37@1398L15,38@1440L97,41@1565L45,42@1645L44,43@1723L45,44@1797L50,45@1877L482,57@2364L1939:DateRangeInput.kt#uh7d8r");
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
                ComposerKt.traceEventStart(-1163802470, i4, -1, "androidx.compose.material3.DateRangeInputContent (DateRangeInput.kt:31)");
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
            String m2058getStringNWtq284 = Strings_androidKt.m2058getStringNWtq28(Strings.Companion.m2025getDateRangeInputInvalidRangeInputadMyvUU(), startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(511388516);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
            boolean changed2 = startRestartGroup.changed(dateInputFormat2) | startRestartGroup.changed(dateFormatter);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                i3 = 6;
                dateInputFormat = dateInputFormat2;
                str = "CC(remember)P(1):Composables.kt#9igjgp";
                locale = defaultLocale;
                DateInputValidator dateInputValidator = new DateInputValidator(stateData, dateInputFormat2, dateFormatter, dateValidator, m2058getStringNWtq28, m2058getStringNWtq282, m2058getStringNWtq283, m2058getStringNWtq284);
                startRestartGroup.updateRememberedValue(dateInputValidator);
                rememberedValue2 = dateInputValidator;
            } else {
                i3 = 6;
                dateInputFormat = dateInputFormat2;
                str = "CC(remember)P(1):Composables.kt#9igjgp";
                locale = defaultLocale;
            }
            startRestartGroup.endReplaceableGroup();
            DateInputValidator dateInputValidator2 = (DateInputValidator) rememberedValue2;
            Modifier padding = PaddingKt.padding(Modifier.Companion, DateInputKt.getInputTextFieldPadding());
            startRestartGroup.startReplaceableGroup(693286680);
            ComposerKt.sourceInformation(startRestartGroup, "CC(Row)P(2,1,3)78@3913L58,79@3976L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.m655spacedBy0680j_4(TextFieldSpacing), Alignment.Companion.getTop(), startRestartGroup, i3);
            startRestartGroup.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(startRestartGroup, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Density density = (Density) consume;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume2 = startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            LayoutDirection layoutDirection = (LayoutDirection) consume2;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume3 = startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ViewConfiguration viewConfiguration = (ViewConfiguration) consume3;
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(padding);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            Composer m2893constructorimpl = Updater.m2893constructorimpl(startRestartGroup);
            Updater.m2900setimpl(m2893constructorimpl, rowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl, density, ComposeUiNode.Companion.getSetDensity());
            Updater.m2900setimpl(m2893constructorimpl, layoutDirection, ComposeUiNode.Companion.getSetLayoutDirection());
            Updater.m2900setimpl(m2893constructorimpl, viewConfiguration, ComposeUiNode.Companion.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -326682283, "C80@4021L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1849028810, "C62@2625L56,74@3193L52,63@2690L763,80@3481L54,92@4041L50,81@3544L753:DateRangeInput.kt#uh7d8r");
            String upperCase = dateInputFormat.getPatternWithDelimiters().toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            String m2058getStringNWtq285 = Strings_androidKt.m2058getStringNWtq28(Strings.Companion.m2031getDateRangePickerStartHeadlineadMyvUU(), startRestartGroup, i3);
            Modifier weight$default = RowScope.CC.weight$default(rowScopeInstance, Modifier.Companion, 0.5f, false, 2, null);
            ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(startRestartGroup, 576559191, true, new DateRangeInputKt$DateRangeInputContent$1$1(m2058getStringNWtq285, upperCase));
            ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(startRestartGroup, 1726391478, true, new DateRangeInputKt$DateRangeInputContent$1$2(upperCase));
            CalendarDate value = stateData.getSelectedStartDate().getValue();
            startRestartGroup.startReplaceableGroup(1157296644);
            String str2 = str;
            ComposerKt.sourceInformation(startRestartGroup, str2);
            boolean changed3 = startRestartGroup.changed(stateData);
            DateRangeInputKt$DateRangeInputContent$1$3$1 rememberedValue3 = startRestartGroup.rememberedValue();
            if (changed3 || rememberedValue3 == Composer.Companion.getEmpty()) {
                rememberedValue3 = new DateRangeInputKt$DateRangeInputContent$1$3$1(stateData);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            startRestartGroup.endReplaceableGroup();
            int i5 = ((i4 << 9) & 7168) | 1075315120;
            composer2 = startRestartGroup;
            DateInputKt.m1725DateInputTextFieldzm97o8M(weight$default, composableLambda, composableLambda2, stateData, value, (Function1) rememberedValue3, InputIdentifier.Companion.m1846getStartDateInputJ2x2o4M(), dateInputValidator2, dateInputFormat, locale, startRestartGroup, i5);
            String m2058getStringNWtq286 = Strings_androidKt.m2058getStringNWtq28(Strings.Companion.m2028getDateRangePickerEndHeadlineadMyvUU(), composer2, i3);
            Modifier weight$default2 = RowScope.CC.weight$default(rowScopeInstance, Modifier.Companion, 0.5f, false, 2, null);
            ComposableLambda composableLambda3 = ComposableLambdaKt.composableLambda(composer2, -663502784, true, new DateRangeInputKt$DateRangeInputContent$1$4(m2058getStringNWtq286, upperCase));
            ComposableLambda composableLambda4 = ComposableLambdaKt.composableLambda(composer2, 518729951, true, new DateRangeInputKt$DateRangeInputContent$1$5(upperCase));
            CalendarDate value2 = stateData.getSelectedEndDate().getValue();
            composer2.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(composer2, str2);
            boolean changed4 = composer2.changed(stateData);
            DateRangeInputKt$DateRangeInputContent$1$6$1 rememberedValue4 = composer2.rememberedValue();
            if (changed4 || rememberedValue4 == Composer.Companion.getEmpty()) {
                rememberedValue4 = new DateRangeInputKt$DateRangeInputContent$1$6$1(stateData);
                composer2.updateRememberedValue(rememberedValue4);
            }
            composer2.endReplaceableGroup();
            DateInputKt.m1725DateInputTextFieldzm97o8M(weight$default2, composableLambda3, composableLambda4, stateData, value2, (Function1) rememberedValue4, InputIdentifier.Companion.m1844getEndDateInputJ2x2o4M(), dateInputValidator2, dateInputFormat, locale, composer2, i5);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
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
        endRestartGroup.updateScope(new DateRangeInputKt$DateRangeInputContent$2(stateData, dateFormatter, dateValidator, i));
    }
}
