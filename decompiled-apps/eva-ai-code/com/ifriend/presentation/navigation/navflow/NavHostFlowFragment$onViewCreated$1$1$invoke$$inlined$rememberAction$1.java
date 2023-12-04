package com.ifriend.presentation.navigation.navflow;

import androidx.navigation.NavHostController;
import com.ifriend.presentation.navigation.AppFlowCoordinator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* compiled from: remember.kt */
@Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0005\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "R", "invoke", "()Ljava/lang/Object;", "com/ifriend/ui/utils/composables/RememberKt$rememberAction$1$1"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class NavHostFlowFragment$onViewCreated$1$1$invoke$$inlined$rememberAction$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ NavHostController $navController$inlined;
    final /* synthetic */ NavHostFlowFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavHostFlowFragment$onViewCreated$1$1$invoke$$inlined$rememberAction$1(NavHostController navHostController, NavHostFlowFragment navHostFlowFragment) {
        super(0);
        this.$navController$inlined = navHostController;
        this.this$0 = navHostFlowFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        boolean popBackStack = this.$navController$inlined.popBackStack();
        AppFlowCoordinator flowCoordinator = this.this$0.getFlowCoordinator();
        if (!popBackStack) {
            flowCoordinator.back();
        }
        return Unit.INSTANCE;
    }
}
