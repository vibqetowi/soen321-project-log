package com.theinnerhour.b2b.model;

import com.appsflyer.R;
import com.theinnerhour.b2b.components.pro.tracker.model.CoachModelMultiTracker;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
/* compiled from: CoachModel.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R*\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR*\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\f0\u0004j\b\u0012\u0004\u0012\u00020\f`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\nR*\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u0004j\b\u0012\u0004\u0012\u00020\u0010`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\b\"\u0004\b\u0012\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/theinnerhour/b2b/model/CoachModel;", "", "()V", "goals", "Ljava/util/ArrayList;", "Lcom/theinnerhour/b2b/model/Goal;", "Lkotlin/collections/ArrayList;", "getGoals", "()Ljava/util/ArrayList;", "setGoals", "(Ljava/util/ArrayList;)V", "multiTrackers", "Lcom/theinnerhour/b2b/components/pro/tracker/model/CoachModelMultiTracker;", "getMultiTrackers", "setMultiTrackers", "trackers", "Lcom/theinnerhour/b2b/model/CoachModelTracker;", "getTrackers", "setTrackers", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class CoachModel {
    private ArrayList<Goal> goals = new ArrayList<>();
    private ArrayList<CoachModelTracker> trackers = new ArrayList<>();
    private ArrayList<CoachModelMultiTracker> multiTrackers = new ArrayList<>();

    public final ArrayList<Goal> getGoals() {
        return this.goals;
    }

    public final ArrayList<CoachModelMultiTracker> getMultiTrackers() {
        return this.multiTrackers;
    }

    public final ArrayList<CoachModelTracker> getTrackers() {
        return this.trackers;
    }

    public final void setGoals(ArrayList<Goal> arrayList) {
        i.g(arrayList, "<set-?>");
        this.goals = arrayList;
    }

    public final void setMultiTrackers(ArrayList<CoachModelMultiTracker> arrayList) {
        i.g(arrayList, "<set-?>");
        this.multiTrackers = arrayList;
    }

    public final void setTrackers(ArrayList<CoachModelTracker> arrayList) {
        i.g(arrayList, "<set-?>");
        this.trackers = arrayList;
    }
}
