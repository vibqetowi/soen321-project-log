package com.theinnerhour.b2b.components.chat.model;

import com.appsflyer.R;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: ChatMessage.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010'\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010)\u0012\u0006\u0012\u0004\u0018\u00010)0(R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000eR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\f\"\u0004\b\u001d\u0010\u000eR\u001a\u0010\u001e\u001a\u00020\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001c\u0010$\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\f\"\u0004\b&\u0010\u000e¨\u0006*"}, d2 = {"Lcom/theinnerhour/b2b/components/chat/model/ChatMessage;", "Ljava/io/Serializable;", "()V", "encrypted", "", "getEncrypted", "()Z", "setEncrypted", "(Z)V", "message", "", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "message_type", "getMessage_type", "setMessage_type", "send_by_user_id", "getSend_by_user_id", "setSend_by_user_id", "send_to_user_id", "getSend_to_user_id", "setSend_to_user_id", "send_to_user_name", "getSend_to_user_name", "setSend_to_user_name", "source", "getSource", "setSource", "time_stamp", "", "getTime_stamp", "()J", "setTime_stamp", "(J)V", "user_name", "getUser_name", "setUser_name", "objectData", "", "", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class ChatMessage implements Serializable {
    private boolean encrypted;
    private String message;
    private String message_type;
    private String send_by_user_id;
    private String send_to_user_id;
    private String send_to_user_name;
    private String source;
    private long time_stamp;
    private String user_name;

    public final boolean getEncrypted() {
        return this.encrypted;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getMessage_type() {
        return this.message_type;
    }

    public final String getSend_by_user_id() {
        return this.send_by_user_id;
    }

    public final String getSend_to_user_id() {
        return this.send_to_user_id;
    }

    public final String getSend_to_user_name() {
        return this.send_to_user_name;
    }

    public final String getSource() {
        return this.source;
    }

    public final long getTime_stamp() {
        return this.time_stamp;
    }

    public final String getUser_name() {
        return this.user_name;
    }

    public final Map<Object, Object> objectData() {
        HashMap hashMap = new HashMap();
        hashMap.put("encrypted", Boolean.valueOf(this.encrypted));
        hashMap.put("time_stamp", Long.valueOf(this.time_stamp));
        hashMap.put("message_type", this.message_type);
        hashMap.put("message", this.message);
        hashMap.put("user_name", this.user_name);
        hashMap.put("send_by_user_id", this.send_by_user_id);
        hashMap.put("send_to_user_name", this.send_to_user_name);
        hashMap.put("send_to_user_id", this.send_to_user_id);
        hashMap.put("source", this.source);
        return hashMap;
    }

    public final void setEncrypted(boolean z10) {
        this.encrypted = z10;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setMessage_type(String str) {
        this.message_type = str;
    }

    public final void setSend_by_user_id(String str) {
        this.send_by_user_id = str;
    }

    public final void setSend_to_user_id(String str) {
        this.send_to_user_id = str;
    }

    public final void setSend_to_user_name(String str) {
        this.send_to_user_name = str;
    }

    public final void setSource(String str) {
        this.source = str;
    }

    public final void setTime_stamp(long j10) {
        this.time_stamp = j10;
    }

    public final void setUser_name(String str) {
        this.user_name = str;
    }
}
