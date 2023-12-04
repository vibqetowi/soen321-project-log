package com.ifriend.presentation.features.purchases.premium.screen;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.compose.ConstrainedLayoutReference;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.core.location.LocationRequestCompat;
import com.ifriend.presentation.R;
import com.ifriend.presentation.features.purchases.premium.viewmodel.BuyPremiumViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* compiled from: ConstraintLayout.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BuyPremiumScreenKt$BuyPremiumScreen$$inlined$ConstraintLayout$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$dirty$inlined;
    final /* synthetic */ BuyPremiumClicks $clicks$inlined;
    final /* synthetic */ Function0 $onHelpersChanged;
    final /* synthetic */ ConstraintLayoutScope $scope;
    final /* synthetic */ BuyPremiumViewModel.UiState $state$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyPremiumScreenKt$BuyPremiumScreen$$inlined$ConstraintLayout$2(ConstraintLayoutScope constraintLayoutScope, int i, Function0 function0, BuyPremiumViewModel.UiState uiState, BuyPremiumClicks buyPremiumClicks, int i2) {
        super(2);
        this.$scope = constraintLayoutScope;
        this.$onHelpersChanged = function0;
        this.$state$inlined = uiState;
        this.$clicks$inlined = buyPremiumClicks;
        this.$$dirty$inlined = i2;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        Brush foregroundGradient;
        long j;
        if (((i & 11) ^ 2) != 0 || !composer.getSkipping()) {
            int helpersHashCode = this.$scope.getHelpersHashCode();
            this.$scope.reset();
            ConstraintLayoutScope constraintLayoutScope = this.$scope;
            ConstraintLayoutScope.ConstrainedLayoutReferences createRefs = constraintLayoutScope.createRefs();
            ConstrainedLayoutReference component1 = createRefs.component1();
            ConstrainedLayoutReference component2 = createRefs.component2();
            ConstrainedLayoutReference component3 = createRefs.component3();
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.bg_buy_premium, composer, 0), (String) null, constraintLayoutScope.constrainAs(Modifier.Companion, component1, BuyPremiumScreenKt$BuyPremiumScreen$1$1.INSTANCE), (Alignment) null, ContentScale.Companion.getFillWidth(), 0.0f, (ColorFilter) null, composer, 24632, (int) LocationRequestCompat.QUALITY_LOW_POWER);
            Modifier m781height3ABfNKs = SizeKt.m781height3ABfNKs(Modifier.Companion, Dp.m5607constructorimpl(150));
            foregroundGradient = BuyPremiumScreenKt.getForegroundGradient();
            Modifier background$default = BackgroundKt.background$default(m781height3ABfNKs, foregroundGradient, null, 0.0f, 6, null);
            composer.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean changed = composer.changed(component1);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = (Function1) new BuyPremiumScreenKt$BuyPremiumScreen$1$2$1(component1);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            BoxKt.Box(constraintLayoutScope.constrainAs(background$default, component2, (Function1) rememberedValue), composer, 0);
            j = BuyPremiumScreenKt.foregroundColor;
            Modifier m421backgroundbw27NRU$default = BackgroundKt.m421backgroundbw27NRU$default(Modifier.Companion, j, null, 2, null);
            composer.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean changed2 = composer.changed(component1);
            Object rememberedValue2 = composer.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = (Function1) new BuyPremiumScreenKt$BuyPremiumScreen$1$3$1(component1);
                composer.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceableGroup();
            BoxKt.Box(constraintLayoutScope.constrainAs(m421backgroundbw27NRU$default, component3, (Function1) rememberedValue2), composer, 0);
            BuyPremiumScreenKt.BuyPremiumPlansScreen(this.$state$inlined, this.$clicks$inlined, composer, (this.$$dirty$inlined & 112) | 8);
            AnimatedVisibilityKt.AnimatedVisibility(this.$state$inlined.isLoading(), (Modifier) null, EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null), (String) null, ComposableSingletons$BuyPremiumScreenKt.INSTANCE.m6993getLambda1$presentation_release(), composer, 200064, 18);
            if (this.$scope.getHelpersHashCode() != helpersHashCode) {
                this.$onHelpersChanged.invoke();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
