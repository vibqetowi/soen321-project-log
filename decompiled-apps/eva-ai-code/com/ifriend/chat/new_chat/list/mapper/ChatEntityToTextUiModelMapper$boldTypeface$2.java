package com.ifriend.chat.new_chat.list.mapper;

import android.graphics.Typeface;
import com.ifriend.platform.tools.api.ResourceProvider;
import com.ifriend.ui.R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatEntityToTextUiModelMapper.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/Typeface;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatEntityToTextUiModelMapper$boldTypeface$2 extends Lambda implements Function0<Typeface> {
    final /* synthetic */ ChatEntityToTextUiModelMapper this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatEntityToTextUiModelMapper$boldTypeface$2(ChatEntityToTextUiModelMapper chatEntityToTextUiModelMapper) {
        super(0);
        this.this$0 = chatEntityToTextUiModelMapper;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Typeface invoke() {
        ResourceProvider resourceProvider;
        resourceProvider = this.this$0.resourceProvider;
        return resourceProvider.getFont(R.font.ibm_bold);
    }
}
