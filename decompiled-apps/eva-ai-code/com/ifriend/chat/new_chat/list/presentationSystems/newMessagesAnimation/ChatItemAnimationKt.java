package com.ifriend.chat.new_chat.list.presentationSystems.newMessagesAnimation;

import com.ifriend.ui.textView.typer.TypingSettings;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
/* compiled from: ChatItemAnimation.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a$\u0010\u0000\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"toIterations", "", "Lkotlin/Pair;", "", "", "Lcom/ifriend/ui/textView/typer/TypingSettings;", "text", "", "new_chat_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatItemAnimationKt {
    private static final Pair<CharSequence, Long> toIterations$iterate(int i, CharSequence charSequence, CharSequence charSequence2, TypingSettings typingSettings) {
        int length = charSequence.length();
        CharSequence subSequence = StringsKt.subSequence(charSequence2, RangesKt.until(length, typingSettings.getGrowth().calculateGrowth(charSequence2, length) + length));
        if (subSequence.length() == 0) {
            return null;
        }
        return TuplesKt.to(subSequence, Long.valueOf(typingSettings.getSpeed().calculateDelay(charSequence2, length, subSequence, i)));
    }

    public static final List<Pair<CharSequence, Long>> toIterations(TypingSettings typingSettings, String text) {
        Pair<CharSequence, Long> iterations$iterate;
        Intrinsics.checkNotNullParameter(typingSettings, "<this>");
        Intrinsics.checkNotNullParameter(text, "text");
        ArrayList arrayList = new ArrayList();
        String str = "";
        int i = 0;
        while (str.length() < text.length() && (iterations$iterate = toIterations$iterate(i, str, text, typingSettings)) != null) {
            CharSequence first = iterations$iterate.getFirst();
            str = str + ((Object) first);
            i++;
            arrayList.add(iterations$iterate);
        }
        return arrayList;
    }
}
