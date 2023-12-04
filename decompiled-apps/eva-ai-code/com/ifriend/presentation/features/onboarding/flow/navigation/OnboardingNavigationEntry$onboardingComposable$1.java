package com.ifriend.presentation.features.onboarding.flow.navigation;

import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.navigation.NavBackStackEntry;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: OnboardingNavigationEntry.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/animation/EnterTransition;", "Landroidx/compose/animation/AnimatedContentTransitionScope;", "Landroidx/navigation/NavBackStackEntry;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OnboardingNavigationEntry$onboardingComposable$1 extends Lambda implements Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> {
    public static final OnboardingNavigationEntry$onboardingComposable$1 INSTANCE = new OnboardingNavigationEntry$onboardingComposable$1();

    OnboardingNavigationEntry$onboardingComposable$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final EnterTransition invoke(AnimatedContentTransitionScope<NavBackStackEntry> composable) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        return EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween(500, 100, EasingKt.getFastOutSlowInEasing()), 0.0f, 2, null);
    }
}
