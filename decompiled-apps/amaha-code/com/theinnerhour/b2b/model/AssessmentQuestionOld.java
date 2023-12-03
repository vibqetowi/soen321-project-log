package com.theinnerhour.b2b.model;

import com.appsflyer.R;
import com.theinnerhour.b2b.utils.Constants;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
/* compiled from: AssessmentQuestionOld.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b0\u0018\u00002\u00020\u0001B{\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00030\nj\b\u0012\u0004\u0012\u00020\u0003`\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0012B\u0083\u0001\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00030\nj\b\u0012\u0004\u0012\u00020\u0003`\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003¢\u0006\u0002\u0010\u0014B\u0005¢\u0006\u0002\u0010\u0015R\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u001e\"\u0004\b'\u0010 R\u001a\u0010\u000f\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001c\u0010,\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u001e\"\u0004\b.\u0010 R*\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00030\nj\b\u0012\u0004\u0012\u00020\u0003`\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001a\u0010\u0013\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u001e\"\u0004\b4\u0010 R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u001e\"\u0004\b6\u0010 R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u001e\"\u0004\b8\u0010 R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u001e\"\u0004\b:\u0010 R\u001e\u0010;\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b<\u0010\u0018\"\u0004\b=\u0010\u001a¨\u0006>"}, d2 = {"Lcom/theinnerhour/b2b/model/AssessmentQuestionOld;", "Ljava/io/Serializable;", "flag", "", "id", "", "totalQ", "title", "subtitle", "responseOptions", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "qtype", "hassubquestions", "", Constants.SCREEN_PROGRESS, "btn", "tag", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;ZILjava/lang/String;Ljava/lang/String;)V", "slug", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;ZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "()V", "ID", "getID", "()Ljava/lang/Integer;", "setID", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "btnText", "getBtnText", "()Ljava/lang/String;", "setBtnText", "(Ljava/lang/String;)V", "containsSubquestions", "getContainsSubquestions", "()Z", "setContainsSubquestions", "(Z)V", "getFlag", "setFlag", "getProgress", "()I", "setProgress", "(I)V", "qType", "getQType", "setQType", "getResponseOptions", "()Ljava/util/ArrayList;", "setResponseOptions", "(Ljava/util/ArrayList;)V", "getSlug", "setSlug", "getSubtitle", "setSubtitle", "getTag", "setTag", "getTitle", "setTitle", "totalQuestions", "getTotalQuestions", "setTotalQuestions", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class AssessmentQuestionOld implements Serializable {
    private Integer ID;
    private String btnText;
    private boolean containsSubquestions;
    private String flag;
    private int progress;
    private String qType;
    private ArrayList<String> responseOptions;
    private String slug;
    private String subtitle;
    private String tag;
    private String title;
    private Integer totalQuestions;

    public AssessmentQuestionOld() {
        this.flag = "AL";
        this.responseOptions = new ArrayList<>();
        this.totalQuestions = 0;
        this.qType = "";
        this.slug = "";
    }

    public final String getBtnText() {
        return this.btnText;
    }

    public final boolean getContainsSubquestions() {
        return this.containsSubquestions;
    }

    public final String getFlag() {
        return this.flag;
    }

    public final Integer getID() {
        return this.ID;
    }

    public final int getProgress() {
        return this.progress;
    }

    public final String getQType() {
        return this.qType;
    }

    public final ArrayList<String> getResponseOptions() {
        return this.responseOptions;
    }

    public final String getSlug() {
        return this.slug;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTag() {
        return this.tag;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Integer getTotalQuestions() {
        return this.totalQuestions;
    }

    public final void setBtnText(String str) {
        this.btnText = str;
    }

    public final void setContainsSubquestions(boolean z10) {
        this.containsSubquestions = z10;
    }

    public final void setFlag(String str) {
        i.g(str, "<set-?>");
        this.flag = str;
    }

    public final void setID(Integer num) {
        this.ID = num;
    }

    public final void setProgress(int i6) {
        this.progress = i6;
    }

    public final void setQType(String str) {
        this.qType = str;
    }

    public final void setResponseOptions(ArrayList<String> arrayList) {
        i.g(arrayList, "<set-?>");
        this.responseOptions = arrayList;
    }

    public final void setSlug(String str) {
        i.g(str, "<set-?>");
        this.slug = str;
    }

    public final void setSubtitle(String str) {
        this.subtitle = str;
    }

    public final void setTag(String str) {
        this.tag = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setTotalQuestions(Integer num) {
        this.totalQuestions = num;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AssessmentQuestionOld(String flag, Integer num, Integer num2, String title, String str, ArrayList<String> responseOptions, String str2, boolean z10, int i6, String str3, String str4) {
        this();
        i.g(flag, "flag");
        i.g(title, "title");
        i.g(responseOptions, "responseOptions");
        this.flag = flag;
        this.ID = num;
        this.totalQuestions = num2;
        this.title = title;
        this.subtitle = str;
        this.responseOptions = responseOptions;
        this.qType = str2;
        this.containsSubquestions = z10;
        this.progress = i6;
        this.btnText = str3;
        this.tag = str4;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AssessmentQuestionOld(String flag, Integer num, Integer num2, String title, String str, ArrayList<String> responseOptions, String str2, boolean z10, int i6, String str3, String str4, String slug) {
        this();
        i.g(flag, "flag");
        i.g(title, "title");
        i.g(responseOptions, "responseOptions");
        i.g(slug, "slug");
        this.flag = flag;
        this.ID = num;
        this.totalQuestions = num2;
        this.title = title;
        this.subtitle = str;
        this.responseOptions = responseOptions;
        this.qType = str2;
        this.containsSubquestions = z10;
        this.progress = i6;
        this.btnText = str3;
        this.tag = str4;
        this.slug = slug;
    }
}
