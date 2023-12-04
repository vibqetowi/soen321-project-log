package androidx.navigation;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.Sequence;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NavController.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/navigation/NavOptionsBuilder;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NavController$handleDeepLink$2 extends Lambda implements Function1<NavOptionsBuilder, Unit> {
    final /* synthetic */ NavDestination $node;
    final /* synthetic */ NavController this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavController$handleDeepLink$2(NavDestination navDestination, NavController navController) {
        super(1);
        this.$node = navDestination;
        this.this$0 = navController;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NavController.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/navigation/AnimBuilder;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.navigation.NavController$handleDeepLink$2$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends Lambda implements Function1<AnimBuilder, Unit> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AnimBuilder animBuilder) {
            invoke2(animBuilder);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(AnimBuilder anim) {
            Intrinsics.checkNotNullParameter(anim, "$this$anim");
            anim.setEnter(0);
            anim.setExit(0);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(NavOptionsBuilder navOptionsBuilder) {
        invoke2(navOptionsBuilder);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(NavOptionsBuilder navOptions) {
        boolean z;
        boolean z2;
        Intrinsics.checkNotNullParameter(navOptions, "$this$navOptions");
        navOptions.anim(AnonymousClass1.INSTANCE);
        boolean z3 = false;
        if (this.$node instanceof NavGraph) {
            Sequence<NavDestination> hierarchy = NavDestination.Companion.getHierarchy(this.$node);
            NavController navController = this.this$0;
            Iterator<NavDestination> it = hierarchy.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z2 = true;
                    break;
                }
                NavDestination next = it.next();
                NavDestination currentDestination = navController.getCurrentDestination();
                if (Intrinsics.areEqual(next, currentDestination != null ? currentDestination.getParent() : null)) {
                    z2 = false;
                    break;
                }
            }
            if (z2) {
                z3 = true;
            }
        }
        if (z3) {
            z = NavController.deepLinkSaveState;
            if (z) {
                navOptions.popUpTo(NavGraph.Companion.findStartDestination(this.this$0.getGraph()).getId(), AnonymousClass2.INSTANCE);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NavController.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/navigation/PopUpToBuilder;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.navigation.NavController$handleDeepLink$2$2  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass2 extends Lambda implements Function1<PopUpToBuilder, Unit> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PopUpToBuilder popUpToBuilder) {
            invoke2(popUpToBuilder);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(PopUpToBuilder popUpTo) {
            Intrinsics.checkNotNullParameter(popUpTo, "$this$popUpTo");
            popUpTo.setSaveState(true);
        }
    }
}
