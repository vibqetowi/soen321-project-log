package com.ifriend.chat.new_chat.list.ui.model;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ThemedTopicSeparatorUiModel.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0006\u0007R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/ifriend/chat/new_chat/list/ui/model/ThemedTopicSeparatorUiModel;", "Lcom/ifriend/chat/new_chat/list/ui/model/TagHolder;", "uiModel", "Lcom/ifriend/chat/new_chat/list/ui/model/TopicSeparatorUiModel;", "getUiModel", "()Lcom/ifriend/chat/new_chat/list/ui/model/TopicSeparatorUiModel;", "Dark", "Premium", "Lcom/ifriend/chat/new_chat/list/ui/model/ThemedTopicSeparatorUiModel$Dark;", "Lcom/ifriend/chat/new_chat/list/ui/model/ThemedTopicSeparatorUiModel$Premium;", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ThemedTopicSeparatorUiModel extends TagHolder {
    TopicSeparatorUiModel getUiModel();

    /* compiled from: ThemedTopicSeparatorUiModel.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\t\u0010\f\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0007HÖ\u0001R\u0012\u0010\u0006\u001a\u00020\u0007X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/ifriend/chat/new_chat/list/ui/model/ThemedTopicSeparatorUiModel$Dark;", "Lcom/ifriend/chat/new_chat/list/ui/model/ThemedTopicSeparatorUiModel;", "Lcom/ifriend/chat/new_chat/list/ui/model/TagHolder;", "uiModel", "Lcom/ifriend/chat/new_chat/list/ui/model/TopicSeparatorUiModel;", "(Lcom/ifriend/chat/new_chat/list/ui/model/TopicSeparatorUiModel;)V", ViewHierarchyConstants.TAG_KEY, "", "getTag", "()Ljava/lang/String;", "getUiModel", "()Lcom/ifriend/chat/new_chat/list/ui/model/TopicSeparatorUiModel;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Dark implements ThemedTopicSeparatorUiModel, TagHolder {
        public static final int $stable = 0;
        private final TopicSeparatorUiModel uiModel;

        public static /* synthetic */ Dark copy$default(Dark dark, TopicSeparatorUiModel topicSeparatorUiModel, int i, Object obj) {
            if ((i & 1) != 0) {
                topicSeparatorUiModel = dark.uiModel;
            }
            return dark.copy(topicSeparatorUiModel);
        }

        public final TopicSeparatorUiModel component1() {
            return this.uiModel;
        }

        public final Dark copy(TopicSeparatorUiModel uiModel) {
            Intrinsics.checkNotNullParameter(uiModel, "uiModel");
            return new Dark(uiModel);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Dark) && Intrinsics.areEqual(this.uiModel, ((Dark) obj).uiModel);
        }

        @Override // com.ifriend.chat.new_chat.list.ui.model.TagHolder
        public String getTag() {
            return this.uiModel.getTag();
        }

        public int hashCode() {
            return this.uiModel.hashCode();
        }

        public String toString() {
            TopicSeparatorUiModel topicSeparatorUiModel = this.uiModel;
            return "Dark(uiModel=" + topicSeparatorUiModel + ")";
        }

        public Dark(TopicSeparatorUiModel uiModel) {
            Intrinsics.checkNotNullParameter(uiModel, "uiModel");
            this.uiModel = uiModel;
        }

        @Override // com.ifriend.chat.new_chat.list.ui.model.ThemedTopicSeparatorUiModel
        public TopicSeparatorUiModel getUiModel() {
            return this.uiModel;
        }
    }

    /* compiled from: ThemedTopicSeparatorUiModel.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\t\u0010\f\u001a\u00020\u0004HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0007HÖ\u0001R\u0012\u0010\u0006\u001a\u00020\u0007X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/ifriend/chat/new_chat/list/ui/model/ThemedTopicSeparatorUiModel$Premium;", "Lcom/ifriend/chat/new_chat/list/ui/model/ThemedTopicSeparatorUiModel;", "Lcom/ifriend/chat/new_chat/list/ui/model/TagHolder;", "uiModel", "Lcom/ifriend/chat/new_chat/list/ui/model/TopicSeparatorUiModel;", "(Lcom/ifriend/chat/new_chat/list/ui/model/TopicSeparatorUiModel;)V", ViewHierarchyConstants.TAG_KEY, "", "getTag", "()Ljava/lang/String;", "getUiModel", "()Lcom/ifriend/chat/new_chat/list/ui/model/TopicSeparatorUiModel;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Premium implements ThemedTopicSeparatorUiModel, TagHolder {
        public static final int $stable = 0;
        private final TopicSeparatorUiModel uiModel;

        public static /* synthetic */ Premium copy$default(Premium premium, TopicSeparatorUiModel topicSeparatorUiModel, int i, Object obj) {
            if ((i & 1) != 0) {
                topicSeparatorUiModel = premium.uiModel;
            }
            return premium.copy(topicSeparatorUiModel);
        }

        public final TopicSeparatorUiModel component1() {
            return this.uiModel;
        }

        public final Premium copy(TopicSeparatorUiModel uiModel) {
            Intrinsics.checkNotNullParameter(uiModel, "uiModel");
            return new Premium(uiModel);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Premium) && Intrinsics.areEqual(this.uiModel, ((Premium) obj).uiModel);
        }

        @Override // com.ifriend.chat.new_chat.list.ui.model.TagHolder
        public String getTag() {
            return this.uiModel.getTag();
        }

        public int hashCode() {
            return this.uiModel.hashCode();
        }

        public String toString() {
            TopicSeparatorUiModel topicSeparatorUiModel = this.uiModel;
            return "Premium(uiModel=" + topicSeparatorUiModel + ")";
        }

        public Premium(TopicSeparatorUiModel uiModel) {
            Intrinsics.checkNotNullParameter(uiModel, "uiModel");
            this.uiModel = uiModel;
        }

        @Override // com.ifriend.chat.new_chat.list.ui.model.ThemedTopicSeparatorUiModel
        public TopicSeparatorUiModel getUiModel() {
            return this.uiModel;
        }
    }
}
