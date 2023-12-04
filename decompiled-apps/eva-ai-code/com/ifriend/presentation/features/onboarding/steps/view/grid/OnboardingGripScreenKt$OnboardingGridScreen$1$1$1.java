package com.ifriend.presentation.features.onboarding.steps.view.grid;

import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ifriend.presentation.features.onboarding.steps.view.common.OnboardingButtonComponentsKt;
import com.ifriend.presentation.features.onboarding.steps.view.common.SelectButtonWithImageUiParams;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: OnboardingGripScreen.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/lazy/grid/LazyGridScope;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class OnboardingGripScreenKt$OnboardingGridScreen$1$1$1 extends Lambda implements Function1<LazyGridScope, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ Function1<SelectButtonWithImageUiParams, Unit> $onButtonClick;
    final /* synthetic */ OnboardingGridState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OnboardingGripScreenKt$OnboardingGridScreen$1$1$1(OnboardingGridState onboardingGridState, Function1<? super SelectButtonWithImageUiParams, Unit> function1, int i) {
        super(1);
        this.$state = onboardingGridState;
        this.$onButtonClick = function1;
        this.$$dirty = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OnboardingGripScreen.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;", FirebaseAnalytics.Param.INDEX, "", "invoke", "(Landroidx/compose/foundation/lazy/grid/LazyGridItemScope;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.onboarding.steps.view.grid.OnboardingGripScreenKt$OnboardingGridScreen$1$1$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Function4<LazyGridItemScope, Integer, Composer, Integer, Unit> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ Function1<SelectButtonWithImageUiParams, Unit> $onButtonClick;
        final /* synthetic */ OnboardingGridState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(OnboardingGridState onboardingGridState, Function1<? super SelectButtonWithImageUiParams, Unit> function1, int i) {
            super(4);
            this.$state = onboardingGridState;
            this.$onButtonClick = function1;
            this.$$dirty = i;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(LazyGridItemScope lazyGridItemScope, Integer num, Composer composer, Integer num2) {
            invoke(lazyGridItemScope, num.intValue(), composer, num2.intValue());
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v5 */
        /* JADX WARN: Type inference failed for: r9v0, types: [androidx.compose.runtime.Composer] */
        public final void invoke(LazyGridItemScope items, int i, Composer composer, int i2) {
            int i3;
            Intrinsics.checkNotNullParameter(items, "$this$items");
            if ((i2 & 112) == 0) {
                i3 = (composer.changed(i) ? 32 : 16) | i2;
            } else {
                i3 = i2;
            }
            if ((i3 & 721) != 144 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1671982578, i2, -1, "com.ifriend.presentation.features.onboarding.steps.view.grid.OnboardingGridScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OnboardingGripScreen.kt:45)");
                }
                SelectButtonWithImageUiParams selectButtonWithImageUiParams = this.$state.getButtons().get(i);
                Function1<SelectButtonWithImageUiParams, Unit> function1 = this.$onButtonClick;
                composer.startReplaceableGroup(511388516);
                ComposerKt.sourceInformation(composer, "CC(remember)P(1,2):Composables.kt#9igjgp");
                boolean changed = composer.changed(function1) | composer.changed(selectButtonWithImageUiParams);
                OnboardingGripScreenKt$OnboardingGridScreen$1$1$1$1$1$1 rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new OnboardingGripScreenKt$OnboardingGridScreen$1$1$1$1$1$1(function1, selectButtonWithImageUiParams);
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceableGroup();
                OnboardingButtonComponentsKt.OnboardingSquareSelectButton(selectButtonWithImageUiParams, rememberedValue, null, composer, 0, 4);
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
    public /* bridge */ /* synthetic */ Unit invoke(LazyGridScope lazyGridScope) {
        invoke2(lazyGridScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(LazyGridScope LazyVerticalGrid) {
        Intrinsics.checkNotNullParameter(LazyVerticalGrid, "$this$LazyVerticalGrid");
        LazyGridScope.CC.items$default(LazyVerticalGrid, this.$state.getButtons().size(), null, null, null, ComposableLambdaKt.composableLambdaInstance(-1671982578, true, new AnonymousClass1(this.$state, this.$onButtonClick, this.$$dirty)), 14, null);
    }
}
