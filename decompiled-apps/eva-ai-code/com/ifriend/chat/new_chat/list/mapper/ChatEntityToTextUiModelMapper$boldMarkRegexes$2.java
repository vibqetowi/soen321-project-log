package com.ifriend.chat.new_chat.list.mapper;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Regex;
/* compiled from: ChatEntityToTextUiModelMapper.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lkotlin/text/Regex;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ChatEntityToTextUiModelMapper$boldMarkRegexes$2 extends Lambda implements Function0<List<? extends Regex>> {
    public static final ChatEntityToTextUiModelMapper$boldMarkRegexes$2 INSTANCE = new ChatEntityToTextUiModelMapper$boldMarkRegexes$2();

    ChatEntityToTextUiModelMapper$boldMarkRegexes$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends Regex> invoke() {
        return CollectionsKt.listOf((Object[]) new Regex[]{new Regex("\\*(.*)\\*"), new Regex("-(.*)-")});
    }
}
