package com.ifriend.presentation.features.home.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HomeScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HomeScreenKt$TopBarContent$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ boolean $isVisibleProfileIndicator;
    final /* synthetic */ String $neurons;
    final /* synthetic */ Function0<Unit> $onAddNeuronsClick;
    final /* synthetic */ Function0<Unit> $onProfileClick;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeScreenKt$TopBarContent$2(boolean z, Function0<Unit> function0, Function0<Unit> function02, String str, int i) {
        super(2);
        this.$isVisibleProfileIndicator = z;
        this.$onProfileClick = function0;
        this.$onAddNeuronsClick = function02;
        this.$neurons = str;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        HomeScreenKt.TopBarContent(this.$isVisibleProfileIndicator, this.$onProfileClick, this.$onAddNeuronsClick, this.$neurons, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
