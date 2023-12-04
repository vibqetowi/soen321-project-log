package com.ifriend.ui.components.effects;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Lifecycle.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LifecycleKt$OnCreateDestroyEffect$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ Function0<Unit> $onCreate;
    final /* synthetic */ Function0<Unit> $onDestroy;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LifecycleKt$OnCreateDestroyEffect$2(Function0<Unit> function0, Function0<Unit> function02, int i) {
        super(2);
        this.$onCreate = function0;
        this.$onDestroy = function02;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        LifecycleKt.OnCreateDestroyEffect(this.$onCreate, this.$onDestroy, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
