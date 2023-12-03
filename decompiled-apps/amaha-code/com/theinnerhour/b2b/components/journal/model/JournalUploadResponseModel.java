package com.theinnerhour.b2b.components.journal.model;

import com.appsflyer.R;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
/* compiled from: JournalUploadResponseModel.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\nJ.\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/theinnerhour/b2b/components/journal/model/JournalUploadResponseModel;", "", "isSuccessful", "", "isDraft", "switchToViewPostDraftSave", "", "(ZZLjava/lang/Integer;)V", "()Z", "getSwitchToViewPostDraftSave", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(ZZLjava/lang/Integer;)Lcom/theinnerhour/b2b/components/journal/model/JournalUploadResponseModel;", "equals", "other", "hashCode", "toString", "", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class JournalUploadResponseModel {
    private final boolean isDraft;
    private final boolean isSuccessful;
    private final Integer switchToViewPostDraftSave;

    public JournalUploadResponseModel(boolean z10, boolean z11, Integer num) {
        this.isSuccessful = z10;
        this.isDraft = z11;
        this.switchToViewPostDraftSave = num;
    }

    public static /* synthetic */ JournalUploadResponseModel copy$default(JournalUploadResponseModel journalUploadResponseModel, boolean z10, boolean z11, Integer num, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            z10 = journalUploadResponseModel.isSuccessful;
        }
        if ((i6 & 2) != 0) {
            z11 = journalUploadResponseModel.isDraft;
        }
        if ((i6 & 4) != 0) {
            num = journalUploadResponseModel.switchToViewPostDraftSave;
        }
        return journalUploadResponseModel.copy(z10, z11, num);
    }

    public final boolean component1() {
        return this.isSuccessful;
    }

    public final boolean component2() {
        return this.isDraft;
    }

    public final Integer component3() {
        return this.switchToViewPostDraftSave;
    }

    public final JournalUploadResponseModel copy(boolean z10, boolean z11, Integer num) {
        return new JournalUploadResponseModel(z10, z11, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JournalUploadResponseModel)) {
            return false;
        }
        JournalUploadResponseModel journalUploadResponseModel = (JournalUploadResponseModel) obj;
        if (this.isSuccessful == journalUploadResponseModel.isSuccessful && this.isDraft == journalUploadResponseModel.isDraft && i.b(this.switchToViewPostDraftSave, journalUploadResponseModel.switchToViewPostDraftSave)) {
            return true;
        }
        return false;
    }

    public final Integer getSwitchToViewPostDraftSave() {
        return this.switchToViewPostDraftSave;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public int hashCode() {
        int hashCode;
        boolean z10 = this.isSuccessful;
        int i6 = 1;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        int i10 = r02 * 31;
        boolean z11 = this.isDraft;
        if (!z11) {
            i6 = z11 ? 1 : 0;
        }
        int i11 = (i10 + i6) * 31;
        Integer num = this.switchToViewPostDraftSave;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return i11 + hashCode;
    }

    public final boolean isDraft() {
        return this.isDraft;
    }

    public final boolean isSuccessful() {
        return this.isSuccessful;
    }

    public String toString() {
        return "JournalUploadResponseModel(isSuccessful=" + this.isSuccessful + ", isDraft=" + this.isDraft + ", switchToViewPostDraftSave=" + this.switchToViewPostDraftSave + ')';
    }
}
