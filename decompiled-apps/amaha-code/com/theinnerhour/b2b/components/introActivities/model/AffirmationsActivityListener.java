package com.theinnerhour.b2b.components.introActivities.model;

import hs.f;
import java.util.List;
import kotlin.Metadata;
/* compiled from: AffirmationsActivityListener.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J0\u0010\t\u001a\u00020\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0018\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u00050\u0002H&J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0006H&¨\u0006\f"}, d2 = {"Lcom/theinnerhour/b2b/components/introActivities/model/AffirmationsActivityListener;", "Lcom/theinnerhour/b2b/components/introActivities/model/IntroActivityListener;", "", "", "affirmations", "Lhs/f;", "", "userAddedAffirmations", "Lhs/k;", "saveAffirmations", "updateGoal", "setGoalUpdateFlag", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public interface AffirmationsActivityListener extends IntroActivityListener {
    void saveAffirmations(List<String> list, List<f<String, Boolean>> list2);

    void setGoalUpdateFlag(boolean z10);
}
