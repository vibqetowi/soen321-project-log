package com.theinnerhour.b2b.model;

import com.appsflyer.R;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
/* compiled from: ScreenModel.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR*\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00110\u0010j\b\u0012\u0004\u0012\u00020\u0011`\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\f\"\u0004\b\u0019\u0010\u000eR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\f\"\u0004\b\u001c\u0010\u000eR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\f\"\u0004\b\u001f\u0010\u000eR\u001c\u0010 \u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\f\"\u0004\b\"\u0010\u000eR\u001c\u0010#\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\f\"\u0004\b%\u0010\u000eR\u001a\u0010&\u001a\u00020'X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001a\u0010,\u001a\u00020'X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010)\"\u0004\b.\u0010+¨\u0006/"}, d2 = {"Lcom/theinnerhour/b2b/model/LearningHubModel;", "Ljava/io/Serializable;", "()V", "day", "", "getDay", "()I", "setDay", "(I)V", "duration", "", "getDuration", "()Ljava/lang/String;", "setDuration", "(Ljava/lang/String;)V", "fields", "Ljava/util/ArrayList;", "Lcom/theinnerhour/b2b/model/LearningHubFieldModel;", "Lkotlin/collections/ArrayList;", "getFields", "()Ljava/util/ArrayList;", "setFields", "(Ljava/util/ArrayList;)V", "id", "getId", "setId", "language", "getLanguage", "setLanguage", "layout_id", "getLayout_id", "setLayout_id", "post_type", "getPost_type", "setPost_type", "programme", "getProgramme", "setProgramme", "published", "", "getPublished", "()Z", "setPublished", "(Z)V", "status", "getStatus", "setStatus", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class LearningHubModel implements Serializable {
    private int day;
    private String duration;
    private ArrayList<LearningHubFieldModel> fields = new ArrayList<>();

    /* renamed from: id  reason: collision with root package name */
    private String f11766id;
    private String language;
    private String layout_id;
    private String post_type;
    private String programme;
    private boolean published;
    private boolean status;

    public final int getDay() {
        return this.day;
    }

    public final String getDuration() {
        return this.duration;
    }

    public final ArrayList<LearningHubFieldModel> getFields() {
        return this.fields;
    }

    public final String getId() {
        return this.f11766id;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final String getLayout_id() {
        return this.layout_id;
    }

    public final String getPost_type() {
        return this.post_type;
    }

    public final String getProgramme() {
        return this.programme;
    }

    public final boolean getPublished() {
        return this.published;
    }

    public final boolean getStatus() {
        return this.status;
    }

    public final void setDay(int i6) {
        this.day = i6;
    }

    public final void setDuration(String str) {
        this.duration = str;
    }

    public final void setFields(ArrayList<LearningHubFieldModel> arrayList) {
        i.g(arrayList, "<set-?>");
        this.fields = arrayList;
    }

    public final void setId(String str) {
        this.f11766id = str;
    }

    public final void setLanguage(String str) {
        this.language = str;
    }

    public final void setLayout_id(String str) {
        this.layout_id = str;
    }

    public final void setPost_type(String str) {
        this.post_type = str;
    }

    public final void setProgramme(String str) {
        this.programme = str;
    }

    public final void setPublished(boolean z10) {
        this.published = z10;
    }

    public final void setStatus(boolean z10) {
        this.status = z10;
    }
}
