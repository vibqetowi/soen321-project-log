package com.ifriend.presentation.common.uistate;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.FlowCollector;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UiStateDelegateEx.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UiStateDelegateExKt$CollectEventEffect$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ FlowCollector<Event> $collector;
    final /* synthetic */ Object[] $keys;
    final /* synthetic */ LifecycleOwner $lifecycleOwner;
    final /* synthetic */ Lifecycle.State $lifecycleState;
    final /* synthetic */ UiStateDelegate<State, Event> $this_CollectEventEffect;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UiStateDelegateExKt$CollectEventEffect$2(UiStateDelegate<State, Event> uiStateDelegate, Object[] objArr, LifecycleOwner lifecycleOwner, Lifecycle.State state, FlowCollector<? super Event> flowCollector, int i, int i2) {
        super(2);
        this.$this_CollectEventEffect = uiStateDelegate;
        this.$keys = objArr;
        this.$lifecycleOwner = lifecycleOwner;
        this.$lifecycleState = state;
        this.$collector = flowCollector;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        UiStateDelegate<State, Event> uiStateDelegate = this.$this_CollectEventEffect;
        Object[] objArr = this.$keys;
        UiStateDelegateExKt.CollectEventEffect(uiStateDelegate, Arrays.copyOf(objArr, objArr.length), this.$lifecycleOwner, this.$lifecycleState, this.$collector, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
