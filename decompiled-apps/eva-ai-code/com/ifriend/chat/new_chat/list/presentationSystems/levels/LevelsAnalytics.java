package com.ifriend.chat.new_chat.list.presentationSystems.levels;

import com.facebook.AuthenticationTokenClaims;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ifriend.analytics.AnalyticsConstants;
import com.ifriend.analytics.AnalyticsEngine;
import com.ifriend.analytics.AnalyticsSender;
import com.ifriend.analytics.CommonAnalyticsKeys;
import com.ifriend.analytics.annalsTracker.AnnalsTrackerAnalyticsSender;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: LevelsAnalytics.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0011B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006J\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u0010\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ifriend/chat/new_chat/list/presentationSystems/levels/LevelsAnalytics;", "", "()V", "analytics", "Lcom/ifriend/analytics/AnalyticsEngine;", "avatarMenuProgressBarClick", "", "expGained", AuthenticationTokenClaims.JSON_KEY_EXP, "", "reason", "Lcom/ifriend/chat/new_chat/list/presentationSystems/levels/LevelsAnalytics$ExpGainedReason;", "botUserId", "", "levelAchieved", FirebaseAnalytics.Param.LEVEL, "progressBarModalButtonClick", "ExpGainedReason", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LevelsAnalytics {
    public static final LevelsAnalytics INSTANCE = new LevelsAnalytics();
    private static final AnalyticsEngine analytics = AnalyticsEngine.Companion.getInstance();
    public static final int $stable = 8;

    private LevelsAnalytics() {
    }

    public final void expGained(int i, ExpGainedReason reason, String botUserId) {
        AnnalsTrackerAnalyticsSender annalsTrackerAnalyticsSender;
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(botUserId, "botUserId");
        AnalyticsSender[] analyticsSenders = analytics.getAnalyticsSenders();
        int length = analyticsSenders.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                annalsTrackerAnalyticsSender = null;
                break;
            }
            annalsTrackerAnalyticsSender = analyticsSenders[i2];
            if (annalsTrackerAnalyticsSender instanceof AnnalsTrackerAnalyticsSender) {
                break;
            }
            i2++;
        }
        AnnalsTrackerAnalyticsSender annalsTrackerAnalyticsSender2 = annalsTrackerAnalyticsSender;
        if (annalsTrackerAnalyticsSender2 == null) {
            return;
        }
        if (!(reason instanceof ExpGainedReason.Message)) {
            throw new NoWhenBranchMatchedException();
        }
        annalsTrackerAnalyticsSender2.sendEvent("xp-gained-ai", MapsKt.mapOf(AnalyticsConstants.INSTANCE.getTimestamp(), new Pair("xp", Integer.valueOf(i)), new Pair("msg_Id", ((ExpGainedReason.Message) reason).getMessageId()), new Pair(CommonAnalyticsKeys.BOT_USER_ID.getValue(), botUserId)));
    }

    public final void levelAchieved(int i, String botUserId) {
        AnnalsTrackerAnalyticsSender annalsTrackerAnalyticsSender;
        Intrinsics.checkNotNullParameter(botUserId, "botUserId");
        AnalyticsSender[] analyticsSenders = analytics.getAnalyticsSenders();
        int length = analyticsSenders.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                annalsTrackerAnalyticsSender = null;
                break;
            }
            annalsTrackerAnalyticsSender = analyticsSenders[i2];
            if (annalsTrackerAnalyticsSender instanceof AnnalsTrackerAnalyticsSender) {
                break;
            }
            i2++;
        }
        AnnalsTrackerAnalyticsSender annalsTrackerAnalyticsSender2 = annalsTrackerAnalyticsSender;
        if (annalsTrackerAnalyticsSender2 == null) {
            return;
        }
        annalsTrackerAnalyticsSender2.sendEvent("level-achieved-ai", MapsKt.mapOf(AnalyticsConstants.INSTANCE.getTimestamp(), new Pair(FirebaseAnalytics.Param.LEVEL, Integer.valueOf(i)), new Pair(CommonAnalyticsKeys.BOT_USER_ID.getValue(), botUserId)));
    }

    public final void avatarMenuProgressBarClick() {
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
        annalsTrackerAnalyticsSender2.sendEvent("avatar-menu-progress-bar-click-ai", MapsKt.mapOf(AnalyticsConstants.INSTANCE.getTimestamp()));
    }

    public final void progressBarModalButtonClick() {
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
        annalsTrackerAnalyticsSender2.sendEvent("progress-bar-modal-btn-click-ai", MapsKt.mapOf(AnalyticsConstants.INSTANCE.getTimestamp()));
    }

    /* compiled from: LevelsAnalytics.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/ifriend/chat/new_chat/list/presentationSystems/levels/LevelsAnalytics$ExpGainedReason;", "", "Message", "Lcom/ifriend/chat/new_chat/list/presentationSystems/levels/LevelsAnalytics$ExpGainedReason$Message;", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public interface ExpGainedReason {

        /* compiled from: LevelsAnalytics.kt */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/ifriend/chat/new_chat/list/presentationSystems/levels/LevelsAnalytics$ExpGainedReason$Message;", "Lcom/ifriend/chat/new_chat/list/presentationSystems/levels/LevelsAnalytics$ExpGainedReason;", "messageId", "", "(Ljava/lang/String;)V", "getMessageId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes6.dex */
        public static final class Message implements ExpGainedReason {
            public static final int $stable = 0;
            private final String messageId;

            public static /* synthetic */ Message copy$default(Message message, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = message.messageId;
                }
                return message.copy(str);
            }

            public final String component1() {
                return this.messageId;
            }

            public final Message copy(String messageId) {
                Intrinsics.checkNotNullParameter(messageId, "messageId");
                return new Message(messageId);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Message) && Intrinsics.areEqual(this.messageId, ((Message) obj).messageId);
            }

            public int hashCode() {
                return this.messageId.hashCode();
            }

            public String toString() {
                String str = this.messageId;
                return "Message(messageId=" + str + ")";
            }

            public Message(String messageId) {
                Intrinsics.checkNotNullParameter(messageId, "messageId");
                this.messageId = messageId;
            }

            public final String getMessageId() {
                return this.messageId;
            }
        }
    }
}
