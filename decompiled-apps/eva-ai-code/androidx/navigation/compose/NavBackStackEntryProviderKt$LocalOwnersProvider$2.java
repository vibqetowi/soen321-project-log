package androidx.navigation.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.navigation.NavBackStackEntry;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NavBackStackEntryProvider.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NavBackStackEntryProviderKt$LocalOwnersProvider$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ Function2<Composer, Integer, Unit> $content;
    final /* synthetic */ SaveableStateHolder $saveableStateHolder;
    final /* synthetic */ NavBackStackEntry $this_LocalOwnersProvider;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NavBackStackEntryProviderKt$LocalOwnersProvider$2(NavBackStackEntry navBackStackEntry, SaveableStateHolder saveableStateHolder, Function2<? super Composer, ? super Integer, Unit> function2, int i) {
        super(2);
        this.$this_LocalOwnersProvider = navBackStackEntry;
        this.$saveableStateHolder = saveableStateHolder;
        this.$content = function2;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        NavBackStackEntryProviderKt.LocalOwnersProvider(this.$this_LocalOwnersProvider, this.$saveableStateHolder, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
