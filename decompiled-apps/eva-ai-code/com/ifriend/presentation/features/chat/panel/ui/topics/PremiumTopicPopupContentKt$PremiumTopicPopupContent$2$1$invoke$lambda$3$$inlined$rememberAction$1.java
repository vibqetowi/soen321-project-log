package com.ifriend.presentation.features.chat.panel.ui.topics;

import android.os.Build;
import androidx.activity.compose.ManagedActivityResultLauncher;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
/* compiled from: remember.kt */
@Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0005\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"<anonymous>", "R", "invoke", "()Ljava/lang/Object;", "com/ifriend/ui/utils/composables/RememberKt$rememberAction$2$1"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class PremiumTopicPopupContentKt$PremiumTopicPopupContent$2$1$invoke$lambda$3$$inlined$rememberAction$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ Function1 $onPermissionGranted$inlined;
    final /* synthetic */ Function0 $onRemindClick$inlined;
    final /* synthetic */ ManagedActivityResultLauncher $permissionLauncher$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumTopicPopupContentKt$PremiumTopicPopupContent$2$1$invoke$lambda$3$$inlined$rememberAction$1(Function0 function0, ManagedActivityResultLauncher managedActivityResultLauncher, Function1 function1) {
        super(0);
        this.$onRemindClick$inlined = function0;
        this.$permissionLauncher$inlined = managedActivityResultLauncher;
        this.$onPermissionGranted$inlined = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (Build.VERSION.SDK_INT >= 33) {
            this.$onRemindClick$inlined.invoke();
            this.$permissionLauncher$inlined.launch("android.permission.POST_NOTIFICATIONS");
        } else {
            this.$onPermissionGranted$inlined.invoke(true);
        }
        return Unit.INSTANCE;
    }
}
