package com.theinnerhour.b2b.components.journal.model;

import com.appsflyer.R;
import kotlin.Metadata;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;
import pl.a;
import tf.b;
import v.g;
/* compiled from: JournalThoughtModel.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/theinnerhour/b2b/components/journal/model/Describe;", "", "title", "", "textHint", "textHint2", "cta", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCta", "()Ljava/lang/String;", "setCta", "(Ljava/lang/String;)V", "getTextHint", "setTextHint", "getTextHint2", "setTextHint2", "getTitle", "setTitle", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class Describe {
    @b("cta")
    private String cta;
    @b("text_hint")
    private String textHint;
    @b("text_hint_2")
    private String textHint2;
    @b("title")
    private String title;

    public Describe() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ Describe copy$default(Describe describe, String str, String str2, String str3, String str4, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = describe.title;
        }
        if ((i6 & 2) != 0) {
            str2 = describe.textHint;
        }
        if ((i6 & 4) != 0) {
            str3 = describe.textHint2;
        }
        if ((i6 & 8) != 0) {
            str4 = describe.cta;
        }
        return describe.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.textHint;
    }

    public final String component3() {
        return this.textHint2;
    }

    public final String component4() {
        return this.cta;
    }

    public final Describe copy(String title, String textHint, String textHint2, String cta) {
        i.g(title, "title");
        i.g(textHint, "textHint");
        i.g(textHint2, "textHint2");
        i.g(cta, "cta");
        return new Describe(title, textHint, textHint2, cta);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Describe)) {
            return false;
        }
        Describe describe = (Describe) obj;
        if (i.b(this.title, describe.title) && i.b(this.textHint, describe.textHint) && i.b(this.textHint2, describe.textHint2) && i.b(this.cta, describe.cta)) {
            return true;
        }
        return false;
    }

    public final String getCta() {
        return this.cta;
    }

    public final String getTextHint() {
        return this.textHint;
    }

    public final String getTextHint2() {
        return this.textHint2;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.cta.hashCode() + a.c(this.textHint2, a.c(this.textHint, this.title.hashCode() * 31, 31), 31);
    }

    public final void setCta(String str) {
        i.g(str, "<set-?>");
        this.cta = str;
    }

    public final void setTextHint(String str) {
        i.g(str, "<set-?>");
        this.textHint = str;
    }

    public final void setTextHint2(String str) {
        i.g(str, "<set-?>");
        this.textHint2 = str;
    }

    public final void setTitle(String str) {
        i.g(str, "<set-?>");
        this.title = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Describe(title=");
        sb2.append(this.title);
        sb2.append(", textHint=");
        sb2.append(this.textHint);
        sb2.append(", textHint2=");
        sb2.append(this.textHint2);
        sb2.append(", cta=");
        return g.c(sb2, this.cta, ')');
    }

    public Describe(String title, String textHint, String textHint2, String cta) {
        i.g(title, "title");
        i.g(textHint, "textHint");
        i.g(textHint2, "textHint2");
        i.g(cta, "cta");
        this.title = title;
        this.textHint = textHint;
        this.textHint2 = textHint2;
        this.cta = cta;
    }

    public /* synthetic */ Describe(String str, String str2, String str3, String str4, int i6, d dVar) {
        this((i6 & 1) != 0 ? "" : str, (i6 & 2) != 0 ? "" : str2, (i6 & 4) != 0 ? "" : str3, (i6 & 8) != 0 ? "" : str4);
    }
}
