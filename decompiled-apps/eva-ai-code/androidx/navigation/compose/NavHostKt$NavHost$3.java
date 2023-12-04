package androidx.navigation.compose;

import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.navigation.NavBackStackEntry;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NavHost.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NavHostKt$NavHost$3 extends Lambda implements Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> {
    public static final NavHostKt$NavHost$3 INSTANCE = new NavHostKt$NavHost$3();

    NavHostKt$NavHost$3() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final EnterTransition invoke(AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
        return EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(700, 0, null, 6, null), 0.0f, 2, null);
    }
}
