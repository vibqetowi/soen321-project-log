package com.theinnerhour.b2b.components.journal.model;

import com.appsflyer.R;
import kotlin.Metadata;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;
import pl.a;
import tf.b;
import v.g;
/* compiled from: JournalBasicModel.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/theinnerhour/b2b/components/journal/model/JournalBasicModel;", "", "titleHint", "", "descriptionHint", "cta", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCta", "()Ljava/lang/String;", "setCta", "(Ljava/lang/String;)V", "getDescriptionHint", "setDescriptionHint", "getTitleHint", "setTitleHint", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class JournalBasicModel {
    @b("cta")
    private String cta;
    @b("description_hint")
    private String descriptionHint;
    @b("title_hint")
    private String titleHint;

    public JournalBasicModel() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ JournalBasicModel copy$default(JournalBasicModel journalBasicModel, String str, String str2, String str3, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = journalBasicModel.titleHint;
        }
        if ((i6 & 2) != 0) {
            str2 = journalBasicModel.descriptionHint;
        }
        if ((i6 & 4) != 0) {
            str3 = journalBasicModel.cta;
        }
        return journalBasicModel.copy(str, str2, str3);
    }

    public final String component1() {
        return this.titleHint;
    }

    public final String component2() {
        return this.descriptionHint;
    }

    public final String component3() {
        return this.cta;
    }

    public final JournalBasicModel copy(String titleHint, String descriptionHint, String cta) {
        i.g(titleHint, "titleHint");
        i.g(descriptionHint, "descriptionHint");
        i.g(cta, "cta");
        return new JournalBasicModel(titleHint, descriptionHint, cta);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JournalBasicModel)) {
            return false;
        }
        JournalBasicModel journalBasicModel = (JournalBasicModel) obj;
        if (i.b(this.titleHint, journalBasicModel.titleHint) && i.b(this.descriptionHint, journalBasicModel.descriptionHint) && i.b(this.cta, journalBasicModel.cta)) {
            return true;
        }
        return false;
    }

    public final String getCta() {
        return this.cta;
    }

    public final String getDescriptionHint() {
        return this.descriptionHint;
    }

    public final String getTitleHint() {
        return this.titleHint;
    }

    public int hashCode() {
        return this.cta.hashCode() + a.c(this.descriptionHint, this.titleHint.hashCode() * 31, 31);
    }

    public final void setCta(String str) {
        i.g(str, "<set-?>");
        this.cta = str;
    }

    public final void setDescriptionHint(String str) {
        i.g(str, "<set-?>");
        this.descriptionHint = str;
    }

    public final void setTitleHint(String str) {
        i.g(str, "<set-?>");
        this.titleHint = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("JournalBasicModel(titleHint=");
        sb2.append(this.titleHint);
        sb2.append(", descriptionHint=");
        sb2.append(this.descriptionHint);
        sb2.append(", cta=");
        return g.c(sb2, this.cta, ')');
    }

    public JournalBasicModel(String str, String str2, String str3) {
        e.u(str, "titleHint", str2, "descriptionHint", str3, "cta");
        this.titleHint = str;
        this.descriptionHint = str2;
        this.cta = str3;
    }

    public /* synthetic */ JournalBasicModel(String str, String str2, String str3, int i6, d dVar) {
        this((i6 & 1) != 0 ? "" : str, (i6 & 2) != 0 ? "" : str2, (i6 & 4) != 0 ? "" : str3);
    }
}
