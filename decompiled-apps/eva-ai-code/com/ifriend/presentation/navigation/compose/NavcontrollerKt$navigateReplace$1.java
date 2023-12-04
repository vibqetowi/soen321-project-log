package com.ifriend.presentation.navigation.compose;

import androidx.navigation.NavController;
import androidx.navigation.NavOptionsBuilder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: navcontroller.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/navigation/NavOptionsBuilder;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class NavcontrollerKt$navigateReplace$1 extends Lambda implements Function1<NavOptionsBuilder, Unit> {
    final /* synthetic */ String $currentRoute;
    final /* synthetic */ NavController $this_navigateReplace;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavcontrollerKt$navigateReplace$1(NavController navController, String str) {
        super(1);
        this.$this_navigateReplace = navController;
        this.$currentRoute = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(NavOptionsBuilder navOptionsBuilder) {
        invoke2(navOptionsBuilder);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(NavOptionsBuilder navigate) {
        Intrinsics.checkNotNullParameter(navigate, "$this$navigate");
        NavcontrollerKt.popUpToTop(navigate, this.$this_navigateReplace, this.$currentRoute);
    }
}
