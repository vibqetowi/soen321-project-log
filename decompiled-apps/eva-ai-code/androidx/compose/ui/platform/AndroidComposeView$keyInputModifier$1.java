package androidx.compose.ui.platform;

import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AndroidComposeView.android.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/input/key/KeyEvent;", "invoke-ZmokQxo", "(Landroid/view/KeyEvent;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AndroidComposeView$keyInputModifier$1 extends Lambda implements Function1<KeyEvent, Boolean> {
    final /* synthetic */ AndroidComposeView this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeView$keyInputModifier$1(AndroidComposeView androidComposeView) {
        super(1);
        this.this$0 = androidComposeView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
        return m4837invokeZmokQxo(keyEvent.m4277unboximpl());
    }

    /* renamed from: invoke-ZmokQxo  reason: not valid java name */
    public final Boolean m4837invokeZmokQxo(android.view.KeyEvent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        FocusDirection mo4811getFocusDirectionP8AzH3I = this.this$0.mo4811getFocusDirectionP8AzH3I(it);
        if (mo4811getFocusDirectionP8AzH3I == null || !KeyEventType.m4281equalsimpl0(KeyEvent_androidKt.m4289getTypeZmokQxo(it), KeyEventType.Companion.m4285getKeyDownCS__XNY())) {
            return false;
        }
        return Boolean.valueOf(this.this$0.getFocusOwner().mo2955moveFocus3ESFkO8(mo4811getFocusDirectionP8AzH3I.m2940unboximpl()));
    }
}
