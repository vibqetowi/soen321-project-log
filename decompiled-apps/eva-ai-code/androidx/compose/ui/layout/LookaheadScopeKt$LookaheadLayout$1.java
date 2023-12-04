package androidx.compose.ui.layout;

import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LookaheadScope.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/LookaheadScope;", "invoke", "(Landroidx/compose/ui/layout/LookaheadScope;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LookaheadScopeKt$LookaheadLayout$1 extends Lambda implements Function3<LookaheadScope, Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ Function3<LookaheadScope, Composer, Integer, Unit> $content;
    final /* synthetic */ MeasurePolicy $measurePolicy;
    final /* synthetic */ Modifier $modifier;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LookaheadScopeKt$LookaheadLayout$1(Modifier modifier, MeasurePolicy measurePolicy, int i, Function3<? super LookaheadScope, ? super Composer, ? super Integer, Unit> function3) {
        super(3);
        this.$modifier = modifier;
        this.$measurePolicy = measurePolicy;
        this.$$dirty = i;
        this.$content = function3;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(LookaheadScope lookaheadScope, Composer composer, Integer num) {
        invoke(lookaheadScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(LookaheadScope LookaheadScope, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(LookaheadScope, "$this$LookaheadScope");
        ComposerKt.sourceInformation(composer, "C52@1918L129:LookaheadScope.kt#80mrfh");
        if ((i & 14) == 0) {
            i |= composer.changed(LookaheadScope) ? 4 : 2;
        }
        if ((i & 91) != 18 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1705879204, i, -1, "androidx.compose.ui.layout.LookaheadLayout.<anonymous> (LookaheadScope.kt:51)");
            }
            Function3<LookaheadScope, Composer, Integer, Unit> function3 = this.$content;
            int i2 = this.$$dirty;
            Modifier modifier = this.$modifier;
            MeasurePolicy measurePolicy = this.$measurePolicy;
            composer.startReplaceableGroup(-1323940314);
            ComposerKt.sourceInformation(composer, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier);
            int i3 = ((((i2 & 112) | (i2 & 896)) << 9) & 7168) | 6;
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
            Updater.m2900setimpl(m2893constructorimpl, measurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m2900setimpl(m2893constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (m2893constructorimpl.getInserting() || !Intrinsics.areEqual(m2893constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m2893constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m2893constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(SkippableUpdater.m2884boximpl(SkippableUpdater.m2885constructorimpl(composer)), composer, Integer.valueOf((i3 >> 3) & 112));
            composer.startReplaceableGroup(2058660585);
            ComposerKt.sourceInformationMarkerStart(composer, -1525351009, "C53@1950L9:LookaheadScope.kt#80mrfh");
            function3.invoke(LookaheadScope, composer, Integer.valueOf((i & 14) | ((i2 << 3) & 112)));
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endReplaceableGroup();
            composer.endNode();
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
