package com.ifriend.domain.models;

import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* compiled from: Tag.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"contains", "", "", "Lcom/ifriend/domain/models/Tag;", "tagValue", "", ClientCookie.DOMAIN_ATTR}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TagKt {
    public static final boolean contains(List<Tag> list, String tagValue) {
        Intrinsics.checkNotNullParameter(tagValue, "tagValue");
        List<Tag> list2 = list;
        if (!(list2 == null || list2.isEmpty())) {
            List<Tag> list3 = list;
            if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                for (Tag tag : list3) {
                    if (Intrinsics.areEqual(tag.getValue(), tagValue)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
