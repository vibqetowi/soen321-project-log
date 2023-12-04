package com.ifriend.ui.recyclerView.audio;

import kotlin.Metadata;
/* compiled from: ChatAnalytics.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J \u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0005H&J \u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0005H&J\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005H&¨\u0006\u000f"}, d2 = {"Lcom/ifriend/ui/recyclerView/audio/ChatAnalytics;", "", "audioClickConvertToTextMessage", "", "messageId", "", "audioClickConvertToTextModal", "audioClickPlay", "audioCompleted", "duration", "", "text", "audioPause", "position", "audioStartPlaying", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface ChatAnalytics {
    void audioClickConvertToTextMessage(String str);

    void audioClickConvertToTextModal(String str);

    void audioClickPlay(String str);

    void audioCompleted(String str, long j, String str2);

    void audioPause(String str, long j, String str2);

    void audioStartPlaying(String str, String str2);
}
