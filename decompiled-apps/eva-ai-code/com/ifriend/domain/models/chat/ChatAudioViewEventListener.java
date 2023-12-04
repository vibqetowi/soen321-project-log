package com.ifriend.domain.models.chat;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* compiled from: ChatAudioViewEventListener.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016J\u001a\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016¨\u0006\u0011"}, d2 = {"Lcom/ifriend/domain/models/chat/ChatAudioViewEventListener;", "", "()V", "onChangeVoiceClick", "", "onCompleted", "duration", "", "onPauseClick", "currentPosition", "onPlayClick", "onPlaybackStarted", "onTextShowed", "source", "Lcom/ifriend/domain/models/chat/LoadTextClickSource;", "audioId", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class ChatAudioViewEventListener {
    public void onChangeVoiceClick() {
    }

    public void onCompleted(long j) {
    }

    public void onPauseClick(long j) {
    }

    public void onPlayClick() {
    }

    public void onPlaybackStarted() {
    }

    public void onTextShowed(LoadTextClickSource source, String str) {
        Intrinsics.checkNotNullParameter(source, "source");
    }
}
