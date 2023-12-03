package com.theinnerhour.b2b.components.telecommunications.model;

import com.appsflyer.R;
import java.util.ArrayList;
import kotlin.Metadata;
import tf.b;
/* compiled from: ProviderSearchResponseModel.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R*\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR*\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\n\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00020\n\u0018\u0001`\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\b¨\u0006\f"}, d2 = {"Lcom/theinnerhour/b2b/components/telecommunications/model/ProviderSearchResponseModel;", "", "()V", "filtersList", "Ljava/util/ArrayList;", "Lcom/theinnerhour/b2b/components/telecommunications/model/ProviderSearchResponseFilterModel;", "Lkotlin/collections/ArrayList;", "getFiltersList", "()Ljava/util/ArrayList;", "providerList", "Lcom/theinnerhour/b2b/components/telecommunications/model/TherapistPackagesModel;", "getProviderList", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class ProviderSearchResponseModel {
    @b("filters")
    private final ArrayList<ProviderSearchResponseFilterModel> filtersList;
    @b("list")
    private final ArrayList<TherapistPackagesModel> providerList;

    public final ArrayList<ProviderSearchResponseFilterModel> getFiltersList() {
        return this.filtersList;
    }

    public final ArrayList<TherapistPackagesModel> getProviderList() {
        return this.providerList;
    }
}
