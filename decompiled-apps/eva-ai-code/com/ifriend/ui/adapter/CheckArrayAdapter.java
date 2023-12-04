package com.ifriend.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: CheckArrayAdapter.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0002\u0010\u000bJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bJ\b\u0010\u0011\u001a\u00020\bH\u0016J\u0010\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\bH\u0016J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\bH\u0016J$\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016R\u0012\u0010\f\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\rR\u000e\u0010\n\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/ifriend/ui/adapter/CheckArrayAdapter;", "Landroid/widget/BaseAdapter;", "context", "Landroid/content/Context;", FirebaseAnalytics.Param.ITEMS, "", "", "layoutId", "", "textViewId", "checkViewId", "(Landroid/content/Context;Ljava/util/List;III)V", "checkId", "Ljava/lang/Integer;", "check", "", "position", "getCount", "getItem", "i", "getItemId", "", "getView", "Landroid/view/View;", "convertView", "parent", "Landroid/view/ViewGroup;", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CheckArrayAdapter extends BaseAdapter {
    public static final int $stable = 8;
    private Integer checkId;
    private final int checkViewId;
    private final Context context;
    private final List<String> items;
    private final int layoutId;
    private final int textViewId;

    public CheckArrayAdapter(Context context, List<String> items, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.context = context;
        this.items = items;
        this.layoutId = i;
        this.textViewId = i2;
        this.checkViewId = i3;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.items.size();
    }

    @Override // android.widget.Adapter
    public String getItem(int i) {
        return this.items.get(i);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return getItem(i).hashCode();
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(this.context).inflate(this.layoutId, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(view, "inflate(...)");
        }
        View findViewById = view.findViewById(this.textViewId);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        ((TextView) findViewById).setText(getItem(i));
        View findViewById2 = view.findViewById(this.checkViewId);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        ImageView imageView = (ImageView) findViewById2;
        Integer num = this.checkId;
        imageView.setVisibility(num == null || i != num.intValue() ? 4 : 0);
        return view;
    }

    public final void check(int i) {
        this.checkId = Integer.valueOf(i);
        notifyDataSetChanged();
    }
}
