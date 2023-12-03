package com.theinnerhour.b2b.model;

import com.theinnerhour.b2b.utils.SessionManager;
import java.io.Serializable;
import tf.b;
/* loaded from: classes2.dex */
public class AssessmentOptions implements Serializable {
    @b("id")

    /* renamed from: id  reason: collision with root package name */
    private Integer f11757id;
    @b("label")
    private String label;
    @b(SessionManager.KEY_NAME)
    private String name;
    @b("score")
    private Integer score;
    @b("slug")
    private String slug;

    public Integer getId() {
        return this.f11757id;
    }

    public String getLabel() {
        return this.label;
    }

    public String getName() {
        return this.name;
    }

    public Integer getScore() {
        return this.score;
    }

    public String getSlug() {
        return this.slug;
    }

    public void setId(Integer num) {
        this.f11757id = num;
    }

    public void setLabel(String str) {
        this.label = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setScore(Integer num) {
        this.score = num;
    }

    public void setSlug(String str) {
        this.slug = str;
    }
}
