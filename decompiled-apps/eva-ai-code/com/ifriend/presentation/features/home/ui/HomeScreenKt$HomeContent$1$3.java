package com.ifriend.presentation.features.home.ui;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.ifriend.presentation.features.home.viewmodel.HomeViewModel;
import com.ifriend.ui.components.buttons.ButtonWidgetsKt;
import com.ifriend.ui.theme.AppTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HomeScreen.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/animation/AnimatedVisibilityScope;", "invoke", "(Landroidx/compose/animation/AnimatedVisibilityScope;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HomeScreenKt$HomeContent$1$3 extends Lambda implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ Function0<Unit> $goToConfirmEmail;
    final /* synthetic */ HomeViewModel.UiState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeScreenKt$HomeContent$1$3(Function0<Unit> function0, int i, HomeViewModel.UiState uiState) {
        super(3);
        this.$goToConfirmEmail = function0;
        this.$$dirty = i;
        this.$state = uiState;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
        invoke(animatedVisibilityScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(550497003, i, -1, "com.ifriend.presentation.features.home.ui.HomeContent.<anonymous>.<anonymous> (HomeScreen.kt:106)");
        }
        ButtonWidgetsKt.m7022AppShadowButtonWithContentBHesuOE(PaddingKt.m750paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), AppTheme.INSTANCE.getDimensions(composer, AppTheme.$stable).m7175getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, 0.0f, 0.0f, 0L, false, this.$goToConfirmEmail, 0L, ComposableLambdaKt.composableLambda(composer, 1695598967, true, new AnonymousClass1(this.$state)), composer, 100663296 | ((this.$$dirty << 9) & 3670016), FacebookRequestErrorClassification.EC_INVALID_TOKEN);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HomeScreen.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/layout/BoxScope;", "invoke", "(Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.home.ui.HomeScreenKt$HomeContent$1$3$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Function3<BoxScope, Composer, Integer, Unit> {
        final /* synthetic */ HomeViewModel.UiState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(HomeViewModel.UiState uiState) {
            super(3);
            this.$state = uiState;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer, Integer num) {
            invoke(boxScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(BoxScope AppShadowButtonWithContent, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(AppShadowButtonWithContent, "$this$AppShadowButtonWithContent");
            if ((i & 81) != 16 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1695598967, i, -1, "com.ifriend.presentation.features.home.ui.HomeContent.<anonymous>.<anonymous>.<anonymous> (HomeScreen.kt:112)");
                }
                HomeScreenKt.ConfirmEmailContent(PaddingKt.m748padding3ABfNKs(Modifier.Companion, AppTheme.INSTANCE.getDimensions(composer, AppTheme.$stable).m7175getMediumD9Ej5fM()), this.$state.isShowConfirmEmailGift(), composer, 0, 0);
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
