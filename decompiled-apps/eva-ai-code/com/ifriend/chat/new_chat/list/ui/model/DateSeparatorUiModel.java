package com.ifriend.chat.new_chat.list.ui.model;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ifriend.analytics.AnalyticsConstants;
import com.ifriend.chat.new_chat.list.player.AudioPlayerState$Pause$$ExternalSyntheticBackport0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: DateSeparatorUiModel.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/ifriend/chat/new_chat/list/ui/model/DateSeparatorUiModel;", "Lcom/ifriend/chat/new_chat/list/ui/model/TagHolder;", "date", "", AnalyticsConstants.TIMESTAMP, "", "(Ljava/lang/String;J)V", "getDate", "()Ljava/lang/String;", ViewHierarchyConstants.TAG_KEY, "getTag", "getTimestamp", "()J", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DateSeparatorUiModel implements TagHolder {
    public static final int $stable = 0;
    private final String date;
    private final String tag;
    private final long timestamp;

    public static /* synthetic */ DateSeparatorUiModel copy$default(DateSeparatorUiModel dateSeparatorUiModel, String str, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dateSeparatorUiModel.date;
        }
        if ((i & 2) != 0) {
            j = dateSeparatorUiModel.timestamp;
        }
        return dateSeparatorUiModel.copy(str, j);
    }

    public final String component1() {
        return this.date;
    }

    public final long component2() {
        return this.timestamp;
    }

    public final DateSeparatorUiModel copy(String date, long j) {
        Intrinsics.checkNotNullParameter(date, "date");
        return new DateSeparatorUiModel(date, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DateSeparatorUiModel) {
            DateSeparatorUiModel dateSeparatorUiModel = (DateSeparatorUiModel) obj;
            return Intrinsics.areEqual(this.date, dateSeparatorUiModel.date) && this.timestamp == dateSeparatorUiModel.timestamp;
        }
        return false;
    }

    public int hashCode() {
        return (this.date.hashCode() * 31) + AudioPlayerState$Pause$$ExternalSyntheticBackport0.m(this.timestamp);
    }

    public String toString() {
        String str = this.date;
        long j = this.timestamp;
        return "DateSeparatorUiModel(date=" + str + ", timestamp=" + j + ")";
    }

    public DateSeparatorUiModel(String date, long j) {
        Intrinsics.checkNotNullParameter(date, "date");
        this.date = date;
        this.timestamp = j;
        this.tag = date;
    }

    public final String getDate() {
        return this.date;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    @Override // com.ifriend.chat.new_chat.list.ui.model.TagHolder
    public String getTag() {
        return this.tag;
    }
}
