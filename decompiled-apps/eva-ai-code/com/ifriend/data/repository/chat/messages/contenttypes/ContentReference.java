package com.ifriend.data.repository.chat.messages.contenttypes;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ContentReference.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/ifriend/data/repository/chat/messages/contenttypes/ContentReference;", "", "type", "", FirebaseAnalytics.Param.CONTENT, "(Ljava/lang/String;Ljava/lang/String;)V", "getContent", "()Ljava/lang/String;", "getType", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ContentReference {
    private final String content;
    private final String type;

    public static /* synthetic */ ContentReference copy$default(ContentReference contentReference, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = contentReference.type;
        }
        if ((i & 2) != 0) {
            str2 = contentReference.content;
        }
        return contentReference.copy(str, str2);
    }

    public final String component1() {
        return this.type;
    }

    public final String component2() {
        return this.content;
    }

    public final ContentReference copy(String type, String content) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(content, "content");
        return new ContentReference(type, content);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ContentReference) {
            ContentReference contentReference = (ContentReference) obj;
            return Intrinsics.areEqual(this.type, contentReference.type) && Intrinsics.areEqual(this.content, contentReference.content);
        }
        return false;
    }

    public int hashCode() {
        return (this.type.hashCode() * 31) + this.content.hashCode();
    }

    public String toString() {
        String str = this.type;
        String str2 = this.content;
        return "ContentReference(type=" + str + ", content=" + str2 + ")";
    }

    public ContentReference(String type, String content) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(content, "content");
        this.type = type;
        this.content = content;
    }

    public final String getType() {
        return this.type;
    }

    public final String getContent() {
        return this.content;
    }
}
