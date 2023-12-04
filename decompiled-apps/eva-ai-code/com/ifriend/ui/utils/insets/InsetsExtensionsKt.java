package com.ifriend.ui.utils.insets;

import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: InsetsExtensions.kt */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001ao\u0010\u0004\u001a\u00020\u0005*\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072K\u0010\t\u001aG\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00050\n2\u0006\u0010\u0010\u001a\u00020\u0003\u001a\u0012\u0010\u0011\u001a\u00020\u0005*\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0003\u001a_\u0010\u0012\u001a\u00020\u0005*\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00032K\u0010\t\u001aG\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00050\n\u001aW\u0010\u0013\u001a\u00020\u0005*\u00020\u00032K\u0010\u0014\u001aG\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00050\n\u001a\n\u0010\u0016\u001a\u00020\u0017*\u00020\u0003\u001a\n\u0010\u0018\u001a\u00020\u0005*\u00020\u0003\u001a \u0010\u0019\u001a\u00020\u0005*\u00020\u00032\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u001b\u001a\n\u0010\u001c\u001a\u00020\r*\u00020\u0015\u001a\u0012\u0010\u001d\u001a\u00020\u0005*\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u0017¨\u0006\u001f"}, d2 = {"recordInitialPaddingForView", "Lcom/ifriend/ui/utils/insets/InitialPadding;", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "applyDeferringInsets", "", "persistentInsetTypes", "", "deferredInsetTypes", "applyWindowInsets", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "Landroidx/core/graphics/Insets;", "insets", "initialPadding", "translatableView", "clearImeWindowInsets", "doOnApplyImeWindowInsets", "doOnApplyWindowInsets", "f", "Landroidx/core/view/WindowInsetsCompat;", "isKeyboardOpen", "", "requestApplyInsetsWhenAttached", "setKeyboardListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function1;", "systemAndIme", "visibleKeyboard", "isVisible", "common_ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class InsetsExtensionsKt {
    public static final Insets systemAndIme(WindowInsetsCompat windowInsetsCompat) {
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "<this>");
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars() | WindowInsetsCompat.Type.ime());
        Intrinsics.checkNotNullExpressionValue(insets, "getInsets(...)");
        return insets;
    }

    public static final void visibleKeyboard(View view, boolean z) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        InputMethodManager inputMethodManager = (InputMethodManager) ContextCompat.getSystemService(view.getContext(), InputMethodManager.class);
        if (z) {
            if (inputMethodManager != null) {
                inputMethodManager.showSoftInput(view, 1);
            }
        } else if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public static final boolean isKeyboardOpen(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        WindowInsetsCompat rootWindowInsets = ViewCompat.getRootWindowInsets(view);
        if (rootWindowInsets == null) {
            return false;
        }
        return rootWindowInsets.isVisible(WindowInsetsCompat.Type.ime());
    }

    public static final void setKeyboardListener(View view, final Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (function1 == null) {
            ViewCompat.setOnApplyWindowInsetsListener(view, null);
        } else {
            ViewCompat.setOnApplyWindowInsetsListener(view, new OnApplyWindowInsetsListener() { // from class: com.ifriend.ui.utils.insets.InsetsExtensionsKt$$ExternalSyntheticLambda1
                @Override // androidx.core.view.OnApplyWindowInsetsListener
                public final WindowInsetsCompat onApplyWindowInsets(View view2, WindowInsetsCompat windowInsetsCompat) {
                    WindowInsetsCompat keyboardListener$lambda$0;
                    keyboardListener$lambda$0 = InsetsExtensionsKt.setKeyboardListener$lambda$0(Function1.this, view2, windowInsetsCompat);
                    return keyboardListener$lambda$0;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsetsCompat setKeyboardListener$lambda$0(Function1 function1, View view, WindowInsetsCompat insets) {
        Intrinsics.checkNotNullParameter(view, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(insets, "insets");
        boolean isVisible = insets.isVisible(WindowInsetsCompat.Type.ime());
        Log.i("Keyboard", isVisible ? "opened" : "closed");
        function1.invoke(Boolean.valueOf(isVisible));
        return insets;
    }

    public static final void doOnApplyWindowInsets(View view, final Function3<? super View, ? super WindowInsetsCompat, ? super InitialPadding, Unit> f) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(f, "f");
        final InitialPadding recordInitialPaddingForView = recordInitialPaddingForView(view);
        ViewCompat.setOnApplyWindowInsetsListener(view, new OnApplyWindowInsetsListener() { // from class: com.ifriend.ui.utils.insets.InsetsExtensionsKt$$ExternalSyntheticLambda0
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view2, WindowInsetsCompat windowInsetsCompat) {
                WindowInsetsCompat doOnApplyWindowInsets$lambda$1;
                doOnApplyWindowInsets$lambda$1 = InsetsExtensionsKt.doOnApplyWindowInsets$lambda$1(Function3.this, recordInitialPaddingForView, view2, windowInsetsCompat);
                return doOnApplyWindowInsets$lambda$1;
            }
        });
        requestApplyInsetsWhenAttached(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsetsCompat doOnApplyWindowInsets$lambda$1(Function3 f, InitialPadding initialPadding, View v, WindowInsetsCompat insets) {
        Intrinsics.checkNotNullParameter(f, "$f");
        Intrinsics.checkNotNullParameter(initialPadding, "$initialPadding");
        Intrinsics.checkNotNullParameter(v, "v");
        Intrinsics.checkNotNullParameter(insets, "insets");
        f.invoke(v, insets, initialPadding);
        return insets;
    }

    public static final void requestApplyInsetsWhenAttached(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (view.isAttachedToWindow()) {
            view.requestApplyInsets();
        } else {
            view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.ifriend.ui.utils.insets.InsetsExtensionsKt$requestApplyInsetsWhenAttached$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View v) {
                    Intrinsics.checkNotNullParameter(v, "v");
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View v) {
                    Intrinsics.checkNotNullParameter(v, "v");
                    v.removeOnAttachStateChangeListener(this);
                    v.requestApplyInsets();
                }
            });
        }
    }

    public static final InitialPadding recordInitialPaddingForView(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        return new InitialPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
    }

    public static final void doOnApplyImeWindowInsets(View view, View translatableView, Function3<? super View, ? super Insets, ? super InitialPadding, Unit> applyWindowInsets) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(translatableView, "translatableView");
        Intrinsics.checkNotNullParameter(applyWindowInsets, "applyWindowInsets");
        applyDeferringInsets(view, WindowInsetsCompat.Type.systemBars(), WindowInsetsCompat.Type.ime(), applyWindowInsets, translatableView);
        requestApplyInsetsWhenAttached(view);
    }

    public static final void clearImeWindowInsets(View view, View translatableView) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(translatableView, "translatableView");
        translatableView.setTranslationX(0.0f);
        translatableView.setTranslationY(0.0f);
        ViewCompat.setWindowInsetsAnimationCallback(view, null);
        ViewCompat.setOnApplyWindowInsetsListener(view, null);
        ViewCompat.setWindowInsetsAnimationCallback(translatableView, null);
    }

    public static final void applyDeferringInsets(View view, int i, int i2, Function3<? super View, ? super Insets, ? super InitialPadding, Unit> applyWindowInsets, View translatableView) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(applyWindowInsets, "applyWindowInsets");
        Intrinsics.checkNotNullParameter(translatableView, "translatableView");
        ViewDeferringInsetsCallback viewDeferringInsetsCallback = new ViewDeferringInsetsCallback(view, i, i2, new InsetsExtensionsKt$applyDeferringInsets$deferringInsetsListener$1(applyWindowInsets, recordInitialPaddingForView(view)));
        ViewCompat.setWindowInsetsAnimationCallback(view, viewDeferringInsetsCallback);
        ViewCompat.setOnApplyWindowInsetsListener(view, viewDeferringInsetsCallback);
        ViewCompat.setWindowInsetsAnimationCallback(translatableView, new TranslateDeferringInsetsAnimationCallback(translatableView, i, i2, 1));
    }
}
