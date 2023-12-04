package com.ifriend.presentation.extensions;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.navigation.NavController;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NavigationExt.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NavigationExtKt$DestinationListenerEffect$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ Object[] $keys;
    final /* synthetic */ NavController.OnDestinationChangedListener $onChangedDestination;
    final /* synthetic */ NavController $this_DestinationListenerEffect;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationExtKt$DestinationListenerEffect$2(NavController navController, Object[] objArr, NavController.OnDestinationChangedListener onDestinationChangedListener, int i) {
        super(2);
        this.$this_DestinationListenerEffect = navController;
        this.$keys = objArr;
        this.$onChangedDestination = onDestinationChangedListener;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        NavController navController = this.$this_DestinationListenerEffect;
        Object[] objArr = this.$keys;
        NavigationExtKt.DestinationListenerEffect(navController, Arrays.copyOf(objArr, objArr.length), this.$onChangedDestination, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
