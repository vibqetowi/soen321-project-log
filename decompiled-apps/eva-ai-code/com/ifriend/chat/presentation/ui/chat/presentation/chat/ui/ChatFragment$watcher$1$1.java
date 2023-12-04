package com.ifriend.chat.presentation.ui.chat.presentation.chat.ui;

import com.ifriend.presentation.features.chat.screen.viewmodel.ChatViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatFragment.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public /* synthetic */ class ChatFragment$watcher$1$1 extends PropertyReference1Impl {
    public static final ChatFragment$watcher$1$1 INSTANCE = new ChatFragment$watcher$1$1();

    ChatFragment$watcher$1$1() {
        super(ChatViewModel.UiState.class, "animatedBgState", "getAnimatedBgState()Lcom/ifriend/animatedBackground/AnimatedBackgroundView$State;", 0);
    }

    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
    public Object get(Object obj) {
        return ((ChatViewModel.UiState) obj).getAnimatedBgState();
    }
}
