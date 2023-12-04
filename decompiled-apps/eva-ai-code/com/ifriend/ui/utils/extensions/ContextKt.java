package com.ifriend.ui.utils.extensions;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: context.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u0012\u0010\u0003\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"openAppSettings", "", "Landroid/content/Context;", "openLink", "link", "", "common_ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ContextKt {
    public static final void openLink(Context context, String link) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(link, "link");
        try {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(link)));
        } catch (ActivityNotFoundException unused) {
        }
    }

    public static final void openAppSettings(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.fromParts("package", context.getPackageName(), null));
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
        }
    }
}
