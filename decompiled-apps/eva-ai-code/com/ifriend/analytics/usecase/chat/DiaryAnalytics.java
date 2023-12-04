package com.ifriend.analytics.usecase.chat;

import com.ifriend.analytics.AnalyticsConstants;
import com.ifriend.analytics.AnalyticsEngine;
import com.ifriend.analytics.AnalyticsSender;
import com.ifriend.analytics.annalsTracker.AnnalsTrackerAnalyticsSender;
import com.ifriend.domain.models.diary.DiaryNote;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: DiaryAnalytics.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ifriend/analytics/usecase/chat/DiaryAnalytics;", "", "()V", "analytics", "Lcom/ifriend/analytics/AnalyticsEngine;", "trackClickDiaryButtonAnalytics", "", "hasNotifications", "", "trackClickDiaryNoteAnalytics", "diaryNote", "Lcom/ifriend/domain/models/diary/DiaryNote;", "trackClickDiaryNoteButtonAnalytics", "analytics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DiaryAnalytics {
    public static final DiaryAnalytics INSTANCE = new DiaryAnalytics();
    private static final AnalyticsEngine analytics = AnalyticsEngine.Companion.getInstance();

    private DiaryAnalytics() {
    }

    public final void trackClickDiaryButtonAnalytics(boolean z) {
        AnnalsTrackerAnalyticsSender annalsTrackerAnalyticsSender;
        AnalyticsSender[] analyticsSenders = analytics.getAnalyticsSenders();
        int length = analyticsSenders.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                annalsTrackerAnalyticsSender = null;
                break;
            }
            annalsTrackerAnalyticsSender = analyticsSenders[i];
            if (annalsTrackerAnalyticsSender instanceof AnnalsTrackerAnalyticsSender) {
                break;
            }
            i++;
        }
        AnnalsTrackerAnalyticsSender annalsTrackerAnalyticsSender2 = annalsTrackerAnalyticsSender;
        if (annalsTrackerAnalyticsSender2 == null) {
            return;
        }
        Pair[] pairArr = new Pair[2];
        pairArr[0] = new Pair(AnalyticsConstants.TIMESTAMP, Long.valueOf(System.currentTimeMillis()));
        pairArr[1] = new Pair("is_green_dot", Long.valueOf(z ? 1L : 0L));
        annalsTrackerAnalyticsSender2.sendEvent("click-diary-btn-ai", MapsKt.mapOf(pairArr));
    }

    public final void trackClickDiaryNoteAnalytics(DiaryNote diaryNote) {
        AnnalsTrackerAnalyticsSender annalsTrackerAnalyticsSender;
        Intrinsics.checkNotNullParameter(diaryNote, "diaryNote");
        AnalyticsSender[] analyticsSenders = analytics.getAnalyticsSenders();
        int length = analyticsSenders.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                annalsTrackerAnalyticsSender = null;
                break;
            }
            annalsTrackerAnalyticsSender = analyticsSenders[i];
            if (annalsTrackerAnalyticsSender instanceof AnnalsTrackerAnalyticsSender) {
                break;
            }
            i++;
        }
        AnnalsTrackerAnalyticsSender annalsTrackerAnalyticsSender2 = annalsTrackerAnalyticsSender;
        if (annalsTrackerAnalyticsSender2 == null) {
            return;
        }
        annalsTrackerAnalyticsSender2.sendEvent("click-diary-note-ai", MapsKt.mapOf(new Pair(AnalyticsConstants.TIMESTAMP, Long.valueOf(System.currentTimeMillis())), new Pair("diary_name", diaryNote.getTitle()), new Pair("diary_name_id", diaryNote.getId()), new Pair("is_free", Integer.valueOf(diaryNote.isFree() ? 1 : 0))));
    }

    public final void trackClickDiaryNoteButtonAnalytics(DiaryNote diaryNote) {
        AnnalsTrackerAnalyticsSender annalsTrackerAnalyticsSender;
        Intrinsics.checkNotNullParameter(diaryNote, "diaryNote");
        AnalyticsSender[] analyticsSenders = analytics.getAnalyticsSenders();
        int length = analyticsSenders.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                annalsTrackerAnalyticsSender = null;
                break;
            }
            annalsTrackerAnalyticsSender = analyticsSenders[i];
            if (annalsTrackerAnalyticsSender instanceof AnnalsTrackerAnalyticsSender) {
                break;
            }
            i++;
        }
        AnnalsTrackerAnalyticsSender annalsTrackerAnalyticsSender2 = annalsTrackerAnalyticsSender;
        if (annalsTrackerAnalyticsSender2 == null) {
            return;
        }
        annalsTrackerAnalyticsSender2.sendEvent("click-reaction-btn-diary-ai", MapsKt.mapOf(new Pair(AnalyticsConstants.TIMESTAMP, Long.valueOf(System.currentTimeMillis())), new Pair("diary_name", diaryNote.getTitle()), new Pair("diary_name_id", diaryNote.getId()), new Pair("is_free", Integer.valueOf(diaryNote.isFree() ? 1 : 0))));
    }
}
