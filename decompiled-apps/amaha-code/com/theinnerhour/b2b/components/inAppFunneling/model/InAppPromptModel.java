package com.theinnerhour.b2b.components.inAppFunneling.model;

import com.appsflyer.R;
import com.google.firebase.database.PropertyName;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;
/* compiled from: InAppPromptModel.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u001c\b\u0002\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0007HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u001c\b\u0002\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0007@\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\t\"\u0004\b\n\u0010\u000bR.\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/theinnerhour/b2b/components/inAppFunneling/model/InAppPromptModel;", "", "isExperimentActive", "", "promptList", "Ljava/util/ArrayList;", "Lcom/theinnerhour/b2b/components/inAppFunneling/model/InAppPromptData;", "Lkotlin/collections/ArrayList;", "(ZLjava/util/ArrayList;)V", "()Z", "setExperimentActive", "(Z)V", "getPromptList", "()Ljava/util/ArrayList;", "setPromptList", "(Ljava/util/ArrayList;)V", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class InAppPromptModel {
    private boolean isExperimentActive;
    private ArrayList<InAppPromptData> promptList;

    public InAppPromptModel() {
        this(false, null, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InAppPromptModel copy$default(InAppPromptModel inAppPromptModel, boolean z10, ArrayList arrayList, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            z10 = inAppPromptModel.isExperimentActive;
        }
        if ((i6 & 2) != 0) {
            arrayList = inAppPromptModel.promptList;
        }
        return inAppPromptModel.copy(z10, arrayList);
    }

    public final boolean component1() {
        return this.isExperimentActive;
    }

    public final ArrayList<InAppPromptData> component2() {
        return this.promptList;
    }

    public final InAppPromptModel copy(boolean z10, ArrayList<InAppPromptData> arrayList) {
        return new InAppPromptModel(z10, arrayList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InAppPromptModel)) {
            return false;
        }
        InAppPromptModel inAppPromptModel = (InAppPromptModel) obj;
        if (this.isExperimentActive == inAppPromptModel.isExperimentActive && i.b(this.promptList, inAppPromptModel.promptList)) {
            return true;
        }
        return false;
    }

    public final ArrayList<InAppPromptData> getPromptList() {
        return this.promptList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        int hashCode;
        boolean z10 = this.isExperimentActive;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        int i6 = r02 * 31;
        ArrayList<InAppPromptData> arrayList = this.promptList;
        if (arrayList == null) {
            hashCode = 0;
        } else {
            hashCode = arrayList.hashCode();
        }
        return i6 + hashCode;
    }

    @PropertyName("isExperimentActive")
    public final boolean isExperimentActive() {
        return this.isExperimentActive;
    }

    @PropertyName("isExperimentActive")
    public final void setExperimentActive(boolean z10) {
        this.isExperimentActive = z10;
    }

    public final void setPromptList(ArrayList<InAppPromptData> arrayList) {
        this.promptList = arrayList;
    }

    public String toString() {
        return "InAppPromptModel(isExperimentActive=" + this.isExperimentActive + ", promptList=" + this.promptList + ')';
    }

    public InAppPromptModel(boolean z10, ArrayList<InAppPromptData> arrayList) {
        this.isExperimentActive = z10;
        this.promptList = arrayList;
    }

    public /* synthetic */ InAppPromptModel(boolean z10, ArrayList arrayList, int i6, d dVar) {
        this((i6 & 1) != 0 ? true : z10, (i6 & 2) != 0 ? null : arrayList);
    }
}
