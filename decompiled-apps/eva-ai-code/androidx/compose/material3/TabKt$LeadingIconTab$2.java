package androidx.compose.material3;

import androidx.compose.foundation.Indication;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.material3.tokens.PrimaryNavigationTabTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Tab.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TabKt$LeadingIconTab$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ Function2<Composer, Integer, Unit> $icon;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Function0<Unit> $onClick;
    final /* synthetic */ Indication $ripple;
    final /* synthetic */ boolean $selected;
    final /* synthetic */ Function2<Composer, Integer, Unit> $text;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TabKt$LeadingIconTab$2(Modifier modifier, boolean z, MutableInteractionSource mutableInteractionSource, Indication indication, boolean z2, Function0<Unit> function0, Function2<? super Composer, ? super Integer, Unit> function2, int i, Function2<? super Composer, ? super Integer, Unit> function22) {
        super(2);
        this.$modifier = modifier;
        this.$selected = z;
        this.$interactionSource = mutableInteractionSource;
        this.$ripple = indication;
        this.$enabled = z2;
        this.$onClick = function0;
        this.$icon = function2;
        this.$$dirty = i;
        this.$text = function22;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        float f;
        float f2;
        float f3;
        TextStyle m5096copyCXVQc50;
        ComposerKt.sourceInformation(composer, "C171@7540L905:Tab.kt#uh7d8r");
        if ((i & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-429037564, i, -1, "androidx.compose.material3.LeadingIconTab.<anonymous> (Tab.kt:170)");
            }
            Modifier modifier = this.$modifier;
            f = TabKt.SmallTabHeight;
            Modifier m980selectableO2vRcR0 = SelectableKt.m980selectableO2vRcR0(SizeKt.m781height3ABfNKs(modifier, f), this.$selected, this.$interactionSource, this.$ripple, this.$enabled, Role.m4917boximpl(Role.Companion.m4930getTabo7Vup1c()), this.$onClick);
            f2 = TabKt.HorizontalTextPadding;
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m750paddingVpY3zN4$default(m980selectableO2vRcR0, f2, 0.0f, 2, null), 0.0f, 1, null);
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            Function2<Composer, Integer, Unit> function2 = this.$icon;
            int i2 = this.$$dirty;
            Function2<Composer, Integer, Unit> function22 = this.$text;
            composer.startReplaceableGroup(693286680);
            ComposerKt.sourceInformation(composer, "CC(Row)P(2,1,3)78@3913L58,79@3976L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getCenter(), centerVertically, composer, 54);
            composer.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(composer, "C(Layout)P(!1,2)74@2915L7,75@2970L7,76@3029L7,77@3041L460:Layout.kt#80mrfh");
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume = composer.consume(CompositionLocalsKt.getLocalDensity());
            ComposerKt.sourceInformationMarkerEnd(composer);
            Density density = (Density) consume;
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume2 = composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ComposerKt.sourceInformationMarkerEnd(composer);
            LayoutDirection layoutDirection = (LayoutDirection) consume2;
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "C:CompositionLocal.kt#9igjgp");
            Object consume3 = composer.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposerKt.sourceInformationMarkerEnd(composer);
            ViewConfiguration viewConfiguration = (ViewConfiguration) consume3;
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> materializerOf = LayoutKt.materializerOf(fillMaxWidth$default);
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            composer.disableReusing();
            Composer m2893constructorimpl = Updater.m2893constructorimpl(composer);
            Updater.m2900setimpl(m2893constructorimpl, rowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl, density, ComposeUiNode.Companion.getSetDensity());
            Updater.m2900setimpl(m2893constructorimpl, layoutDirection, ComposeUiNode.Companion.getSetLayoutDirection());
            Updater.m2900setimpl(m2893constructorimpl, viewConfiguration, ComposeUiNode.Companion.getSetViewConfiguration());
            composer.enableReusing();
            materializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(composer, -326682283, "C80@4021L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, 757417377, "C187@8152L6,188@8171L59,189@8269L10,191@8396L39:Tab.kt#uh7d8r");
            function2.invoke(composer, Integer.valueOf((i2 >> 9) & 14));
            f3 = TabKt.TextDistanceFromLeadingIcon;
            SpacerKt.Spacer(SizeKt.m792requiredWidth3ABfNKs(Modifier.Companion, f3), composer, 6);
            m5096copyCXVQc50 = r8.m5096copyCXVQc50((r46 & 1) != 0 ? r8.spanStyle.m5041getColor0d7_KjU() : 0L, (r46 & 2) != 0 ? r8.spanStyle.m5042getFontSizeXSAIIZE() : 0L, (r46 & 4) != 0 ? r8.spanStyle.getFontWeight() : null, (r46 & 8) != 0 ? r8.spanStyle.m5043getFontStyle4Lr2A7w() : null, (r46 & 16) != 0 ? r8.spanStyle.m5044getFontSynthesisZQGJjVo() : null, (r46 & 32) != 0 ? r8.spanStyle.getFontFamily() : null, (r46 & 64) != 0 ? r8.spanStyle.getFontFeatureSettings() : null, (r46 & 128) != 0 ? r8.spanStyle.m5045getLetterSpacingXSAIIZE() : 0L, (r46 & 256) != 0 ? r8.spanStyle.m5040getBaselineShift5SSeXJ0() : null, (r46 & 512) != 0 ? r8.spanStyle.getTextGeometricTransform() : null, (r46 & 1024) != 0 ? r8.spanStyle.getLocaleList() : null, (r46 & 2048) != 0 ? r8.spanStyle.m5039getBackground0d7_KjU() : 0L, (r46 & 4096) != 0 ? r8.spanStyle.getTextDecoration() : null, (r46 & 8192) != 0 ? r8.spanStyle.getShadow() : null, (r46 & 16384) != 0 ? r8.paragraphStyle.m4997getTextAlignbuA522U() : TextAlign.m5462boximpl(TextAlign.Companion.m5469getCentere0LSkKk()), (r46 & 32768) != 0 ? r8.paragraphStyle.m4999getTextDirectionmmuk1to() : null, (r46 & 65536) != 0 ? r8.paragraphStyle.m4996getLineHeightXSAIIZE() : 0L, (r46 & 131072) != 0 ? r8.paragraphStyle.getTextIndent() : null, (r46 & 262144) != 0 ? r8.platformStyle : null, (r46 & 524288) != 0 ? r8.paragraphStyle.getLineHeightStyle() : null, (r46 & 1048576) != 0 ? r8.paragraphStyle.m4994getLineBreakLgCVezo() : null, (r46 & 2097152) != 0 ? TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer, 6), PrimaryNavigationTabTokens.INSTANCE.getLabelTextFont()).paragraphStyle.m4992getHyphensEaSxIns() : null);
            TextKt.ProvideTextStyle(m5096copyCXVQc50, function22, composer, (i2 >> 3) & 112);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
