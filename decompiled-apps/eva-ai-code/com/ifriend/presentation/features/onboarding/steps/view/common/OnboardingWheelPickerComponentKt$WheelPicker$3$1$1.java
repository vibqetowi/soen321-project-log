package com.ifriend.presentation.features.onboarding.steps.view.common;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpSize;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: OnboardingWheelPickerComponent.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/lazy/LazyListScope;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OnboardingWheelPickerComponentKt$WheelPicker$3$1$1 extends Lambda implements Function1<LazyListScope, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ Function4<LazyItemScope, Integer, Composer, Integer, Unit> $content;
    final /* synthetic */ int $count;
    final /* synthetic */ LazyListState $lazyListState;
    final /* synthetic */ int $rowCount;
    final /* synthetic */ long $size;
    final /* synthetic */ LazyListSnapperLayoutInfo $snapperLayoutInfo;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OnboardingWheelPickerComponentKt$WheelPicker$3$1$1(int i, long j, int i2, LazyListState lazyListState, LazyListSnapperLayoutInfo lazyListSnapperLayoutInfo, int i3, Function4<? super LazyItemScope, ? super Integer, ? super Composer, ? super Integer, Unit> function4) {
        super(1);
        this.$count = i;
        this.$size = j;
        this.$rowCount = i2;
        this.$lazyListState = lazyListState;
        this.$snapperLayoutInfo = lazyListSnapperLayoutInfo;
        this.$$dirty = i3;
        this.$content = function4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OnboardingWheelPickerComponent.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/lazy/LazyItemScope;", FirebaseAnalytics.Param.INDEX, "", "invoke", "(Landroidx/compose/foundation/lazy/LazyItemScope;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.onboarding.steps.view.common.OnboardingWheelPickerComponentKt$WheelPicker$3$1$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ Function4<LazyItemScope, Integer, Composer, Integer, Unit> $content;
        final /* synthetic */ LazyListState $lazyListState;
        final /* synthetic */ int $rowCount;
        final /* synthetic */ long $size;
        final /* synthetic */ LazyListSnapperLayoutInfo $snapperLayoutInfo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(long j, int i, LazyListState lazyListState, LazyListSnapperLayoutInfo lazyListSnapperLayoutInfo, int i2, Function4<? super LazyItemScope, ? super Integer, ? super Composer, ? super Integer, Unit> function4) {
            super(4);
            this.$size = j;
            this.$rowCount = i;
            this.$lazyListState = lazyListState;
            this.$snapperLayoutInfo = lazyListSnapperLayoutInfo;
            this.$$dirty = i2;
            this.$content = function4;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
            invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope items, int i, Composer composer, int i2) {
            int i3;
            float calculateAnimatedAlpha;
            Intrinsics.checkNotNullParameter(items, "$this$items");
            if ((i2 & 14) == 0) {
                i3 = (composer.changed(items) ? 4 : 2) | i2;
            } else {
                i3 = i2;
            }
            if ((i2 & 112) == 0) {
                i3 |= composer.changed(i) ? 32 : 16;
            }
            if ((i3 & 731) != 146 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1558040846, i3, -1, "com.ifriend.presentation.features.onboarding.steps.view.common.WheelPicker.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OnboardingWheelPickerComponent.kt:127)");
                }
                Modifier m800width3ABfNKs = SizeKt.m800width3ABfNKs(SizeKt.m781height3ABfNKs(Modifier.Companion, Dp.m5607constructorimpl(DpSize.m5703getHeightD9Ej5fM(this.$size) / this.$rowCount)), DpSize.m5705getWidthD9Ej5fM(this.$size));
                calculateAnimatedAlpha = OnboardingWheelPickerComponentKt.calculateAnimatedAlpha(this.$lazyListState, this.$snapperLayoutInfo, i, this.$rowCount, composer, ((i3 << 3) & 896) | (this.$$dirty & 7168));
                Modifier alpha = AlphaKt.alpha(m800width3ABfNKs, calculateAnimatedAlpha);
                Alignment center = Alignment.Companion.getCenter();
                Function4<LazyItemScope, Integer, Composer, Integer, Unit> function4 = this.$content;
                int i4 = this.$$dirty;
                composer.startReplaceableGroup(733328855);
                ComposerKt.sourceInformation(composer, "CC(Box)P(2,1,3)69@3214L67,70@3286L130:Box.kt#2w3rfo");
                MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer, 6);
                composer.startReplaceableGroup(-1323940314);
                ComposerKt.sourceInformation(composer, "CC(Layout)P(!1,2)77@3132L23,79@3222L420:Layout.kt#80mrfh");
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(alpha);
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
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                function4.invoke(items, Integer.valueOf(i), composer, Integer.valueOf((i3 & 14) | (i3 & 112) | ((i4 >> 15) & 896)));
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

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(LazyListScope lazyListScope) {
        invoke2(lazyListScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyListScope.CC.items$default(LazyColumn, this.$count, null, null, ComposableLambdaKt.composableLambdaInstance(1558040846, true, new AnonymousClass1(this.$size, this.$rowCount, this.$lazyListState, this.$snapperLayoutInfo, this.$$dirty, this.$content)), 6, null);
    }
}
