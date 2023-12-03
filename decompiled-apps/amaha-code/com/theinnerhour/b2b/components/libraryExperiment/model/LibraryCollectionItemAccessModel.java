package com.theinnerhour.b2b.components.libraryExperiment.model;

import com.appsflyer.R;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
/* compiled from: LibraryCollectionItemAccessModel.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u0011\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005B%\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0002\u0010\fJ\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003J1\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0007HÖ\u0001R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u000b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0011\"\u0004\b\u0014\u0010\u0013R\u001a\u0010\n\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0011\"\u0004\b\u0015\u0010\u0013¨\u0006!"}, d2 = {"Lcom/theinnerhour/b2b/components/libraryExperiment/model/LibraryCollectionItemAccessModel;", "Ljava/io/Serializable;", "()V", "model", "Lcom/theinnerhour/b2b/components/libraryExperiment/model/UserLibraryItemAccessModel;", "(Lcom/theinnerhour/b2b/components/libraryExperiment/model/UserLibraryItemAccessModel;)V", "id", "", "isAccessed", "", "isCompleted", "isBookmarked", "(Ljava/lang/String;ZZZ)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "()Z", "setAccessed", "(Z)V", "setBookmarked", "setCompleted", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class LibraryCollectionItemAccessModel implements Serializable {

    /* renamed from: id  reason: collision with root package name */
    private String f11298id;
    private boolean isAccessed;
    private boolean isBookmarked;
    private boolean isCompleted;

    public LibraryCollectionItemAccessModel(String id2, boolean z10, boolean z11, boolean z12) {
        i.g(id2, "id");
        this.f11298id = id2;
        this.isAccessed = z10;
        this.isCompleted = z11;
        this.isBookmarked = z12;
    }

    public static /* synthetic */ LibraryCollectionItemAccessModel copy$default(LibraryCollectionItemAccessModel libraryCollectionItemAccessModel, String str, boolean z10, boolean z11, boolean z12, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = libraryCollectionItemAccessModel.f11298id;
        }
        if ((i6 & 2) != 0) {
            z10 = libraryCollectionItemAccessModel.isAccessed;
        }
        if ((i6 & 4) != 0) {
            z11 = libraryCollectionItemAccessModel.isCompleted;
        }
        if ((i6 & 8) != 0) {
            z12 = libraryCollectionItemAccessModel.isBookmarked;
        }
        return libraryCollectionItemAccessModel.copy(str, z10, z11, z12);
    }

    public final String component1() {
        return this.f11298id;
    }

    public final boolean component2() {
        return this.isAccessed;
    }

    public final boolean component3() {
        return this.isCompleted;
    }

    public final boolean component4() {
        return this.isBookmarked;
    }

    public final LibraryCollectionItemAccessModel copy(String id2, boolean z10, boolean z11, boolean z12) {
        i.g(id2, "id");
        return new LibraryCollectionItemAccessModel(id2, z10, z11, z12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LibraryCollectionItemAccessModel)) {
            return false;
        }
        LibraryCollectionItemAccessModel libraryCollectionItemAccessModel = (LibraryCollectionItemAccessModel) obj;
        if (i.b(this.f11298id, libraryCollectionItemAccessModel.f11298id) && this.isAccessed == libraryCollectionItemAccessModel.isAccessed && this.isCompleted == libraryCollectionItemAccessModel.isCompleted && this.isBookmarked == libraryCollectionItemAccessModel.isBookmarked) {
            return true;
        }
        return false;
    }

    public final String getId() {
        return this.f11298id;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f11298id.hashCode() * 31;
        boolean z10 = this.isAccessed;
        int i6 = 1;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode + i10) * 31;
        boolean z11 = this.isCompleted;
        int i12 = z11;
        if (z11 != 0) {
            i12 = 1;
        }
        int i13 = (i11 + i12) * 31;
        boolean z12 = this.isBookmarked;
        if (!z12) {
            i6 = z12 ? 1 : 0;
        }
        return i13 + i6;
    }

    public final boolean isAccessed() {
        return this.isAccessed;
    }

    public final boolean isBookmarked() {
        return this.isBookmarked;
    }

    public final boolean isCompleted() {
        return this.isCompleted;
    }

    public final void setAccessed(boolean z10) {
        this.isAccessed = z10;
    }

    public final void setBookmarked(boolean z10) {
        this.isBookmarked = z10;
    }

    public final void setCompleted(boolean z10) {
        this.isCompleted = z10;
    }

    public final void setId(String str) {
        i.g(str, "<set-?>");
        this.f11298id = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("LibraryCollectionItemAccessModel(id=");
        sb2.append(this.f11298id);
        sb2.append(", isAccessed=");
        sb2.append(this.isAccessed);
        sb2.append(", isCompleted=");
        sb2.append(this.isCompleted);
        sb2.append(", isBookmarked=");
        return c.t(sb2, this.isBookmarked, ')');
    }

    public LibraryCollectionItemAccessModel() {
        this("", false, false, false);
    }

    public LibraryCollectionItemAccessModel(UserLibraryItemAccessModel userLibraryItemAccessModel) {
        this((userLibraryItemAccessModel == null || (r0 = userLibraryItemAccessModel.getId()) == null) ? "" : "", true ^ ((userLibraryItemAccessModel == null || (r3 = userLibraryItemAccessModel.getStartDate()) == null || r3.longValue() != 0) ? false : true), userLibraryItemAccessModel != null ? userLibraryItemAccessModel.isCompleted() : false, userLibraryItemAccessModel != null ? userLibraryItemAccessModel.isFavourite() : false);
        Long startDate;
    }
}
