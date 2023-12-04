package io.perfmark;

import javax.annotation.Nullable;
/* loaded from: classes4.dex */
public final class Tag {
    final long tagId;
    @Nullable
    final String tagName;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Tag(@Nullable String str, long j) {
        this.tagName = str;
        this.tagId = j;
    }
}
