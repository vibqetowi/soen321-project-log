package com.theinnerhour.b2b.model;

import com.appsflyer.R;
import java.io.Serializable;
import kotlin.Metadata;
/* compiled from: ScreenModel.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\f"}, d2 = {"Lcom/theinnerhour/b2b/model/PostsRead;", "Ljava/io/Serializable;", "()V", "courseName", "", "getCourseName", "()Ljava/lang/String;", "setCourseName", "(Ljava/lang/String;)V", "postId", "getPostId", "setPostId", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class PostsRead implements Serializable {
    private String courseName;
    private String postId;

    public final String getCourseName() {
        return this.courseName;
    }

    public final String getPostId() {
        return this.postId;
    }

    public final void setCourseName(String str) {
        this.courseName = str;
    }

    public final void setPostId(String str) {
        this.postId = str;
    }
}
