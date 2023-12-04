package com.ifriend.chat.new_chat.list.presentationSystems.sextingRequest;

import com.ifriend.base.di.UserSharedPreferences;
import com.ifriend.domain.data.Preferences;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: UserPreferencesChatHistory.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0006H\u0016J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ifriend/chat/new_chat/list/presentationSystems/sextingRequest/UserPreferencesChatHistory;", "Lcom/ifriend/chat/new_chat/list/presentationSystems/sextingRequest/ChatHistory;", "preferences", "Lcom/ifriend/domain/data/Preferences;", "(Lcom/ifriend/domain/data/Preferences;)V", "getCountOfUserMessages", "", "incrementCountOfUserMessages", "", "isSextingMessagePresent", "", "saveCountOfUserMessages", "count", "saveSextingMessagePresent", "isPresent", "Companion", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UserPreferencesChatHistory implements ChatHistory {
    public static final String COUNT_OF_USER_MESSAGES = "count_of_messages";
    public static final String SEXTING_MESSAGE_PRESENT = "sexting_message_present";
    private final Preferences preferences;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Inject
    public UserPreferencesChatHistory(@UserSharedPreferences Preferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        this.preferences = preferences;
    }

    @Override // com.ifriend.chat.new_chat.list.presentationSystems.sextingRequest.ChatHistory
    public boolean isSextingMessagePresent() {
        return this.preferences.getBooleanWithKey(SEXTING_MESSAGE_PRESENT, false);
    }

    @Override // com.ifriend.chat.new_chat.list.presentationSystems.sextingRequest.ChatHistory
    public void saveSextingMessagePresent(boolean z) {
        this.preferences.saveBooleanWithKey(SEXTING_MESSAGE_PRESENT, Boolean.valueOf(z));
    }

    @Override // com.ifriend.chat.new_chat.list.presentationSystems.sextingRequest.ChatHistory
    public int getCountOfUserMessages() {
        return this.preferences.getIntWithKey(COUNT_OF_USER_MESSAGES);
    }

    @Override // com.ifriend.chat.new_chat.list.presentationSystems.sextingRequest.ChatHistory
    public void saveCountOfUserMessages(int i) {
        this.preferences.saveIntWithKey(COUNT_OF_USER_MESSAGES, Integer.valueOf(i));
    }

    @Override // com.ifriend.chat.new_chat.list.presentationSystems.sextingRequest.ChatHistory
    public void incrementCountOfUserMessages() {
        saveCountOfUserMessages(getCountOfUserMessages() + 1);
    }

    /* compiled from: UserPreferencesChatHistory.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ifriend/chat/new_chat/list/presentationSystems/sextingRequest/UserPreferencesChatHistory$Companion;", "", "()V", "COUNT_OF_USER_MESSAGES", "", "SEXTING_MESSAGE_PRESENT", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
