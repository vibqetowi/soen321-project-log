package com.ifriend.ui.components.buttons;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
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
import androidx.compose.ui.unit.Dp;
import com.ifriend.ui.components.shadow.ShadowKt;
import com.ifriend.ui.theme.AppColors;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ButtonWidgets.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ButtonWidgetsKt$AppShadowButtonWithContent$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ long $backgroundColor;
    final /* synthetic */ long $color;
    final /* synthetic */ Function3<BoxScope, Composer, Integer, Unit> $content;
    final /* synthetic */ float $radius;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ButtonWidgetsKt$AppShadowButtonWithContent$1(long j, float f, long j2, Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> function3, int i) {
        super(2);
        this.$backgroundColor = j;
        this.$radius = f;
        this.$color = j2;
        this.$content = function3;
        this.$$dirty = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        Modifier m7069innerShadowhy0AmR8;
        if ((i & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1208755593, i, -1, "com.ifriend.ui.components.buttons.AppShadowButtonWithContent.<anonymous> (ButtonWidgets.kt:69)");
            }
            Modifier m420backgroundbw27NRU = BackgroundKt.m420backgroundbw27NRU(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), this.$backgroundColor, RoundedCornerShapeKt.m1009RoundedCornerShape0680j_4(this.$radius));
            float m5607constructorimpl = Dp.m5607constructorimpl(6);
            float f = (float) 0.5d;
            float m5607constructorimpl2 = Dp.m5607constructorimpl(f);
            m7069innerShadowhy0AmR8 = ShadowKt.m7069innerShadowhy0AmR8(m420backgroundbw27NRU, (r16 & 1) != 0 ? AppColors.Companion.m7142getViolet0d7_KjU() : this.$color, (r16 & 2) != 0 ? Dp.m5607constructorimpl(0) : this.$radius, (r16 & 4) != 0 ? Dp.m5607constructorimpl(0) : 0.0f, (r16 & 8) != 0 ? Dp.m5607constructorimpl(0) : m5607constructorimpl, (r16 & 16) != 0 ? Dp.m5607constructorimpl(0) : Dp.m5607constructorimpl(f), (r16 & 32) != 0 ? Dp.m5607constructorimpl(0) : m5607constructorimpl2);
            Modifier m7024innerButtonGradientTIErZ5U$default = ButtonWidgetsKt.m7024innerButtonGradientTIErZ5U$default(m7069innerShadowhy0AmR8, this.$color, 0.7f, this.$radius, 0.0f, 0.0f, 24, null);
            Alignment center = Alignment.Companion.getCenter();
            Function3<BoxScope, Composer, Integer, Unit> function3 = this.$content;
            int i2 = this.$$dirty;
            composer.startReplaceableGroup(733328855);
            ComposerKt.sourceInformation(composer, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer, 6);
            composer.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(composer, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m7024innerButtonGradientTIErZ5U$default);
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
            Updater.m2900setimpl(m2893constructorimpl, rememberBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (m2893constructorimpl.getInserting() || !Intrinsics.areEqual(m2893constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(composer, -1253629358, "C71@3331L9:Box.kt#2w3rfo");
            function3.invoke(BoxScopeInstance.INSTANCE, composer, Integer.valueOf(6 | ((i2 >> 21) & 112)));
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
