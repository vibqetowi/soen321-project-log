package com.ifriend.chat.presentation.ui.diary.models;

import kotlin.Metadata;
/* compiled from: ShortDiaryPlaceholderUiModel.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/ifriend/chat/presentation/ui/diary/models/ShortDiaryPlaceholderUiModel;", "Lcom/ifriend/chat/presentation/ui/diary/models/DiaryListItem;", "position", "", "(I)V", "getPosition", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ShortDiaryPlaceholderUiModel implements DiaryListItem {
    public static final int $stable = 0;
    private final int position;

    public static /* synthetic */ ShortDiaryPlaceholderUiModel copy$default(ShortDiaryPlaceholderUiModel shortDiaryPlaceholderUiModel, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = shortDiaryPlaceholderUiModel.position;
        }
        return shortDiaryPlaceholderUiModel.copy(i);
    }

    public final int component1() {
        return this.position;
    }

    public final ShortDiaryPlaceholderUiModel copy(int i) {
        return new ShortDiaryPlaceholderUiModel(i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ShortDiaryPlaceholderUiModel) && this.position == ((ShortDiaryPlaceholderUiModel) obj).position;
    }

    public int hashCode() {
        return this.position;
    }

    public String toString() {
        int i = this.position;
        return "ShortDiaryPlaceholderUiModel(position=" + i + ")";
    }

    public ShortDiaryPlaceholderUiModel(int i) {
        this.position = i;
    }

    public final int getPosition() {
        return this.position;
    }
}
