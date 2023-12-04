package androidx.navigation.compose;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.runtime.State;
import androidx.navigation.NavBackStackEntry;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NavHost.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/animation/ContentTransform;", "Landroidx/compose/animation/AnimatedContentTransitionScope;", "Landroidx/navigation/NavBackStackEntry;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NavHostKt$NavHost$12 extends Lambda implements Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ContentTransform> {
    final /* synthetic */ ComposeNavigator $composeNavigator;
    final /* synthetic */ Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> $finalEnter;
    final /* synthetic */ Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> $finalExit;
    final /* synthetic */ State<List<NavBackStackEntry>> $visibleEntries$delegate;
    final /* synthetic */ Map<String, Float> $zIndices;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NavHostKt$NavHost$12(Map<String, Float> map, ComposeNavigator composeNavigator, Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends EnterTransition> function1, Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends ExitTransition> function12, State<? extends List<NavBackStackEntry>> state) {
        super(1);
        this.$zIndices = map;
        this.$composeNavigator = composeNavigator;
        this.$finalEnter = function1;
        this.$finalExit = function12;
        this.$visibleEntries$delegate = state;
    }

    @Override // kotlin.jvm.functions.Function1
    public final ContentTransform invoke(AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
        List NavHost$lambda$10;
        float f;
        NavHost$lambda$10 = NavHostKt.NavHost$lambda$10(this.$visibleEntries$delegate);
        if (NavHost$lambda$10.contains(animatedContentTransitionScope.getInitialState())) {
            Float f2 = this.$zIndices.get(animatedContentTransitionScope.getInitialState().getId());
            if (f2 != null) {
                f = f2.floatValue();
            } else {
                this.$zIndices.put(animatedContentTransitionScope.getInitialState().getId(), Float.valueOf(0.0f));
                f = 0.0f;
            }
            if (!Intrinsics.areEqual(animatedContentTransitionScope.getTargetState().getId(), animatedContentTransitionScope.getInitialState().getId())) {
                f = this.$composeNavigator.isPop$navigation_compose_release().getValue().booleanValue() ? f - 1.0f : f + 1.0f;
            }
            float f3 = f;
            this.$zIndices.put(animatedContentTransitionScope.getTargetState().getId(), Float.valueOf(f3));
            return new ContentTransform(this.$finalEnter.invoke(animatedContentTransitionScope), this.$finalExit.invoke(animatedContentTransitionScope), f3, null, 8, null);
        }
        return AnimatedContentKt.togetherWith(EnterTransition.Companion.getNone(), ExitTransition.Companion.getNone());
    }
}
