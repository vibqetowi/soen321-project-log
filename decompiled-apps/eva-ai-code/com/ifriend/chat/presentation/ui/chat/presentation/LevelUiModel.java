package com.ifriend.chat.presentation.ui.chat.presentation;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
/* compiled from: LevelUiModel.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/ifriend/chat/presentation/ui/chat/presentation/LevelUiModel;", "", "DoesNotShow", "NotLoaded", "Show", "Lcom/ifriend/chat/presentation/ui/chat/presentation/LevelUiModel$DoesNotShow;", "Lcom/ifriend/chat/presentation/ui/chat/presentation/LevelUiModel$NotLoaded;", "Lcom/ifriend/chat/presentation/ui/chat/presentation/LevelUiModel$Show;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface LevelUiModel {

    /* compiled from: LevelUiModel.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/chat/presentation/ui/chat/presentation/LevelUiModel$NotLoaded;", "Lcom/ifriend/chat/presentation/ui/chat/presentation/LevelUiModel;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class NotLoaded implements LevelUiModel {
        public static final int $stable = 0;
        public static final NotLoaded INSTANCE = new NotLoaded();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof NotLoaded) {
                NotLoaded notLoaded = (NotLoaded) obj;
                return true;
            }
            return false;
        }

        public int hashCode() {
            return -1301926239;
        }

        public String toString() {
            return "NotLoaded";
        }

        private NotLoaded() {
        }
    }

    /* compiled from: LevelUiModel.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/ifriend/chat/presentation/ui/chat/presentation/LevelUiModel$DoesNotShow;", "Lcom/ifriend/chat/presentation/ui/chat/presentation/LevelUiModel;", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class DoesNotShow implements LevelUiModel {
        public static final int $stable = 0;
        public static final DoesNotShow INSTANCE = new DoesNotShow();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof DoesNotShow) {
                DoesNotShow doesNotShow = (DoesNotShow) obj;
                return true;
            }
            return false;
        }

        public int hashCode() {
            return 1258356576;
        }

        public String toString() {
            return "DoesNotShow";
        }

        private DoesNotShow() {
        }
    }

    /* compiled from: LevelUiModel.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/ifriend/chat/presentation/ui/chat/presentation/LevelUiModel$Show;", "Lcom/ifriend/chat/presentation/ui/chat/presentation/LevelUiModel;", FirebaseAnalytics.Param.LEVEL, "", "progress", "maxProgress", "(III)V", "getLevel", "()I", "getMaxProgress", "getProgress", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Show implements LevelUiModel {
        public static final int $stable = 0;
        private final int level;
        private final int maxProgress;
        private final int progress;

        public static /* synthetic */ Show copy$default(Show show, int i, int i2, int i3, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                i = show.level;
            }
            if ((i4 & 2) != 0) {
                i2 = show.progress;
            }
            if ((i4 & 4) != 0) {
                i3 = show.maxProgress;
            }
            return show.copy(i, i2, i3);
        }

        public final int component1() {
            return this.level;
        }

        public final int component2() {
            return this.progress;
        }

        public final int component3() {
            return this.maxProgress;
        }

        public final Show copy(int i, int i2, int i3) {
            return new Show(i, i2, i3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Show) {
                Show show = (Show) obj;
                return this.level == show.level && this.progress == show.progress && this.maxProgress == show.maxProgress;
            }
            return false;
        }

        public int hashCode() {
            return (((this.level * 31) + this.progress) * 31) + this.maxProgress;
        }

        public String toString() {
            int i = this.level;
            int i2 = this.progress;
            int i3 = this.maxProgress;
            return "Show(level=" + i + ", progress=" + i2 + ", maxProgress=" + i3 + ")";
        }

        public Show(int i, int i2, int i3) {
            this.level = i;
            this.progress = i2;
            this.maxProgress = i3;
        }

        public final int getLevel() {
            return this.level;
        }

        public final int getProgress() {
            return this.progress;
        }

        public final int getMaxProgress() {
            return this.maxProgress;
        }
    }
}
