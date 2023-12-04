package com.ifriend.domain.models.diary;

import com.ifriend.analytics.AnalyticsConstants;
import com.ifriend.chat.new_chat.list.player.AudioPlayerState$Pause$$ExternalSyntheticBackport0;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* compiled from: DiaryNote.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u001c\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 -2\u00020\u0001:\u0001-BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\b¢\u0006\u0002\u0010\u000eJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J\t\u0010\"\u001a\u00020\bHÆ\u0003J\t\u0010#\u001a\u00020\bHÆ\u0003J\t\u0010$\u001a\u00020\fHÆ\u0003J\t\u0010%\u001a\u00020\bHÆ\u0003Jg\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\bHÆ\u0001J\u0013\u0010'\u001a\u00020\b2\b\u0010(\u001a\u0004\u0018\u00010)HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0017R\u001a\u0010\n\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0011\u0010\r\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0010¨\u0006."}, d2 = {"Lcom/ifriend/domain/models/diary/DiaryNote;", "Lcom/ifriend/domain/models/diary/DiaryNoteModel;", "id", "", "title", "descriptionShort", "description", "isAvailable", "", "isAnswered", "isFree", AnalyticsConstants.TIMESTAMP, "", "isShown", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZJZ)V", "getDescription", "()Ljava/lang/String;", "setDescription", "(Ljava/lang/String;)V", "getDescriptionShort", "setDescriptionShort", "getId", "setId", "()Z", "setFree", "(Z)V", "getTimestamp", "()J", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "", "toString", "Companion", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DiaryNote implements DiaryNoteModel {
    public static final Companion Companion = new Companion(null);
    private static final List<String> codingTemplates = CollectionsKt.listOf((Object[]) new String[]{"╒╣╥░▜a╞╪╣e╬╣╡wi╪▞▋░╫╫╬╒╞╣╪╫╣░╞░▜╬╥╬╣╪╬╒░╥<3╣╞╫▋╪╣╬╜▞▜╬╬╣╒░▋! ╫r▜╬╣.“▞╪╣:╪d▜╣-╫▋░()▜“la╥▜╪▞╫░╣╒╫, ▜╥d╬╣╞w░╬▜?╥‘’'╜░╬▞c░,░▞▜╥:╥░▋a║╞╬╥y░╣╪╞▜b▞╒░╣▋╪╬╝!╬╞╪░▜╥╫╬░╞-▜╣╞╬▋▞‘’░▜▋░╬╬╣.╬╪╒╫▜╣░:╬░╒░╪-╣░╪?╪╣░-╝╬░▞!", "S╞╫╥░▜╬╫fe╞╣╪▋╫╬░╥▞I╪╣╬╞╫╬do╒░╥▜░▋s╣╬╫╣╞░▜╬▋╞╫╬╬╥░╣╪▜╬╞░╒░▜╣╒░▞!░╫▞╬n╣?“╫▋░:░╞▜╬-b╬╫░()╥▜“D░▜▋╥╬░▞╞╬╒╪░╬╣╥c░╞▜?╒‘’'╬░╞▋,╫░▜G╪:╞▋╬▜░╒LO▞░╥╣╟╫░╪╬▜▋╒░▜╬╝!╣╪░▜╥╪╣╬░╞-d▞╫░╬╬░▋’’a╪▜▞╞░╬╣╞╬.╫▞╥░╫╣╬▋:╪░▒░╬-╥░╥?╬╣░,╝╣░▜!", "Lik░╪╣░▜╪╞╣╬b▋╫╬╒░╥▜╫W╬╬╒╫╫╣░╥░▋u░╬╣╬╣╥░▜╬▞░╞e╬╬╥░▜j╬▜╒░▞╬░░Ki╥▋░▜░╬╒░╞▜!╬░▞╪╣.F”╞▜░d."});
    private String description;
    private String descriptionShort;
    private String id;
    private final boolean isAnswered;
    private final boolean isAvailable;
    private boolean isFree;
    private final boolean isShown;
    private final long timestamp;
    private final String title;

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.descriptionShort;
    }

    public final String component4() {
        return this.description;
    }

    public final boolean component5() {
        return this.isAvailable;
    }

    public final boolean component6() {
        return this.isAnswered;
    }

    public final boolean component7() {
        return this.isFree;
    }

    public final long component8() {
        return this.timestamp;
    }

    public final boolean component9() {
        return this.isShown;
    }

    public final DiaryNote copy(String id, String title, String str, String str2, boolean z, boolean z2, boolean z3, long j, boolean z4) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        return new DiaryNote(id, title, str, str2, z, z2, z3, j, z4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DiaryNote) {
            DiaryNote diaryNote = (DiaryNote) obj;
            return Intrinsics.areEqual(this.id, diaryNote.id) && Intrinsics.areEqual(this.title, diaryNote.title) && Intrinsics.areEqual(this.descriptionShort, diaryNote.descriptionShort) && Intrinsics.areEqual(this.description, diaryNote.description) && this.isAvailable == diaryNote.isAvailable && this.isAnswered == diaryNote.isAnswered && this.isFree == diaryNote.isFree && this.timestamp == diaryNote.timestamp && this.isShown == diaryNote.isShown;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.id.hashCode() * 31) + this.title.hashCode()) * 31;
        String str = this.descriptionShort;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.description;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        boolean z = this.isAvailable;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode3 + i) * 31;
        boolean z2 = this.isAnswered;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        boolean z3 = this.isFree;
        int i5 = z3;
        if (z3 != 0) {
            i5 = 1;
        }
        int m = (((i4 + i5) * 31) + AudioPlayerState$Pause$$ExternalSyntheticBackport0.m(this.timestamp)) * 31;
        boolean z4 = this.isShown;
        return m + (z4 ? 1 : z4 ? 1 : 0);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.title;
        String str3 = this.descriptionShort;
        String str4 = this.description;
        boolean z = this.isAvailable;
        boolean z2 = this.isAnswered;
        boolean z3 = this.isFree;
        long j = this.timestamp;
        boolean z4 = this.isShown;
        return "DiaryNote(id=" + str + ", title=" + str2 + ", descriptionShort=" + str3 + ", description=" + str4 + ", isAvailable=" + z + ", isAnswered=" + z2 + ", isFree=" + z3 + ", timestamp=" + j + ", isShown=" + z4 + ")";
    }

    public DiaryNote(String id, String title, String str, String str2, boolean z, boolean z2, boolean z3, long j, boolean z4) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        this.id = id;
        this.title = title;
        this.descriptionShort = str;
        this.description = str2;
        this.isAvailable = z;
        this.isAnswered = z2;
        this.isFree = z3;
        this.timestamp = j;
        this.isShown = z4;
    }

    public /* synthetic */ DiaryNote(String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, long j, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, z, z2, (i & 64) != 0 ? false : z3, j, (i & 256) != 0 ? false : z4);
    }

    public final String getId() {
        return this.id;
    }

    public final void setId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.id = str;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getDescriptionShort() {
        return this.descriptionShort;
    }

    public final void setDescriptionShort(String str) {
        this.descriptionShort = str;
    }

    public final String getDescription() {
        return this.description;
    }

    public final void setDescription(String str) {
        this.description = str;
    }

    public final boolean isAvailable() {
        return this.isAvailable;
    }

    public final boolean isAnswered() {
        return this.isAnswered;
    }

    public final boolean isFree() {
        return this.isFree;
    }

    public final void setFree(boolean z) {
        this.isFree = z;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final boolean isShown() {
        return this.isShown;
    }

    /* compiled from: DiaryNote.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ifriend/domain/models/diary/DiaryNote$Companion;", "", "()V", "codingTemplates", "", "", "getCodingTemplates", "()Ljava/util/List;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<String> getCodingTemplates() {
            return DiaryNote.codingTemplates;
        }
    }
}
