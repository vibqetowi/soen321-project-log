package com.ifriend.presentation.features.chat.photo.delegate;

import androidx.lifecycle.ViewModel;
import com.ifriend.presentation.features.chat.photo.ui.ChatPhotoUiState;
import dagger.assisted.AssistedFactory;
import kotlin.Metadata;
import kotlinx.coroutines.flow.StateFlow;
/* compiled from: ChatPhotoDelegate.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\u0010J\u0011\u0010\u0007\u001a\u00020\bH&R\u00020\t¢\u0006\u0002\u0010\nJ\u0011\u0010\u000b\u001a\u00020\bH&R\u00020\t¢\u0006\u0002\u0010\nJ\u0019\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH&R\u00020\t¢\u0006\u0002\u0010\u000fR\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/ifriend/presentation/features/chat/photo/delegate/ChatPhotoDelegate;", "", "photoModalState", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/ifriend/presentation/features/chat/photo/ui/ChatPhotoUiState;", "getPhotoModalState", "()Lkotlinx/coroutines/flow/StateFlow;", "dismissPhotoModalPopup", "", "Landroidx/lifecycle/ViewModel;", "(Landroidx/lifecycle/ViewModel;)V", "initChatPhotoDelegate", "showPhoto", "messageId", "", "(Landroidx/lifecycle/ViewModel;Ljava/lang/String;)V", "Factory", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ChatPhotoDelegate {

    /* compiled from: ChatPhotoDelegate.kt */
    @AssistedFactory
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ifriend/presentation/features/chat/photo/delegate/ChatPhotoDelegate$Factory;", "", "create", "Lcom/ifriend/presentation/features/chat/photo/delegate/ChatPhotoDelegateImpl;", "chatId", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public interface Factory {
        ChatPhotoDelegateImpl create(String str);
    }

    void dismissPhotoModalPopup(ViewModel viewModel);

    StateFlow<ChatPhotoUiState> getPhotoModalState();

    void initChatPhotoDelegate(ViewModel viewModel);

    void showPhoto(ViewModel viewModel, String str);
}
