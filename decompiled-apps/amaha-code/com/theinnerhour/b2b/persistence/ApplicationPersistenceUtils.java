package com.theinnerhour.b2b.persistence;

import com.theinnerhour.b2b.components.onboarding.model.ProviderListModel;
import com.theinnerhour.b2b.model.GoalType;
import com.theinnerhour.b2b.model.NotificationModel;
import com.theinnerhour.b2b.model.OfflineAsset;
import hs.d;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import sf.i;
import sp.b;
/* compiled from: ApplicationPersistenceUtils.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R+\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR+\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\r0\u0005j\b\u0012\u0004\u0012\u00020\r`\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000bR+\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\r0\u0005j\b\u0012\u0004\u0012\u00020\r`\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\t\u001a\u0004\b\u0012\u0010\u000bR+\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\r0\u0005j\b\u0012\u0004\u0012\u00020\r`\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\t\u001a\u0004\b\u0015\u0010\u000bRC\u0010\u001e\u001a*\u0012\u0004\u0012\u00020\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00050\u0017j\u0014\u0012\u0004\u0012\u00020\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u0005`\u001a8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\t\u001a\u0004\b\u001c\u0010\u001dR+\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020\u001f0\u0005j\b\u0012\u0004\u0012\u00020\u001f`\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b \u0010\t\u001a\u0004\b!\u0010\u000b¨\u0006'"}, d2 = {"Lcom/theinnerhour/b2b/persistence/ApplicationPersistenceUtils;", "", "Lsf/i;", "gson", "Lsf/i;", "Ljava/util/ArrayList;", "Lcom/theinnerhour/b2b/model/GoalType;", "Lkotlin/collections/ArrayList;", "goalTypes$delegate", "Lhs/d;", "getGoalTypes", "()Ljava/util/ArrayList;", "goalTypes", "Lcom/theinnerhour/b2b/model/OfflineAsset;", "courseAssets$delegate", "getCourseAssets", "courseAssets", "campaignAssets$delegate", "getCampaignAssets", "campaignAssets", "profileAssets$delegate", "getProfileAssets", "profileAssets", "Ljava/util/HashMap;", "", "Lcom/theinnerhour/b2b/model/NotificationModel;", "Lkotlin/collections/HashMap;", "notificationsMap$delegate", "getNotificationsMap", "()Ljava/util/HashMap;", "notificationsMap", "Lcom/theinnerhour/b2b/components/onboarding/model/ProviderListModel;", "matchingTherapists$delegate", "getMatchingTherapists", "matchingTherapists", "Lcom/theinnerhour/b2b/persistence/ApplicationPersistence;", "persistence", "<init>", "(Lcom/theinnerhour/b2b/persistence/ApplicationPersistence;)V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ApplicationPersistenceUtils {
    private final d campaignAssets$delegate;
    private final d courseAssets$delegate;
    private final d goalTypes$delegate;
    private final i gson;
    private final d matchingTherapists$delegate;
    private final d notificationsMap$delegate;
    private final d profileAssets$delegate;

    public ApplicationPersistenceUtils(ApplicationPersistence persistence) {
        kotlin.jvm.internal.i.g(persistence, "persistence");
        this.gson = new i();
        this.goalTypes$delegate = b.O(new ApplicationPersistenceUtils$goalTypes$2(persistence, this));
        this.courseAssets$delegate = b.O(new ApplicationPersistenceUtils$courseAssets$2(persistence, this));
        this.campaignAssets$delegate = b.O(new ApplicationPersistenceUtils$campaignAssets$2(persistence, this));
        this.profileAssets$delegate = b.O(new ApplicationPersistenceUtils$profileAssets$2(persistence, this));
        this.notificationsMap$delegate = b.O(new ApplicationPersistenceUtils$notificationsMap$2(persistence, this));
        this.matchingTherapists$delegate = b.O(new ApplicationPersistenceUtils$matchingTherapists$2(persistence, this));
    }

    public final ArrayList<OfflineAsset> getCampaignAssets() {
        return (ArrayList) this.campaignAssets$delegate.getValue();
    }

    public final ArrayList<OfflineAsset> getCourseAssets() {
        return (ArrayList) this.courseAssets$delegate.getValue();
    }

    public final ArrayList<GoalType> getGoalTypes() {
        return (ArrayList) this.goalTypes$delegate.getValue();
    }

    public final ArrayList<ProviderListModel> getMatchingTherapists() {
        return (ArrayList) this.matchingTherapists$delegate.getValue();
    }

    public final HashMap<String, ArrayList<NotificationModel>> getNotificationsMap() {
        return (HashMap) this.notificationsMap$delegate.getValue();
    }

    public final ArrayList<OfflineAsset> getProfileAssets() {
        return (ArrayList) this.profileAssets$delegate.getValue();
    }
}
