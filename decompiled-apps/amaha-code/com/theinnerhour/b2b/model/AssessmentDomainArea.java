package com.theinnerhour.b2b.model;

import com.theinnerhour.b2b.utils.SessionManager;
import tf.b;
/* loaded from: classes2.dex */
public class AssessmentDomainArea {
    @b("id")

    /* renamed from: id  reason: collision with root package name */
    private Integer f11756id;
    @b(SessionManager.KEY_NAME)
    private String name;
    @b("slug")
    private String slug;

    public Integer getId() {
        return this.f11756id;
    }

    public String getName() {
        return this.name;
    }

    public String getSlug() {
        return this.slug;
    }

    public void setId(Integer num) {
        this.f11756id = num;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setSlug(String str) {
        this.slug = str;
    }
}
