package com.ifriend.ui.editText;

import android.content.Context;
import android.graphics.Typeface;
import androidx.core.content.res.ResourcesCompat;
import com.ifriend.ui.R;
import com.ifriend.ui.utils.CustomTypefaceSpan;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: WhiteEditText.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ifriend/ui/utils/CustomTypefaceSpan;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final class WhiteEditText$hintTypeface$2 extends Lambda implements Function0<CustomTypefaceSpan> {
    final /* synthetic */ Context $context;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WhiteEditText$hintTypeface$2(Context context) {
        super(0);
        this.$context = context;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final CustomTypefaceSpan invoke() {
        Typeface font = ResourcesCompat.getFont(this.$context, R.font.ibm_regular);
        Intrinsics.checkNotNull(font);
        return new CustomTypefaceSpan(font);
    }
}
