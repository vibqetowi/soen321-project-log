package com.theinnerhour.b2b.utils;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.appsflyer.R;
import kotlin.Metadata;
/* compiled from: LinearLayoutUtils.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\r\u001a\u00020\u0007H\u0016R\u001a\u0010\t\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/theinnerhour/b2b/utils/ScrollLockLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "context", "Landroid/content/Context;", "orientation", "", "reverseLayout", "", "(Landroid/content/Context;IZ)V", "isScrollEnabled", "()Z", "setScrollEnabled", "(Z)V", "canScrollVertically", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class ScrollLockLayoutManager extends LinearLayoutManager {
    private boolean isScrollEnabled;

    public ScrollLockLayoutManager(Context context, int i6, boolean z10) {
        super(context, i6, z10);
        this.isScrollEnabled = true;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public boolean canScrollVertically() {
        if (this.isScrollEnabled && super.canScrollVertically()) {
            return true;
        }
        return false;
    }

    public final boolean isScrollEnabled() {
        return this.isScrollEnabled;
    }

    public final void setScrollEnabled(boolean z10) {
        this.isScrollEnabled = z10;
    }
}
