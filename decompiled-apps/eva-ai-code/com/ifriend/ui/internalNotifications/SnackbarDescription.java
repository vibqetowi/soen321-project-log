package com.ifriend.ui.internalNotifications;

import android.content.res.Resources;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.ifriend.ui.internalNotifications.SnackbarPresentation;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: SnackbarDescription.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B\u0081\u0001\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0002\u0010\u0013Bi\u0012\u0006\u0010\u0014\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005¢\u0006\u0002\u0010\u0016R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u001f\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0014\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0018¨\u0006#"}, d2 = {"Lcom/ifriend/ui/internalNotifications/SnackbarDescription;", "", "resources", "Landroid/content/res/Resources;", "titleStringId", "", "bodyStringId", "presentation", "Lcom/ifriend/ui/internalNotifications/SnackbarPresentation;", "onClick", "Lkotlin/Function0;", "", "onDismissed", "onError", "Lkotlin/Function1;", "", "duration", "titleMessage", "", "(Landroid/content/res/Resources;ILjava/lang/Integer;Lcom/ifriend/ui/internalNotifications/SnackbarPresentation;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;ILjava/lang/String;)V", "title", TtmlNode.TAG_BODY, "(Ljava/lang/String;Ljava/lang/String;Lcom/ifriend/ui/internalNotifications/SnackbarPresentation;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;I)V", "getBody", "()Ljava/lang/String;", "getDuration", "()I", "getOnClick", "()Lkotlin/jvm/functions/Function0;", "getOnDismissed", "getOnError", "()Lkotlin/jvm/functions/Function1;", "getPresentation", "()Lcom/ifriend/ui/internalNotifications/SnackbarPresentation;", "getTitle", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SnackbarDescription {
    public static final int $stable = 8;
    private final String body;
    private final int duration;
    private final Function0<Unit> onClick;
    private final Function0<Unit> onDismissed;
    private final Function1<Throwable, Unit> onError;
    private final SnackbarPresentation presentation;
    private final String title;

    /* JADX WARN: Multi-variable type inference failed */
    public SnackbarDescription(String title, String str, SnackbarPresentation presentation, Function0<Unit> function0, Function0<Unit> function02, Function1<? super Throwable, Unit> function1, int i) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(presentation, "presentation");
        this.title = title;
        this.body = str;
        this.presentation = presentation;
        this.onClick = function0;
        this.onDismissed = function02;
        this.onError = function1;
        this.duration = i;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getBody() {
        return this.body;
    }

    public /* synthetic */ SnackbarDescription(String str, String str2, SnackbarPresentation snackbarPresentation, Function0 function0, Function0 function02, Function1 function1, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? SnackbarPresentation.Deprecated.INSTANCE : snackbarPresentation, (i2 & 8) != 0 ? null : function0, (i2 & 16) != 0 ? null : function02, (i2 & 32) == 0 ? function1 : null, (i2 & 64) != 0 ? 0 : i);
    }

    public final SnackbarPresentation getPresentation() {
        return this.presentation;
    }

    public final Function0<Unit> getOnClick() {
        return this.onClick;
    }

    public final Function0<Unit> getOnDismissed() {
        return this.onDismissed;
    }

    public final Function1<Throwable, Unit> getOnError() {
        return this.onError;
    }

    public final int getDuration() {
        return this.duration;
    }

    public /* synthetic */ SnackbarDescription(Resources resources, int i, Integer num, SnackbarPresentation snackbarPresentation, Function0 function0, Function0 function02, Function1 function1, int i2, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(resources, i, (i3 & 4) != 0 ? null : num, (i3 & 8) != 0 ? SnackbarPresentation.Deprecated.INSTANCE : snackbarPresentation, (i3 & 16) != 0 ? null : function0, (i3 & 32) != 0 ? null : function02, (i3 & 64) != 0 ? null : function1, (i3 & 128) != 0 ? 0 : i2, (i3 & 256) != 0 ? null : str);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SnackbarDescription(Resources resources, int i, Integer num, SnackbarPresentation presentation, Function0<Unit> function0, Function0<Unit> function02, Function1<? super Throwable, Unit> function1, int i2, String str) {
        this(r3, num != null ? resources.getString(num.intValue()) : null, presentation, function0, function02, function1, i2);
        String str2;
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(presentation, "presentation");
        if (str == null) {
            String string = resources.getString(i);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            str2 = string;
        } else {
            str2 = str;
        }
    }
}
