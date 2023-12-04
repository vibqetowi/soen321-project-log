package com.ifriend.icon_switcher;

import android.content.Context;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* compiled from: AppComponentPostponedSwitcher.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class AppComponentPostponedSwitcher$postponeSwitch$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ String $componentNameToDisable;
    final /* synthetic */ String $componentNameToEnable;
    final /* synthetic */ Context $context;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppComponentPostponedSwitcher$postponeSwitch$1(String str, String str2, Context context) {
        super(0);
        this.$componentNameToDisable = str;
        this.$componentNameToEnable = str2;
        this.$context = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        new AppComponentInstantSwitcher().switchComponents(this.$componentNameToDisable, this.$componentNameToEnable, this.$context);
    }
}
