package com.ifriend.presentation.features.chatcall.ui;

import com.ifriend.presentation.features.chatcall.viewmodel.ChatCallViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
/* compiled from: ChatCallScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
/* synthetic */ class ChatCallScreenKt$ChatCallScreen$1$audioPermissionLauncher$1 extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public ChatCallScreenKt$ChatCallScreen$1$audioPermissionLauncher$1(Object obj) {
        super(1, obj, ChatCallViewModel.class, "onAudioPermissionGranted", "onAudioPermissionGranted(Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z) {
        ((ChatCallViewModel) this.receiver).onAudioPermissionGranted(z);
    }
}
