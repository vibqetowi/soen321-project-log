package com.theinnerhour.b2b.components.chat.model;

import com.appsflyer.R;
import com.theinnerhour.b2b.utils.SessionManager;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
/* compiled from: ChatUser.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u00048FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0006\"\u0004\b\u001b\u0010\bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0006\"\u0004\b\u001e\u0010\b¨\u0006\u001f"}, d2 = {"Lcom/theinnerhour/b2b/components/chat/model/ChatUser;", "Ljava/io/Serializable;", "()V", SessionManager.KEY_FIRSTNAME, "", "getFirstName", "()Ljava/lang/String;", "setFirstName", "(Ljava/lang/String;)V", "key", "getKey", "setKey", SessionManager.KEY_LASTNAME, "getLastName", "setLastName", "last_message", "getLast_message", "setLast_message", "messages", "Ljava/util/ArrayList;", "Lcom/theinnerhour/b2b/components/chat/model/ChatMessage;", "getMessages", "()Ljava/util/ArrayList;", "setMessages", "(Ljava/util/ArrayList;)V", SessionManager.KEY_NAME, "getName", "setName", "profile_path", "getProfile_path", "setProfile_path", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class ChatUser implements Serializable {
    private String firstName;
    private String lastName;
    private String name = "";
    private String key = "";
    private String profile_path = "";
    private String last_message = "";
    private ArrayList<ChatMessage> messages = new ArrayList<>();

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final String getLast_message() {
        return this.last_message;
    }

    public final ArrayList<ChatMessage> getMessages() {
        return this.messages;
    }

    public final String getName() {
        String str = this.firstName;
        if (str != null) {
            String str2 = "";
            if (!i.b(str, "") && !i.b(this.firstName, "null")) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.firstName);
                String str3 = this.lastName;
                if (str3 != null && !i.b(str3, "") && !i.b(this.lastName, "null")) {
                    str2 = " " + this.lastName;
                }
                sb2.append(str2);
                return sb2.toString();
            }
        }
        return "Guest" + SessionManager.getInstance().getLongValue(SessionManager.KEY_USERID);
    }

    public final String getProfile_path() {
        return this.profile_path;
    }

    public final void setFirstName(String str) {
        this.firstName = str;
    }

    public final void setKey(String str) {
        this.key = str;
    }

    public final void setLastName(String str) {
        this.lastName = str;
    }

    public final void setLast_message(String str) {
        this.last_message = str;
    }

    public final void setMessages(ArrayList<ChatMessage> arrayList) {
        i.g(arrayList, "<set-?>");
        this.messages = arrayList;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setProfile_path(String str) {
        this.profile_path = str;
    }
}
