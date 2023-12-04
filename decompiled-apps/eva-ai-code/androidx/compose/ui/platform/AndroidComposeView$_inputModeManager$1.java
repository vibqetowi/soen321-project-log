package androidx.compose.ui.platform;

import androidx.compose.ui.input.InputMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AndroidComposeView.android.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/input/InputMode;", "invoke-iuPiT84", "(I)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AndroidComposeView$_inputModeManager$1 extends Lambda implements Function1<InputMode, Boolean> {
    final /* synthetic */ AndroidComposeView this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeView$_inputModeManager$1(AndroidComposeView androidComposeView) {
        super(1);
        this.this$0 = androidComposeView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Boolean invoke(InputMode inputMode) {
        return m4836invokeiuPiT84(inputMode.m3969unboximpl());
    }

    /* renamed from: invoke-iuPiT84  reason: not valid java name */
    public final Boolean m4836invokeiuPiT84(int i) {
        boolean requestFocusFromTouch;
        if (InputMode.m3966equalsimpl0(i, InputMode.Companion.m3971getTouchaOaMEAU())) {
            requestFocusFromTouch = this.this$0.isInTouchMode();
        } else {
            requestFocusFromTouch = InputMode.m3966equalsimpl0(i, InputMode.Companion.m3970getKeyboardaOaMEAU()) ? this.this$0.isInTouchMode() ? this.this$0.requestFocusFromTouch() : true : false;
        }
        return Boolean.valueOf(requestFocusFromTouch);
    }
}
