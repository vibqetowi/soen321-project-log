package com.theinnerhour.b2b.components.journal.model;

import com.appsflyer.R;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;
import pl.a;
/* compiled from: JournalThoughtThinkingItemListModel.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/theinnerhour/b2b/components/journal/model/JournalThoughtThinkingItemListModel;", "Ljava/io/Serializable;", "id", "", "header", "descriptionText", "isExpanded", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getDescriptionText", "()Ljava/lang/String;", "getHeader", "getId", "()Z", "setExpanded", "(Z)V", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class JournalThoughtThinkingItemListModel implements Serializable {
    private final String descriptionText;
    private final String header;

    /* renamed from: id  reason: collision with root package name */
    private final String f11228id;
    private boolean isExpanded;

    public JournalThoughtThinkingItemListModel(String str, String str2, String str3, boolean z10) {
        e.u(str, "id", str2, "header", str3, "descriptionText");
        this.f11228id = str;
        this.header = str2;
        this.descriptionText = str3;
        this.isExpanded = z10;
    }

    public static /* synthetic */ JournalThoughtThinkingItemListModel copy$default(JournalThoughtThinkingItemListModel journalThoughtThinkingItemListModel, String str, String str2, String str3, boolean z10, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = journalThoughtThinkingItemListModel.f11228id;
        }
        if ((i6 & 2) != 0) {
            str2 = journalThoughtThinkingItemListModel.header;
        }
        if ((i6 & 4) != 0) {
            str3 = journalThoughtThinkingItemListModel.descriptionText;
        }
        if ((i6 & 8) != 0) {
            z10 = journalThoughtThinkingItemListModel.isExpanded;
        }
        return journalThoughtThinkingItemListModel.copy(str, str2, str3, z10);
    }

    public final String component1() {
        return this.f11228id;
    }

    public final String component2() {
        return this.header;
    }

    public final String component3() {
        return this.descriptionText;
    }

    public final boolean component4() {
        return this.isExpanded;
    }

    public final JournalThoughtThinkingItemListModel copy(String id2, String header, String descriptionText, boolean z10) {
        i.g(id2, "id");
        i.g(header, "header");
        i.g(descriptionText, "descriptionText");
        return new JournalThoughtThinkingItemListModel(id2, header, descriptionText, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JournalThoughtThinkingItemListModel)) {
            return false;
        }
        JournalThoughtThinkingItemListModel journalThoughtThinkingItemListModel = (JournalThoughtThinkingItemListModel) obj;
        if (i.b(this.f11228id, journalThoughtThinkingItemListModel.f11228id) && i.b(this.header, journalThoughtThinkingItemListModel.header) && i.b(this.descriptionText, journalThoughtThinkingItemListModel.descriptionText) && this.isExpanded == journalThoughtThinkingItemListModel.isExpanded) {
            return true;
        }
        return false;
    }

    public final String getDescriptionText() {
        return this.descriptionText;
    }

    public final String getHeader() {
        return this.header;
    }

    public final String getId() {
        return this.f11228id;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int c10 = a.c(this.descriptionText, a.c(this.header, this.f11228id.hashCode() * 31, 31), 31);
        boolean z10 = this.isExpanded;
        int i6 = z10;
        if (z10 != 0) {
            i6 = 1;
        }
        return c10 + i6;
    }

    public final boolean isExpanded() {
        return this.isExpanded;
    }

    public final void setExpanded(boolean z10) {
        this.isExpanded = z10;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("JournalThoughtThinkingItemListModel(id=");
        sb2.append(this.f11228id);
        sb2.append(", header=");
        sb2.append(this.header);
        sb2.append(", descriptionText=");
        sb2.append(this.descriptionText);
        sb2.append(", isExpanded=");
        return c.t(sb2, this.isExpanded, ')');
    }

    public /* synthetic */ JournalThoughtThinkingItemListModel(String str, String str2, String str3, boolean z10, int i6, d dVar) {
        this(str, str2, str3, (i6 & 8) != 0 ? false : z10);
    }
}
