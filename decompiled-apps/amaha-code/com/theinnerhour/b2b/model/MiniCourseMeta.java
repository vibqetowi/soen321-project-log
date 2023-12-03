package com.theinnerhour.b2b.model;

import com.appsflyer.R;
import com.theinnerhour.b2b.utils.Constants;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
/* compiled from: MiniCourseMeta.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR*\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u001fj\b\u0012\u0004\u0012\u00020\u0004` X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001c\u0010%\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0006\"\u0004\b'\u0010\bR\u001a\u0010(\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0018\"\u0004\b*\u0010\u001a¨\u0006+"}, d2 = {"Lcom/theinnerhour/b2b/model/MiniCourseMeta;", "Ljava/io/Serializable;", "()V", Constants.SCREEN_ACTIVITY, "", "getActivity", "()Ljava/lang/String;", "setActivity", "(Ljava/lang/String;)V", "domain", "getDomain", "setDomain", "goalId", "getGoalId", "setGoalId", "id", "getId", "setId", "label", "getLabel", "setLabel", Constants.DAYMODEL_POSITION, "", "getPosition", "()I", "setPosition", "(I)V", "symptom", "getSymptom", "setSymptom", "tags", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getTags", "()Ljava/util/ArrayList;", "setTags", "(Ljava/util/ArrayList;)V", "templateId", "getTemplateId", "setTemplateId", "weightage", "getWeightage", "setWeightage", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class MiniCourseMeta implements Serializable {
    private String activity;
    private String domain;
    private String goalId;

    /* renamed from: id  reason: collision with root package name */
    private String f11769id;
    private String label;
    private int position;
    private String symptom;
    private ArrayList<String> tags = new ArrayList<>();
    private String templateId;
    private int weightage;

    public final String getActivity() {
        return this.activity;
    }

    public final String getDomain() {
        return this.domain;
    }

    public final String getGoalId() {
        return this.goalId;
    }

    public final String getId() {
        return this.f11769id;
    }

    public final String getLabel() {
        return this.label;
    }

    public final int getPosition() {
        return this.position;
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

    public final int getWeightage() {
        return this.weightage;
    }

    public final void setActivity(String str) {
        this.activity = str;
    }

    public final void setDomain(String str) {
        this.domain = str;
    }

    public final void setGoalId(String str) {
        this.goalId = str;
    }

    public final void setId(String str) {
        this.f11769id = str;
    }

    public final void setLabel(String str) {
        this.label = str;
    }

    public final void setPosition(int i6) {
        this.position = i6;
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

    public final void setWeightage(int i6) {
        this.weightage = i6;
    }
}
