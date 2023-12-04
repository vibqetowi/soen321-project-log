package com.facebook.share;

import com.facebook.share.internal.ShareConstants;
import kotlin.Metadata;
/* compiled from: Sharer.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\u0007J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H&¨\u0006\b"}, d2 = {"Lcom/facebook/share/Sharer;", "", "getShouldFailOnDataError", "", "setShouldFailOnDataError", "", "shouldFailOnDataError", "Result", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public interface Sharer {
    boolean getShouldFailOnDataError();

    void setShouldFailOnDataError(boolean z);

    /* compiled from: Sharer.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/facebook/share/Sharer$Result;", "", ShareConstants.RESULT_POST_ID, "", "(Ljava/lang/String;)V", "getPostId", "()Ljava/lang/String;", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Result {
        private final String postId;

        public Result(String str) {
            this.postId = str;
        }

        public final String getPostId() {
            return this.postId;
        }
    }
}
