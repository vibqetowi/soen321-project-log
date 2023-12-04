package androidx.core.view;

import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsController;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.Interpolator;
import android.view.inputmethod.InputContentInfo;
import java.util.Map;
/* compiled from: D8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 {
    /* renamed from: m  reason: collision with other method in class */
    public static /* synthetic */ WindowInsets.Builder m6048m() {
        return new WindowInsets.Builder();
    }

    /* renamed from: m  reason: collision with other method in class */
    public static /* synthetic */ WindowInsets.Builder m6049m(WindowInsets windowInsets) {
        return new WindowInsets.Builder(windowInsets);
    }

    public static /* synthetic */ WindowInsetsAnimation m(int i, Interpolator interpolator, long j) {
        return new WindowInsetsAnimation(i, interpolator, j);
    }

    public static /* bridge */ /* synthetic */ WindowInsetsAnimation m(Object obj) {
        return (WindowInsetsAnimation) obj;
    }

    /* renamed from: m  reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ WindowInsetsController.OnControllableInsetsChangedListener m6052m(Object obj) {
        return (WindowInsetsController.OnControllableInsetsChangedListener) obj;
    }

    public static /* synthetic */ AccessibilityNodeInfo.TouchDelegateInfo m(Map map) {
        return new AccessibilityNodeInfo.TouchDelegateInfo(map);
    }

    /* renamed from: m  reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ InputContentInfo m6056m(Object obj) {
        return (InputContentInfo) obj;
    }

    /* renamed from: m  reason: collision with other method in class */
    public static /* synthetic */ void m6059m() {
    }
}
