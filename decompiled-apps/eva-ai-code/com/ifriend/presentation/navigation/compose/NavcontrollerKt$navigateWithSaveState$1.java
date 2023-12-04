package com.ifriend.presentation.navigation.compose;

import androidx.navigation.NavController;
import androidx.navigation.NavGraph;
import androidx.navigation.NavOptionsBuilder;
import androidx.navigation.PopUpToBuilder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: navcontroller.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/navigation/NavOptionsBuilder;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class NavcontrollerKt$navigateWithSaveState$1 extends Lambda implements Function1<NavOptionsBuilder, Unit> {
    final /* synthetic */ NavController $this_navigateWithSaveState;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavcontrollerKt$navigateWithSaveState$1(NavController navController) {
        super(1);
        this.$this_navigateWithSaveState = navController;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(NavOptionsBuilder navOptionsBuilder) {
        invoke2(navOptionsBuilder);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: navcontroller.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/navigation/PopUpToBuilder;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.navigation.compose.NavcontrollerKt$navigateWithSaveState$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Function1<PopUpToBuilder, Unit> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
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

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(NavOptionsBuilder navigate) {
        Intrinsics.checkNotNullParameter(navigate, "$this$navigate");
        navigate.popUpTo(NavGraph.Companion.findStartDestination(this.$this_navigateWithSaveState.getGraph()).getId(), AnonymousClass1.INSTANCE);
        navigate.setLaunchSingleTop(true);
        navigate.setRestoreState(true);
    }
}
