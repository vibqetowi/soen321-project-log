package com.theinnerhour.b2b.model;

import com.appsflyer.R;
import com.theinnerhour.b2b.utils.Constants;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
/* compiled from: MiniCourse.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR*\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/theinnerhour/b2b/model/MiniCourse;", "Ljava/io/Serializable;", "()V", "course", "", "getCourse", "()Ljava/lang/String;", "setCourse", "(Ljava/lang/String;)V", "domain", "getDomain", "setDomain", "plan", "Ljava/util/ArrayList;", "Lcom/theinnerhour/b2b/model/CourseDayModelV1;", "Lkotlin/collections/ArrayList;", "getPlan", "()Ljava/util/ArrayList;", "setPlan", "(Ljava/util/ArrayList;)V", Constants.DAYMODEL_POSITION, "", "getPosition", "()I", "setPosition", "(I)V", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class MiniCourse implements Serializable {
    private String course;
    private String domain;
    private ArrayList<CourseDayModelV1> plan = new ArrayList<>();
    private int position;

    public final String getCourse() {
        return this.course;
    }

    public final String getDomain() {
        return this.domain;
    }

    public final ArrayList<CourseDayModelV1> getPlan() {
        return this.plan;
    }

    public final int getPosition() {
        return this.position;
    }

    public final void setCourse(String str) {
        this.course = str;
    }

    public final void setDomain(String str) {
        this.domain = str;
    }

    public final void setPlan(ArrayList<CourseDayModelV1> arrayList) {
        i.g(arrayList, "<set-?>");
        this.plan = arrayList;
    }

    public final void setPosition(int i6) {
        this.position = i6;
    }
}
