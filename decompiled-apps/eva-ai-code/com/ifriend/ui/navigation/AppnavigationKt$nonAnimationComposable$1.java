package com.ifriend.ui.navigation;

import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.EnterTransition;
import androidx.navigation.NavBackStackEntry;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: appnavigation.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/animation/EnterTransition;", "Landroidx/compose/animation/AnimatedContentTransitionScope;", "Landroidx/navigation/NavBackStackEntry;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final class AppnavigationKt$nonAnimationComposable$1 extends Lambda implements Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> {
    public static final AppnavigationKt$nonAnimationComposable$1 INSTANCE = new AppnavigationKt$nonAnimationComposable$1();

    AppnavigationKt$nonAnimationComposable$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final EnterTransition invoke(AnimatedContentTransitionScope<NavBackStackEntry> composable) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        return EnterTransition.Companion.getNone();
    }
}
