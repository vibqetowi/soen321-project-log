package androidx.navigation.compose;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.compose.ComposeNavigator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NavHost.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "Landroidx/compose/animation/AnimatedContentScope;", "it", "Landroidx/navigation/NavBackStackEntry;", "invoke", "(Landroidx/compose/animation/AnimatedContentScope;Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NavHostKt$NavHost$14 extends Lambda implements Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit> {
    final /* synthetic */ ComposeNavigator $composeNavigator;
    final /* synthetic */ SaveableStateHolder $saveableStateHolder;
    final /* synthetic */ State<List<NavBackStackEntry>> $visibleEntries$delegate;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NavHostKt$NavHost$14(ComposeNavigator composeNavigator, SaveableStateHolder saveableStateHolder, State<? extends List<NavBackStackEntry>> state) {
        super(4);
        this.$composeNavigator = composeNavigator;
        this.$saveableStateHolder = saveableStateHolder;
        this.$visibleEntries$delegate = state;
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, Integer num) {
        invoke(animatedContentScope, navBackStackEntry, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, int i) {
        List<NavBackStackEntry> NavHost$lambda$10;
        NavBackStackEntry navBackStackEntry2;
        ComposerKt.sourceInformation(composer, "C308@13218L7,317@13619L180:NavHost.kt#opm8kd");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1440061047, i, -1, "androidx.navigation.compose.NavHost.<anonymous> (NavHost.kt:308)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(InspectionModeKt.getLocalInspectionMode());
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (!((Boolean) consume).booleanValue()) {
            NavHost$lambda$10 = NavHostKt.NavHost$lambda$10(this.$visibleEntries$delegate);
        } else {
            NavHost$lambda$10 = this.$composeNavigator.getBackStack().getValue();
        }
        ListIterator<NavBackStackEntry> listIterator = NavHost$lambda$10.listIterator(NavHost$lambda$10.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                navBackStackEntry2 = null;
                break;
            }
            navBackStackEntry2 = listIterator.previous();
            if (Intrinsics.areEqual(navBackStackEntry, navBackStackEntry2)) {
                break;
            }
        }
        NavBackStackEntry navBackStackEntry3 = navBackStackEntry2;
        if (navBackStackEntry3 != null) {
            NavBackStackEntryProviderKt.LocalOwnersProvider(navBackStackEntry3, this.$saveableStateHolder, ComposableLambdaKt.composableLambda(composer, -1425390790, true, new AnonymousClass1(navBackStackEntry3, animatedContentScope)), composer, 456);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NavHost.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.navigation.compose.NavHostKt$NavHost$14$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ NavBackStackEntry $currentEntry;
        final /* synthetic */ AnimatedContentScope $this_AnimatedContent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(NavBackStackEntry navBackStackEntry, AnimatedContentScope animatedContentScope) {
            super(2);
            this.$currentEntry = navBackStackEntry;
            this.$this_AnimatedContent = animatedContentScope;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C319@13758L27:NavHost.kt#opm8kd");
            if ((i & 11) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1425390790, i, -1, "androidx.navigation.compose.NavHost.<anonymous>.<anonymous> (NavHost.kt:318)");
                }
                NavDestination destination = this.$currentEntry.getDestination();
                Intrinsics.checkNotNull(destination, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                ((ComposeNavigator.Destination) destination).getContent$navigation_compose_release().invoke(this.$this_AnimatedContent, this.$currentEntry, composer, 72);
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
