package com.theinnerhour.b2b.components.multiTracker.model;

import com.theinnerhour.b2b.utils.Constants;
import java.util.List;
import kotlin.Metadata;
/* compiled from: MultiTrackerListener.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0016\u0010\u0007\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&J\u0016\u0010\t\u001a\u00020\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&J\u0016\u0010\u000b\u001a\u00020\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0005H&J\b\u0010\u000f\u001a\u00020\u000eH&J\u0010\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000eH&J\u0010\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0005H&¨\u0006\u0014"}, d2 = {"Lcom/theinnerhour/b2b/components/multiTracker/model/MultiTrackerListener;", "", "Lhs/k;", "goToNextScreen", "", "", "positiveEmotions", "setPositiveEmotions", "negativeEmotions", "setNegativeEmotions", Constants.SCREEN_ACTIVITIES, "setActivities", "log", "setLogNotes", "", "getTutorialFlag", "setEnabled", "setButtonEnabled", "text", "setCtaText", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public interface MultiTrackerListener {
    boolean getTutorialFlag();

    void goToNextScreen();

    void setActivities(List<String> list);

    void setButtonEnabled(boolean z10);

    void setCtaText(String str);

    void setLogNotes(String str);

    void setNegativeEmotions(List<String> list);

    void setPositiveEmotions(List<String> list);
}
