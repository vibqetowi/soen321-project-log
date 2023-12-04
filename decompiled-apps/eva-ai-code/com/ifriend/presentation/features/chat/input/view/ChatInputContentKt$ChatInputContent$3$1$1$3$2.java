package com.ifriend.presentation.features.chat.input.view;

import android.view.View;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import com.google.accompanist.permissions.PermissionState;
import com.google.accompanist.permissions.PermissionsUtilKt;
import com.ifriend.ui.haptic.AppHapticConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatInputContent.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatInputContentKt$ChatInputContent$3$1$1$3$2 extends Lambda implements Function0<Unit> {
    final /* synthetic */ PermissionState $audioPermissionState;
    final /* synthetic */ ChatInputCallbacks $callbacks;
    final /* synthetic */ MutableState<Boolean> $cancelled$delegate;
    final /* synthetic */ MutableIntState $dragOffset$delegate;
    final /* synthetic */ View $view;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatInputContentKt$ChatInputContent$3$1$1$3$2(ChatInputCallbacks chatInputCallbacks, PermissionState permissionState, View view, MutableIntState mutableIntState, MutableState<Boolean> mutableState) {
        super(0);
        this.$callbacks = chatInputCallbacks;
        this.$audioPermissionState = permissionState;
        this.$view = view;
        this.$dragOffset$delegate = mutableIntState;
        this.$cancelled$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$dragOffset$delegate.setIntValue(0);
        ChatInputContentKt.ChatInputContent$lambda$7(this.$cancelled$delegate, false);
        this.$callbacks.getOnRecordAudioPressed().invoke();
        if (PermissionsUtilKt.isGranted(this.$audioPermissionState.getStatus())) {
            this.$view.performHapticFeedback(AppHapticConstants.INSTANCE.getDRAG_START());
            this.$callbacks.getOnRecordAudioStart().invoke();
        } else if (PermissionsUtilKt.getShouldShowRationale(this.$audioPermissionState.getStatus())) {
            this.$callbacks.getOnShouldShowAudioPermissionRationale().invoke();
        } else {
            this.$audioPermissionState.launchPermissionRequest();
        }
    }
}
