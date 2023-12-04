package com.ifriend.chat.presentation.ui.diary.models;

import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.ifriend.chat.presentation.ui.diary.models.DiaryTheme;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ThemedShortDiaryPlaceholderCardItem.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00062\u00020\u0001:\u0003\u0006\u0007\bR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Lcom/ifriend/chat/presentation/ui/diary/models/ThemedShortDiaryPlaceholderCardItem;", "Lcom/ifriend/chat/presentation/ui/diary/models/DiaryListItem;", "uiModel", "Lcom/ifriend/chat/presentation/ui/diary/models/ShortDiaryPlaceholderUiModel;", "getUiModel", "()Lcom/ifriend/chat/presentation/ui/diary/models/ShortDiaryPlaceholderUiModel;", "Companion", "Dark", "Light", "Lcom/ifriend/chat/presentation/ui/diary/models/ThemedShortDiaryPlaceholderCardItem$Dark;", "Lcom/ifriend/chat/presentation/ui/diary/models/ThemedShortDiaryPlaceholderCardItem$Light;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ThemedShortDiaryPlaceholderCardItem extends DiaryListItem {
    public static final Companion Companion = Companion.$$INSTANCE;

    ShortDiaryPlaceholderUiModel getUiModel();

    /* compiled from: ThemedShortDiaryPlaceholderCardItem.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/ifriend/chat/presentation/ui/diary/models/ThemedShortDiaryPlaceholderCardItem$Light;", "Lcom/ifriend/chat/presentation/ui/diary/models/ThemedShortDiaryPlaceholderCardItem;", "uiModel", "Lcom/ifriend/chat/presentation/ui/diary/models/ShortDiaryPlaceholderUiModel;", "(Lcom/ifriend/chat/presentation/ui/diary/models/ShortDiaryPlaceholderUiModel;)V", "getUiModel", "()Lcom/ifriend/chat/presentation/ui/diary/models/ShortDiaryPlaceholderUiModel;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Light implements ThemedShortDiaryPlaceholderCardItem {
        public static final int $stable = 0;
        private final ShortDiaryPlaceholderUiModel uiModel;

        public static /* synthetic */ Light copy$default(Light light, ShortDiaryPlaceholderUiModel shortDiaryPlaceholderUiModel, int i, Object obj) {
            if ((i & 1) != 0) {
                shortDiaryPlaceholderUiModel = light.uiModel;
            }
            return light.copy(shortDiaryPlaceholderUiModel);
        }

        public final ShortDiaryPlaceholderUiModel component1() {
            return this.uiModel;
        }

        public final Light copy(ShortDiaryPlaceholderUiModel uiModel) {
            Intrinsics.checkNotNullParameter(uiModel, "uiModel");
            return new Light(uiModel);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Light) && Intrinsics.areEqual(this.uiModel, ((Light) obj).uiModel);
        }

        public int hashCode() {
            return this.uiModel.hashCode();
        }

        public String toString() {
            ShortDiaryPlaceholderUiModel shortDiaryPlaceholderUiModel = this.uiModel;
            return "Light(uiModel=" + shortDiaryPlaceholderUiModel + ")";
        }

        public Light(ShortDiaryPlaceholderUiModel uiModel) {
            Intrinsics.checkNotNullParameter(uiModel, "uiModel");
            this.uiModel = uiModel;
        }

        @Override // com.ifriend.chat.presentation.ui.diary.models.ThemedShortDiaryPlaceholderCardItem
        public ShortDiaryPlaceholderUiModel getUiModel() {
            return this.uiModel;
        }
    }

    /* compiled from: ThemedShortDiaryPlaceholderCardItem.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/ifriend/chat/presentation/ui/diary/models/ThemedShortDiaryPlaceholderCardItem$Dark;", "Lcom/ifriend/chat/presentation/ui/diary/models/ThemedShortDiaryPlaceholderCardItem;", "uiModel", "Lcom/ifriend/chat/presentation/ui/diary/models/ShortDiaryPlaceholderUiModel;", "(Lcom/ifriend/chat/presentation/ui/diary/models/ShortDiaryPlaceholderUiModel;)V", "getUiModel", "()Lcom/ifriend/chat/presentation/ui/diary/models/ShortDiaryPlaceholderUiModel;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Dark implements ThemedShortDiaryPlaceholderCardItem {
        public static final int $stable = 0;
        private final ShortDiaryPlaceholderUiModel uiModel;

        public static /* synthetic */ Dark copy$default(Dark dark, ShortDiaryPlaceholderUiModel shortDiaryPlaceholderUiModel, int i, Object obj) {
            if ((i & 1) != 0) {
                shortDiaryPlaceholderUiModel = dark.uiModel;
            }
            return dark.copy(shortDiaryPlaceholderUiModel);
        }

        public final ShortDiaryPlaceholderUiModel component1() {
            return this.uiModel;
        }

        public final Dark copy(ShortDiaryPlaceholderUiModel uiModel) {
            Intrinsics.checkNotNullParameter(uiModel, "uiModel");
            return new Dark(uiModel);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Dark) && Intrinsics.areEqual(this.uiModel, ((Dark) obj).uiModel);
        }

        public int hashCode() {
            return this.uiModel.hashCode();
        }

        public String toString() {
            ShortDiaryPlaceholderUiModel shortDiaryPlaceholderUiModel = this.uiModel;
            return "Dark(uiModel=" + shortDiaryPlaceholderUiModel + ")";
        }

        public Dark(ShortDiaryPlaceholderUiModel uiModel) {
            Intrinsics.checkNotNullParameter(uiModel, "uiModel");
            this.uiModel = uiModel;
        }

        @Override // com.ifriend.chat.presentation.ui.diary.models.ThemedShortDiaryPlaceholderCardItem
        public ShortDiaryPlaceholderUiModel getUiModel() {
            return this.uiModel;
        }
    }

    /* compiled from: ThemedShortDiaryPlaceholderCardItem.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/ifriend/chat/presentation/ui/diary/models/ThemedShortDiaryPlaceholderCardItem$Companion;", "", "()V", "fromTheme", "Lcom/ifriend/chat/presentation/ui/diary/models/ThemedShortDiaryPlaceholderCardItem;", "theme", "Lcom/ifriend/chat/presentation/ui/diary/models/DiaryTheme;", DeviceRequestsHelper.DEVICE_INFO_MODEL, "Lcom/ifriend/chat/presentation/ui/diary/models/ShortDiaryPlaceholderUiModel;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final ThemedShortDiaryPlaceholderCardItem fromTheme(DiaryTheme theme, ShortDiaryPlaceholderUiModel model) {
            Intrinsics.checkNotNullParameter(theme, "theme");
            Intrinsics.checkNotNullParameter(model, "model");
            if (Intrinsics.areEqual(theme, DiaryTheme.Dark.INSTANCE)) {
                return new Dark(model);
            }
            if (Intrinsics.areEqual(theme, DiaryTheme.Light.INSTANCE)) {
                return new Light(model);
            }
            throw new NoWhenBranchMatchedException();
        }
    }
}
