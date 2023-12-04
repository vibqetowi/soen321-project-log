package com.ifriend.ui.internalNotifications;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.FragmentActivity;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;
import com.ifriend.ui.R;
import com.ifriend.ui.internalNotifications.SnackbarPresentation;
import com.ifriend.ui.utils.UIUtils;
import com.ifriend.ui.utils.insets.InsetsExtensionsKt;
import eightbitlab.com.blurview.BlurView;
import eightbitlab.com.blurview.RenderEffectBlur;
import eightbitlab.com.blurview.RenderScriptBlur;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: Snackbar.kt */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\u001aH\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b2\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u000b\u001a\u001a\u0010\f\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e\u001at\u0010\f\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00112\u0006\u0010\u0013\u001a\u00020\u00142\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u000b¨\u0006\u0015"}, d2 = {"showCongratulationSnackbar", "", "Landroidx/fragment/app/FragmentActivity;", "rootScreenView", "Landroid/view/ViewGroup;", "title", "", "onDismissed", "Lkotlin/Function0;", "onClicked", "duration", "", "showSnackbarNotification", "snackbarDescription", "Lcom/ifriend/ui/internalNotifications/SnackbarDescription;", TtmlNode.TAG_BODY, "onError", "Lkotlin/Function1;", "", "presentation", "Lcom/ifriend/ui/internalNotifications/SnackbarPresentation;", "common_ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SnackbarKt {
    public static final void showSnackbarNotification(FragmentActivity fragmentActivity, ViewGroup rootScreenView, SnackbarDescription snackbarDescription) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "<this>");
        Intrinsics.checkNotNullParameter(rootScreenView, "rootScreenView");
        Intrinsics.checkNotNullParameter(snackbarDescription, "snackbarDescription");
        showSnackbarNotification(fragmentActivity, rootScreenView, snackbarDescription.getTitle(), snackbarDescription.getBody(), snackbarDescription.getOnDismissed(), snackbarDescription.getOnError(), snackbarDescription.getPresentation(), snackbarDescription.getOnClick(), snackbarDescription.getDuration());
    }

    private static final void showSnackbarNotification$show(ViewGroup viewGroup, int i, FragmentActivity fragmentActivity, SnackbarPresentation snackbarPresentation, String str, String str2, final Function0<Unit> function0, final Function0<Unit> function02) {
        int i2;
        final Snackbar make = Snackbar.make(viewGroup, "", i);
        Intrinsics.checkNotNullExpressionValue(make, "make(...)");
        View view = make.getView();
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.google.android.material.snackbar.Snackbar.SnackbarLayout");
        Snackbar.SnackbarLayout snackbarLayout = (Snackbar.SnackbarLayout) view;
        Snackbar.SnackbarLayout snackbarLayout2 = snackbarLayout;
        View inflate = fragmentActivity.getLayoutInflater().inflate(R.layout.internal_notification_snackbar, (ViewGroup) snackbarLayout2, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        View view2 = make.getView();
        Intrinsics.checkNotNullExpressionValue(view2, "getView(...)");
        InsetsExtensionsKt.doOnApplyWindowInsets(view2, SnackbarKt$showSnackbarNotification$show$1.INSTANCE);
        BlurView blurView = (BlurView) inflate.findViewById(R.id.blur);
        if (Intrinsics.areEqual(snackbarPresentation, SnackbarPresentation.Deprecated.INSTANCE)) {
            i2 = R.drawable.snackbar_shape_rounded_25;
        } else if (Intrinsics.areEqual(snackbarPresentation, SnackbarPresentation.BluredError.INSTANCE)) {
            i2 = R.drawable.red_snackbar_shape_rounded_25;
        } else {
            i2 = Intrinsics.areEqual(snackbarPresentation, SnackbarPresentation.Blured.INSTANCE) ? R.drawable.snackbar_shape_rounded_15 : R.drawable.snackbar_shape_rounded_25;
        }
        Drawable drawable = ResourcesCompat.getDrawable(blurView.getResources(), R.drawable.transparent, blurView.getContext().getTheme());
        if (Build.VERSION.SDK_INT >= 31) {
            blurView.setupWith(snackbarLayout2, new RenderEffectBlur()).setFrameClearDrawable(drawable);
        } else {
            blurView.setupWith(snackbarLayout2, new RenderScriptBlur(blurView.getContext())).setFrameClearDrawable(drawable);
        }
        blurView.setBlurAutoUpdate(false);
        blurView.setBackgroundResource(i2);
        blurView.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        blurView.setClipToOutline(true);
        ((TextView) inflate.findViewById(R.id.title)).setText(str);
        TextView textView = (TextView) inflate.findViewById(R.id.body);
        textView.setText(str2);
        Intrinsics.checkNotNull(textView);
        textView.setVisibility(str2 != null ? 0 : 8);
        View view3 = make.getView();
        view3.setElevation(10.0f);
        view3.setBackgroundColor(0);
        Intrinsics.checkNotNull(view3);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        FrameLayout.LayoutParams layoutParams3 = layoutParams2;
        int toPx = (int) UIUtils.INSTANCE.getToPx((Number) 16);
        layoutParams3.setMargins(toPx, (int) UIUtils.INSTANCE.getToPx((Number) 20), toPx, 0);
        layoutParams3.gravity = 48;
        view3.setLayoutParams(layoutParams2);
        view3.setOnClickListener(new View.OnClickListener() { // from class: com.ifriend.ui.internalNotifications.SnackbarKt$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                SnackbarKt.showSnackbarNotification$show$lambda$4$lambda$3(Function0.this, make, view4);
            }
        });
        snackbarLayout.removeAllViews();
        snackbarLayout.addView(inflate, 0);
        make.addCallback(new BaseTransientBottomBar.BaseCallback<Snackbar>() { // from class: com.ifriend.ui.internalNotifications.SnackbarKt$showSnackbarNotification$show$5
            @Override // com.google.android.material.snackbar.BaseTransientBottomBar.BaseCallback
            public void onDismissed(Snackbar snackbar, int i3) {
                super.onDismissed((SnackbarKt$showSnackbarNotification$show$5) snackbar, i3);
                Function0<Unit> function03 = function02;
                if (function03 != null) {
                    function03.invoke();
                }
            }
        });
        make.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showSnackbarNotification$show$lambda$4$lambda$3(Function0 function0, Snackbar snackbar, View view) {
        Intrinsics.checkNotNullParameter(snackbar, "$snackbar");
        if (function0 != null) {
            function0.invoke();
        }
        snackbar.dismiss();
    }

    public static final void showSnackbarNotification(FragmentActivity fragmentActivity, ViewGroup rootScreenView, String title, String str, Function0<Unit> function0, Function1<? super Throwable, Unit> function1, SnackbarPresentation presentation, Function0<Unit> function02, int i) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "<this>");
        Intrinsics.checkNotNullParameter(rootScreenView, "rootScreenView");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(presentation, "presentation");
        try {
            if (presentation instanceof SnackbarPresentation.Congratulation) {
                showCongratulationSnackbar(fragmentActivity, rootScreenView, title, function0, function02, i);
            } else {
                showSnackbarNotification$show(rootScreenView, i, fragmentActivity, presentation, title, str, function02, function0);
            }
        } catch (Exception e) {
            e.printStackTrace();
            if (function1 != null) {
                function1.invoke(e);
            }
        }
    }

    public static /* synthetic */ void showCongratulationSnackbar$default(FragmentActivity fragmentActivity, ViewGroup viewGroup, String str, Function0 function0, Function0 function02, int i, int i2, Object obj) {
        Function0 function03 = (i2 & 4) != 0 ? null : function0;
        Function0 function04 = (i2 & 8) != 0 ? null : function02;
        if ((i2 & 16) != 0) {
            i = 0;
        }
        showCongratulationSnackbar(fragmentActivity, viewGroup, str, function03, function04, i);
    }

    public static final void showCongratulationSnackbar(FragmentActivity fragmentActivity, ViewGroup rootScreenView, String title, final Function0<Unit> function0, final Function0<Unit> function02, int i) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "<this>");
        Intrinsics.checkNotNullParameter(rootScreenView, "rootScreenView");
        Intrinsics.checkNotNullParameter(title, "title");
        final Snackbar make = Snackbar.make(rootScreenView, "", i);
        Intrinsics.checkNotNullExpressionValue(make, "make(...)");
        View view = make.getView();
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.google.android.material.snackbar.Snackbar.SnackbarLayout");
        Snackbar.SnackbarLayout snackbarLayout = (Snackbar.SnackbarLayout) view;
        View inflate = fragmentActivity.getLayoutInflater().inflate(R.layout.internal_notification_congratulation_snackbar, (ViewGroup) snackbarLayout, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        View view2 = make.getView();
        Intrinsics.checkNotNullExpressionValue(view2, "getView(...)");
        InsetsExtensionsKt.doOnApplyWindowInsets(view2, SnackbarKt$showCongratulationSnackbar$1.INSTANCE);
        View findViewById = inflate.findViewById(R.id.congratulationSnackbarRoot);
        findViewById.setBackgroundResource(R.drawable.snackbar_congratulation);
        findViewById.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        findViewById.setClipToOutline(true);
        ((TextView) inflate.findViewById(R.id.title)).setText(title);
        TextView textView = (TextView) inflate.findViewById(R.id.body);
        textView.setText(textView.getContext().getString(R.string.congratulation));
        View view3 = make.getView();
        view3.setElevation(10.0f);
        view3.setBackgroundColor(0);
        Intrinsics.checkNotNull(view3);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        FrameLayout.LayoutParams layoutParams3 = layoutParams2;
        layoutParams3.setMargins(0, (int) UIUtils.INSTANCE.getToPx((Number) 10), 0, 0);
        layoutParams3.gravity = 48;
        view3.setLayoutParams(layoutParams2);
        view3.setOnClickListener(new View.OnClickListener() { // from class: com.ifriend.ui.internalNotifications.SnackbarKt$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                SnackbarKt.showCongratulationSnackbar$lambda$9$lambda$8(Function0.this, make, view4);
            }
        });
        snackbarLayout.removeAllViews();
        snackbarLayout.addView(inflate, 0);
        make.addCallback(new BaseTransientBottomBar.BaseCallback<Snackbar>() { // from class: com.ifriend.ui.internalNotifications.SnackbarKt$showCongratulationSnackbar$5
            @Override // com.google.android.material.snackbar.BaseTransientBottomBar.BaseCallback
            public void onDismissed(Snackbar snackbar, int i2) {
                super.onDismissed((SnackbarKt$showCongratulationSnackbar$5) snackbar, i2);
                Function0<Unit> function03 = function0;
                if (function03 != null) {
                    function03.invoke();
                }
            }
        });
        make.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showCongratulationSnackbar$lambda$9$lambda$8(Function0 function0, Snackbar snackbar, View view) {
        Intrinsics.checkNotNullParameter(snackbar, "$snackbar");
        if (function0 != null) {
            function0.invoke();
        }
        snackbar.dismiss();
    }
}
