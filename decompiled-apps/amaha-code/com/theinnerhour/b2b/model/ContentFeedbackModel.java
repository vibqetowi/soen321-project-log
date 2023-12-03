package com.theinnerhour.b2b.model;

import com.appsflyer.R;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
/* compiled from: ContentFeedbackModel.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR*\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0013j\b\u0012\u0004\u0012\u00020\u0004`\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0006\"\u0004\b\u001b\u0010\b¨\u0006\u001c"}, d2 = {"Lcom/theinnerhour/b2b/model/ContentFeedbackModel;", "", "()V", "content_id", "", "getContent_id", "()Ljava/lang/String;", "setContent_id", "(Ljava/lang/String;)V", "extra_weight", "", "getExtra_weight", "()I", "setExtra_weight", "(I)V", "feedback_type", "getFeedback_type", "setFeedback_type", "tags", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getTags", "()Ljava/util/ArrayList;", "setTags", "(Ljava/util/ArrayList;)V", "userComments", "getUserComments", "setUserComments", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class ContentFeedbackModel {
    private String content_id;
    private int extra_weight;
    private String feedback_type;
    private ArrayList<String> tags = new ArrayList<>();
    private String userComments;

    public final String getContent_id() {
        return this.content_id;
    }

    public final int getExtra_weight() {
        return this.extra_weight;
    }

    public final String getFeedback_type() {
        return this.feedback_type;
    }

    public final ArrayList<String> getTags() {
        return this.tags;
    }

    public final String getUserComments() {
        return this.userComments;
    }

    public final void setContent_id(String str) {
        this.content_id = str;
    }

    public final void setExtra_weight(int i6) {
        this.extra_weight = i6;
    }

    public final void setFeedback_type(String str) {
        this.feedback_type = str;
    }

    public final void setTags(ArrayList<String> arrayList) {
        i.g(arrayList, "<set-?>");
        this.tags = arrayList;
    }

    public final void setUserComments(String str) {
        this.userComments = str;
    }
}
