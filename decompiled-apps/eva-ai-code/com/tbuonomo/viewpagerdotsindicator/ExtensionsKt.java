package com.tbuonomo.viewpagerdotsindicator;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import androidx.exifinterface.media.ExifInterface;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: Extensions.kt */
@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\f\u0010\u0007\u001a\u00020\b*\u00020\tH\u0000\u001a*\u0010\n\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u000b*\u0012\u0012\u0004\u0012\u0002H\u000b0\fj\b\u0012\u0004\u0012\u0002H\u000b`\r2\u0006\u0010\u000e\u001a\u00020\bH\u0000\u001a\u0014\u0010\u000f\u001a\u00020\u0010*\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u001a\u0014\u0010\u0014\u001a\u00020\u0010*\u00020\u00112\u0006\u0010\u0015\u001a\u00020\bH\u0000\u001a\u0014\u0010\u0016\u001a\u00020\u0010*\u00020\u00112\u0006\u0010\u0015\u001a\u00020\bH\u0000\u001a\u0014\u0010\u0017\u001a\u00020\u0010*\u00020\u00112\u0006\u0010\u0018\u001a\u00020\bH\u0000\"\u001a\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0003\"\u001a\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0005\"\u0018\u0010\u0006\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0003\"\u0018\u0010\u0006\u001a\u00020\u0001*\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0005¨\u0006\u0019"}, d2 = {"isEmpty", "", "Landroidx/viewpager/widget/ViewPager;", "(Landroidx/viewpager/widget/ViewPager;)Z", "Landroidx/viewpager2/widget/ViewPager2;", "(Landroidx/viewpager2/widget/ViewPager2;)Z", "isNotEmpty", "getThemePrimaryColor", "", "Landroid/content/Context;", "isInBounds", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", FirebaseAnalytics.Param.INDEX, "setBackgroundCompat", "", "Landroid/view/View;", "background", "Landroid/graphics/drawable/Drawable;", "setPaddingHorizontal", "padding", "setPaddingVertical", "setWidth", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, "viewpagerdotsindicator_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ExtensionsKt {
    public static final void setPaddingHorizontal(View view, int i) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setPadding(i, view.getPaddingTop(), i, view.getPaddingBottom());
    }

    public static final void setPaddingVertical(View view, int i) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), i);
    }

    public static final void setWidth(View view, int i) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.getLayoutParams().width = i;
        view.requestLayout();
    }

    public static final <T> boolean isInBounds(ArrayList<T> arrayList, int i) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        return i >= 0 && i < arrayList.size();
    }

    public static final int getThemePrimaryColor(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true);
        return typedValue.data;
    }

    public static final boolean isNotEmpty(ViewPager viewPager) {
        Intrinsics.checkNotNullParameter(viewPager, "<this>");
        PagerAdapter adapter = viewPager.getAdapter();
        return (adapter != null ? adapter.getCount() : 0) > 0;
    }

    public static final boolean isNotEmpty(ViewPager2 viewPager2) {
        Intrinsics.checkNotNullParameter(viewPager2, "<this>");
        RecyclerView.Adapter adapter = viewPager2.getAdapter();
        return (adapter != null ? adapter.getItemCount() : 0) > 0;
    }

    public static final boolean isEmpty(ViewPager viewPager) {
        PagerAdapter adapter;
        return (viewPager == null || (adapter = viewPager.getAdapter()) == null || adapter.getCount() != 0) ? false : true;
    }

    public static final boolean isEmpty(ViewPager2 viewPager2) {
        RecyclerView.Adapter adapter;
        return (viewPager2 == null || (adapter = viewPager2.getAdapter()) == null || adapter.getItemCount() != 0) ? false : true;
    }

    public static final void setBackgroundCompat(View view, Drawable drawable) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setBackground(drawable);
    }
}
