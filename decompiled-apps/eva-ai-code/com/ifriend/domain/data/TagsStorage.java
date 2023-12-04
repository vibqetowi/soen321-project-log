package com.ifriend.domain.data;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ifriend.domain.models.Tag;
import kotlin.Metadata;
import org.apache.http.cookie.ClientCookie;
/* compiled from: TagsStorage.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/ifriend/domain/data/TagsStorage;", "Lcom/ifriend/domain/data/TagsProvider;", "addTag", "", ViewHierarchyConstants.TAG_KEY, "Lcom/ifriend/domain/models/Tag;", "removeTag", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface TagsStorage extends TagsProvider {
    void addTag(Tag tag);

    void removeTag(Tag tag);
}
