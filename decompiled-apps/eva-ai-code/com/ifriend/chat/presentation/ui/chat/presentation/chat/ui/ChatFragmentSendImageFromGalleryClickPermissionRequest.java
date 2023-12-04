package com.ifriend.chat.presentation.ui.chat.presentation.chat.ui;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.ifriend.keychain.KeychainModule;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import permissions.dispatcher.PermissionRequest;
/* compiled from: ChatFragmentPermissionsDispatcher.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/ifriend/chat/presentation/ui/chat/presentation/chat/ui/ChatFragmentSendImageFromGalleryClickPermissionRequest;", "Lpermissions/dispatcher/PermissionRequest;", TypedValues.AttributesType.S_TARGET, "Lcom/ifriend/chat/presentation/ui/chat/presentation/chat/ui/ChatFragment;", "(Lcom/ifriend/chat/presentation/ui/chat/presentation/chat/ui/ChatFragment;)V", "weakTarget", "Ljava/lang/ref/WeakReference;", KeychainModule.AuthPromptOptions.CANCEL, "", "proceed", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ChatFragmentSendImageFromGalleryClickPermissionRequest implements PermissionRequest {
    private final WeakReference<ChatFragment> weakTarget;

    @Override // permissions.dispatcher.PermissionRequest
    public void cancel() {
    }

    public ChatFragmentSendImageFromGalleryClickPermissionRequest(ChatFragment target) {
        Intrinsics.checkNotNullParameter(target, "target");
        this.weakTarget = new WeakReference<>(target);
    }

    @Override // permissions.dispatcher.PermissionRequest
    public void proceed() {
        String[] strArr;
        ChatFragment chatFragment = this.weakTarget.get();
        if (chatFragment == null) {
            return;
        }
        strArr = ChatFragmentPermissionsDispatcher.PERMISSION_SENDIMAGEFROMGALLERYCLICK;
        chatFragment.requestPermissions(strArr, 1);
    }
}
