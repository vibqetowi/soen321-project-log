package com.ifriend.ui.utils;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Outline;
import android.net.Uri;
import android.view.View;
import android.view.ViewOutlineProvider;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: UIUtils.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\n\u0010\u0005\u001a\u00020\u0001*\u00020\u0006¨\u0006\u0007"}, d2 = {"cropCorners", "", "Landroid/view/View;", "cornersSize", "", "openAppOnMarket", "Landroid/content/Context;", "common_ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UIUtilsKt {
    public static final void openAppOnMarket(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        try {
            try {
                String packageName = context.getPackageName();
                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + packageName)));
            } catch (ActivityNotFoundException unused) {
                Result.Companion companion = Result.Companion;
                String packageName2 = context.getPackageName();
                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + packageName2)));
                Result.m7271constructorimpl(Unit.INSTANCE);
            }
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.m7271constructorimpl(ResultKt.createFailure(th));
        }
    }

    public static final void cropCorners(View view, final int i) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setOutlineProvider(new ViewOutlineProvider() { // from class: com.ifriend.ui.utils.UIUtilsKt$cropCorners$1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view2, Outline outline) {
                Intrinsics.checkNotNullParameter(view2, "view");
                Intrinsics.checkNotNullParameter(outline, "outline");
                outline.setRoundRect(0, 0, view2.getWidth(), view2.getHeight(), UIUtils.INSTANCE.getToPx(Integer.valueOf(i)));
            }
        });
    }
}
