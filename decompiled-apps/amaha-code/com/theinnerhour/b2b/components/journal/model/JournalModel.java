package com.theinnerhour.b2b.components.journal.model;

import com.appsflyer.R;
import com.theinnerhour.b2b.utils.SessionManager;
import fe.i;
import fe.p;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.d;
import pl.a;
/* compiled from: JournalModel.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012,\b\u0002\u0010\f\u001a&\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\rj\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u0001`\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t¢\u0006\u0002\u0010\u0011J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0005HÆ\u0003J\t\u00101\u001a\u00020\u0005HÆ\u0003J\t\u00102\u001a\u00020\u0005HÆ\u0003J\t\u00103\u001a\u00020\tHÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\tHÆ\u0003J-\u00106\u001a&\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\rj\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u0001`\u000fHÆ\u0003J\t\u00107\u001a\u00020\tHÆ\u0003J\u0087\u0001\u00108\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\t2,\b\u0002\u0010\f\u001a&\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\rj\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u0001`\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\tHÆ\u0001J\u0013\u00109\u001a\u00020\t2\b\u0010:\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010;\u001a\u00020<HÖ\u0001J\t\u0010=\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R>\u0010\f\u001a&\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\rj\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u0001`\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R \u0010\u001a\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001c\"\u0004\b \u0010\u001eR\u001e\u0010\u0010\u001a\u00020\t8\u0007@\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010!\"\u0004\b\"\u0010#R\u001e\u0010\u000b\u001a\u00020\t8\u0007@\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010!\"\u0004\b$\u0010#R\u001e\u0010\b\u001a\u00020\t8\u0007@\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010!\"\u0004\b%\u0010#R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0013\"\u0004\b'\u0010\u0015R\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u001c\"\u0004\b)\u0010\u001eR\u001c\u0010*\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u001c\"\u0004\b,\u0010\u001eR\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0013\"\u0004\b.\u0010\u0015¨\u0006>"}, d2 = {"Lcom/theinnerhour/b2b/components/journal/model/JournalModel;", "Ljava/io/Serializable;", "id", "", "lastUpdated", "", "userEnteredDate", "createdOn", "isSynced", "", "templateType", "isFavourite", "data", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "isDraft", "(Ljava/lang/String;JJJZLjava/lang/String;ZLjava/util/HashMap;Z)V", "getCreatedOn", "()J", "setCreatedOn", "(J)V", "getData", "()Ljava/util/HashMap;", "setData", "(Ljava/util/HashMap;)V", "firestoreDocumentId", "getFirestoreDocumentId", "()Ljava/lang/String;", "setFirestoreDocumentId", "(Ljava/lang/String;)V", "getId", "setId", "()Z", "setDraft", "(Z)V", "setFavourite", "setSynced", "getLastUpdated", "setLastUpdated", "getTemplateType", "setTemplateType", SessionManager.KEY_UID, "getUid", "setUid", "getUserEnteredDate", "setUserEnteredDate", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class JournalModel implements Serializable {
    private long createdOn;
    private HashMap<String, Object> data;
    @i
    private String firestoreDocumentId;

    /* renamed from: id  reason: collision with root package name */
    private String f11227id;
    private boolean isDraft;
    private boolean isFavourite;
    private boolean isSynced;
    private long lastUpdated;
    private String templateType;
    private String uid;
    private long userEnteredDate;

    public JournalModel() {
        this(null, 0L, 0L, 0L, false, null, false, null, false, 511, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ JournalModel copy$default(JournalModel journalModel, String str, long j10, long j11, long j12, boolean z10, String str2, boolean z11, HashMap hashMap, boolean z12, int i6, Object obj) {
        String str3;
        long j13;
        long j14;
        long j15;
        boolean z13;
        String str4;
        boolean z14;
        HashMap<String, Object> hashMap2;
        boolean z15;
        if ((i6 & 1) != 0) {
            str3 = journalModel.f11227id;
        } else {
            str3 = str;
        }
        if ((i6 & 2) != 0) {
            j13 = journalModel.lastUpdated;
        } else {
            j13 = j10;
        }
        if ((i6 & 4) != 0) {
            j14 = journalModel.userEnteredDate;
        } else {
            j14 = j11;
        }
        if ((i6 & 8) != 0) {
            j15 = journalModel.createdOn;
        } else {
            j15 = j12;
        }
        if ((i6 & 16) != 0) {
            z13 = journalModel.isSynced;
        } else {
            z13 = z10;
        }
        if ((i6 & 32) != 0) {
            str4 = journalModel.templateType;
        } else {
            str4 = str2;
        }
        if ((i6 & 64) != 0) {
            z14 = journalModel.isFavourite;
        } else {
            z14 = z11;
        }
        if ((i6 & 128) != 0) {
            hashMap2 = journalModel.data;
        } else {
            hashMap2 = hashMap;
        }
        if ((i6 & 256) != 0) {
            z15 = journalModel.isDraft;
        } else {
            z15 = z12;
        }
        return journalModel.copy(str3, j13, j14, j15, z13, str4, z14, hashMap2, z15);
    }

    public final String component1() {
        return this.f11227id;
    }

    public final long component2() {
        return this.lastUpdated;
    }

    public final long component3() {
        return this.userEnteredDate;
    }

    public final long component4() {
        return this.createdOn;
    }

    public final boolean component5() {
        return this.isSynced;
    }

    public final String component6() {
        return this.templateType;
    }

    public final boolean component7() {
        return this.isFavourite;
    }

    public final HashMap<String, Object> component8() {
        return this.data;
    }

    public final boolean component9() {
        return this.isDraft;
    }

    public final JournalModel copy(String id2, long j10, long j11, long j12, boolean z10, String templateType, boolean z11, HashMap<String, Object> hashMap, boolean z12) {
        kotlin.jvm.internal.i.g(id2, "id");
        kotlin.jvm.internal.i.g(templateType, "templateType");
        return new JournalModel(id2, j10, j11, j12, z10, templateType, z11, hashMap, z12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JournalModel)) {
            return false;
        }
        JournalModel journalModel = (JournalModel) obj;
        if (kotlin.jvm.internal.i.b(this.f11227id, journalModel.f11227id) && this.lastUpdated == journalModel.lastUpdated && this.userEnteredDate == journalModel.userEnteredDate && this.createdOn == journalModel.createdOn && this.isSynced == journalModel.isSynced && kotlin.jvm.internal.i.b(this.templateType, journalModel.templateType) && this.isFavourite == journalModel.isFavourite && kotlin.jvm.internal.i.b(this.data, journalModel.data) && this.isDraft == journalModel.isDraft) {
            return true;
        }
        return false;
    }

    public final long getCreatedOn() {
        return this.createdOn;
    }

    public final HashMap<String, Object> getData() {
        return this.data;
    }

    public final String getFirestoreDocumentId() {
        return this.firestoreDocumentId;
    }

    public final String getId() {
        return this.f11227id;
    }

    public final long getLastUpdated() {
        return this.lastUpdated;
    }

    public final String getTemplateType() {
        return this.templateType;
    }

    public final String getUid() {
        return this.uid;
    }

    public final long getUserEnteredDate() {
        return this.userEnteredDate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        long j10 = this.lastUpdated;
        long j11 = this.userEnteredDate;
        long j12 = this.createdOn;
        int hashCode2 = ((((((this.f11227id.hashCode() * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) (j12 ^ (j12 >>> 32)))) * 31;
        boolean z10 = this.isSynced;
        int i6 = 1;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int c10 = a.c(this.templateType, (hashCode2 + i10) * 31, 31);
        boolean z11 = this.isFavourite;
        int i11 = z11;
        if (z11 != 0) {
            i11 = 1;
        }
        int i12 = (c10 + i11) * 31;
        HashMap<String, Object> hashMap = this.data;
        if (hashMap == null) {
            hashCode = 0;
        } else {
            hashCode = hashMap.hashCode();
        }
        int i13 = (i12 + hashCode) * 31;
        boolean z12 = this.isDraft;
        if (!z12) {
            i6 = z12 ? 1 : 0;
        }
        return i13 + i6;
    }

    @p("isDraft")
    public final boolean isDraft() {
        return this.isDraft;
    }

    @p("isFavourite")
    public final boolean isFavourite() {
        return this.isFavourite;
    }

    @p("isSynced")
    public final boolean isSynced() {
        return this.isSynced;
    }

    public final void setCreatedOn(long j10) {
        this.createdOn = j10;
    }

    public final void setData(HashMap<String, Object> hashMap) {
        this.data = hashMap;
    }

    @p("isDraft")
    public final void setDraft(boolean z10) {
        this.isDraft = z10;
    }

    @p("isFavourite")
    public final void setFavourite(boolean z10) {
        this.isFavourite = z10;
    }

    public final void setFirestoreDocumentId(String str) {
        this.firestoreDocumentId = str;
    }

    public final void setId(String str) {
        kotlin.jvm.internal.i.g(str, "<set-?>");
        this.f11227id = str;
    }

    public final void setLastUpdated(long j10) {
        this.lastUpdated = j10;
    }

    @p("isSynced")
    public final void setSynced(boolean z10) {
        this.isSynced = z10;
    }

    public final void setTemplateType(String str) {
        kotlin.jvm.internal.i.g(str, "<set-?>");
        this.templateType = str;
    }

    public final void setUid(String str) {
        this.uid = str;
    }

    public final void setUserEnteredDate(long j10) {
        this.userEnteredDate = j10;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("JournalModel(id=");
        sb2.append(this.f11227id);
        sb2.append(", lastUpdated=");
        sb2.append(this.lastUpdated);
        sb2.append(", userEnteredDate=");
        sb2.append(this.userEnteredDate);
        sb2.append(", createdOn=");
        sb2.append(this.createdOn);
        sb2.append(", isSynced=");
        sb2.append(this.isSynced);
        sb2.append(", templateType=");
        sb2.append(this.templateType);
        sb2.append(", isFavourite=");
        sb2.append(this.isFavourite);
        sb2.append(", data=");
        sb2.append(this.data);
        sb2.append(", isDraft=");
        return c.t(sb2, this.isDraft, ')');
    }

    public JournalModel(String id2, long j10, long j11, long j12, boolean z10, String templateType, boolean z11, HashMap<String, Object> hashMap, boolean z12) {
        kotlin.jvm.internal.i.g(id2, "id");
        kotlin.jvm.internal.i.g(templateType, "templateType");
        this.f11227id = id2;
        this.lastUpdated = j10;
        this.userEnteredDate = j11;
        this.createdOn = j12;
        this.isSynced = z10;
        this.templateType = templateType;
        this.isFavourite = z11;
        this.data = hashMap;
        this.isDraft = z12;
    }

    public /* synthetic */ JournalModel(String str, long j10, long j11, long j12, boolean z10, String str2, boolean z11, HashMap hashMap, boolean z12, int i6, d dVar) {
        this((i6 & 1) != 0 ? "" : str, (i6 & 2) != 0 ? 0L : j10, (i6 & 4) != 0 ? 0L : j11, (i6 & 8) == 0 ? j12 : 0L, (i6 & 16) != 0 ? false : z10, (i6 & 32) == 0 ? str2 : "", (i6 & 64) != 0 ? false : z11, (i6 & 128) != 0 ? null : hashMap, (i6 & 256) == 0 ? z12 : false);
    }
}
