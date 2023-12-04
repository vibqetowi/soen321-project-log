package com.ifriend.presentation.features.onboarding.steps.view.selectbot;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.pager.PagerScope;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.unit.Dp;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ifriend.presentation.features.onboarding.steps.view.selectbot.OnboardingBotPagerState;
import com.ifriend.ui.features.pager.HorizontalSelectChatPageContentKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: OnboardingBotPagerScreen.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/pager/PagerScope;", "page", "", "invoke", "(Landroidx/compose/foundation/pager/PagerScope;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OnboardingBotPagerScreenKt$OnboardingSelectBotPager$1 extends Lambda implements Function4<PagerScope, Integer, Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ List<OnboardingBotPagerState.Bot> $bots;
    final /* synthetic */ float $horizontalContentPadding;
    final /* synthetic */ PagerState $pagerState;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingBotPagerScreenKt$OnboardingSelectBotPager$1(List<OnboardingBotPagerState.Bot> list, float f, PagerState pagerState, int i) {
        super(4);
        this.$bots = list;
        this.$horizontalContentPadding = f;
        this.$pagerState = pagerState;
        this.$$dirty = i;
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Unit invoke(PagerScope pagerScope, Integer num, Composer composer, Integer num2) {
        invoke(pagerScope, num.intValue(), composer, num2.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(PagerScope HorizontalPager, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(HorizontalPager, "$this$HorizontalPager");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-104563301, i2, -1, "com.ifriend.presentation.features.onboarding.steps.view.selectbot.OnboardingSelectBotPager.<anonymous> (OnboardingBotPagerScreen.kt:132)");
        }
        HorizontalSelectChatPageContentKt.m7081HorizontalSelectChatPageContentfozQRw(null, 0L, 0L, false, this.$horizontalContentPadding, ComposableLambdaKt.composableLambda(composer, 1688860106, true, new AnonymousClass1(this.$pagerState, i, this.$$dirty, i2, this.$bots.get(i))), composer, 199680, 7);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OnboardingBotPagerScreen.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u000b¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/layout/BoxScope;", "maxWidth", "Landroidx/compose/ui/unit/Dp;", ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, "invoke-73KfpEQ", "(Landroidx/compose/foundation/layout/BoxScope;FFLandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.onboarding.steps.view.selectbot.OnboardingBotPagerScreenKt$OnboardingSelectBotPager$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Function5<BoxScope, Dp, Dp, Composer, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$dirty;
        final /* synthetic */ OnboardingBotPagerState.Bot $bot;
        final /* synthetic */ int $page;
        final /* synthetic */ PagerState $pagerState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PagerState pagerState, int i, int i2, int i3, OnboardingBotPagerState.Bot bot) {
            super(5);
            this.$pagerState = pagerState;
            this.$page = i;
            this.$$dirty = i2;
            this.$$changed = i3;
            this.$bot = bot;
        }

        @Override // kotlin.jvm.functions.Function5
        public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Dp dp, Dp dp2, Composer composer, Integer num) {
            m6944invoke73KfpEQ(boxScope, dp.m5621unboximpl(), dp2.m5621unboximpl(), composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-73KfpEQ  reason: not valid java name */
        public final void m6944invoke73KfpEQ(BoxScope HorizontalSelectChatPageContent, float f, float f2, Composer composer, int i) {
            int i2;
            Intrinsics.checkNotNullParameter(HorizontalSelectChatPageContent, "$this$HorizontalSelectChatPageContent");
            if ((i & 112) == 0) {
                i2 = (composer.changed(f) ? 32 : 16) | i;
            } else {
                i2 = i;
            }
            if ((i & 896) == 0) {
                i2 |= composer.changed(f2) ? 256 : 128;
            }
            if ((i2 & 5841) != 1168 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1688860106, i, -1, "com.ifriend.presentation.features.onboarding.steps.view.selectbot.OnboardingSelectBotPager.<anonymous>.<anonymous> (OnboardingBotPagerScreen.kt:138)");
                }
                Modifier m781height3ABfNKs = SizeKt.m781height3ABfNKs(SizeKt.m800width3ABfNKs(Modifier.Companion, f), f2);
                PagerState pagerState = this.$pagerState;
                Integer valueOf = Integer.valueOf(this.$page);
                PagerState pagerState2 = this.$pagerState;
                int i3 = this.$page;
                composer.startReplaceableGroup(511388516);
                ComposerKt.sourceInformation(composer, "CC(remember)P(1,2):Composables.kt#9igjgp");
                boolean changed = composer.changed(pagerState) | composer.changed(valueOf);
                OnboardingBotPagerScreenKt$OnboardingSelectBotPager$1$1$1$1 rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new OnboardingBotPagerScreenKt$OnboardingSelectBotPager$1$1$1$1(pagerState2, i3);
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceableGroup();
                HorizontalSelectChatPageContentKt.SelectChatAvatarContent(GraphicsLayerModifierKt.graphicsLayer(m781height3ABfNKs, (Function1) rememberedValue), this.$bot.getImageUrl(), composer, 0);
                HorizontalSelectChatPageContentKt.SelectChatAvatarContent(this.$bot.getName(), this.$bot.getLogoUrl(), this.$bot.isVerified(), composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    }
}
