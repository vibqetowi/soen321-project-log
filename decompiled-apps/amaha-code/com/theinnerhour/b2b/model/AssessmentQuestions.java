package com.theinnerhour.b2b.model;

import com.theinnerhour.b2b.utils.SessionManager;
import java.io.Serializable;
import java.util.List;
import tf.b;
/* loaded from: classes2.dex */
public class AssessmentQuestions implements Serializable {
    @b("id")

    /* renamed from: id  reason: collision with root package name */
    private Integer f11758id;
    @b("order")
    private Integer isreverse_options;
    @b(SessionManager.KEY_NAME)
    private String name;
    @b("options")
    private List<AssessmentOptions> options = null;
    @b("order")
    private Integer order;
    @b("questions_type")
    private String questions_type;
    @b("slug")
    private String slug;

    public Integer getId() {
        return this.f11758id;
    }

    public Integer getIsreverse_options() {
        return this.isreverse_options;
    }

    public String getName() {
        return this.name;
    }

    public List<AssessmentOptions> getOptions() {
        return this.options;
    }

    public Integer getOrder() {
        return this.order;
    }

    public String getQuestions_type() {
        return this.questions_type;
    }

    public String getSlug() {
        return this.slug;
    }

    public void setId(Integer num) {
        this.f11758id = num;
    }

    public void setIsreverse_options(Integer num) {
        this.isreverse_options = num;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setOptions(List<AssessmentOptions> list) {
        this.options = list;
    }

    public void setOrder(Integer num) {
        this.order = num;
    }

    public void setQuestions_type(String str) {
        this.questions_type = str;
    }

    public void setSlug(String str) {
        this.slug = str;
    }
}
