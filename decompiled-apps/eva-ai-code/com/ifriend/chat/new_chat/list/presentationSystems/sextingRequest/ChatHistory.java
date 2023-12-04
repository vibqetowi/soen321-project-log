package com.ifriend.chat.new_chat.list.presentationSystems.sextingRequest;

import kotlin.Metadata;
/* compiled from: UserPreferencesChatHistory.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0003H&J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0007H&¨\u0006\f"}, d2 = {"Lcom/ifriend/chat/new_chat/list/presentationSystems/sextingRequest/ChatHistory;", "", "getCountOfUserMessages", "", "incrementCountOfUserMessages", "", "isSextingMessagePresent", "", "saveCountOfUserMessages", "count", "saveSextingMessagePresent", "isPresent", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ChatHistory {
    int getCountOfUserMessages();

    void incrementCountOfUserMessages();

    boolean isSextingMessagePresent();

    void saveCountOfUserMessages(int i);

    void saveSextingMessagePresent(boolean z);
}
