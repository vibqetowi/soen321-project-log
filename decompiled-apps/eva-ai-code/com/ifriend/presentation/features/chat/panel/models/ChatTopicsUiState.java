package com.ifriend.presentation.features.chat.panel.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ExtensionsKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.PersistentList;
/* compiled from: ChatTopicsUiState.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006¢\u0006\u0002\u0010\fJ\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003JM\u0010\u0018\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\rR\u0011\u0010\u000b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\rR\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\rR\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001f"}, d2 = {"Lcom/ifriend/presentation/features/chat/panel/models/ChatTopicsUiState;", "", "topics", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/ifriend/presentation/features/chat/panel/models/ChatPanelActionMarker;", "isCanClickTopic", "", "popupData", "Lcom/ifriend/presentation/features/chat/panel/models/TopicPopupDataUi;", "isVisiblePopup", "isVisiblePopupPermissionInfo", "isNotificationShown", "(Lkotlinx/collections/immutable/ImmutableList;ZLcom/ifriend/presentation/features/chat/panel/models/TopicPopupDataUi;ZZZ)V", "()Z", "getPopupData", "()Lcom/ifriend/presentation/features/chat/panel/models/TopicPopupDataUi;", "getTopics", "()Lkotlinx/collections/immutable/ImmutableList;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatTopicsUiState {
    public static final int $stable = 0;
    private final boolean isCanClickTopic;
    private final boolean isNotificationShown;
    private final boolean isVisiblePopup;
    private final boolean isVisiblePopupPermissionInfo;
    private final TopicPopupDataUi popupData;
    private final ImmutableList<ChatPanelActionMarker> topics;

    public ChatTopicsUiState() {
        this(null, false, null, false, false, false, 63, null);
    }

    public static /* synthetic */ ChatTopicsUiState copy$default(ChatTopicsUiState chatTopicsUiState, ImmutableList immutableList, boolean z, TopicPopupDataUi topicPopupDataUi, boolean z2, boolean z3, boolean z4, int i, Object obj) {
        ImmutableList<ChatPanelActionMarker> immutableList2 = immutableList;
        if ((i & 1) != 0) {
            immutableList2 = chatTopicsUiState.topics;
        }
        if ((i & 2) != 0) {
            z = chatTopicsUiState.isCanClickTopic;
        }
        boolean z5 = z;
        if ((i & 4) != 0) {
            topicPopupDataUi = chatTopicsUiState.popupData;
        }
        TopicPopupDataUi topicPopupDataUi2 = topicPopupDataUi;
        if ((i & 8) != 0) {
            z2 = chatTopicsUiState.isVisiblePopup;
        }
        boolean z6 = z2;
        if ((i & 16) != 0) {
            z3 = chatTopicsUiState.isVisiblePopupPermissionInfo;
        }
        boolean z7 = z3;
        if ((i & 32) != 0) {
            z4 = chatTopicsUiState.isNotificationShown;
        }
        return chatTopicsUiState.copy(immutableList2, z5, topicPopupDataUi2, z6, z7, z4);
    }

    public final ImmutableList<ChatPanelActionMarker> component1() {
        return this.topics;
    }

    public final boolean component2() {
        return this.isCanClickTopic;
    }

    public final TopicPopupDataUi component3() {
        return this.popupData;
    }

    public final boolean component4() {
        return this.isVisiblePopup;
    }

    public final boolean component5() {
        return this.isVisiblePopupPermissionInfo;
    }

    public final boolean component6() {
        return this.isNotificationShown;
    }

    public final ChatTopicsUiState copy(ImmutableList<? extends ChatPanelActionMarker> topics, boolean z, TopicPopupDataUi topicPopupDataUi, boolean z2, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(topics, "topics");
        return new ChatTopicsUiState(topics, z, topicPopupDataUi, z2, z3, z4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChatTopicsUiState) {
            ChatTopicsUiState chatTopicsUiState = (ChatTopicsUiState) obj;
            return Intrinsics.areEqual(this.topics, chatTopicsUiState.topics) && this.isCanClickTopic == chatTopicsUiState.isCanClickTopic && Intrinsics.areEqual(this.popupData, chatTopicsUiState.popupData) && this.isVisiblePopup == chatTopicsUiState.isVisiblePopup && this.isVisiblePopupPermissionInfo == chatTopicsUiState.isVisiblePopupPermissionInfo && this.isNotificationShown == chatTopicsUiState.isNotificationShown;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.topics.hashCode() * 31;
        boolean z = this.isCanClickTopic;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        TopicPopupDataUi topicPopupDataUi = this.popupData;
        int hashCode2 = (i2 + (topicPopupDataUi == null ? 0 : topicPopupDataUi.hashCode())) * 31;
        boolean z2 = this.isVisiblePopup;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (hashCode2 + i3) * 31;
        boolean z3 = this.isVisiblePopupPermissionInfo;
        int i5 = z3;
        if (z3 != 0) {
            i5 = 1;
        }
        int i6 = (i4 + i5) * 31;
        boolean z4 = this.isNotificationShown;
        return i6 + (z4 ? 1 : z4 ? 1 : 0);
    }

    public String toString() {
        ImmutableList<ChatPanelActionMarker> immutableList = this.topics;
        boolean z = this.isCanClickTopic;
        TopicPopupDataUi topicPopupDataUi = this.popupData;
        boolean z2 = this.isVisiblePopup;
        boolean z3 = this.isVisiblePopupPermissionInfo;
        boolean z4 = this.isNotificationShown;
        return "ChatTopicsUiState(topics=" + immutableList + ", isCanClickTopic=" + z + ", popupData=" + topicPopupDataUi + ", isVisiblePopup=" + z2 + ", isVisiblePopupPermissionInfo=" + z3 + ", isNotificationShown=" + z4 + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChatTopicsUiState(ImmutableList<? extends ChatPanelActionMarker> topics, boolean z, TopicPopupDataUi topicPopupDataUi, boolean z2, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(topics, "topics");
        this.topics = topics;
        this.isCanClickTopic = z;
        this.popupData = topicPopupDataUi;
        this.isVisiblePopup = z2;
        this.isVisiblePopupPermissionInfo = z3;
        this.isNotificationShown = z4;
    }

    public /* synthetic */ ChatTopicsUiState(PersistentList persistentList, boolean z, TopicPopupDataUi topicPopupDataUi, boolean z2, boolean z3, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ExtensionsKt.persistentListOf() : persistentList, (i & 2) != 0 ? true : z, (i & 4) != 0 ? null : topicPopupDataUi, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? false : z3, (i & 32) != 0 ? false : z4);
    }

    public final ImmutableList<ChatPanelActionMarker> getTopics() {
        return this.topics;
    }

    public final boolean isCanClickTopic() {
        return this.isCanClickTopic;
    }

    public final TopicPopupDataUi getPopupData() {
        return this.popupData;
    }

    public final boolean isVisiblePopup() {
        return this.isVisiblePopup;
    }

    public final boolean isVisiblePopupPermissionInfo() {
        return this.isVisiblePopupPermissionInfo;
    }

    public final boolean isNotificationShown() {
        return this.isNotificationShown;
    }
}
