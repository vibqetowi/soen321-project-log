package com.ifriend.presentation.features.chat.notifications.delegate;

import androidx.lifecycle.ViewModel;
import com.google.android.exoplayer2.C;
import com.ifriend.domain.models.chat.notifications.ChatNotification;
import com.ifriend.presentation.features.chat.notifications.model.ChatNotificationUi;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlinx.collections.immutable.PersistentList;
import kotlinx.coroutines.flow.StateFlow;
/* compiled from: ChatNotificationsDelegate.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\b\u001a\u00020\tH&J\u0019\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0005H&R\u00020\u000b¢\u0006\u0002\u0010\rJ;\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014H&R\u00020\u000b¢\u0006\u0002\u0010\u0017R\u001e\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/ifriend/presentation/features/chat/notifications/delegate/ChatNotificationsDelegate;", "", "chatNotifications", "Lkotlinx/coroutines/flow/StateFlow;", "Lkotlinx/collections/immutable/PersistentList;", "Lcom/ifriend/presentation/features/chat/notifications/model/ChatNotificationUi;", "getChatNotifications", "()Lkotlinx/coroutines/flow/StateFlow;", "disposeNotificationsObserver", "", "hideNotification", "Landroidx/lifecycle/ViewModel;", "item", "(Landroidx/lifecycle/ViewModel;Lcom/ifriend/presentation/features/chat/notifications/model/ChatNotificationUi;)V", "initNotificationsObserver", "notificationsLimit", "", "hideDelay", "", "notificationsFilter", "Lkotlin/Function1;", "Lcom/ifriend/domain/models/chat/notifications/ChatNotification;", "", "(Landroidx/lifecycle/ViewModel;IJLkotlin/jvm/functions/Function1;)V", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ChatNotificationsDelegate {
    void disposeNotificationsObserver();

    StateFlow<PersistentList<ChatNotificationUi>> getChatNotifications();

    void hideNotification(ViewModel viewModel, ChatNotificationUi chatNotificationUi);

    void initNotificationsObserver(ViewModel viewModel, int i, long j, Function1<? super ChatNotification, Boolean> function1);

    /* compiled from: ChatNotificationsDelegate.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ void initNotificationsObserver$default(ChatNotificationsDelegate chatNotificationsDelegate, ViewModel viewModel, int i, long j, Function1 function1, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: initNotificationsObserver");
            }
            if ((i2 & 2) != 0) {
                i = 2;
            }
            int i3 = i;
            if ((i2 & 4) != 0) {
                j = C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS;
            }
            long j2 = j;
            ChatNotificationsDelegate$initNotificationsObserver$1 chatNotificationsDelegate$initNotificationsObserver$1 = function1;
            if ((i2 & 8) != 0) {
                chatNotificationsDelegate$initNotificationsObserver$1 = ChatNotificationsDelegate$initNotificationsObserver$1.INSTANCE;
            }
            chatNotificationsDelegate.initNotificationsObserver(viewModel, i3, j2, chatNotificationsDelegate$initNotificationsObserver$1);
        }
    }
}
