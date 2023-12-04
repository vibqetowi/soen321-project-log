package androidx.navigation.compose;

import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NavHost.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NavHostKt$NavHost$6 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ Function1<NavGraphBuilder, Unit> $builder;
    final /* synthetic */ Alignment $contentAlignment;
    final /* synthetic */ Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> $enterTransition;
    final /* synthetic */ Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> $exitTransition;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ NavHostController $navController;
    final /* synthetic */ Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> $popEnterTransition;
    final /* synthetic */ Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> $popExitTransition;
    final /* synthetic */ String $route;
    final /* synthetic */ String $startDestination;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NavHostKt$NavHost$6(NavHostController navHostController, String str, Modifier modifier, Alignment alignment, String str2, Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends EnterTransition> function1, Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends ExitTransition> function12, Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends EnterTransition> function13, Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends ExitTransition> function14, Function1<? super NavGraphBuilder, Unit> function15, int i, int i2) {
        super(2);
        this.$navController = navHostController;
        this.$startDestination = str;
        this.$modifier = modifier;
        this.$contentAlignment = alignment;
        this.$route = str2;
        this.$enterTransition = function1;
        this.$exitTransition = function12;
        this.$popEnterTransition = function13;
        this.$popExitTransition = function14;
        this.$builder = function15;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        NavHostKt.NavHost(this.$navController, this.$startDestination, this.$modifier, this.$contentAlignment, this.$route, this.$enterTransition, this.$exitTransition, this.$popEnterTransition, this.$popExitTransition, this.$builder, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
