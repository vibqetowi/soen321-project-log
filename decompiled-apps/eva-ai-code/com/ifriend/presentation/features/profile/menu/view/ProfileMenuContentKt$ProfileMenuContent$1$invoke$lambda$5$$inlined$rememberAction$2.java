package com.ifriend.presentation.features.profile.menu.view;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* compiled from: remember.kt */
@Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0005\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "R", "invoke", "()Ljava/lang/Object;", "com/ifriend/ui/utils/composables/RememberKt$rememberAction$3$1"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ProfileMenuContentKt$ProfileMenuContent$1$invoke$lambda$5$$inlined$rememberAction$2 extends Lambda implements Function0<Unit> {
    final /* synthetic */ ProfileMenuNavigator $navigator$inlined;
    final /* synthetic */ Function0 $onDismiss$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileMenuContentKt$ProfileMenuContent$1$invoke$lambda$5$$inlined$rememberAction$2(Function0 function0, ProfileMenuNavigator profileMenuNavigator) {
        super(0);
        this.$onDismiss$inlined = function0;
        this.$navigator$inlined = profileMenuNavigator;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.$onDismiss$inlined.invoke();
        this.$navigator$inlined.getToEditBot().invoke();
        return Unit.INSTANCE;
    }
}
