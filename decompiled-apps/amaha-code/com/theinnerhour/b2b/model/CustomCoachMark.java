package com.theinnerhour.b2b.model;

import android.view.View;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
/* compiled from: CustomCoachMark.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001\u0014B)\u0012\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0012\u0010\u0013J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R&\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/theinnerhour/b2b/model/CustomCoachMark;", "", "", "visibility", "Lhs/k;", "setVisibility", "Ljava/util/ArrayList;", "Landroid/view/View;", "Lkotlin/collections/ArrayList;", "viewList", "Ljava/util/ArrayList;", "Lcom/theinnerhour/b2b/model/CustomCoachMark$OnVisibilityChange;", "listener", "Lcom/theinnerhour/b2b/model/CustomCoachMark$OnVisibilityChange;", "getListener$app_productionRelease", "()Lcom/theinnerhour/b2b/model/CustomCoachMark$OnVisibilityChange;", "setListener$app_productionRelease", "(Lcom/theinnerhour/b2b/model/CustomCoachMark$OnVisibilityChange;)V", "<init>", "(Ljava/util/ArrayList;Lcom/theinnerhour/b2b/model/CustomCoachMark$OnVisibilityChange;)V", "OnVisibilityChange", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class CustomCoachMark {
    private OnVisibilityChange listener;
    private ArrayList<View> viewList;

    /* compiled from: CustomCoachMark.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/theinnerhour/b2b/model/CustomCoachMark$OnVisibilityChange;", "", "", "isVisible", "Lhs/k;", "onChange", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes2.dex */
    public interface OnVisibilityChange {
        void onChange(boolean z10);
    }

    public CustomCoachMark(ArrayList<View> viewList, OnVisibilityChange onVisibilityChange) {
        i.g(viewList, "viewList");
        this.viewList = viewList;
        this.listener = onVisibilityChange;
    }

    public final OnVisibilityChange getListener$app_productionRelease() {
        return this.listener;
    }

    public final void setListener$app_productionRelease(OnVisibilityChange onVisibilityChange) {
        this.listener = onVisibilityChange;
    }

    public final void setVisibility(int i6) {
        for (View view : this.viewList) {
            view.setVisibility(i6);
        }
        if (this.listener != null) {
            boolean z10 = true;
            if (!this.viewList.isEmpty()) {
                OnVisibilityChange onVisibilityChange = this.listener;
                i.d(onVisibilityChange);
                if (this.viewList.get(0).getVisibility() != 0) {
                    z10 = false;
                }
                onVisibilityChange.onChange(z10);
            }
        }
    }
}
