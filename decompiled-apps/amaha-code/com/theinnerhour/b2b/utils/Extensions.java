package com.theinnerhour.b2b.utils;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import gv.r;
import kotlin.Metadata;
/* compiled from: Extensions.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001c\u0010\b\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005J\n\u0010\n\u001a\u00020\u0007*\u00020\tJ\n\u0010\u000b\u001a\u00020\u0007*\u00020\tJ\n\u0010\f\u001a\u00020\u0007*\u00020\tJ\n\u0010\u000e\u001a\u00020\r*\u00020\tJ4\u0010\u0017\u001a\u00020\u0007*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u0003J\u001a\u0010\u001b\u001a\u00020\t*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0019¨\u0006\u001e"}, d2 = {"Lcom/theinnerhour/b2b/utils/Extensions;", "", "Landroid/content/Context;", "", "msg", "", "duration", "Lhs/k;", "toast", "Landroid/view/View;", "visible", "gone", "invisible", "", "isVisible", "Landroid/graphics/Canvas;", "text", "", "x", "y", "Landroid/graphics/Paint;", "paint", "delimiter", "drawTextMultiLine", "layoutId", "Landroid/view/ViewGroup;", "container", "inflateLayout", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class Extensions {
    public static final Extensions INSTANCE = new Extensions();

    private Extensions() {
    }

    public static /* synthetic */ void drawTextMultiLine$default(Extensions extensions, Canvas canvas, String str, float f, float f2, Paint paint, String str2, int i6, Object obj) {
        if ((i6 & 16) != 0) {
            str2 = "\n";
        }
        extensions.drawTextMultiLine(canvas, str, f, f2, paint, str2);
    }

    public static /* synthetic */ void toast$default(Extensions extensions, Context context, String str, int i6, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i6 = 0;
        }
        extensions.toast(context, str, i6);
    }

    public final void drawTextMultiLine(Canvas canvas, String text, float f, float f2, Paint paint, String delimiter) {
        kotlin.jvm.internal.i.g(canvas, "<this>");
        kotlin.jvm.internal.i.g(text, "text");
        kotlin.jvm.internal.i.g(paint, "paint");
        kotlin.jvm.internal.i.g(delimiter, "delimiter");
        for (String str : r.a1(text, new String[]{delimiter}, 0, 6)) {
            f2 += ((int) paint.descent()) - ((int) paint.ascent());
            canvas.drawText(str, f, f2, paint);
        }
    }

    public final void gone(View view) {
        kotlin.jvm.internal.i.g(view, "<this>");
        view.setVisibility(8);
    }

    public final View inflateLayout(Context context, int i6, ViewGroup container) {
        kotlin.jvm.internal.i.g(context, "<this>");
        kotlin.jvm.internal.i.g(container, "container");
        View inflate = LayoutInflater.from(context).inflate(i6, container, false);
        kotlin.jvm.internal.i.f(inflate, "from(this).inflate(layoutId, container, false)");
        return inflate;
    }

    public final void invisible(View view) {
        kotlin.jvm.internal.i.g(view, "<this>");
        view.setVisibility(4);
    }

    public final boolean isVisible(View view) {
        kotlin.jvm.internal.i.g(view, "<this>");
        if (view.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final void toast(Context context, String msg, int i6) {
        kotlin.jvm.internal.i.g(context, "<this>");
        kotlin.jvm.internal.i.g(msg, "msg");
        Utils.INSTANCE.showCustomToast(context, msg, i6);
    }

    public final void visible(View view) {
        kotlin.jvm.internal.i.g(view, "<this>");
        view.setVisibility(0);
    }
}
