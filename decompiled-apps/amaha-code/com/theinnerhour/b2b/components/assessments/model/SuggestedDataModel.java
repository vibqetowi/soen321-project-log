package com.theinnerhour.b2b.components.assessments.model;

import com.appsflyer.R;
import com.theinnerhour.b2b.components.dashboard.experiment.model.SuggestedActivityModel;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import v.g;
/* compiled from: SuggestedDataModel.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0019\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001R*\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, d2 = {"Lcom/theinnerhour/b2b/components/assessments/model/SuggestedDataModel;", "", "data", "Ljava/util/ArrayList;", "Lcom/theinnerhour/b2b/components/dashboard/experiment/model/SuggestedActivityModel;", "Lkotlin/collections/ArrayList;", "set", "", "(Ljava/util/ArrayList;Ljava/lang/String;)V", "getData", "()Ljava/util/ArrayList;", "setData", "(Ljava/util/ArrayList;)V", "getSet", "()Ljava/lang/String;", "setSet", "(Ljava/lang/String;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class SuggestedDataModel {
    private ArrayList<SuggestedActivityModel> data;
    private String set;

    public SuggestedDataModel(ArrayList<SuggestedActivityModel> data, String set) {
        i.g(data, "data");
        i.g(set, "set");
        this.data = data;
        this.set = set;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SuggestedDataModel copy$default(SuggestedDataModel suggestedDataModel, ArrayList arrayList, String str, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            arrayList = suggestedDataModel.data;
        }
        if ((i6 & 2) != 0) {
            str = suggestedDataModel.set;
        }
        return suggestedDataModel.copy(arrayList, str);
    }

    public final ArrayList<SuggestedActivityModel> component1() {
        return this.data;
    }

    public final String component2() {
        return this.set;
    }

    public final SuggestedDataModel copy(ArrayList<SuggestedActivityModel> data, String set) {
        i.g(data, "data");
        i.g(set, "set");
        return new SuggestedDataModel(data, set);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuggestedDataModel)) {
            return false;
        }
        SuggestedDataModel suggestedDataModel = (SuggestedDataModel) obj;
        if (i.b(this.data, suggestedDataModel.data) && i.b(this.set, suggestedDataModel.set)) {
            return true;
        }
        return false;
    }

    public final ArrayList<SuggestedActivityModel> getData() {
        return this.data;
    }

    public final String getSet() {
        return this.set;
    }

    public int hashCode() {
        return this.set.hashCode() + (this.data.hashCode() * 31);
    }

    public final void setData(ArrayList<SuggestedActivityModel> arrayList) {
        i.g(arrayList, "<set-?>");
        this.data = arrayList;
    }

    public final void setSet(String str) {
        i.g(str, "<set-?>");
        this.set = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("SuggestedDataModel(data=");
        sb2.append(this.data);
        sb2.append(", set=");
        return g.c(sb2, this.set, ')');
    }
}
