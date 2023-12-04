package com.ifriend.registration.presentation.ui.email;

import android.view.View;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import com.ifriend.ui.utils.insets.InitialPadding;
import com.ifriend.ui.utils.insets.InsetsExtensionsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: DebugFragment.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "insets", "Landroidx/core/view/WindowInsetsCompat;", "<anonymous parameter 2>", "Lcom/ifriend/ui/utils/insets/InitialPadding;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class DebugFragment$init$1 extends Lambda implements Function3<View, WindowInsetsCompat, InitialPadding, Unit> {
    final /* synthetic */ View $view;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DebugFragment$init$1(View view) {
        super(3);
        this.$view = view;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(View view, WindowInsetsCompat windowInsetsCompat, InitialPadding initialPadding) {
        invoke2(view, windowInsetsCompat, initialPadding);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(View view, WindowInsetsCompat insets, InitialPadding initialPadding) {
        Intrinsics.checkNotNullParameter(view, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(insets, "insets");
        Intrinsics.checkNotNullParameter(initialPadding, "<anonymous parameter 2>");
        Insets systemAndIme = InsetsExtensionsKt.systemAndIme(insets);
        View view2 = this.$view;
        view2.setPadding(view2.getPaddingLeft(), systemAndIme.top, view2.getPaddingRight(), systemAndIme.bottom);
    }
}
