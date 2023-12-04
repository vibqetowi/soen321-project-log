package com.ifriend.analytics.usecase.botData;

import com.ifriend.analytics.AnalyticsConstants;
import com.ifriend.analytics.AnalyticsSender;
import com.ifriend.analytics.annalsTracker.AnnalsTrackerAnalyticsSender;
import com.ifriend.common_utils.Format;
import com.ifriend.data.mappers.GenderToBackendString;
import com.ifriend.domain.models.profile.Gender;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AnalyticsEditBotUseCase.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0012\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u0004¢\u0006\u0002\u0010\u0005J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0018\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/ifriend/analytics/usecase/botData/AnalyticsEditBotUseCase;", "", "analyticsSenders", "", "Lcom/ifriend/analytics/AnalyticsSender;", "([Lcom/ifriend/analytics/AnalyticsSender;)V", "[Lcom/ifriend/analytics/AnalyticsSender;", "handle", "", "botData", "Lcom/ifriend/analytics/usecase/botData/AnalyticsBotData;", "analytics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AnalyticsEditBotUseCase {
    private final AnalyticsSender[] analyticsSenders;

    public AnalyticsEditBotUseCase(AnalyticsSender... analyticsSenders) {
        Intrinsics.checkNotNullParameter(analyticsSenders, "analyticsSenders");
        this.analyticsSenders = analyticsSenders;
    }

    public final void handle(AnalyticsBotData botData) {
        AnnalsTrackerAnalyticsSender annalsTrackerAnalyticsSender;
        Integer dateToAge;
        Intrinsics.checkNotNullParameter(botData, "botData");
        AnalyticsSender[] analyticsSenderArr = this.analyticsSenders;
        int length = analyticsSenderArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                annalsTrackerAnalyticsSender = null;
                break;
            }
            annalsTrackerAnalyticsSender = analyticsSenderArr[i];
            if (annalsTrackerAnalyticsSender instanceof AnnalsTrackerAnalyticsSender) {
                break;
            }
            i++;
        }
        AnnalsTrackerAnalyticsSender annalsTrackerAnalyticsSender2 = annalsTrackerAnalyticsSender;
        if (annalsTrackerAnalyticsSender2 != null) {
            Map<String, ? extends Object> mutableMapOf = MapsKt.mutableMapOf(new Pair(AnalyticsConstants.TIMESTAMP, Long.valueOf(System.currentTimeMillis())));
            Gender gender = botData.getGender();
            if (gender != null) {
                mutableMapOf.put("set_gender", new GenderToBackendString().map(gender));
            }
            String birthday = botData.getBirthday();
            if (birthday != null && (dateToAge = Format.INSTANCE.dateToAge(birthday)) != null) {
                mutableMapOf.put("set_birthday", Integer.valueOf(dateToAge.intValue()));
            }
            String ethnicity = botData.getEthnicity();
            if (ethnicity != null) {
                mutableMapOf.put("set_ethnicity", ethnicity);
            }
            String personality = botData.getPersonality();
            if (personality != null) {
                mutableMapOf.put("set_personality", personality);
            }
            String voice = botData.getVoice();
            if (voice != null) {
                mutableMapOf.put("set_voice", voice);
            }
            Unit unit = Unit.INSTANCE;
            annalsTrackerAnalyticsSender2.sendEvent("edit-virtual-friend", mutableMapOf);
        }
    }
}
