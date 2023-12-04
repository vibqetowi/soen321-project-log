package com.ifriend.ui.premiumAdvantages;

import android.widget.LinearLayout;
import com.ifriend.ui.R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* compiled from: ExpandableAdvantagesListView.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/widget/LinearLayout;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final class ExpandableAdvantagesListView$container$2 extends Lambda implements Function0<LinearLayout> {
    final /* synthetic */ ExpandableAdvantagesListView this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpandableAdvantagesListView$container$2(ExpandableAdvantagesListView expandableAdvantagesListView) {
        super(0);
        this.this$0 = expandableAdvantagesListView;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final LinearLayout invoke() {
        return (LinearLayout) this.this$0.findViewById(R.id.container);
    }
}
