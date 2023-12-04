package com.ifriend.chat.presentation.ui.diary.fragments;

import com.ifriend.chat.presentation.ui.diary.models.DiaryListItem;
import com.ifriend.chat.presentation.ui.diary.models.DiaryUiModel;
import com.ifriend.chat.presentation.ui.diary.views.DiaryButtonState;
import com.ifriend.ui.base.mvvm.BaseState;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: DiaryScreenState.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u000f2\u00020\u0001:\u0003\u000f\u0010\u0011B\u0017\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\tR\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u0082\u0001\u0002\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/ifriend/chat/presentation/ui/diary/fragments/DiaryScreenState;", "Lcom/ifriend/ui/base/mvvm/BaseState;", "botName", "", "isFullScreenLoading", "", "(Ljava/lang/String;Z)V", "getBotName", "()Ljava/lang/String;", "()Z", "notes", "", "Lcom/ifriend/chat/presentation/ui/diary/models/DiaryListItem;", "getNotes", "()Ljava/util/List;", "Companion", "DiariesList", "DiaryDetail", "Lcom/ifriend/chat/presentation/ui/diary/fragments/DiaryScreenState$DiariesList;", "Lcom/ifriend/chat/presentation/ui/diary/fragments/DiaryScreenState$DiaryDetail;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class DiaryScreenState extends BaseState {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final DiariesList INITIAL = new DiariesList(CollectionsKt.emptyList(), false, "", 2, null);
    private final String botName;
    private final boolean isFullScreenLoading;

    public /* synthetic */ DiaryScreenState(String str, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z);
    }

    public abstract List<DiaryListItem> getNotes();

    public String getBotName() {
        return this.botName;
    }

    public boolean isFullScreenLoading() {
        return this.isFullScreenLoading;
    }

    private DiaryScreenState(String str, boolean z) {
        this.botName = str;
        this.isFullScreenLoading = z;
    }

    /* compiled from: DiaryScreenState.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0011\u001a\u00020\bHÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\bHÖ\u0001R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\fR\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/ifriend/chat/presentation/ui/diary/fragments/DiaryScreenState$DiariesList;", "Lcom/ifriend/chat/presentation/ui/diary/fragments/DiaryScreenState;", "notes", "", "Lcom/ifriend/chat/presentation/ui/diary/models/DiaryListItem;", "isFullScreenLoading", "", "botName", "", "(Ljava/util/List;ZLjava/lang/String;)V", "getBotName", "()Ljava/lang/String;", "()Z", "getNotes", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class DiariesList extends DiaryScreenState {
        public static final int $stable = 8;
        private final String botName;
        private final boolean isFullScreenLoading;
        private final List<DiaryListItem> notes;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ DiariesList copy$default(DiariesList diariesList, List list, boolean z, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                list = diariesList.notes;
            }
            if ((i & 2) != 0) {
                z = diariesList.isFullScreenLoading;
            }
            if ((i & 4) != 0) {
                str = diariesList.botName;
            }
            return diariesList.copy(list, z, str);
        }

        public final List<DiaryListItem> component1() {
            return this.notes;
        }

        public final boolean component2() {
            return this.isFullScreenLoading;
        }

        public final String component3() {
            return this.botName;
        }

        public final DiariesList copy(List<? extends DiaryListItem> notes, boolean z, String botName) {
            Intrinsics.checkNotNullParameter(notes, "notes");
            Intrinsics.checkNotNullParameter(botName, "botName");
            return new DiariesList(notes, z, botName);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof DiariesList) {
                DiariesList diariesList = (DiariesList) obj;
                return Intrinsics.areEqual(this.notes, diariesList.notes) && this.isFullScreenLoading == diariesList.isFullScreenLoading && Intrinsics.areEqual(this.botName, diariesList.botName);
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = this.notes.hashCode() * 31;
            boolean z = this.isFullScreenLoading;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return ((hashCode + i) * 31) + this.botName.hashCode();
        }

        public String toString() {
            List<DiaryListItem> list = this.notes;
            boolean z = this.isFullScreenLoading;
            String str = this.botName;
            return "DiariesList(notes=" + list + ", isFullScreenLoading=" + z + ", botName=" + str + ")";
        }

        public /* synthetic */ DiariesList(List list, boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i & 2) != 0 ? false : z, str);
        }

        @Override // com.ifriend.chat.presentation.ui.diary.fragments.DiaryScreenState
        public List<DiaryListItem> getNotes() {
            return this.notes;
        }

        @Override // com.ifriend.chat.presentation.ui.diary.fragments.DiaryScreenState
        public boolean isFullScreenLoading() {
            return this.isFullScreenLoading;
        }

        @Override // com.ifriend.chat.presentation.ui.diary.fragments.DiaryScreenState
        public String getBotName() {
            return this.botName;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public DiariesList(List<? extends DiaryListItem> notes, boolean z, String botName) {
            super(botName, z, null);
            Intrinsics.checkNotNullParameter(notes, "notes");
            Intrinsics.checkNotNullParameter(botName, "botName");
            this.notes = notes;
            this.isFullScreenLoading = z;
            this.botName = botName;
        }
    }

    /* compiled from: DiaryScreenState.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\u000bHÆ\u0003J\t\u0010\u001d\u001a\u00020\rHÆ\u0003JK\u0010\u001e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010\u001f\u001a\u00020\b2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u000bHÖ\u0001R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0015R\u0014\u0010\t\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0015R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006%"}, d2 = {"Lcom/ifriend/chat/presentation/ui/diary/fragments/DiaryScreenState$DiaryDetail;", "Lcom/ifriend/chat/presentation/ui/diary/fragments/DiaryScreenState;", "notes", "", "Lcom/ifriend/chat/presentation/ui/diary/models/DiaryListItem;", "diary", "Lcom/ifriend/chat/presentation/ui/diary/models/DiaryUiModel;", "isButtonLoading", "", "isFullScreenLoading", "botName", "", "buttonState", "Lcom/ifriend/chat/presentation/ui/diary/views/DiaryButtonState;", "(Ljava/util/List;Lcom/ifriend/chat/presentation/ui/diary/models/DiaryUiModel;ZZLjava/lang/String;Lcom/ifriend/chat/presentation/ui/diary/views/DiaryButtonState;)V", "getBotName", "()Ljava/lang/String;", "getButtonState", "()Lcom/ifriend/chat/presentation/ui/diary/views/DiaryButtonState;", "getDiary", "()Lcom/ifriend/chat/presentation/ui/diary/models/DiaryUiModel;", "()Z", "getNotes", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "", "toString", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class DiaryDetail extends DiaryScreenState {
        public static final int $stable = 8;
        private final String botName;
        private final DiaryButtonState buttonState;
        private final DiaryUiModel diary;
        private final boolean isButtonLoading;
        private final boolean isFullScreenLoading;
        private final List<DiaryListItem> notes;

        public static /* synthetic */ DiaryDetail copy$default(DiaryDetail diaryDetail, List list, DiaryUiModel diaryUiModel, boolean z, boolean z2, String str, DiaryButtonState diaryButtonState, int i, Object obj) {
            List<DiaryListItem> list2 = list;
            if ((i & 1) != 0) {
                list2 = diaryDetail.notes;
            }
            if ((i & 2) != 0) {
                diaryUiModel = diaryDetail.diary;
            }
            DiaryUiModel diaryUiModel2 = diaryUiModel;
            if ((i & 4) != 0) {
                z = diaryDetail.isButtonLoading;
            }
            boolean z3 = z;
            if ((i & 8) != 0) {
                z2 = diaryDetail.isFullScreenLoading;
            }
            boolean z4 = z2;
            if ((i & 16) != 0) {
                str = diaryDetail.botName;
            }
            String str2 = str;
            if ((i & 32) != 0) {
                diaryButtonState = diaryDetail.buttonState;
            }
            return diaryDetail.copy(list2, diaryUiModel2, z3, z4, str2, diaryButtonState);
        }

        public final List<DiaryListItem> component1() {
            return this.notes;
        }

        public final DiaryUiModel component2() {
            return this.diary;
        }

        public final boolean component3() {
            return this.isButtonLoading;
        }

        public final boolean component4() {
            return this.isFullScreenLoading;
        }

        public final String component5() {
            return this.botName;
        }

        public final DiaryButtonState component6() {
            return this.buttonState;
        }

        public final DiaryDetail copy(List<? extends DiaryListItem> notes, DiaryUiModel diary, boolean z, boolean z2, String botName, DiaryButtonState buttonState) {
            Intrinsics.checkNotNullParameter(notes, "notes");
            Intrinsics.checkNotNullParameter(diary, "diary");
            Intrinsics.checkNotNullParameter(botName, "botName");
            Intrinsics.checkNotNullParameter(buttonState, "buttonState");
            return new DiaryDetail(notes, diary, z, z2, botName, buttonState);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof DiaryDetail) {
                DiaryDetail diaryDetail = (DiaryDetail) obj;
                return Intrinsics.areEqual(this.notes, diaryDetail.notes) && Intrinsics.areEqual(this.diary, diaryDetail.diary) && this.isButtonLoading == diaryDetail.isButtonLoading && this.isFullScreenLoading == diaryDetail.isFullScreenLoading && Intrinsics.areEqual(this.botName, diaryDetail.botName) && Intrinsics.areEqual(this.buttonState, diaryDetail.buttonState);
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = ((this.notes.hashCode() * 31) + this.diary.hashCode()) * 31;
            boolean z = this.isButtonLoading;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            int i2 = (hashCode + i) * 31;
            boolean z2 = this.isFullScreenLoading;
            return ((((i2 + (z2 ? 1 : z2 ? 1 : 0)) * 31) + this.botName.hashCode()) * 31) + this.buttonState.hashCode();
        }

        public String toString() {
            List<DiaryListItem> list = this.notes;
            DiaryUiModel diaryUiModel = this.diary;
            boolean z = this.isButtonLoading;
            boolean z2 = this.isFullScreenLoading;
            String str = this.botName;
            DiaryButtonState diaryButtonState = this.buttonState;
            return "DiaryDetail(notes=" + list + ", diary=" + diaryUiModel + ", isButtonLoading=" + z + ", isFullScreenLoading=" + z2 + ", botName=" + str + ", buttonState=" + diaryButtonState + ")";
        }

        public /* synthetic */ DiaryDetail(List list, DiaryUiModel diaryUiModel, boolean z, boolean z2, String str, DiaryButtonState diaryButtonState, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, diaryUiModel, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, str, diaryButtonState);
        }

        @Override // com.ifriend.chat.presentation.ui.diary.fragments.DiaryScreenState
        public List<DiaryListItem> getNotes() {
            return this.notes;
        }

        public final DiaryUiModel getDiary() {
            return this.diary;
        }

        public final boolean isButtonLoading() {
            return this.isButtonLoading;
        }

        @Override // com.ifriend.chat.presentation.ui.diary.fragments.DiaryScreenState
        public boolean isFullScreenLoading() {
            return this.isFullScreenLoading;
        }

        @Override // com.ifriend.chat.presentation.ui.diary.fragments.DiaryScreenState
        public String getBotName() {
            return this.botName;
        }

        public final DiaryButtonState getButtonState() {
            return this.buttonState;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public DiaryDetail(List<? extends DiaryListItem> notes, DiaryUiModel diary, boolean z, boolean z2, String botName, DiaryButtonState buttonState) {
            super(botName, z2, null);
            Intrinsics.checkNotNullParameter(notes, "notes");
            Intrinsics.checkNotNullParameter(diary, "diary");
            Intrinsics.checkNotNullParameter(botName, "botName");
            Intrinsics.checkNotNullParameter(buttonState, "buttonState");
            this.notes = notes;
            this.diary = diary;
            this.isButtonLoading = z;
            this.isFullScreenLoading = z2;
            this.botName = botName;
            this.buttonState = buttonState;
        }
    }

    /* compiled from: DiaryScreenState.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ifriend/chat/presentation/ui/diary/fragments/DiaryScreenState$Companion;", "", "()V", "INITIAL", "Lcom/ifriend/chat/presentation/ui/diary/fragments/DiaryScreenState$DiariesList;", "getINITIAL", "()Lcom/ifriend/chat/presentation/ui/diary/fragments/DiaryScreenState$DiariesList;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DiariesList getINITIAL() {
            return DiaryScreenState.INITIAL;
        }
    }
}
