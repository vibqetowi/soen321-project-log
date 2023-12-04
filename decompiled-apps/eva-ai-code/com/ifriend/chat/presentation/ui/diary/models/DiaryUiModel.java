package com.ifriend.chat.presentation.ui.diary.models;

import com.ifriend.domain.models.diary.DiaryNote;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: DiaryUiModel.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\nHÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003JO\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010!\u001a\u00020\u00032\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0012\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000e¨\u0006&"}, d2 = {"Lcom/ifriend/chat/presentation/ui/diary/models/DiaryUiModel;", "", "isAvailable", "", "datetime", "", "title", "shortDescription", "description", "domainModel", "Lcom/ifriend/domain/models/diary/DiaryNote;", "isAnswered", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ifriend/domain/models/diary/DiaryNote;Z)V", "getDatetime", "()Ljava/lang/String;", "getDescription", "getDomainModel", "()Lcom/ifriend/domain/models/diary/DiaryNote;", "id", "getId", "id$delegate", "Lkotlin/Lazy;", "()Z", "getShortDescription", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DiaryUiModel {
    public static final int $stable = 8;
    private final String datetime;
    private final String description;
    private final DiaryNote domainModel;
    private final Lazy id$delegate;
    private final boolean isAnswered;
    private final boolean isAvailable;
    private final String shortDescription;
    private final String title;

    public static /* synthetic */ DiaryUiModel copy$default(DiaryUiModel diaryUiModel, boolean z, String str, String str2, String str3, String str4, DiaryNote diaryNote, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = diaryUiModel.isAvailable;
        }
        if ((i & 2) != 0) {
            str = diaryUiModel.datetime;
        }
        String str5 = str;
        if ((i & 4) != 0) {
            str2 = diaryUiModel.title;
        }
        String str6 = str2;
        if ((i & 8) != 0) {
            str3 = diaryUiModel.shortDescription;
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            str4 = diaryUiModel.description;
        }
        String str8 = str4;
        if ((i & 32) != 0) {
            diaryNote = diaryUiModel.domainModel;
        }
        DiaryNote diaryNote2 = diaryNote;
        if ((i & 64) != 0) {
            z2 = diaryUiModel.isAnswered;
        }
        return diaryUiModel.copy(z, str5, str6, str7, str8, diaryNote2, z2);
    }

    public final boolean component1() {
        return this.isAvailable;
    }

    public final String component2() {
        return this.datetime;
    }

    public final String component3() {
        return this.title;
    }

    public final String component4() {
        return this.shortDescription;
    }

    public final String component5() {
        return this.description;
    }

    public final DiaryNote component6() {
        return this.domainModel;
    }

    public final boolean component7() {
        return this.isAnswered;
    }

    public final DiaryUiModel copy(boolean z, String datetime, String title, String shortDescription, String description, DiaryNote domainModel, boolean z2) {
        Intrinsics.checkNotNullParameter(datetime, "datetime");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(shortDescription, "shortDescription");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(domainModel, "domainModel");
        return new DiaryUiModel(z, datetime, title, shortDescription, description, domainModel, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DiaryUiModel) {
            DiaryUiModel diaryUiModel = (DiaryUiModel) obj;
            return this.isAvailable == diaryUiModel.isAvailable && Intrinsics.areEqual(this.datetime, diaryUiModel.datetime) && Intrinsics.areEqual(this.title, diaryUiModel.title) && Intrinsics.areEqual(this.shortDescription, diaryUiModel.shortDescription) && Intrinsics.areEqual(this.description, diaryUiModel.description) && Intrinsics.areEqual(this.domainModel, diaryUiModel.domainModel) && this.isAnswered == diaryUiModel.isAnswered;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    public int hashCode() {
        boolean z = this.isAvailable;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int hashCode = ((((((((((r0 * 31) + this.datetime.hashCode()) * 31) + this.title.hashCode()) * 31) + this.shortDescription.hashCode()) * 31) + this.description.hashCode()) * 31) + this.domainModel.hashCode()) * 31;
        boolean z2 = this.isAnswered;
        return hashCode + (z2 ? 1 : z2 ? 1 : 0);
    }

    public String toString() {
        boolean z = this.isAvailable;
        String str = this.datetime;
        String str2 = this.title;
        String str3 = this.shortDescription;
        String str4 = this.description;
        DiaryNote diaryNote = this.domainModel;
        boolean z2 = this.isAnswered;
        return "DiaryUiModel(isAvailable=" + z + ", datetime=" + str + ", title=" + str2 + ", shortDescription=" + str3 + ", description=" + str4 + ", domainModel=" + diaryNote + ", isAnswered=" + z2 + ")";
    }

    public DiaryUiModel(boolean z, String datetime, String title, String shortDescription, String description, DiaryNote domainModel, boolean z2) {
        Intrinsics.checkNotNullParameter(datetime, "datetime");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(shortDescription, "shortDescription");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(domainModel, "domainModel");
        this.isAvailable = z;
        this.datetime = datetime;
        this.title = title;
        this.shortDescription = shortDescription;
        this.description = description;
        this.domainModel = domainModel;
        this.isAnswered = z2;
        this.id$delegate = LazyKt.lazy(new DiaryUiModel$id$2(this));
    }

    public final boolean isAvailable() {
        return this.isAvailable;
    }

    public final String getDatetime() {
        return this.datetime;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getShortDescription() {
        return this.shortDescription;
    }

    public final String getDescription() {
        return this.description;
    }

    public final DiaryNote getDomainModel() {
        return this.domainModel;
    }

    public final boolean isAnswered() {
        return this.isAnswered;
    }

    public final String getId() {
        return (String) this.id$delegate.getValue();
    }
}
