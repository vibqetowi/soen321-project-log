package com.ifriend.presentation.common.uistate;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ViewModelExt.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ViewModelExtKt$RegisterObserverEffect$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ Object[] $keys;
    final /* synthetic */ LifecycleOwner $owner;
    final /* synthetic */ LifecycleObserver $this_RegisterObserverEffect;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewModelExtKt$RegisterObserverEffect$2(LifecycleObserver lifecycleObserver, LifecycleOwner lifecycleOwner, Object[] objArr, int i, int i2) {
        super(2);
        this.$this_RegisterObserverEffect = lifecycleObserver;
        this.$owner = lifecycleOwner;
        this.$keys = objArr;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        LifecycleObserver lifecycleObserver = this.$this_RegisterObserverEffect;
        LifecycleOwner lifecycleOwner = this.$owner;
        Object[] objArr = this.$keys;
        ViewModelExtKt.RegisterObserverEffect(lifecycleObserver, lifecycleOwner, Arrays.copyOf(objArr, objArr.length), composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
