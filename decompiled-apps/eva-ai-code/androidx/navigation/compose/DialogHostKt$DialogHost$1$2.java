package androidx.navigation.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.compose.DialogNavigator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* compiled from: DialogHost.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
final class DialogHostKt$DialogHost$1$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ NavBackStackEntry $backStackEntry;
    final /* synthetic */ DialogNavigator.Destination $destination;
    final /* synthetic */ DialogNavigator $dialogNavigator;
    final /* synthetic */ SaveableStateHolder $saveableStateHolder;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogHostKt$DialogHost$1$2(NavBackStackEntry navBackStackEntry, SaveableStateHolder saveableStateHolder, DialogNavigator dialogNavigator, DialogNavigator.Destination destination) {
        super(2);
        this.$backStackEntry = navBackStackEntry;
        this.$saveableStateHolder = saveableStateHolder;
        this.$dialogNavigator = dialogNavigator;
        this.$destination = destination;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DialogHost.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/runtime/DisposableEffectResult;", "Landroidx/compose/runtime/DisposableEffectScope;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.navigation.compose.DialogHostKt$DialogHost$1$2$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {
        final /* synthetic */ NavBackStackEntry $backStackEntry;
        final /* synthetic */ DialogNavigator $dialogNavigator;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(DialogNavigator dialogNavigator, NavBackStackEntry navBackStackEntry) {
            super(1);
            this.$dialogNavigator = dialogNavigator;
            this.$backStackEntry = navBackStackEntry;
        }

        @Override // kotlin.jvm.functions.Function1
        public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
            final DialogNavigator dialogNavigator = this.$dialogNavigator;
            final NavBackStackEntry navBackStackEntry = this.$backStackEntry;
            return new DisposableEffectResult() { // from class: androidx.navigation.compose.DialogHostKt$DialogHost$1$2$1$invoke$$inlined$onDispose$1
                @Override // androidx.compose.runtime.DisposableEffectResult
                public void dispose() {
                    DialogNavigator.this.onTransitionComplete$navigation_compose_release(navBackStackEntry);
                }
            };
        }
    }

    public final void invoke(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C51@2131L167,59@2474L108:DialogHost.kt#opm8kd");
        if ((i & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1129586364, i, -1, "androidx.navigation.compose.DialogHost.<anonymous>.<anonymous> (DialogHost.kt:51)");
            }
            EffectsKt.DisposableEffect(this.$backStackEntry, new AnonymousClass1(this.$dialogNavigator, this.$backStackEntry), composer, 8);
            NavBackStackEntryProviderKt.LocalOwnersProvider(this.$backStackEntry, this.$saveableStateHolder, ComposableLambdaKt.composableLambda(composer, -497631156, true, new AnonymousClass2(this.$destination, this.$backStackEntry)), composer, 456);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DialogHost.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.navigation.compose.DialogHostKt$DialogHost$1$2$2  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass2 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ NavBackStackEntry $backStackEntry;
        final /* synthetic */ DialogNavigator.Destination $destination;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(DialogNavigator.Destination destination, NavBackStackEntry navBackStackEntry) {
            super(2);
            this.$destination = destination;
            this.$backStackEntry = navBackStackEntry;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            ComposerKt.sourceInformation(composer, "C60@2545L23:DialogHost.kt#opm8kd");
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-497631156, i, -1, "androidx.navigation.compose.DialogHost.<anonymous>.<anonymous>.<anonymous> (DialogHost.kt:60)");
            }
            this.$destination.getContent$navigation_compose_release().invoke(this.$backStackEntry, composer, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }
}
