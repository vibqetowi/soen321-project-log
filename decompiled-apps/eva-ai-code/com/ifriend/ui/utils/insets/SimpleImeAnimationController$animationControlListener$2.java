package com.ifriend.ui.utils.insets;

import androidx.core.view.WindowInsetsAnimationControlListenerCompat;
import androidx.core.view.WindowInsetsAnimationControllerCompat;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SimpleImeAnimationController.kt */
@Metadata(d1 = {"\u0000\t\n\u0000\n\u0002\b\u0003*\u0001\u0001\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "com/ifriend/ui/utils/insets/SimpleImeAnimationController$animationControlListener$2$1", "invoke", "()Lcom/ifriend/ui/utils/insets/SimpleImeAnimationController$animationControlListener$2$1;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SimpleImeAnimationController$animationControlListener$2 extends Lambda implements Function0<AnonymousClass1> {
    final /* synthetic */ SimpleImeAnimationController this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleImeAnimationController$animationControlListener$2(SimpleImeAnimationController simpleImeAnimationController) {
        super(0);
        this.this$0 = simpleImeAnimationController;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.ifriend.ui.utils.insets.SimpleImeAnimationController$animationControlListener$2$1] */
    @Override // kotlin.jvm.functions.Function0
    public final AnonymousClass1 invoke() {
        final SimpleImeAnimationController simpleImeAnimationController = this.this$0;
        return new WindowInsetsAnimationControlListenerCompat() { // from class: com.ifriend.ui.utils.insets.SimpleImeAnimationController$animationControlListener$2.1
            @Override // androidx.core.view.WindowInsetsAnimationControlListenerCompat
            public void onReady(WindowInsetsAnimationControllerCompat controller, int i) {
                Intrinsics.checkNotNullParameter(controller, "controller");
                SimpleImeAnimationController.this.onRequestReady(controller);
            }

            @Override // androidx.core.view.WindowInsetsAnimationControlListenerCompat
            public void onFinished(WindowInsetsAnimationControllerCompat controller) {
                Intrinsics.checkNotNullParameter(controller, "controller");
                SimpleImeAnimationController.this.reset();
            }

            @Override // androidx.core.view.WindowInsetsAnimationControlListenerCompat
            public void onCancelled(WindowInsetsAnimationControllerCompat windowInsetsAnimationControllerCompat) {
                SimpleImeAnimationController.this.reset();
            }
        };
    }
}
