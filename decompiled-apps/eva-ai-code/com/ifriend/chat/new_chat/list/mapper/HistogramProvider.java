package com.ifriend.chat.new_chat.list.mapper;

import com.facebook.share.internal.ShareConstants;
import com.ifriend.domain.newChat.chat.models.ChatMessage;
import com.ifriend.domain.newChat.chat.models.ChatMessageKt;
import com.ifriend.ui.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;
/* compiled from: ChatEntityToAudioUiModelMapper.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ifriend/chat/new_chat/list/mapper/HistogramProvider;", "", "()V", "histogramBackgrounds", "", "", "histogramFor", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "Lcom/ifriend/domain/newChat/chat/models/ChatMessage;", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class HistogramProvider {
    private final List<Integer> histogramBackgrounds = CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R.drawable.audio_track_1), Integer.valueOf(R.drawable.audio_track_2), Integer.valueOf(R.drawable.audio_track_3), Integer.valueOf(R.drawable.audio_track_4), Integer.valueOf(R.drawable.audio_track_5), Integer.valueOf(R.drawable.audio_track_6), Integer.valueOf(R.drawable.audio_track_7), Integer.valueOf(R.drawable.audio_track_8), Integer.valueOf(R.drawable.audio_track_9), Integer.valueOf(R.drawable.audio_track_10)});

    public final int histogramFor(ChatMessage message) {
        Object obj;
        Intrinsics.checkNotNullParameter(message, "message");
        Iterator it = SequencesKt.sequenceOf(ChatMessageKt.getTag(message)).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            String str = (String) obj;
            boolean z = true;
            if (!(str.length() > 0) || Intrinsics.areEqual(str, "Sent you an audio")) {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        String str2 = (String) obj;
        int abs = str2 != null ? Math.abs(str2.hashCode()) : 0;
        List<Integer> list = this.histogramBackgrounds;
        return list.get(abs % list.size()).intValue();
    }
}
