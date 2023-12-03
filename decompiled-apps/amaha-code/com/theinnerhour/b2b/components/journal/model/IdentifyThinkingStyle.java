package com.theinnerhour.b2b.components.journal.model;

import com.appsflyer.R;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;
import pl.a;
import tf.b;
import v.g;
/* compiled from: JournalThoughtModel.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0018\b\u0002\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u0019\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003JA\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0018\b\u0002\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b2\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\t\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR.\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u000e¨\u0006\""}, d2 = {"Lcom/theinnerhour/b2b/components/journal/model/IdentifyThinkingStyle;", "", "title", "", "description", "thinkingList", "Ljava/util/ArrayList;", "Lcom/theinnerhour/b2b/components/journal/model/ThinkingList;", "Lkotlin/collections/ArrayList;", "cta", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;)V", "getCta", "()Ljava/lang/String;", "setCta", "(Ljava/lang/String;)V", "getDescription", "setDescription", "getThinkingList", "()Ljava/util/ArrayList;", "setThinkingList", "(Ljava/util/ArrayList;)V", "getTitle", "setTitle", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class IdentifyThinkingStyle {
    @b("cta")
    private String cta;
    @b("description")
    private String description;
    @b("thinking_list")
    private ArrayList<ThinkingList> thinkingList;
    @b("title")
    private String title;

    public IdentifyThinkingStyle() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IdentifyThinkingStyle copy$default(IdentifyThinkingStyle identifyThinkingStyle, String str, String str2, ArrayList arrayList, String str3, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = identifyThinkingStyle.title;
        }
        if ((i6 & 2) != 0) {
            str2 = identifyThinkingStyle.description;
        }
        if ((i6 & 4) != 0) {
            arrayList = identifyThinkingStyle.thinkingList;
        }
        if ((i6 & 8) != 0) {
            str3 = identifyThinkingStyle.cta;
        }
        return identifyThinkingStyle.copy(str, str2, arrayList, str3);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.description;
    }

    public final ArrayList<ThinkingList> component3() {
        return this.thinkingList;
    }

    public final String component4() {
        return this.cta;
    }

    public final IdentifyThinkingStyle copy(String title, String description, ArrayList<ThinkingList> thinkingList, String cta) {
        i.g(title, "title");
        i.g(description, "description");
        i.g(thinkingList, "thinkingList");
        i.g(cta, "cta");
        return new IdentifyThinkingStyle(title, description, thinkingList, cta);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IdentifyThinkingStyle)) {
            return false;
        }
        IdentifyThinkingStyle identifyThinkingStyle = (IdentifyThinkingStyle) obj;
        if (i.b(this.title, identifyThinkingStyle.title) && i.b(this.description, identifyThinkingStyle.description) && i.b(this.thinkingList, identifyThinkingStyle.thinkingList) && i.b(this.cta, identifyThinkingStyle.cta)) {
            return true;
        }
        return false;
    }

    public final String getCta() {
        return this.cta;
    }

    public final String getDescription() {
        return this.description;
    }

    public final ArrayList<ThinkingList> getThinkingList() {
        return this.thinkingList;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.cta.hashCode() + c.j(this.thinkingList, a.c(this.description, this.title.hashCode() * 31, 31), 31);
    }

    public final void setCta(String str) {
        i.g(str, "<set-?>");
        this.cta = str;
    }

    public final void setDescription(String str) {
        i.g(str, "<set-?>");
        this.description = str;
    }

    public final void setThinkingList(ArrayList<ThinkingList> arrayList) {
        i.g(arrayList, "<set-?>");
        this.thinkingList = arrayList;
    }

    public final void setTitle(String str) {
        i.g(str, "<set-?>");
        this.title = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("IdentifyThinkingStyle(title=");
        sb2.append(this.title);
        sb2.append(", description=");
        sb2.append(this.description);
        sb2.append(", thinkingList=");
        sb2.append(this.thinkingList);
        sb2.append(", cta=");
        return g.c(sb2, this.cta, ')');
    }

    public IdentifyThinkingStyle(String title, String description, ArrayList<ThinkingList> thinkingList, String cta) {
        i.g(title, "title");
        i.g(description, "description");
        i.g(thinkingList, "thinkingList");
        i.g(cta, "cta");
        this.title = title;
        this.description = description;
        this.thinkingList = thinkingList;
        this.cta = cta;
    }

    public /* synthetic */ IdentifyThinkingStyle(String str, String str2, ArrayList arrayList, String str3, int i6, d dVar) {
        this((i6 & 1) != 0 ? "" : str, (i6 & 2) != 0 ? "" : str2, (i6 & 4) != 0 ? new ArrayList() : arrayList, (i6 & 8) != 0 ? "" : str3);
    }
}
