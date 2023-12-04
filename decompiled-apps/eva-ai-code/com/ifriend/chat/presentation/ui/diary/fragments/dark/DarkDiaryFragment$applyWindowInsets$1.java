package com.ifriend.chat.presentation.ui.diary.fragments.dark;

import android.view.View;
import androidx.core.view.WindowInsetsCompat;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ifriend.ui.utils.insets.InitialPadding;
import com.ifriend.ui.utils.insets.InsetsExtensionsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: DarkDiaryFragment.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "insets", "Landroidx/core/view/WindowInsetsCompat;", "initialPadding", "Lcom/ifriend/ui/utils/insets/InitialPadding;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class DarkDiaryFragment$applyWindowInsets$1 extends Lambda implements Function3<View, WindowInsetsCompat, InitialPadding, Unit> {
    public static final DarkDiaryFragment$applyWindowInsets$1 INSTANCE = new DarkDiaryFragment$applyWindowInsets$1();

    DarkDiaryFragment$applyWindowInsets$1() {
        super(3);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(View view, WindowInsetsCompat windowInsetsCompat, InitialPadding initialPadding) {
        invoke2(view, windowInsetsCompat, initialPadding);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(View view, WindowInsetsCompat insets, InitialPadding initialPadding) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(insets, "insets");
        Intrinsics.checkNotNullParameter(initialPadding, "initialPadding");
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), initialPadding.getBottom() + InsetsExtensionsKt.systemAndIme(insets).bottom);
    }
}
