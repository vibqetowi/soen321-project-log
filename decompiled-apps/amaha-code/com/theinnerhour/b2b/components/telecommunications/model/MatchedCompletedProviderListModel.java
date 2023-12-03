package com.theinnerhour.b2b.components.telecommunications.model;

import com.appsflyer.R;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;
import tf.b;
import v.g;
/* compiled from: MatchedCompletedProviderListModel.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Bk\u0012\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u0012\u0018\b\u0002\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0003j\b\u0012\u0004\u0012\u00020\u0007`\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0018\b\u0002\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\u0003j\b\u0012\u0004\u0012\u00020\u000b`\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eJ\u0019\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005HÆ\u0003J\u0019\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0003j\b\u0012\u0004\u0012\u00020\u0007`\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0019\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\u0003j\b\u0012\u0004\u0012\u00020\u000b`\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\rHÆ\u0003Jo\u0010$\u001a\u00020\u00002\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00052\u0018\b\u0002\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0003j\b\u0012\u0004\u0012\u00020\u0007`\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0018\b\u0002\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\u0003j\b\u0012\u0004\u0012\u00020\u000b`\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\u0007HÖ\u0001J\t\u0010)\u001a\u00020\rHÖ\u0001R.\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\u0003j\b\u0012\u0004\u0012\u00020\u000b`\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R.\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R \u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R \u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR.\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0003j\b\u0012\u0004\u0012\u00020\u0007`\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u0012¨\u0006*"}, d2 = {"Lcom/theinnerhour/b2b/components/telecommunications/model/MatchedCompletedProviderListModel;", "", "list", "Ljava/util/ArrayList;", "Lcom/theinnerhour/b2b/components/telecommunications/model/TherapistPackagesModel;", "Lkotlin/collections/ArrayList;", "userIds", "", "meta", "Lcom/theinnerhour/b2b/components/telecommunications/model/MatchedCompletedProviderMeta;", "filters", "Lcom/theinnerhour/b2b/components/telecommunications/model/ProviderSearchResponseFilterModel;", "message", "", "(Ljava/util/ArrayList;Ljava/util/ArrayList;Lcom/theinnerhour/b2b/components/telecommunications/model/MatchedCompletedProviderMeta;Ljava/util/ArrayList;Ljava/lang/String;)V", "getFilters", "()Ljava/util/ArrayList;", "setFilters", "(Ljava/util/ArrayList;)V", "getList", "setList", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "getMeta", "()Lcom/theinnerhour/b2b/components/telecommunications/model/MatchedCompletedProviderMeta;", "setMeta", "(Lcom/theinnerhour/b2b/components/telecommunications/model/MatchedCompletedProviderMeta;)V", "getUserIds", "setUserIds", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class MatchedCompletedProviderListModel {
    @b("filters")
    private ArrayList<ProviderSearchResponseFilterModel> filters;
    @b("list")
    private ArrayList<TherapistPackagesModel> list;
    @b("message")
    private String message;
    @b("meta")
    private MatchedCompletedProviderMeta meta;
    @b("userids")
    private ArrayList<Integer> userIds;

    public MatchedCompletedProviderListModel() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ MatchedCompletedProviderListModel copy$default(MatchedCompletedProviderListModel matchedCompletedProviderListModel, ArrayList arrayList, ArrayList arrayList2, MatchedCompletedProviderMeta matchedCompletedProviderMeta, ArrayList arrayList3, String str, int i6, Object obj) {
        ArrayList<TherapistPackagesModel> arrayList4 = arrayList;
        if ((i6 & 1) != 0) {
            arrayList4 = matchedCompletedProviderListModel.list;
        }
        ArrayList<Integer> arrayList5 = arrayList2;
        if ((i6 & 2) != 0) {
            arrayList5 = matchedCompletedProviderListModel.userIds;
        }
        ArrayList arrayList6 = arrayList5;
        if ((i6 & 4) != 0) {
            matchedCompletedProviderMeta = matchedCompletedProviderListModel.meta;
        }
        MatchedCompletedProviderMeta matchedCompletedProviderMeta2 = matchedCompletedProviderMeta;
        ArrayList<ProviderSearchResponseFilterModel> arrayList7 = arrayList3;
        if ((i6 & 8) != 0) {
            arrayList7 = matchedCompletedProviderListModel.filters;
        }
        ArrayList arrayList8 = arrayList7;
        if ((i6 & 16) != 0) {
            str = matchedCompletedProviderListModel.message;
        }
        return matchedCompletedProviderListModel.copy(arrayList4, arrayList6, matchedCompletedProviderMeta2, arrayList8, str);
    }

    public final ArrayList<TherapistPackagesModel> component1() {
        return this.list;
    }

    public final ArrayList<Integer> component2() {
        return this.userIds;
    }

    public final MatchedCompletedProviderMeta component3() {
        return this.meta;
    }

    public final ArrayList<ProviderSearchResponseFilterModel> component4() {
        return this.filters;
    }

    public final String component5() {
        return this.message;
    }

    public final MatchedCompletedProviderListModel copy(ArrayList<TherapistPackagesModel> list, ArrayList<Integer> userIds, MatchedCompletedProviderMeta matchedCompletedProviderMeta, ArrayList<ProviderSearchResponseFilterModel> filters, String str) {
        i.g(list, "list");
        i.g(userIds, "userIds");
        i.g(filters, "filters");
        return new MatchedCompletedProviderListModel(list, userIds, matchedCompletedProviderMeta, filters, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MatchedCompletedProviderListModel)) {
            return false;
        }
        MatchedCompletedProviderListModel matchedCompletedProviderListModel = (MatchedCompletedProviderListModel) obj;
        if (i.b(this.list, matchedCompletedProviderListModel.list) && i.b(this.userIds, matchedCompletedProviderListModel.userIds) && i.b(this.meta, matchedCompletedProviderListModel.meta) && i.b(this.filters, matchedCompletedProviderListModel.filters) && i.b(this.message, matchedCompletedProviderListModel.message)) {
            return true;
        }
        return false;
    }

    public final ArrayList<ProviderSearchResponseFilterModel> getFilters() {
        return this.filters;
    }

    public final ArrayList<TherapistPackagesModel> getList() {
        return this.list;
    }

    public final String getMessage() {
        return this.message;
    }

    public final MatchedCompletedProviderMeta getMeta() {
        return this.meta;
    }

    public final ArrayList<Integer> getUserIds() {
        return this.userIds;
    }

    public int hashCode() {
        int hashCode;
        int j10 = c.j(this.userIds, this.list.hashCode() * 31, 31);
        MatchedCompletedProviderMeta matchedCompletedProviderMeta = this.meta;
        int i6 = 0;
        if (matchedCompletedProviderMeta == null) {
            hashCode = 0;
        } else {
            hashCode = matchedCompletedProviderMeta.hashCode();
        }
        int j11 = c.j(this.filters, (j10 + hashCode) * 31, 31);
        String str = this.message;
        if (str != null) {
            i6 = str.hashCode();
        }
        return j11 + i6;
    }

    public final void setFilters(ArrayList<ProviderSearchResponseFilterModel> arrayList) {
        i.g(arrayList, "<set-?>");
        this.filters = arrayList;
    }

    public final void setList(ArrayList<TherapistPackagesModel> arrayList) {
        i.g(arrayList, "<set-?>");
        this.list = arrayList;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setMeta(MatchedCompletedProviderMeta matchedCompletedProviderMeta) {
        this.meta = matchedCompletedProviderMeta;
    }

    public final void setUserIds(ArrayList<Integer> arrayList) {
        i.g(arrayList, "<set-?>");
        this.userIds = arrayList;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("MatchedCompletedProviderListModel(list=");
        sb2.append(this.list);
        sb2.append(", userIds=");
        sb2.append(this.userIds);
        sb2.append(", meta=");
        sb2.append(this.meta);
        sb2.append(", filters=");
        sb2.append(this.filters);
        sb2.append(", message=");
        return g.c(sb2, this.message, ')');
    }

    public MatchedCompletedProviderListModel(ArrayList<TherapistPackagesModel> list, ArrayList<Integer> userIds, MatchedCompletedProviderMeta matchedCompletedProviderMeta, ArrayList<ProviderSearchResponseFilterModel> filters, String str) {
        i.g(list, "list");
        i.g(userIds, "userIds");
        i.g(filters, "filters");
        this.list = list;
        this.userIds = userIds;
        this.meta = matchedCompletedProviderMeta;
        this.filters = filters;
        this.message = str;
    }

    public /* synthetic */ MatchedCompletedProviderListModel(ArrayList arrayList, ArrayList arrayList2, MatchedCompletedProviderMeta matchedCompletedProviderMeta, ArrayList arrayList3, String str, int i6, d dVar) {
        this((i6 & 1) != 0 ? new ArrayList() : arrayList, (i6 & 2) != 0 ? new ArrayList() : arrayList2, (i6 & 4) != 0 ? new MatchedCompletedProviderMeta(null, null, null, null, null, 31, null) : matchedCompletedProviderMeta, (i6 & 8) != 0 ? new ArrayList() : arrayList3, (i6 & 16) != 0 ? null : str);
    }
}
