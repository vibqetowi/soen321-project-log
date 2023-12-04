package com.ifriend.domain.models;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ifriend.domain.models.profile.user.UserId;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* compiled from: Tag.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/ifriend/domain/models/TagOfUser;", "", ViewHierarchyConstants.TAG_KEY, "Lcom/ifriend/domain/models/Tag;", "userId", "Lcom/ifriend/domain/models/profile/user/UserId;", "(Lcom/ifriend/domain/models/Tag;Lcom/ifriend/domain/models/profile/user/UserId;)V", "getTag", "()Lcom/ifriend/domain/models/Tag;", "getUserId", "()Lcom/ifriend/domain/models/profile/user/UserId;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TagOfUser {
    private final Tag tag;
    private final UserId userId;

    public static /* synthetic */ TagOfUser copy$default(TagOfUser tagOfUser, Tag tag, UserId userId, int i, Object obj) {
        if ((i & 1) != 0) {
            tag = tagOfUser.tag;
        }
        if ((i & 2) != 0) {
            userId = tagOfUser.userId;
        }
        return tagOfUser.copy(tag, userId);
    }

    public final Tag component1() {
        return this.tag;
    }

    public final UserId component2() {
        return this.userId;
    }

    public final TagOfUser copy(Tag tag, UserId userId) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(userId, "userId");
        return new TagOfUser(tag, userId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TagOfUser) {
            TagOfUser tagOfUser = (TagOfUser) obj;
            return Intrinsics.areEqual(this.tag, tagOfUser.tag) && Intrinsics.areEqual(this.userId, tagOfUser.userId);
        }
        return false;
    }

    public int hashCode() {
        return (this.tag.hashCode() * 31) + this.userId.hashCode();
    }

    public String toString() {
        Tag tag = this.tag;
        UserId userId = this.userId;
        return "TagOfUser(tag=" + tag + ", userId=" + userId + ")";
    }

    public TagOfUser(Tag tag, UserId userId) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(userId, "userId");
        this.tag = tag;
        this.userId = userId;
    }

    public final Tag getTag() {
        return this.tag;
    }

    public final UserId getUserId() {
        return this.userId;
    }
}
