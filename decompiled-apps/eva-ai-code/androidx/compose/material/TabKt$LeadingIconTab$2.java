package androidx.compose.material;

import androidx.compose.foundation.Indication;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Tab.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
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
        TextStyle m5100copyv2rsoow;
        ComposerKt.sourceInformation(composer, "C168@7493L843:Tab.kt#jmzs0o");
        if ((i & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(866677691, i, -1, "androidx.compose.material.LeadingIconTab.<anonymous> (Tab.kt:167)");
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
            ComposerKt.sourceInformation(composer, "CC(Row)P(2,1,3)76@3779L58,77@3842L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getCenter(), centerVertically, composer, 54);
            composer.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(composer, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(fillMaxWidth$default);
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer m2893constructorimpl = Updater.m2893constructorimpl(composer);
            Updater.m2900setimpl(m2893constructorimpl, rowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (m2893constructorimpl.getInserting() || !Intrinsics.areEqual(m2893constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(composer, -326682417, "C78@3887L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, 106889743, "C184@8105L6,185@8124L59,186@8222L10,187@8287L39:Tab.kt#jmzs0o");
            function2.invoke(composer, Integer.valueOf((i2 >> 9) & 14));
            f3 = TabKt.TextDistanceFromLeadingIcon;
            SpacerKt.Spacer(SizeKt.m792requiredWidth3ABfNKs(Modifier.Companion, f3), composer, 6);
            m5100copyv2rsoow = r8.m5100copyv2rsoow((r48 & 1) != 0 ? r8.spanStyle.m5041getColor0d7_KjU() : 0L, (r48 & 2) != 0 ? r8.spanStyle.m5042getFontSizeXSAIIZE() : 0L, (r48 & 4) != 0 ? r8.spanStyle.getFontWeight() : null, (r48 & 8) != 0 ? r8.spanStyle.m5043getFontStyle4Lr2A7w() : null, (r48 & 16) != 0 ? r8.spanStyle.m5044getFontSynthesisZQGJjVo() : null, (r48 & 32) != 0 ? r8.spanStyle.getFontFamily() : null, (r48 & 64) != 0 ? r8.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? r8.spanStyle.m5045getLetterSpacingXSAIIZE() : 0L, (r48 & 256) != 0 ? r8.spanStyle.m5040getBaselineShift5SSeXJ0() : null, (r48 & 512) != 0 ? r8.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? r8.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? r8.spanStyle.m5039getBackground0d7_KjU() : 0L, (r48 & 4096) != 0 ? r8.spanStyle.getTextDecoration() : null, (r48 & 8192) != 0 ? r8.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? r8.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? r8.paragraphStyle.m4997getTextAlignbuA522U() : TextAlign.m5462boximpl(TextAlign.Companion.m5469getCentere0LSkKk()), (r48 & 65536) != 0 ? r8.paragraphStyle.m4999getTextDirectionmmuk1to() : null, (r48 & 131072) != 0 ? r8.paragraphStyle.m4996getLineHeightXSAIIZE() : 0L, (r48 & 262144) != 0 ? r8.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? r8.platformStyle : null, (r48 & 1048576) != 0 ? r8.paragraphStyle.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? r8.paragraphStyle.m4994getLineBreakLgCVezo() : null, (r48 & 4194304) != 0 ? r8.paragraphStyle.m4992getHyphensEaSxIns() : null, (r48 & 8388608) != 0 ? MaterialTheme.INSTANCE.getTypography(composer, 6).getButton().paragraphStyle.getTextMotion() : null);
            TextKt.ProvideTextStyle(m5100copyv2rsoow, function22, composer, (i2 >> 3) & 112);
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
