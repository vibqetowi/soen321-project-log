package com.ifriend.presentation.features.chat.regeneration;

import androidx.lifecycle.ViewModel;
import kotlin.Metadata;
/* compiled from: MessageRegenerationDelegate.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&R\u00020\u0004¢\u0006\u0002\u0010\u0007J!\u0010\b\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H&R\u00020\u0004¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/ifriend/presentation/features/chat/regeneration/MessageRegenerationDelegate;", "", "initRegenerationMessage", "", "Landroidx/lifecycle/ViewModel;", "chatId", "", "(Landroidx/lifecycle/ViewModel;Ljava/lang/String;)V", "regenerateMessage", "messageId", "(Landroidx/lifecycle/ViewModel;Ljava/lang/String;Ljava/lang/String;)V", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface MessageRegenerationDelegate {
    void initRegenerationMessage(ViewModel viewModel, String str);

    void regenerateMessage(ViewModel viewModel, String str, String str2);
}
