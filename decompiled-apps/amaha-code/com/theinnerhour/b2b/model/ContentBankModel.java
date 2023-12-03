package com.theinnerhour.b2b.model;

import com.appsflyer.R;
import com.theinnerhour.b2b.utils.Constants;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
/* compiled from: ContentBankModel.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001e\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0006\"\u0004\b\u0015\u0010\bR\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0006\"\u0004\b\u001f\u0010\bR\u001c\u0010 \u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0006\"\u0004\b\"\u0010\bR\u001c\u0010#\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0006\"\u0004\b%\u0010\bR\u001e\u0010&\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b'\u0010\u0019\"\u0004\b(\u0010\u001bR\u001c\u0010)\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0006\"\u0004\b+\u0010\bR*\u0010,\u001a\u0012\u0012\u0004\u0012\u00020\u00040-j\b\u0012\u0004\u0012\u00020\u0004`.X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001c\u00103\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0006\"\u0004\b5\u0010\bR\u001e\u00106\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b7\u0010\u000f\"\u0004\b8\u0010\u0011¨\u00069"}, d2 = {"Lcom/theinnerhour/b2b/model/ContentBankModel;", "Ljava/io/Serializable;", "()V", Constants.SCREEN_ACTIVITY, "", "getActivity", "()Ljava/lang/String;", "setActivity", "(Ljava/lang/String;)V", "activityname", "getActivityname", "setActivityname", "created_at", "", "getCreated_at", "()Ljava/lang/Long;", "setCreated_at", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "domain", "getDomain", "setDomain", "filler", "", "getFiller", "()Ljava/lang/Boolean;", "setFiller", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "goalId", "getGoalId", "setGoalId", "id", "getId", "setId", "label", "getLabel", "setLabel", "published", "getPublished", "setPublished", "symptom", "getSymptom", "setSymptom", "tags", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getTags", "()Ljava/util/ArrayList;", "setTags", "(Ljava/util/ArrayList;)V", "templateId", "getTemplateId", "setTemplateId", "weightage", "getWeightage", "setWeightage", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class ContentBankModel implements Serializable {
    private String activity;
    private String activityname;
    private Long created_at;
    private String domain;
    private Boolean filler;
    private String goalId;

    /* renamed from: id  reason: collision with root package name */
    private String f11760id;
    private String label;
    private Boolean published;
    private String symptom;
    private ArrayList<String> tags = new ArrayList<>();
    private String templateId;
    private Long weightage;

    public final String getActivity() {
        return this.activity;
    }

    public final String getActivityname() {
        return this.activityname;
    }

    public final Long getCreated_at() {
        return this.created_at;
    }

    public final String getDomain() {
        return this.domain;
    }

    public final Boolean getFiller() {
        return this.filler;
    }

    public final String getGoalId() {
        return this.goalId;
    }

    public final String getId() {
        return this.f11760id;
    }

    public final String getLabel() {
        return this.label;
    }

    public final Boolean getPublished() {
        return this.published;
    }

    public final String getSymptom() {
        return this.symptom;
    }

    public final ArrayList<String> getTags() {
        return this.tags;
    }

    public final String getTemplateId() {
        return this.templateId;
    }

    public final Long getWeightage() {
        return this.weightage;
    }

    public final void setActivity(String str) {
        this.activity = str;
    }

    public final void setActivityname(String str) {
        this.activityname = str;
    }

    public final void setCreated_at(Long l2) {
        this.created_at = l2;
    }

    public final void setDomain(String str) {
        this.domain = str;
    }

    public final void setFiller(Boolean bool) {
        this.filler = bool;
    }

    public final void setGoalId(String str) {
        this.goalId = str;
    }

    public final void setId(String str) {
        this.f11760id = str;
    }

    public final void setLabel(String str) {
        this.label = str;
    }

    public final void setPublished(Boolean bool) {
        this.published = bool;
    }

    public final void setSymptom(String str) {
        this.symptom = str;
    }

    public final void setTags(ArrayList<String> arrayList) {
        i.g(arrayList, "<set-?>");
        this.tags = arrayList;
    }

    public final void setTemplateId(String str) {
        this.templateId = str;
    }

    public final void setWeightage(Long l2) {
        this.weightage = l2;
    }
}
