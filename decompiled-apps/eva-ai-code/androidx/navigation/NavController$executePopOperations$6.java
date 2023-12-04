package androidx.navigation;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NavController.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "destination", "Landroidx/navigation/NavDestination;", "invoke", "(Landroidx/navigation/NavDestination;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NavController$executePopOperations$6 extends Lambda implements Function1<NavDestination, Boolean> {
    final /* synthetic */ NavController this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavController$executePopOperations$6(NavController navController) {
        super(1);
        this.this$0 = navController;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(NavDestination destination) {
        Map map;
        Intrinsics.checkNotNullParameter(destination, "destination");
        map = this.this$0.backStackMap;
        return Boolean.valueOf(!map.containsKey(Integer.valueOf(destination.getId())));
    }
}
