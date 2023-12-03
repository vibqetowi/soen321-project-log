package com.theinnerhour.b2b.utils;

import android.content.Context;
import androidx.recyclerview.widget.q;
import kotlin.Metadata;
/* compiled from: CustomLeftSmoothScroller.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ0\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\r"}, d2 = {"Lcom/theinnerhour/b2b/utils/CustomLeftSmoothScroller;", "Landroidx/recyclerview/widget/q;", "", "viewStart", "viewEnd", "boxStart", "boxEnd", "snapPreference", "calculateDtToFit", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class CustomLeftSmoothScroller extends q {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomLeftSmoothScroller(Context context) {
        super(context);
        kotlin.jvm.internal.i.g(context, "context");
    }

    @Override // androidx.recyclerview.widget.q
    public int calculateDtToFit(int i6, int i10, int i11, int i12, int i13) {
        return -i6;
    }
}
