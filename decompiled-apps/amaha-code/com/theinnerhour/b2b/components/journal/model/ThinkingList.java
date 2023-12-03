package com.theinnerhour.b2b.components.journal.model;

import com.appsflyer.R;
import kotlin.Metadata;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;
import pl.a;
import tf.b;
import v.g;
/* compiled from: JournalThoughtModel.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/theinnerhour/b2b/components/journal/model/ThinkingList;", "", "id", "", "title", "description", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "setDescription", "(Ljava/lang/String;)V", "getId", "setId", "getTitle", "setTitle", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class ThinkingList {
    @b("description")
    private String description;
    @b("id")

    /* renamed from: id  reason: collision with root package name */
    private String f11229id;
    @b("title")
    private String title;

    public ThinkingList(String str, String str2, String str3) {
        e.u(str, "id", str2, "title", str3, "description");
        this.f11229id = str;
        this.title = str2;
        this.description = str3;
    }

    public static /* synthetic */ ThinkingList copy$default(ThinkingList thinkingList, String str, String str2, String str3, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = thinkingList.f11229id;
        }
        if ((i6 & 2) != 0) {
            str2 = thinkingList.title;
        }
        if ((i6 & 4) != 0) {
            str3 = thinkingList.description;
        }
        return thinkingList.copy(str, str2, str3);
    }

    public final String component1() {
        return this.f11229id;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.description;
    }

    public final ThinkingList copy(String id2, String title, String description) {
        i.g(id2, "id");
        i.g(title, "title");
        i.g(description, "description");
        return new ThinkingList(id2, title, description);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThinkingList)) {
            return false;
        }
        ThinkingList thinkingList = (ThinkingList) obj;
        if (i.b(this.f11229id, thinkingList.f11229id) && i.b(this.title, thinkingList.title) && i.b(this.description, thinkingList.description)) {
            return true;
        }
        return false;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getId() {
        return this.f11229id;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.description.hashCode() + a.c(this.title, this.f11229id.hashCode() * 31, 31);
    }

    public final void setDescription(String str) {
        i.g(str, "<set-?>");
        this.description = str;
    }

    public final void setId(String str) {
        i.g(str, "<set-?>");
        this.f11229id = str;
    }

    public final void setTitle(String str) {
        i.g(str, "<set-?>");
        this.title = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ThinkingList(id=");
        sb2.append(this.f11229id);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", description=");
        return g.c(sb2, this.description, ')');
    }

    public /* synthetic */ ThinkingList(String str, String str2, String str3, int i6, d dVar) {
        this(str, (i6 & 2) != 0 ? "" : str2, (i6 & 4) != 0 ? "" : str3);
    }
}
