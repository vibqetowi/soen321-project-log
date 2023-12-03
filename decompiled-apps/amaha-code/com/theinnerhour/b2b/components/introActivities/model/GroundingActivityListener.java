package com.theinnerhour.b2b.components.introActivities.model;

import java.util.List;
import kotlin.Metadata;
/* compiled from: GroundingActivityListener.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J \u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH&J \u0010\f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH&J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0002H&¨\u0006\u000f"}, d2 = {"Lcom/theinnerhour/b2b/components/introActivities/model/GroundingActivityListener;", "Lcom/theinnerhour/b2b/components/introActivities/model/IntroActivityListener;", "", "indoor", "Lhs/k;", "setGroundingIndoorFlag", "", "key", "", "", "value", "setSelectedItems", "setUserAddedItems", "updateGoal", "setGoalUpdateFlag", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public interface GroundingActivityListener extends IntroActivityListener {
    void setGoalUpdateFlag(boolean z10);

    void setGroundingIndoorFlag(boolean z10);

    void setSelectedItems(int i6, List<String> list);

    void setUserAddedItems(int i6, List<String> list);
}
