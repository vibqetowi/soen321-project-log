package androidx.navigation.compose;

import androidx.navigation.NavBackStackEntry;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
/* compiled from: NavHost.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroidx/navigation/NavBackStackEntry;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
final class NavHostKt$NavHost$13 extends Lambda implements Function1<NavBackStackEntry, Object> {
    public static final NavHostKt$NavHost$13 INSTANCE = new NavHostKt$NavHost$13();

    NavHostKt$NavHost$13() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(NavBackStackEntry navBackStackEntry) {
        return navBackStackEntry.getId();
    }
}
