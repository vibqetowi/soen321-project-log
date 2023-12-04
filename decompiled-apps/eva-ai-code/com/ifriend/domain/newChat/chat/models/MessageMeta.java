package com.ifriend.domain.newChat.chat.models;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* compiled from: MessageInfo.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/ifriend/domain/newChat/chat/models/MessageMeta;", "", "Topic", "Lcom/ifriend/domain/newChat/chat/models/MessageMeta$Topic;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface MessageMeta {

    /* compiled from: MessageInfo.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/ifriend/domain/newChat/chat/models/MessageMeta$Topic;", "Lcom/ifriend/domain/newChat/chat/models/MessageMeta;", "id", "", "text", "(Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getText", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Topic implements MessageMeta {
        private final String id;
        private final String text;

        public static /* synthetic */ Topic copy$default(Topic topic, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = topic.id;
            }
            if ((i & 2) != 0) {
                str2 = topic.text;
            }
            return topic.copy(str, str2);
        }

        public final String component1() {
            return this.id;
        }

        public final String component2() {
            return this.text;
        }

        public final Topic copy(String id, String text) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(text, "text");
            return new Topic(id, text);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Topic) {
                Topic topic = (Topic) obj;
                return Intrinsics.areEqual(this.id, topic.id) && Intrinsics.areEqual(this.text, topic.text);
            }
            return false;
        }

        public int hashCode() {
            return (this.id.hashCode() * 31) + this.text.hashCode();
        }

        public String toString() {
            String str = this.id;
            String str2 = this.text;
            return "Topic(id=" + str + ", text=" + str2 + ")";
        }

        public Topic(String id, String text) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(text, "text");
            this.id = id;
            this.text = text;
        }

        public final String getId() {
            return this.id;
        }

        public final String getText() {
            return this.text;
        }
    }
}
