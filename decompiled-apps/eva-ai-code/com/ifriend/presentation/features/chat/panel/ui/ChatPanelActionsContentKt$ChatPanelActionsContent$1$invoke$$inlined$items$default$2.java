package com.ifriend.presentation.features.chat.panel.ui;

import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
/* compiled from: LazyDsl.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, FirebaseAnalytics.Param.INDEX, "", "invoke", "androidx/compose/foundation/lazy/LazyDslKt$items$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatPanelActionsContentKt$ChatPanelActionsContent$1$invoke$$inlined$items$default$2 extends Lambda implements Function1<Integer, Object> {
    final /* synthetic */ List $items;
    final /* synthetic */ Function1 $key;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatPanelActionsContentKt$ChatPanelActionsContent$1$invoke$$inlined$items$default$2(Function1 function1, List list) {
        super(1);
        this.$key = function1;
        this.$items = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
        return invoke(num.intValue());
    }

    public final Object invoke(int i) {
        return this.$key.invoke(this.$items.get(i));
    }
}
