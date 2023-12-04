package androidx.compose.foundation.text;

import android.view.InputDevice;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.text.input.TextInputSession;
import androidx.core.view.InputDeviceCompat;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TextFieldFocusModifier.android.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "keyEvent", "Landroidx/compose/ui/input/key/KeyEvent;", "invoke-ZmokQxo", "(Landroid/view/KeyEvent;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextFieldFocusModifier_androidKt$interceptDPadAndMoveFocus$1 extends Lambda implements Function1<KeyEvent, Boolean> {
    final /* synthetic */ FocusManager $focusManager;
    final /* synthetic */ TextFieldState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldFocusModifier_androidKt$interceptDPadAndMoveFocus$1(FocusManager focusManager, TextFieldState textFieldState) {
        super(1);
        this.$focusManager = focusManager;
        this.$state = textFieldState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
        return m1088invokeZmokQxo(keyEvent.m4277unboximpl());
    }

    /* renamed from: invoke-ZmokQxo  reason: not valid java name */
    public final Boolean m1088invokeZmokQxo(android.view.KeyEvent keyEvent) {
        boolean m1087isKeyCodeYhN2O0w;
        boolean m1087isKeyCodeYhN2O0w2;
        boolean m1087isKeyCodeYhN2O0w3;
        boolean m1087isKeyCodeYhN2O0w4;
        boolean m1087isKeyCodeYhN2O0w5;
        Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
        InputDevice device = keyEvent.getDevice();
        boolean z = false;
        if (device != null && device.supportsSource(InputDeviceCompat.SOURCE_DPAD) && !device.isVirtual() && KeyEventType.m4281equalsimpl0(KeyEvent_androidKt.m4289getTypeZmokQxo(keyEvent), KeyEventType.Companion.m4285getKeyDownCS__XNY())) {
            m1087isKeyCodeYhN2O0w = TextFieldFocusModifier_androidKt.m1087isKeyCodeYhN2O0w(keyEvent, 19);
            if (m1087isKeyCodeYhN2O0w) {
                z = this.$focusManager.mo2955moveFocus3ESFkO8(FocusDirection.Companion.m2954getUpdhqQ8s());
            } else {
                m1087isKeyCodeYhN2O0w2 = TextFieldFocusModifier_androidKt.m1087isKeyCodeYhN2O0w(keyEvent, 20);
                if (m1087isKeyCodeYhN2O0w2) {
                    z = this.$focusManager.mo2955moveFocus3ESFkO8(FocusDirection.Companion.m2945getDowndhqQ8s());
                } else {
                    m1087isKeyCodeYhN2O0w3 = TextFieldFocusModifier_androidKt.m1087isKeyCodeYhN2O0w(keyEvent, 21);
                    if (m1087isKeyCodeYhN2O0w3) {
                        z = this.$focusManager.mo2955moveFocus3ESFkO8(FocusDirection.Companion.m2949getLeftdhqQ8s());
                    } else {
                        m1087isKeyCodeYhN2O0w4 = TextFieldFocusModifier_androidKt.m1087isKeyCodeYhN2O0w(keyEvent, 22);
                        if (m1087isKeyCodeYhN2O0w4) {
                            z = this.$focusManager.mo2955moveFocus3ESFkO8(FocusDirection.Companion.m2953getRightdhqQ8s());
                        } else {
                            m1087isKeyCodeYhN2O0w5 = TextFieldFocusModifier_androidKt.m1087isKeyCodeYhN2O0w(keyEvent, 23);
                            if (m1087isKeyCodeYhN2O0w5) {
                                TextInputSession inputSession = this.$state.getInputSession();
                                if (inputSession != null) {
                                    inputSession.showSoftwareKeyboard();
                                }
                                z = true;
                            }
                        }
                    }
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
